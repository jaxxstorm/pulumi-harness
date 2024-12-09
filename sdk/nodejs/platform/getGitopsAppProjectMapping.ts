// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing the Harness GitOps Application Project Mappings.
 */
export function getGitopsAppProjectMapping(args: GetGitopsAppProjectMappingArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsAppProjectMappingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsAppProjectMapping:getGitopsAppProjectMapping", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "argoProjectName": args.argoProjectName,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsAppProjectMapping.
 */
export interface GetGitopsAppProjectMappingArgs {
    /**
     * Account identifier of the GitOps agent's Application Project.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: string;
    /**
     * Agent identifier for which the ArgoCD and Harness project mapping is to be created.
     */
    agentId: string;
    /**
     * ArgoCD Project name which is to be mapped to the Harness project.
     */
    argoProjectName: string;
    /**
     * Organization identifier of the GitOps agent's Application Project.
     */
    orgId: string;
    /**
     * Project identifier of the GitOps agent's Application Project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getGitopsAppProjectMapping.
 */
export interface GetGitopsAppProjectMappingResult {
    /**
     * Account identifier of the GitOps agent's Application Project.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    readonly accountId: string;
    /**
     * Agent identifier for which the ArgoCD and Harness project mapping is to be created.
     */
    readonly agentId: string;
    /**
     * ArgoCD Project name which is to be mapped to the Harness project.
     */
    readonly argoProjectName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the GitOps Application Project.
     */
    readonly identifier: string;
    /**
     * Organization identifier of the GitOps agent's Application Project.
     */
    readonly orgId: string;
    /**
     * Project identifier of the GitOps agent's Application Project.
     */
    readonly projectId: string;
}
/**
 * Resource for managing the Harness GitOps Application Project Mappings.
 */
export function getGitopsAppProjectMappingOutput(args: GetGitopsAppProjectMappingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGitopsAppProjectMappingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getGitopsAppProjectMapping:getGitopsAppProjectMapping", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "argoProjectName": args.argoProjectName,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsAppProjectMapping.
 */
export interface GetGitopsAppProjectMappingOutputArgs {
    /**
     * Account identifier of the GitOps agent's Application Project.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier for which the ArgoCD and Harness project mapping is to be created.
     */
    agentId: pulumi.Input<string>;
    /**
     * ArgoCD Project name which is to be mapped to the Harness project.
     */
    argoProjectName: pulumi.Input<string>;
    /**
     * Organization identifier of the GitOps agent's Application Project.
     */
    orgId: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps agent's Application Project.
     */
    projectId: pulumi.Input<string>;
}
