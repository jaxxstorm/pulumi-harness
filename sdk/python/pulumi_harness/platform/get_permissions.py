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
    'GetPermissionsResult',
    'AwaitableGetPermissionsResult',
    'get_permissions',
    'get_permissions_output',
]

@pulumi.output_type
class GetPermissionsResult:
    """
    A collection of values returned by getPermissions.
    """
    def __init__(__self__, id=None, org_id=None, permissions=None, project_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if permissions and not isinstance(permissions, list):
            raise TypeError("Expected argument 'permissions' to be a list")
        pulumi.set(__self__, "permissions", permissions)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

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
        """
        Organization Identifier
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def permissions(self) -> Sequence['outputs.GetPermissionsPermissionResult']:
        """
        Response of the api
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")


class AwaitableGetPermissionsResult(GetPermissionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPermissionsResult(
            id=self.id,
            org_id=self.org_id,
            permissions=self.permissions,
            project_id=self.project_id)


def get_permissions(org_id: Optional[str] = None,
                    project_id: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPermissionsResult:
    """
    Data source for retrieving permissions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_permissions(org_id="org_id",
        project_id="project_id")
    ```


    :param str org_id: Organization Identifier
    :param str project_id: Project Identifier
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getPermissions:getPermissions', __args__, opts=opts, typ=GetPermissionsResult).value

    return AwaitableGetPermissionsResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        permissions=pulumi.get(__ret__, 'permissions'),
        project_id=pulumi.get(__ret__, 'project_id'))
def get_permissions_output(org_id: Optional[pulumi.Input[Optional[str]]] = None,
                           project_id: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPermissionsResult]:
    """
    Data source for retrieving permissions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_permissions(org_id="org_id",
        project_id="project_id")
    ```


    :param str org_id: Organization Identifier
    :param str project_id: Project Identifier
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getPermissions:getPermissions', __args__, opts=opts, typ=GetPermissionsResult)
    return __ret__.apply(lambda __response__: GetPermissionsResult(
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        permissions=pulumi.get(__response__, 'permissions'),
        project_id=pulumi.get(__response__, 'project_id')))
