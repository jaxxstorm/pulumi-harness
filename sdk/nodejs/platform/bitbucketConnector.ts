// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Bitbucket connector.
 */
export class BitbucketConnector extends pulumi.CustomResource {
    /**
     * Get an existing BitbucketConnector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BitbucketConnectorState, opts?: pulumi.CustomResourceOptions): BitbucketConnector {
        return new BitbucketConnector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/bitbucketConnector:BitbucketConnector';

    /**
     * Returns true if the given object is an instance of BitbucketConnector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BitbucketConnector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BitbucketConnector.__pulumiType;
    }

    /**
     * Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     */
    public readonly apiAuthentication!: pulumi.Output<outputs.platform.BitbucketConnectorApiAuthentication | undefined>;
    /**
     * Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
     */
    public readonly connectionType!: pulumi.Output<string>;
    /**
     * Credentials to use for the connection.
     */
    public readonly credentials!: pulumi.Output<outputs.platform.BitbucketConnectorCredentials>;
    /**
     * Connect using only the delegates which have these tags.
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
     * Unique identifier of the Organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the Project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Url of the BitBucket repository or account.
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * Repository to test the connection with. This is only used when `connectionType` is `Account`.
     */
    public readonly validationRepo!: pulumi.Output<string | undefined>;

    /**
     * Create a BitbucketConnector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BitbucketConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BitbucketConnectorArgs | BitbucketConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BitbucketConnectorState | undefined;
            resourceInputs["apiAuthentication"] = state ? state.apiAuthentication : undefined;
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
            const args = argsOrState as BitbucketConnectorArgs | undefined;
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
            resourceInputs["apiAuthentication"] = args ? args.apiAuthentication : undefined;
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
        super(BitbucketConnector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BitbucketConnector resources.
 */
export interface BitbucketConnectorState {
    /**
     * Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     */
    apiAuthentication?: pulumi.Input<inputs.platform.BitbucketConnectorApiAuthentication>;
    /**
     * Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
     */
    connectionType?: pulumi.Input<string>;
    /**
     * Credentials to use for the connection.
     */
    credentials?: pulumi.Input<inputs.platform.BitbucketConnectorCredentials>;
    /**
     * Connect using only the delegates which have these tags.
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
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Url of the BitBucket repository or account.
     */
    url?: pulumi.Input<string>;
    /**
     * Repository to test the connection with. This is only used when `connectionType` is `Account`.
     */
    validationRepo?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BitbucketConnector resource.
 */
export interface BitbucketConnectorArgs {
    /**
     * Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     */
    apiAuthentication?: pulumi.Input<inputs.platform.BitbucketConnectorApiAuthentication>;
    /**
     * Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
     */
    connectionType: pulumi.Input<string>;
    /**
     * Credentials to use for the connection.
     */
    credentials: pulumi.Input<inputs.platform.BitbucketConnectorCredentials>;
    /**
     * Connect using only the delegates which have these tags.
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
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Url of the BitBucket repository or account.
     */
    url: pulumi.Input<string>;
    /**
     * Repository to test the connection with. This is only used when `connectionType` is `Account`.
     */
    validationRepo?: pulumi.Input<string>;
}
