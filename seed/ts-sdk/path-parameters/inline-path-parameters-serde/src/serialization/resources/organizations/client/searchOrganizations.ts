/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index.js";
import * as SeedPathParameters from "../../../../api/index.js";
import * as core from "../../../../core/index.js";
import { Organization } from "../types/Organization.js";

export const Response: core.serialization.Schema<
    serializers.organizations.searchOrganizations.Response.Raw,
    SeedPathParameters.Organization[]
> = core.serialization.list(Organization);

export declare namespace Response {
    export type Raw = Organization.Raw[];
}
