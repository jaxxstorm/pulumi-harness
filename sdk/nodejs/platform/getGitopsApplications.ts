// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for fetching a Harness GitOps Application.
 */
export function getGitopsApplications(args: GetGitopsApplicationsArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsApplicationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsApplications:getGitopsApplications", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsApplications.
 */
export interface GetGitopsApplicationsArgs {
    /**
     * Account identifier of the GitOps application.
     */
    accountId: string;
    /**
     * Agent identifier of the GitOps application.
     */
    agentId: string;
    /**
     * Identifier of the GitOps application.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    identifier?: string;
    /**
     * Name of the GitOps application.
     */
    name: string;
    /**
     * Organization identifier of the GitOps application.
     */
    orgId: string;
    /**
     * Project identifier of the GitOps application.
     */
    projectId: string;
}

/**
 * A collection of values returned by getGitopsApplications.
 */
export interface GetGitopsApplicationsResult {
    /**
     * Account identifier of the GitOps application.
     */
    readonly accountId: string;
    /**
     * Agent identifier of the GitOps application.
     */
    readonly agentId: string;
    /**
     * Definition of the GitOps application resource.
     */
    readonly applications: outputs.platform.GetGitopsApplicationsApplication[];
    /**
     * Cluster identifier of the GitOps application.
     */
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the GitOps application.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    readonly identifier?: string;
    /**
     * Kind of the GitOps application.
     */
    readonly kind: string;
    /**
     * Name of the GitOps application.
     */
    readonly name: string;
    /**
     * Options to remove existing finalizers to delete the GitOps application.
     */
    readonly optionsRemoveExistingFinalizers: boolean;
    /**
     * Organization identifier of the GitOps application.
     */
    readonly orgId: string;
    /**
     * The ArgoCD project name corresponding to this GitOps application. An empty string means that the GitOps application belongs to the default project created by Harness.
     */
    readonly project: string;
    /**
     * Project identifier of the GitOps application.
     */
    readonly projectId: string;
    /**
     * Repository identifier of the GitOps application.
     */
    readonly repoId: string;
    /**
     * Request cascade to delete the GitOps application.
     */
    readonly requestCascade: boolean;
    /**
     * Request propagation policy to delete the GitOps application.
     */
    readonly requestPropagationPolicy: string;
    /**
     * Indicates if the GitOps application should skip validate repository definition exists.
     */
    readonly skipRepoValidation: boolean;
    /**
     * Indicates if the GitOps application should be updated if existing and inserted if not.
     */
    readonly upsert: boolean;
    /**
     * Indicates if the GitOps application yaml has to be validated.
     */
    readonly validate: boolean;
}
/**
 * Datasource for fetching a Harness GitOps Application.
 */
export function getGitopsApplicationsOutput(args: GetGitopsApplicationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGitopsApplicationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getGitopsApplications:getGitopsApplications", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsApplications.
 */
export interface GetGitopsApplicationsOutputArgs {
    /**
     * Account identifier of the GitOps application.
     */
    accountId: pulumi.Input<string>;
    /**
     * Agent identifier of the GitOps application.
     */
    agentId: pulumi.Input<string>;
    /**
     * Identifier of the GitOps application.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the GitOps application.
     */
    name: pulumi.Input<string>;
    /**
     * Organization identifier of the GitOps application.
     */
    orgId: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps application.
     */
    projectId: pulumi.Input<string>;
}
