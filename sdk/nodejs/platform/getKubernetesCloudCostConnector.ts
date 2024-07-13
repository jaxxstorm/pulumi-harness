// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Datasource for looking up a Kubernetes Cloud Cost connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getKubernetesCloudCostConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getKubernetesCloudCostConnector(args: GetKubernetesCloudCostConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesCloudCostConnectorResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getKubernetesCloudCostConnector:getKubernetesCloudCostConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesCloudCostConnector.
 */
export interface GetKubernetesCloudCostConnectorArgs {
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
 * A collection of values returned by getKubernetesCloudCostConnector.
 */
export interface GetKubernetesCloudCostConnectorResult {
    /**
     * Reference of the Connector.
     */
    readonly connectorRef: string;
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * Indicates which feature to enable among Billing, Optimization, and Visibility.
     */
    readonly featuresEnableds: string[];
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
     * Tags to associate with the resource.
     */
    readonly tags: string[];
}
/**
 * Datasource for looking up a Kubernetes Cloud Cost connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getKubernetesCloudCostConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getKubernetesCloudCostConnectorOutput(args: GetKubernetesCloudCostConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKubernetesCloudCostConnectorResult> {
    return pulumi.output(args).apply((a: any) => getKubernetesCloudCostConnector(a, opts))
}

/**
 * A collection of arguments for invoking getKubernetesCloudCostConnector.
 */
export interface GetKubernetesCloudCostConnectorOutputArgs {
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