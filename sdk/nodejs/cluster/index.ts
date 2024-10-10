// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetOrchestratorArgs, GetOrchestratorResult, GetOrchestratorOutputArgs } from "./getOrchestrator";
export const getOrchestrator: typeof import("./getOrchestrator").getOrchestrator = null as any;
export const getOrchestratorOutput: typeof import("./getOrchestrator").getOrchestratorOutput = null as any;
utilities.lazyLoad(exports, ["getOrchestrator","getOrchestratorOutput"], () => require("./getOrchestrator"));

export { OrchestratorArgs, OrchestratorState } from "./orchestrator";
export type Orchestrator = import("./orchestrator").Orchestrator;
export const Orchestrator: typeof import("./orchestrator").Orchestrator = null as any;
utilities.lazyLoad(exports, ["Orchestrator"], () => require("./orchestrator"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "harness:cluster/orchestrator:Orchestrator":
                return new Orchestrator(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("harness", "cluster/orchestrator", _module)
