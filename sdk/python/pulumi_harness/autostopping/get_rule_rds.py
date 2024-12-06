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
    'GetRuleRdsResult',
    'AwaitableGetRuleRdsResult',
    'get_rule_rds',
    'get_rule_rds_output',
]

@pulumi.output_type
class GetRuleRdsResult:
    """
    A collection of values returned by getRuleRds.
    """
    def __init__(__self__, cloud_connector_id=None, database=None, depends=None, id=None, identifier=None, idle_time_mins=None, name=None, tcps=None):
        if cloud_connector_id and not isinstance(cloud_connector_id, str):
            raise TypeError("Expected argument 'cloud_connector_id' to be a str")
        pulumi.set(__self__, "cloud_connector_id", cloud_connector_id)
        if database and not isinstance(database, dict):
            raise TypeError("Expected argument 'database' to be a dict")
        pulumi.set(__self__, "database", database)
        if depends and not isinstance(depends, list):
            raise TypeError("Expected argument 'depends' to be a list")
        pulumi.set(__self__, "depends", depends)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, float):
            raise TypeError("Expected argument 'identifier' to be a float")
        pulumi.set(__self__, "identifier", identifier)
        if idle_time_mins and not isinstance(idle_time_mins, int):
            raise TypeError("Expected argument 'idle_time_mins' to be a int")
        pulumi.set(__self__, "idle_time_mins", idle_time_mins)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tcps and not isinstance(tcps, list):
            raise TypeError("Expected argument 'tcps' to be a list")
        pulumi.set(__self__, "tcps", tcps)

    @property
    @pulumi.getter(name="cloudConnectorId")
    def cloud_connector_id(self) -> str:
        """
        Id of the cloud connector
        """
        return pulumi.get(self, "cloud_connector_id")

    @property
    @pulumi.getter
    def database(self) -> 'outputs.GetRuleRdsDatabaseResult':
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def depends(self) -> Optional[Sequence['outputs.GetRuleRdsDependResult']]:
        """
        Dependent rules
        """
        return pulumi.get(self, "depends")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> float:
        """
        Unique identifier of the resource
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="idleTimeMins")
    def idle_time_mins(self) -> Optional[int]:
        """
        Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        """
        return pulumi.get(self, "idle_time_mins")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the rule
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tcps(self) -> Optional[Sequence['outputs.GetRuleRdsTcpResult']]:
        """
        TCP routing configuration
        """
        return pulumi.get(self, "tcps")


class AwaitableGetRuleRdsResult(GetRuleRdsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRuleRdsResult(
            cloud_connector_id=self.cloud_connector_id,
            database=self.database,
            depends=self.depends,
            id=self.id,
            identifier=self.identifier,
            idle_time_mins=self.idle_time_mins,
            name=self.name,
            tcps=self.tcps)


def get_rule_rds(cloud_connector_id: Optional[str] = None,
                 database: Optional[Union['GetRuleRdsDatabaseArgs', 'GetRuleRdsDatabaseArgsDict']] = None,
                 depends: Optional[Sequence[Union['GetRuleRdsDependArgs', 'GetRuleRdsDependArgsDict']]] = None,
                 idle_time_mins: Optional[int] = None,
                 name: Optional[str] = None,
                 tcps: Optional[Sequence[Union['GetRuleRdsTcpArgs', 'GetRuleRdsTcpArgsDict']]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRuleRdsResult:
    """
    Data source for retrieving a Harness Variable.


    :param str cloud_connector_id: Id of the cloud connector
    :param Sequence[Union['GetRuleRdsDependArgs', 'GetRuleRdsDependArgsDict']] depends: Dependent rules
    :param int idle_time_mins: Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
    :param str name: Name of the rule
    :param Sequence[Union['GetRuleRdsTcpArgs', 'GetRuleRdsTcpArgsDict']] tcps: TCP routing configuration
    """
    __args__ = dict()
    __args__['cloudConnectorId'] = cloud_connector_id
    __args__['database'] = database
    __args__['depends'] = depends
    __args__['idleTimeMins'] = idle_time_mins
    __args__['name'] = name
    __args__['tcps'] = tcps
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:autostopping/getRuleRds:getRuleRds', __args__, opts=opts, typ=GetRuleRdsResult).value

    return AwaitableGetRuleRdsResult(
        cloud_connector_id=pulumi.get(__ret__, 'cloud_connector_id'),
        database=pulumi.get(__ret__, 'database'),
        depends=pulumi.get(__ret__, 'depends'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        idle_time_mins=pulumi.get(__ret__, 'idle_time_mins'),
        name=pulumi.get(__ret__, 'name'),
        tcps=pulumi.get(__ret__, 'tcps'))
def get_rule_rds_output(cloud_connector_id: Optional[pulumi.Input[str]] = None,
                        database: Optional[pulumi.Input[Union['GetRuleRdsDatabaseArgs', 'GetRuleRdsDatabaseArgsDict']]] = None,
                        depends: Optional[pulumi.Input[Optional[Sequence[Union['GetRuleRdsDependArgs', 'GetRuleRdsDependArgsDict']]]]] = None,
                        idle_time_mins: Optional[pulumi.Input[Optional[int]]] = None,
                        name: Optional[pulumi.Input[str]] = None,
                        tcps: Optional[pulumi.Input[Optional[Sequence[Union['GetRuleRdsTcpArgs', 'GetRuleRdsTcpArgsDict']]]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRuleRdsResult]:
    """
    Data source for retrieving a Harness Variable.


    :param str cloud_connector_id: Id of the cloud connector
    :param Sequence[Union['GetRuleRdsDependArgs', 'GetRuleRdsDependArgsDict']] depends: Dependent rules
    :param int idle_time_mins: Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
    :param str name: Name of the rule
    :param Sequence[Union['GetRuleRdsTcpArgs', 'GetRuleRdsTcpArgsDict']] tcps: TCP routing configuration
    """
    __args__ = dict()
    __args__['cloudConnectorId'] = cloud_connector_id
    __args__['database'] = database
    __args__['depends'] = depends
    __args__['idleTimeMins'] = idle_time_mins
    __args__['name'] = name
    __args__['tcps'] = tcps
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:autostopping/getRuleRds:getRuleRds', __args__, opts=opts, typ=GetRuleRdsResult)
    return __ret__.apply(lambda __response__: GetRuleRdsResult(
        cloud_connector_id=pulumi.get(__response__, 'cloud_connector_id'),
        database=pulumi.get(__response__, 'database'),
        depends=pulumi.get(__response__, 'depends'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        idle_time_mins=pulumi.get(__response__, 'idle_time_mins'),
        name=pulumi.get(__response__, 'name'),
        tcps=pulumi.get(__response__, 'tcps')))
