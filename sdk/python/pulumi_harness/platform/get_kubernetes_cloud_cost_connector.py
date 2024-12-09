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
    'GetKubernetesCloudCostConnectorResult',
    'AwaitableGetKubernetesCloudCostConnectorResult',
    'get_kubernetes_cloud_cost_connector',
    'get_kubernetes_cloud_cost_connector_output',
]

@pulumi.output_type
class GetKubernetesCloudCostConnectorResult:
    """
    A collection of values returned by getKubernetesCloudCostConnector.
    """
    def __init__(__self__, connector_ref=None, description=None, features_enableds=None, id=None, identifier=None, name=None, org_id=None, project_id=None, tags=None):
        if connector_ref and not isinstance(connector_ref, str):
            raise TypeError("Expected argument 'connector_ref' to be a str")
        pulumi.set(__self__, "connector_ref", connector_ref)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if features_enableds and not isinstance(features_enableds, list):
            raise TypeError("Expected argument 'features_enableds' to be a list")
        pulumi.set(__self__, "features_enableds", features_enableds)
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
    @pulumi.getter(name="connectorRef")
    def connector_ref(self) -> str:
        """
        Reference of the Connector.
        """
        return pulumi.get(self, "connector_ref")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> Sequence[str]:
        """
        Indicates which feature to enable among Billing, Optimization, and Visibility.
        """
        return pulumi.get(self, "features_enableds")

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


class AwaitableGetKubernetesCloudCostConnectorResult(GetKubernetesCloudCostConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKubernetesCloudCostConnectorResult(
            connector_ref=self.connector_ref,
            description=self.description,
            features_enableds=self.features_enableds,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            tags=self.tags)


def get_kubernetes_cloud_cost_connector(identifier: Optional[str] = None,
                                        name: Optional[str] = None,
                                        org_id: Optional[str] = None,
                                        project_id: Optional[str] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKubernetesCloudCostConnectorResult:
    """
    Datasource for looking up a Kubernetes Cloud Cost connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_kubernetes_cloud_cost_connector(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke('harness:platform/getKubernetesCloudCostConnector:getKubernetesCloudCostConnector', __args__, opts=opts, typ=GetKubernetesCloudCostConnectorResult).value

    return AwaitableGetKubernetesCloudCostConnectorResult(
        connector_ref=pulumi.get(__ret__, 'connector_ref'),
        description=pulumi.get(__ret__, 'description'),
        features_enableds=pulumi.get(__ret__, 'features_enableds'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tags=pulumi.get(__ret__, 'tags'))
def get_kubernetes_cloud_cost_connector_output(identifier: Optional[pulumi.Input[str]] = None,
                                               name: Optional[pulumi.Input[Optional[str]]] = None,
                                               org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                               project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetKubernetesCloudCostConnectorResult]:
    """
    Datasource for looking up a Kubernetes Cloud Cost connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_kubernetes_cloud_cost_connector(identifier="identifier")
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
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getKubernetesCloudCostConnector:getKubernetesCloudCostConnector', __args__, opts=opts, typ=GetKubernetesCloudCostConnectorResult)
    return __ret__.apply(lambda __response__: GetKubernetesCloudCostConnectorResult(
        connector_ref=pulumi.get(__response__, 'connector_ref'),
        description=pulumi.get(__response__, 'description'),
        features_enableds=pulumi.get(__response__, 'features_enableds'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        tags=pulumi.get(__response__, 'tags')))
