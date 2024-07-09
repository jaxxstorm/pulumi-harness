// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness environment group.
 *
 * ## Example to create Environment Group at different levels (Org, Project, Account)
 *
 * ### Account Level
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.EnvironmentGroup("example", {
 *     identifier: "identifier",
 *     color: "#0063F7",
 *     yaml: `environmentGroup:
 *   name: "name"
 *   identifier: "identifier"
 *   description: "temp"
 *   envIdentifiers: []
 * `,
 * });
 * ```
 *
 * ### Org Level
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.EnvironmentGroup("example", {
 *     identifier: "identifier",
 *     orgId: "orgIdentifer",
 *     color: "#0063F7",
 *     yaml: `environmentGroup:
 *   name: "name"
 *   identifier: "identifier"
 *   description: "temp"
 *   orgIdentifier: "orgIdentifer"
 *   envIdentifiers: []
 * `,
 * });
 * ```
 *
 * ### Project Level
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.EnvironmentGroup("example", {
 *     identifier: "identifier",
 *     orgId: "orgIdentifer",
 *     projectId: "projectIdentifier",
 *     color: "#0063F7",
 *     yaml: `environmentGroup:
 *   name: "name"
 *   identifier: "identifier"
 *   description: "temp"
 *   orgIdentifier: "orgIdentifer"
 *   projectIdentifier: "projectIdentifier"
 *   envIdentifiers: []
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * Import account level environment group.
 *
 * ```sh
 * $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <environment_group_id>
 * ```
 *
 * Import org level environment group.
 *
 * ```sh
 * $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <org_id>/<environment_group_id>
 * ```
 *
 * Import project level environment group.
 *
 * ```sh
 * $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <org_id>/<project_id>/<environment_group_id>
 * ```
 */
export class EnvironmentGroup extends pulumi.CustomResource {
    /**
     * Get an existing EnvironmentGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentGroupState, opts?: pulumi.CustomResourceOptions): EnvironmentGroup {
        return new EnvironmentGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/environmentGroup:EnvironmentGroup';

    /**
     * Returns true if the given object is an instance of EnvironmentGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EnvironmentGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EnvironmentGroup.__pulumiType;
    }

    /**
     * Color of the environment group.
     */
    public readonly color!: pulumi.Output<string>;
    /**
     * Enable this flag for force deletion of environment group
     */
    public readonly forceDelete!: pulumi.Output<string>;
    /**
     * identifier of the environment group.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * org_id of the environment group.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * project_id of the environment group.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
     * org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
     * For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
     * connectorRef: org.connectorId.
     */
    public readonly yaml!: pulumi.Output<string>;

    /**
     * Create a EnvironmentGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentGroupArgs | EnvironmentGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentGroupState | undefined;
            resourceInputs["color"] = state ? state.color : undefined;
            resourceInputs["forceDelete"] = state ? state.forceDelete : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["yaml"] = state ? state.yaml : undefined;
        } else {
            const args = argsOrState as EnvironmentGroupArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.yaml === undefined) && !opts.urn) {
                throw new Error("Missing required property 'yaml'");
            }
            resourceInputs["color"] = args ? args.color : undefined;
            resourceInputs["forceDelete"] = args ? args.forceDelete : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["yaml"] = args ? args.yaml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EnvironmentGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EnvironmentGroup resources.
 */
export interface EnvironmentGroupState {
    /**
     * Color of the environment group.
     */
    color?: pulumi.Input<string>;
    /**
     * Enable this flag for force deletion of environment group
     */
    forceDelete?: pulumi.Input<string>;
    /**
     * identifier of the environment group.
     */
    identifier?: pulumi.Input<string>;
    /**
     * org_id of the environment group.
     */
    orgId?: pulumi.Input<string>;
    /**
     * project_id of the environment group.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
     * org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
     * For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
     * connectorRef: org.connectorId.
     */
    yaml?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnvironmentGroup resource.
 */
export interface EnvironmentGroupArgs {
    /**
     * Color of the environment group.
     */
    color?: pulumi.Input<string>;
    /**
     * Enable this flag for force deletion of environment group
     */
    forceDelete?: pulumi.Input<string>;
    /**
     * identifier of the environment group.
     */
    identifier: pulumi.Input<string>;
    /**
     * org_id of the environment group.
     */
    orgId?: pulumi.Input<string>;
    /**
     * project_id of the environment group.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
     * org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
     * For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
     * connectorRef: org.connectorId.
     */
    yaml: pulumi.Input<string>;
}
