// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const ssoTypeSaml = new harness.platform.Usergroup("sso_type_saml", {
 *     identifier: "identifier",
 *     name: "name",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     linkedSsoId: "linked_sso_id",
 *     externallyManaged: false,
 *     users: ["user_id"],
 *     notificationConfigs: [
 *         {
 *             type: "SLACK",
 *             slackWebhookUrl: "https://google.com",
 *         },
 *         {
 *             type: "EMAIL",
 *             groupEmail: "email@email.com",
 *             sendEmailToAllUsers: true,
 *         },
 *         {
 *             type: "MSTEAMS",
 *             microsoftTeamsWebhookUrl: "https://google.com",
 *         },
 *         {
 *             type: "PAGERDUTY",
 *             pagerDutyKey: "pagerDutyKey",
 *         },
 *     ],
 *     linkedSsoDisplayName: "linked_sso_display_name",
 *     ssoGroupId: "sso_group_name",
 *     ssoGroupName: "sso_group_name",
 *     linkedSsoType: "SAML",
 *     ssoLinked: true,
 * });
 * const ssoTypeLdap = new harness.platform.Usergroup("sso_type_ldap", {
 *     identifier: "identifier",
 *     name: "name",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     linkedSsoId: "linked_sso_id",
 *     externallyManaged: false,
 *     users: ["user_id"],
 *     notificationConfigs: [
 *         {
 *             type: "SLACK",
 *             slackWebhookUrl: "https://google.com",
 *         },
 *         {
 *             type: "EMAIL",
 *             groupEmail: "email@email.com",
 *             sendEmailToAllUsers: true,
 *         },
 *         {
 *             type: "MSTEAMS",
 *             microsoftTeamsWebhookUrl: "https://google.com",
 *         },
 *         {
 *             type: "PAGERDUTY",
 *             pagerDutyKey: "pagerDutyKey",
 *         },
 *     ],
 *     linkedSsoDisplayName: "linked_sso_display_name",
 *     ssoGroupId: "sso_group_id",
 *     ssoGroupName: "sso_group_name",
 *     linkedSsoType: "LDAP",
 *     ssoLinked: true,
 * });
 * // Create user group by adding user emails
 * const example = new harness.platform.Usergroup("example", {
 *     identifier: "identifier",
 *     name: "name",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     linkedSsoId: "linked_sso_id",
 *     externallyManaged: false,
 *     userEmails: ["user@email.com"],
 *     notificationConfigs: [
 *         {
 *             type: "SLACK",
 *             slackWebhookUrl: "https://google.com",
 *         },
 *         {
 *             type: "EMAIL",
 *             groupEmail: "email@email.com",
 *             sendEmailToAllUsers: true,
 *         },
 *         {
 *             type: "MSTEAMS",
 *             microsoftTeamsWebhookUrl: "https://google.com",
 *         },
 *         {
 *             type: "PAGERDUTY",
 *             pagerDutyKey: "pagerDutyKey",
 *         },
 *     ],
 *     linkedSsoDisplayName: "linked_sso_display_name",
 *     ssoGroupId: "sso_group_name",
 *     ssoGroupName: "sso_group_name",
 *     linkedSsoType: "SAML",
 *     ssoLinked: true,
 * });
 * ```
 *
 * ## Import
 *
 * Import account level user group
 *
 * ```sh
 * $ pulumi import harness:platform/usergroup:Usergroup example <usergroup_id>
 * ```
 *
 * Import org level user group
 *
 * ```sh
 * $ pulumi import harness:platform/usergroup:Usergroup example <ord_id>/<usergroup_id>
 * ```
 *
 * Import project level user group
 *
 * ```sh
 * $ pulumi import harness:platform/usergroup:Usergroup example <org_id>/<project_id>/<usergroup_id>
 * ```
 */
export class Usergroup extends pulumi.CustomResource {
    /**
     * Get an existing Usergroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UsergroupState, opts?: pulumi.CustomResourceOptions): Usergroup {
        return new Usergroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/usergroup:Usergroup';

    /**
     * Returns true if the given object is an instance of Usergroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Usergroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Usergroup.__pulumiType;
    }

    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the user group is externally managed.
     */
    public readonly externallyManaged!: pulumi.Output<boolean | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the linked SSO.
     */
    public readonly linkedSsoDisplayName!: pulumi.Output<string | undefined>;
    /**
     * The SSO account ID that the user group is linked to.
     */
    public readonly linkedSsoId!: pulumi.Output<string | undefined>;
    /**
     * Type of linked SSO.
     */
    public readonly linkedSsoType!: pulumi.Output<string | undefined>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of notification settings.
     */
    public readonly notificationConfigs!: pulumi.Output<outputs.platform.UsergroupNotificationConfig[] | undefined>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of the userGroup in SSO.
     */
    public readonly ssoGroupId!: pulumi.Output<string | undefined>;
    /**
     * Name of the SSO userGroup.
     */
    public readonly ssoGroupName!: pulumi.Output<string | undefined>;
    /**
     * Whether sso is linked or not.
     */
    public readonly ssoLinked!: pulumi.Output<boolean>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * List of user emails in the UserGroup. Either provide list of users or list of user emails.
     */
    public readonly userEmails!: pulumi.Output<string[] | undefined>;
    /**
     * List of users in the UserGroup. Either provide list of users or list of user emails.
     */
    public readonly users!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Usergroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UsergroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UsergroupArgs | UsergroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UsergroupState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["externallyManaged"] = state ? state.externallyManaged : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["linkedSsoDisplayName"] = state ? state.linkedSsoDisplayName : undefined;
            resourceInputs["linkedSsoId"] = state ? state.linkedSsoId : undefined;
            resourceInputs["linkedSsoType"] = state ? state.linkedSsoType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notificationConfigs"] = state ? state.notificationConfigs : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["ssoGroupId"] = state ? state.ssoGroupId : undefined;
            resourceInputs["ssoGroupName"] = state ? state.ssoGroupName : undefined;
            resourceInputs["ssoLinked"] = state ? state.ssoLinked : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userEmails"] = state ? state.userEmails : undefined;
            resourceInputs["users"] = state ? state.users : undefined;
        } else {
            const args = argsOrState as UsergroupArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["externallyManaged"] = args ? args.externallyManaged : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["linkedSsoDisplayName"] = args ? args.linkedSsoDisplayName : undefined;
            resourceInputs["linkedSsoId"] = args ? args.linkedSsoId : undefined;
            resourceInputs["linkedSsoType"] = args ? args.linkedSsoType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notificationConfigs"] = args ? args.notificationConfigs : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["ssoGroupId"] = args ? args.ssoGroupId : undefined;
            resourceInputs["ssoGroupName"] = args ? args.ssoGroupName : undefined;
            resourceInputs["ssoLinked"] = args ? args.ssoLinked : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userEmails"] = args ? args.userEmails : undefined;
            resourceInputs["users"] = args ? args.users : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Usergroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Usergroup resources.
 */
export interface UsergroupState {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the user group is externally managed.
     */
    externallyManaged?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the linked SSO.
     */
    linkedSsoDisplayName?: pulumi.Input<string>;
    /**
     * The SSO account ID that the user group is linked to.
     */
    linkedSsoId?: pulumi.Input<string>;
    /**
     * Type of linked SSO.
     */
    linkedSsoType?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * List of notification settings.
     */
    notificationConfigs?: pulumi.Input<pulumi.Input<inputs.platform.UsergroupNotificationConfig>[]>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Identifier of the userGroup in SSO.
     */
    ssoGroupId?: pulumi.Input<string>;
    /**
     * Name of the SSO userGroup.
     */
    ssoGroupName?: pulumi.Input<string>;
    /**
     * Whether sso is linked or not.
     */
    ssoLinked?: pulumi.Input<boolean>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of user emails in the UserGroup. Either provide list of users or list of user emails.
     */
    userEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of users in the UserGroup. Either provide list of users or list of user emails.
     */
    users?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Usergroup resource.
 */
export interface UsergroupArgs {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the user group is externally managed.
     */
    externallyManaged?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the linked SSO.
     */
    linkedSsoDisplayName?: pulumi.Input<string>;
    /**
     * The SSO account ID that the user group is linked to.
     */
    linkedSsoId?: pulumi.Input<string>;
    /**
     * Type of linked SSO.
     */
    linkedSsoType?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * List of notification settings.
     */
    notificationConfigs?: pulumi.Input<pulumi.Input<inputs.platform.UsergroupNotificationConfig>[]>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Identifier of the userGroup in SSO.
     */
    ssoGroupId?: pulumi.Input<string>;
    /**
     * Name of the SSO userGroup.
     */
    ssoGroupName?: pulumi.Input<string>;
    /**
     * Whether sso is linked or not.
     */
    ssoLinked?: pulumi.Input<boolean>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of user emails in the UserGroup. Either provide list of users or list of user emails.
     */
    userEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of users in the UserGroup. Either provide list of users or list of user emails.
     */
    users?: pulumi.Input<pulumi.Input<string>[]>;
}
