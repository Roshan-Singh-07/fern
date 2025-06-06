/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedTrace from "../../../../api/index";
import * as core from "../../../../core";

export const SubmissionTypeState: core.serialization.Schema<
    serializers.SubmissionTypeState.Raw,
    SeedTrace.SubmissionTypeState
> = core.serialization
    .union("type", {
        test: core.serialization.lazyObject(() => serializers.TestSubmissionState),
        workspace: core.serialization.lazyObject(() => serializers.WorkspaceSubmissionState),
    })
    .transform<SeedTrace.SubmissionTypeState>({
        transform: (value) => value,
        untransform: (value) => value,
    });

export declare namespace SubmissionTypeState {
    export type Raw = SubmissionTypeState.Test | SubmissionTypeState.Workspace;

    export interface Test extends serializers.TestSubmissionState.Raw {
        type: "test";
    }

    export interface Workspace extends serializers.WorkspaceSubmissionState.Raw {
        type: "workspace";
    }
}
