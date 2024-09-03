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

__all__ = [
    'GetEnvironmentListResult',
    'AwaitableGetEnvironmentListResult',
    'get_environment_list',
    'get_environment_list_output',
]

@pulumi.output_type
class GetEnvironmentListResult:
    """
    A collection of values returned by getEnvironmentList.
    """
    def __init__(__self__, environments=None, id=None, org_id=None, project_id=None):
        if environments and not isinstance(environments, list):
            raise TypeError("Expected argument 'environments' to be a list")
        pulumi.set(__self__, "environments", environments)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter
    def environments(self) -> Sequence['outputs.GetEnvironmentListEnvironmentResult']:
        return pulumi.get(self, "environments")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        return pulumi.get(self, "project_id")


class AwaitableGetEnvironmentListResult(GetEnvironmentListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEnvironmentListResult(
            environments=self.environments,
            id=self.id,
            org_id=self.org_id,
            project_id=self.project_id)


def get_environment_list(org_id: Optional[str] = None,
                         project_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEnvironmentListResult:
    """
    Data source for retrieving Harness environment list.

    ## Example Usage

    ### project level environment list

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_environment_list(org_id="org_id",
        project_id="project_id")
    ```

    ### Organisation level environment list

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_environment_list(org_id="org_id")
    ```

    ### Account level environment list

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_environment_list()
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getEnvironmentList:getEnvironmentList', __args__, opts=opts, typ=GetEnvironmentListResult).value

    return AwaitableGetEnvironmentListResult(
        environments=pulumi.get(__ret__, 'environments'),
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'))


@_utilities.lift_output_func(get_environment_list)
def get_environment_list_output(org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEnvironmentListResult]:
    """
    Data source for retrieving Harness environment list.

    ## Example Usage

    ### project level environment list

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_environment_list(org_id="org_id",
        project_id="project_id")
    ```

    ### Organisation level environment list

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_environment_list(org_id="org_id")
    ```

    ### Account level environment list

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_environment_list()
    ```
    """
    ...
