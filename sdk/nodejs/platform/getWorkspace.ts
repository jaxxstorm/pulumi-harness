// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving workspaces.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getWorkspace({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getWorkspace(args: GetWorkspaceArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkspaceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getWorkspace:getWorkspace", {
        "description": args.description,
        "environmentVariables": args.environmentVariables,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "repositoryBranch": args.repositoryBranch,
        "repositoryCommit": args.repositoryCommit,
        "repositorySha": args.repositorySha,
        "terraformVariableFiles": args.terraformVariableFiles,
        "terraformVariables": args.terraformVariables,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspace.
 */
export interface GetWorkspaceArgs {
    /**
     * Description of the Workspace
     */
    description?: string;
    /**
     * Environment variables configured on the workspace
     */
    environmentVariables?: inputs.platform.GetWorkspaceEnvironmentVariable[];
    /**
     * Identifier of the Workspace
     */
    identifier: string;
    /**
     * Organization Identifier
     */
    orgId: string;
    /**
     * Project Identifier
     */
    projectId: string;
    /**
     * Repository Branch in which the code should be accessed
     */
    repositoryBranch?: string;
    /**
     * Repository Tag in which the code should be accessed
     */
    repositoryCommit?: string;
    /**
     * Repository SHA in which the code should be accessed
     */
    repositorySha?: string;
    terraformVariableFiles?: inputs.platform.GetWorkspaceTerraformVariableFile[];
    terraformVariables?: inputs.platform.GetWorkspaceTerraformVariable[];
}

/**
 * A collection of values returned by getWorkspace.
 */
export interface GetWorkspaceResult {
    /**
     * If enabled cost estimation operations will be performed in this workspace
     */
    readonly costEstimationEnabled: boolean;
    readonly defaultPipelines: {[key: string]: string};
    /**
     * Description of the Workspace
     */
    readonly description: string;
    /**
     * Environment variables configured on the workspace
     */
    readonly environmentVariables: outputs.platform.GetWorkspaceEnvironmentVariable[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the Workspace
     */
    readonly identifier: string;
    /**
     * Name of the Workspace
     */
    readonly name: string;
    /**
     * Organization Identifier
     */
    readonly orgId: string;
    /**
     * Project Identifier
     */
    readonly projectId: string;
    /**
     * Provider Connector is the reference to the connector for the infrastructure provider
     */
    readonly providerConnector: string;
    /**
     * Provisioner type defines the provisioning tool to use.
     */
    readonly provisionerType: string;
    /**
     * Provisioner Version defines the tool version to use
     */
    readonly provisionerVersion: string;
    /**
     * Repository is the name of the repository to use
     */
    readonly repository: string;
    /**
     * Repository Branch in which the code should be accessed
     */
    readonly repositoryBranch: string;
    /**
     * Repository Tag in which the code should be accessed
     */
    readonly repositoryCommit: string;
    /**
     * Repository Connector is the reference to the connector to use for this code
     */
    readonly repositoryConnector: string;
    /**
     * Repository Path is the path in which the infra code resides
     */
    readonly repositoryPath: string;
    /**
     * Repository SHA in which the code should be accessed
     */
    readonly repositorySha: string;
    readonly terraformVariableFiles: outputs.platform.GetWorkspaceTerraformVariableFile[];
    readonly terraformVariables: outputs.platform.GetWorkspaceTerraformVariable[];
}
/**
 * Data source for retrieving workspaces.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getWorkspace({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getWorkspaceOutput(args: GetWorkspaceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWorkspaceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getWorkspace:getWorkspace", {
        "description": args.description,
        "environmentVariables": args.environmentVariables,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "repositoryBranch": args.repositoryBranch,
        "repositoryCommit": args.repositoryCommit,
        "repositorySha": args.repositorySha,
        "terraformVariableFiles": args.terraformVariableFiles,
        "terraformVariables": args.terraformVariables,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspace.
 */
export interface GetWorkspaceOutputArgs {
    /**
     * Description of the Workspace
     */
    description?: pulumi.Input<string>;
    /**
     * Environment variables configured on the workspace
     */
    environmentVariables?: pulumi.Input<pulumi.Input<inputs.platform.GetWorkspaceEnvironmentVariableArgs>[]>;
    /**
     * Identifier of the Workspace
     */
    identifier: pulumi.Input<string>;
    /**
     * Organization Identifier
     */
    orgId: pulumi.Input<string>;
    /**
     * Project Identifier
     */
    projectId: pulumi.Input<string>;
    /**
     * Repository Branch in which the code should be accessed
     */
    repositoryBranch?: pulumi.Input<string>;
    /**
     * Repository Tag in which the code should be accessed
     */
    repositoryCommit?: pulumi.Input<string>;
    /**
     * Repository SHA in which the code should be accessed
     */
    repositorySha?: pulumi.Input<string>;
    terraformVariableFiles?: pulumi.Input<pulumi.Input<inputs.platform.GetWorkspaceTerraformVariableFileArgs>[]>;
    terraformVariables?: pulumi.Input<pulumi.Input<inputs.platform.GetWorkspaceTerraformVariableArgs>[]>;
}
