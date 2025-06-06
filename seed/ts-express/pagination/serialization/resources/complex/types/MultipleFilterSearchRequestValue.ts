/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedPagination from "../../../../api/index";
import * as core from "../../../../core";

export const MultipleFilterSearchRequestValue: core.serialization.Schema<
    serializers.MultipleFilterSearchRequestValue.Raw,
    SeedPagination.MultipleFilterSearchRequestValue
> = core.serialization.undiscriminatedUnion([
    core.serialization.list(core.serialization.lazyObject(() => serializers.MultipleFilterSearchRequest)),
    core.serialization.list(core.serialization.lazyObject(() => serializers.SingleFilterSearchRequest)),
]);

export declare namespace MultipleFilterSearchRequestValue {
    export type Raw = serializers.MultipleFilterSearchRequest.Raw[] | serializers.SingleFilterSearchRequest.Raw[];
}
