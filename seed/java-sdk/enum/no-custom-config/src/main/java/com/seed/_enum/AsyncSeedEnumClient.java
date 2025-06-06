/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed._enum;

import com.seed._enum.core.ClientOptions;
import com.seed._enum.core.Suppliers;
import com.seed._enum.resources.inlinedrequest.AsyncInlinedRequestClient;
import com.seed._enum.resources.pathparam.AsyncPathParamClient;
import com.seed._enum.resources.queryparam.AsyncQueryParamClient;
import java.util.function.Supplier;

public class AsyncSeedEnumClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<AsyncInlinedRequestClient> inlinedRequestClient;

    protected final Supplier<AsyncPathParamClient> pathParamClient;

    protected final Supplier<AsyncQueryParamClient> queryParamClient;

    public AsyncSeedEnumClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.inlinedRequestClient = Suppliers.memoize(() -> new AsyncInlinedRequestClient(clientOptions));
        this.pathParamClient = Suppliers.memoize(() -> new AsyncPathParamClient(clientOptions));
        this.queryParamClient = Suppliers.memoize(() -> new AsyncQueryParamClient(clientOptions));
    }

    public AsyncInlinedRequestClient inlinedRequest() {
        return this.inlinedRequestClient.get();
    }

    public AsyncPathParamClient pathParam() {
        return this.pathParamClient.get();
    }

    public AsyncQueryParamClient queryParam() {
        return this.queryParamClient.get();
    }

    public static AsyncSeedEnumClientBuilder builder() {
        return new AsyncSeedEnumClientBuilder();
    }
}
