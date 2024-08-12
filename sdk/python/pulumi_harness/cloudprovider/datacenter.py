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

__all__ = ['DatacenterArgs', 'Datacenter']

@pulumi.input_type
class DatacenterArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input['DatacenterUsageScopeArgs']]]] = None):
        """
        The set of arguments for constructing a Datacenter resource.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[Sequence[pulumi.Input['DatacenterUsageScopeArgs']]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if usage_scopes is not None:
            pulumi.set(__self__, "usage_scopes", usage_scopes)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DatacenterUsageScopeArgs']]]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @usage_scopes.setter
    def usage_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DatacenterUsageScopeArgs']]]]):
        pulumi.set(self, "usage_scopes", value)


@pulumi.input_type
class _DatacenterState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input['DatacenterUsageScopeArgs']]]] = None):
        """
        Input properties used for looking up and filtering Datacenter resources.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[Sequence[pulumi.Input['DatacenterUsageScopeArgs']]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if usage_scopes is not None:
            pulumi.set(__self__, "usage_scopes", usage_scopes)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DatacenterUsageScopeArgs']]]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @usage_scopes.setter
    def usage_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DatacenterUsageScopeArgs']]]]):
        pulumi.set(self, "usage_scopes", value)


class Datacenter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatacenterUsageScopeArgs', 'DatacenterUsageScopeArgsDict']]]]] = None,
                 __props__=None):
        """
        Resource for creating a physical data center cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.cloudprovider.Datacenter("example", name="example")
        ```

        ## Import

        Import using the Harness datacenter cloud provider id.

        ```sh
        $ pulumi import harness:cloudprovider/datacenter:Datacenter example <provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DatacenterUsageScopeArgs', 'DatacenterUsageScopeArgsDict']]]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DatacenterArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a physical data center cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.cloudprovider.Datacenter("example", name="example")
        ```

        ## Import

        Import using the Harness datacenter cloud provider id.

        ```sh
        $ pulumi import harness:cloudprovider/datacenter:Datacenter example <provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param DatacenterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatacenterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatacenterUsageScopeArgs', 'DatacenterUsageScopeArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatacenterArgs.__new__(DatacenterArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["usage_scopes"] = usage_scopes
        super(Datacenter, __self__).__init__(
            'harness:cloudprovider/datacenter:Datacenter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatacenterUsageScopeArgs', 'DatacenterUsageScopeArgsDict']]]]] = None) -> 'Datacenter':
        """
        Get an existing Datacenter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DatacenterUsageScopeArgs', 'DatacenterUsageScopeArgsDict']]]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatacenterState.__new__(_DatacenterState)

        __props__.__dict__["name"] = name
        __props__.__dict__["usage_scopes"] = usage_scopes
        return Datacenter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> pulumi.Output[Optional[Sequence['outputs.DatacenterUsageScope']]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

