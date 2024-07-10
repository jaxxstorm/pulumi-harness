// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getDelegatetoken(args: GetDelegatetokenArgs, opts?: pulumi.InvokeOptions): Promise<GetDelegatetokenResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getDelegatetoken:getDelegatetoken", {
        "accountId": args.accountId,
        "createdAt": args.createdAt,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "tokenStatus": args.tokenStatus,
        "value": args.value,
    }, opts);
}

/**
 * A collection of arguments for invoking getDelegatetoken.
 */
export interface GetDelegatetokenArgs {
    accountId: string;
    createdAt?: number;
    name: string;
    orgId?: string;
    projectId?: string;
    tokenStatus?: string;
    value?: string;
}

/**
 * A collection of values returned by getDelegatetoken.
 */
export interface GetDelegatetokenResult {
    readonly accountId: string;
    readonly createdAt?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly orgId?: string;
    readonly projectId?: string;
    readonly tokenStatus?: string;
    readonly value?: string;
}
export function getDelegatetokenOutput(args: GetDelegatetokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDelegatetokenResult> {
    return pulumi.output(args).apply((a: any) => getDelegatetoken(a, opts))
}

/**
 * A collection of arguments for invoking getDelegatetoken.
 */
export interface GetDelegatetokenOutputArgs {
    accountId: pulumi.Input<string>;
    createdAt?: pulumi.Input<number>;
    name: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    projectId?: pulumi.Input<string>;
    tokenStatus?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}
