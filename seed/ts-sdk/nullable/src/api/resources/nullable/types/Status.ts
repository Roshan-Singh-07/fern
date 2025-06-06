/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as SeedNullable from "../../../index.js";

export type Status = SeedNullable.Status.Active | SeedNullable.Status.Archived | SeedNullable.Status.SoftDeleted;

export namespace Status {
    export interface Active {
        type: "active";
    }

    export interface Archived {
        type: "archived";
        value: string | null;
    }

    export interface SoftDeleted {
        type: "soft-deleted";
        value?: string;
    }
}
