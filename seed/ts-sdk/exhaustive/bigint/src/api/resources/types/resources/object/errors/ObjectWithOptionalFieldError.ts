/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as errors from "../../../../../../errors/index.js";
import * as SeedExhaustive from "../../../../../index.js";
import * as core from "../../../../../../core/index.js";

export class ObjectWithOptionalFieldError extends errors.SeedExhaustiveError {
    constructor(body: SeedExhaustive.types.ObjectWithOptionalField, rawResponse?: core.RawResponse) {
        super({
            message: "ObjectWithOptionalFieldError",
            statusCode: 400,
            body: body,
            rawResponse: rawResponse,
        });
        Object.setPrototypeOf(this, ObjectWithOptionalFieldError.prototype);
    }
}
