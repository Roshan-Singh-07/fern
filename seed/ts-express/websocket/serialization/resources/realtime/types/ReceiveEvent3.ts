/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedWebsocket from "../../../../api/index";
import * as core from "../../../../core";

export const ReceiveEvent3: core.serialization.ObjectSchema<
    serializers.ReceiveEvent3.Raw,
    SeedWebsocket.ReceiveEvent3
> = core.serialization.object({
    receiveText3: core.serialization.string(),
});

export declare namespace ReceiveEvent3 {
    export interface Raw {
        receiveText3: string;
    }
}
