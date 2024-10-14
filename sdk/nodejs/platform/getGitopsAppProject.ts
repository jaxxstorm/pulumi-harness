// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitopsAppProject({
 *     agentId: "agent_id",
 *     queryName: "query_name",
 * });
 * ```
 */
export function getGitopsAppProject(args: GetGitopsAppProjectArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsAppProjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsAppProject:getGitopsAppProject", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "queryName": args.queryName,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsAppProject.
 */
export interface GetGitopsAppProjectArgs {
    /**
     * Account identifier of the GitOps Agent where argo project resides.
     */
    accountId: string;
    /**
     * Agent identifier of the agent where argo project resides(include scope prefix)
     */
    agentId: string;
    /**
     * Org identifier of the GitOps Agent where argo project resides.
     */
    orgId?: string;
    /**
     * Project identifier of the Gitops Agent where argo project resides.
     */
    projectId?: string;
    /**
     * Identifier for the GitOps Argo project.
     */
    queryName?: string;
}

/**
 * A collection of values returned by getGitopsAppProject.
 */
export interface GetGitopsAppProjectResult {
    /**
     * Account identifier of the GitOps Agent where argo project resides.
     */
    readonly accountId: string;
    /**
     * Agent identifier of the agent where argo project resides(include scope prefix)
     */
    readonly agentId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Org identifier of the GitOps Agent where argo project resides.
     */
    readonly orgId?: string;
    /**
     * Project identifier of the Gitops Agent where argo project resides.
     */
    readonly projectId?: string;
    /**
     * Identifier for the GitOps Argo project.
     */
    readonly queryName: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitopsAppProject({
 *     agentId: "agent_id",
 *     queryName: "query_name",
 * });
 * ```
 */
export function getGitopsAppProjectOutput(args: GetGitopsAppProjectOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGitopsAppProjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getGitopsAppProject:getGitopsAppProject", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "queryName": args.queryName,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsAppProject.
 */
export interface GetGitopsAppProjectOutputArgs {
    /**
     * Account identifier of the GitOps Agent where argo project resides.
     */
    accountId: pulumi.Input<string>;
    /**
     * Agent identifier of the agent where argo project resides(include scope prefix)
     */
    agentId: pulumi.Input<string>;
    /**
     * Org identifier of the GitOps Agent where argo project resides.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the Gitops Agent where argo project resides.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Identifier for the GitOps Argo project.
     */
    queryName?: pulumi.Input<string>;
}
