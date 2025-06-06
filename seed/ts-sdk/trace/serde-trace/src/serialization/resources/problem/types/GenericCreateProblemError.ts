/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index.js";
import * as SeedTrace from "../../../../api/index.js";
import * as core from "../../../../core/index.js";

export const GenericCreateProblemError: core.serialization.ObjectSchema<
    serializers.GenericCreateProblemError.Raw,
    SeedTrace.GenericCreateProblemError
> = core.serialization.object({
    message: core.serialization.string(),
    type: core.serialization.string(),
    stacktrace: core.serialization.string(),
});

export declare namespace GenericCreateProblemError {
    export interface Raw {
        message: string;
        type: string;
        stacktrace: string;
    }
}
