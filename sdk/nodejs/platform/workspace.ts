// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for managing Workspaces
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.Workspace("example", {
 *     name: "example",
 *     identifier: "example",
 *     orgId: testHarnessPlatformOrganization.id,
 *     projectId: testHarnessPlatformProject.id,
 *     provisionerType: "terraform",
 *     provisionerVersion: "1.5.6",
 *     repository: "https://github.com/org/repo",
 *     repositoryBranch: "main",
 *     repositoryPath: "tf/aws/basic",
 *     costEstimationEnabled: true,
 *     providerConnector: test.id,
 *     repositoryConnector: test.id,
 *     terraformVariables: [
 *         {
 *             key: "key1",
 *             value: "val1",
 *             valueType: "string",
 *         },
 *         {
 *             key: "key2",
 *             value: "val2",
 *             valueType: "string",
 *         },
 *     ],
 *     environmentVariables: [
 *         {
 *             key: "key1",
 *             value: "val1",
 *             valueType: "string",
 *         },
 *         {
 *             key: "key2",
 *             value: "val2",
 *             valueType: "string",
 *         },
 *     ],
 *     terraformVariableFiles: [
 *         {
 *             repository: "https://github.com/org/repo",
 *             repositoryBranch: "main",
 *             repositoryPath: "tf/gcp/basic",
 *             repositoryConnector: test.id,
 *         },
 *         {
 *             repository: "https://github.com/org/repo",
 *             repositoryCommit: "v1.0.0",
 *             repositoryPath: "tf/aws/basic",
 *             repositoryConnector: test.id,
 *         },
 *         {
 *             repository: "https://github.com/org/repo",
 *             repositorySha: "349d90bb9c90f4a3482981c259080de31609e6f6",
 *             repositoryPath: "tf/aws/basic",
 *             repositoryConnector: test.id,
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import harness:platform/workspace:Workspace example <org_id>/<project_id>/<slo_id>
 * ```
 */
export class Workspace extends pulumi.CustomResource {
    /**
     * Get an existing Workspace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkspaceState, opts?: pulumi.CustomResourceOptions): Workspace {
        return new Workspace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/workspace:Workspace';

    /**
     * Returns true if the given object is an instance of Workspace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Workspace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Workspace.__pulumiType;
    }

    /**
     * Cost estimation enabled determines if cost estimation operations are performed.
     */
    public readonly costEstimationEnabled!: pulumi.Output<boolean>;
    /**
     * Default pipelines associated with this workspace
     */
    public readonly defaultPipelines!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Environment variables configured on the workspace
     */
    public readonly environmentVariables!: pulumi.Output<outputs.platform.WorkspaceEnvironmentVariable[] | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Provider connector is the reference to the connector for the infrastructure provider
     */
    public readonly providerConnector!: pulumi.Output<string>;
    public readonly provisionerType!: pulumi.Output<string>;
    public readonly provisionerVersion!: pulumi.Output<string>;
    /**
     * Repository is the name of the repository to fetch the code from.
     */
    public readonly repository!: pulumi.Output<string>;
    /**
     * Repository branch is the name of the branch to fetch the code from. This cannot be set if repository commit or sha is set.
     */
    public readonly repositoryBranch!: pulumi.Output<string | undefined>;
    /**
     * Repository commit is tag to fetch the code from. This cannot be set if repository branch or sha is set.
     */
    public readonly repositoryCommit!: pulumi.Output<string | undefined>;
    /**
     * Repository connector is the reference to the connector used to fetch the code.
     */
    public readonly repositoryConnector!: pulumi.Output<string>;
    /**
     * Repository path is the path in which the code resides.
     */
    public readonly repositoryPath!: pulumi.Output<string>;
    /**
     * Repository commit is sha to fetch the code from. This cannot be set if repository branch or commit is set.
     */
    public readonly repositorySha!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    public readonly terraformVariableFiles!: pulumi.Output<outputs.platform.WorkspaceTerraformVariableFile[] | undefined>;
    public readonly terraformVariables!: pulumi.Output<outputs.platform.WorkspaceTerraformVariable[] | undefined>;

    /**
     * Create a Workspace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkspaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkspaceArgs | WorkspaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkspaceState | undefined;
            resourceInputs["costEstimationEnabled"] = state ? state.costEstimationEnabled : undefined;
            resourceInputs["defaultPipelines"] = state ? state.defaultPipelines : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["environmentVariables"] = state ? state.environmentVariables : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["providerConnector"] = state ? state.providerConnector : undefined;
            resourceInputs["provisionerType"] = state ? state.provisionerType : undefined;
            resourceInputs["provisionerVersion"] = state ? state.provisionerVersion : undefined;
            resourceInputs["repository"] = state ? state.repository : undefined;
            resourceInputs["repositoryBranch"] = state ? state.repositoryBranch : undefined;
            resourceInputs["repositoryCommit"] = state ? state.repositoryCommit : undefined;
            resourceInputs["repositoryConnector"] = state ? state.repositoryConnector : undefined;
            resourceInputs["repositoryPath"] = state ? state.repositoryPath : undefined;
            resourceInputs["repositorySha"] = state ? state.repositorySha : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["terraformVariableFiles"] = state ? state.terraformVariableFiles : undefined;
            resourceInputs["terraformVariables"] = state ? state.terraformVariables : undefined;
        } else {
            const args = argsOrState as WorkspaceArgs | undefined;
            if ((!args || args.costEstimationEnabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'costEstimationEnabled'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.providerConnector === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerConnector'");
            }
            if ((!args || args.provisionerType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'provisionerType'");
            }
            if ((!args || args.provisionerVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'provisionerVersion'");
            }
            if ((!args || args.repository === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repository'");
            }
            if ((!args || args.repositoryConnector === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repositoryConnector'");
            }
            if ((!args || args.repositoryPath === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repositoryPath'");
            }
            resourceInputs["costEstimationEnabled"] = args ? args.costEstimationEnabled : undefined;
            resourceInputs["defaultPipelines"] = args ? args.defaultPipelines : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["environmentVariables"] = args ? args.environmentVariables : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["providerConnector"] = args ? args.providerConnector : undefined;
            resourceInputs["provisionerType"] = args ? args.provisionerType : undefined;
            resourceInputs["provisionerVersion"] = args ? args.provisionerVersion : undefined;
            resourceInputs["repository"] = args ? args.repository : undefined;
            resourceInputs["repositoryBranch"] = args ? args.repositoryBranch : undefined;
            resourceInputs["repositoryCommit"] = args ? args.repositoryCommit : undefined;
            resourceInputs["repositoryConnector"] = args ? args.repositoryConnector : undefined;
            resourceInputs["repositoryPath"] = args ? args.repositoryPath : undefined;
            resourceInputs["repositorySha"] = args ? args.repositorySha : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["terraformVariableFiles"] = args ? args.terraformVariableFiles : undefined;
            resourceInputs["terraformVariables"] = args ? args.terraformVariables : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Workspace.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Workspace resources.
 */
export interface WorkspaceState {
    /**
     * Cost estimation enabled determines if cost estimation operations are performed.
     */
    costEstimationEnabled?: pulumi.Input<boolean>;
    /**
     * Default pipelines associated with this workspace
     */
    defaultPipelines?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Environment variables configured on the workspace
     */
    environmentVariables?: pulumi.Input<pulumi.Input<inputs.platform.WorkspaceEnvironmentVariable>[]>;
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
    /**
     * Provider connector is the reference to the connector for the infrastructure provider
     */
    providerConnector?: pulumi.Input<string>;
    provisionerType?: pulumi.Input<string>;
    provisionerVersion?: pulumi.Input<string>;
    /**
     * Repository is the name of the repository to fetch the code from.
     */
    repository?: pulumi.Input<string>;
    /**
     * Repository branch is the name of the branch to fetch the code from. This cannot be set if repository commit or sha is set.
     */
    repositoryBranch?: pulumi.Input<string>;
    /**
     * Repository commit is tag to fetch the code from. This cannot be set if repository branch or sha is set.
     */
    repositoryCommit?: pulumi.Input<string>;
    /**
     * Repository connector is the reference to the connector used to fetch the code.
     */
    repositoryConnector?: pulumi.Input<string>;
    /**
     * Repository path is the path in which the code resides.
     */
    repositoryPath?: pulumi.Input<string>;
    /**
     * Repository commit is sha to fetch the code from. This cannot be set if repository branch or commit is set.
     */
    repositorySha?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    terraformVariableFiles?: pulumi.Input<pulumi.Input<inputs.platform.WorkspaceTerraformVariableFile>[]>;
    terraformVariables?: pulumi.Input<pulumi.Input<inputs.platform.WorkspaceTerraformVariable>[]>;
}

/**
 * The set of arguments for constructing a Workspace resource.
 */
export interface WorkspaceArgs {
    /**
     * Cost estimation enabled determines if cost estimation operations are performed.
     */
    costEstimationEnabled: pulumi.Input<boolean>;
    /**
     * Default pipelines associated with this workspace
     */
    defaultPipelines?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Environment variables configured on the workspace
     */
    environmentVariables?: pulumi.Input<pulumi.Input<inputs.platform.WorkspaceEnvironmentVariable>[]>;
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
    orgId: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Provider connector is the reference to the connector for the infrastructure provider
     */
    providerConnector: pulumi.Input<string>;
    provisionerType: pulumi.Input<string>;
    provisionerVersion: pulumi.Input<string>;
    /**
     * Repository is the name of the repository to fetch the code from.
     */
    repository: pulumi.Input<string>;
    /**
     * Repository branch is the name of the branch to fetch the code from. This cannot be set if repository commit or sha is set.
     */
    repositoryBranch?: pulumi.Input<string>;
    /**
     * Repository commit is tag to fetch the code from. This cannot be set if repository branch or sha is set.
     */
    repositoryCommit?: pulumi.Input<string>;
    /**
     * Repository connector is the reference to the connector used to fetch the code.
     */
    repositoryConnector: pulumi.Input<string>;
    /**
     * Repository path is the path in which the code resides.
     */
    repositoryPath: pulumi.Input<string>;
    /**
     * Repository commit is sha to fetch the code from. This cannot be set if repository branch or commit is set.
     */
    repositorySha?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    terraformVariableFiles?: pulumi.Input<pulumi.Input<inputs.platform.WorkspaceTerraformVariableFile>[]>;
    terraformVariables?: pulumi.Input<pulumi.Input<inputs.platform.WorkspaceTerraformVariable>[]>;
}
