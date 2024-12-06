// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving the current user based on the API key.
 */
export function getCurrentUser(opts?: pulumi.InvokeOptions): Promise<GetCurrentUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getCurrentUser:getCurrentUser", {
    }, opts);
}

/**
 * A collection of values returned by getCurrentUser.
 */
export interface GetCurrentUserResult {
    /**
     * Whether the user is an administrator.
     */
    readonly admin: boolean;
    /**
     * Billing frequency of the user.
     */
    readonly billingFrequency: string;
    /**
     * Default account ID of the user.
     */
    readonly defaultAccountId: string;
    /**
     * Edition of the platform being used.
     */
    readonly edition: string;
    /**
     * Email address of the user.
     */
    readonly email: string;
    /**
     * Whether the user's email address has been verified.
     */
    readonly emailVerified: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Intent of the user.
     */
    readonly intent: string;
    /**
     * Whether 2FA is enabled for the user.
     */
    readonly isTwoFactorAuthEnabled: boolean;
    /**
     * Whether or not the user account is locked.
     */
    readonly locked: boolean;
    /**
     * Name of the user.
     */
    readonly name: string;
    /**
     * Signup action of the user.
     */
    readonly signupAction: string;
    /**
     * Token used to authenticate the user.
     */
    readonly token: string;
    /**
     * Unique identifier of the user.
     */
    readonly uuid: string;
}
/**
 * Data source for retrieving the current user based on the API key.
 */
export function getCurrentUserOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCurrentUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getCurrentUser:getCurrentUser", {
    }, opts);
}
