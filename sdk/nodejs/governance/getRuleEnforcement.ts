// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Datasource for looking up a rule enforcement.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.governance.getRuleEnforcement({
 *     enforcementId: "enforcement_id",
 * });
 * ```
 */
export function getRuleEnforcement(args: GetRuleEnforcementArgs, opts?: pulumi.InvokeOptions): Promise<GetRuleEnforcementResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:governance/getRuleEnforcement:getRuleEnforcement", {
        "enforcementId": args.enforcementId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRuleEnforcement.
 */
export interface GetRuleEnforcementArgs {
    /**
     * Id of rule enforcement.
     */
    enforcementId: string;
}

/**
 * A collection of values returned by getRuleEnforcement.
 */
export interface GetRuleEnforcementResult {
    /**
     * The cloud provider for the rule enforcement.
     */
    readonly cloudProvider: string;
    /**
     * Description for rule enforcement.
     */
    readonly description: string;
    /**
     * Id of rule enforcement.
     */
    readonly enforcementId: string;
    /**
     * Execution schedule in cron format.
     */
    readonly executionSchedule: string;
    /**
     * Timezone for the execution schedule.
     */
    readonly executionTimezone: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Indicates if the rule enforcement is a dry run.
     */
    readonly isDryRun: boolean;
    /**
     * Indicates if the rule enforcement is enabled.
     */
    readonly isEnabled: boolean;
    /**
     * Name of the rule enforcement.
     */
    readonly name: string;
    /**
     * List of rule IDs.
     */
    readonly ruleIds: {[key: string]: string};
    /**
     * List of rule set IDs.
     */
    readonly ruleSetIds: {[key: string]: string};
    /**
     * List of target accounts.
     */
    readonly targetAccounts: string[];
    /**
     * List of target regions.
     */
    readonly targetRegions: string[];
}
/**
 * Datasource for looking up a rule enforcement.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.governance.getRuleEnforcement({
 *     enforcementId: "enforcement_id",
 * });
 * ```
 */
export function getRuleEnforcementOutput(args: GetRuleEnforcementOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRuleEnforcementResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:governance/getRuleEnforcement:getRuleEnforcement", {
        "enforcementId": args.enforcementId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRuleEnforcement.
 */
export interface GetRuleEnforcementOutputArgs {
    /**
     * Id of rule enforcement.
     */
    enforcementId: pulumi.Input<string>;
}