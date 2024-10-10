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

__all__ = [
    'GetEnvironmentClustersMappingResult',
    'AwaitableGetEnvironmentClustersMappingResult',
    'get_environment_clusters_mapping',
    'get_environment_clusters_mapping_output',
]

@pulumi.output_type
class GetEnvironmentClustersMappingResult:
    """
    A collection of values returned by getEnvironmentClustersMapping.
    """
    def __init__(__self__, clusters=None, env_id=None, id=None, identifier=None, org_id=None, project_id=None, scope=None):
        if clusters and not isinstance(clusters, list):
            raise TypeError("Expected argument 'clusters' to be a list")
        pulumi.set(__self__, "clusters", clusters)
        if env_id and not isinstance(env_id, str):
            raise TypeError("Expected argument 'env_id' to be a str")
        pulumi.set(__self__, "env_id", env_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)

    @property
    @pulumi.getter
    def clusters(self) -> Optional[Sequence['outputs.GetEnvironmentClustersMappingClusterResult']]:
        """
        list of cluster identifiers and names
        """
        return pulumi.get(self, "clusters")

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> str:
        """
        environment identifier.
        """
        return pulumi.get(self, "env_id")

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
        identifier for the cluster mapping(can be given any value).
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        org_id of the environment.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        project_id of the environment.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def scope(self) -> str:
        """
        scope at which the environment exists in harness.
        """
        return pulumi.get(self, "scope")


class AwaitableGetEnvironmentClustersMappingResult(GetEnvironmentClustersMappingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEnvironmentClustersMappingResult(
            clusters=self.clusters,
            env_id=self.env_id,
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            project_id=self.project_id,
            scope=self.scope)


def get_environment_clusters_mapping(clusters: Optional[Sequence[Union['GetEnvironmentClustersMappingClusterArgs', 'GetEnvironmentClustersMappingClusterArgsDict']]] = None,
                                     env_id: Optional[str] = None,
                                     identifier: Optional[str] = None,
                                     org_id: Optional[str] = None,
                                     project_id: Optional[str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEnvironmentClustersMappingResult:
    """
    Data source for retrieving Harness Gitops clusters mapped to Harness Environment.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    # data source for gitops clusters mapped to a project level env
    example = harness.platform.get_environment_clusters_mapping(identifier="mycustomidentifier",
        org_id="orgIdentifer",
        project_id="projectIdentifier",
        env_id="exampleEnvId",
        clusters=[{
            "identifier": "incluster",
            "name": "in-cluster",
            "agent_identifier": "account.gitopsagentdev",
            "scope": "ACCOUNT",
        }])
    # data source for two gitops clusters mapped to an account level env
    example2 = harness.platform.get_environment_clusters_mapping(identifier="mycustomidentifier",
        env_id="env1",
        clusters=[
            {
                "identifier": "clusterA",
                "name": "cluster-A",
                "agent_identifier": "account.gitopsagentprod",
                "scope": "ACCOUNT",
            },
            {
                "identifier": "clusterB",
                "name": "cluster-B",
                "agent_identifier": "account.gitopsagentprod",
                "scope": "ACCOUNT",
            },
        ])
    ```


    :param Sequence[Union['GetEnvironmentClustersMappingClusterArgs', 'GetEnvironmentClustersMappingClusterArgsDict']] clusters: list of cluster identifiers and names
    :param str env_id: environment identifier.
    :param str identifier: identifier for the cluster mapping(can be given any value).
    :param str org_id: org_id of the environment.
    :param str project_id: project_id of the environment.
    """
    __args__ = dict()
    __args__['clusters'] = clusters
    __args__['envId'] = env_id
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getEnvironmentClustersMapping:getEnvironmentClustersMapping', __args__, opts=opts, typ=GetEnvironmentClustersMappingResult).value

    return AwaitableGetEnvironmentClustersMappingResult(
        clusters=pulumi.get(__ret__, 'clusters'),
        env_id=pulumi.get(__ret__, 'env_id'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        scope=pulumi.get(__ret__, 'scope'))
def get_environment_clusters_mapping_output(clusters: Optional[pulumi.Input[Optional[Sequence[Union['GetEnvironmentClustersMappingClusterArgs', 'GetEnvironmentClustersMappingClusterArgsDict']]]]] = None,
                                            env_id: Optional[pulumi.Input[str]] = None,
                                            identifier: Optional[pulumi.Input[str]] = None,
                                            org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                            project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEnvironmentClustersMappingResult]:
    """
    Data source for retrieving Harness Gitops clusters mapped to Harness Environment.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    # data source for gitops clusters mapped to a project level env
    example = harness.platform.get_environment_clusters_mapping(identifier="mycustomidentifier",
        org_id="orgIdentifer",
        project_id="projectIdentifier",
        env_id="exampleEnvId",
        clusters=[{
            "identifier": "incluster",
            "name": "in-cluster",
            "agent_identifier": "account.gitopsagentdev",
            "scope": "ACCOUNT",
        }])
    # data source for two gitops clusters mapped to an account level env
    example2 = harness.platform.get_environment_clusters_mapping(identifier="mycustomidentifier",
        env_id="env1",
        clusters=[
            {
                "identifier": "clusterA",
                "name": "cluster-A",
                "agent_identifier": "account.gitopsagentprod",
                "scope": "ACCOUNT",
            },
            {
                "identifier": "clusterB",
                "name": "cluster-B",
                "agent_identifier": "account.gitopsagentprod",
                "scope": "ACCOUNT",
            },
        ])
    ```


    :param Sequence[Union['GetEnvironmentClustersMappingClusterArgs', 'GetEnvironmentClustersMappingClusterArgsDict']] clusters: list of cluster identifiers and names
    :param str env_id: environment identifier.
    :param str identifier: identifier for the cluster mapping(can be given any value).
    :param str org_id: org_id of the environment.
    :param str project_id: project_id of the environment.
    """
    __args__ = dict()
    __args__['clusters'] = clusters
    __args__['envId'] = env_id
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getEnvironmentClustersMapping:getEnvironmentClustersMapping', __args__, opts=opts, typ=GetEnvironmentClustersMappingResult)
    return __ret__.apply(lambda __response__: GetEnvironmentClustersMappingResult(
        clusters=pulumi.get(__response__, 'clusters'),
        env_id=pulumi.get(__response__, 'env_id'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        scope=pulumi.get(__response__, 'scope')))
