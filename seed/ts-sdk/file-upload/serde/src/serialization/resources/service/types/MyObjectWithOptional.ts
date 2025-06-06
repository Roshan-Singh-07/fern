/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index.js";
import * as SeedFileUpload from "../../../../api/index.js";
import * as core from "../../../../core/index.js";

export const MyObjectWithOptional: core.serialization.ObjectSchema<
    serializers.MyObjectWithOptional.Raw,
    SeedFileUpload.MyObjectWithOptional
> = core.serialization.object({
    prop: core.serialization.string(),
    optionalProp: core.serialization.string().optional(),
});

export declare namespace MyObjectWithOptional {
    export interface Raw {
        prop: string;
        optionalProp?: string | null;
    }
}
