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

__all__ = ['PipelineFiltersArgs', 'PipelineFilters']

@pulumi.input_type
class PipelineFiltersArgs:
    def __init__(__self__, *,
                 filter_properties: pulumi.Input['PipelineFiltersFilterPropertiesArgs'],
                 identifier: pulumi.Input[str],
                 type: pulumi.Input[str],
                 filter_visibility: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PipelineFilters resource.
        :param pulumi.Input['PipelineFiltersFilterPropertiesArgs'] filter_properties: Properties of the filters entity defined in Harness.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] type: Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        :param pulumi.Input[str] filter_visibility: This indicates visibility of filters. By default, everyone can view this filter.
        :param pulumi.Input[str] name: Name of the pipeline filters.
        :param pulumi.Input[str] org_id: Organization Identifier for the Entity.
        :param pulumi.Input[str] project_id: Project Identifier for the Entity.
        """
        pulumi.set(__self__, "filter_properties", filter_properties)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "type", type)
        if filter_visibility is not None:
            pulumi.set(__self__, "filter_visibility", filter_visibility)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="filterProperties")
    def filter_properties(self) -> pulumi.Input['PipelineFiltersFilterPropertiesArgs']:
        """
        Properties of the filters entity defined in Harness.
        """
        return pulumi.get(self, "filter_properties")

    @filter_properties.setter
    def filter_properties(self, value: pulumi.Input['PipelineFiltersFilterPropertiesArgs']):
        pulumi.set(self, "filter_properties", value)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="filterVisibility")
    def filter_visibility(self) -> Optional[pulumi.Input[str]]:
        """
        This indicates visibility of filters. By default, everyone can view this filter.
        """
        return pulumi.get(self, "filter_visibility")

    @filter_visibility.setter
    def filter_visibility(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filter_visibility", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the pipeline filters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Organization Identifier for the Entity.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Project Identifier for the Entity.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


@pulumi.input_type
class _PipelineFiltersState:
    def __init__(__self__, *,
                 filter_properties: Optional[pulumi.Input['PipelineFiltersFilterPropertiesArgs']] = None,
                 filter_visibility: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PipelineFilters resources.
        :param pulumi.Input['PipelineFiltersFilterPropertiesArgs'] filter_properties: Properties of the filters entity defined in Harness.
        :param pulumi.Input[str] filter_visibility: This indicates visibility of filters. By default, everyone can view this filter.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the pipeline filters.
        :param pulumi.Input[str] org_id: Organization Identifier for the Entity.
        :param pulumi.Input[str] project_id: Project Identifier for the Entity.
        :param pulumi.Input[str] type: Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        """
        if filter_properties is not None:
            pulumi.set(__self__, "filter_properties", filter_properties)
        if filter_visibility is not None:
            pulumi.set(__self__, "filter_visibility", filter_visibility)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="filterProperties")
    def filter_properties(self) -> Optional[pulumi.Input['PipelineFiltersFilterPropertiesArgs']]:
        """
        Properties of the filters entity defined in Harness.
        """
        return pulumi.get(self, "filter_properties")

    @filter_properties.setter
    def filter_properties(self, value: Optional[pulumi.Input['PipelineFiltersFilterPropertiesArgs']]):
        pulumi.set(self, "filter_properties", value)

    @property
    @pulumi.getter(name="filterVisibility")
    def filter_visibility(self) -> Optional[pulumi.Input[str]]:
        """
        This indicates visibility of filters. By default, everyone can view this filter.
        """
        return pulumi.get(self, "filter_visibility")

    @filter_visibility.setter
    def filter_visibility(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filter_visibility", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the pipeline filters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Organization Identifier for the Entity.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Project Identifier for the Entity.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class PipelineFilters(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 filter_properties: Optional[pulumi.Input[Union['PipelineFiltersFilterPropertiesArgs', 'PipelineFiltersFilterPropertiesArgsDict']]] = None,
                 filter_visibility: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating Harness Pipeline Filters.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.platform.PipelineFilters("test",
            identifier="identifier",
            name="name",
            org_id="org_id",
            project_id="project_id",
            type="PipelineSetup",
            filter_properties={
                "name": "pipeline_name",
                "description": "pipeline_description",
                "pipeline_identifiers": [
                    "id1",
                    "id2",
                ],
                "filter_type": "PipelineSetup",
            },
            filter_visibility="EveryOne")
        # pipeline execution filter consisiting services (service_identifiers) filter
        execution = harness.platform.PipelineFilters("execution",
            identifier="identifier",
            name="name",
            org_id="org_id",
            project_id="project_id",
            type="PipelineSetup",
            filter_properties={
                "name": "pipeline_name",
                "description": "pipeline_description",
                "pipeline_identifiers": [
                    "id1",
                    "id2",
                ],
                "filter_type": "PipelineExecution",
                "module_properties": {
                    "cd": {
                        "deployment_types": "Kubernetes",
                        "service_identifiers": ["nginx"],
                    },
                },
            },
            filter_visibility="EveryOne")
        # pipeline filter with tags
        example_with_tags = harness.platform.PipelineFilters("example_with_tags",
            identifier="identifier",
            name="name",
            org_id="org_id",
            project_id="project_id",
            type="PipelineSetup",
            filter_properties={
                "filter_type": "PipelineSetup",
                "pipeline_tags": [
                    {
                        "key": "tag1",
                        "value": "123",
                    },
                    {
                        "key": "tag2",
                        "value": "456",
                    },
                ],
                "module_properties": {
                    "cd": {
                        "deployment_types": "Kubernetes",
                        "service_names": [
                            "service1",
                            "service2",
                        ],
                        "environment_names": [
                            "env1",
                            "env2",
                        ],
                        "artifact_display_names": [
                            "artificatname1",
                            "artifact2",
                        ],
                    },
                    "ci": {
                        "build_type": "branch",
                        "branch": "branch123",
                        "repo_names": "repo1234",
                    },
                },
            })
        pipelinemoduleproperties = harness.platform.PipelineFilters("pipelinemoduleproperties",
            identifier="identifier",
            name="name",
            org_id=test_harness_platform_project["orgId"],
            project_id=test_harness_platform_project["id"],
            type="PipelineExecution",
            filter_properties={
                "filter_type": "PipelineExecution",
                "pipeline_name": "test",
                "pipeline_tags": [
                    {
                        "key": "k1",
                        "value": "v1",
                    },
                    {
                        "key": "k2",
                        "value": "v2",
                    },
                ],
                "module_properties": {
                    "cd": {
                        "service_definition_types": "Kubernetes",
                        "service_identifiers": ["K8"],
                        "environment_identifiers": ["dev"],
                        "artifact_display_names": ["artificatname1"],
                    },
                },
            })
        ```

        ## Import

        Import account level pipeline filter

        ```sh
        $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <filter_id>/<type>
        ```

        Import org level pipeline filter

        ```sh
        $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <ord_id>/<filter_id>/<type>
        ```

        Import project level pipeline filter

        ```sh
        $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <org_id>/<project_id>/<filter_id>/<type>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['PipelineFiltersFilterPropertiesArgs', 'PipelineFiltersFilterPropertiesArgsDict']] filter_properties: Properties of the filters entity defined in Harness.
        :param pulumi.Input[str] filter_visibility: This indicates visibility of filters. By default, everyone can view this filter.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the pipeline filters.
        :param pulumi.Input[str] org_id: Organization Identifier for the Entity.
        :param pulumi.Input[str] project_id: Project Identifier for the Entity.
        :param pulumi.Input[str] type: Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PipelineFiltersArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating Harness Pipeline Filters.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.platform.PipelineFilters("test",
            identifier="identifier",
            name="name",
            org_id="org_id",
            project_id="project_id",
            type="PipelineSetup",
            filter_properties={
                "name": "pipeline_name",
                "description": "pipeline_description",
                "pipeline_identifiers": [
                    "id1",
                    "id2",
                ],
                "filter_type": "PipelineSetup",
            },
            filter_visibility="EveryOne")
        # pipeline execution filter consisiting services (service_identifiers) filter
        execution = harness.platform.PipelineFilters("execution",
            identifier="identifier",
            name="name",
            org_id="org_id",
            project_id="project_id",
            type="PipelineSetup",
            filter_properties={
                "name": "pipeline_name",
                "description": "pipeline_description",
                "pipeline_identifiers": [
                    "id1",
                    "id2",
                ],
                "filter_type": "PipelineExecution",
                "module_properties": {
                    "cd": {
                        "deployment_types": "Kubernetes",
                        "service_identifiers": ["nginx"],
                    },
                },
            },
            filter_visibility="EveryOne")
        # pipeline filter with tags
        example_with_tags = harness.platform.PipelineFilters("example_with_tags",
            identifier="identifier",
            name="name",
            org_id="org_id",
            project_id="project_id",
            type="PipelineSetup",
            filter_properties={
                "filter_type": "PipelineSetup",
                "pipeline_tags": [
                    {
                        "key": "tag1",
                        "value": "123",
                    },
                    {
                        "key": "tag2",
                        "value": "456",
                    },
                ],
                "module_properties": {
                    "cd": {
                        "deployment_types": "Kubernetes",
                        "service_names": [
                            "service1",
                            "service2",
                        ],
                        "environment_names": [
                            "env1",
                            "env2",
                        ],
                        "artifact_display_names": [
                            "artificatname1",
                            "artifact2",
                        ],
                    },
                    "ci": {
                        "build_type": "branch",
                        "branch": "branch123",
                        "repo_names": "repo1234",
                    },
                },
            })
        pipelinemoduleproperties = harness.platform.PipelineFilters("pipelinemoduleproperties",
            identifier="identifier",
            name="name",
            org_id=test_harness_platform_project["orgId"],
            project_id=test_harness_platform_project["id"],
            type="PipelineExecution",
            filter_properties={
                "filter_type": "PipelineExecution",
                "pipeline_name": "test",
                "pipeline_tags": [
                    {
                        "key": "k1",
                        "value": "v1",
                    },
                    {
                        "key": "k2",
                        "value": "v2",
                    },
                ],
                "module_properties": {
                    "cd": {
                        "service_definition_types": "Kubernetes",
                        "service_identifiers": ["K8"],
                        "environment_identifiers": ["dev"],
                        "artifact_display_names": ["artificatname1"],
                    },
                },
            })
        ```

        ## Import

        Import account level pipeline filter

        ```sh
        $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <filter_id>/<type>
        ```

        Import org level pipeline filter

        ```sh
        $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <ord_id>/<filter_id>/<type>
        ```

        Import project level pipeline filter

        ```sh
        $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <org_id>/<project_id>/<filter_id>/<type>
        ```

        :param str resource_name: The name of the resource.
        :param PipelineFiltersArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PipelineFiltersArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 filter_properties: Optional[pulumi.Input[Union['PipelineFiltersFilterPropertiesArgs', 'PipelineFiltersFilterPropertiesArgsDict']]] = None,
                 filter_visibility: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PipelineFiltersArgs.__new__(PipelineFiltersArgs)

            if filter_properties is None and not opts.urn:
                raise TypeError("Missing required property 'filter_properties'")
            __props__.__dict__["filter_properties"] = filter_properties
            __props__.__dict__["filter_visibility"] = filter_visibility
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(PipelineFilters, __self__).__init__(
            'harness:platform/pipelineFilters:PipelineFilters',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            filter_properties: Optional[pulumi.Input[Union['PipelineFiltersFilterPropertiesArgs', 'PipelineFiltersFilterPropertiesArgsDict']]] = None,
            filter_visibility: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'PipelineFilters':
        """
        Get an existing PipelineFilters resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['PipelineFiltersFilterPropertiesArgs', 'PipelineFiltersFilterPropertiesArgsDict']] filter_properties: Properties of the filters entity defined in Harness.
        :param pulumi.Input[str] filter_visibility: This indicates visibility of filters. By default, everyone can view this filter.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the pipeline filters.
        :param pulumi.Input[str] org_id: Organization Identifier for the Entity.
        :param pulumi.Input[str] project_id: Project Identifier for the Entity.
        :param pulumi.Input[str] type: Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PipelineFiltersState.__new__(_PipelineFiltersState)

        __props__.__dict__["filter_properties"] = filter_properties
        __props__.__dict__["filter_visibility"] = filter_visibility
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["type"] = type
        return PipelineFilters(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="filterProperties")
    def filter_properties(self) -> pulumi.Output['outputs.PipelineFiltersFilterProperties']:
        """
        Properties of the filters entity defined in Harness.
        """
        return pulumi.get(self, "filter_properties")

    @property
    @pulumi.getter(name="filterVisibility")
    def filter_visibility(self) -> pulumi.Output[str]:
        """
        This indicates visibility of filters. By default, everyone can view this filter.
        """
        return pulumi.get(self, "filter_visibility")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the pipeline filters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[str]]:
        """
        Organization Identifier for the Entity.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        Project Identifier for the Entity.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
        """
        return pulumi.get(self, "type")

