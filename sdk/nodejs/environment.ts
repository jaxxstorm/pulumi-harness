// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Resource for creating an environment
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.Application("test", {name: "%[1]s"});
 * const testKubernetes = new harness.service.Kubernetes("test", {
 *     appId: test.id,
 *     name: "%[1]s",
 *     helmVersion: "V2",
 *     description: "description",
 *     variables: [
 *         {
 *             name: "test",
 *             value: "test_value",
 *             type: "TEXT",
 *         },
 *         {
 *             name: "test2",
 *             value: "test_value2",
 *             type: "TEXT",
 *         },
 *     ],
 * });
 * const testEnvironment = new harness.Environment("test", {
 *     appId: test.id,
 *     name: "%[1]s",
 *     type: "%[2]s",
 *     variableOverrides: [
 *         {
 *             serviceName: testKubernetes.name,
 *             name: "test",
 *             value: "override",
 *             type: "TEXT",
 *         },
 *         {
 *             serviceName: testKubernetes.name,
 *             name: "test2",
 *             value: "override2",
 *             type: "TEXT",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Import using the Harness application id and environment id.
 *
 * ```sh
 * $ pulumi import harness:index/environment:Environment dev <application_id>/<environment_id>
 * ```
 */
export class Environment extends pulumi.CustomResource {
    /**
     * Get an existing Environment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentState, opts?: pulumi.CustomResourceOptions): Environment {
        return new Environment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/environment:Environment';

    /**
     * Returns true if the given object is an instance of Environment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Environment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Environment.__pulumiType;
    }

    /**
     * The id of the application.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The description of the environment.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the environment.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The type of the environment. Valid values are `PROD` and `NON_PROD`
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Override for a service variable
     */
    public readonly variableOverrides!: pulumi.Output<outputs.EnvironmentVariableOverride[] | undefined>;

    /**
     * Create a Environment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentArgs | EnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["variableOverrides"] = state ? state.variableOverrides : undefined;
        } else {
            const args = argsOrState as EnvironmentArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["appId"] = args ? args.appId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["variableOverrides"] = args ? args.variableOverrides : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Environment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Environment resources.
 */
export interface EnvironmentState {
    /**
     * The id of the application.
     */
    appId?: pulumi.Input<string>;
    /**
     * The description of the environment.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the environment.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of the environment. Valid values are `PROD` and `NON_PROD`
     */
    type?: pulumi.Input<string>;
    /**
     * Override for a service variable
     */
    variableOverrides?: pulumi.Input<pulumi.Input<inputs.EnvironmentVariableOverride>[]>;
}

/**
 * The set of arguments for constructing a Environment resource.
 */
export interface EnvironmentArgs {
    /**
     * The id of the application.
     */
    appId: pulumi.Input<string>;
    /**
     * The description of the environment.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the environment.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of the environment. Valid values are `PROD` and `NON_PROD`
     */
    type: pulumi.Input<string>;
    /**
     * Override for a service variable
     */
    variableOverrides?: pulumi.Input<pulumi.Input<inputs.EnvironmentVariableOverride>[]>;
}
