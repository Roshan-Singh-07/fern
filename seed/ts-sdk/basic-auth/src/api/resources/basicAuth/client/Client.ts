/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as core from "../../../../core/index.js";
import * as SeedBasicAuth from "../../../index.js";
import urlJoin from "url-join";
import * as errors from "../../../../errors/index.js";

export declare namespace BasicAuth {
    export interface Options {
        environment: core.Supplier<string>;
        /** Specify a custom URL to connect the client to. */
        baseUrl?: core.Supplier<string>;
        username: core.Supplier<string>;
        password: core.Supplier<string>;
    }

    export interface RequestOptions {
        /** The maximum time to wait for a response in seconds. */
        timeoutInSeconds?: number;
        /** The number of times to retry the request. Defaults to 2. */
        maxRetries?: number;
        /** A hook to abort the request. */
        abortSignal?: AbortSignal;
        /** Additional headers to include in the request. */
        headers?: Record<string, string>;
    }
}

export class BasicAuth {
    constructor(protected readonly _options: BasicAuth.Options) {}

    /**
     * GET request with basic auth scheme
     *
     * @param {BasicAuth.RequestOptions} requestOptions - Request-specific configuration.
     *
     * @throws {@link SeedBasicAuth.UnauthorizedRequest}
     *
     * @example
     *     await client.basicAuth.getWithBasicAuth()
     */
    public getWithBasicAuth(requestOptions?: BasicAuth.RequestOptions): core.HttpResponsePromise<boolean> {
        return core.HttpResponsePromise.fromPromise(this.__getWithBasicAuth(requestOptions));
    }

    private async __getWithBasicAuth(
        requestOptions?: BasicAuth.RequestOptions,
    ): Promise<core.WithRawResponse<boolean>> {
        const _response = await core.fetcher({
            url: urlJoin(
                (await core.Supplier.get(this._options.baseUrl)) ??
                    (await core.Supplier.get(this._options.environment)),
                "basic-auth",
            ),
            method: "GET",
            headers: {
                Authorization: await this._getAuthorizationHeader(),
                "X-Fern-Language": "JavaScript",
                "X-Fern-SDK-Name": "@fern/basic-auth",
                "X-Fern-SDK-Version": "0.0.1",
                "User-Agent": "@fern/basic-auth/0.0.1",
                "X-Fern-Runtime": core.RUNTIME.type,
                "X-Fern-Runtime-Version": core.RUNTIME.version,
                ...requestOptions?.headers,
            },
            contentType: "application/json",
            requestType: "json",
            timeoutMs: requestOptions?.timeoutInSeconds != null ? requestOptions.timeoutInSeconds * 1000 : 60000,
            maxRetries: requestOptions?.maxRetries,
            abortSignal: requestOptions?.abortSignal,
        });
        if (_response.ok) {
            return { data: _response.body as boolean, rawResponse: _response.rawResponse };
        }

        if (_response.error.reason === "status-code") {
            switch (_response.error.statusCode) {
                case 401:
                    throw new SeedBasicAuth.UnauthorizedRequest(
                        _response.error.body as SeedBasicAuth.UnauthorizedRequestErrorBody,
                        _response.rawResponse,
                    );
                default:
                    throw new errors.SeedBasicAuthError({
                        statusCode: _response.error.statusCode,
                        body: _response.error.body,
                        rawResponse: _response.rawResponse,
                    });
            }
        }

        switch (_response.error.reason) {
            case "non-json":
                throw new errors.SeedBasicAuthError({
                    statusCode: _response.error.statusCode,
                    body: _response.error.rawBody,
                    rawResponse: _response.rawResponse,
                });
            case "timeout":
                throw new errors.SeedBasicAuthTimeoutError("Timeout exceeded when calling GET /basic-auth.");
            case "unknown":
                throw new errors.SeedBasicAuthError({
                    message: _response.error.errorMessage,
                    rawResponse: _response.rawResponse,
                });
        }
    }

    /**
     * POST request with basic auth scheme
     *
     * @param {unknown} request
     * @param {BasicAuth.RequestOptions} requestOptions - Request-specific configuration.
     *
     * @throws {@link SeedBasicAuth.UnauthorizedRequest}
     * @throws {@link SeedBasicAuth.BadRequest}
     *
     * @example
     *     await client.basicAuth.postWithBasicAuth({
     *         "key": "value"
     *     })
     */
    public postWithBasicAuth(
        request?: unknown,
        requestOptions?: BasicAuth.RequestOptions,
    ): core.HttpResponsePromise<boolean> {
        return core.HttpResponsePromise.fromPromise(this.__postWithBasicAuth(request, requestOptions));
    }

    private async __postWithBasicAuth(
        request?: unknown,
        requestOptions?: BasicAuth.RequestOptions,
    ): Promise<core.WithRawResponse<boolean>> {
        const _response = await core.fetcher({
            url: urlJoin(
                (await core.Supplier.get(this._options.baseUrl)) ??
                    (await core.Supplier.get(this._options.environment)),
                "basic-auth",
            ),
            method: "POST",
            headers: {
                Authorization: await this._getAuthorizationHeader(),
                "X-Fern-Language": "JavaScript",
                "X-Fern-SDK-Name": "@fern/basic-auth",
                "X-Fern-SDK-Version": "0.0.1",
                "User-Agent": "@fern/basic-auth/0.0.1",
                "X-Fern-Runtime": core.RUNTIME.type,
                "X-Fern-Runtime-Version": core.RUNTIME.version,
                ...requestOptions?.headers,
            },
            contentType: "application/json",
            requestType: "json",
            body: request,
            timeoutMs: requestOptions?.timeoutInSeconds != null ? requestOptions.timeoutInSeconds * 1000 : 60000,
            maxRetries: requestOptions?.maxRetries,
            abortSignal: requestOptions?.abortSignal,
        });
        if (_response.ok) {
            return { data: _response.body as boolean, rawResponse: _response.rawResponse };
        }

        if (_response.error.reason === "status-code") {
            switch (_response.error.statusCode) {
                case 401:
                    throw new SeedBasicAuth.UnauthorizedRequest(
                        _response.error.body as SeedBasicAuth.UnauthorizedRequestErrorBody,
                        _response.rawResponse,
                    );
                case 400:
                    throw new SeedBasicAuth.BadRequest(_response.rawResponse);
                default:
                    throw new errors.SeedBasicAuthError({
                        statusCode: _response.error.statusCode,
                        body: _response.error.body,
                        rawResponse: _response.rawResponse,
                    });
            }
        }

        switch (_response.error.reason) {
            case "non-json":
                throw new errors.SeedBasicAuthError({
                    statusCode: _response.error.statusCode,
                    body: _response.error.rawBody,
                    rawResponse: _response.rawResponse,
                });
            case "timeout":
                throw new errors.SeedBasicAuthTimeoutError("Timeout exceeded when calling POST /basic-auth.");
            case "unknown":
                throw new errors.SeedBasicAuthError({
                    message: _response.error.errorMessage,
                    rawResponse: _response.rawResponse,
                });
        }
    }

    protected async _getAuthorizationHeader(): Promise<string | undefined> {
        return core.BasicAuth.toAuthorizationHeader({
            username: await core.Supplier.get(this._options.username),
            password: await core.Supplier.get(this._options.password),
        });
    }
}
