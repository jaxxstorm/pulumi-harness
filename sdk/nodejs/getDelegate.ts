// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source for retrieving a Harness delegate. If more than one delegate matches the query the first one will be returned.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.getDelegate({
 *     name: "harness-delegate",
 *     type: "KUBERNETES",
 *     status: "ENABLED",
 * });
 * ```
 */
export function getDelegate(args?: GetDelegateArgs, opts?: pulumi.InvokeOptions): Promise<GetDelegateResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:index/getDelegate:getDelegate", {
        "hostname": args.hostname,
        "id": args.id,
        "name": args.name,
        "status": args.status,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getDelegate.
 */
export interface GetDelegateArgs {
    /**
     * The hostname of the delegate.
     */
    hostname?: string;
    /**
     * Unique identifier of the delegate
     */
    id?: string;
    /**
     * The name of the delegate to query for.
     */
    name?: string;
    /**
     * The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
     */
    status?: string;
    /**
     * The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
     */
    type?: string;
}

/**
 * A collection of values returned by getDelegate.
 */
export interface GetDelegateResult {
    /**
     * The account id the delegate belongs to.
     */
    readonly accountId: string;
    /**
     * The description of the delegate.
     */
    readonly description: string;
    /**
     * The hostname of the delegate.
     */
    readonly hostname?: string;
    /**
     * Unique identifier of the delegate
     */
    readonly id?: string;
    /**
     * The ip address of the delegate.
     */
    readonly ip: string;
    /**
     * The last time the delegate was heard from.
     */
    readonly lastHeartbeat: string;
    /**
     * The name of the delegate to query for.
     */
    readonly name?: string;
    /**
     * Whether the delegate is in polling mode.
     */
    readonly pollingModeEnabled: boolean;
    /**
     * The id of the profile assigned to the delegate.
     */
    readonly profileId: string;
    /**
     * The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
     */
    readonly status?: string;
    /**
     * The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
     */
    readonly type?: string;
    /**
     * The version of the delegate.
     */
    readonly version: string;
}
/**
 * Data source for retrieving a Harness delegate. If more than one delegate matches the query the first one will be returned.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.getDelegate({
 *     name: "harness-delegate",
 *     type: "KUBERNETES",
 *     status: "ENABLED",
 * });
 * ```
 */
export function getDelegateOutput(args?: GetDelegateOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDelegateResult> {
    return pulumi.output(args).apply((a: any) => getDelegate(a, opts))
}

/**
 * A collection of arguments for invoking getDelegate.
 */
export interface GetDelegateOutputArgs {
    /**
     * The hostname of the delegate.
     */
    hostname?: pulumi.Input<string>;
    /**
     * Unique identifier of the delegate
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the delegate to query for.
     */
    name?: pulumi.Input<string>;
    /**
     * The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
     */
    status?: pulumi.Input<string>;
    /**
     * The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
     */
    type?: pulumi.Input<string>;
}
