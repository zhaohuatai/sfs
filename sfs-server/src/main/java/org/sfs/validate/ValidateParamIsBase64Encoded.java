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

import com.google.common.io.BaseEncoding;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;
import org.sfs.SfsRequest;
import org.sfs.util.HttpRequestValidationException;
import rx.functions.Func1;

import static com.google.common.io.BaseEncoding.base64;
import static java.lang.String.format;
import static java.net.HttpURLConnection.HTTP_BAD_REQUEST;

public class ValidateParamIsBase64Encoded implements Func1<SfsRequest, SfsRequest> {


    private final String paramName;

    public ValidateParamIsBase64Encoded(String paramName) {
        this.paramName = paramName;
    }

    @Override
    public SfsRequest call(SfsRequest httpServerRequest) {
        MultiMap params = httpServerRequest.params();

        String value = params.get(paramName);
        if (value != null) {
            boolean failed = false;
            BaseEncoding baseEncoding = base64();
            try {
                byte[] decoded = baseEncoding.decode(value);
                if (decoded == null || value.equals(baseEncoding.encode(decoded))) {
                    failed = true;
                }
            } catch (Throwable e) {
                // do nothing
            }
            if (failed) {
                JsonObject jsonObject = new JsonObject()
                        .put("message", format("%s must be Base64 encoded", paramName));

                throw new HttpRequestValidationException(HTTP_BAD_REQUEST, jsonObject);
            }
        }
        return httpServerRequest;
    }
}