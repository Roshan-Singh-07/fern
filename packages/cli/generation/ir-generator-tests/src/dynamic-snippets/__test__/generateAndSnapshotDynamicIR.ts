import { SourceResolverImpl } from "@fern-api/cli-source-resolver";
import { Audiences } from "@fern-api/configuration-loader";
import { AbsoluteFilePath, RelativeFilePath, join, streamObjectToFile } from "@fern-api/fs-utils";
import { convertIrToDynamicSnippetsIr, generateIntermediateRepresentation } from "@fern-api/ir-generator";
import { serialization as IrSerialization } from "@fern-api/ir-sdk";
import { createMockTaskContext } from "@fern-api/task-context";
import { AbstractAPIWorkspace } from "@fern-api/workspace-loader";

export async function generateAndSnapshotDynamicIR({
    workspace,
    workspaceName,
    audiences,
    absolutePathToIr
}: {
    workspace: AbstractAPIWorkspace<unknown>;
    workspaceName: string;
    absolutePathToIr: AbsoluteFilePath;
    audiences: Audiences;
}): Promise<void> {
    const context = createMockTaskContext();
    const fernWorkspace = await workspace.toFernWorkspace({
        context
    });

    const intermediateRepresentation = generateIntermediateRepresentation({
        workspace: fernWorkspace,
        generationLanguage: undefined,
        audiences,
        keywords: undefined,
        smartCasing: true,
        exampleGeneration: { disabled: false },
        disableDynamicExamples: true,
        readme: undefined,
        version: undefined,
        packageName: undefined,
        context,
        sourceResolver: new SourceResolverImpl(context, fernWorkspace)
    });

    const dynamicIntermediateRepresentation = convertIrToDynamicSnippetsIr({
        ir: intermediateRepresentation,
        disableExamples: true
    });

    const dynamicIntermediateRepresentationJson = IrSerialization.dynamic.DynamicIntermediateRepresentation.jsonOrThrow(
        dynamicIntermediateRepresentation,
        {
            unrecognizedObjectKeys: "strip"
        }
    );

    await streamObjectToFile(
        join(AbsoluteFilePath.of(absolutePathToIr), RelativeFilePath.of(`${workspaceName}.json`)),
        dynamicIntermediateRepresentationJson,
        { pretty: true }
    );
}
