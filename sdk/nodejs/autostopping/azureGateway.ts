// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for creating an Azure Application Gateway
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.autostopping.AzureGateway("test", {
 *     name: "name",
 *     cloudConnectorId: "cloud_connector_id",
 *     hostName: "host_name",
 *     region: "eastus2",
 *     resourceGroup: "resource_group",
 *     subnetId: "/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/virtualNetworks/virtual_network/subnets/subnet_id",
 *     vpc: "/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/virtualNetworks/virtual_network",
 *     azureFuncRegion: "westus2",
 *     frontendIp: "/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/publicIPAddresses/publicip",
 *     skuSize: "sku2",
 *     deleteCloudResourcesOnDestroy: true,
 * });
 * const importTest = new harness.autostopping.AzureGateway("import_test", {
 *     name: "import_test",
 *     cloudConnectorId: "cloud_connector_id",
 *     hostName: "host_name",
 *     region: "westus2",
 *     resourceGroup: "test_resource_group",
 *     appGatewayId: "/subscriptions/subscription_id/resourceGroups/test_resource_group/providers/Microsoft.Network/applicationGateways/TestAppGateway",
 *     certificateId: "/subscriptions/subscription_id/resourceGroups/test_resource_group/providers/Microsoft.Network/applicationGateways/TestAppGateway/sslCertificates/certificate_name",
 *     azureFuncRegion: "westus2",
 *     vpc: "/subscriptions/subscription_id/resourceGroups/test_resource_group/providers/Microsoft.Network/virtualNetworks/test_resource_group_vnet",
 *     deleteCloudResourcesOnDestroy: false,
 * });
 * ```
 */
export class AzureGateway extends pulumi.CustomResource {
    /**
     * Get an existing AzureGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AzureGatewayState, opts?: pulumi.CustomResourceOptions): AzureGateway {
        return new AzureGateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:autostopping/azureGateway:AzureGateway';

    /**
     * Returns true if the given object is an instance of AzureGateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AzureGateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AzureGateway.__pulumiType;
    }

    /**
     * ID of Azure AppGateway for importing. Required only for importing exiging AppGateway
     */
    public readonly appGatewayId!: pulumi.Output<string | undefined>;
    /**
     * Region in which azure cloud function will be provisioned
     */
    public readonly azureFuncRegion!: pulumi.Output<string>;
    /**
     * ID of existing SSL certificate from AppGateway being imported. Required only for importing existing AppGateway. Required only for SSL based rules
     */
    public readonly certificateId!: pulumi.Output<string | undefined>;
    /**
     * Id of the cloud connector
     */
    public readonly cloudConnectorId!: pulumi.Output<string>;
    public readonly deleteCloudResourcesOnDestroy!: pulumi.Output<boolean>;
    /**
     * ID of IP address to be used. Required only for creating new AppGateway. See [https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address](https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address) for more details
     */
    public readonly frontendIp!: pulumi.Output<string | undefined>;
    /**
     * Hostname for the proxy
     */
    public readonly hostName!: pulumi.Output<string>;
    /**
     * Unique identifier of the resource
     */
    public /*out*/ readonly identifier!: pulumi.Output<string>;
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
     * Size of machine used for the gateway. Required only for creating new AppGateway
     */
    public readonly skuSize!: pulumi.Output<string | undefined>;
    /**
     * Subnet in which cloud resources are hosted. Required only for creating new AppGateway
     */
    public readonly subnetId!: pulumi.Output<string | undefined>;
    /**
     * VNet in which cloud resources are hosted. Required only for creating new AppGateway
     */
    public readonly vpc!: pulumi.Output<string>;

    /**
     * Create a AzureGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AzureGatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AzureGatewayArgs | AzureGatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AzureGatewayState | undefined;
            resourceInputs["appGatewayId"] = state ? state.appGatewayId : undefined;
            resourceInputs["azureFuncRegion"] = state ? state.azureFuncRegion : undefined;
            resourceInputs["certificateId"] = state ? state.certificateId : undefined;
            resourceInputs["cloudConnectorId"] = state ? state.cloudConnectorId : undefined;
            resourceInputs["deleteCloudResourcesOnDestroy"] = state ? state.deleteCloudResourcesOnDestroy : undefined;
            resourceInputs["frontendIp"] = state ? state.frontendIp : undefined;
            resourceInputs["hostName"] = state ? state.hostName : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceGroup"] = state ? state.resourceGroup : undefined;
            resourceInputs["skuSize"] = state ? state.skuSize : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
            resourceInputs["vpc"] = state ? state.vpc : undefined;
        } else {
            const args = argsOrState as AzureGatewayArgs | undefined;
            if ((!args || args.azureFuncRegion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'azureFuncRegion'");
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
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.resourceGroup === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroup'");
            }
            if ((!args || args.vpc === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpc'");
            }
            resourceInputs["appGatewayId"] = args ? args.appGatewayId : undefined;
            resourceInputs["azureFuncRegion"] = args ? args.azureFuncRegion : undefined;
            resourceInputs["certificateId"] = args ? args.certificateId : undefined;
            resourceInputs["cloudConnectorId"] = args ? args.cloudConnectorId : undefined;
            resourceInputs["deleteCloudResourcesOnDestroy"] = args ? args.deleteCloudResourcesOnDestroy : undefined;
            resourceInputs["frontendIp"] = args ? args.frontendIp : undefined;
            resourceInputs["hostName"] = args ? args.hostName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resourceGroup"] = args ? args.resourceGroup : undefined;
            resourceInputs["skuSize"] = args ? args.skuSize : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
            resourceInputs["vpc"] = args ? args.vpc : undefined;
            resourceInputs["identifier"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AzureGateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AzureGateway resources.
 */
export interface AzureGatewayState {
    /**
     * ID of Azure AppGateway for importing. Required only for importing exiging AppGateway
     */
    appGatewayId?: pulumi.Input<string>;
    /**
     * Region in which azure cloud function will be provisioned
     */
    azureFuncRegion?: pulumi.Input<string>;
    /**
     * ID of existing SSL certificate from AppGateway being imported. Required only for importing existing AppGateway. Required only for SSL based rules
     */
    certificateId?: pulumi.Input<string>;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId?: pulumi.Input<string>;
    deleteCloudResourcesOnDestroy?: pulumi.Input<boolean>;
    /**
     * ID of IP address to be used. Required only for creating new AppGateway. See [https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address](https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address) for more details
     */
    frontendIp?: pulumi.Input<string>;
    /**
     * Hostname for the proxy
     */
    hostName?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource
     */
    identifier?: pulumi.Input<string>;
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
     * Size of machine used for the gateway. Required only for creating new AppGateway
     */
    skuSize?: pulumi.Input<string>;
    /**
     * Subnet in which cloud resources are hosted. Required only for creating new AppGateway
     */
    subnetId?: pulumi.Input<string>;
    /**
     * VNet in which cloud resources are hosted. Required only for creating new AppGateway
     */
    vpc?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AzureGateway resource.
 */
export interface AzureGatewayArgs {
    /**
     * ID of Azure AppGateway for importing. Required only for importing exiging AppGateway
     */
    appGatewayId?: pulumi.Input<string>;
    /**
     * Region in which azure cloud function will be provisioned
     */
    azureFuncRegion: pulumi.Input<string>;
    /**
     * ID of existing SSL certificate from AppGateway being imported. Required only for importing existing AppGateway. Required only for SSL based rules
     */
    certificateId?: pulumi.Input<string>;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId: pulumi.Input<string>;
    deleteCloudResourcesOnDestroy: pulumi.Input<boolean>;
    /**
     * ID of IP address to be used. Required only for creating new AppGateway. See [https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address](https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address) for more details
     */
    frontendIp?: pulumi.Input<string>;
    /**
     * Hostname for the proxy
     */
    hostName: pulumi.Input<string>;
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
     * Size of machine used for the gateway. Required only for creating new AppGateway
     */
    skuSize?: pulumi.Input<string>;
    /**
     * Subnet in which cloud resources are hosted. Required only for creating new AppGateway
     */
    subnetId?: pulumi.Input<string>;
    /**
     * VNet in which cloud resources are hosted. Required only for creating new AppGateway
     */
    vpc: pulumi.Input<string>;
}
