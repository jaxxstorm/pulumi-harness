// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for creating roles.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const example = new harness.platform.Roles("example", {
 *     allowedScopeLevels: ["account"],
 *     description: "test",
 *     identifier: "identifier",
 *     permissions: ["core_resourcegroup_view"],
 *     tags: ["foo:bar"],
 * });
 * ```
 *
 * ## Import
 *
 * Import account level roles
 *
 * ```sh
 *  $ pulumi import harness:platform/roles:Roles example <roles_id>
 * ```
 *
 *  Import org level roles
 *
 * ```sh
 *  $ pulumi import harness:platform/roles:Roles example <ord_id>/<roles_id>
 * ```
 *
 *  Import project level roles
 *
 * ```sh
 *  $ pulumi import harness:platform/roles:Roles example <org_id>/<project_id>/<roles_id>
 * ```
 */
export class Roles extends pulumi.CustomResource {
    /**
     * Get an existing Roles resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RolesState, opts?: pulumi.CustomResourceOptions): Roles {
        return new Roles(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/roles:Roles';

    /**
     * Returns true if the given object is an instance of Roles.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Roles {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Roles.__pulumiType;
    }

    /**
     * The scope levels at which this role can be used
     */
    public readonly allowedScopeLevels!: pulumi.Output<string[]>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
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
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * List of the permission identifiers
     */
    public readonly permissions!: pulumi.Output<string[] | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Roles resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RolesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RolesArgs | RolesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RolesState | undefined;
            resourceInputs["allowedScopeLevels"] = state ? state.allowedScopeLevels : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as RolesArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["allowedScopeLevels"] = args ? args.allowedScopeLevels : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["permissions"] = args ? args.permissions : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Roles.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Roles resources.
 */
export interface RolesState {
    /**
     * The scope levels at which this role can be used
     */
    allowedScopeLevels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
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
     * List of the permission identifiers
     */
    permissions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Roles resource.
 */
export interface RolesArgs {
    /**
     * The scope levels at which this role can be used
     */
    allowedScopeLevels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
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
     * List of the permission identifiers
     */
    permissions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
