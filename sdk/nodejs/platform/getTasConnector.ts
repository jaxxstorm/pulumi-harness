// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for looking up an Tas Connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getTasConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getTasConnector(args: GetTasConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetTasConnectorResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getTasConnector:getTasConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTasConnector.
 */
export interface GetTasConnectorArgs {
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
 * A collection of values returned by getTasConnector.
 */
export interface GetTasConnectorResult {
    /**
     * Contains Tas connector credentials.
     */
    readonly credentials: outputs.platform.GetTasConnectorCredential[];
    /**
     * Tags to filter delegates for connection.
     */
    readonly delegateSelectors: string[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * Execute on delegate or not.
     */
    readonly executeOnDelegate: boolean;
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
 * Datasource for looking up an Tas Connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getTasConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getTasConnectorOutput(args: GetTasConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTasConnectorResult> {
    return pulumi.output(args).apply((a: any) => getTasConnector(a, opts))
}

/**
 * A collection of arguments for invoking getTasConnector.
 */
export interface GetTasConnectorOutputArgs {
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
