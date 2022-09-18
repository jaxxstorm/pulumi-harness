// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Datasource for looking up a Datadog connector.
 */
export function getDockerConnector(args?: GetDockerConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetDockerConnectorResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:platform/getDockerConnector:getDockerConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDockerConnector.
 */
export interface GetDockerConnectorArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
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
 * A collection of values returned by getDockerConnector.
 */
export interface GetDockerConnectorResult {
    /**
     * The credentials to use for the docker registry. If not specified then the connection is made to the registry anonymously.
     */
    readonly credentials: outputs.platform.GetDockerConnectorCredential[];
    /**
     * Connect using only the delegates which have these tags.
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
    readonly identifier?: string;
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
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
    /**
     * The type of the docker registry. Valid options are DockerHub, Harbor, Other, Quay
     */
    readonly type: string;
    /**
     * The url of the docker registry.
     */
    readonly url: string;
}

export function getDockerConnectorOutput(args?: GetDockerConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDockerConnectorResult> {
    return pulumi.output(args).apply(a => getDockerConnector(a, opts))
}

/**
 * A collection of arguments for invoking getDockerConnector.
 */
export interface GetDockerConnectorOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
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