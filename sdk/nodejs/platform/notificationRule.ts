// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Notification Rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * // Sample resource for SLO
 * const example = new harness.platform.NotificationRule("example", {
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     identifier: "identifier",
 *     request: {
 *         name: "name",
 *         notificationMethod: {
 *             type: "Slack",
 *             spec: JSON.stringify({
 *                 webhook_url: "http://myslackwebhookurl.com",
 *                 user_groups: ["account.test"],
 *             }),
 *         },
 *         type: "ServiceLevelObjective",
 *         conditions: [
 *             {
 *                 type: "ErrorBudgetBurnRate",
 *                 spec: JSON.stringify({
 *                     threshold: 1,
 *                 }),
 *             },
 *             {
 *                 type: "ErrorBudgetRemainingPercentage",
 *                 spec: JSON.stringify({
 *                     threshold: 30,
 *                 }),
 *             },
 *             {
 *                 type: "ErrorBudgetRemainingMinutes",
 *                 spec: JSON.stringify({
 *                     threshold: 300,
 *                 }),
 *             },
 *         ],
 *     },
 * });
 * // Sample resource for Monitored Service
 * const example1 = new harness.platform.NotificationRule("example1", {
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     identifier: "identifier",
 *     request: {
 *         name: "name",
 *         notificationMethod: {
 *             type: "Slack",
 *             spec: JSON.stringify({
 *                 webhook_url: "http://myslackwebhookurl.com",
 *                 user_groups: ["account.test"],
 *             }),
 *         },
 *         type: "MonitoredService",
 *         conditions: [
 *             {
 *                 type: "ChangeImpact",
 *                 spec: JSON.stringify({
 *                     threshold: 33,
 *                     period: "30m",
 *                     changeCategories: [
 *                         "Deployment",
 *                         "Infrastructure",
 *                     ],
 *                 }),
 *             },
 *             {
 *                 type: "HealthScore",
 *                 spec: JSON.stringify({
 *                     threshold: 33,
 *                     period: "30m",
 *                 }),
 *             },
 *             {
 *                 type: "ChangeObserved",
 *                 spec: JSON.stringify({
 *                     changeCategories: [
 *                         "Deployment",
 *                         "Alert",
 *                         "ChaosExperiment",
 *                     ],
 *                 }),
 *             },
 *             {
 *                 type: "DeploymentImpactReport",
 *                 spec: JSON.stringify({}),
 *             },
 *         ],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Import account level Notification Rule
 *
 * ```sh
 * $ pulumi import harness:platform/notificationRule:NotificationRule example <notification_rule_id>
 * ```
 *
 * Import organization level Notification Rule
 *
 * ```sh
 * $ pulumi import harness:platform/notificationRule:NotificationRule example <org_id>/<notification_rule_id>
 * ```
 *
 * Import project level Notification Rule
 *
 * ```sh
 * $ pulumi import harness:platform/notificationRule:NotificationRule example <org_id>/<project_id>/<notification_rule_id>
 * ```
 */
export class NotificationRule extends pulumi.CustomResource {
    /**
     * Get an existing NotificationRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotificationRuleState, opts?: pulumi.CustomResourceOptions): NotificationRule {
        return new NotificationRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/notificationRule:NotificationRule';

    /**
     * Returns true if the given object is an instance of NotificationRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NotificationRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NotificationRule.__pulumiType;
    }

    /**
     * Identifier of the Notification Rule.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Identifier of the organization in which the Notification Rule is configured.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Identifier of the project in which the Notification Rule is configured.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Request for creating or updating Notification Rule.
     */
    public readonly request!: pulumi.Output<outputs.platform.NotificationRuleRequest | undefined>;

    /**
     * Create a NotificationRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotificationRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NotificationRuleArgs | NotificationRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NotificationRuleState | undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["request"] = state ? state.request : undefined;
        } else {
            const args = argsOrState as NotificationRuleArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["request"] = args ? args.request : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NotificationRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NotificationRule resources.
 */
export interface NotificationRuleState {
    /**
     * Identifier of the Notification Rule.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Identifier of the organization in which the Notification Rule is configured.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Identifier of the project in which the Notification Rule is configured.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Request for creating or updating Notification Rule.
     */
    request?: pulumi.Input<inputs.platform.NotificationRuleRequest>;
}

/**
 * The set of arguments for constructing a NotificationRule resource.
 */
export interface NotificationRuleArgs {
    /**
     * Identifier of the Notification Rule.
     */
    identifier: pulumi.Input<string>;
    /**
     * Identifier of the organization in which the Notification Rule is configured.
     */
    orgId: pulumi.Input<string>;
    /**
     * Identifier of the project in which the Notification Rule is configured.
     */
    projectId: pulumi.Input<string>;
    /**
     * Request for creating or updating Notification Rule.
     */
    request?: pulumi.Input<inputs.platform.NotificationRuleRequest>;
}
