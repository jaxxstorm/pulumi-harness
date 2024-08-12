// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Template. Description field is deprecated
 *
 * ## Import
 *
 * Import account level template
 *
 * ```sh
 * $ pulumi import harness:platform/template:Template example <template_id>
 * ```
 *
 * Import org level template
 *
 * ```sh
 * $ pulumi import harness:platform/template:Template example <ord_id>/<template_id>
 * ```
 *
 * Import project level template
 *
 * ```sh
 * $ pulumi import harness:platform/template:Template example <org_id>/<project_id>/<template_id>
 * ```
 */
export class Template extends pulumi.CustomResource {
    /**
     * Get an existing Template resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TemplateState, opts?: pulumi.CustomResourceOptions): Template {
        return new Template(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/template:Template';

    /**
     * Returns true if the given object is an instance of Template.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Template {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Template.__pulumiType;
    }

    /**
     * Specify comment with respect to changes.
     */
    public readonly comments!: pulumi.Output<string | undefined>;
    /**
     * Description of the entity. Description field is deprecated
     *
     * @deprecated description field is deprecated
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable this flag for force deletion of template. It will delete the Harness entity even if your pipelines or other entities reference it
     */
    public readonly forceDelete!: pulumi.Output<string>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    public readonly gitDetails!: pulumi.Output<outputs.platform.TemplateGitDetails>;
    /**
     * Contains Git Information for importing entities from Git
     */
    public readonly gitImportDetails!: pulumi.Output<outputs.platform.TemplateGitImportDetails | undefined>;
    /**
     * Unique identifier of the resource
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Flag to set if importing from Git
     */
    public readonly importFromGit!: pulumi.Output<boolean | undefined>;
    /**
     * True if given version for template to be set as stable.
     */
    public readonly isStable!: pulumi.Output<boolean>;
    /**
     * Name of the Variable
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Organization Identifier for the Entity
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project Identifier for the Entity
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Contains parameters for importing template.
     */
    public readonly templateImportRequest!: pulumi.Output<outputs.platform.TemplateTemplateImportRequest | undefined>;
    /**
     * Yaml for creating new Template. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    public readonly templateYaml!: pulumi.Output<string>;
    /**
     * Version Label for Template.
     */
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a Template resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TemplateArgs | TemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TemplateState | undefined;
            resourceInputs["comments"] = state ? state.comments : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["forceDelete"] = state ? state.forceDelete : undefined;
            resourceInputs["gitDetails"] = state ? state.gitDetails : undefined;
            resourceInputs["gitImportDetails"] = state ? state.gitImportDetails : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["importFromGit"] = state ? state.importFromGit : undefined;
            resourceInputs["isStable"] = state ? state.isStable : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["templateImportRequest"] = state ? state.templateImportRequest : undefined;
            resourceInputs["templateYaml"] = state ? state.templateYaml : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as TemplateArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["comments"] = args ? args.comments : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["forceDelete"] = args ? args.forceDelete : undefined;
            resourceInputs["gitDetails"] = args ? args.gitDetails : undefined;
            resourceInputs["gitImportDetails"] = args ? args.gitImportDetails : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["importFromGit"] = args ? args.importFromGit : undefined;
            resourceInputs["isStable"] = args ? args.isStable : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["templateImportRequest"] = args ? args.templateImportRequest : undefined;
            resourceInputs["templateYaml"] = args ? args.templateYaml : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Template.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Template resources.
 */
export interface TemplateState {
    /**
     * Specify comment with respect to changes.
     */
    comments?: pulumi.Input<string>;
    /**
     * Description of the entity. Description field is deprecated
     *
     * @deprecated description field is deprecated
     */
    description?: pulumi.Input<string>;
    /**
     * Enable this flag for force deletion of template. It will delete the Harness entity even if your pipelines or other entities reference it
     */
    forceDelete?: pulumi.Input<string>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    gitDetails?: pulumi.Input<inputs.platform.TemplateGitDetails>;
    /**
     * Contains Git Information for importing entities from Git
     */
    gitImportDetails?: pulumi.Input<inputs.platform.TemplateGitImportDetails>;
    /**
     * Unique identifier of the resource
     */
    identifier?: pulumi.Input<string>;
    /**
     * Flag to set if importing from Git
     */
    importFromGit?: pulumi.Input<boolean>;
    /**
     * True if given version for template to be set as stable.
     */
    isStable?: pulumi.Input<boolean>;
    /**
     * Name of the Variable
     */
    name?: pulumi.Input<string>;
    /**
     * Organization Identifier for the Entity
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier for the Entity
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Contains parameters for importing template.
     */
    templateImportRequest?: pulumi.Input<inputs.platform.TemplateTemplateImportRequest>;
    /**
     * Yaml for creating new Template. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    templateYaml?: pulumi.Input<string>;
    /**
     * Version Label for Template.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Template resource.
 */
export interface TemplateArgs {
    /**
     * Specify comment with respect to changes.
     */
    comments?: pulumi.Input<string>;
    /**
     * Description of the entity. Description field is deprecated
     *
     * @deprecated description field is deprecated
     */
    description?: pulumi.Input<string>;
    /**
     * Enable this flag for force deletion of template. It will delete the Harness entity even if your pipelines or other entities reference it
     */
    forceDelete?: pulumi.Input<string>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    gitDetails?: pulumi.Input<inputs.platform.TemplateGitDetails>;
    /**
     * Contains Git Information for importing entities from Git
     */
    gitImportDetails?: pulumi.Input<inputs.platform.TemplateGitImportDetails>;
    /**
     * Unique identifier of the resource
     */
    identifier: pulumi.Input<string>;
    /**
     * Flag to set if importing from Git
     */
    importFromGit?: pulumi.Input<boolean>;
    /**
     * True if given version for template to be set as stable.
     */
    isStable?: pulumi.Input<boolean>;
    /**
     * Name of the Variable
     */
    name?: pulumi.Input<string>;
    /**
     * Organization Identifier for the Entity
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier for the Entity
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Contains parameters for importing template.
     */
    templateImportRequest?: pulumi.Input<inputs.platform.TemplateTemplateImportRequest>;
    /**
     * Yaml for creating new Template. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    templateYaml?: pulumi.Input<string>;
    /**
     * Version Label for Template.
     */
    version: pulumi.Input<string>;
}
