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
    'GetGitopsAppProjectMappingResult',
    'AwaitableGetGitopsAppProjectMappingResult',
    'get_gitops_app_project_mapping',
    'get_gitops_app_project_mapping_output',
]

@pulumi.output_type
class GetGitopsAppProjectMappingResult:
    """
    A collection of values returned by getGitopsAppProjectMapping.
    """
    def __init__(__self__, account_id=None, agent_id=None, argo_project_name=None, id=None, identifier=None, org_id=None, project_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if agent_id and not isinstance(agent_id, str):
            raise TypeError("Expected argument 'agent_id' to be a str")
        pulumi.set(__self__, "agent_id", agent_id)
        if argo_project_name and not isinstance(argo_project_name, str):
            raise TypeError("Expected argument 'argo_project_name' to be a str")
        pulumi.set(__self__, "argo_project_name", argo_project_name)
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

    @property
    @pulumi.getter(name="accountId")
    @_utilities.deprecated("""This field is deprecated and will be removed in a future release.""")
    def account_id(self) -> str:
        """
        Account identifier of the GitOps agent's Application Project.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="agentId")
    def agent_id(self) -> str:
        """
        Agent identifier for which the ArgoCD and Harness project mapping is to be created.
        """
        return pulumi.get(self, "agent_id")

    @property
    @pulumi.getter(name="argoProjectName")
    def argo_project_name(self) -> str:
        """
        ArgoCD Project name which is to be mapped to the Harness project.
        """
        return pulumi.get(self, "argo_project_name")

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
        Identifier of the GitOps Application Project.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        """
        Organization identifier of the GitOps agent's Application Project.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Project identifier of the GitOps agent's Application Project.
        """
        return pulumi.get(self, "project_id")


class AwaitableGetGitopsAppProjectMappingResult(GetGitopsAppProjectMappingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGitopsAppProjectMappingResult(
            account_id=self.account_id,
            agent_id=self.agent_id,
            argo_project_name=self.argo_project_name,
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            project_id=self.project_id)


def get_gitops_app_project_mapping(account_id: Optional[str] = None,
                                   agent_id: Optional[str] = None,
                                   argo_project_name: Optional[str] = None,
                                   org_id: Optional[str] = None,
                                   project_id: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitopsAppProjectMappingResult:
    """
    Resource for managing the Harness GitOps Application Project Mappings.


    :param str account_id: Account identifier of the GitOps agent's Application Project.
    :param str agent_id: Agent identifier for which the ArgoCD and Harness project mapping is to be created.
    :param str argo_project_name: ArgoCD Project name which is to be mapped to the Harness project.
    :param str org_id: Organization identifier of the GitOps agent's Application Project.
    :param str project_id: Project identifier of the GitOps agent's Application Project.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['argoProjectName'] = argo_project_name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getGitopsAppProjectMapping:getGitopsAppProjectMapping', __args__, opts=opts, typ=GetGitopsAppProjectMappingResult).value

    return AwaitableGetGitopsAppProjectMappingResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        agent_id=pulumi.get(__ret__, 'agent_id'),
        argo_project_name=pulumi.get(__ret__, 'argo_project_name'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'))
def get_gitops_app_project_mapping_output(account_id: Optional[pulumi.Input[Optional[str]]] = None,
                                          agent_id: Optional[pulumi.Input[str]] = None,
                                          argo_project_name: Optional[pulumi.Input[str]] = None,
                                          org_id: Optional[pulumi.Input[str]] = None,
                                          project_id: Optional[pulumi.Input[str]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGitopsAppProjectMappingResult]:
    """
    Resource for managing the Harness GitOps Application Project Mappings.


    :param str account_id: Account identifier of the GitOps agent's Application Project.
    :param str agent_id: Agent identifier for which the ArgoCD and Harness project mapping is to be created.
    :param str argo_project_name: ArgoCD Project name which is to be mapped to the Harness project.
    :param str org_id: Organization identifier of the GitOps agent's Application Project.
    :param str project_id: Project identifier of the GitOps agent's Application Project.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['argoProjectName'] = argo_project_name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getGitopsAppProjectMapping:getGitopsAppProjectMapping', __args__, opts=opts, typ=GetGitopsAppProjectMappingResult)
    return __ret__.apply(lambda __response__: GetGitopsAppProjectMappingResult(
        account_id=pulumi.get(__response__, 'account_id'),
        agent_id=pulumi.get(__response__, 'agent_id'),
        argo_project_name=pulumi.get(__response__, 'argo_project_name'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id')))
