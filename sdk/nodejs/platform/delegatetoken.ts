// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class Delegatetoken extends pulumi.CustomResource {
    /**
     * Get an existing Delegatetoken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DelegatetokenState, opts?: pulumi.CustomResourceOptions): Delegatetoken {
        return new Delegatetoken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/delegatetoken:Delegatetoken';

    /**
     * Returns true if the given object is an instance of Delegatetoken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Delegatetoken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Delegatetoken.__pulumiType;
    }

    /**
     * Account Identifier for the Entity
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Time when the delegate token is created. This is an epoch timestamp.
     */
    public readonly createdAt!: pulumi.Output<number>;
    /**
     * created by details
     */
    public readonly createdBy!: pulumi.Output<{[key: string]: any}>;
    /**
     * Name of the delegate token
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Org Identifier for the Entity
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Project Identifier for the Entity
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed
     */
    public readonly tokenStatus!: pulumi.Output<string>;
    /**
     * Value of the delegate token. Encoded in base64.
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a Delegatetoken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DelegatetokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DelegatetokenArgs | DelegatetokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DelegatetokenState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tokenStatus"] = state ? state.tokenStatus : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as DelegatetokenArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["createdAt"] = args ? args.createdAt : undefined;
            resourceInputs["createdBy"] = args ? args.createdBy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tokenStatus"] = args ? args.tokenStatus : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Delegatetoken.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Delegatetoken resources.
 */
export interface DelegatetokenState {
    /**
     * Account Identifier for the Entity
     */
    accountId?: pulumi.Input<string>;
    /**
     * Time when the delegate token is created. This is an epoch timestamp.
     */
    createdAt?: pulumi.Input<number>;
    /**
     * created by details
     */
    createdBy?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the delegate token
     */
    name?: pulumi.Input<string>;
    /**
     * Org Identifier for the Entity
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier for the Entity
     */
    projectId?: pulumi.Input<string>;
    /**
     * Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed
     */
    tokenStatus?: pulumi.Input<string>;
    /**
     * Value of the delegate token. Encoded in base64.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Delegatetoken resource.
 */
export interface DelegatetokenArgs {
    /**
     * Account Identifier for the Entity
     */
    accountId: pulumi.Input<string>;
    /**
     * Time when the delegate token is created. This is an epoch timestamp.
     */
    createdAt?: pulumi.Input<number>;
    /**
     * created by details
     */
    createdBy?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the delegate token
     */
    name?: pulumi.Input<string>;
    /**
     * Org Identifier for the Entity
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier for the Entity
     */
    projectId?: pulumi.Input<string>;
    /**
     * Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed
     */
    tokenStatus?: pulumi.Input<string>;
    /**
     * Value of the delegate token. Encoded in base64.
     */
    value?: pulumi.Input<string>;
}