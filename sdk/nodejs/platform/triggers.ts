// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const example = new harness.platform.Triggers("example", {
 *     identifier: "identifier",
 *     orgId: "orgIdentifer",
 *     projectId: "projectIdentifier",
 *     targetId: "pipelineIdentifier",
 *     yaml: `  trigger:
 *     name: name
 *     identifier: identifier
 *     enabled: true
 *     description: ""
 *     tags: {}
 *     projectIdentifier: projectIdentifier
 *     orgIdentifier: orgIdentifer
 *     pipelineIdentifier: pipelineIdentifier
 *     source:
 *       type: Webhook
 *       spec:
 *         type: Github
 *         spec:
 *           type: Push
 *           spec:
 *             connectorRef: account.TestAccResourceConnectorGithub_Ssh_IZBeG
 *             autoAbortPreviousExecutions: false
 *             payloadConditions:
 *             - key: changedFiles
 *               operator: Equals
 *               value: value
 *             - key: targetBranch
 *               operator: Equals
 *               value: value
 *             headerConditions: []
 *             repoName: repoName
 *             actions: []
 *     inputYaml: |
 *       pipeline: {}\\n
 *
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * Import trigger
 *
 * ```sh
 *  $ pulumi import harness:platform/triggers:Triggers example <org_id>/<project_id>/<target_id>/<triggers_id>
 * ```
 */
export class Triggers extends pulumi.CustomResource {
    /**
     * Get an existing Triggers resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TriggersState, opts?: pulumi.CustomResourceOptions): Triggers {
        return new Triggers(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/triggers:Triggers';

    /**
     * Returns true if the given object is an instance of Triggers.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Triggers {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Triggers.__pulumiType;
    }

    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * if-Match
     */
    public readonly ifMatch!: pulumi.Output<string | undefined>;
    /**
     * ignore error default false
     */
    public readonly ignoreError!: pulumi.Output<boolean | undefined>;
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
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Identifier of the target pipeline
     */
    public readonly targetId!: pulumi.Output<string>;
    /**
     * trigger yaml. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    public readonly yaml!: pulumi.Output<string>;

    /**
     * Create a Triggers resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TriggersArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TriggersArgs | TriggersState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TriggersState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["ifMatch"] = state ? state.ifMatch : undefined;
            resourceInputs["ignoreError"] = state ? state.ignoreError : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["targetId"] = state ? state.targetId : undefined;
            resourceInputs["yaml"] = state ? state.yaml : undefined;
        } else {
            const args = argsOrState as TriggersArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.targetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetId'");
            }
            if ((!args || args.yaml === undefined) && !opts.urn) {
                throw new Error("Missing required property 'yaml'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["ifMatch"] = args ? args.ifMatch : undefined;
            resourceInputs["ignoreError"] = args ? args.ignoreError : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetId"] = args ? args.targetId : undefined;
            resourceInputs["yaml"] = args ? args.yaml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Triggers.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Triggers resources.
 */
export interface TriggersState {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * if-Match
     */
    ifMatch?: pulumi.Input<string>;
    /**
     * ignore error default false
     */
    ignoreError?: pulumi.Input<boolean>;
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
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Identifier of the target pipeline
     */
    targetId?: pulumi.Input<string>;
    /**
     * trigger yaml. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    yaml?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Triggers resource.
 */
export interface TriggersArgs {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * if-Match
     */
    ifMatch?: pulumi.Input<string>;
    /**
     * ignore error default false
     */
    ignoreError?: pulumi.Input<boolean>;
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
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Identifier of the target pipeline
     */
    targetId: pulumi.Input<string>;
    /**
     * trigger yaml. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    yaml: pulumi.Input<string>;
}
