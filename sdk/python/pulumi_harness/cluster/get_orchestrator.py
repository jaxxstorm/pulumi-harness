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
    'GetOrchestratorResult',
    'AwaitableGetOrchestratorResult',
    'get_orchestrator',
    'get_orchestrator_output',
]

@pulumi.output_type
class GetOrchestratorResult:
    """
    A collection of values returned by getOrchestrator.
    """
    def __init__(__self__, cluster_endpoint=None, id=None, k8s_connector_id=None, name=None):
        if cluster_endpoint and not isinstance(cluster_endpoint, str):
            raise TypeError("Expected argument 'cluster_endpoint' to be a str")
        pulumi.set(__self__, "cluster_endpoint", cluster_endpoint)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if k8s_connector_id and not isinstance(k8s_connector_id, str):
            raise TypeError("Expected argument 'k8s_connector_id' to be a str")
        pulumi.set(__self__, "k8s_connector_id", k8s_connector_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="clusterEndpoint")
    def cluster_endpoint(self) -> str:
        """
        Endpoint of the k8s cluster being onboarded under the orchestrator
        """
        return pulumi.get(self, "cluster_endpoint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="k8sConnectorId")
    def k8s_connector_id(self) -> Optional[str]:
        """
        ID of the Harness Kubernetes Connector Being used
        """
        return pulumi.get(self, "k8s_connector_id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the Orchestrator
        """
        return pulumi.get(self, "name")


class AwaitableGetOrchestratorResult(GetOrchestratorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrchestratorResult(
            cluster_endpoint=self.cluster_endpoint,
            id=self.id,
            k8s_connector_id=self.k8s_connector_id,
            name=self.name)


def get_orchestrator(cluster_endpoint: Optional[str] = None,
                     k8s_connector_id: Optional[str] = None,
                     name: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrchestratorResult:
    """
    Data source for retrieving a Harness ClusterOrchestrator.


    :param str cluster_endpoint: Endpoint of the k8s cluster being onboarded under the orchestrator
    :param str k8s_connector_id: ID of the Harness Kubernetes Connector Being used
    :param str name: Name of the Orchestrator
    """
    __args__ = dict()
    __args__['clusterEndpoint'] = cluster_endpoint
    __args__['k8sConnectorId'] = k8s_connector_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:cluster/getOrchestrator:getOrchestrator', __args__, opts=opts, typ=GetOrchestratorResult).value

    return AwaitableGetOrchestratorResult(
        cluster_endpoint=pulumi.get(__ret__, 'cluster_endpoint'),
        id=pulumi.get(__ret__, 'id'),
        k8s_connector_id=pulumi.get(__ret__, 'k8s_connector_id'),
        name=pulumi.get(__ret__, 'name'))
def get_orchestrator_output(cluster_endpoint: Optional[pulumi.Input[str]] = None,
                            k8s_connector_id: Optional[pulumi.Input[Optional[str]]] = None,
                            name: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOrchestratorResult]:
    """
    Data source for retrieving a Harness ClusterOrchestrator.


    :param str cluster_endpoint: Endpoint of the k8s cluster being onboarded under the orchestrator
    :param str k8s_connector_id: ID of the Harness Kubernetes Connector Being used
    :param str name: Name of the Orchestrator
    """
    __args__ = dict()
    __args__['clusterEndpoint'] = cluster_endpoint
    __args__['k8sConnectorId'] = k8s_connector_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:cluster/getOrchestrator:getOrchestrator', __args__, opts=opts, typ=GetOrchestratorResult)
    return __ret__.apply(lambda __response__: GetOrchestratorResult(
        cluster_endpoint=pulumi.get(__response__, 'cluster_endpoint'),
        id=pulumi.get(__response__, 'id'),
        k8s_connector_id=pulumi.get(__response__, 'k8s_connector_id'),
        name=pulumi.get(__response__, 'name')))
