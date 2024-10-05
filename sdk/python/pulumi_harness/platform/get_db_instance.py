# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetDbInstanceResult',
    'AwaitableGetDbInstanceResult',
    'get_db_instance',
    'get_db_instance_output',
]

@pulumi.output_type
class GetDbInstanceResult:
    """
    A collection of values returned by getDbInstance.
    """
    def __init__(__self__, branch=None, connector=None, context=None, description=None, id=None, identifier=None, name=None, org_id=None, project_id=None, schema=None, tags=None):
        if branch and not isinstance(branch, str):
            raise TypeError("Expected argument 'branch' to be a str")
        pulumi.set(__self__, "branch", branch)
        if connector and not isinstance(connector, str):
            raise TypeError("Expected argument 'connector' to be a str")
        pulumi.set(__self__, "connector", connector)
        if context and not isinstance(context, str):
            raise TypeError("Expected argument 'context' to be a str")
        pulumi.set(__self__, "context", context)
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
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def branch(self) -> str:
        """
        The branch of changeSet repository
        """
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter
    def connector(self) -> str:
        """
        The connector to database
        """
        return pulumi.get(self, "connector")

    @property
    @pulumi.getter
    def context(self) -> str:
        """
        The liquibase context
        """
        return pulumi.get(self, "context")

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
    def org_id(self) -> str:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def schema(self) -> str:
        """
        The identifier of the parent database schema
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetDbInstanceResult(GetDbInstanceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDbInstanceResult(
            branch=self.branch,
            connector=self.connector,
            context=self.context,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            schema=self.schema,
            tags=self.tags)


def get_db_instance(identifier: Optional[str] = None,
                    name: Optional[str] = None,
                    org_id: Optional[str] = None,
                    project_id: Optional[str] = None,
                    schema: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDbInstanceResult:
    """
    Data source for retrieving a Harness DBDevOps Instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_db_instance(identifier="identifier",
        org_id="org_id",
        project_id="project_id",
        schema="schema1")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param str schema: The identifier of the parent database schema
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getDbInstance:getDbInstance', __args__, opts=opts, typ=GetDbInstanceResult).value

    return AwaitableGetDbInstanceResult(
        branch=pulumi.get(__ret__, 'branch'),
        connector=pulumi.get(__ret__, 'connector'),
        context=pulumi.get(__ret__, 'context'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        schema=pulumi.get(__ret__, 'schema'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_db_instance)
def get_db_instance_output(identifier: Optional[pulumi.Input[str]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           org_id: Optional[pulumi.Input[str]] = None,
                           project_id: Optional[pulumi.Input[str]] = None,
                           schema: Optional[pulumi.Input[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDbInstanceResult]:
    """
    Data source for retrieving a Harness DBDevOps Instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_db_instance(identifier="identifier",
        org_id="org_id",
        project_id="project_id",
        schema="schema1")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param str schema: The identifier of the parent database schema
    """
    ...