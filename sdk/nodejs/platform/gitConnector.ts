// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Git connector.
 *
 * ## Import
 *
 * Import account level git connector
 *
 * ```sh
 * $ pulumi import harness:platform/gitConnector:GitConnector example <connector_id>
 * ```
 *
 * Import org level git connector
 *
 * ```sh
 * $ pulumi import harness:platform/gitConnector:GitConnector example <ord_id>/<connector_id>
 * ```
 *
 * Import project level git connector
 *
 * ```sh
 * $ pulumi import harness:platform/gitConnector:GitConnector example <org_id>/<project_id>/<connector_id>
 * ```
 */
export class GitConnector extends pulumi.CustomResource {
    /**
     * Get an existing GitConnector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GitConnectorState, opts?: pulumi.CustomResourceOptions): GitConnector {
        return new GitConnector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gitConnector:GitConnector';

    /**
     * Returns true if the given object is an instance of GitConnector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GitConnector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GitConnector.__pulumiType;
    }

    /**
     * Whether the connection we're making is to a git repository or a git account. Valid values are Account, Repo.
     */
    public readonly connectionType!: pulumi.Output<string>;
    /**
     * Credentials to use for the connection.
     */
    public readonly credentials!: pulumi.Output<outputs.platform.GitConnectorCredentials>;
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
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * URL of the git repository or account.
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * Repository to test the connection with. This is only used when `connectionType` is `Account`.
     */
    public readonly validationRepo!: pulumi.Output<string | undefined>;

    /**
     * Create a GitConnector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GitConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GitConnectorArgs | GitConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GitConnectorState | undefined;
            resourceInputs["connectionType"] = state ? state.connectionType : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["validationRepo"] = state ? state.validationRepo : undefined;
        } else {
            const args = argsOrState as GitConnectorArgs | undefined;
            if ((!args || args.connectionType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionType'");
            }
            if ((!args || args.credentials === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentials'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["connectionType"] = args ? args.connectionType : undefined;
            resourceInputs["credentials"] = args ? args.credentials : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["validationRepo"] = args ? args.validationRepo : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GitConnector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GitConnector resources.
 */
export interface GitConnectorState {
    /**
     * Whether the connection we're making is to a git repository or a git account. Valid values are Account, Repo.
     */
    connectionType?: pulumi.Input<string>;
    /**
     * Credentials to use for the connection.
     */
    credentials?: pulumi.Input<inputs.platform.GitConnectorCredentials>;
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
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URL of the git repository or account.
     */
    url?: pulumi.Input<string>;
    /**
     * Repository to test the connection with. This is only used when `connectionType` is `Account`.
     */
    validationRepo?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GitConnector resource.
 */
export interface GitConnectorArgs {
    /**
     * Whether the connection we're making is to a git repository or a git account. Valid values are Account, Repo.
     */
    connectionType: pulumi.Input<string>;
    /**
     * Credentials to use for the connection.
     */
    credentials: pulumi.Input<inputs.platform.GitConnectorCredentials>;
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
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URL of the git repository or account.
     */
    url: pulumi.Input<string>;
    /**
     * Repository to test the connection with. This is only used when `connectionType` is `Account`.
     */
    validationRepo?: pulumi.Input<string>;
}