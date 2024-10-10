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
    'GetGitxWebhookResult',
    'AwaitableGetGitxWebhookResult',
    'get_gitx_webhook',
    'get_gitx_webhook_output',
]

@pulumi.output_type
class GetGitxWebhookResult:
    """
    A collection of values returned by getGitxWebhook.
    """
    def __init__(__self__, description=None, id=None, identifier=None, name=None, org_id=None, project_id=None, tags=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

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
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

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
    @pulumi.getter
    def tags(self) -> Optional[Sequence[str]]:
        """
        Tags to associate with the resource. These should match the tag value passed in the YAML; if this parameter is null or not passed, the tags specified in YAML should also be null.
        """
        return pulumi.get(self, "tags")


class AwaitableGetGitxWebhookResult(GetGitxWebhookResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGitxWebhookResult(
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            tags=self.tags)


def get_gitx_webhook(description: Optional[str] = None,
                     identifier: Optional[str] = None,
                     name: Optional[str] = None,
                     org_id: Optional[str] = None,
                     project_id: Optional[str] = None,
                     tags: Optional[Sequence[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitxWebhookResult:
    """
    Resource for creating a Harness pipeline.


    :param str description: Description of the resource.
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param Sequence[str] tags: Tags to associate with the resource. These should match the tag value passed in the YAML; if this parameter is null or not passed, the tags specified in YAML should also be null.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getGitxWebhook:getGitxWebhook', __args__, opts=opts, typ=GetGitxWebhookResult).value

    return AwaitableGetGitxWebhookResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tags=pulumi.get(__ret__, 'tags'))
def get_gitx_webhook_output(description: Optional[pulumi.Input[Optional[str]]] = None,
                            identifier: Optional[pulumi.Input[str]] = None,
                            name: Optional[pulumi.Input[str]] = None,
                            org_id: Optional[pulumi.Input[Optional[str]]] = None,
                            project_id: Optional[pulumi.Input[Optional[str]]] = None,
                            tags: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGitxWebhookResult]:
    """
    Resource for creating a Harness pipeline.


    :param str description: Description of the resource.
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param Sequence[str] tags: Tags to associate with the resource. These should match the tag value passed in the YAML; if this parameter is null or not passed, the tags specified in YAML should also be null.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getGitxWebhook:getGitxWebhook', __args__, opts=opts, typ=GetGitxWebhookResult)
    return __ret__.apply(lambda __response__: GetGitxWebhookResult(
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        tags=pulumi.get(__response__, 'tags')))
