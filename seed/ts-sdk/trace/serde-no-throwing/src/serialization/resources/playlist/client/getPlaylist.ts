/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index.js";
import * as SeedTrace from "../../../../api/index.js";
import * as core from "../../../../core/index.js";
import { PlaylistIdNotFoundErrorBody } from "../types/PlaylistIdNotFoundErrorBody.js";

export const Error: core.serialization.Schema<
    serializers.playlist.getPlaylist.Error.Raw,
    SeedTrace.playlist.getPlaylist.Error
> = core.serialization
    .union("errorName", {
        PlaylistIdNotFoundError: core.serialization.object({
            content: PlaylistIdNotFoundErrorBody,
        }),
        UnauthorizedError: core.serialization.object({}),
    })
    .transform<SeedTrace.playlist.getPlaylist.Error>({
        transform: (value) => {
            switch (value.errorName) {
                case "PlaylistIdNotFoundError":
                    return SeedTrace.playlist.getPlaylist.Error.playlistIdNotFoundError(value.content);
                case "UnauthorizedError":
                    return SeedTrace.playlist.getPlaylist.Error.unauthorizedError();
            }
        },
        untransform: ({ _visit, ...value }) => value as any,
    });

export declare namespace Error {
    export type Raw = Error.PlaylistIdNotFoundError | Error.UnauthorizedError;

    export interface PlaylistIdNotFoundError {
        errorName: "PlaylistIdNotFoundError";
        content: PlaylistIdNotFoundErrorBody.Raw;
    }

    export interface UnauthorizedError {
        errorName: "UnauthorizedError";
    }
}
