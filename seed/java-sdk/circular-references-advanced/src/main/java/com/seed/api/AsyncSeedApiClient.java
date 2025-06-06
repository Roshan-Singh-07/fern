/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.api;

import com.seed.api.core.ClientOptions;

public class AsyncSeedApiClient {
    protected final ClientOptions clientOptions;

    public AsyncSeedApiClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public static AsyncSeedApiClientBuilder builder() {
        return new AsyncSeedApiClientBuilder();
    }
}
