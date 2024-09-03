// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving Harness service list.
 *
 * ## Example Usage
 *
 * ### project level service list
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getServiceList({
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 *
 * ### Organisation level service list
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getServiceList({
 *     orgId: "org_id",
 * });
 * ```
 *
 * ### Account level service list
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getServiceList({});
 * ```
 */
export function getServiceList(args?: GetServiceListArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceListResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getServiceList:getServiceList", {
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceList.
 */
export interface GetServiceListArgs {
    orgId?: string;
    projectId?: string;
}

/**
 * A collection of values returned by getServiceList.
 */
export interface GetServiceListResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId?: string;
    readonly projectId?: string;
    readonly services: outputs.platform.GetServiceListService[];
}
/**
 * Data source for retrieving Harness service list.
 *
 * ## Example Usage
 *
 * ### project level service list
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getServiceList({
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 *
 * ### Organisation level service list
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getServiceList({
 *     orgId: "org_id",
 * });
 * ```
 *
 * ### Account level service list
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getServiceList({});
 * ```
 */
export function getServiceListOutput(args?: GetServiceListOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceListResult> {
    return pulumi.output(args).apply((a: any) => getServiceList(a, opts))
}

/**
 * A collection of arguments for invoking getServiceList.
 */
export interface GetServiceListOutputArgs {
    orgId?: pulumi.Input<string>;
    projectId?: pulumi.Input<string>;
}
