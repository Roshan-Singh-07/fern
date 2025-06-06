/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernIr from "../../../../api/index";
import * as core from "../../../../core";
import { EnvironmentId } from "../../environment/types/EnvironmentId";
import { MultipleEnvironmentUrlValues } from "./MultipleEnvironmentUrlValues";

export const V2EnvironmentValues: core.serialization.Schema<
    serializers.V2EnvironmentValues.Raw,
    FernIr.V2EnvironmentValues
> = core.serialization.undiscriminatedUnion([EnvironmentId, MultipleEnvironmentUrlValues]);

export declare namespace V2EnvironmentValues {
    export type Raw = EnvironmentId.Raw | MultipleEnvironmentUrlValues.Raw;
}
