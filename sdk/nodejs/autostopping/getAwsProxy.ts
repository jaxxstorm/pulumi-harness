// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for AWS Autostopping proxy
 */
export function getAwsProxy(args: GetAwsProxyArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsProxyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:autostopping/getAwsProxy:getAwsProxy", {
        "allocateStaticIp": args.allocateStaticIp,
        "apiKey": args.apiKey,
        "certificates": args.certificates,
        "cloudConnectorId": args.cloudConnectorId,
        "deleteCloudResourcesOnDestroy": args.deleteCloudResourcesOnDestroy,
        "hostName": args.hostName,
        "keypair": args.keypair,
        "machineType": args.machineType,
        "name": args.name,
        "region": args.region,
        "route53HostedZoneId": args.route53HostedZoneId,
        "securityGroups": args.securityGroups,
        "vpc": args.vpc,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsProxy.
 */
export interface GetAwsProxyArgs {
    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    allocateStaticIp?: boolean;
    /**
     * Harness NG API key
     */
    apiKey: string;
    certificates?: inputs.autostopping.GetAwsProxyCertificates;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId: string;
    deleteCloudResourcesOnDestroy: boolean;
    /**
     * Hostname for the proxy
     */
    hostName: string;
    keypair?: string;
    /**
     * Machine instance type
     */
    machineType: string;
    /**
     * Name of the proxy
     */
    name: string;
    /**
     * Region in which cloud resources are hosted
     */
    region: string;
    /**
     * Route 53 hosted zone id
     */
    route53HostedZoneId?: string;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    securityGroups?: string[];
    /**
     * VPC in which cloud resources are hosted
     */
    vpc: string;
}

/**
 * A collection of values returned by getAwsProxy.
 */
export interface GetAwsProxyResult {
    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    readonly allocateStaticIp?: boolean;
    /**
     * Harness NG API key
     */
    readonly apiKey: string;
    readonly certificates?: outputs.autostopping.GetAwsProxyCertificates;
    /**
     * Id of the cloud connector
     */
    readonly cloudConnectorId: string;
    readonly deleteCloudResourcesOnDestroy: boolean;
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
    readonly keypair?: string;
    /**
     * Machine instance type
     */
    readonly machineType: string;
    /**
     * Name of the proxy
     */
    readonly name: string;
    /**
     * Region in which cloud resources are hosted
     */
    readonly region: string;
    /**
     * Route 53 hosted zone id
     */
    readonly route53HostedZoneId?: string;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    readonly securityGroups?: string[];
    /**
     * VPC in which cloud resources are hosted
     */
    readonly vpc: string;
}
/**
 * Data source for AWS Autostopping proxy
 */
export function getAwsProxyOutput(args: GetAwsProxyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAwsProxyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:autostopping/getAwsProxy:getAwsProxy", {
        "allocateStaticIp": args.allocateStaticIp,
        "apiKey": args.apiKey,
        "certificates": args.certificates,
        "cloudConnectorId": args.cloudConnectorId,
        "deleteCloudResourcesOnDestroy": args.deleteCloudResourcesOnDestroy,
        "hostName": args.hostName,
        "keypair": args.keypair,
        "machineType": args.machineType,
        "name": args.name,
        "region": args.region,
        "route53HostedZoneId": args.route53HostedZoneId,
        "securityGroups": args.securityGroups,
        "vpc": args.vpc,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsProxy.
 */
export interface GetAwsProxyOutputArgs {
    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     */
    allocateStaticIp?: pulumi.Input<boolean>;
    /**
     * Harness NG API key
     */
    apiKey: pulumi.Input<string>;
    certificates?: pulumi.Input<inputs.autostopping.GetAwsProxyCertificatesArgs>;
    /**
     * Id of the cloud connector
     */
    cloudConnectorId: pulumi.Input<string>;
    deleteCloudResourcesOnDestroy: pulumi.Input<boolean>;
    /**
     * Hostname for the proxy
     */
    hostName: pulumi.Input<string>;
    keypair?: pulumi.Input<string>;
    /**
     * Machine instance type
     */
    machineType: pulumi.Input<string>;
    /**
     * Name of the proxy
     */
    name: pulumi.Input<string>;
    /**
     * Region in which cloud resources are hosted
     */
    region: pulumi.Input<string>;
    /**
     * Route 53 hosted zone id
     */
    route53HostedZoneId?: pulumi.Input<string>;
    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * VPC in which cloud resources are hosted
     */
    vpc: pulumi.Input<string>;
}
