// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for looking up an App Dynamics connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getAppDynamicsConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getAppDynamicsConnector(args: GetAppDynamicsConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetAppDynamicsConnectorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getAppDynamicsConnector:getAppDynamicsConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppDynamicsConnector.
 */
export interface GetAppDynamicsConnectorArgs {
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
 * A collection of values returned by getAppDynamicsConnector.
 */
export interface GetAppDynamicsConnectorResult {
    /**
     * The App Dynamics account name.
     */
    readonly accountName: string;
    /**
     * Authenticate to App Dynamics using api token.
     */
    readonly apiTokens: outputs.platform.GetAppDynamicsConnectorApiToken[];
    /**
     * Tags to filter delegates for connection.
     */
    readonly delegateSelectors: string[];
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
     * Tags to associate with the resource.
     */
    readonly tags: string[];
    /**
     * URL of the App Dynamics controller.
     */
    readonly url: string;
    /**
     * Authenticate to App Dynamics using username and password.
     */
    readonly usernamePasswords: outputs.platform.GetAppDynamicsConnectorUsernamePassword[];
}
/**
 * Datasource for looking up an App Dynamics connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getAppDynamicsConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getAppDynamicsConnectorOutput(args: GetAppDynamicsConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppDynamicsConnectorResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getAppDynamicsConnector:getAppDynamicsConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppDynamicsConnector.
 */
export interface GetAppDynamicsConnectorOutputArgs {
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
