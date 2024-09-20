// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for AWS Autostopping proxy
 */
export function getAzureGateway(args: GetAzureGatewayArgs, opts?: pulumi.InvokeOptions): Promise<GetAzureGatewayResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:autostopping/getAzureGateway:getAzureGateway", {
        "appGatewayId": args.appGatewayId,
        "azureFuncRegion": args.azureFuncRegion,
        "certificateId": args.certificateId,
        "cloudConnectorId": args.cloudConnectorId,
        "deleteCloudResourcesOnDestroy": args.deleteCloudResourcesOnDestroy,
        "frontendIp": args.frontendIp,
        "hostName": args.hostName,
        "name": args.name,
        "region": args.region,
        "resourceGroup": args.resourceGroup,
        "skuSize": args.skuSize,
        "subnetId": args.subnetId,
        "vpc": args.vpc,
    }, opts);
}

/**
 * A collection of arguments for invoking getAzureGateway.
 */
export interface GetAzureGatewayArgs {
    /**
     * ID of Azure AppGateway for importing
     */
    appGatewayId?: string;
    /**
     * Region in which azure cloud function will be provisioned
     */
    azureFuncRegion: string;
    /**
     * ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
     */
    certificateId?: string;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId: string;
    deleteCloudResourcesOnDestroy: boolean;
    /**
     * ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
     */
    frontendIp?: string;
    /**
     * Hostname for the proxy
     */
    hostName: string;
    /**
     * Name of the proxy
     */
    name: string;
    /**
     * Region in which cloud resources are hosted
     */
    region: string;
    /**
     * Resource group in which cloud resources are hosted
     */
    resourceGroup: string;
    /**
     * Size of machine used for the gateway
     */
    skuSize?: string;
    /**
     * Subnet in which cloud resources are hosted
     */
    subnetId?: string;
    /**
     * VPC in which cloud resources are hosted
     */
    vpc: string;
}

/**
 * A collection of values returned by getAzureGateway.
 */
export interface GetAzureGatewayResult {
    /**
     * ID of Azure AppGateway for importing
     */
    readonly appGatewayId?: string;
    /**
     * Region in which azure cloud function will be provisioned
     */
    readonly azureFuncRegion: string;
    /**
     * ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
     */
    readonly certificateId?: string;
    /**
     * Id of the cloud connector
     */
    readonly cloudConnectorId: string;
    readonly deleteCloudResourcesOnDestroy: boolean;
    /**
     * ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
     */
    readonly frontendIp?: string;
    /**
     * Hostname for the proxy
     */
    readonly hostName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource
     */
    readonly identifier: string;
    /**
     * Name of the proxy
     */
    readonly name: string;
    /**
     * Region in which cloud resources are hosted
     */
    readonly region: string;
    /**
     * Resource group in which cloud resources are hosted
     */
    readonly resourceGroup: string;
    /**
     * Size of machine used for the gateway
     */
    readonly skuSize?: string;
    /**
     * Subnet in which cloud resources are hosted
     */
    readonly subnetId?: string;
    /**
     * VPC in which cloud resources are hosted
     */
    readonly vpc: string;
}
/**
 * Data source for AWS Autostopping proxy
 */
export function getAzureGatewayOutput(args: GetAzureGatewayOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAzureGatewayResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:autostopping/getAzureGateway:getAzureGateway", {
        "appGatewayId": args.appGatewayId,
        "azureFuncRegion": args.azureFuncRegion,
        "certificateId": args.certificateId,
        "cloudConnectorId": args.cloudConnectorId,
        "deleteCloudResourcesOnDestroy": args.deleteCloudResourcesOnDestroy,
        "frontendIp": args.frontendIp,
        "hostName": args.hostName,
        "name": args.name,
        "region": args.region,
        "resourceGroup": args.resourceGroup,
        "skuSize": args.skuSize,
        "subnetId": args.subnetId,
        "vpc": args.vpc,
    }, opts);
}

/**
 * A collection of arguments for invoking getAzureGateway.
 */
export interface GetAzureGatewayOutputArgs {
    /**
     * ID of Azure AppGateway for importing
     */
    appGatewayId?: pulumi.Input<string>;
    /**
     * Region in which azure cloud function will be provisioned
     */
    azureFuncRegion: pulumi.Input<string>;
    /**
     * ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
     */
    certificateId?: pulumi.Input<string>;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId: pulumi.Input<string>;
    deleteCloudResourcesOnDestroy: pulumi.Input<boolean>;
    /**
     * ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
     */
    frontendIp?: pulumi.Input<string>;
    /**
     * Hostname for the proxy
     */
    hostName: pulumi.Input<string>;
    /**
     * Name of the proxy
     */
    name: pulumi.Input<string>;
    /**
     * Region in which cloud resources are hosted
     */
    region: pulumi.Input<string>;
    /**
     * Resource group in which cloud resources are hosted
     */
    resourceGroup: pulumi.Input<string>;
    /**
     * Size of machine used for the gateway
     */
    skuSize?: pulumi.Input<string>;
    /**
     * Subnet in which cloud resources are hosted
     */
    subnetId?: pulumi.Input<string>;
    /**
     * VPC in which cloud resources are hosted
     */
    vpc: pulumi.Input<string>;
}
