// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Service Now connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * // Credential type AdfsClientCredentialsWithCertificate
 * const test = new harness.platform.ConnectorServiceNow("test", {
 *     auth: {
 *         adfs: {
 *             adfsUrl: "https://adfs_url.com",
 *             certificateRef: "account.certificate_ref",
 *             clientIdRef: "account.client_id_ref",
 *             privateKeyRef: "account.private_key_ref}",
 *             resourceIdRef: "account.resource_id_ref",
 *         },
 *         authType: "AdfsClientCredentialsWithCertificate",
 *     },
 *     delegateSelectors: ["harness-delegate"],
 *     description: "test",
 *     identifier: "identifier",
 *     serviceNowUrl: "https://servicenow.com",
 *     tags: ["foo:bar"],
 * });
 * ```
 *
 * ## Import
 *
 * Import account level service now connector
 *
 * ```sh
 *  $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <connector_id>
 * ```
 *
 *  Import org level service now connector
 *
 * ```sh
 *  $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <ord_id>/<connector_id>
 * ```
 *
 *  Import project level service now connector
 *
 * ```sh
 *  $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <org_id>/<project_id>/<connector_id>
 * ```
 */
export class ConnectorServiceNow extends pulumi.CustomResource {
    /**
     * Get an existing ConnectorServiceNow resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectorServiceNowState, opts?: pulumi.CustomResourceOptions): ConnectorServiceNow {
        return new ConnectorServiceNow(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/connectorServiceNow:ConnectorServiceNow';

    /**
     * Returns true if the given object is an instance of ConnectorServiceNow.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConnectorServiceNow {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConnectorServiceNow.__pulumiType;
    }

    /**
     * The credentials to use for the service now authentication.
     */
    public readonly auth!: pulumi.Output<outputs.platform.ConnectorServiceNowAuth>;
    /**
     * Tags to filter delegates for connection.
     */
    public readonly delegateSelectors!: pulumi.Output<string[] | undefined>;
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
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    public readonly passwordRef!: pulumi.Output<string>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * URL of service now.
     */
    public readonly serviceNowUrl!: pulumi.Output<string>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Username to use for authentication.
     */
    public readonly username!: pulumi.Output<string>;
    /**
     * Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    public readonly usernameRef!: pulumi.Output<string>;

    /**
     * Create a ConnectorServiceNow resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectorServiceNowArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectorServiceNowArgs | ConnectorServiceNowState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectorServiceNowState | undefined;
            resourceInputs["auth"] = state ? state.auth : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["passwordRef"] = state ? state.passwordRef : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["serviceNowUrl"] = state ? state.serviceNowUrl : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
            resourceInputs["usernameRef"] = state ? state.usernameRef : undefined;
        } else {
            const args = argsOrState as ConnectorServiceNowArgs | undefined;
            if ((!args || args.auth === undefined) && !opts.urn) {
                throw new Error("Missing required property 'auth'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.serviceNowUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceNowUrl'");
            }
            resourceInputs["auth"] = args ? args.auth : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["passwordRef"] = args ? args.passwordRef : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["serviceNowUrl"] = args ? args.serviceNowUrl : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["usernameRef"] = args ? args.usernameRef : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConnectorServiceNow.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConnectorServiceNow resources.
 */
export interface ConnectorServiceNowState {
    /**
     * The credentials to use for the service now authentication.
     */
    auth?: pulumi.Input<inputs.platform.ConnectorServiceNowAuth>;
    /**
     * Tags to filter delegates for connection.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
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
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    passwordRef?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * URL of service now.
     */
    serviceNowUrl?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Username to use for authentication.
     */
    username?: pulumi.Input<string>;
    /**
     * Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    usernameRef?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConnectorServiceNow resource.
 */
export interface ConnectorServiceNowArgs {
    /**
     * The credentials to use for the service now authentication.
     */
    auth: pulumi.Input<inputs.platform.ConnectorServiceNowAuth>;
    /**
     * Tags to filter delegates for connection.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
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
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    passwordRef?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * URL of service now.
     */
    serviceNowUrl: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Username to use for authentication.
     */
    username?: pulumi.Input<string>;
    /**
     * Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    usernameRef?: pulumi.Input<string>;
}
