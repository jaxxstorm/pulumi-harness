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
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetEnvironmentResult',
    'AwaitableGetEnvironmentResult',
    'get_environment',
    'get_environment_output',
]

@pulumi.output_type
class GetEnvironmentResult:
    """
    A collection of values returned by getEnvironment.
    """
    def __init__(__self__, app_id=None, description=None, environment_id=None, id=None, name=None, type=None, variable_overrides=None):
        if app_id and not isinstance(app_id, str):
            raise TypeError("Expected argument 'app_id' to be a str")
        pulumi.set(__self__, "app_id", app_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if environment_id and not isinstance(environment_id, str):
            raise TypeError("Expected argument 'environment_id' to be a str")
        pulumi.set(__self__, "environment_id", environment_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if variable_overrides and not isinstance(variable_overrides, list):
            raise TypeError("Expected argument 'variable_overrides' to be a list")
        pulumi.set(__self__, "variable_overrides", variable_overrides)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> str:
        """
        The id of the application.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the environment.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[str]:
        """
        The id of the environment.
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the environment.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the environment.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the environment. Valid values are `PROD` and `NON_PROD`
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="variableOverrides")
    def variable_overrides(self) -> Sequence['outputs.GetEnvironmentVariableOverrideResult']:
        """
        Override for a service variable
        """
        return pulumi.get(self, "variable_overrides")


class AwaitableGetEnvironmentResult(GetEnvironmentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEnvironmentResult(
            app_id=self.app_id,
            description=self.description,
            environment_id=self.environment_id,
            id=self.id,
            name=self.name,
            type=self.type,
            variable_overrides=self.variable_overrides)


def get_environment(app_id: Optional[str] = None,
                    environment_id: Optional[str] = None,
                    name: Optional[str] = None,
                    variable_overrides: Optional[Sequence[Union['GetEnvironmentVariableOverrideArgs', 'GetEnvironmentVariableOverrideArgsDict']]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEnvironmentResult:
    """
    Data source for retrieving a Harness service


    :param str app_id: The id of the application.
    :param str environment_id: The id of the environment.
    :param str name: The name of the environment.
    :param Sequence[Union['GetEnvironmentVariableOverrideArgs', 'GetEnvironmentVariableOverrideArgsDict']] variable_overrides: Override for a service variable
    """
    __args__ = dict()
    __args__['appId'] = app_id
    __args__['environmentId'] = environment_id
    __args__['name'] = name
    __args__['variableOverrides'] = variable_overrides
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:index/getEnvironment:getEnvironment', __args__, opts=opts, typ=GetEnvironmentResult).value

    return AwaitableGetEnvironmentResult(
        app_id=pulumi.get(__ret__, 'app_id'),
        description=pulumi.get(__ret__, 'description'),
        environment_id=pulumi.get(__ret__, 'environment_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'),
        variable_overrides=pulumi.get(__ret__, 'variable_overrides'))
def get_environment_output(app_id: Optional[pulumi.Input[str]] = None,
                           environment_id: Optional[pulumi.Input[Optional[str]]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           variable_overrides: Optional[pulumi.Input[Optional[Sequence[Union['GetEnvironmentVariableOverrideArgs', 'GetEnvironmentVariableOverrideArgsDict']]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEnvironmentResult]:
    """
    Data source for retrieving a Harness service


    :param str app_id: The id of the application.
    :param str environment_id: The id of the environment.
    :param str name: The name of the environment.
    :param Sequence[Union['GetEnvironmentVariableOverrideArgs', 'GetEnvironmentVariableOverrideArgsDict']] variable_overrides: Override for a service variable
    """
    __args__ = dict()
    __args__['appId'] = app_id
    __args__['environmentId'] = environment_id
    __args__['name'] = name
    __args__['variableOverrides'] = variable_overrides
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:index/getEnvironment:getEnvironment', __args__, opts=opts, typ=GetEnvironmentResult)
    return __ret__.apply(lambda __response__: GetEnvironmentResult(
        app_id=pulumi.get(__response__, 'app_id'),
        description=pulumi.get(__response__, 'description'),
        environment_id=pulumi.get(__response__, 'environment_id'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        type=pulumi.get(__response__, 'type'),
        variable_overrides=pulumi.get(__response__, 'variable_overrides')))
