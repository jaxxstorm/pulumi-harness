// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetRuleArgs, GetRuleResult, GetRuleOutputArgs } from "./getRule";
export const getRule: typeof import("./getRule").getRule = null as any;
export const getRuleOutput: typeof import("./getRule").getRuleOutput = null as any;
utilities.lazyLoad(exports, ["getRule","getRuleOutput"], () => require("./getRule"));

export { GetRuleEnforcementArgs, GetRuleEnforcementResult, GetRuleEnforcementOutputArgs } from "./getRuleEnforcement";
export const getRuleEnforcement: typeof import("./getRuleEnforcement").getRuleEnforcement = null as any;
export const getRuleEnforcementOutput: typeof import("./getRuleEnforcement").getRuleEnforcementOutput = null as any;
utilities.lazyLoad(exports, ["getRuleEnforcement","getRuleEnforcementOutput"], () => require("./getRuleEnforcement"));

export { RuleArgs, RuleState } from "./rule";
export type Rule = import("./rule").Rule;
export const Rule: typeof import("./rule").Rule = null as any;
utilities.lazyLoad(exports, ["Rule"], () => require("./rule"));

export { RuleEnforcementArgs, RuleEnforcementState } from "./ruleEnforcement";
export type RuleEnforcement = import("./ruleEnforcement").RuleEnforcement;
export const RuleEnforcement: typeof import("./ruleEnforcement").RuleEnforcement = null as any;
utilities.lazyLoad(exports, ["RuleEnforcement"], () => require("./ruleEnforcement"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "harness:governance/rule:Rule":
                return new Rule(name, <any>undefined, { urn })
            case "harness:governance/ruleEnforcement:RuleEnforcement":
                return new RuleEnforcement(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("harness", "governance/rule", _module)
pulumi.runtime.registerResourceModule("harness", "governance/ruleEnforcement", _module)
