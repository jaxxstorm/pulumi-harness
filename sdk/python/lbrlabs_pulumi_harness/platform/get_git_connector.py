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
    'GetGitConnectorResult',
    'AwaitableGetGitConnectorResult',
    'get_git_connector',
    'get_git_connector_output',
]

@pulumi.output_type
class GetGitConnectorResult:
    """
    A collection of values returned by getGitConnector.
    """
    def __init__(__self__, connection_type=None, credentials=None, delegate_selectors=None, description=None, id=None, identifier=None, name=None, org_id=None, project_id=None, tags=None, url=None, validation_repo=None):
        if connection_type and not isinstance(connection_type, str):
            raise TypeError("Expected argument 'connection_type' to be a str")
        pulumi.set(__self__, "connection_type", connection_type)
        if credentials and not isinstance(credentials, list):
            raise TypeError("Expected argument 'credentials' to be a list")
        pulumi.set(__self__, "credentials", credentials)
        if delegate_selectors and not isinstance(delegate_selectors, list):
            raise TypeError("Expected argument 'delegate_selectors' to be a list")
        pulumi.set(__self__, "delegate_selectors", delegate_selectors)
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
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)
        if validation_repo and not isinstance(validation_repo, str):
            raise TypeError("Expected argument 'validation_repo' to be a str")
        pulumi.set(__self__, "validation_repo", validation_repo)

    @property
    @pulumi.getter(name="connectionType")
    def connection_type(self) -> str:
        """
        Whether the connection we're making is to a git repository or a git account. Valid values are Account, Repo.
        """
        return pulumi.get(self, "connection_type")

    @property
    @pulumi.getter
    def credentials(self) -> Sequence['outputs.GetGitConnectorCredentialResult']:
        """
        Credentials to use for the connection.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Sequence[str]:
        """
        Connect using only the delegates which have these tags.
        """
        return pulumi.get(self, "delegate_selectors")

    @property
    @pulumi.getter
    def description(self) -> str:
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
    def identifier(self) -> Optional[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
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
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        Url of the git repository or account.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="validationRepo")
    def validation_repo(self) -> str:
        """
        Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        return pulumi.get(self, "validation_repo")


class AwaitableGetGitConnectorResult(GetGitConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGitConnectorResult(
            connection_type=self.connection_type,
            credentials=self.credentials,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            tags=self.tags,
            url=self.url,
            validation_repo=self.validation_repo)


def get_git_connector(identifier: Optional[str] = None,
                      name: Optional[str] = None,
                      org_id: Optional[str] = None,
                      project_id: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitConnectorResult:
    """
    Datasource for looking up a Git connector.


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getGitConnector:getGitConnector', __args__, opts=opts, typ=GetGitConnectorResult).value

    return AwaitableGetGitConnectorResult(
        connection_type=__ret__.connection_type,
        credentials=__ret__.credentials,
        delegate_selectors=__ret__.delegate_selectors,
        description=__ret__.description,
        id=__ret__.id,
        identifier=__ret__.identifier,
        name=__ret__.name,
        org_id=__ret__.org_id,
        project_id=__ret__.project_id,
        tags=__ret__.tags,
        url=__ret__.url,
        validation_repo=__ret__.validation_repo)


@_utilities.lift_output_func(get_git_connector)
def get_git_connector_output(identifier: Optional[pulumi.Input[Optional[str]]] = None,
                             name: Optional[pulumi.Input[Optional[str]]] = None,
                             org_id: Optional[pulumi.Input[Optional[str]]] = None,
                             project_id: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGitConnectorResult]:
    """
    Datasource for looking up a Git connector.


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...