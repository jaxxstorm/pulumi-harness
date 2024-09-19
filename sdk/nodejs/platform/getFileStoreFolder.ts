// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving folders.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getFileStoreFolder({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getFileStoreFolder(args: GetFileStoreFolderArgs, opts?: pulumi.InvokeOptions): Promise<GetFileStoreFolderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getFileStoreFolder:getFileStoreFolder", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFileStoreFolder.
 */
export interface GetFileStoreFolderArgs {
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
 * A collection of values returned by getFileStoreFolder.
 */
export interface GetFileStoreFolderResult {
    /**
     * Created by
     */
    readonly createdBies: outputs.platform.GetFileStoreFolderCreatedBy[];
    /**
     * Description of the resource.
     */
    readonly description: string;
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
    readonly lastModifiedBies: outputs.platform.GetFileStoreFolderLastModifiedBy[];
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Folder parent identifier on Harness File Store
     */
    readonly parentIdentifier: string;
    /**
     * Harness File Store folder path
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
 * Data source for retrieving folders.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getFileStoreFolder({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getFileStoreFolderOutput(args: GetFileStoreFolderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFileStoreFolderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getFileStoreFolder:getFileStoreFolder", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFileStoreFolder.
 */
export interface GetFileStoreFolderOutputArgs {
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
