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
    'GetGithubConnectorResult',
    'AwaitableGetGithubConnectorResult',
    'get_github_connector',
    'get_github_connector_output',
]

@pulumi.output_type
class GetGithubConnectorResult:
    """
    A collection of values returned by getGithubConnector.
    """
    def __init__(__self__, api_authentications=None, connection_type=None, credentials=None, delegate_selectors=None, description=None, execute_on_delegate=None, id=None, identifier=None, name=None, org_id=None, project_id=None, tags=None, url=None, validation_repo=None):
        if api_authentications and not isinstance(api_authentications, list):
            raise TypeError("Expected argument 'api_authentications' to be a list")
        pulumi.set(__self__, "api_authentications", api_authentications)
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
        if execute_on_delegate and not isinstance(execute_on_delegate, bool):
            raise TypeError("Expected argument 'execute_on_delegate' to be a bool")
        pulumi.set(__self__, "execute_on_delegate", execute_on_delegate)
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
    @pulumi.getter(name="apiAuthentications")
    def api_authentications(self) -> Sequence['outputs.GetGithubConnectorApiAuthenticationResult']:
        """
        Configuration for using the github api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        """
        return pulumi.get(self, "api_authentications")

    @property
    @pulumi.getter(name="connectionType")
    def connection_type(self) -> str:
        """
        Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
        """
        return pulumi.get(self, "connection_type")

    @property
    @pulumi.getter
    def credentials(self) -> Sequence['outputs.GetGithubConnectorCredentialResult']:
        """
        Credentials to use for the connection.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Sequence[str]:
        """
        Tags to filter delegates for connection.
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
    @pulumi.getter(name="executeOnDelegate")
    def execute_on_delegate(self) -> bool:
        return pulumi.get(self, "execute_on_delegate")

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
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        URL of the github repository or account.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="validationRepo")
    def validation_repo(self) -> str:
        """
        Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        return pulumi.get(self, "validation_repo")


class AwaitableGetGithubConnectorResult(GetGithubConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGithubConnectorResult(
            api_authentications=self.api_authentications,
            connection_type=self.connection_type,
            credentials=self.credentials,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            execute_on_delegate=self.execute_on_delegate,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            tags=self.tags,
            url=self.url,
            validation_repo=self.validation_repo)


def get_github_connector(identifier: Optional[str] = None,
                         name: Optional[str] = None,
                         org_id: Optional[str] = None,
                         project_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGithubConnectorResult:
    """
    Datasource for looking up a Github connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_github_connector(identifier="identifier")
    ```


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
    __ret__ = pulumi.runtime.invoke('harness:platform/getGithubConnector:getGithubConnector', __args__, opts=opts, typ=GetGithubConnectorResult).value

    return AwaitableGetGithubConnectorResult(
        api_authentications=pulumi.get(__ret__, 'api_authentications'),
        connection_type=pulumi.get(__ret__, 'connection_type'),
        credentials=pulumi.get(__ret__, 'credentials'),
        delegate_selectors=pulumi.get(__ret__, 'delegate_selectors'),
        description=pulumi.get(__ret__, 'description'),
        execute_on_delegate=pulumi.get(__ret__, 'execute_on_delegate'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tags=pulumi.get(__ret__, 'tags'),
        url=pulumi.get(__ret__, 'url'),
        validation_repo=pulumi.get(__ret__, 'validation_repo'))
def get_github_connector_output(identifier: Optional[pulumi.Input[str]] = None,
                                name: Optional[pulumi.Input[Optional[str]]] = None,
                                org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGithubConnectorResult]:
    """
    Datasource for looking up a Github connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_github_connector(identifier="identifier")
    ```


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
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getGithubConnector:getGithubConnector', __args__, opts=opts, typ=GetGithubConnectorResult)
    return __ret__.apply(lambda __response__: GetGithubConnectorResult(
        api_authentications=pulumi.get(__response__, 'api_authentications'),
        connection_type=pulumi.get(__response__, 'connection_type'),
        credentials=pulumi.get(__response__, 'credentials'),
        delegate_selectors=pulumi.get(__response__, 'delegate_selectors'),
        description=pulumi.get(__response__, 'description'),
        execute_on_delegate=pulumi.get(__response__, 'execute_on_delegate'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        tags=pulumi.get(__response__, 'tags'),
        url=pulumi.get(__response__, 'url'),
        validation_repo=pulumi.get(__response__, 'validation_repo')))
