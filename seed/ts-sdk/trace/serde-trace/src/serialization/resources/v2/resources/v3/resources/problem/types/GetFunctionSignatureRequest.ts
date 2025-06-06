/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../../../../../index.js";
import * as SeedTrace from "../../../../../../../../api/index.js";
import * as core from "../../../../../../../../core/index.js";
import { FunctionSignature } from "./FunctionSignature.js";

export const GetFunctionSignatureRequest: core.serialization.ObjectSchema<
    serializers.v2.v3.GetFunctionSignatureRequest.Raw,
    SeedTrace.v2.v3.GetFunctionSignatureRequest
> = core.serialization.object({
    functionSignature: FunctionSignature,
});

export declare namespace GetFunctionSignatureRequest {
    export interface Raw {
        functionSignature: FunctionSignature.Raw;
    }
}
