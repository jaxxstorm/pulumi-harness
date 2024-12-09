// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving files.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getFileStoreFile({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getFileStoreFile(args: GetFileStoreFileArgs, opts?: pulumi.InvokeOptions): Promise<GetFileStoreFileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getFileStoreFile:getFileStoreFile", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFileStoreFile.
 */
export interface GetFileStoreFileArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getFileStoreFile.
 */
export interface GetFileStoreFileResult {
    /**
     * File content stored on Harness File Store
     */
    readonly content: string;
    /**
     * Created by
     */
    readonly createdBies: outputs.platform.GetFileStoreFileCreatedBy[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * File content path to be upladed on Harness File Store
     */
    readonly fileContentPath: string;
    /**
     * File usage. Valid options are ManifestFile, Config, Script
     */
    readonly fileUsage: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier: string;
    /**
     * Last modified at
     */
    readonly lastModifiedAt: number;
    /**
     * Last modified by
     */
    readonly lastModifiedBies: outputs.platform.GetFileStoreFileLastModifiedBy[];
    /**
     * File mime type
     */
    readonly mimeType: string;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * File parent identifier on Harness File Store
     */
    readonly parentIdentifier: string;
    /**
     * Harness File Store file path
     */
    readonly path: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
}
/**
 * Data source for retrieving files.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getFileStoreFile({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getFileStoreFileOutput(args: GetFileStoreFileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFileStoreFileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getFileStoreFile:getFileStoreFile", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFileStoreFile.
 */
export interface GetFileStoreFileOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
}
