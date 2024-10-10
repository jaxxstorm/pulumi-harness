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
    'GetUsergroupResult',
    'AwaitableGetUsergroupResult',
    'get_usergroup',
    'get_usergroup_output',
]

@pulumi.output_type
class GetUsergroupResult:
    """
    A collection of values returned by getUsergroup.
    """
    def __init__(__self__, description=None, externally_managed=None, id=None, identifier=None, linked_sso_display_name=None, linked_sso_id=None, linked_sso_type=None, name=None, notification_configs=None, org_id=None, project_id=None, sso_group_id=None, sso_group_name=None, sso_linked=None, tags=None, users=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if externally_managed and not isinstance(externally_managed, bool):
            raise TypeError("Expected argument 'externally_managed' to be a bool")
        pulumi.set(__self__, "externally_managed", externally_managed)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if linked_sso_display_name and not isinstance(linked_sso_display_name, str):
            raise TypeError("Expected argument 'linked_sso_display_name' to be a str")
        pulumi.set(__self__, "linked_sso_display_name", linked_sso_display_name)
        if linked_sso_id and not isinstance(linked_sso_id, str):
            raise TypeError("Expected argument 'linked_sso_id' to be a str")
        pulumi.set(__self__, "linked_sso_id", linked_sso_id)
        if linked_sso_type and not isinstance(linked_sso_type, str):
            raise TypeError("Expected argument 'linked_sso_type' to be a str")
        pulumi.set(__self__, "linked_sso_type", linked_sso_type)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if notification_configs and not isinstance(notification_configs, list):
            raise TypeError("Expected argument 'notification_configs' to be a list")
        pulumi.set(__self__, "notification_configs", notification_configs)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if sso_group_id and not isinstance(sso_group_id, str):
            raise TypeError("Expected argument 'sso_group_id' to be a str")
        pulumi.set(__self__, "sso_group_id", sso_group_id)
        if sso_group_name and not isinstance(sso_group_name, str):
            raise TypeError("Expected argument 'sso_group_name' to be a str")
        pulumi.set(__self__, "sso_group_name", sso_group_name)
        if sso_linked and not isinstance(sso_linked, bool):
            raise TypeError("Expected argument 'sso_linked' to be a bool")
        pulumi.set(__self__, "sso_linked", sso_linked)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="externallyManaged")
    def externally_managed(self) -> bool:
        """
        Whether the user group is externally managed.
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
    def identifier(self) -> Optional[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="linkedSsoDisplayName")
    def linked_sso_display_name(self) -> str:
        """
        Name of the linked SSO.
        """
        return pulumi.get(self, "linked_sso_display_name")

    @property
    @pulumi.getter(name="linkedSsoId")
    def linked_sso_id(self) -> str:
        """
        The SSO account ID that the user group is linked to.
        """
        return pulumi.get(self, "linked_sso_id")

    @property
    @pulumi.getter(name="linkedSsoType")
    def linked_sso_type(self) -> str:
        """
        Type of linked SSO.
        """
        return pulumi.get(self, "linked_sso_type")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notificationConfigs")
    def notification_configs(self) -> Optional[Sequence['outputs.GetUsergroupNotificationConfigResult']]:
        """
        List of notification settings.
        """
        return pulumi.get(self, "notification_configs")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="ssoGroupId")
    def sso_group_id(self) -> str:
        """
        Identifier of the userGroup in SSO.
        """
        return pulumi.get(self, "sso_group_id")

    @property
    @pulumi.getter(name="ssoGroupName")
    def sso_group_name(self) -> str:
        """
        Name of the SSO userGroup.
        """
        return pulumi.get(self, "sso_group_name")

    @property
    @pulumi.getter(name="ssoLinked")
    def sso_linked(self) -> bool:
        """
        Whether sso is linked or not.
        """
        return pulumi.get(self, "sso_linked")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def users(self) -> Sequence[str]:
        """
        List of users in the UserGroup.
        """
        return pulumi.get(self, "users")


class AwaitableGetUsergroupResult(GetUsergroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUsergroupResult(
            description=self.description,
            externally_managed=self.externally_managed,
            id=self.id,
            identifier=self.identifier,
            linked_sso_display_name=self.linked_sso_display_name,
            linked_sso_id=self.linked_sso_id,
            linked_sso_type=self.linked_sso_type,
            name=self.name,
            notification_configs=self.notification_configs,
            org_id=self.org_id,
            project_id=self.project_id,
            sso_group_id=self.sso_group_id,
            sso_group_name=self.sso_group_name,
            sso_linked=self.sso_linked,
            tags=self.tags,
            users=self.users)


def get_usergroup(identifier: Optional[str] = None,
                  name: Optional[str] = None,
                  notification_configs: Optional[Sequence[Union['GetUsergroupNotificationConfigArgs', 'GetUsergroupNotificationConfigArgsDict']]] = None,
                  org_id: Optional[str] = None,
                  project_id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUsergroupResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example_by_id = harness.platform.get_usergroup(identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    example_by_name = harness.platform.get_usergroup(name="name",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param Sequence[Union['GetUsergroupNotificationConfigArgs', 'GetUsergroupNotificationConfigArgsDict']] notification_configs: List of notification settings.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['notificationConfigs'] = notification_configs
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getUsergroup:getUsergroup', __args__, opts=opts, typ=GetUsergroupResult).value

    return AwaitableGetUsergroupResult(
        description=pulumi.get(__ret__, 'description'),
        externally_managed=pulumi.get(__ret__, 'externally_managed'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        linked_sso_display_name=pulumi.get(__ret__, 'linked_sso_display_name'),
        linked_sso_id=pulumi.get(__ret__, 'linked_sso_id'),
        linked_sso_type=pulumi.get(__ret__, 'linked_sso_type'),
        name=pulumi.get(__ret__, 'name'),
        notification_configs=pulumi.get(__ret__, 'notification_configs'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        sso_group_id=pulumi.get(__ret__, 'sso_group_id'),
        sso_group_name=pulumi.get(__ret__, 'sso_group_name'),
        sso_linked=pulumi.get(__ret__, 'sso_linked'),
        tags=pulumi.get(__ret__, 'tags'),
        users=pulumi.get(__ret__, 'users'))
def get_usergroup_output(identifier: Optional[pulumi.Input[Optional[str]]] = None,
                         name: Optional[pulumi.Input[Optional[str]]] = None,
                         notification_configs: Optional[pulumi.Input[Optional[Sequence[Union['GetUsergroupNotificationConfigArgs', 'GetUsergroupNotificationConfigArgsDict']]]]] = None,
                         org_id: Optional[pulumi.Input[Optional[str]]] = None,
                         project_id: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUsergroupResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example_by_id = harness.platform.get_usergroup(identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    example_by_name = harness.platform.get_usergroup(name="name",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param Sequence[Union['GetUsergroupNotificationConfigArgs', 'GetUsergroupNotificationConfigArgsDict']] notification_configs: List of notification settings.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['notificationConfigs'] = notification_configs
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getUsergroup:getUsergroup', __args__, opts=opts, typ=GetUsergroupResult)
    return __ret__.apply(lambda __response__: GetUsergroupResult(
        description=pulumi.get(__response__, 'description'),
        externally_managed=pulumi.get(__response__, 'externally_managed'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        linked_sso_display_name=pulumi.get(__response__, 'linked_sso_display_name'),
        linked_sso_id=pulumi.get(__response__, 'linked_sso_id'),
        linked_sso_type=pulumi.get(__response__, 'linked_sso_type'),
        name=pulumi.get(__response__, 'name'),
        notification_configs=pulumi.get(__response__, 'notification_configs'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        sso_group_id=pulumi.get(__response__, 'sso_group_id'),
        sso_group_name=pulumi.get(__response__, 'sso_group_name'),
        sso_linked=pulumi.get(__response__, 'sso_linked'),
        tags=pulumi.get(__response__, 'tags'),
        users=pulumi.get(__response__, 'users')))
