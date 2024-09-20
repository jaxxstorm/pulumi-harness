// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness environment group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getEnvironmentGroup({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getEnvironmentGroup(args: GetEnvironmentGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetEnvironmentGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getEnvironmentGroup:getEnvironmentGroup", {
        "color": args.color,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironmentGroup.
 */
export interface GetEnvironmentGroupArgs {
    /**
     * Color of the environment group.
     */
    color?: string;
    /**
     * identifier of the environment group.
     */
    identifier: string;
    /**
     * org_id of the environment group.
     */
    orgId?: string;
    /**
     * project_id of the environment group.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getEnvironmentGroup.
 */
export interface GetEnvironmentGroupResult {
    /**
     * Color of the environment group.
     */
    readonly color: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * identifier of the environment group.
     */
    readonly identifier: string;
    /**
     * org_id of the environment group.
     */
    readonly orgId?: string;
    /**
     * project_id of the environment group.
     */
    readonly projectId?: string;
    /**
     * Input Set YAML
     */
    readonly yaml: string;
}
/**
 * Data source for retrieving a Harness environment group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getEnvironmentGroup({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getEnvironmentGroupOutput(args: GetEnvironmentGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEnvironmentGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getEnvironmentGroup:getEnvironmentGroup", {
        "color": args.color,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironmentGroup.
 */
export interface GetEnvironmentGroupOutputArgs {
    /**
     * Color of the environment group.
     */
    color?: pulumi.Input<string>;
    /**
     * identifier of the environment group.
     */
    identifier: pulumi.Input<string>;
    /**
     * org_id of the environment group.
     */
    orgId?: pulumi.Input<string>;
    /**
     * project_id of the environment group.
     */
    projectId?: pulumi.Input<string>;
}
