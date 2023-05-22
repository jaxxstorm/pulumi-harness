// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source for retrieving a Harness application
 */
export function getEncryptedText(args?: GetEncryptedTextArgs, opts?: pulumi.InvokeOptions): Promise<GetEncryptedTextResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:index/getEncryptedText:getEncryptedText", {
        "id": args.id,
        "name": args.name,
        "usageScopes": args.usageScopes,
    }, opts);
}

/**
 * A collection of arguments for invoking getEncryptedText.
 */
export interface GetEncryptedTextArgs {
    /**
     * Unique identifier of the encrypted secret
     */
    id?: string;
    /**
     * The name of the encrypted secret
     */
    name?: string;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: inputs.GetEncryptedTextUsageScope[];
}

/**
 * A collection of values returned by getEncryptedText.
 */
export interface GetEncryptedTextResult {
    /**
     * Unique identifier of the encrypted secret
     */
    readonly id?: string;
    /**
     * The name of the encrypted secret
     */
    readonly name?: string;
    /**
     * The id of the associated secret manager
     */
    readonly secretManagerId: string;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    readonly usageScopes?: outputs.GetEncryptedTextUsageScope[];
}
/**
 * Data source for retrieving a Harness application
 */
export function getEncryptedTextOutput(args?: GetEncryptedTextOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEncryptedTextResult> {
    return pulumi.output(args).apply((a: any) => getEncryptedText(a, opts))
}

/**
 * A collection of arguments for invoking getEncryptedText.
 */
export interface GetEncryptedTextOutputArgs {
    /**
     * Unique identifier of the encrypted secret
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the encrypted secret
     */
    name?: pulumi.Input<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.GetEncryptedTextUsageScopeArgs>[]>;
}
