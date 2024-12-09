// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for looking up an AWS connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getAwsConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getAwsConnector(args: GetAwsConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsConnectorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getAwsConnector:getAwsConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsConnector.
 */
export interface GetAwsConnectorArgs {
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
 * A collection of values returned by getAwsConnector.
 */
export interface GetAwsConnectorResult {
    /**
     * Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     */
    readonly crossAccountAccesses: outputs.platform.GetAwsConnectorCrossAccountAccess[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * Equal Jitter BackOff Strategy.
     */
    readonly equalJitterBackoffStrategies: outputs.platform.GetAwsConnectorEqualJitterBackoffStrategy[];
    /**
     * Fixed Delay BackOff Strategy.
     */
    readonly fixedDelayBackoffStrategies: outputs.platform.GetAwsConnectorFixedDelayBackoffStrategy[];
    /**
     * Full Jitter BackOff Strategy.
     */
    readonly fullJitterBackoffStrategies: outputs.platform.GetAwsConnectorFullJitterBackoffStrategy[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier: string;
    /**
     * Inherit credentials from the delegate.
     */
    readonly inheritFromDelegates: outputs.platform.GetAwsConnectorInheritFromDelegate[];
    /**
     * Use IAM role for service accounts.
     */
    readonly irsas: outputs.platform.GetAwsConnectorIrsa[];
    /**
     * Use IAM role for service accounts.
     */
    readonly manuals: outputs.platform.GetAwsConnectorManual[];
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Authentication using harness oidc.
     */
    readonly oidcAuthentications: outputs.platform.GetAwsConnectorOidcAuthentication[];
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
}
/**
 * Datasource for looking up an AWS connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getAwsConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getAwsConnectorOutput(args: GetAwsConnectorOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAwsConnectorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getAwsConnector:getAwsConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsConnector.
 */
export interface GetAwsConnectorOutputArgs {
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
