// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for mapping environment with Harness Clusters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.EnvironmentClustersMapping("example", {
 *     identifier: "identifier",
 *     orgId: "orgIdentifer",
 *     projectId: "projectIdentifier",
 * });
 * ```
 *
 * ## Import
 *
 * Import using the cluster.
 *
 * ```sh
 * $ pulumi import harness:platform/environmentClustersMapping:EnvironmentClustersMapping example <cluster_id>
 * ```
 */
export class EnvironmentClustersMapping extends pulumi.CustomResource {
    /**
     * Get an existing EnvironmentClustersMapping resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentClustersMappingState, opts?: pulumi.CustomResourceOptions): EnvironmentClustersMapping {
        return new EnvironmentClustersMapping(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/environmentClustersMapping:EnvironmentClustersMapping';

    /**
     * Returns true if the given object is an instance of EnvironmentClustersMapping.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EnvironmentClustersMapping {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EnvironmentClustersMapping.__pulumiType;
    }

    /**
     * list of cluster identifiers and names
     */
    public readonly clusters!: pulumi.Output<outputs.platform.EnvironmentClustersMappingCluster[] | undefined>;
    /**
     * environment identifier.
     */
    public readonly envId!: pulumi.Output<string>;
    /**
     * identifier of the cluster.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * org_id of the cluster.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * project_id of the cluster.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * scope at which the cluster exists in harness gitops
     */
    public /*out*/ readonly scope!: pulumi.Output<string>;

    /**
     * Create a EnvironmentClustersMapping resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentClustersMappingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentClustersMappingArgs | EnvironmentClustersMappingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentClustersMappingState | undefined;
            resourceInputs["clusters"] = state ? state.clusters : undefined;
            resourceInputs["envId"] = state ? state.envId : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
        } else {
            const args = argsOrState as EnvironmentClustersMappingArgs | undefined;
            if ((!args || args.envId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'envId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["clusters"] = args ? args.clusters : undefined;
            resourceInputs["envId"] = args ? args.envId : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["scope"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EnvironmentClustersMapping.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EnvironmentClustersMapping resources.
 */
export interface EnvironmentClustersMappingState {
    /**
     * list of cluster identifiers and names
     */
    clusters?: pulumi.Input<pulumi.Input<inputs.platform.EnvironmentClustersMappingCluster>[]>;
    /**
     * environment identifier.
     */
    envId?: pulumi.Input<string>;
    /**
     * identifier of the cluster.
     */
    identifier?: pulumi.Input<string>;
    /**
     * org_id of the cluster.
     */
    orgId?: pulumi.Input<string>;
    /**
     * project_id of the cluster.
     */
    projectId?: pulumi.Input<string>;
    /**
     * scope at which the cluster exists in harness gitops
     */
    scope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnvironmentClustersMapping resource.
 */
export interface EnvironmentClustersMappingArgs {
    /**
     * list of cluster identifiers and names
     */
    clusters?: pulumi.Input<pulumi.Input<inputs.platform.EnvironmentClustersMappingCluster>[]>;
    /**
     * environment identifier.
     */
    envId: pulumi.Input<string>;
    /**
     * identifier of the cluster.
     */
    identifier: pulumi.Input<string>;
    /**
     * org_id of the cluster.
     */
    orgId?: pulumi.Input<string>;
    /**
     * project_id of the cluster.
     */
    projectId?: pulumi.Input<string>;
}
