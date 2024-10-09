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

__all__ = ['RuleVmArgs', 'RuleVm']

@pulumi.input_type
class RuleVmArgs:
    def __init__(__self__, *,
                 cloud_connector_id: pulumi.Input[str],
                 filter: pulumi.Input['RuleVmFilterArgs'],
                 custom_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 depends: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmDependArgs']]]] = None,
                 https: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmHttpArgs']]]] = None,
                 idle_time_mins: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tcps: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmTcpArgs']]]] = None,
                 use_spot: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a RuleVm resource.
        :param pulumi.Input[str] cloud_connector_id: Id of the cloud connector
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_domains: Custom URLs used to access the instances
        :param pulumi.Input[Sequence[pulumi.Input['RuleVmDependArgs']]] depends: Dependent rules
        :param pulumi.Input[Sequence[pulumi.Input['RuleVmHttpArgs']]] https: Http routing configuration
        :param pulumi.Input[int] idle_time_mins: Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        :param pulumi.Input[str] name: Name of the rule
        :param pulumi.Input[Sequence[pulumi.Input['RuleVmTcpArgs']]] tcps: TCP routing configuration
        :param pulumi.Input[bool] use_spot: Boolean that indicates whether the selected instances should be converted to spot vm
        """
        pulumi.set(__self__, "cloud_connector_id", cloud_connector_id)
        pulumi.set(__self__, "filter", filter)
        if custom_domains is not None:
            pulumi.set(__self__, "custom_domains", custom_domains)
        if depends is not None:
            pulumi.set(__self__, "depends", depends)
        if https is not None:
            pulumi.set(__self__, "https", https)
        if idle_time_mins is not None:
            pulumi.set(__self__, "idle_time_mins", idle_time_mins)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tcps is not None:
            pulumi.set(__self__, "tcps", tcps)
        if use_spot is not None:
            pulumi.set(__self__, "use_spot", use_spot)

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
    @pulumi.getter
    def filter(self) -> pulumi.Input['RuleVmFilterArgs']:
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: pulumi.Input['RuleVmFilterArgs']):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter(name="customDomains")
    def custom_domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Custom URLs used to access the instances
        """
        return pulumi.get(self, "custom_domains")

    @custom_domains.setter
    def custom_domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "custom_domains", value)

    @property
    @pulumi.getter
    def depends(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmDependArgs']]]]:
        """
        Dependent rules
        """
        return pulumi.get(self, "depends")

    @depends.setter
    def depends(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmDependArgs']]]]):
        pulumi.set(self, "depends", value)

    @property
    @pulumi.getter
    def https(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmHttpArgs']]]]:
        """
        Http routing configuration
        """
        return pulumi.get(self, "https")

    @https.setter
    def https(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmHttpArgs']]]]):
        pulumi.set(self, "https", value)

    @property
    @pulumi.getter(name="idleTimeMins")
    def idle_time_mins(self) -> Optional[pulumi.Input[int]]:
        """
        Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        """
        return pulumi.get(self, "idle_time_mins")

    @idle_time_mins.setter
    def idle_time_mins(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "idle_time_mins", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the rule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tcps(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmTcpArgs']]]]:
        """
        TCP routing configuration
        """
        return pulumi.get(self, "tcps")

    @tcps.setter
    def tcps(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmTcpArgs']]]]):
        pulumi.set(self, "tcps", value)

    @property
    @pulumi.getter(name="useSpot")
    def use_spot(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean that indicates whether the selected instances should be converted to spot vm
        """
        return pulumi.get(self, "use_spot")

    @use_spot.setter
    def use_spot(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_spot", value)


@pulumi.input_type
class _RuleVmState:
    def __init__(__self__, *,
                 cloud_connector_id: Optional[pulumi.Input[str]] = None,
                 custom_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 depends: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmDependArgs']]]] = None,
                 filter: Optional[pulumi.Input['RuleVmFilterArgs']] = None,
                 https: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmHttpArgs']]]] = None,
                 identifier: Optional[pulumi.Input[float]] = None,
                 idle_time_mins: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tcps: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmTcpArgs']]]] = None,
                 use_spot: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering RuleVm resources.
        :param pulumi.Input[str] cloud_connector_id: Id of the cloud connector
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_domains: Custom URLs used to access the instances
        :param pulumi.Input[Sequence[pulumi.Input['RuleVmDependArgs']]] depends: Dependent rules
        :param pulumi.Input[Sequence[pulumi.Input['RuleVmHttpArgs']]] https: Http routing configuration
        :param pulumi.Input[float] identifier: Unique identifier of the resource
        :param pulumi.Input[int] idle_time_mins: Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        :param pulumi.Input[str] name: Name of the rule
        :param pulumi.Input[Sequence[pulumi.Input['RuleVmTcpArgs']]] tcps: TCP routing configuration
        :param pulumi.Input[bool] use_spot: Boolean that indicates whether the selected instances should be converted to spot vm
        """
        if cloud_connector_id is not None:
            pulumi.set(__self__, "cloud_connector_id", cloud_connector_id)
        if custom_domains is not None:
            pulumi.set(__self__, "custom_domains", custom_domains)
        if depends is not None:
            pulumi.set(__self__, "depends", depends)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if https is not None:
            pulumi.set(__self__, "https", https)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if idle_time_mins is not None:
            pulumi.set(__self__, "idle_time_mins", idle_time_mins)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tcps is not None:
            pulumi.set(__self__, "tcps", tcps)
        if use_spot is not None:
            pulumi.set(__self__, "use_spot", use_spot)

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
    @pulumi.getter(name="customDomains")
    def custom_domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Custom URLs used to access the instances
        """
        return pulumi.get(self, "custom_domains")

    @custom_domains.setter
    def custom_domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "custom_domains", value)

    @property
    @pulumi.getter
    def depends(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmDependArgs']]]]:
        """
        Dependent rules
        """
        return pulumi.get(self, "depends")

    @depends.setter
    def depends(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmDependArgs']]]]):
        pulumi.set(self, "depends", value)

    @property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input['RuleVmFilterArgs']]:
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input['RuleVmFilterArgs']]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter
    def https(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmHttpArgs']]]]:
        """
        Http routing configuration
        """
        return pulumi.get(self, "https")

    @https.setter
    def https(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmHttpArgs']]]]):
        pulumi.set(self, "https", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[float]]:
        """
        Unique identifier of the resource
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="idleTimeMins")
    def idle_time_mins(self) -> Optional[pulumi.Input[int]]:
        """
        Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        """
        return pulumi.get(self, "idle_time_mins")

    @idle_time_mins.setter
    def idle_time_mins(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "idle_time_mins", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the rule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tcps(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmTcpArgs']]]]:
        """
        TCP routing configuration
        """
        return pulumi.get(self, "tcps")

    @tcps.setter
    def tcps(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RuleVmTcpArgs']]]]):
        pulumi.set(self, "tcps", value)

    @property
    @pulumi.getter(name="useSpot")
    def use_spot(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean that indicates whether the selected instances should be converted to spot vm
        """
        return pulumi.get(self, "use_spot")

    @use_spot.setter
    def use_spot(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_spot", value)


class RuleVm(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_connector_id: Optional[pulumi.Input[str]] = None,
                 custom_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 depends: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmDependArgs', 'RuleVmDependArgsDict']]]]] = None,
                 filter: Optional[pulumi.Input[Union['RuleVmFilterArgs', 'RuleVmFilterArgsDict']]] = None,
                 https: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmHttpArgs', 'RuleVmHttpArgsDict']]]]] = None,
                 idle_time_mins: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tcps: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmTcpArgs', 'RuleVmTcpArgsDict']]]]] = None,
                 use_spot: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Resource for creating a Harness Variables.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.autostopping.RuleVm("test",
            name="name",
            cloud_connector_id="cloud_connector_id",
            idle_time_mins=10,
            filter={
                "vm_ids": ["/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Compute/virtualMachines/virtual_machine"],
                "regions": ["useast2"],
            },
            https=[{
                "proxy_id": "proxy_id",
                "routings": [
                    {
                        "source_protocol": "https",
                        "target_protocol": "https",
                        "source_port": 443,
                        "target_port": 443,
                        "action": "forward",
                    },
                    {
                        "source_protocol": "http",
                        "target_protocol": "http",
                        "source_port": 80,
                        "target_port": 80,
                        "action": "forward",
                    },
                ],
                "healths": [{
                    "protocol": "http",
                    "port": 80,
                    "path": "/",
                    "timeout": 30,
                    "status_code_from": 200,
                    "status_code_to": 299,
                }],
            }],
            tcps=[{
                "proxy_id": "proxy_id",
                "sshes": [{
                    "port": 22,
                }],
                "rdps": [{
                    "port": 3389,
                }],
                "forward_rules": [{
                    "port": 2233,
                }],
            }],
            depends=[{
                "rule_id": 24576,
                "delay_in_sec": 5,
            }])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloud_connector_id: Id of the cloud connector
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_domains: Custom URLs used to access the instances
        :param pulumi.Input[Sequence[pulumi.Input[Union['RuleVmDependArgs', 'RuleVmDependArgsDict']]]] depends: Dependent rules
        :param pulumi.Input[Sequence[pulumi.Input[Union['RuleVmHttpArgs', 'RuleVmHttpArgsDict']]]] https: Http routing configuration
        :param pulumi.Input[int] idle_time_mins: Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        :param pulumi.Input[str] name: Name of the rule
        :param pulumi.Input[Sequence[pulumi.Input[Union['RuleVmTcpArgs', 'RuleVmTcpArgsDict']]]] tcps: TCP routing configuration
        :param pulumi.Input[bool] use_spot: Boolean that indicates whether the selected instances should be converted to spot vm
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RuleVmArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Harness Variables.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.autostopping.RuleVm("test",
            name="name",
            cloud_connector_id="cloud_connector_id",
            idle_time_mins=10,
            filter={
                "vm_ids": ["/subscriptions/subscription_id/resourceGroups/resource_group/providers/Microsoft.Compute/virtualMachines/virtual_machine"],
                "regions": ["useast2"],
            },
            https=[{
                "proxy_id": "proxy_id",
                "routings": [
                    {
                        "source_protocol": "https",
                        "target_protocol": "https",
                        "source_port": 443,
                        "target_port": 443,
                        "action": "forward",
                    },
                    {
                        "source_protocol": "http",
                        "target_protocol": "http",
                        "source_port": 80,
                        "target_port": 80,
                        "action": "forward",
                    },
                ],
                "healths": [{
                    "protocol": "http",
                    "port": 80,
                    "path": "/",
                    "timeout": 30,
                    "status_code_from": 200,
                    "status_code_to": 299,
                }],
            }],
            tcps=[{
                "proxy_id": "proxy_id",
                "sshes": [{
                    "port": 22,
                }],
                "rdps": [{
                    "port": 3389,
                }],
                "forward_rules": [{
                    "port": 2233,
                }],
            }],
            depends=[{
                "rule_id": 24576,
                "delay_in_sec": 5,
            }])
        ```

        :param str resource_name: The name of the resource.
        :param RuleVmArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RuleVmArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_connector_id: Optional[pulumi.Input[str]] = None,
                 custom_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 depends: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmDependArgs', 'RuleVmDependArgsDict']]]]] = None,
                 filter: Optional[pulumi.Input[Union['RuleVmFilterArgs', 'RuleVmFilterArgsDict']]] = None,
                 https: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmHttpArgs', 'RuleVmHttpArgsDict']]]]] = None,
                 idle_time_mins: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tcps: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmTcpArgs', 'RuleVmTcpArgsDict']]]]] = None,
                 use_spot: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RuleVmArgs.__new__(RuleVmArgs)

            if cloud_connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'cloud_connector_id'")
            __props__.__dict__["cloud_connector_id"] = cloud_connector_id
            __props__.__dict__["custom_domains"] = custom_domains
            __props__.__dict__["depends"] = depends
            if filter is None and not opts.urn:
                raise TypeError("Missing required property 'filter'")
            __props__.__dict__["filter"] = filter
            __props__.__dict__["https"] = https
            __props__.__dict__["idle_time_mins"] = idle_time_mins
            __props__.__dict__["name"] = name
            __props__.__dict__["tcps"] = tcps
            __props__.__dict__["use_spot"] = use_spot
            __props__.__dict__["identifier"] = None
        super(RuleVm, __self__).__init__(
            'harness:autostopping/ruleVm:RuleVm',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cloud_connector_id: Optional[pulumi.Input[str]] = None,
            custom_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            depends: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmDependArgs', 'RuleVmDependArgsDict']]]]] = None,
            filter: Optional[pulumi.Input[Union['RuleVmFilterArgs', 'RuleVmFilterArgsDict']]] = None,
            https: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmHttpArgs', 'RuleVmHttpArgsDict']]]]] = None,
            identifier: Optional[pulumi.Input[float]] = None,
            idle_time_mins: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tcps: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RuleVmTcpArgs', 'RuleVmTcpArgsDict']]]]] = None,
            use_spot: Optional[pulumi.Input[bool]] = None) -> 'RuleVm':
        """
        Get an existing RuleVm resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloud_connector_id: Id of the cloud connector
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_domains: Custom URLs used to access the instances
        :param pulumi.Input[Sequence[pulumi.Input[Union['RuleVmDependArgs', 'RuleVmDependArgsDict']]]] depends: Dependent rules
        :param pulumi.Input[Sequence[pulumi.Input[Union['RuleVmHttpArgs', 'RuleVmHttpArgsDict']]]] https: Http routing configuration
        :param pulumi.Input[float] identifier: Unique identifier of the resource
        :param pulumi.Input[int] idle_time_mins: Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        :param pulumi.Input[str] name: Name of the rule
        :param pulumi.Input[Sequence[pulumi.Input[Union['RuleVmTcpArgs', 'RuleVmTcpArgsDict']]]] tcps: TCP routing configuration
        :param pulumi.Input[bool] use_spot: Boolean that indicates whether the selected instances should be converted to spot vm
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RuleVmState.__new__(_RuleVmState)

        __props__.__dict__["cloud_connector_id"] = cloud_connector_id
        __props__.__dict__["custom_domains"] = custom_domains
        __props__.__dict__["depends"] = depends
        __props__.__dict__["filter"] = filter
        __props__.__dict__["https"] = https
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["idle_time_mins"] = idle_time_mins
        __props__.__dict__["name"] = name
        __props__.__dict__["tcps"] = tcps
        __props__.__dict__["use_spot"] = use_spot
        return RuleVm(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cloudConnectorId")
    def cloud_connector_id(self) -> pulumi.Output[str]:
        """
        Id of the cloud connector
        """
        return pulumi.get(self, "cloud_connector_id")

    @property
    @pulumi.getter(name="customDomains")
    def custom_domains(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Custom URLs used to access the instances
        """
        return pulumi.get(self, "custom_domains")

    @property
    @pulumi.getter
    def depends(self) -> pulumi.Output[Optional[Sequence['outputs.RuleVmDepend']]]:
        """
        Dependent rules
        """
        return pulumi.get(self, "depends")

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Output['outputs.RuleVmFilter']:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def https(self) -> pulumi.Output[Optional[Sequence['outputs.RuleVmHttp']]]:
        """
        Http routing configuration
        """
        return pulumi.get(self, "https")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[float]:
        """
        Unique identifier of the resource
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="idleTimeMins")
    def idle_time_mins(self) -> pulumi.Output[Optional[int]]:
        """
        Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        """
        return pulumi.get(self, "idle_time_mins")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the rule
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tcps(self) -> pulumi.Output[Optional[Sequence['outputs.RuleVmTcp']]]:
        """
        TCP routing configuration
        """
        return pulumi.get(self, "tcps")

    @property
    @pulumi.getter(name="useSpot")
    def use_spot(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean that indicates whether the selected instances should be converted to spot vm
        """
        return pulumi.get(self, "use_spot")

