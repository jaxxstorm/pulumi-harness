// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness pipeline list.
 *
 * ## Example Usage
 *
 * ### Without the Pagination
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getPipelineList({
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 *
 * ### With Pagination Logic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getPipelineList({
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     page: 1,
 *     limit: 4,
 * });
 * ```
 */
export function getPipelineList(args: GetPipelineListArgs, opts?: pulumi.InvokeOptions): Promise<GetPipelineListResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getPipelineList:getPipelineList", {
        "identifier": args.identifier,
        "limit": args.limit,
        "name": args.name,
        "orgId": args.orgId,
        "page": args.page,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPipelineList.
 */
export interface GetPipelineListArgs {
    identifier?: string;
    /**
     * Optional pagination parameter indicating the maximum number of entities to retrieve per page.
     */
    limit?: number;
    name?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId: string;
    /**
     * Optional pagination parameter indicating the page number when retrieving entities.
     */
    page?: number;
    /**
     * Unique identifier of the project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getPipelineList.
 */
export interface GetPipelineListResult {
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly identifier?: string;
    /**
     * Optional pagination parameter indicating the maximum number of entities to retrieve per page.
     */
    readonly limit?: number;
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId: string;
    /**
     * Optional pagination parameter indicating the page number when retrieving entities.
     */
    readonly page?: number;
    /**
     * Containing list of all pipeline with details identifier and name.
     */
    readonly pipelines: outputs.platform.GetPipelineListPipeline[];
    /**
     * Unique identifier of the project.
     */
    readonly projectId: string;
    readonly tags: string[];
}
/**
 * Data source for retrieving a Harness pipeline list.
 *
 * ## Example Usage
 *
 * ### Without the Pagination
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getPipelineList({
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 *
 * ### With Pagination Logic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getPipelineList({
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     page: 1,
 *     limit: 4,
 * });
 * ```
 */
export function getPipelineListOutput(args: GetPipelineListOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPipelineListResult> {
    return pulumi.output(args).apply((a: any) => getPipelineList(a, opts))
}

/**
 * A collection of arguments for invoking getPipelineList.
 */
export interface GetPipelineListOutputArgs {
    identifier?: pulumi.Input<string>;
    /**
     * Optional pagination parameter indicating the maximum number of entities to retrieve per page.
     */
    limit?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId: pulumi.Input<string>;
    /**
     * Optional pagination parameter indicating the page number when retrieving entities.
     */
    page?: pulumi.Input<number>;
    /**
     * Unique identifier of the project.
     */
    projectId: pulumi.Input<string>;
}
