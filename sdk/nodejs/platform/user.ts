// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness User. This requires your authentication mechanism to be set to SAML, LDAP, or OAuth, and the feature flag AUTO_ACCEPT_SAML_ACCOUNT_INVITES to be enabled.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * // Create user at account level
 * const example = new harness.platform.User("example", {
 *     email: "john.doe@harness.io",
 *     roleBindings: [{
 *         managedRole: true,
 *         resourceGroupIdentifier: "_all_project_level_resources",
 *         resourceGroupName: "All Project Level Resources",
 *         roleIdentifier: "_project_viewer",
 *         roleName: "Project Viewer",
 *     }],
 *     userGroups: ["_project_all_users"],
 * });
 * ```
 *
 * ## Import
 *
 * Import account level
 *
 * ```sh
 *  $ pulumi import harness:platform/user:User john_doe <email_id>
 * ```
 *
 *  Import org level
 *
 * ```sh
 *  $ pulumi import harness:platform/user:User john_doe <email_id>/<org_id>
 * ```
 *
 *  Import project level
 *
 * ```sh
 *  $ pulumi import harness:platform/user:User john_doe <email_id>/<org_id>/<project_id>
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * Whether or not the user account is disabled.
     */
    public /*out*/ readonly disabled!: pulumi.Output<boolean>;
    /**
     * The email of the user.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * Whether or not the user account is externally managed.
     */
    public /*out*/ readonly externallyManaged!: pulumi.Output<boolean>;
    /**
     * Unique identifier of the user.
     */
    public /*out*/ readonly identifier!: pulumi.Output<string>;
    /**
     * Whether or not the user account is locked.
     */
    public /*out*/ readonly locked!: pulumi.Output<boolean>;
    /**
     * Name of the user.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Organization identifier of the user.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project identifier of the user.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Role Bindings of the user. Cannot be updated.
     */
    public readonly roleBindings!: pulumi.Output<outputs.platform.UserRoleBinding[] | undefined>;
    /**
     * The user group of the user. Cannot be updated.
     */
    public readonly userGroups!: pulumi.Output<string[]>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["externallyManaged"] = state ? state.externallyManaged : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["locked"] = state ? state.locked : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["roleBindings"] = state ? state.roleBindings : undefined;
            resourceInputs["userGroups"] = state ? state.userGroups : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            if ((!args || args.userGroups === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userGroups'");
            }
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["roleBindings"] = args ? args.roleBindings : undefined;
            resourceInputs["userGroups"] = args ? args.userGroups : undefined;
            resourceInputs["disabled"] = undefined /*out*/;
            resourceInputs["externallyManaged"] = undefined /*out*/;
            resourceInputs["identifier"] = undefined /*out*/;
            resourceInputs["locked"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * Whether or not the user account is disabled.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The email of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * Whether or not the user account is externally managed.
     */
    externallyManaged?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the user.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Whether or not the user account is locked.
     */
    locked?: pulumi.Input<boolean>;
    /**
     * Name of the user.
     */
    name?: pulumi.Input<string>;
    /**
     * Organization identifier of the user.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the user.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Role Bindings of the user. Cannot be updated.
     */
    roleBindings?: pulumi.Input<pulumi.Input<inputs.platform.UserRoleBinding>[]>;
    /**
     * The user group of the user. Cannot be updated.
     */
    userGroups?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The email of the user.
     */
    email: pulumi.Input<string>;
    /**
     * Organization identifier of the user.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the user.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Role Bindings of the user. Cannot be updated.
     */
    roleBindings?: pulumi.Input<pulumi.Input<inputs.platform.UserRoleBinding>[]>;
    /**
     * The user group of the user. Cannot be updated.
     */
    userGroups: pulumi.Input<pulumi.Input<string>[]>;
}
