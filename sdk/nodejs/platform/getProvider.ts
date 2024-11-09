// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getProvider(args: GetProviderArgs, opts?: pulumi.InvokeOptions): Promise<GetProviderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getProvider:getProvider", {
        "identifier": args.identifier,
    }, opts);
}

/**
 * A collection of arguments for invoking getProvider.
 */
export interface GetProviderArgs {
    identifier: string;
}

/**
 * A collection of values returned by getProvider.
 */
export interface GetProviderResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly identifier: string;
}
export function getProviderOutput(args: GetProviderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProviderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getProvider:getProvider", {
        "identifier": args.identifier,
    }, opts);
}

/**
 * A collection of arguments for invoking getProvider.
 */
export interface GetProviderOutputArgs {
    identifier: pulumi.Input<string>;
}