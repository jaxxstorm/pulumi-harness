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

__all__ = [
    'GetServiceListResult',
    'AwaitableGetServiceListResult',
    'get_service_list',
    'get_service_list_output',
]

@pulumi.output_type
class GetServiceListResult:
    """
    A collection of values returned by getServiceList.
    """
    def __init__(__self__, id=None, org_id=None, project_id=None, services=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if services and not isinstance(services, list):
            raise TypeError("Expected argument 'services' to be a list")
        pulumi.set(__self__, "services", services)

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

    @property
    @pulumi.getter
    def services(self) -> Sequence['outputs.GetServiceListServiceResult']:
        return pulumi.get(self, "services")


class AwaitableGetServiceListResult(GetServiceListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceListResult(
            id=self.id,
            org_id=self.org_id,
            project_id=self.project_id,
            services=self.services)


def get_service_list(org_id: Optional[str] = None,
                     project_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceListResult:
    """
    Data source for retrieving Harness service list.

    ## Example Usage

    ### Project Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list(org_id="org_id",
        project_id="project_id")
    ```

    ### Organisation Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list(org_id="org_id")
    ```

    ### Account Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list()
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getServiceList:getServiceList', __args__, opts=opts, typ=GetServiceListResult).value

    return AwaitableGetServiceListResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        services=pulumi.get(__ret__, 'services'))
def get_service_list_output(org_id: Optional[pulumi.Input[Optional[str]]] = None,
                            project_id: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceListResult]:
    """
    Data source for retrieving Harness service list.

    ## Example Usage

    ### Project Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list(org_id="org_id",
        project_id="project_id")
    ```

    ### Organisation Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list(org_id="org_id")
    ```

    ### Account Level Service List

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_service_list()
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getServiceList:getServiceList', __args__, opts=opts, typ=GetServiceListResult)
    return __ret__.apply(lambda __response__: GetServiceListResult(
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        services=pulumi.get(__response__, 'services')))
