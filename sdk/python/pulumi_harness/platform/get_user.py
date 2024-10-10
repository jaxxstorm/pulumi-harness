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

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, disabled=None, email=None, externally_managed=None, id=None, identifier=None, locked=None, name=None, org_id=None, project_id=None):
        if disabled and not isinstance(disabled, bool):
            raise TypeError("Expected argument 'disabled' to be a bool")
        pulumi.set(__self__, "disabled", disabled)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if externally_managed and not isinstance(externally_managed, bool):
            raise TypeError("Expected argument 'externally_managed' to be a bool")
        pulumi.set(__self__, "externally_managed", externally_managed)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if locked and not isinstance(locked, bool):
            raise TypeError("Expected argument 'locked' to be a bool")
        pulumi.set(__self__, "locked", locked)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter
    def disabled(self) -> bool:
        """
        Whether or not the user account is disabled.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        The email of the user.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="externallyManaged")
    def externally_managed(self) -> bool:
        """
        Whether or not the user account is externally managed.
        """
        return pulumi.get(self, "externally_managed")

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
        Unique identifier of the user.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def locked(self) -> bool:
        """
        Whether or not the user account is locked.
        """
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the user.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Organization identifier of the user.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project identifier of the user.
        """
        return pulumi.get(self, "project_id")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            disabled=self.disabled,
            email=self.email,
            externally_managed=self.externally_managed,
            id=self.id,
            identifier=self.identifier,
            locked=self.locked,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id)


def get_user(email: Optional[str] = None,
             org_id: Optional[str] = None,
             project_id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_user(org_id="org_id",
        project_id="project_id",
        email="john.doe@harness.io")
    ```


    :param str email: The email of the user.
    :param str org_id: Organization identifier of the user.
    :param str project_id: Project identifier of the user.
    """
    __args__ = dict()
    __args__['email'] = email
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        disabled=pulumi.get(__ret__, 'disabled'),
        email=pulumi.get(__ret__, 'email'),
        externally_managed=pulumi.get(__ret__, 'externally_managed'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        locked=pulumi.get(__ret__, 'locked'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'))
def get_user_output(email: Optional[pulumi.Input[str]] = None,
                    org_id: Optional[pulumi.Input[Optional[str]]] = None,
                    project_id: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_user(org_id="org_id",
        project_id="project_id",
        email="john.doe@harness.io")
    ```


    :param str email: The email of the user.
    :param str org_id: Organization identifier of the user.
    :param str project_id: Project identifier of the user.
    """
    __args__ = dict()
    __args__['email'] = email
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getUser:getUser', __args__, opts=opts, typ=GetUserResult)
    return __ret__.apply(lambda __response__: GetUserResult(
        disabled=pulumi.get(__response__, 'disabled'),
        email=pulumi.get(__response__, 'email'),
        externally_managed=pulumi.get(__response__, 'externally_managed'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        locked=pulumi.get(__response__, 'locked'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id')))
