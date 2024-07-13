# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetAzureGatewayResult',
    'AwaitableGetAzureGatewayResult',
    'get_azure_gateway',
    'get_azure_gateway_output',
]

@pulumi.output_type
class GetAzureGatewayResult:
    """
    A collection of values returned by getAzureGateway.
    """
    def __init__(__self__, app_gateway_id=None, azure_func_region=None, certificate_id=None, cloud_connector_id=None, delete_cloud_resources_on_destroy=None, frontend_ip=None, host_name=None, id=None, identifier=None, name=None, region=None, resource_group=None, sku_size=None, subnet_id=None, vpc=None):
        if app_gateway_id and not isinstance(app_gateway_id, str):
            raise TypeError("Expected argument 'app_gateway_id' to be a str")
        pulumi.set(__self__, "app_gateway_id", app_gateway_id)
        if azure_func_region and not isinstance(azure_func_region, str):
            raise TypeError("Expected argument 'azure_func_region' to be a str")
        pulumi.set(__self__, "azure_func_region", azure_func_region)
        if certificate_id and not isinstance(certificate_id, str):
            raise TypeError("Expected argument 'certificate_id' to be a str")
        pulumi.set(__self__, "certificate_id", certificate_id)
        if cloud_connector_id and not isinstance(cloud_connector_id, str):
            raise TypeError("Expected argument 'cloud_connector_id' to be a str")
        pulumi.set(__self__, "cloud_connector_id", cloud_connector_id)
        if delete_cloud_resources_on_destroy and not isinstance(delete_cloud_resources_on_destroy, bool):
            raise TypeError("Expected argument 'delete_cloud_resources_on_destroy' to be a bool")
        pulumi.set(__self__, "delete_cloud_resources_on_destroy", delete_cloud_resources_on_destroy)
        if frontend_ip and not isinstance(frontend_ip, str):
            raise TypeError("Expected argument 'frontend_ip' to be a str")
        pulumi.set(__self__, "frontend_ip", frontend_ip)
        if host_name and not isinstance(host_name, str):
            raise TypeError("Expected argument 'host_name' to be a str")
        pulumi.set(__self__, "host_name", host_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if resource_group and not isinstance(resource_group, str):
            raise TypeError("Expected argument 'resource_group' to be a str")
        pulumi.set(__self__, "resource_group", resource_group)
        if sku_size and not isinstance(sku_size, str):
            raise TypeError("Expected argument 'sku_size' to be a str")
        pulumi.set(__self__, "sku_size", sku_size)
        if subnet_id and not isinstance(subnet_id, str):
            raise TypeError("Expected argument 'subnet_id' to be a str")
        pulumi.set(__self__, "subnet_id", subnet_id)
        if vpc and not isinstance(vpc, str):
            raise TypeError("Expected argument 'vpc' to be a str")
        pulumi.set(__self__, "vpc", vpc)

    @property
    @pulumi.getter(name="appGatewayId")
    def app_gateway_id(self) -> Optional[str]:
        """
        ID of Azure AppGateway for importing
        """
        return pulumi.get(self, "app_gateway_id")

    @property
    @pulumi.getter(name="azureFuncRegion")
    def azure_func_region(self) -> str:
        """
        Region in which azure cloud function will be provisioned
        """
        return pulumi.get(self, "azure_func_region")

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> Optional[str]:
        """
        ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
        """
        return pulumi.get(self, "certificate_id")

    @property
    @pulumi.getter(name="cloudConnectorId")
    def cloud_connector_id(self) -> str:
        """
        Id of the cloud connector
        """
        return pulumi.get(self, "cloud_connector_id")

    @property
    @pulumi.getter(name="deleteCloudResourcesOnDestroy")
    def delete_cloud_resources_on_destroy(self) -> bool:
        return pulumi.get(self, "delete_cloud_resources_on_destroy")

    @property
    @pulumi.getter(name="frontendIp")
    def frontend_ip(self) -> Optional[str]:
        """
        ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
        """
        return pulumi.get(self, "frontend_ip")

    @property
    @pulumi.getter(name="hostName")
    def host_name(self) -> str:
        """
        Hostname for the proxy
        """
        return pulumi.get(self, "host_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> str:
        """
        Unique identifier of the resource
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the proxy
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Region in which cloud resources are hosted
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceGroup")
    def resource_group(self) -> str:
        """
        Resource group in which cloud resources are hosted
        """
        return pulumi.get(self, "resource_group")

    @property
    @pulumi.getter(name="skuSize")
    def sku_size(self) -> Optional[str]:
        """
        Size of machine used for the gateway
        """
        return pulumi.get(self, "sku_size")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[str]:
        """
        Subnet in which cloud resources are hosted
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter
    def vpc(self) -> str:
        """
        VPC in which cloud resources are hosted
        """
        return pulumi.get(self, "vpc")


class AwaitableGetAzureGatewayResult(GetAzureGatewayResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAzureGatewayResult(
            app_gateway_id=self.app_gateway_id,
            azure_func_region=self.azure_func_region,
            certificate_id=self.certificate_id,
            cloud_connector_id=self.cloud_connector_id,
            delete_cloud_resources_on_destroy=self.delete_cloud_resources_on_destroy,
            frontend_ip=self.frontend_ip,
            host_name=self.host_name,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            region=self.region,
            resource_group=self.resource_group,
            sku_size=self.sku_size,
            subnet_id=self.subnet_id,
            vpc=self.vpc)


def get_azure_gateway(app_gateway_id: Optional[str] = None,
                      azure_func_region: Optional[str] = None,
                      certificate_id: Optional[str] = None,
                      cloud_connector_id: Optional[str] = None,
                      delete_cloud_resources_on_destroy: Optional[bool] = None,
                      frontend_ip: Optional[str] = None,
                      host_name: Optional[str] = None,
                      name: Optional[str] = None,
                      region: Optional[str] = None,
                      resource_group: Optional[str] = None,
                      sku_size: Optional[str] = None,
                      subnet_id: Optional[str] = None,
                      vpc: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAzureGatewayResult:
    """
    Data source for AWS Autostopping proxy


    :param str app_gateway_id: ID of Azure AppGateway for importing
    :param str azure_func_region: Region in which azure cloud function will be provisioned
    :param str certificate_id: ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
    :param str cloud_connector_id: Id of the cloud connector
    :param str frontend_ip: ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
    :param str host_name: Hostname for the proxy
    :param str name: Name of the proxy
    :param str region: Region in which cloud resources are hosted
    :param str resource_group: Resource group in which cloud resources are hosted
    :param str sku_size: Size of machine used for the gateway
    :param str subnet_id: Subnet in which cloud resources are hosted
    :param str vpc: VPC in which cloud resources are hosted
    """
    __args__ = dict()
    __args__['appGatewayId'] = app_gateway_id
    __args__['azureFuncRegion'] = azure_func_region
    __args__['certificateId'] = certificate_id
    __args__['cloudConnectorId'] = cloud_connector_id
    __args__['deleteCloudResourcesOnDestroy'] = delete_cloud_resources_on_destroy
    __args__['frontendIp'] = frontend_ip
    __args__['hostName'] = host_name
    __args__['name'] = name
    __args__['region'] = region
    __args__['resourceGroup'] = resource_group
    __args__['skuSize'] = sku_size
    __args__['subnetId'] = subnet_id
    __args__['vpc'] = vpc
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:autostopping/getAzureGateway:getAzureGateway', __args__, opts=opts, typ=GetAzureGatewayResult).value

    return AwaitableGetAzureGatewayResult(
        app_gateway_id=pulumi.get(__ret__, 'app_gateway_id'),
        azure_func_region=pulumi.get(__ret__, 'azure_func_region'),
        certificate_id=pulumi.get(__ret__, 'certificate_id'),
        cloud_connector_id=pulumi.get(__ret__, 'cloud_connector_id'),
        delete_cloud_resources_on_destroy=pulumi.get(__ret__, 'delete_cloud_resources_on_destroy'),
        frontend_ip=pulumi.get(__ret__, 'frontend_ip'),
        host_name=pulumi.get(__ret__, 'host_name'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        region=pulumi.get(__ret__, 'region'),
        resource_group=pulumi.get(__ret__, 'resource_group'),
        sku_size=pulumi.get(__ret__, 'sku_size'),
        subnet_id=pulumi.get(__ret__, 'subnet_id'),
        vpc=pulumi.get(__ret__, 'vpc'))


@_utilities.lift_output_func(get_azure_gateway)
def get_azure_gateway_output(app_gateway_id: Optional[pulumi.Input[Optional[str]]] = None,
                             azure_func_region: Optional[pulumi.Input[str]] = None,
                             certificate_id: Optional[pulumi.Input[Optional[str]]] = None,
                             cloud_connector_id: Optional[pulumi.Input[str]] = None,
                             delete_cloud_resources_on_destroy: Optional[pulumi.Input[bool]] = None,
                             frontend_ip: Optional[pulumi.Input[Optional[str]]] = None,
                             host_name: Optional[pulumi.Input[str]] = None,
                             name: Optional[pulumi.Input[str]] = None,
                             region: Optional[pulumi.Input[str]] = None,
                             resource_group: Optional[pulumi.Input[str]] = None,
                             sku_size: Optional[pulumi.Input[Optional[str]]] = None,
                             subnet_id: Optional[pulumi.Input[Optional[str]]] = None,
                             vpc: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAzureGatewayResult]:
    """
    Data source for AWS Autostopping proxy


    :param str app_gateway_id: ID of Azure AppGateway for importing
    :param str azure_func_region: Region in which azure cloud function will be provisioned
    :param str certificate_id: ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
    :param str cloud_connector_id: Id of the cloud connector
    :param str frontend_ip: ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
    :param str host_name: Hostname for the proxy
    :param str name: Name of the proxy
    :param str region: Region in which cloud resources are hosted
    :param str resource_group: Resource group in which cloud resources are hosted
    :param str sku_size: Size of machine used for the gateway
    :param str subnet_id: Subnet in which cloud resources are hosted
    :param str vpc: VPC in which cloud resources are hosted
    """
    ...