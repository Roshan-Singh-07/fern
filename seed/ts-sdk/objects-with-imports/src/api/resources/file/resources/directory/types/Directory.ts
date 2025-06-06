/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as SeedObjectsWithImports from "../../../../../index.js";

/**
 * @example
 *     {
 *         name: "root",
 *         files: [{
 *                 name: "file.txt",
 *                 contents: "...",
 *                 info: SeedObjectsWithImports.FileInfo.Regular
 *             }],
 *         directories: [{
 *                 name: "tmp",
 *                 files: [{
 *                         name: "another_file.txt",
 *                         contents: "...",
 *                         info: SeedObjectsWithImports.FileInfo.Regular
 *                     }]
 *             }]
 *     }
 */
export interface Directory {
    name: string;
    files?: SeedObjectsWithImports.File_[];
    directories?: SeedObjectsWithImports.file.Directory[];
}
