// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness Infrastructure.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = pulumi.output(harness.platform.getInfrastructure({
 *     envId: "env_id",
 *     identifier: "identifier",
 *     name: "name",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * }));
 * ```
 */
export function getInfrastructure(args: GetInfrastructureArgs, opts?: pulumi.InvokeOptions): Promise<GetInfrastructureResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:platform/getInfrastructure:getInfrastructure", {
        "envId": args.envId,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInfrastructure.
 */
export interface GetInfrastructureArgs {
    /**
     * environment identifier.
     */
    envId: string;
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the Organization.
     */
    orgId: string;
    /**
     * Unique identifier of the Project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getInfrastructure.
 */
export interface GetInfrastructureResult {
    /**
     * Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     */
    readonly deploymentType: string;
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * environment identifier.
     */
    readonly envId: string;
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
     * Unique identifier of the Organization.
     */
    readonly orgId: string;
    /**
     * Unique identifier of the Project.
     */
    readonly projectId: string;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
    /**
     * Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     */
    readonly type: string;
    /**
     * Infrastructure YAML
     */
    readonly yaml: string;
}

export function getInfrastructureOutput(args: GetInfrastructureOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInfrastructureResult> {
    return pulumi.output(args).apply(a => getInfrastructure(a, opts))
}

/**
 * A collection of arguments for invoking getInfrastructure.
 */
export interface GetInfrastructureOutputArgs {
    /**
     * environment identifier.
     */
    envId: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId: pulumi.Input<string>;
}