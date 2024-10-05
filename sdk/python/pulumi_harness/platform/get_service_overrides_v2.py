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

__all__ = [
    'GetServiceOverridesV2Result',
    'AwaitableGetServiceOverridesV2Result',
    'get_service_overrides_v2',
    'get_service_overrides_v2_output',
]

@pulumi.output_type
class GetServiceOverridesV2Result:
    """
    A collection of values returned by getServiceOverridesV2.
    """
    def __init__(__self__, cluster_id=None, env_id=None, git_details=None, id=None, identifier=None, infra_id=None, org_id=None, project_id=None, service_id=None, type=None, yaml=None):
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if env_id and not isinstance(env_id, str):
            raise TypeError("Expected argument 'env_id' to be a str")
        pulumi.set(__self__, "env_id", env_id)
        if git_details and not isinstance(git_details, dict):
            raise TypeError("Expected argument 'git_details' to be a dict")
        pulumi.set(__self__, "git_details", git_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if infra_id and not isinstance(infra_id, str):
            raise TypeError("Expected argument 'infra_id' to be a str")
        pulumi.set(__self__, "infra_id", infra_id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if service_id and not isinstance(service_id, str):
            raise TypeError("Expected argument 'service_id' to be a str")
        pulumi.set(__self__, "service_id", service_id)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if yaml and not isinstance(yaml, str):
            raise TypeError("Expected argument 'yaml' to be a str")
        pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> str:
        return pulumi.get(self, "env_id")

    @property
    @pulumi.getter(name="gitDetails")
    def git_details(self) -> 'outputs.GetServiceOverridesV2GitDetailsResult':
        return pulumi.get(self, "git_details")

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
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="infraId")
    def infra_id(self) -> str:
        return pulumi.get(self, "infra_id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> str:
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def yaml(self) -> str:
        return pulumi.get(self, "yaml")


class AwaitableGetServiceOverridesV2Result(GetServiceOverridesV2Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceOverridesV2Result(
            cluster_id=self.cluster_id,
            env_id=self.env_id,
            git_details=self.git_details,
            id=self.id,
            identifier=self.identifier,
            infra_id=self.infra_id,
            org_id=self.org_id,
            project_id=self.project_id,
            service_id=self.service_id,
            type=self.type,
            yaml=self.yaml)


def get_service_overrides_v2(git_details: Optional[Union['GetServiceOverridesV2GitDetailsArgs', 'GetServiceOverridesV2GitDetailsArgsDict']] = None,
                             identifier: Optional[str] = None,
                             org_id: Optional[str] = None,
                             project_id: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceOverridesV2Result:
    """
    Data source for Harness service overrides V2.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_service_overrides_v2(identifier="identifier",
        org_id="orgIdentifier",
        project_id="projectIdentifier")
    ```
    """
    __args__ = dict()
    __args__['gitDetails'] = git_details
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getServiceOverridesV2:getServiceOverridesV2', __args__, opts=opts, typ=GetServiceOverridesV2Result).value

    return AwaitableGetServiceOverridesV2Result(
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        env_id=pulumi.get(__ret__, 'env_id'),
        git_details=pulumi.get(__ret__, 'git_details'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        infra_id=pulumi.get(__ret__, 'infra_id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        service_id=pulumi.get(__ret__, 'service_id'),
        type=pulumi.get(__ret__, 'type'),
        yaml=pulumi.get(__ret__, 'yaml'))


@_utilities.lift_output_func(get_service_overrides_v2)
def get_service_overrides_v2_output(git_details: Optional[pulumi.Input[Optional[Union['GetServiceOverridesV2GitDetailsArgs', 'GetServiceOverridesV2GitDetailsArgsDict']]]] = None,
                                    identifier: Optional[pulumi.Input[str]] = None,
                                    org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                    project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceOverridesV2Result]:
    """
    Data source for Harness service overrides V2.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_service_overrides_v2(identifier="identifier",
        org_id="orgIdentifier",
        project_id="projectIdentifier")
    ```
    """
    ...