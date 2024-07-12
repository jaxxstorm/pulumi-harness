// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * Import an Account level Gitops Repository
 *
 * ```sh
 * $ pulumi import harness:platform/gitopsProject:GitopsProject example <agent_id>/<query_name>
 * ```
 *
 * Import an Org level Gitops Repository
 *
 * ```sh
 * $ pulumi import harness:platform/gitopsProject:GitopsProject example <organization_id>/<agent_id>/<query_name
 * ```
 *
 * Import a Project level Gitops Repository
 *
 * ```sh
 * $ pulumi import harness:platform/gitopsProject:GitopsProject example <organization_id>/<project_id>/<agent_id>/<query_name>
 * ```
 */
export class GitopsProject extends pulumi.CustomResource {
    /**
     * Get an existing GitopsProject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GitopsProjectState, opts?: pulumi.CustomResourceOptions): GitopsProject {
        return new GitopsProject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gitopsProject:GitopsProject';

    /**
     * Returns true if the given object is an instance of GitopsProject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GitopsProject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GitopsProject.__pulumiType;
    }

    /**
     * Account identifier of the GitOps project.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Agent identifier of the GitOps project.
     */
    public readonly agentId!: pulumi.Output<string>;
    /**
     * Org identifier of the GitOps project.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project identifier of the GitOps repository.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * App projects configuration details.
     */
    public readonly projects!: pulumi.Output<outputs.platform.GitopsProjectProject[]>;
    /**
     * Identifier for the GitOps project.
     */
    public readonly queryName!: pulumi.Output<string | undefined>;
    /**
     * Indicates if the GitOps repository should be updated if existing and inserted if not.
     */
    public readonly upsert!: pulumi.Output<boolean | undefined>;

    /**
     * Create a GitopsProject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GitopsProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GitopsProjectArgs | GitopsProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GitopsProjectState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["agentId"] = state ? state.agentId : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["projects"] = state ? state.projects : undefined;
            resourceInputs["queryName"] = state ? state.queryName : undefined;
            resourceInputs["upsert"] = state ? state.upsert : undefined;
        } else {
            const args = argsOrState as GitopsProjectArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.agentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agentId'");
            }
            if ((!args || args.projects === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projects'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["agentId"] = args ? args.agentId : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["projects"] = args ? args.projects : undefined;
            resourceInputs["queryName"] = args ? args.queryName : undefined;
            resourceInputs["upsert"] = args ? args.upsert : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GitopsProject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GitopsProject resources.
 */
export interface GitopsProjectState {
    /**
     * Account identifier of the GitOps project.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier of the GitOps project.
     */
    agentId?: pulumi.Input<string>;
    /**
     * Org identifier of the GitOps project.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps repository.
     */
    projectId?: pulumi.Input<string>;
    /**
     * App projects configuration details.
     */
    projects?: pulumi.Input<pulumi.Input<inputs.platform.GitopsProjectProject>[]>;
    /**
     * Identifier for the GitOps project.
     */
    queryName?: pulumi.Input<string>;
    /**
     * Indicates if the GitOps repository should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GitopsProject resource.
 */
export interface GitopsProjectArgs {
    /**
     * Account identifier of the GitOps project.
     */
    accountId: pulumi.Input<string>;
    /**
     * Agent identifier of the GitOps project.
     */
    agentId: pulumi.Input<string>;
    /**
     * Org identifier of the GitOps project.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps repository.
     */
    projectId?: pulumi.Input<string>;
    /**
     * App projects configuration details.
     */
    projects: pulumi.Input<pulumi.Input<inputs.platform.GitopsProjectProject>[]>;
    /**
     * Identifier for the GitOps project.
     */
    queryName?: pulumi.Input<string>;
    /**
     * Indicates if the GitOps repository should be updated if existing and inserted if not.
     */
    upsert?: pulumi.Input<boolean>;
}
