// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Jenkins connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * // Auth mechanism bearer token
 * const test = new harness.platform.ConnectorJenkins("test", {
 *     auth: {
 *         jenkinsBearerToken: {
 *             tokenRef: `account.${harness_platform_secret_text.test.id}`,
 *         },
 *         type: "Bearer Token(HTTP Header)",
 *     },
 *     delegateSelectors: ["harness-delegate"],
 *     description: "test",
 *     identifier: "identifier",
 *     jenkinsUrl: "https://jenkinss.com/",
 *     tags: ["foo:bar"],
 * });
 * ```
 *
 * ## Import
 *
 * Import account level jenkins connector
 *
 * ```sh
 *  $ pulumi import harness:platform/connectorJenkins:ConnectorJenkins example <connector_id>
 * ```
 *
 *  Import org level jenkins connector
 *
 * ```sh
 *  $ pulumi import harness:platform/connectorJenkins:ConnectorJenkins example <ord_id>/<connector_id>
 * ```
 *
 *  Import project level jenkins connector
 *
 * ```sh
 *  $ pulumi import harness:platform/connectorJenkins:ConnectorJenkins example <org_id>/<project_id>/<connector_id>
 * ```
 */
export class ConnectorJenkins extends pulumi.CustomResource {
    /**
     * Get an existing ConnectorJenkins resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectorJenkinsState, opts?: pulumi.CustomResourceOptions): ConnectorJenkins {
        return new ConnectorJenkins(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/connectorJenkins:ConnectorJenkins';

    /**
     * Returns true if the given object is an instance of ConnectorJenkins.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConnectorJenkins {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConnectorJenkins.__pulumiType;
    }

    /**
     * This entity contains the details for Jenkins Authentication.
     */
    public readonly auth!: pulumi.Output<outputs.platform.ConnectorJenkinsAuth | undefined>;
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
     * Jenkins Url.
     */
    public readonly jenkinsUrl!: pulumi.Output<string>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
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
     * Create a ConnectorJenkins resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectorJenkinsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectorJenkinsArgs | ConnectorJenkinsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectorJenkinsState | undefined;
            resourceInputs["auth"] = state ? state.auth : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["jenkinsUrl"] = state ? state.jenkinsUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ConnectorJenkinsArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.jenkinsUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'jenkinsUrl'");
            }
            resourceInputs["auth"] = args ? args.auth : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["jenkinsUrl"] = args ? args.jenkinsUrl : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConnectorJenkins.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConnectorJenkins resources.
 */
export interface ConnectorJenkinsState {
    /**
     * This entity contains the details for Jenkins Authentication.
     */
    auth?: pulumi.Input<inputs.platform.ConnectorJenkinsAuth>;
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
     * Jenkins Url.
     */
    jenkinsUrl?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
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
 * The set of arguments for constructing a ConnectorJenkins resource.
 */
export interface ConnectorJenkinsArgs {
    /**
     * This entity contains the details for Jenkins Authentication.
     */
    auth?: pulumi.Input<inputs.platform.ConnectorJenkinsAuth>;
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
     * Jenkins Url.
     */
    jenkinsUrl: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
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
