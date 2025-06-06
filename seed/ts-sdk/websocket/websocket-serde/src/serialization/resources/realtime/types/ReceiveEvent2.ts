/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index.js";
import * as SeedWebsocket from "../../../../api/index.js";
import * as core from "../../../../core/index.js";

export const ReceiveEvent2: core.serialization.ObjectSchema<
    serializers.ReceiveEvent2.Raw,
    SeedWebsocket.ReceiveEvent2
> = core.serialization.object({
    gamma: core.serialization.string(),
    delta: core.serialization.number(),
    epsilon: core.serialization.boolean(),
});

export declare namespace ReceiveEvent2 {
    export interface Raw {
        gamma: string;
        delta: number;
        epsilon: boolean;
    }
}
