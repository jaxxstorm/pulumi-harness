// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for fetching a Harness GitOps Application.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitopsApplications({
 *     accountId: "account_id",
 *     agentId: "agent_id",
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     repoId: "repo_id",
 * });
 * ```
 */
export function getGitopsApplications(args: GetGitopsApplicationsArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsApplicationsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsApplications:getGitopsApplications", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "applications": args.applications,
        "clusterId": args.clusterId,
        "identifier": args.identifier,
        "kind": args.kind,
        "optionsRemoveExistingFinalizers": args.optionsRemoveExistingFinalizers,
        "orgId": args.orgId,
        "project": args.project,
        "projectId": args.projectId,
        "queryProject": args.queryProject,
        "queryRefresh": args.queryRefresh,
        "queryRepo": args.queryRepo,
        "queryResourceVersion": args.queryResourceVersion,
        "querySelector": args.querySelector,
        "repoId": args.repoId,
        "requestCascade": args.requestCascade,
        "requestName": args.requestName,
        "requestPropagationPolicy": args.requestPropagationPolicy,
        "upsert": args.upsert,
        "validate": args.validate,
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
     * Definition of the GitOps application resource.
     */
    applications?: inputs.platform.GetGitopsApplicationsApplication[];
    /**
     * Cluster identifier of the GitOps application.
     */
    clusterId?: string;
    /**
     * Identifier of the GitOps application.
     */
    identifier: string;
    /**
     * Kind of the GitOps application.
     */
    kind?: string;
    /**
     * Options to remove existing finalizers to delete the GitOps application.
     */
    optionsRemoveExistingFinalizers?: boolean;
    /**
     * Organization identifier of the GitOps application.
     */
    orgId: string;
    /**
     * Reference to the project corresponding to this GitOps application. An empty string means that the GitOps application belongs to the 'default' project.
     */
    project?: string;
    /**
     * Project identifier of the GitOps application.
     */
    projectId: string;
    /**
     * Project names to filter the corresponding GitOps applications.
     */
    queryProject?: string;
    /**
     * Forces the GitOps application to reconcile when set to true.
     */
    queryRefresh?: string;
    /**
     * Repo URL to restrict returned list applications.
     */
    queryRepo?: string;
    /**
     * Shows modifications after a version that is specified with a watch call.
     */
    queryResourceVersion?: string;
    /**
     * Filters GitOps applications corresponding to the labels.
     */
    querySelector?: string;
    /**
     * Repository identifier of the GitOps application.
     */
    repoId: string;
    /**
     * Request cascade to delete the GitOps application.
     */
    requestCascade?: boolean;
    /**
     * Request name to delete the GitOps application.
     */
    requestName?: string;
    /**
     * Request propagation policy to delete the GitOps application.
     */
    requestPropagationPolicy?: string;
    /**
     * Indicates if the GitOps application should be updated if existing and inserted if not.
     */
    upsert?: boolean;
    /**
     * Indicates if the GitOps application has to be validated.
     */
    validate?: boolean;
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
    readonly applications?: outputs.platform.GetGitopsApplicationsApplication[];
    /**
     * Cluster identifier of the GitOps application.
     */
    readonly clusterId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the GitOps application.
     */
    readonly identifier: string;
    /**
     * Kind of the GitOps application.
     */
    readonly kind?: string;
    /**
     * Name of the GitOps application.
     */
    readonly name: string;
    /**
     * Options to remove existing finalizers to delete the GitOps application.
     */
    readonly optionsRemoveExistingFinalizers?: boolean;
    /**
     * Organization identifier of the GitOps application.
     */
    readonly orgId: string;
    /**
     * Reference to the project corresponding to this GitOps application. An empty string means that the GitOps application belongs to the 'default' project.
     */
    readonly project?: string;
    /**
     * Project identifier of the GitOps application.
     */
    readonly projectId: string;
    /**
     * Project names to filter the corresponding GitOps applications.
     */
    readonly queryProject?: string;
    /**
     * Forces the GitOps application to reconcile when set to true.
     */
    readonly queryRefresh?: string;
    /**
     * Repo URL to restrict returned list applications.
     */
    readonly queryRepo?: string;
    /**
     * Shows modifications after a version that is specified with a watch call.
     */
    readonly queryResourceVersion?: string;
    /**
     * Filters GitOps applications corresponding to the labels.
     */
    readonly querySelector?: string;
    /**
     * Repository identifier of the GitOps application.
     */
    readonly repoId: string;
    /**
     * Request cascade to delete the GitOps application.
     */
    readonly requestCascade?: boolean;
    /**
     * Request name to delete the GitOps application.
     */
    readonly requestName?: string;
    /**
     * Request propagation policy to delete the GitOps application.
     */
    readonly requestPropagationPolicy?: string;
    /**
     * Indicates if the GitOps application should be updated if existing and inserted if not.
     */
    readonly upsert?: boolean;
    /**
     * Indicates if the GitOps application has to be validated.
     */
    readonly validate?: boolean;
}
/**
 * Datasource for fetching a Harness GitOps Application.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitopsApplications({
 *     accountId: "account_id",
 *     agentId: "agent_id",
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     repoId: "repo_id",
 * });
 * ```
 */
export function getGitopsApplicationsOutput(args: GetGitopsApplicationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGitopsApplicationsResult> {
    return pulumi.output(args).apply((a: any) => getGitopsApplications(a, opts))
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
     * Definition of the GitOps application resource.
     */
    applications?: pulumi.Input<pulumi.Input<inputs.platform.GetGitopsApplicationsApplicationArgs>[]>;
    /**
     * Cluster identifier of the GitOps application.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Identifier of the GitOps application.
     */
    identifier: pulumi.Input<string>;
    /**
     * Kind of the GitOps application.
     */
    kind?: pulumi.Input<string>;
    /**
     * Options to remove existing finalizers to delete the GitOps application.
     */
    optionsRemoveExistingFinalizers?: pulumi.Input<boolean>;
    /**
     * Organization identifier of the GitOps application.
     */
    orgId: pulumi.Input<string>;
    /**
     * Reference to the project corresponding to this GitOps application. An empty string means that the GitOps application belongs to the 'default' project.
     */
    project?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps application.
     */
    projectId: pulumi.Input<string>;
    /**
     * Project names to filter the corresponding GitOps applications.
     */
    queryProject?: pulumi.Input<string>;
    /**
     * Forces the GitOps application to reconcile when set to true.
     */
    queryRefresh?: pulumi.Input<string>;
    /**
     * Repo URL to restrict returned list applications.
     */
    queryRepo?: pulumi.Input<string>;
    /**
     * Shows modifications after a version that is specified with a watch call.
     */
    queryResourceVersion?: pulumi.Input<string>;
    /**
     * Filters GitOps applications corresponding to the labels.
     */
    querySelector?: pulumi.Input<string>;
    /**
     * Repository identifier of the GitOps application.
     */
    repoId: pulumi.Input<string>;
    /**
     * Request cascade to delete the GitOps application.
     */
    requestCascade?: pulumi.Input<boolean>;
    /**
     * Request name to delete the GitOps application.
     */
    requestName?: pulumi.Input<string>;
    /**
     * Request propagation policy to delete the GitOps application.
     */
    requestPropagationPolicy?: pulumi.Input<string>;
    /**
     * Indicates if the GitOps application should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
    /**
     * Indicates if the GitOps application has to be validated.
     */
    validate?: pulumi.Input<boolean>;
}
