# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetGcpProxyResult',
    'AwaitableGetGcpProxyResult',
    'get_gcp_proxy',
    'get_gcp_proxy_output',
]

@pulumi.output_type
class GetGcpProxyResult:
    """
    A collection of values returned by getGcpProxy.
    """
    def __init__(__self__, allocate_static_ip=None, api_key=None, certificates=None, cloud_connector_id=None, delete_cloud_resources_on_destroy=None, host_name=None, id=None, identifier=None, machine_type=None, name=None, region=None, security_groups=None, subnet_id=None, vpc=None, zone=None):
        if allocate_static_ip and not isinstance(allocate_static_ip, bool):
            raise TypeError("Expected argument 'allocate_static_ip' to be a bool")
        pulumi.set(__self__, "allocate_static_ip", allocate_static_ip)
        if api_key and not isinstance(api_key, str):
            raise TypeError("Expected argument 'api_key' to be a str")
        pulumi.set(__self__, "api_key", api_key)
        if certificates and not isinstance(certificates, dict):
            raise TypeError("Expected argument 'certificates' to be a dict")
        pulumi.set(__self__, "certificates", certificates)
        if cloud_connector_id and not isinstance(cloud_connector_id, str):
            raise TypeError("Expected argument 'cloud_connector_id' to be a str")
        pulumi.set(__self__, "cloud_connector_id", cloud_connector_id)
        if delete_cloud_resources_on_destroy and not isinstance(delete_cloud_resources_on_destroy, bool):
            raise TypeError("Expected argument 'delete_cloud_resources_on_destroy' to be a bool")
        pulumi.set(__self__, "delete_cloud_resources_on_destroy", delete_cloud_resources_on_destroy)
        if host_name and not isinstance(host_name, str):
            raise TypeError("Expected argument 'host_name' to be a str")
        pulumi.set(__self__, "host_name", host_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if machine_type and not isinstance(machine_type, str):
            raise TypeError("Expected argument 'machine_type' to be a str")
        pulumi.set(__self__, "machine_type", machine_type)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if security_groups and not isinstance(security_groups, list):
            raise TypeError("Expected argument 'security_groups' to be a list")
        pulumi.set(__self__, "security_groups", security_groups)
        if subnet_id and not isinstance(subnet_id, str):
            raise TypeError("Expected argument 'subnet_id' to be a str")
        pulumi.set(__self__, "subnet_id", subnet_id)
        if vpc and not isinstance(vpc, str):
            raise TypeError("Expected argument 'vpc' to be a str")
        pulumi.set(__self__, "vpc", vpc)
        if zone and not isinstance(zone, str):
            raise TypeError("Expected argument 'zone' to be a str")
        pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="allocateStaticIp")
    def allocate_static_ip(self) -> Optional[bool]:
        """
        Boolean value to indicate if proxy vm needs to have static IP
        """
        return pulumi.get(self, "allocate_static_ip")

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> str:
        """
        Harness NG API key
        """
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter
    def certificates(self) -> Optional['outputs.GetGcpProxyCertificatesResult']:
        return pulumi.get(self, "certificates")

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
    @pulumi.getter(name="machineType")
    def machine_type(self) -> str:
        """
        Machine instance type
        """
        return pulumi.get(self, "machine_type")

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
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Optional[Sequence[str]]:
        """
        Security Group to define the security rules that determine the inbound and outbound traffic
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> str:
        """
        VPC in which cloud resources are hosted
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter
    def vpc(self) -> str:
        """
        VPC in which cloud resources are hosted
        """
        return pulumi.get(self, "vpc")

    @property
    @pulumi.getter
    def zone(self) -> str:
        """
        Zone in which cloud resources are hosted
        """
        return pulumi.get(self, "zone")


