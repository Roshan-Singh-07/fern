/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as SeedLiteral from "../../../../index.js";

/**
 * @example
 *     {
 *         optional_prompt: "You are a helpful assistant",
 *         alias_prompt: "You are a helpful assistant",
 *         alias_optional_prompt: "You are a helpful assistant",
 *         optional_stream: false,
 *         alias_stream: false,
 *         alias_optional_stream: false,
 *         query: "What is the weather today"
 *     }
 */
export interface SendLiteralsInQueryRequest {
    prompt: "You are a helpful assistant";
    optional_prompt?: "You are a helpful assistant";
    alias_prompt: SeedLiteral.AliasToPrompt;
    alias_optional_prompt?: SeedLiteral.AliasToPrompt;
    query: string;
    stream: false;
    optional_stream?: false;
    alias_stream: SeedLiteral.AliasToStream;
    alias_optional_stream?: SeedLiteral.AliasToStream;
}
