// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class EnvironmentServiceOverrides extends pulumi.CustomResource {
    /**
     * Get an existing EnvironmentServiceOverrides resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentServiceOverridesState, opts?: pulumi.CustomResourceOptions): EnvironmentServiceOverrides {
        return new EnvironmentServiceOverrides(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/environmentServiceOverrides:EnvironmentServiceOverrides';

    /**
     * Returns true if the given object is an instance of EnvironmentServiceOverrides.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EnvironmentServiceOverrides {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EnvironmentServiceOverrides.__pulumiType;
    }

    /**
     * The env ID to which the overrides associated.
     */
    public readonly envId!: pulumi.Output<string>;
    /**
     * identifier of the service overrides.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Unique identifier of the Organization.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Unique identifier of the Project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The service ID to which the overrides applies.
     */
    public readonly serviceId!: pulumi.Output<string>;
    /**
     * Environment Service Overrides YAML
     */
    public readonly yaml!: pulumi.Output<string>;

    /**
     * Create a EnvironmentServiceOverrides resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentServiceOverridesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentServiceOverridesArgs | EnvironmentServiceOverridesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentServiceOverridesState | undefined;
            resourceInputs["envId"] = state ? state.envId : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["serviceId"] = state ? state.serviceId : undefined;
            resourceInputs["yaml"] = state ? state.yaml : undefined;
        } else {
            const args = argsOrState as EnvironmentServiceOverridesArgs | undefined;
            if ((!args || args.envId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'envId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.serviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceId'");
            }
            if ((!args || args.yaml === undefined) && !opts.urn) {
                throw new Error("Missing required property 'yaml'");
            }
            resourceInputs["envId"] = args ? args.envId : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["serviceId"] = args ? args.serviceId : undefined;
            resourceInputs["yaml"] = args ? args.yaml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EnvironmentServiceOverrides.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EnvironmentServiceOverrides resources.
 */
export interface EnvironmentServiceOverridesState {
    /**
     * The env ID to which the overrides associated.
     */
    envId?: pulumi.Input<string>;
    /**
     * identifier of the service overrides.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The service ID to which the overrides applies.
     */
    serviceId?: pulumi.Input<string>;
    /**
     * Environment Service Overrides YAML
     */
    yaml?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnvironmentServiceOverrides resource.
 */
export interface EnvironmentServiceOverridesArgs {
    /**
     * The env ID to which the overrides associated.
     */
    envId: pulumi.Input<string>;
    /**
     * identifier of the service overrides.
     */
    identifier: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId: pulumi.Input<string>;
    /**
     * The service ID to which the overrides applies.
     */
    serviceId: pulumi.Input<string>;
    /**
     * Environment Service Overrides YAML
     */
    yaml: pulumi.Input<string>;
}
