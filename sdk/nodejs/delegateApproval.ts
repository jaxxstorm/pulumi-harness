// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Resource for approving or rejecting delegates.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.getDelegate({
 *     name: "my-delegate",
 * });
 * const testDelegateApproval = new harness.DelegateApproval("test", {
 *     delegateId: test.then(test => test.id),
 *     approve: true,
 * });
 * ```
 *
 * ## Import
 *
 * Import the status of the delegate approval.
 *
 * ```sh
 * $ pulumi import harness:index/delegateApproval:DelegateApproval example <delegate_id>
 * ```
 */
export class DelegateApproval extends pulumi.CustomResource {
    /**
     * Get an existing DelegateApproval resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DelegateApprovalState, opts?: pulumi.CustomResourceOptions): DelegateApproval {
        return new DelegateApproval(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/delegateApproval:DelegateApproval';

    /**
     * Returns true if the given object is an instance of DelegateApproval.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DelegateApproval {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DelegateApproval.__pulumiType;
    }

    /**
     * Whether or not to approve the delegate.
     */
    public readonly approve!: pulumi.Output<boolean>;
    /**
     * The id of the delegate.
     */
    public readonly delegateId!: pulumi.Output<string>;
    /**
     * The status of the delegate.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a DelegateApproval resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DelegateApprovalArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DelegateApprovalArgs | DelegateApprovalState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DelegateApprovalState | undefined;
            resourceInputs["approve"] = state ? state.approve : undefined;
            resourceInputs["delegateId"] = state ? state.delegateId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as DelegateApprovalArgs | undefined;
            if ((!args || args.approve === undefined) && !opts.urn) {
                throw new Error("Missing required property 'approve'");
            }
            if ((!args || args.delegateId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'delegateId'");
            }
            resourceInputs["approve"] = args ? args.approve : undefined;
            resourceInputs["delegateId"] = args ? args.delegateId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DelegateApproval.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DelegateApproval resources.
 */
export interface DelegateApprovalState {
    /**
     * Whether or not to approve the delegate.
     */
    approve?: pulumi.Input<boolean>;
    /**
     * The id of the delegate.
     */
    delegateId?: pulumi.Input<string>;
    /**
     * The status of the delegate.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DelegateApproval resource.
 */
export interface DelegateApprovalArgs {
    /**
     * Whether or not to approve the delegate.
     */
    approve: pulumi.Input<boolean>;
    /**
     * The id of the delegate.
     */
    delegateId: pulumi.Input<string>;
}