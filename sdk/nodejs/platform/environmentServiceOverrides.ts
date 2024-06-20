// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness environment service overrides.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = new harness.platform.EnvironmentServiceOverrides("example", {
 *     orgId: "orgIdentifier",
 *     projectId: "projectIdentifier",
 *     envId: "environmentIdentifier",
 *     serviceId: "serviceIdentifier",
 *     yaml: `serviceOverrides:
 *   environmentRef: environmentIdentifier
 *   serviceRef: serviceIdentifier
 *   variables:
 *    - name: asda
 *      type: String
 *      value: asddad
 *   manifests:
 *      - manifest:
 *          identifier: manifestEnv
 *          type: Values
 *          spec:
 *            store:
 *              type: Git
 *              spec:
 *                connectorRef: <+input>
 *                gitFetchType: Branch
 *                paths:
 *                  - file1
 *                repoName: <+input>
 *                branch: master
 *   configFiles:
 *      - configFile:
 *          identifier: configFileEnv
 *          spec:
 *            store:
 *              type: Harness
 *              spec:
 *                files:
 *                  - account:/Add-ons/svcOverrideTest
 *                secretFiles: []
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * Import using serviceoverride id
 *
 * ```sh
 * $ pulumi import harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides example <serviceoverride_id>
 * ```
 */
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
    public static readonly __pulumiType = 'harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides';

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
     * The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
     */
    public readonly envId!: pulumi.Output<string>;
    /**
     * identifier of the service overrides.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
     */
    public readonly serviceId!: pulumi.Output<string>;
    /**
     * Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
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
     * The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
     */
    envId?: pulumi.Input<string>;
    /**
     * identifier of the service overrides.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
     */
    serviceId?: pulumi.Input<string>;
    /**
     * Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    yaml?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnvironmentServiceOverrides resource.
 */
export interface EnvironmentServiceOverridesArgs {
    /**
     * The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
     */
    envId: pulumi.Input<string>;
    /**
     * identifier of the service overrides.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
     */
    serviceId: pulumi.Input<string>;
    /**
     * Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
     */
    yaml: pulumi.Input<string>;
}
