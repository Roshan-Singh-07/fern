/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as SeedApi from "../index.js";

export interface Account extends SeedApi.BaseResource {
    resource_type: "Account";
    name: string;
    patient?: SeedApi.Patient;
    practitioner?: SeedApi.Practitioner;
}
