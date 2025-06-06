/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as SeedAudiences from "../../../../index.js";

/**
 * @example
 *     {
 *         optionalString: "optionalString",
 *         publicProperty: "publicProperty",
 *         privateProperty: 1
 *     }
 */
export interface FindRequest {
    optionalString?: SeedAudiences.OptionalString;
    publicProperty?: string;
    privateProperty?: number;
}
