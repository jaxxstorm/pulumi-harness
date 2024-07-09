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
    'GetConnectorRancherResult',
    'AwaitableGetConnectorRancherResult',
    'get_connector_rancher',
    'get_connector_rancher_output',
]

@pulumi.output_type
class GetConnectorRancherResult:
    """
    A collection of values returned by getConnectorRancher.
    """
    def __init__(__self__, bearer_token=None, delegate_selectors=None, description=None, id=None, identifier=None, name=None, org_id=None, project_id=None, tags=None):
        if bearer_token and not isinstance(bearer_token, dict):
            raise TypeError("Expected argument 'bearer_token' to be a dict")
        pulumi.set(__self__, "bearer_token", bearer_token)
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

    @property
    @pulumi.getter(name="bearerToken")
    def bearer_token(self) -> Optional['outputs.GetConnectorRancherBearerTokenResult']:
        """
        URL and bearer token for the rancher cluster.
        """
        return pulumi.get(self, "bearer_token")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Sequence[str]:
        """
        Selectors to use for the delegate.
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


class AwaitableGetConnectorRancherResult(GetConnectorRancherResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectorRancherResult(
            bearer_token=self.bearer_token,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            tags=self.tags)


def get_connector_rancher(bearer_token: Optional[pulumi.InputType['GetConnectorRancherBearerTokenArgs']] = None,
                          identifier: Optional[str] = None,
                          name: Optional[str] = None,
                          org_id: Optional[str] = None,
                          project_id: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectorRancherResult:
    """
    Data source for looking up a Rancher connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_connector_rancher(identifier="identifier")
    ```


    :param pulumi.InputType['GetConnectorRancherBearerTokenArgs'] bearer_token: URL and bearer token for the rancher cluster.
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['bearerToken'] = bearer_token
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getConnectorRancher:getConnectorRancher', __args__, opts=opts, typ=GetConnectorRancherResult).value

    return AwaitableGetConnectorRancherResult(
        bearer_token=pulumi.get(__ret__, 'bearer_token'),
        delegate_selectors=pulumi.get(__ret__, 'delegate_selectors'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_connector_rancher)
def get_connector_rancher_output(bearer_token: Optional[pulumi.Input[Optional[pulumi.InputType['GetConnectorRancherBearerTokenArgs']]]] = None,
                                 identifier: Optional[pulumi.Input[str]] = None,
                                 name: Optional[pulumi.Input[Optional[str]]] = None,
                                 org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConnectorRancherResult]:
    """
    Data source for looking up a Rancher connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_connector_rancher(identifier="identifier")
    ```


    :param pulumi.InputType['GetConnectorRancherBearerTokenArgs'] bearer_token: URL and bearer token for the rancher cluster.
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...
