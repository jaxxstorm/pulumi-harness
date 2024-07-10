// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating an Azure autostopping proxy
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.autostopping.AzureProxy("test", {
 *     name: "name",
 *     cloudConnectorId: "cloud_connector_id",
 *     hostName: "host_name",
 *     region: "eastus2",
 *     resourceGroup: "resource_group",
 *     vpc: "/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/virtualNetworks/virtual_network",
 *     subnetId: "/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/virtualNetworks/virtual_network/subnets/subnet_id",
 *     securityGroups: ["/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/networkSecurityGroups/network_security_group"],
 *     allocateStaticIp: true,
 *     machineType: "Standard_D2s_v3",
 *     keypair: "",
 *     apiKey: "",
 *     deleteCloudResourcesOnDestroy: true,
 * });
 * ```
 */
export class AzureProxy extends pulumi.CustomResource {
    /**
     * Get an existing AzureProxy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AzureProxyState, opts?: pulumi.CustomResourceOptions): AzureProxy {
        return new AzureProxy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:autostopping/azureProxy:AzureProxy';

    /**
     * Returns true if the given object is an instance of AzureProxy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AzureProxy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AzureProxy.__pulumiType;
    }

    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    public readonly allocateStaticIp!: pulumi.Output<boolean | undefined>;
    /**
     * Harness NG API key
     */
    public readonly apiKey!: pulumi.Output<string>;
    public readonly certificateId!: pulumi.Output<string | undefined>;
    public readonly certificates!: pulumi.Output<outputs.autostopping.AzureProxyCertificates | undefined>;
    /**
     * Id of the cloud connector
     */
    public readonly cloudConnectorId!: pulumi.Output<string>;
    public readonly deleteCloudResourcesOnDestroy!: pulumi.Output<boolean>;
    /**
     * Hostname for the proxy
     */
    public readonly hostName!: pulumi.Output<string>;
    /**
     * Unique identifier of the resource
     */
    public /*out*/ readonly identifier!: pulumi.Output<string>;
    /**
     * Name of SSH Key to be used for proxy VM
     */
    public readonly keypair!: pulumi.Output<string>;
    /**
     * Type of instance to be used for proxy
     */
    public readonly machineType!: pulumi.Output<string>;
    /**
     * Name of the proxy
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Region in which cloud resources are hosted
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Resource group in which cloud resources are hosted
     */
    public readonly resourceGroup!: pulumi.Output<string>;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    public readonly securityGroups!: pulumi.Output<string[] | undefined>;
    /**
     * Subnet in which cloud resources are hosted
     */
    public readonly subnetId!: pulumi.Output<string>;
    /**
     * VPC in which cloud resources are hosted
     */
    public readonly vpc!: pulumi.Output<string>;

    /**
     * Create a AzureProxy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AzureProxyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AzureProxyArgs | AzureProxyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AzureProxyState | undefined;
            resourceInputs["allocateStaticIp"] = state ? state.allocateStaticIp : undefined;
            resourceInputs["apiKey"] = state ? state.apiKey : undefined;
            resourceInputs["certificateId"] = state ? state.certificateId : undefined;
            resourceInputs["certificates"] = state ? state.certificates : undefined;
            resourceInputs["cloudConnectorId"] = state ? state.cloudConnectorId : undefined;
            resourceInputs["deleteCloudResourcesOnDestroy"] = state ? state.deleteCloudResourcesOnDestroy : undefined;
            resourceInputs["hostName"] = state ? state.hostName : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["keypair"] = state ? state.keypair : undefined;
            resourceInputs["machineType"] = state ? state.machineType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceGroup"] = state ? state.resourceGroup : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
            resourceInputs["vpc"] = state ? state.vpc : undefined;
        } else {
            const args = argsOrState as AzureProxyArgs | undefined;
            if ((!args || args.apiKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiKey'");
            }
            if ((!args || args.cloudConnectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloudConnectorId'");
            }
            if ((!args || args.deleteCloudResourcesOnDestroy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deleteCloudResourcesOnDestroy'");
            }
            if ((!args || args.hostName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostName'");
            }
            if ((!args || args.keypair === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keypair'");
            }
            if ((!args || args.machineType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'machineType'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.resourceGroup === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroup'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            if ((!args || args.vpc === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpc'");
            }
            resourceInputs["allocateStaticIp"] = args ? args.allocateStaticIp : undefined;
            resourceInputs["apiKey"] = args?.apiKey ? pulumi.secret(args.apiKey) : undefined;
            resourceInputs["certificateId"] = args ? args.certificateId : undefined;
            resourceInputs["certificates"] = args ? args.certificates : undefined;
            resourceInputs["cloudConnectorId"] = args ? args.cloudConnectorId : undefined;
            resourceInputs["deleteCloudResourcesOnDestroy"] = args ? args.deleteCloudResourcesOnDestroy : undefined;
            resourceInputs["hostName"] = args ? args.hostName : undefined;
            resourceInputs["keypair"] = args ? args.keypair : undefined;
            resourceInputs["machineType"] = args ? args.machineType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resourceGroup"] = args ? args.resourceGroup : undefined;
            resourceInputs["securityGroups"] = args ? args.securityGroups : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
            resourceInputs["vpc"] = args ? args.vpc : undefined;
            resourceInputs["identifier"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AzureProxy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AzureProxy resources.
 */
export interface AzureProxyState {
    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    allocateStaticIp?: pulumi.Input<boolean>;
    /**
     * Harness NG API key
     */
    apiKey?: pulumi.Input<string>;
    certificateId?: pulumi.Input<string>;
    certificates?: pulumi.Input<inputs.autostopping.AzureProxyCertificates>;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId?: pulumi.Input<string>;
    deleteCloudResourcesOnDestroy?: pulumi.Input<boolean>;
    /**
     * Hostname for the proxy
     */
    hostName?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of SSH Key to be used for proxy VM
     */
    keypair?: pulumi.Input<string>;
    /**
     * Type of instance to be used for proxy
     */
    machineType?: pulumi.Input<string>;
    /**
     * Name of the proxy
     */
    name?: pulumi.Input<string>;
    /**
     * Region in which cloud resources are hosted
     */
    region?: pulumi.Input<string>;
    /**
     * Resource group in which cloud resources are hosted
     */
    resourceGroup?: pulumi.Input<string>;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Subnet in which cloud resources are hosted
     */
    subnetId?: pulumi.Input<string>;
    /**
     * VPC in which cloud resources are hosted
     */
    vpc?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AzureProxy resource.
 */
export interface AzureProxyArgs {
    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    allocateStaticIp?: pulumi.Input<boolean>;
    /**
     * Harness NG API key
     */
    apiKey: pulumi.Input<string>;
    certificateId?: pulumi.Input<string>;
    certificates?: pulumi.Input<inputs.autostopping.AzureProxyCertificates>;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId: pulumi.Input<string>;
    deleteCloudResourcesOnDestroy: pulumi.Input<boolean>;
    /**
     * Hostname for the proxy
     */
    hostName: pulumi.Input<string>;
    /**
     * Name of SSH Key to be used for proxy VM
     */
    keypair: pulumi.Input<string>;
    /**
     * Type of instance to be used for proxy
     */
    machineType: pulumi.Input<string>;
    /**
     * Name of the proxy
     */
    name?: pulumi.Input<string>;
    /**
     * Region in which cloud resources are hosted
     */
    region: pulumi.Input<string>;
    /**
     * Resource group in which cloud resources are hosted
     */
    resourceGroup: pulumi.Input<string>;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Subnet in which cloud resources are hosted
     */
    subnetId: pulumi.Input<string>;
    /**
     * VPC in which cloud resources are hosted
     */
    vpc: pulumi.Input<string>;
}
