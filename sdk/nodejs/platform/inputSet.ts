// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness InputSet.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const example = new harness.platform.InputSet("example", {
 *     identifier: "identifier",
 *     tags: ["foo:bar"],
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     pipelineId: "pipeline_id",
 *     yaml: `inputSet:
 *   identifier: "identifier"
 *   name: "name"
 *   tags:
 *     foo: "bar"
 *   orgIdentifier: "org_id"
 *   projectIdentifier: "project_id"
 *   pipeline:
 *     identifier: "pipeline_id"
 *     variables:
 *     - name: "key"
 *       type: "String"
 *       value: "value"
 * `,
 * });
 * // Remote InputSet
 * const test = new harness.platform.InputSet("test", {
 *     identifier: "identifier",
 *     tags: ["foo:bar"],
 *     orgId: harness_platform_organization.test.id,
 *     projectId: harness_platform_project.test.id,
 *     pipelineId: harness_platform_pipeline.test.id,
 *     gitDetails: {
 *         branchName: "main",
 *         commitMessage: "Commit",
 *         filePath: ".harness/file_path.yaml",
 *         connectorRef: "account.connector_ref",
 *         storeType: "REMOTE",
 *         repoName: "repo_name",
 *     },
 *     yaml: `inputSet:
 *   identifier: "identifier"
 *   name: "name"
 *   tags:
 *     foo: "bar"
 *   orgIdentifier: "${harness_platform_organization.test.id}"
 *   projectIdentifier: "${harness_platform_project.test.id}"
 *   pipeline:
 *     identifier: "${harness_platform_pipeline.test.id}"
 *     variables:
 *     - name: "key"
 *       type: "String"
 *       value: "value"
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * Import input set
 *
 * ```sh
 *  $ pulumi import harness:platform/inputSet:InputSet example <org_id>/<project_id>/<pipeline_id>/<input_set_id>
 * ```
 */
export class InputSet extends pulumi.CustomResource {
    /**
     * Get an existing InputSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InputSetState, opts?: pulumi.CustomResourceOptions): InputSet {
        return new InputSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/inputSet:InputSet';

    /**
     * Returns true if the given object is an instance of InputSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InputSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InputSet.__pulumiType;
    }

    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    public readonly gitDetails!: pulumi.Output<outputs.platform.InputSetGitDetails | undefined>;
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
     * Identifier of the pipeline
     */
    public readonly pipelineId!: pulumi.Output<string>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    public readonly yaml!: pulumi.Output<string>;

    /**
     * Create a InputSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InputSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InputSetArgs | InputSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InputSetState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["gitDetails"] = state ? state.gitDetails : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["pipelineId"] = state ? state.pipelineId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["yaml"] = state ? state.yaml : undefined;
        } else {
            const args = argsOrState as InputSetArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.pipelineId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pipelineId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.yaml === undefined) && !opts.urn) {
                throw new Error("Missing required property 'yaml'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["gitDetails"] = args ? args.gitDetails : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["pipelineId"] = args ? args.pipelineId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["yaml"] = args ? args.yaml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InputSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InputSet resources.
 */
export interface InputSetState {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    gitDetails?: pulumi.Input<inputs.platform.InputSetGitDetails>;
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
     * Identifier of the pipeline
     */
    pipelineId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    yaml?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InputSet resource.
 */
export interface InputSetArgs {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    gitDetails?: pulumi.Input<inputs.platform.InputSetGitDetails>;
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
     * Identifier of the pipeline
     */
    pipelineId: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    yaml: pulumi.Input<string>;
}
