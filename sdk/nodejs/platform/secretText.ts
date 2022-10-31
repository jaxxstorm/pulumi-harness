// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for creating secret of type secret text
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const test = new harness.platform.SecretText("test", {
 *     identifier: "identifier",
 *     description: "test",
 *     tags: ["foo:bar"],
 *     secretManagerIdentifier: "harnessSecretManager",
 *     valueType: "Inline",
 *     value: "secret",
 * });
 * ```
 *
 * ## Import
 *
 * Import using secret text id
 *
 * ```sh
 *  $ pulumi import harness:platform/secretText:SecretText example <secret_text_id>
 * ```
 */
export class SecretText extends pulumi.CustomResource {
    /**
     * Get an existing SecretText resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretTextState, opts?: pulumi.CustomResourceOptions): SecretText {
        return new SecretText(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/secretText:SecretText';

    /**
     * Returns true if the given object is an instance of SecretText.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretText {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretText.__pulumiType;
    }

    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the Organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the Project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of the Secret Manager used to manage the secret.
     */
    public readonly secretManagerIdentifier!: pulumi.Output<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Value of the Secret
     */
    public readonly value!: pulumi.Output<string | undefined>;
    /**
     * This has details to specify if the secret value is Inline or Reference.
     */
    public readonly valueType!: pulumi.Output<string>;

    /**
     * Create a SecretText resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretTextArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretTextArgs | SecretTextState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretTextState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["secretManagerIdentifier"] = state ? state.secretManagerIdentifier : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
            resourceInputs["valueType"] = state ? state.valueType : undefined;
        } else {
            const args = argsOrState as SecretTextArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.secretManagerIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretManagerIdentifier'");
            }
            if ((!args || args.valueType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'valueType'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["secretManagerIdentifier"] = args ? args.secretManagerIdentifier : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
            resourceInputs["valueType"] = args ? args.valueType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecretText.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretText resources.
 */
export interface SecretTextState {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Identifier of the Secret Manager used to manage the secret.
     */
    secretManagerIdentifier?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Value of the Secret
     */
    value?: pulumi.Input<string>;
    /**
     * This has details to specify if the secret value is Inline or Reference.
     */
    valueType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecretText resource.
 */
export interface SecretTextArgs {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Identifier of the Secret Manager used to manage the secret.
     */
    secretManagerIdentifier: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Value of the Secret
     */
    value?: pulumi.Input<string>;
    /**
     * This has details to specify if the secret value is Inline or Reference.
     */
    valueType: pulumi.Input<string>;
}
