/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as SeedTrace from "../../../index.js";

export type UserId = string & {
    UserId: void;
};

export function UserId(value: string): SeedTrace.UserId {
    return value as unknown as SeedTrace.UserId;
}
