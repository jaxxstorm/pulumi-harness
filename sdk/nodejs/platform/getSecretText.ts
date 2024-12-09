// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * DataSource for looking up secret of type secret text.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getSecretText({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getSecretText(args: GetSecretTextArgs, opts?: pulumi.InvokeOptions): Promise<GetSecretTextResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getSecretText:getSecretText", {
        "additionalMetadatas": args.additionalMetadatas,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecretText.
 */
export interface GetSecretTextArgs {
    /**
     * Additional Metadata for the Secret
     */
    additionalMetadatas?: inputs.platform.GetSecretTextAdditionalMetadata[];
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
     * Unique identifier of the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getSecretText.
 */
export interface GetSecretTextResult {
    /**
     * Additional Metadata for the Secret
     */
    readonly additionalMetadatas?: outputs.platform.GetSecretTextAdditionalMetadata[];
    /**
     * Description of the resource.
     */
    readonly description: string;
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
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Identifier of the Secret Manager used to manage the secret.
     */
    readonly secretManagerIdentifier: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
    /**
     * Value of the Secret
     */
    readonly value: string;
    /**
     * This has details to specify if the secret value is Inline or Reference.
     */
    readonly valueType: string;
}
/**
 * DataSource for looking up secret of type secret text.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getSecretText({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getSecretTextOutput(args: GetSecretTextOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSecretTextResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getSecretText:getSecretText", {
        "additionalMetadatas": args.additionalMetadatas,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecretText.
 */
export interface GetSecretTextOutputArgs {
    /**
     * Additional Metadata for the Secret
     */
    additionalMetadatas?: pulumi.Input<pulumi.Input<inputs.platform.GetSecretTextAdditionalMetadataArgs>[]>;
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
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
}
