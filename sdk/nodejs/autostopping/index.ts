// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AwsAlbArgs, AwsAlbState } from "./awsAlb";
export type AwsAlb = import("./awsAlb").AwsAlb;
export const AwsAlb: typeof import("./awsAlb").AwsAlb = null as any;
utilities.lazyLoad(exports, ["AwsAlb"], () => require("./awsAlb"));

export { AwsProxyArgs, AwsProxyState } from "./awsProxy";
export type AwsProxy = import("./awsProxy").AwsProxy;
export const AwsProxy: typeof import("./awsProxy").AwsProxy = null as any;
utilities.lazyLoad(exports, ["AwsProxy"], () => require("./awsProxy"));

export { AzureGatewayArgs, AzureGatewayState } from "./azureGateway";
export type AzureGateway = import("./azureGateway").AzureGateway;
export const AzureGateway: typeof import("./azureGateway").AzureGateway = null as any;
utilities.lazyLoad(exports, ["AzureGateway"], () => require("./azureGateway"));

export { AzureProxyArgs, AzureProxyState } from "./azureProxy";
export type AzureProxy = import("./azureProxy").AzureProxy;
export const AzureProxy: typeof import("./azureProxy").AzureProxy = null as any;
utilities.lazyLoad(exports, ["AzureProxy"], () => require("./azureProxy"));

export { GcpProxyArgs, GcpProxyState } from "./gcpProxy";
export type GcpProxy = import("./gcpProxy").GcpProxy;
export const GcpProxy: typeof import("./gcpProxy").GcpProxy = null as any;
utilities.lazyLoad(exports, ["GcpProxy"], () => require("./gcpProxy"));

export { GetAwsAlbArgs, GetAwsAlbResult, GetAwsAlbOutputArgs } from "./getAwsAlb";
export const getAwsAlb: typeof import("./getAwsAlb").getAwsAlb = null as any;
export const getAwsAlbOutput: typeof import("./getAwsAlb").getAwsAlbOutput = null as any;
utilities.lazyLoad(exports, ["getAwsAlb","getAwsAlbOutput"], () => require("./getAwsAlb"));

export { GetAwsProxyArgs, GetAwsProxyResult, GetAwsProxyOutputArgs } from "./getAwsProxy";
export const getAwsProxy: typeof import("./getAwsProxy").getAwsProxy = null as any;
export const getAwsProxyOutput: typeof import("./getAwsProxy").getAwsProxyOutput = null as any;
utilities.lazyLoad(exports, ["getAwsProxy","getAwsProxyOutput"], () => require("./getAwsProxy"));

export { GetAzureGatewayArgs, GetAzureGatewayResult, GetAzureGatewayOutputArgs } from "./getAzureGateway";
export const getAzureGateway: typeof import("./getAzureGateway").getAzureGateway = null as any;
export const getAzureGatewayOutput: typeof import("./getAzureGateway").getAzureGatewayOutput = null as any;
utilities.lazyLoad(exports, ["getAzureGateway","getAzureGatewayOutput"], () => require("./getAzureGateway"));

export { GetAzureProxyArgs, GetAzureProxyResult, GetAzureProxyOutputArgs } from "./getAzureProxy";
export const getAzureProxy: typeof import("./getAzureProxy").getAzureProxy = null as any;
export const getAzureProxyOutput: typeof import("./getAzureProxy").getAzureProxyOutput = null as any;
utilities.lazyLoad(exports, ["getAzureProxy","getAzureProxyOutput"], () => require("./getAzureProxy"));

export { GetGcpProxyArgs, GetGcpProxyResult, GetGcpProxyOutputArgs } from "./getGcpProxy";
export const getGcpProxy: typeof import("./getGcpProxy").getGcpProxy = null as any;
export const getGcpProxyOutput: typeof import("./getGcpProxy").getGcpProxyOutput = null as any;
utilities.lazyLoad(exports, ["getGcpProxy","getGcpProxyOutput"], () => require("./getGcpProxy"));

export { GetRuleEcsArgs, GetRuleEcsResult, GetRuleEcsOutputArgs } from "./getRuleEcs";
export const getRuleEcs: typeof import("./getRuleEcs").getRuleEcs = null as any;
export const getRuleEcsOutput: typeof import("./getRuleEcs").getRuleEcsOutput = null as any;
utilities.lazyLoad(exports, ["getRuleEcs","getRuleEcsOutput"], () => require("./getRuleEcs"));

