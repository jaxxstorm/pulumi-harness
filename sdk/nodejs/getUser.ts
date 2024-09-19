// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source for retrieving a Harness user
 */
export function getUser(args?: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:index/getUser:getUser", {
        "email": args.email,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserArgs {
    /**
     * The email of the user.
     */
    email?: string;
    /**
     * Unique identifier of the user
     */
    id?: string;
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    /**
     * The email of the user.
     */
    readonly email?: string;
    /**
     * Unique identifier of the user
     */
    readonly id?: string;
    /**
     * Flag indicating whether or not the users email has been verified.
     */
    readonly isEmailVerified: boolean;
    /**
     * Flag indicating whether or not the user was imported from an identity provider.
     */
    readonly isImportedFromIdentityProvider: boolean;
    /**
     * Flag indicating whether or not the users password has expired.
     */
    readonly isPasswordExpired: boolean;
    /**
     * Flag indicating whether or not two-factor authentication is enabled for the user.
     */
    readonly isTwoFactorAuthEnabled: boolean;
    /**
     * Flag indicating whether or not the user is locked out.
     */
    readonly isUserLocked: boolean;
    /**
     * The name of the user.
     */
    readonly name: string;
}
/**
 * Data source for retrieving a Harness user
 */
export function getUserOutput(args?: GetUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:index/getUser:getUser", {
        "email": args.email,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserOutputArgs {
    /**
     * The email of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * Unique identifier of the user
     */
    id?: pulumi.Input<string>;
}
