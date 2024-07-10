// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for managing Harness Gitops Repository.
 *
 * ## Import
 *
 * Import an Account level Gitops Repository
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepository:GitOpsRepository example <agent_id>/<respository_id>
 * ```
 *
 * Import an Org level Gitops Repository
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepository:GitOpsRepository example <organization_id>/<agent_id>/<respository_id>
 * ```
 *
 * Import a Project level Gitops Repository
 *
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepository:GitOpsRepository example <organization_id>/<project_id>/<agent_id>/<respository_id>
 * ```
 */
export class GitOpsRepository extends pulumi.CustomResource {
    /**
     * Get an existing GitOpsRepository resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GitOpsRepositoryState, opts?: pulumi.CustomResourceOptions): GitOpsRepository {
        return new GitOpsRepository(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gitOpsRepository:GitOpsRepository';

    /**
     * Returns true if the given object is an instance of GitOpsRepository.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GitOpsRepository {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GitOpsRepository.__pulumiType;
    }

    /**
     * Account identifier of the GitOps repository.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Agent identifier of the GitOps repository.
     */
    public readonly agentId!: pulumi.Output<string>;
    /**
     * Indicates if to operate on credential set instead of repository.
     */
    public readonly credsOnly!: pulumi.Output<boolean | undefined>;
    /**
     * ECR access token generator specific configuration.
     */
    public readonly ecrGen!: pulumi.Output<outputs.platform.GitOpsRepositoryEcrGen | undefined>;
    /**
     * GCR access token generator specific configuration.
     */
    public readonly gcrGen!: pulumi.Output<outputs.platform.GitOpsRepositoryGcrGen | undefined>;
    /**
     * Default: "UNSET"
     * Enum: "UNSET" "AWS*ECR" "GOOGLE*GCR"
     */
    public readonly genType!: pulumi.Output<string | undefined>;
    /**
     * Identifier of the GitOps repository.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Organization identifier of the GitOps repository.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project identifier of the GitOps repository.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * For OCI repos, this is the interval to refresh the token to access the registry.
     */
    public readonly refreshInterval!: pulumi.Output<string | undefined>;
    /**
     * Repo details holding application configurations.
     */
    public readonly repos!: pulumi.Output<outputs.platform.GitOpsRepositoryRepo[]>;
    /**
     * Update mask of the repository.
     */
    public readonly updateMasks!: pulumi.Output<outputs.platform.GitOpsRepositoryUpdateMask[] | undefined>;
    /**
     * Indicates if the GitOps repository should be updated if existing and inserted if not.
     */
    public readonly upsert!: pulumi.Output<boolean | undefined>;

    /**
     * Create a GitOpsRepository resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GitOpsRepositoryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GitOpsRepositoryArgs | GitOpsRepositoryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GitOpsRepositoryState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["agentId"] = state ? state.agentId : undefined;
            resourceInputs["credsOnly"] = state ? state.credsOnly : undefined;
            resourceInputs["ecrGen"] = state ? state.ecrGen : undefined;
            resourceInputs["gcrGen"] = state ? state.gcrGen : undefined;
            resourceInputs["genType"] = state ? state.genType : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["refreshInterval"] = state ? state.refreshInterval : undefined;
            resourceInputs["repos"] = state ? state.repos : undefined;
            resourceInputs["updateMasks"] = state ? state.updateMasks : undefined;
            resourceInputs["upsert"] = state ? state.upsert : undefined;
        } else {
            const args = argsOrState as GitOpsRepositoryArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.agentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agentId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.repos === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repos'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["agentId"] = args ? args.agentId : undefined;
            resourceInputs["credsOnly"] = args ? args.credsOnly : undefined;
            resourceInputs["ecrGen"] = args ? args.ecrGen : undefined;
            resourceInputs["gcrGen"] = args ? args.gcrGen : undefined;
            resourceInputs["genType"] = args ? args.genType : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["refreshInterval"] = args ? args.refreshInterval : undefined;
            resourceInputs["repos"] = args ? args.repos : undefined;
            resourceInputs["updateMasks"] = args ? args.updateMasks : undefined;
            resourceInputs["upsert"] = args ? args.upsert : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GitOpsRepository.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GitOpsRepository resources.
 */
export interface GitOpsRepositoryState {
    /**
     * Account identifier of the GitOps repository.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier of the GitOps repository.
     */
    agentId?: pulumi.Input<string>;
    /**
     * Indicates if to operate on credential set instead of repository.
     */
    credsOnly?: pulumi.Input<boolean>;
    /**
     * ECR access token generator specific configuration.
     */
    ecrGen?: pulumi.Input<inputs.platform.GitOpsRepositoryEcrGen>;
    /**
     * GCR access token generator specific configuration.
     */
    gcrGen?: pulumi.Input<inputs.platform.GitOpsRepositoryGcrGen>;
    /**
     * Default: "UNSET"
     * Enum: "UNSET" "AWS*ECR" "GOOGLE*GCR"
     */
    genType?: pulumi.Input<string>;
    /**
     * Identifier of the GitOps repository.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Organization identifier of the GitOps repository.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps repository.
     */
    projectId?: pulumi.Input<string>;
    /**
     * For OCI repos, this is the interval to refresh the token to access the registry.
     */
    refreshInterval?: pulumi.Input<string>;
    /**
     * Repo details holding application configurations.
     */
    repos?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsRepositoryRepo>[]>;
    /**
     * Update mask of the repository.
     */
    updateMasks?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsRepositoryUpdateMask>[]>;
    /**
     * Indicates if the GitOps repository should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GitOpsRepository resource.
 */
export interface GitOpsRepositoryArgs {
    /**
     * Account identifier of the GitOps repository.
     */
    accountId: pulumi.Input<string>;
    /**
     * Agent identifier of the GitOps repository.
     */
    agentId: pulumi.Input<string>;
    /**
     * Indicates if to operate on credential set instead of repository.
     */
    credsOnly?: pulumi.Input<boolean>;
    /**
     * ECR access token generator specific configuration.
     */
    ecrGen?: pulumi.Input<inputs.platform.GitOpsRepositoryEcrGen>;
    /**
     * GCR access token generator specific configuration.
     */
    gcrGen?: pulumi.Input<inputs.platform.GitOpsRepositoryGcrGen>;
    /**
     * Default: "UNSET"
     * Enum: "UNSET" "AWS*ECR" "GOOGLE*GCR"
     */
    genType?: pulumi.Input<string>;
    /**
     * Identifier of the GitOps repository.
     */
    identifier: pulumi.Input<string>;
    /**
     * Organization identifier of the GitOps repository.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps repository.
     */
    projectId?: pulumi.Input<string>;
    /**
     * For OCI repos, this is the interval to refresh the token to access the registry.
     */
    refreshInterval?: pulumi.Input<string>;
    /**
     * Repo details holding application configurations.
     */
    repos: pulumi.Input<pulumi.Input<inputs.platform.GitOpsRepositoryRepo>[]>;
    /**
     * Update mask of the repository.
     */
    updateMasks?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsRepositoryUpdateMask>[]>;
    /**
     * Indicates if the GitOps repository should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
}
