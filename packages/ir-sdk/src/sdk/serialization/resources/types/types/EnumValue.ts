/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernIr from "../../../../api/index";
import * as core from "../../../../core";
import { NameAndWireValue } from "../../commons/types/NameAndWireValue";
import { Declaration } from "../../commons/types/Declaration";

export const EnumValue: core.serialization.ObjectSchema<serializers.EnumValue.Raw, FernIr.EnumValue> =
    core.serialization
        .objectWithoutOptionalProperties({
            name: NameAndWireValue,
        })
        .extend(Declaration);

export declare namespace EnumValue {
    export interface Raw extends Declaration.Raw {
        name: NameAndWireValue.Raw;
    }
}
