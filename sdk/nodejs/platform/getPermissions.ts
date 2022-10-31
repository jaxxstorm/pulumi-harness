// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving permissions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = pulumi.output(harness.platform.getPermissions({
 *     orgId: "org_id",
 *     projectId: "project_id",
 * }));
 * ```
 */
export function getPermissions(args?: GetPermissionsArgs, opts?: pulumi.InvokeOptions): Promise<GetPermissionsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:platform/getPermissions:getPermissions", {
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPermissions.
 */
export interface GetPermissionsArgs {
    /**
     * Organization Identifier
     */
    orgId?: string;
    /**
     * Project Identifier
     */
    projectId?: string;
}

/**
 * A collection of values returned by getPermissions.
 */
export interface GetPermissionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Organization Identifier
     */
    readonly orgId?: string;
    /**
     * Response of the api
     */
    readonly permissions: outputs.platform.GetPermissionsPermission[];
    /**
     * Project Identifier
     */
    readonly projectId?: string;
}

export function getPermissionsOutput(args?: GetPermissionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPermissionsResult> {
    return pulumi.output(args).apply(a => getPermissions(a, opts))
}

/**
 * A collection of arguments for invoking getPermissions.
 */
export interface GetPermissionsOutputArgs {
    /**
     * Organization Identifier
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier
     */
    projectId?: pulumi.Input<string>;
}
