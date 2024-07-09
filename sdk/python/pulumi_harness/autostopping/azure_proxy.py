# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AzureProxyArgs', 'AzureProxy']

@pulumi.input_type
class AzureProxyArgs:
    def __init__(__self__, *,
                 api_key: pulumi.Input[str],
                 cloud_connector_id: pulumi.Input[str],
                 delete_cloud_resources_on_destroy: pulumi.Input[bool],
                 host_name: pulumi.Input[str],
                 keypair: pulumi.Input[str],
                 machine_type: pulumi.Input[str],
                 region: pulumi.Input[str],
                 resource_group: pulumi.Input[str],
                 subnet_id: pulumi.Input[str],
                 vpc: pulumi.Input[str],
                 allocate_static_ip: Optional[pulumi.Input[bool]] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificates: Optional[pulumi.Input['AzureProxyCertificatesArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a AzureProxy resource.
        :param pulumi.Input[str] api_key: Harness NG API key
        :param pulumi.Input[str] cloud_connector_id: Id of the cloud connector
        :param pulumi.Input[str] host_name: Hostname for the proxy
        :param pulumi.Input[str] keypair: Name of SSH Key to be used for proxy VM
        :param pulumi.Input[str] machine_type: Type of instance to be used for proxy
        :param pulumi.Input[str] region: Region in which cloud resources are hosted
        :param pulumi.Input[str] resource_group: Resource group in which cloud resources are hosted
        :param pulumi.Input[str] subnet_id: Subnet in which cloud resources are hosted
        :param pulumi.Input[str] vpc: VPC in which cloud resources are hosted
        :param pulumi.Input[bool] allocate_static_ip: Boolean value to indicate if proxy vm needs to have static IP
        :param pulumi.Input[str] name: Name of the proxy
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: Security Group to define the security rules that determine the inbound and outbound traffic
        """
        pulumi.set(__self__, "api_key", api_key)
        pulumi.set(__self__, "cloud_connector_id", cloud_connector_id)
        pulumi.set(__self__, "delete_cloud_resources_on_destroy", delete_cloud_resources_on_destroy)
        pulumi.set(__self__, "host_name", host_name)
        pulumi.set(__self__, "keypair", keypair)
        pulumi.set(__self__, "machine_type", machine_type)
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "resource_group", resource_group)
        pulumi.set(__self__, "subnet_id", subnet_id)
        pulumi.set(__self__, "vpc", vpc)
        if allocate_static_ip is not None:
            pulumi.set(__self__, "allocate_static_ip", allocate_static_ip)
        if certificate_id is not None:
            pulumi.set(__self__, "certificate_id", certificate_id)
        if certificates is not None:
            pulumi.set(__self__, "certificates", certificates)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if security_groups is not None:
            pulumi.set(__self__, "security_groups", security_groups)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Input[str]:
        """
        Harness NG API key
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter(name="cloudConnectorId")
    def cloud_connector_id(self) -> pulumi.Input[str]:
        """
        Id of the cloud connector
        """
        return pulumi.get(self, "cloud_connector_id")

    @cloud_connector_id.setter
    def cloud_connector_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cloud_connector_id", value)

    @property
    @pulumi.getter(name="deleteCloudResourcesOnDestroy")
    def delete_cloud_resources_on_destroy(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "delete_cloud_resources_on_destroy")

    @delete_cloud_resources_on_destroy.setter
    def delete_cloud_resources_on_destroy(self, value: pulumi.Input[bool]):
        pulumi.set(self, "delete_cloud_resources_on_destroy", value)

    @property
    @pulumi.getter(name="hostName")
    def host_name(self) -> pulumi.Input[str]:
        """
        Hostname for the proxy
        """
        return pulumi.get(self, "host_name")

    @host_name.setter
    def host_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_name", value)

    @property
    @pulumi.getter
    def keypair(self) -> pulumi.Input[str]:
        """
        Name of SSH Key to be used for proxy VM
        """
        return pulumi.get(self, "keypair")

    @keypair.setter
    def keypair(self, value: pulumi.Input[str]):
        pulumi.set(self, "keypair", value)

    @property
    @pulumi.getter(name="machineType")
    def machine_type(self) -> pulumi.Input[str]:
        """
        Type of instance to be used for proxy
        """
        return pulumi.get(self, "machine_type")

    @machine_type.setter
    def machine_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "machine_type", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        Region in which cloud resources are hosted
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="resourceGroup")
    def resource_group(self) -> pulumi.Input[str]:
        """
        Resource group in which cloud resources are hosted
        """
        return pulumi.get(self, "resource_group")

    @resource_group.setter
    def resource_group(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group", value)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Input[str]:
        """
        Subnet in which cloud resources are hosted
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subnet_id", value)

    @property
    @pulumi.getter
    def vpc(self) -> pulumi.Input[str]:
        """
        VPC in which cloud resources are hosted
        """
        return pulumi.get(self, "vpc")

    @vpc.setter
    def vpc(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc", value)

    @property
    @pulumi.getter(name="allocateStaticIp")
    def allocate_static_ip(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean value to indicate if proxy vm needs to have static IP
        """
        return pulumi.get(self, "allocate_static_ip")

    @allocate_static_ip.setter
    def allocate_static_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allocate_static_ip", value)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter
    def certificates(self) -> Optional[pulumi.Input['AzureProxyCertificatesArgs']]:
        return pulumi.get(self, "certificates")

    @certificates.setter
    def certificates(self, value: Optional[pulumi.Input['AzureProxyCertificatesArgs']]):
        pulumi.set(self, "certificates", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the proxy
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Security Group to define the security rules that determine the inbound and outbound traffic
        """
        return pulumi.get(self, "security_groups")

    @security_groups.setter
    def security_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_groups", value)


@pulumi.input_type
class _AzureProxyState:
    def __init__(__self__, *,
                 allocate_static_ip: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificates: Optional[pulumi.Input['AzureProxyCertificatesArgs']] = None,
                 cloud_connector_id: Optional[pulumi.Input[str]] = None,
                 delete_cloud_resources_on_destroy: Optional[pulumi.Input[bool]] = None,
                 host_name: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 keypair: Optional[pulumi.Input[str]] = None,
                 machine_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 resource_group: Optional[pulumi.Input[str]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 vpc: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AzureProxy resources.
        :param pulumi.Input[bool] allocate_static_ip: Boolean value to indicate if proxy vm needs to have static IP
        :param pulumi.Input[str] api_key: Harness NG API key
        :param pulumi.Input[str] cloud_connector_id: Id of the cloud connector
        :param pulumi.Input[str] host_name: Hostname for the proxy
        :param pulumi.Input[str] identifier: Unique identifier of the resource
        :param pulumi.Input[str] keypair: Name of SSH Key to be used for proxy VM
        :param pulumi.Input[str] machine_type: Type of instance to be used for proxy
        :param pulumi.Input[str] name: Name of the proxy
        :param pulumi.Input[str] region: Region in which cloud resources are hosted
        :param pulumi.Input[str] resource_group: Resource group in which cloud resources are hosted
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: Security Group to define the security rules that determine the inbound and outbound traffic
        :param pulumi.Input[str] subnet_id: Subnet in which cloud resources are hosted
        :param pulumi.Input[str] vpc: VPC in which cloud resources are hosted
        """
        if allocate_static_ip is not None:
            pulumi.set(__self__, "allocate_static_ip", allocate_static_ip)
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if certificate_id is not None:
            pulumi.set(__self__, "certificate_id", certificate_id)
        if certificates is not None:
            pulumi.set(__self__, "certificates", certificates)
        if cloud_connector_id is not None:
            pulumi.set(__self__, "cloud_connector_id", cloud_connector_id)
        if delete_cloud_resources_on_destroy is not None:
            pulumi.set(__self__, "delete_cloud_resources_on_destroy", delete_cloud_resources_on_destroy)
        if host_name is not None:
            pulumi.set(__self__, "host_name", host_name)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if keypair is not None:
            pulumi.set(__self__, "keypair", keypair)
        if machine_type is not None:
            pulumi.set(__self__, "machine_type", machine_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if resource_group is not None:
            pulumi.set(__self__, "resource_group", resource_group)
        if security_groups is not None:
            pulumi.set(__self__, "security_groups", security_groups)
        if subnet_id is not None:
            pulumi.set(__self__, "subnet_id", subnet_id)
        if vpc is not None:
            pulumi.set(__self__, "vpc", vpc)

    @property
    @pulumi.getter(name="allocateStaticIp")
    def allocate_static_ip(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean value to indicate if proxy vm needs to have static IP
        """
        return pulumi.get(self, "allocate_static_ip")

    @allocate_static_ip.setter
    def allocate_static_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allocate_static_ip", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        """
        Harness NG API key
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter
    def certificates(self) -> Optional[pulumi.Input['AzureProxyCertificatesArgs']]:
        return pulumi.get(self, "certificates")

    @certificates.setter
    def certificates(self, value: Optional[pulumi.Input['AzureProxyCertificatesArgs']]):
        pulumi.set(self, "certificates", value)

    @property
    @pulumi.getter(name="cloudConnectorId")
    def cloud_connector_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the cloud connector
        """
        return pulumi.get(self, "cloud_connector_id")

    @cloud_connector_id.setter
    def cloud_connector_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud_connector_id", value)

    @property
    @pulumi.getter(name="deleteCloudResourcesOnDestroy")
    def delete_cloud_resources_on_destroy(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "delete_cloud_resources_on_destroy")

    @delete_cloud_resources_on_destroy.setter
    def delete_cloud_resources_on_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_cloud_resources_on_destroy", value)

    @property
    @pulumi.getter(name="hostName")
    def host_name(self) -> Optional[pulumi.Input[str]]:
        """
        Hostname for the proxy
        """
        return pulumi.get(self, "host_name")

    @host_name.setter
    def host_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_name", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the resource
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def keypair(self) -> Optional[pulumi.Input[str]]:
        """
        Name of SSH Key to be used for proxy VM
        """
        return pulumi.get(self, "keypair")

    @keypair.setter
    def keypair(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "keypair", value)

    @property
    @pulumi.getter(name="machineType")
    def machine_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of instance to be used for proxy
        """
        return pulumi.get(self, "machine_type")

    @machine_type.setter
    def machine_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "machine_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the proxy
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        Region in which cloud resources are hosted
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="resourceGroup")
    def resource_group(self) -> Optional[pulumi.Input[str]]:
        """
        Resource group in which cloud resources are hosted
        """
        return pulumi.get(self, "resource_group")

    @resource_group.setter
    def resource_group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group", value)

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Security Group to define the security rules that determine the inbound and outbound traffic
        """
        return pulumi.get(self, "security_groups")

    @security_groups.setter
    def security_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_groups", value)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[pulumi.Input[str]]:
        """
        Subnet in which cloud resources are hosted
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_id", value)

    @property
    @pulumi.getter
    def vpc(self) -> Optional[pulumi.Input[str]]:
        """
        VPC in which cloud resources are hosted
        """
        return pulumi.get(self, "vpc")

    @vpc.setter
    def vpc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc", value)


class AzureProxy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allocate_static_ip: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificates: Optional[pulumi.Input[pulumi.InputType['AzureProxyCertificatesArgs']]] = None,
                 cloud_connector_id: Optional[pulumi.Input[str]] = None,
                 delete_cloud_resources_on_destroy: Optional[pulumi.Input[bool]] = None,
                 host_name: Optional[pulumi.Input[str]] = None,
                 keypair: Optional[pulumi.Input[str]] = None,
                 machine_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 resource_group: Optional[pulumi.Input[str]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 vpc: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating an Azure autostopping proxy

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.autostopping.AzureProxy("test",
            name="name",
            cloud_connector_id="cloud_connector_id",
            host_name="host_name",
            region="eastus2",
            resource_group="resource_group",
            vpc="/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/virtualNetworks/virtual_network",
            subnet_id="/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/virtualNetworks/virtual_network/subnets/subnet_id",
            security_groups=["/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/networkSecurityGroups/network_security_group"],
            allocate_static_ip=True,
            machine_type="Standard_D2s_v3",
            keypair="",
            api_key="",
            delete_cloud_resources_on_destroy=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allocate_static_ip: Boolean value to indicate if proxy vm needs to have static IP
        :param pulumi.Input[str] api_key: Harness NG API key
        :param pulumi.Input[str] cloud_connector_id: Id of the cloud connector
        :param pulumi.Input[str] host_name: Hostname for the proxy
        :param pulumi.Input[str] keypair: Name of SSH Key to be used for proxy VM
        :param pulumi.Input[str] machine_type: Type of instance to be used for proxy
        :param pulumi.Input[str] name: Name of the proxy
        :param pulumi.Input[str] region: Region in which cloud resources are hosted
        :param pulumi.Input[str] resource_group: Resource group in which cloud resources are hosted
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: Security Group to define the security rules that determine the inbound and outbound traffic
        :param pulumi.Input[str] subnet_id: Subnet in which cloud resources are hosted
        :param pulumi.Input[str] vpc: VPC in which cloud resources are hosted
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AzureProxyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating an Azure autostopping proxy

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.autostopping.AzureProxy("test",
            name="name",
            cloud_connector_id="cloud_connector_id",
            host_name="host_name",
            region="eastus2",
            resource_group="resource_group",
            vpc="/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/virtualNetworks/virtual_network",
            subnet_id="/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/virtualNetworks/virtual_network/subnets/subnet_id",
            security_groups=["/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Network/networkSecurityGroups/network_security_group"],
            allocate_static_ip=True,
            machine_type="Standard_D2s_v3",
            keypair="",
            api_key="",
            delete_cloud_resources_on_destroy=True)
        ```

        :param str resource_name: The name of the resource.
        :param AzureProxyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AzureProxyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allocate_static_ip: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificates: Optional[pulumi.Input[pulumi.InputType['AzureProxyCertificatesArgs']]] = None,
                 cloud_connector_id: Optional[pulumi.Input[str]] = None,
                 delete_cloud_resources_on_destroy: Optional[pulumi.Input[bool]] = None,
                 host_name: Optional[pulumi.Input[str]] = None,
                 keypair: Optional[pulumi.Input[str]] = None,
                 machine_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 resource_group: Optional[pulumi.Input[str]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 vpc: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AzureProxyArgs.__new__(AzureProxyArgs)

            __props__.__dict__["allocate_static_ip"] = allocate_static_ip
            if api_key is None and not opts.urn:
                raise TypeError("Missing required property 'api_key'")
            __props__.__dict__["api_key"] = None if api_key is None else pulumi.Output.secret(api_key)
            __props__.__dict__["certificate_id"] = certificate_id
            __props__.__dict__["certificates"] = certificates
            if cloud_connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'cloud_connector_id'")
            __props__.__dict__["cloud_connector_id"] = cloud_connector_id
            if delete_cloud_resources_on_destroy is None and not opts.urn:
                raise TypeError("Missing required property 'delete_cloud_resources_on_destroy'")
            __props__.__dict__["delete_cloud_resources_on_destroy"] = delete_cloud_resources_on_destroy
            if host_name is None and not opts.urn:
                raise TypeError("Missing required property 'host_name'")
            __props__.__dict__["host_name"] = host_name
            if keypair is None and not opts.urn:
                raise TypeError("Missing required property 'keypair'")
            __props__.__dict__["keypair"] = keypair
            if machine_type is None and not opts.urn:
                raise TypeError("Missing required property 'machine_type'")
            __props__.__dict__["machine_type"] = machine_type
            __props__.__dict__["name"] = name
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            if resource_group is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group'")
            __props__.__dict__["resource_group"] = resource_group
            __props__.__dict__["security_groups"] = security_groups
            if subnet_id is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_id'")
            __props__.__dict__["subnet_id"] = subnet_id
            if vpc is None and not opts.urn:
                raise TypeError("Missing required property 'vpc'")
            __props__.__dict__["vpc"] = vpc
            __props__.__dict__["identifier"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["apiKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AzureProxy, __self__).__init__(
            'harness:autostopping/azureProxy:AzureProxy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allocate_static_ip: Optional[pulumi.Input[bool]] = None,
            api_key: Optional[pulumi.Input[str]] = None,
            certificate_id: Optional[pulumi.Input[str]] = None,
            certificates: Optional[pulumi.Input[pulumi.InputType['AzureProxyCertificatesArgs']]] = None,
            cloud_connector_id: Optional[pulumi.Input[str]] = None,
            delete_cloud_resources_on_destroy: Optional[pulumi.Input[bool]] = None,
            host_name: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            keypair: Optional[pulumi.Input[str]] = None,
            machine_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            resource_group: Optional[pulumi.Input[str]] = None,
            security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            subnet_id: Optional[pulumi.Input[str]] = None,
            vpc: Optional[pulumi.Input[str]] = None) -> 'AzureProxy':
        """
        Get an existing AzureProxy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allocate_static_ip: Boolean value to indicate if proxy vm needs to have static IP
        :param pulumi.Input[str] api_key: Harness NG API key
        :param pulumi.Input[str] cloud_connector_id: Id of the cloud connector
        :param pulumi.Input[str] host_name: Hostname for the proxy
        :param pulumi.Input[str] identifier: Unique identifier of the resource
        :param pulumi.Input[str] keypair: Name of SSH Key to be used for proxy VM
        :param pulumi.Input[str] machine_type: Type of instance to be used for proxy
        :param pulumi.Input[str] name: Name of the proxy
        :param pulumi.Input[str] region: Region in which cloud resources are hosted
        :param pulumi.Input[str] resource_group: Resource group in which cloud resources are hosted
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: Security Group to define the security rules that determine the inbound and outbound traffic
        :param pulumi.Input[str] subnet_id: Subnet in which cloud resources are hosted
        :param pulumi.Input[str] vpc: VPC in which cloud resources are hosted
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AzureProxyState.__new__(_AzureProxyState)

        __props__.__dict__["allocate_static_ip"] = allocate_static_ip
        __props__.__dict__["api_key"] = api_key
        __props__.__dict__["certificate_id"] = certificate_id
        __props__.__dict__["certificates"] = certificates
        __props__.__dict__["cloud_connector_id"] = cloud_connector_id
        __props__.__dict__["delete_cloud_resources_on_destroy"] = delete_cloud_resources_on_destroy
        __props__.__dict__["host_name"] = host_name
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["keypair"] = keypair
        __props__.__dict__["machine_type"] = machine_type
        __props__.__dict__["name"] = name
        __props__.__dict__["region"] = region
        __props__.__dict__["resource_group"] = resource_group
        __props__.__dict__["security_groups"] = security_groups
        __props__.__dict__["subnet_id"] = subnet_id
        __props__.__dict__["vpc"] = vpc
        return AzureProxy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allocateStaticIp")
    def allocate_static_ip(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean value to indicate if proxy vm needs to have static IP
        """
        return pulumi.get(self, "allocate_static_ip")

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[str]:
        """
        Harness NG API key
        """
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "certificate_id")

    @property
    @pulumi.getter
    def certificates(self) -> pulumi.Output[Optional['outputs.AzureProxyCertificates']]:
        return pulumi.get(self, "certificates")

    @property
    @pulumi.getter(name="cloudConnectorId")
    def cloud_connector_id(self) -> pulumi.Output[str]:
        """
        Id of the cloud connector
        """
        return pulumi.get(self, "cloud_connector_id")

    @property
    @pulumi.getter(name="deleteCloudResourcesOnDestroy")
    def delete_cloud_resources_on_destroy(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "delete_cloud_resources_on_destroy")

    @property
    @pulumi.getter(name="hostName")
    def host_name(self) -> pulumi.Output[str]:
        """
        Hostname for the proxy
        """
        return pulumi.get(self, "host_name")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def keypair(self) -> pulumi.Output[str]:
        """
        Name of SSH Key to be used for proxy VM
        """
        return pulumi.get(self, "keypair")

    @property
    @pulumi.getter(name="machineType")
    def machine_type(self) -> pulumi.Output[str]:
        """
        Type of instance to be used for proxy
        """
        return pulumi.get(self, "machine_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the proxy
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        Region in which cloud resources are hosted
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceGroup")
    def resource_group(self) -> pulumi.Output[str]:
        """
        Resource group in which cloud resources are hosted
        """
        return pulumi.get(self, "resource_group")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Security Group to define the security rules that determine the inbound and outbound traffic
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Output[str]:
        """
        Subnet in which cloud resources are hosted
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter
    def vpc(self) -> pulumi.Output[str]:
        """
        VPC in which cloud resources are hosted
        """
        return pulumi.get(self, "vpc")

