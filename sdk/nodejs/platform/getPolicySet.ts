// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness policyset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getPolicySet({
 *     identifier: "harness_platform_policyset.test.identifier",
 *     name: "harness_platform_policyset.test.name",
 *     action: "onrun",
 *     type: "pipeline",
 *     enabled: true,
 *     policies: [{
 *         identifier: "always_run",
 *         severity: "warning",
 *     }],
 * });
 * ```
 */
export function getPolicySet(args: GetPolicySetArgs, opts?: pulumi.InvokeOptions): Promise<GetPolicySetResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getPolicySet:getPolicySet", {
        "action": args.action,
        "enabled": args.enabled,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "policies": args.policies,
        "projectId": args.projectId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicySet.
 */
export interface GetPolicySetArgs {
    /**
     * Action code for the policyset.
     */
    action: string;
    /**
     * Enabled for the policyset.
     */
    enabled?: boolean;
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
     * List of policy identifiers / severity for the policyset.
     */
    policies?: inputs.platform.GetPolicySetPolicy[];
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
    /**
     * Type of the policyset.
     */
    type: string;
}

/**
 * A collection of values returned by getPolicySet.
 */
export interface GetPolicySetResult {
    /**
     * Action code for the policyset.
     */
    readonly action: string;
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * Enabled for the policyset.
     */
    readonly enabled?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier: string;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * List of policy identifiers / severity for the policyset.
     */
    readonly policies?: outputs.platform.GetPolicySetPolicy[];
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
    /**
     * Type of the policyset.
     */
    readonly type: string;
}
/**
 * Data source for retrieving a Harness policyset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getPolicySet({
 *     identifier: "harness_platform_policyset.test.identifier",
 *     name: "harness_platform_policyset.test.name",
 *     action: "onrun",
 *     type: "pipeline",
 *     enabled: true,
 *     policies: [{
 *         identifier: "always_run",
 *         severity: "warning",
 *     }],
 * });
 * ```
 */
export function getPolicySetOutput(args: GetPolicySetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPolicySetResult> {
    return pulumi.output(args).apply((a: any) => getPolicySet(a, opts))
}

/**
 * A collection of arguments for invoking getPolicySet.
 */
export interface GetPolicySetOutputArgs {
    /**
     * Action code for the policyset.
     */
    action: pulumi.Input<string>;
    /**
     * Enabled for the policyset.
     */
    enabled?: pulumi.Input<boolean>;
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
     * List of policy identifiers / severity for the policyset.
     */
    policies?: pulumi.Input<pulumi.Input<inputs.platform.GetPolicySetPolicyArgs>[]>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Type of the policyset.
     */
    type: pulumi.Input<string>;
}
