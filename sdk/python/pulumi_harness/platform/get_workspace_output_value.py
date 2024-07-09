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
    'GetWorkspaceOutputValueResult',
    'AwaitableGetWorkspaceOutputValueResult',
    'get_workspace_output_value',
    'get_workspace_output_value_output',
]

@pulumi.output_type
class GetWorkspaceOutputValueResult:
    """
    A collection of values returned by getWorkspaceOutputValue.
    """
    def __init__(__self__, id=None, identifier=None, org_id=None, outputs=None, project_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if outputs and not isinstance(outputs, list):
            raise TypeError("Expected argument 'outputs' to be a list")
        pulumi.set(__self__, "outputs", outputs)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

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
        Identifier of the Workspace.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        """
        Organization identifier of the organization the workspace resides in.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def outputs(self) -> Sequence['outputs.GetWorkspaceOutputValueOutputResult']:
        return pulumi.get(self, "outputs")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Project identifier of the project the workspace resides in.
        """
        return pulumi.get(self, "project_id")


class AwaitableGetWorkspaceOutputValueResult(GetWorkspaceOutputValueResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWorkspaceOutputValueResult(
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            outputs=self.outputs,
            project_id=self.project_id)


def get_workspace_output_value(identifier: Optional[str] = None,
                               org_id: Optional[str] = None,
                               project_id: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWorkspaceOutputValueResult:
    """
    Data source for retrieving workspace outputs.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_workspace_output_value(identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str identifier: Identifier of the Workspace.
    :param str org_id: Organization identifier of the organization the workspace resides in.
    :param str project_id: Project identifier of the project the workspace resides in.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getWorkspaceOutputValue:getWorkspaceOutputValue', __args__, opts=opts, typ=GetWorkspaceOutputValueResult).value

    return AwaitableGetWorkspaceOutputValueResult(
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        outputs=pulumi.get(__ret__, 'outputs'),
        project_id=pulumi.get(__ret__, 'project_id'))


@_utilities.lift_output_func(get_workspace_output_value)
def get_workspace_output_value_output(identifier: Optional[pulumi.Input[str]] = None,
                                      org_id: Optional[pulumi.Input[str]] = None,
                                      project_id: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWorkspaceOutputValueResult]:
    """
    Data source for retrieving workspace outputs.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_workspace_output_value(identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str identifier: Identifier of the Workspace.
    :param str org_id: Organization identifier of the organization the workspace resides in.
    :param str project_id: Project identifier of the project the workspace resides in.
    """
    ...
