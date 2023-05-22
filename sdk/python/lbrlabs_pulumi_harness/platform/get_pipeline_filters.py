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
    'GetPipelineFiltersResult',
    'AwaitableGetPipelineFiltersResult',
    'get_pipeline_filters',
    'get_pipeline_filters_output',
]

@pulumi.output_type
class GetPipelineFiltersResult:
    """
    A collection of values returned by getPipelineFilters.
    """
    def __init__(__self__, filter_properties=None, filter_visibility=None, id=None, identifier=None, name=None, org_id=None, project_id=None, type=None):
        if filter_properties and not isinstance(filter_properties, list):
            raise TypeError("Expected argument 'filter_properties' to be a list")
        pulumi.set(__self__, "filter_properties", filter_properties)
        if filter_visibility and not isinstance(filter_visibility, str):
            raise TypeError("Expected argument 'filter_visibility' to be a str")
        pulumi.set(__self__, "filter_visibility", filter_visibility)
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
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="filterProperties")
    def filter_properties(self) -> Sequence['outputs.GetPipelineFiltersFilterPropertyResult']:
        """
        Properties of the filter entity defined in Harness.
        """
        return pulumi.get(self, "filter_properties")

    @property
    @pulumi.getter(name="filterVisibility")
    def filter_visibility(self) -> str:
        """
        This indicates visibility of filter. By default, everyone can view this filter.
        """
        return pulumi.get(self, "filter_visibility")

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
        Name of the Filter.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Organization Identifier for the Entity.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project Identifier for the Entity.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of filter. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}.
        """
        return pulumi.get(self, "type")


class AwaitableGetPipelineFiltersResult(GetPipelineFiltersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPipelineFiltersResult(
            filter_properties=self.filter_properties,
            filter_visibility=self.filter_visibility,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            type=self.type)


def get_pipeline_filters(identifier: Optional[str] = None,
                         org_id: Optional[str] = None,
                         project_id: Optional[str] = None,
                         type: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPipelineFiltersResult:
    """
    Data source for retrieving a Harness Pipeline Filter.


    :param str identifier: Unique identifier of the resource.
    :param str org_id: Organization Identifier for the Entity.
    :param str project_id: Project Identifier for the Entity.
    :param str type: Type of filter. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getPipelineFilters:getPipelineFilters', __args__, opts=opts, typ=GetPipelineFiltersResult).value

    return AwaitableGetPipelineFiltersResult(
        filter_properties=__ret__.filter_properties,
        filter_visibility=__ret__.filter_visibility,
        id=__ret__.id,
        identifier=__ret__.identifier,
        name=__ret__.name,
        org_id=__ret__.org_id,
        project_id=__ret__.project_id,
        type=__ret__.type)


@_utilities.lift_output_func(get_pipeline_filters)
def get_pipeline_filters_output(identifier: Optional[pulumi.Input[str]] = None,
                                org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                type: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPipelineFiltersResult]:
    """
    Data source for retrieving a Harness Pipeline Filter.


    :param str identifier: Unique identifier of the resource.
    :param str org_id: Organization Identifier for the Entity.
    :param str project_id: Project Identifier for the Entity.
    :param str type: Type of filter. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}.
    """
    ...