export { GetRuleRdsArgs, GetRuleRdsResult, GetRuleRdsOutputArgs } from "./getRuleRds";
export const getRuleRds: typeof import("./getRuleRds").getRuleRds = null as any;
export const getRuleRdsOutput: typeof import("./getRuleRds").getRuleRdsOutput = null as any;
utilities.lazyLoad(exports, ["getRuleRds","getRuleRdsOutput"], () => require("./getRuleRds"));

export { GetRuleVmArgs, GetRuleVmResult, GetRuleVmOutputArgs } from "./getRuleVm";
export const getRuleVm: typeof import("./getRuleVm").getRuleVm = null as any;
export const getRuleVmOutput: typeof import("./getRuleVm").getRuleVmOutput = null as any;
utilities.lazyLoad(exports, ["getRuleVm","getRuleVmOutput"], () => require("./getRuleVm"));

export { GetScheduleArgs, GetScheduleResult, GetScheduleOutputArgs } from "./getSchedule";
export const getSchedule: typeof import("./getSchedule").getSchedule = null as any;
export const getScheduleOutput: typeof import("./getSchedule").getScheduleOutput = null as any;
utilities.lazyLoad(exports, ["getSchedule","getScheduleOutput"], () => require("./getSchedule"));

export { RuleEcsArgs, RuleEcsState } from "./ruleEcs";
export type RuleEcs = import("./ruleEcs").RuleEcs;
export const RuleEcs: typeof import("./ruleEcs").RuleEcs = null as any;
utilities.lazyLoad(exports, ["RuleEcs"], () => require("./ruleEcs"));

export { RuleRdsArgs, RuleRdsState } from "./ruleRds";
export type RuleRds = import("./ruleRds").RuleRds;
export const RuleRds: typeof import("./ruleRds").RuleRds = null as any;
utilities.lazyLoad(exports, ["RuleRds"], () => require("./ruleRds"));

export { RuleVmArgs, RuleVmState } from "./ruleVm";
export type RuleVm = import("./ruleVm").RuleVm;
export const RuleVm: typeof import("./ruleVm").RuleVm = null as any;
utilities.lazyLoad(exports, ["RuleVm"], () => require("./ruleVm"));

export { ScheduleArgs, ScheduleState } from "./schedule";
export type Schedule = import("./schedule").Schedule;
export const Schedule: typeof import("./schedule").Schedule = null as any;
utilities.lazyLoad(exports, ["Schedule"], () => require("./schedule"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "harness:autostopping/awsAlb:AwsAlb":
                return new AwsAlb(name, <any>undefined, { urn })
            case "harness:autostopping/awsProxy:AwsProxy":
                return new AwsProxy(name, <any>undefined, { urn })
            case "harness:autostopping/azureGateway:AzureGateway":
                return new AzureGateway(name, <any>undefined, { urn })
            case "harness:autostopping/azureProxy:AzureProxy":
                return new AzureProxy(name, <any>undefined, { urn })
            case "harness:autostopping/gcpProxy:GcpProxy":
                return new GcpProxy(name, <any>undefined, { urn })
            case "harness:autostopping/ruleEcs:RuleEcs":
                return new RuleEcs(name, <any>undefined, { urn })
            case "harness:autostopping/ruleRds:RuleRds":
                return new RuleRds(name, <any>undefined, { urn })
            case "harness:autostopping/ruleVm:RuleVm":
                return new RuleVm(name, <any>undefined, { urn })
            case "harness:autostopping/schedule:Schedule":
                return new Schedule(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("harness", "autostopping/awsAlb", _module)
pulumi.runtime.registerResourceModule("harness", "autostopping/awsProxy", _module)
pulumi.runtime.registerResourceModule("harness", "autostopping/azureGateway", _module)
pulumi.runtime.registerResourceModule("harness", "autostopping/azureProxy", _module)
pulumi.runtime.registerResourceModule("harness", "autostopping/gcpProxy", _module)
pulumi.runtime.registerResourceModule("harness", "autostopping/ruleEcs", _module)
pulumi.runtime.registerResourceModule("harness", "autostopping/ruleRds", _module)
pulumi.runtime.registerResourceModule("harness", "autostopping/ruleVm", _module)
pulumi.runtime.registerResourceModule("harness", "autostopping/schedule", _module)