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

package org.sfs.validate;

import io.vertx.core.json.JsonObject;
import org.sfs.Server;
import org.sfs.VertxContext;
import org.sfs.elasticsearch.container.ExistsObjects;
import org.sfs.util.HttpRequestValidationException;
import org.sfs.vo.PersistentContainer;
import rx.Observable;
import rx.functions.Func1;

import static java.net.HttpURLConnection.HTTP_CONFLICT;
import static org.sfs.rx.Defer.just;

public class ValidateContainerIsEmpty implements Func1<PersistentContainer, Observable<PersistentContainer>> {

    private final VertxContext<Server> vertxContext;

    public ValidateContainerIsEmpty(VertxContext<Server> vertxContext) {
        this.vertxContext = vertxContext;
    }

    @Override
    public Observable<PersistentContainer> call(PersistentContainer persistentContainer) {
        return just(persistentContainer)
                .flatMap(new ExistsObjects(vertxContext))
                .doOnNext(existsObjects -> {
                    if (existsObjects) {
                        throw new HttpRequestValidationException(HTTP_CONFLICT, new JsonObject()
                                .put("message", "container is not empty"));
                    }
                })
                .map(existsObjects -> persistentContainer);
    }
}
