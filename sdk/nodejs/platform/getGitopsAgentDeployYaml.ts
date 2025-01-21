// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for fetching a Harness Gitops Agent deployment manifest YAML.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitopsAgentDeployYaml({
 *     identifier: "identifier",
 *     accountId: "account_id",
 *     projectId: "project_id",
 *     orgId: "org_id",
 *     namespace: "namespace",
 * });
 * ```
 */
export function getGitopsAgentDeployYaml(args: GetGitopsAgentDeployYamlArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsAgentDeployYamlResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsAgentDeployYaml:getGitopsAgentDeployYaml", {
        "accountId": args.accountId,
        "caData": args.caData,
        "identifier": args.identifier,
        "namespace": args.namespace,
        "orgId": args.orgId,
        "privateKey": args.privateKey,
        "projectId": args.projectId,
        "proxies": args.proxies,
        "skipCrds": args.skipCrds,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsAgentDeployYaml.
 */
export interface GetGitopsAgentDeployYamlArgs {
    /**
     * Account identifier of the GitOps agent.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: string;
    /**
     * CA data of the GitOps agent, base64 encoded content of ca chain.
     */
    caData?: string;
    /**
     * Identifier of the GitOps agent.
     */
    identifier: string;
    /**
     * The kubernetes namespace where the agent is installed.
     */
    namespace: string;
    /**
     * Organization identifier of the GitOps agent.
     */
    orgId?: string;
    /**
     * Private key for the GitOps agent. If provided authentication token will not be regenerated. Must be base64 encoded.
     */
    privateKey?: string;
    /**
     * Project identifier of the GitOps agent.
     */
    projectId?: string;
    /**
     * Proxy settings for the GitOps agent.
     */
    proxies?: inputs.platform.GetGitopsAgentDeployYamlProxy[];
    /**
     * Skip CRDs for the GitOps agent.
     */
    skipCrds?: boolean;
}

/**
 * A collection of values returned by getGitopsAgentDeployYaml.
 */
export interface GetGitopsAgentDeployYamlResult {
    /**
     * Account identifier of the GitOps agent.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    readonly accountId: string;
    /**
     * CA data of the GitOps agent, base64 encoded content of ca chain.
     */
    readonly caData?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the GitOps agent.
     */
    readonly identifier: string;
    /**
     * The kubernetes namespace where the agent is installed.
     */
    readonly namespace: string;
    /**
     * Organization identifier of the GitOps agent.
     */
    readonly orgId?: string;
    /**
     * Private key for the GitOps agent. If provided authentication token will not be regenerated. Must be base64 encoded.
     */
    readonly privateKey?: string;
    /**
     * Project identifier of the GitOps agent.
     */
    readonly projectId?: string;
    /**
     * Proxy settings for the GitOps agent.
     */
    readonly proxies?: outputs.platform.GetGitopsAgentDeployYamlProxy[];
    /**
     * Skip CRDs for the GitOps agent.
     */
    readonly skipCrds?: boolean;
    /**
     * The deployment manifest YAML of the GitOps agent.
     */
    readonly yaml: string;
}
/**
 * Datasource for fetching a Harness Gitops Agent deployment manifest YAML.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitopsAgentDeployYaml({
 *     identifier: "identifier",
 *     accountId: "account_id",
 *     projectId: "project_id",
 *     orgId: "org_id",
 *     namespace: "namespace",
 * });
 * ```
 */
export function getGitopsAgentDeployYamlOutput(args: GetGitopsAgentDeployYamlOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGitopsAgentDeployYamlResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getGitopsAgentDeployYaml:getGitopsAgentDeployYaml", {
        "accountId": args.accountId,
        "caData": args.caData,
        "identifier": args.identifier,
        "namespace": args.namespace,
        "orgId": args.orgId,
        "privateKey": args.privateKey,
        "projectId": args.projectId,
        "proxies": args.proxies,
        "skipCrds": args.skipCrds,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsAgentDeployYaml.
 */
export interface GetGitopsAgentDeployYamlOutputArgs {
    /**
     * Account identifier of the GitOps agent.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: pulumi.Input<string>;
    /**
     * CA data of the GitOps agent, base64 encoded content of ca chain.
     */
    caData?: pulumi.Input<string>;
    /**
     * Identifier of the GitOps agent.
     */
    identifier: pulumi.Input<string>;
    /**
     * The kubernetes namespace where the agent is installed.
     */
    namespace: pulumi.Input<string>;
    /**
     * Organization identifier of the GitOps agent.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Private key for the GitOps agent. If provided authentication token will not be regenerated. Must be base64 encoded.
     */
    privateKey?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps agent.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Proxy settings for the GitOps agent.
     */
    proxies?: pulumi.Input<pulumi.Input<inputs.platform.GetGitopsAgentDeployYamlProxyArgs>[]>;
    /**
     * Skip CRDs for the GitOps agent.
     */
    skipCrds?: pulumi.Input<boolean>;
}
