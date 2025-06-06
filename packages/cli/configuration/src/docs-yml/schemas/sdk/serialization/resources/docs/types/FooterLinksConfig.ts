/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernDocsConfig from "../../../../api/index";
import * as core from "../../../../core";

export const FooterLinksConfig: core.serialization.ObjectSchema<
    serializers.FooterLinksConfig.Raw,
    FernDocsConfig.FooterLinksConfig
> = core.serialization.object({
    github: core.serialization.string().optional(),
    twitter: core.serialization.string().optional(),
    x: core.serialization.string().optional(),
    linkedin: core.serialization.string().optional(),
    youtube: core.serialization.string().optional(),
    instagram: core.serialization.string().optional(),
    facebook: core.serialization.string().optional(),
    discord: core.serialization.string().optional(),
    slack: core.serialization.string().optional(),
    hackernews: core.serialization.string().optional(),
    medium: core.serialization.string().optional(),
    website: core.serialization.string().optional(),
});

export declare namespace FooterLinksConfig {
    export interface Raw {
        github?: string | null;
        twitter?: string | null;
        x?: string | null;
        linkedin?: string | null;
        youtube?: string | null;
        instagram?: string | null;
        facebook?: string | null;
        discord?: string | null;
        slack?: string | null;
        hackernews?: string | null;
        medium?: string | null;
        website?: string | null;
    }
}
