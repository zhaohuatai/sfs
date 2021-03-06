/*
 * Copyright 2016 The Simple File Server Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sfs.nodes.compute.container;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import org.sfs.Server;
import org.sfs.SfsRequest;
import org.sfs.VertxContext;
import org.sfs.auth.Authenticate;
import org.sfs.elasticsearch.container.LoadAccountAndContainer;
import org.sfs.elasticsearch.container.LoadContainerStats;
import org.sfs.metadata.Metadata;
import org.sfs.rx.ConnectionCloseTerminus;
import org.sfs.validate.ValidateActionAuthenticated;
import org.sfs.validate.ValidateActionContainerRead;
import org.sfs.validate.ValidateContainerPath;
import org.sfs.vo.PersistentContainer;

import java.math.BigDecimal;
import java.util.SortedSet;

import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.math.BigDecimal.ROUND_HALF_UP;
import static java.net.HttpURLConnection.HTTP_NO_CONTENT;
import static org.sfs.rx.Defer.aVoid;
import static org.sfs.rx.Defer.just;
import static org.sfs.util.SfsHttpHeaders.X_ADD_CONTAINER_META_PREFIX;
import static org.sfs.util.SfsHttpHeaders.X_CONTAINER_BYTES_USED;
import static org.sfs.util.SfsHttpHeaders.X_CONTAINER_OBJECT_COUNT;
import static org.sfs.util.SfsHttpQueryParams.LIMIT;
import static org.sfs.vo.ObjectPath.fromSfsRequest;

public class HeadContainer implements Handler<SfsRequest> {

    @Override
    public void handle(final SfsRequest httpServerRequest) {
        VertxContext<Server> vertxContext = httpServerRequest.vertxContext();
        aVoid()
                .flatMap(new Authenticate(httpServerRequest))
                .flatMap(new ValidateActionAuthenticated(httpServerRequest))
                .map(aVoid -> fromSfsRequest(httpServerRequest))
                .map(new ValidateContainerPath())
                .flatMap(new LoadAccountAndContainer(vertxContext))
                .flatMap(new ValidateActionContainerRead(httpServerRequest))
                .flatMap(persistentContainer -> {
                    httpServerRequest.params().set(LIMIT, "0");
                    return just(persistentContainer)
                            .flatMap(new LoadContainerStats(httpServerRequest.vertxContext()))
                            .map(containerStats -> {
                                HttpServerResponse httpServerResponse = httpServerRequest.response();

                                httpServerResponse.putHeader(X_CONTAINER_OBJECT_COUNT, valueOf(containerStats.getObjectCount()));
                                httpServerResponse.putHeader(
                                        X_CONTAINER_BYTES_USED,
                                        BigDecimal.valueOf(containerStats.getBytesUsed())
                                                .setScale(0, ROUND_HALF_UP)
                                                .toString()
                                );
                                return persistentContainer;
                            });
                })
                .single()
                .subscribe(new ConnectionCloseTerminus<PersistentContainer>(httpServerRequest) {
                    @Override
                    public void onNext(PersistentContainer persistentContainer) {
                        HttpServerResponse httpServerResponse = httpServerRequest.response();

                        Metadata metadata = persistentContainer.getMetadata();

                        for (String key : metadata.keySet()) {
                            SortedSet<String> values = metadata.get(key);
                            if (values != null && !values.isEmpty()) {
                                httpServerResponse.putHeader(format("%s%s", X_ADD_CONTAINER_META_PREFIX, key), values);
                            }
                        }

                        httpServerResponse.setStatusCode(HTTP_NO_CONTENT);
                    }
                });

    }
}