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
    'GetConnectorCustomhealthsourceResult',
    'AwaitableGetConnectorCustomhealthsourceResult',
    'get_connector_customhealthsource',
    'get_connector_customhealthsource_output',
]

@pulumi.output_type
class GetConnectorCustomhealthsourceResult:
    """
    A collection of values returned by getConnectorCustomhealthsource.
    """
    def __init__(__self__, delegate_selectors=None, description=None, headers=None, id=None, identifier=None, method=None, name=None, org_id=None, params=None, project_id=None, tags=None, url=None, validation_body=None, validation_path=None):
        if delegate_selectors and not isinstance(delegate_selectors, list):
            raise TypeError("Expected argument 'delegate_selectors' to be a list")
        pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if headers and not isinstance(headers, list):
            raise TypeError("Expected argument 'headers' to be a list")
        pulumi.set(__self__, "headers", headers)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if method and not isinstance(method, str):
            raise TypeError("Expected argument 'method' to be a str")
        pulumi.set(__self__, "method", method)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if params and not isinstance(params, list):
            raise TypeError("Expected argument 'params' to be a list")
        pulumi.set(__self__, "params", params)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)
        if validation_body and not isinstance(validation_body, str):
            raise TypeError("Expected argument 'validation_body' to be a str")
        pulumi.set(__self__, "validation_body", validation_body)
        if validation_path and not isinstance(validation_path, str):
            raise TypeError("Expected argument 'validation_path' to be a str")
        pulumi.set(__self__, "validation_path", validation_path)

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
    def headers(self) -> Sequence['outputs.GetConnectorCustomhealthsourceHeaderResult']:
        """
        Headers.
        """
        return pulumi.get(self, "headers")

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
    def method(self) -> str:
        """
        HTTP Verb Method for the API Call
        """
        return pulumi.get(self, "method")

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
    @pulumi.getter
    def params(self) -> Sequence['outputs.GetConnectorCustomhealthsourceParamResult']:
        """
        Parameters.
        """
        return pulumi.get(self, "params")

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
        URL of the Custom Health source server.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="validationBody")
    def validation_body(self) -> str:
        """
        Body to be sent with the API Call
        """
        return pulumi.get(self, "validation_body")

    @property
    @pulumi.getter(name="validationPath")
    def validation_path(self) -> str:
        """
        Path to be added to the base URL for the API Call
        """
        return pulumi.get(self, "validation_path")


class AwaitableGetConnectorCustomhealthsourceResult(GetConnectorCustomhealthsourceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectorCustomhealthsourceResult(
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            headers=self.headers,
            id=self.id,
            identifier=self.identifier,
            method=self.method,
            name=self.name,
            org_id=self.org_id,
            params=self.params,
            project_id=self.project_id,
            tags=self.tags,
            url=self.url,
            validation_body=self.validation_body,
            validation_path=self.validation_path)


def get_connector_customhealthsource(identifier: Optional[str] = None,
                                     name: Optional[str] = None,
                                     org_id: Optional[str] = None,
                                     project_id: Optional[str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectorCustomhealthsourceResult:
    """
    Datasource for looking up a Custom Health source connector.


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
    __ret__ = pulumi.runtime.invoke('harness:platform/getConnectorCustomhealthsource:getConnectorCustomhealthsource', __args__, opts=opts, typ=GetConnectorCustomhealthsourceResult).value

    return AwaitableGetConnectorCustomhealthsourceResult(
        delegate_selectors=pulumi.get(__ret__, 'delegate_selectors'),
        description=pulumi.get(__ret__, 'description'),
        headers=pulumi.get(__ret__, 'headers'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        method=pulumi.get(__ret__, 'method'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        params=pulumi.get(__ret__, 'params'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tags=pulumi.get(__ret__, 'tags'),
        url=pulumi.get(__ret__, 'url'),
        validation_body=pulumi.get(__ret__, 'validation_body'),
        validation_path=pulumi.get(__ret__, 'validation_path'))


@_utilities.lift_output_func(get_connector_customhealthsource)
def get_connector_customhealthsource_output(identifier: Optional[pulumi.Input[str]] = None,
                                            name: Optional[pulumi.Input[Optional[str]]] = None,
                                            org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                            project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConnectorCustomhealthsourceResult]:
    """
    Datasource for looking up a Custom Health source connector.


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...
