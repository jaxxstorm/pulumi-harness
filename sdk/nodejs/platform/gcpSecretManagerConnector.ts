// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const gcpSmManual = new harness.platform.GcpSecretManagerConnector("gcp_sm_manual", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "test",
 *     tags: ["foo:bar"],
 *     delegateSelectors: ["harness-delegate"],
 *     credentialsRef: `account.${test.id}`,
 * });
 * const gcpSmInherit = new harness.platform.GcpSecretManagerConnector("gcp_sm_inherit", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "test",
 *     tags: ["foo:bar"],
 *     delegateSelectors: ["harness-delegate"],
 *     inheritFromDelegate: true,
 * });
 * const gcpSmOidcPlatform = new harness.platform.GcpSecretManagerConnector("gcp_sm_oidc_platform", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "test",
 *     tags: ["foo:bar"],
 *     executeOnDelegate: false,
 *     oidcAuthentications: [{
 *         workloadPoolId: "harness-pool-test",
 *         providerId: "harness",
 *         gcpProjectId: "1234567",
 *         serviceAccountEmail: "harness.sample@iam.gserviceaccount.com",
 *     }],
 * });
 * const gcpSmOidcDelegate = new harness.platform.GcpSecretManagerConnector("gcp_sm_oidc_delegate", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "test",
 *     tags: ["foo:bar"],
 *     isDefault: true,
 *     delegateSelectors: ["harness-delegate"],
 *     oidcAuthentications: [{
 *         workloadPoolId: "harness-pool-test",
 *         providerId: "harness",
 *         gcpProjectId: "1234567",
 *         serviceAccountEmail: "harness.sample@iam.gserviceaccount.com",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Import account level gcp secret manager connector
 *
 * ```sh
 * $ pulumi import harness:platform/gcpSecretManagerConnector:GcpSecretManagerConnector example <connector_id>
 * ```
 *
 * Import org level gcp secret manager connector
 *
 * ```sh
 * $ pulumi import harness:platform/gcpSecretManagerConnector:GcpSecretManagerConnector example <ord_id>/<connector_id>
 * ```
 *
 * Import project level gcp secret manager connector
 *
 * ```sh
 * $ pulumi import harness:platform/gcpSecretManagerConnector:GcpSecretManagerConnector example <org_id>/<project_id>/<connector_id>
 * ```
 */
export class GcpSecretManagerConnector extends pulumi.CustomResource {
    /**
     * Get an existing GcpSecretManagerConnector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GcpSecretManagerConnectorState, opts?: pulumi.CustomResourceOptions): GcpSecretManagerConnector {
        return new GcpSecretManagerConnector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gcpSecretManagerConnector:GcpSecretManagerConnector';

    /**
     * Returns true if the given object is an instance of GcpSecretManagerConnector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GcpSecretManagerConnector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GcpSecretManagerConnector.__pulumiType;
    }

    /**
     * Reference to the secret containing credentials of IAM service account for Google Secret Manager. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    public readonly credentialsRef!: pulumi.Output<string | undefined>;
    /**
     * The delegates to inherit the credentials from.
     */
    public readonly delegateSelectors!: pulumi.Output<string[] | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Execute on delegate or not.
     */
    public readonly executeOnDelegate!: pulumi.Output<boolean | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Inherit configuration from delegate.
     */
    public readonly inheritFromDelegate!: pulumi.Output<boolean | undefined>;
    /**
     * Set this flag to set this secret manager as default secret manager.
     */
    public readonly isDefault!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Authentication using harness oidc.
     */
    public readonly oidcAuthentications!: pulumi.Output<outputs.platform.GcpSecretManagerConnectorOidcAuthentication[] | undefined>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a GcpSecretManagerConnector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GcpSecretManagerConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GcpSecretManagerConnectorArgs | GcpSecretManagerConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GcpSecretManagerConnectorState | undefined;
            resourceInputs["credentialsRef"] = state ? state.credentialsRef : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["executeOnDelegate"] = state ? state.executeOnDelegate : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["inheritFromDelegate"] = state ? state.inheritFromDelegate : undefined;
            resourceInputs["isDefault"] = state ? state.isDefault : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oidcAuthentications"] = state ? state.oidcAuthentications : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as GcpSecretManagerConnectorArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["credentialsRef"] = args ? args.credentialsRef : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["executeOnDelegate"] = args ? args.executeOnDelegate : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["inheritFromDelegate"] = args ? args.inheritFromDelegate : undefined;
            resourceInputs["isDefault"] = args ? args.isDefault : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oidcAuthentications"] = args ? args.oidcAuthentications : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GcpSecretManagerConnector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GcpSecretManagerConnector resources.
 */
export interface GcpSecretManagerConnectorState {
    /**
     * Reference to the secret containing credentials of IAM service account for Google Secret Manager. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    credentialsRef?: pulumi.Input<string>;
    /**
     * The delegates to inherit the credentials from.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Execute on delegate or not.
     */
    executeOnDelegate?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Inherit configuration from delegate.
     */
    inheritFromDelegate?: pulumi.Input<boolean>;
    /**
     * Set this flag to set this secret manager as default secret manager.
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Authentication using harness oidc.
     */
    oidcAuthentications?: pulumi.Input<pulumi.Input<inputs.platform.GcpSecretManagerConnectorOidcAuthentication>[]>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a GcpSecretManagerConnector resource.
 */
export interface GcpSecretManagerConnectorArgs {
    /**
     * Reference to the secret containing credentials of IAM service account for Google Secret Manager. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    credentialsRef?: pulumi.Input<string>;
    /**
     * The delegates to inherit the credentials from.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Execute on delegate or not.
     */
    executeOnDelegate?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Inherit configuration from delegate.
     */
    inheritFromDelegate?: pulumi.Input<boolean>;
    /**
     * Set this flag to set this secret manager as default secret manager.
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Authentication using harness oidc.
     */
    oidcAuthentications?: pulumi.Input<pulumi.Input<inputs.platform.GcpSecretManagerConnectorOidcAuthentication>[]>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