class AwaitableGetGcpProxyResult(GetGcpProxyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGcpProxyResult(
            allocate_static_ip=self.allocate_static_ip,
            api_key=self.api_key,
            certificates=self.certificates,
            cloud_connector_id=self.cloud_connector_id,
            delete_cloud_resources_on_destroy=self.delete_cloud_resources_on_destroy,
            host_name=self.host_name,
            id=self.id,
            identifier=self.identifier,
            machine_type=self.machine_type,
            name=self.name,
            region=self.region,
            security_groups=self.security_groups,
            subnet_id=self.subnet_id,
            vpc=self.vpc,
            zone=self.zone)


def get_gcp_proxy(allocate_static_ip: Optional[bool] = None,
                  api_key: Optional[str] = None,
                  certificates: Optional[Union['GetGcpProxyCertificatesArgs', 'GetGcpProxyCertificatesArgsDict']] = None,
                  cloud_connector_id: Optional[str] = None,
                  delete_cloud_resources_on_destroy: Optional[bool] = None,
                  host_name: Optional[str] = None,
                  machine_type: Optional[str] = None,
                  name: Optional[str] = None,
                  region: Optional[str] = None,
                  security_groups: Optional[Sequence[str]] = None,
                  subnet_id: Optional[str] = None,
                  vpc: Optional[str] = None,
                  zone: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGcpProxyResult:
    """
    Data source for GCP Autostopping proxy


    :param bool allocate_static_ip: Boolean value to indicate if proxy vm needs to have static IP
    :param str api_key: Harness NG API key
    :param str cloud_connector_id: Id of the cloud connector
    :param str host_name: Hostname for the proxy
    :param str machine_type: Machine instance type
    :param str name: Name of the proxy
    :param str region: Region in which cloud resources are hosted
    :param Sequence[str] security_groups: Security Group to define the security rules that determine the inbound and outbound traffic
    :param str subnet_id: VPC in which cloud resources are hosted
    :param str vpc: VPC in which cloud resources are hosted
    :param str zone: Zone in which cloud resources are hosted
    """
    __args__ = dict()
    __args__['allocateStaticIp'] = allocate_static_ip
    __args__['apiKey'] = api_key
    __args__['certificates'] = certificates
    __args__['cloudConnectorId'] = cloud_connector_id
    __args__['deleteCloudResourcesOnDestroy'] = delete_cloud_resources_on_destroy
    __args__['hostName'] = host_name
    __args__['machineType'] = machine_type
    __args__['name'] = name
    __args__['region'] = region
    __args__['securityGroups'] = security_groups
    __args__['subnetId'] = subnet_id
    __args__['vpc'] = vpc
    __args__['zone'] = zone
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:autostopping/getGcpProxy:getGcpProxy', __args__, opts=opts, typ=GetGcpProxyResult).value

    return AwaitableGetGcpProxyResult(
        allocate_static_ip=pulumi.get(__ret__, 'allocate_static_ip'),
        api_key=pulumi.get(__ret__, 'api_key'),
        certificates=pulumi.get(__ret__, 'certificates'),
        cloud_connector_id=pulumi.get(__ret__, 'cloud_connector_id'),
        delete_cloud_resources_on_destroy=pulumi.get(__ret__, 'delete_cloud_resources_on_destroy'),
        host_name=pulumi.get(__ret__, 'host_name'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        machine_type=pulumi.get(__ret__, 'machine_type'),
        name=pulumi.get(__ret__, 'name'),
        region=pulumi.get(__ret__, 'region'),
        security_groups=pulumi.get(__ret__, 'security_groups'),
        subnet_id=pulumi.get(__ret__, 'subnet_id'),
        vpc=pulumi.get(__ret__, 'vpc'),
        zone=pulumi.get(__ret__, 'zone'))
def get_gcp_proxy_output(allocate_static_ip: Optional[pulumi.Input[Optional[bool]]] = None,
                         api_key: Optional[pulumi.Input[str]] = None,
                         certificates: Optional[pulumi.Input[Optional[Union['GetGcpProxyCertificatesArgs', 'GetGcpProxyCertificatesArgsDict']]]] = None,
                         cloud_connector_id: Optional[pulumi.Input[str]] = None,
                         delete_cloud_resources_on_destroy: Optional[pulumi.Input[bool]] = None,
                         host_name: Optional[pulumi.Input[str]] = None,
                         machine_type: Optional[pulumi.Input[str]] = None,
                         name: Optional[pulumi.Input[str]] = None,
                         region: Optional[pulumi.Input[str]] = None,
                         security_groups: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         subnet_id: Optional[pulumi.Input[str]] = None,
                         vpc: Optional[pulumi.Input[str]] = None,
                         zone: Optional[pulumi.Input[str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGcpProxyResult]:
    """
    Data source for GCP Autostopping proxy


    :param bool allocate_static_ip: Boolean value to indicate if proxy vm needs to have static IP
    :param str api_key: Harness NG API key
    :param str cloud_connector_id: Id of the cloud connector
    :param str host_name: Hostname for the proxy
    :param str machine_type: Machine instance type
    :param str name: Name of the proxy
    :param str region: Region in which cloud resources are hosted
    :param Sequence[str] security_groups: Security Group to define the security rules that determine the inbound and outbound traffic
    :param str subnet_id: VPC in which cloud resources are hosted
    :param str vpc: VPC in which cloud resources are hosted
    :param str zone: Zone in which cloud resources are hosted
    """
    __args__ = dict()
    __args__['allocateStaticIp'] = allocate_static_ip
    __args__['apiKey'] = api_key
    __args__['certificates'] = certificates
    __args__['cloudConnectorId'] = cloud_connector_id
    __args__['deleteCloudResourcesOnDestroy'] = delete_cloud_resources_on_destroy
    __args__['hostName'] = host_name
    __args__['machineType'] = machine_type
    __args__['name'] = name
    __args__['region'] = region
    __args__['securityGroups'] = security_groups
    __args__['subnetId'] = subnet_id
    __args__['vpc'] = vpc
    __args__['zone'] = zone
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:autostopping/getGcpProxy:getGcpProxy', __args__, opts=opts, typ=GetGcpProxyResult)
    return __ret__.apply(lambda __response__: GetGcpProxyResult(
        allocate_static_ip=pulumi.get(__response__, 'allocate_static_ip'),
        api_key=pulumi.get(__response__, 'api_key'),
        certificates=pulumi.get(__response__, 'certificates'),
        cloud_connector_id=pulumi.get(__response__, 'cloud_connector_id'),
        delete_cloud_resources_on_destroy=pulumi.get(__response__, 'delete_cloud_resources_on_destroy'),
        host_name=pulumi.get(__response__, 'host_name'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        machine_type=pulumi.get(__response__, 'machine_type'),
        name=pulumi.get(__response__, 'name'),
        region=pulumi.get(__response__, 'region'),
        security_groups=pulumi.get(__response__, 'security_groups'),
        subnet_id=pulumi.get(__response__, 'subnet_id'),
        vpc=pulumi.get(__response__, 'vpc'),
        zone=pulumi.get(__response__, 'zone')))
