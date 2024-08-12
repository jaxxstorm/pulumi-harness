// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data Source for retrieving delegate tokens.
 */
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
    /**
     * Account Identifier for the Entity
     */
    accountId: string;
    /**
     * Time when the delegate token is created.
     */
    createdAt?: number;
    /**
     * Name of the resource.
     */
    name: string;
    /**
     * Unique identifier of the organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
    /**
     * Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
     */
    tokenStatus?: string;
    /**
     * Value of the delegate Token
     */
    value?: string;
}

/**
 * A collection of values returned by getDelegatetoken.
 */
export interface GetDelegatetokenResult {
    /**
     * Account Identifier for the Entity
     */
    readonly accountId: string;
    /**
     * Time when the delegate token is created.
     */
    readonly createdAt?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the resource.
     */
    readonly name: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
     */
    readonly tokenStatus?: string;
    /**
     * Value of the delegate Token
     */
    readonly value?: string;
}
/**
 * Data Source for retrieving delegate tokens.
 */
export function getDelegatetokenOutput(args: GetDelegatetokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDelegatetokenResult> {
    return pulumi.output(args).apply((a: any) => getDelegatetoken(a, opts))
}

/**
 * A collection of arguments for invoking getDelegatetoken.
 */
export interface GetDelegatetokenOutputArgs {
    /**
     * Account Identifier for the Entity
     */
    accountId: pulumi.Input<string>;
    /**
     * Time when the delegate token is created.
     */
    createdAt?: pulumi.Input<number>;
    /**
     * Name of the resource.
     */
    name: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
     */
    tokenStatus?: pulumi.Input<string>;
    /**
     * Value of the delegate Token
     */
    value?: pulumi.Input<string>;
}
