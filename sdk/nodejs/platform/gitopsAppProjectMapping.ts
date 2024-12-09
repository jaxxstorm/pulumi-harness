// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing Harness GitOps Application Project Mappings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.GitopsAppProjectMapping("example", {
 *     accountId: "account_id",
 *     orgId: "organization_id",
 *     projectId: "project_id",
 *     agentId: "agent_id",
 *     argoProjectName: "argoProjectName",
 * });
 * ```
 *
 * ## Import
 *
 * Import a GitOps agent app project mapping
 *
 * ```sh
 * $ pulumi import harness:platform/gitopsAppProjectMapping:GitopsAppProjectMapping example <organization_id>/<project_id>/<agent_id>/<appproject_name>
 * ```
 */
export class GitopsAppProjectMapping extends pulumi.CustomResource {
    /**
     * Get an existing GitopsAppProjectMapping resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GitopsAppProjectMappingState, opts?: pulumi.CustomResourceOptions): GitopsAppProjectMapping {
        return new GitopsAppProjectMapping(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gitopsAppProjectMapping:GitopsAppProjectMapping';

    /**
     * Returns true if the given object is an instance of GitopsAppProjectMapping.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GitopsAppProjectMapping {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GitopsAppProjectMapping.__pulumiType;
    }

    /**
     * Account identifier of the GitOps agent's Application Project.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Agent identifier for which the ArgoCD and Harness project mapping is to be created.
     */
    public readonly agentId!: pulumi.Output<string>;
    /**
     * ArgoCD Project name which is to be mapped to the Harness project.
     */
    public readonly argoProjectName!: pulumi.Output<string>;
    /**
     * Identifier of the GitOps Application Project.
     */
    public /*out*/ readonly identifier!: pulumi.Output<string>;
    /**
     * Organization identifier of the GitOps agent's Application Project.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Project identifier of the GitOps agent's Application Project.
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a GitopsAppProjectMapping resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GitopsAppProjectMappingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GitopsAppProjectMappingArgs | GitopsAppProjectMappingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GitopsAppProjectMappingState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["agentId"] = state ? state.agentId : undefined;
            resourceInputs["argoProjectName"] = state ? state.argoProjectName : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as GitopsAppProjectMappingArgs | undefined;
            if ((!args || args.agentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agentId'");
            }
            if ((!args || args.argoProjectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'argoProjectName'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["agentId"] = args ? args.agentId : undefined;
            resourceInputs["argoProjectName"] = args ? args.argoProjectName : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["identifier"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GitopsAppProjectMapping.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GitopsAppProjectMapping resources.
 */
export interface GitopsAppProjectMappingState {
    /**
     * Account identifier of the GitOps agent's Application Project.
     *
     * @deprecated This field is deprecated and will be removed in a future release.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Agent identifier for which the ArgoCD and Harness project mapping is to be created.
     */
    agentId?: pulumi.Input<string>;
    /**
     * ArgoCD Project name which is to be mapped to the Harness project.
     */
    argoProjectName?: pulumi.Input<string>;
    /**
     * Identifier of the GitOps Application Project.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Organization identifier of the GitOps agent's Application Project.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project identifier of the GitOps agent's Application Project.
     */
    projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GitopsAppProjectMapping resource.
 */
export interface GitopsAppProjectMappingArgs {
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
