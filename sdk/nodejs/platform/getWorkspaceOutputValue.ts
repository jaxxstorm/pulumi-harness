// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving workspace outputs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getWorkspaceOutputValue({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getWorkspaceOutputValue(args: GetWorkspaceOutputValueArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkspaceOutputValueResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getWorkspaceOutputValue:getWorkspaceOutputValue", {
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspaceOutputValue.
 */
export interface GetWorkspaceOutputValueArgs {
    /**
     * Identifier of the Workspace.
     */
    identifier: string;
    /**
     * Organization identifier of the organization the workspace resides in.
     */
    orgId: string;
    /**
     * Project identifier of the project the workspace resides in.
     */
    projectId: string;
}

/**
 * A collection of values returned by getWorkspaceOutputValue.
 */
export interface GetWorkspaceOutputValueResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the Workspace.
     */
    readonly identifier: string;
    /**
     * Organization identifier of the organization the workspace resides in.
     */
    readonly orgId: string;
    readonly outputValues: outputs.platform.GetWorkspaceOutputValueOutputValue[];
    /**
     * Project identifier of the project the workspace resides in.
     */
    readonly projectId: string;
}
/**
 * Data source for retrieving workspace outputs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getWorkspaceOutputValue({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getWorkspaceOutputValueOutput(args: GetWorkspaceOutputValueOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWorkspaceOutputValueResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getWorkspaceOutputValue:getWorkspaceOutputValue", {
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspaceOutputValue.
 */
export interface GetWorkspaceOutputValueOutputArgs {
    /**
     * Identifier of the Workspace.
     */
    identifier: pulumi.Input<string>;
    /**
     * Organization identifier of the organization the workspace resides in.
     */
    orgId: pulumi.Input<string>;
    /**
     * Project identifier of the project the workspace resides in.
     */
    projectId: pulumi.Input<string>;
}
