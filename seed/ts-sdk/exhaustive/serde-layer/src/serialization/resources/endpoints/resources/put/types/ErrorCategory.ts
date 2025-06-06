/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../../../index.js";
import * as SeedExhaustive from "../../../../../../api/index.js";
import * as core from "../../../../../../core/index.js";

export const ErrorCategory: core.serialization.Schema<
    serializers.endpoints.ErrorCategory.Raw,
    SeedExhaustive.endpoints.ErrorCategory
> = core.serialization.enum_(["API_ERROR", "AUTHENTICATION_ERROR", "INVALID_REQUEST_ERROR"]);

export declare namespace ErrorCategory {
    export type Raw = "API_ERROR" | "AUTHENTICATION_ERROR" | "INVALID_REQUEST_ERROR";
}
