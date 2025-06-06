/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as environments from "../../../../environments.js";
import * as core from "../../../../core/index.js";
import * as SeedTrace from "../../../index.js";
import * as serializers from "../../../../serialization/index.js";
import urlJoin from "url-join";
import * as errors from "../../../../errors/index.js";

export declare namespace Sysprop {
    export interface Options {
        environment?: core.Supplier<environments.SeedTraceEnvironment | string>;
        /** Specify a custom URL to connect the client to. */
        baseUrl?: core.Supplier<string>;
        token?: core.Supplier<core.BearerToken | undefined>;
        /** Override the X-Random-Header header */
        xRandomHeader?: core.Supplier<string | undefined>;
    }

    export interface RequestOptions {
        /** The maximum time to wait for a response in seconds. */
        timeoutInSeconds?: number;
        /** The number of times to retry the request. Defaults to 2. */
        maxRetries?: number;
        /** A hook to abort the request. */
        abortSignal?: AbortSignal;
        /** Override the X-Random-Header header */
        xRandomHeader?: string | undefined;
        /** Additional headers to include in the request. */
        headers?: Record<string, string>;
    }
}

export class Sysprop {
    constructor(protected readonly _options: Sysprop.Options = {}) {}

    /**
     * @param {SeedTrace.Language} language
     * @param {number} numWarmInstances
     * @param {Sysprop.RequestOptions} requestOptions - Request-specific configuration.
     *
     * @example
     *     await client.sysprop.setNumWarmInstances("JAVA", 1)
     */
    public setNumWarmInstances(
        language: SeedTrace.Language,
        numWarmInstances: number,
        requestOptions?: Sysprop.RequestOptions,
    ): core.HttpResponsePromise<void> {
        return core.HttpResponsePromise.fromPromise(
            this.__setNumWarmInstances(language, numWarmInstances, requestOptions),
        );
    }

    private async __setNumWarmInstances(
        language: SeedTrace.Language,
        numWarmInstances: number,
        requestOptions?: Sysprop.RequestOptions,
    ): Promise<core.WithRawResponse<void>> {
        const _response = await core.fetcher({
            url: urlJoin(
                (await core.Supplier.get(this._options.baseUrl)) ??
                    (await core.Supplier.get(this._options.environment)) ??
                    environments.SeedTraceEnvironment.Prod,
                `/sysprop/num-warm-instances/${encodeURIComponent(serializers.Language.jsonOrThrow(language, { omitUndefined: true }))}/${encodeURIComponent(numWarmInstances)}`,
            ),
            method: "PUT",
            headers: {
                Authorization: await this._getAuthorizationHeader(),
                "X-Random-Header":
                    (await core.Supplier.get(this._options.xRandomHeader)) != null
                        ? await core.Supplier.get(this._options.xRandomHeader)
                        : undefined,
                "X-Fern-Language": "JavaScript",
                "X-Fern-SDK-Name": "@fern/trace",
                "X-Fern-SDK-Version": "0.0.1",
                "User-Agent": "@fern/trace/0.0.1",
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
            return { data: undefined, rawResponse: _response.rawResponse };
        }

        if (_response.error.reason === "status-code") {
            throw new errors.SeedTraceError({
                statusCode: _response.error.statusCode,
                body: _response.error.body,
                rawResponse: _response.rawResponse,
            });
        }

        switch (_response.error.reason) {
            case "non-json":
                throw new errors.SeedTraceError({
                    statusCode: _response.error.statusCode,
                    body: _response.error.rawBody,
                    rawResponse: _response.rawResponse,
                });
            case "timeout":
                throw new errors.SeedTraceTimeoutError(
                    "Timeout exceeded when calling PUT /sysprop/num-warm-instances/{language}/{numWarmInstances}.",
                );
            case "unknown":
                throw new errors.SeedTraceError({
                    message: _response.error.errorMessage,
                    rawResponse: _response.rawResponse,
                });
        }
    }

    /**
     * @param {Sysprop.RequestOptions} requestOptions - Request-specific configuration.
     *
     * @example
     *     await client.sysprop.getNumWarmInstances()
     */
    public getNumWarmInstances(
        requestOptions?: Sysprop.RequestOptions,
    ): core.HttpResponsePromise<Record<SeedTrace.Language, number | undefined>> {
        return core.HttpResponsePromise.fromPromise(this.__getNumWarmInstances(requestOptions));
    }

    private async __getNumWarmInstances(
        requestOptions?: Sysprop.RequestOptions,
    ): Promise<core.WithRawResponse<Record<SeedTrace.Language, number | undefined>>> {
        const _response = await core.fetcher({
            url: urlJoin(
                (await core.Supplier.get(this._options.baseUrl)) ??
                    (await core.Supplier.get(this._options.environment)) ??
                    environments.SeedTraceEnvironment.Prod,
                "/sysprop/num-warm-instances",
            ),
            method: "GET",
            headers: {
                Authorization: await this._getAuthorizationHeader(),
                "X-Random-Header":
                    (await core.Supplier.get(this._options.xRandomHeader)) != null
                        ? await core.Supplier.get(this._options.xRandomHeader)
                        : undefined,
                "X-Fern-Language": "JavaScript",
                "X-Fern-SDK-Name": "@fern/trace",
                "X-Fern-SDK-Version": "0.0.1",
                "User-Agent": "@fern/trace/0.0.1",
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
            return {
                data: serializers.sysprop.getNumWarmInstances.Response.parseOrThrow(_response.body, {
                    unrecognizedObjectKeys: "passthrough",
                    allowUnrecognizedUnionMembers: true,
                    allowUnrecognizedEnumValues: true,
                    skipValidation: true,
                    breadcrumbsPrefix: ["response"],
                }),
                rawResponse: _response.rawResponse,
            };
        }

        if (_response.error.reason === "status-code") {
            throw new errors.SeedTraceError({
                statusCode: _response.error.statusCode,
                body: _response.error.body,
                rawResponse: _response.rawResponse,
            });
        }

        switch (_response.error.reason) {
            case "non-json":
                throw new errors.SeedTraceError({
                    statusCode: _response.error.statusCode,
                    body: _response.error.rawBody,
                    rawResponse: _response.rawResponse,
                });
            case "timeout":
                throw new errors.SeedTraceTimeoutError(
                    "Timeout exceeded when calling GET /sysprop/num-warm-instances.",
                );
            case "unknown":
                throw new errors.SeedTraceError({
                    message: _response.error.errorMessage,
                    rawResponse: _response.rawResponse,
                });
        }
    }

    protected async _getAuthorizationHeader(): Promise<string | undefined> {
        const bearer = await core.Supplier.get(this._options.token);
        if (bearer != null) {
            return `Bearer ${bearer}`;
        }

        return undefined;
    }
}
