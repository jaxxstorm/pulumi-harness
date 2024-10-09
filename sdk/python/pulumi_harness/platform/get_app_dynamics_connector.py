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
    'GetAppDynamicsConnectorResult',
    'AwaitableGetAppDynamicsConnectorResult',
    'get_app_dynamics_connector',
    'get_app_dynamics_connector_output',
]

@pulumi.output_type
class GetAppDynamicsConnectorResult:
    """
    A collection of values returned by getAppDynamicsConnector.
    """
    def __init__(__self__, account_name=None, api_tokens=None, delegate_selectors=None, description=None, id=None, identifier=None, name=None, org_id=None, project_id=None, tags=None, url=None, username_passwords=None):
        if account_name and not isinstance(account_name, str):
            raise TypeError("Expected argument 'account_name' to be a str")
        pulumi.set(__self__, "account_name", account_name)
        if api_tokens and not isinstance(api_tokens, list):
            raise TypeError("Expected argument 'api_tokens' to be a list")
        pulumi.set(__self__, "api_tokens", api_tokens)
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
        if username_passwords and not isinstance(username_passwords, list):
            raise TypeError("Expected argument 'username_passwords' to be a list")
        pulumi.set(__self__, "username_passwords", username_passwords)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        The App Dynamics account name.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="apiTokens")
    def api_tokens(self) -> Sequence['outputs.GetAppDynamicsConnectorApiTokenResult']:
        """
        Authenticate to App Dynamics using api token.
        """
        return pulumi.get(self, "api_tokens")

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
        URL of the App Dynamics controller.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="usernamePasswords")
    def username_passwords(self) -> Sequence['outputs.GetAppDynamicsConnectorUsernamePasswordResult']:
        """
        Authenticate to App Dynamics using username and password.
        """
        return pulumi.get(self, "username_passwords")


class AwaitableGetAppDynamicsConnectorResult(GetAppDynamicsConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppDynamicsConnectorResult(
            account_name=self.account_name,
            api_tokens=self.api_tokens,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            tags=self.tags,
            url=self.url,
            username_passwords=self.username_passwords)


def get_app_dynamics_connector(identifier: Optional[str] = None,
                               name: Optional[str] = None,
                               org_id: Optional[str] = None,
                               project_id: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppDynamicsConnectorResult:
    """
    Datasource for looking up an App Dynamics connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_app_dynamics_connector(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke('harness:platform/getAppDynamicsConnector:getAppDynamicsConnector', __args__, opts=opts, typ=GetAppDynamicsConnectorResult).value

    return AwaitableGetAppDynamicsConnectorResult(
        account_name=pulumi.get(__ret__, 'account_name'),
        api_tokens=pulumi.get(__ret__, 'api_tokens'),
        delegate_selectors=pulumi.get(__ret__, 'delegate_selectors'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tags=pulumi.get(__ret__, 'tags'),
        url=pulumi.get(__ret__, 'url'),
        username_passwords=pulumi.get(__ret__, 'username_passwords'))
def get_app_dynamics_connector_output(identifier: Optional[pulumi.Input[str]] = None,
                                      name: Optional[pulumi.Input[Optional[str]]] = None,
                                      org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                      project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAppDynamicsConnectorResult]:
    """
    Datasource for looking up an App Dynamics connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_app_dynamics_connector(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getAppDynamicsConnector:getAppDynamicsConnector', __args__, opts=opts, typ=GetAppDynamicsConnectorResult)
    return __ret__.apply(lambda __response__: GetAppDynamicsConnectorResult(
        account_name=pulumi.get(__response__, 'account_name'),
        api_tokens=pulumi.get(__response__, 'api_tokens'),
        delegate_selectors=pulumi.get(__response__, 'delegate_selectors'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        tags=pulumi.get(__response__, 'tags'),
        url=pulumi.get(__response__, 'url'),
        username_passwords=pulumi.get(__response__, 'username_passwords')))
