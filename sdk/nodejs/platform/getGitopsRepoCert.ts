// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a GitOps Repository Certificate. It fetches all the certificates that are added to the provided agent.
 */
export function getGitopsRepoCert(args: GetGitopsRepoCertArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsRepoCertResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsRepoCert:getGitopsRepoCert", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsRepoCert.
 */
export interface GetGitopsRepoCertArgs {
    /**
     * Account identifier of the GitOps repository certificate.
     */
    accountId: string;
    /**
     * Agent identifier of the GitOps repository certificate.
     */
    agentId?: string;
    /**
     * Organization identifier of the GitOps repository certificate.
     */
    orgId?: string;
    /**
     * Project identifier of the GitOps repository certificate.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getGitopsRepoCert.
 */
export interface GetGitopsRepoCertResult {
    /**
     * Account identifier of the GitOps repository certificate.
     */
    readonly accountId: string;
    /**
     * Agent identifier of the GitOps repository certificate.
     */
    readonly agentId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Organization identifier of the GitOps repository certificate.
     */
    readonly orgId?: string;
    /**
     * Project identifier of the GitOps repository certificate.
     */
    readonly projectId?: string;
}
/**
 * Data source for retrieving a GitOps Repository Certificate. It fetches all the certificates that are added to the provided agent.
 */
export function getGitopsRepoCertOutput(args: GetGitopsRepoCertOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGitopsRepoCertResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getGitopsRepoCert:getGitopsRepoCert", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsRepoCert.
 */
export interface GetGitopsRepoCertOutputArgs {
    /**
     * Account identifier of the GitOps repository certificate.
     */
    accountId: pulumi.Input<string>;
    /**
     * Agent identifier of the GitOps repository certificate.
     */
    agentId?: pulumi.Input<string>;
    /**
     * Organization identifier of the GitOps repository certificate.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps repository certificate.
     */
    projectId?: pulumi.Input<string>;
}
