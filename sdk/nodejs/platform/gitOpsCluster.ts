// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for managing a Harness Gitops Cluster.
 *
 * ## Import
 *
 * Import an Account level Gitops Cluster
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsCluster:GitOpsCluster example <agent_id>/<cluster_id>
 * ```
 *
 * Import an Org level Gitops Cluster
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsCluster:GitOpsCluster example <organization_id>/<agent_id>/<cluster_id>
 * ```
 *
 * Import a Project level Gitops Cluster
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsCluster:GitOpsCluster example <organization_id>/<project_id>/<agent_id>/<cluster_id>
 * ```
 */
export class GitOpsCluster extends pulumi.CustomResource {
    /**
     * Get an existing GitOpsCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GitOpsClusterState, opts?: pulumi.CustomResourceOptions): GitOpsCluster {
        return new GitOpsCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gitOpsCluster:GitOpsCluster';

    /**
     * Returns true if the given object is an instance of GitOpsCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GitOpsCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GitOpsCluster.__pulumiType;
    }

    /**
     * Account identifier of the GitOps cluster.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Agent identifier of the GitOps cluster. (include scope prefix)
     */
    public readonly agentId!: pulumi.Output<string>;
    /**
     * Identifier of the GitOps cluster.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Organization identifier of the cluster.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project identifier of the GitOps cluster.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Cluster create or update request.
     */
    public readonly requests!: pulumi.Output<outputs.platform.GitOpsClusterRequest[] | undefined>;

    /**
     * Create a GitOpsCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GitOpsClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GitOpsClusterArgs | GitOpsClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GitOpsClusterState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["agentId"] = state ? state.agentId : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["requests"] = state ? state.requests : undefined;
        } else {
            const args = argsOrState as GitOpsClusterArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.agentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agentId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["agentId"] = args ? args.agentId : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["requests"] = args ? args.requests : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GitOpsCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GitOpsCluster resources.
 */
export interface GitOpsClusterState {
    /**
     * Account identifier of the GitOps cluster.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier of the GitOps cluster. (include scope prefix)
     */
    agentId?: pulumi.Input<string>;
    /**
     * Identifier of the GitOps cluster.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Organization identifier of the cluster.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps cluster.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Cluster create or update request.
     */
    requests?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsClusterRequest>[]>;
}

/**
 * The set of arguments for constructing a GitOpsCluster resource.
 */
export interface GitOpsClusterArgs {
    /**
     * Account identifier of the GitOps cluster.
     */
    accountId: pulumi.Input<string>;
    /**
     * Agent identifier of the GitOps cluster. (include scope prefix)
     */
    agentId: pulumi.Input<string>;
    /**
     * Identifier of the GitOps cluster.
     */
    identifier: pulumi.Input<string>;
    /**
     * Organization identifier of the cluster.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps cluster.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Cluster create or update request.
     */
    requests?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsClusterRequest>[]>;
}
