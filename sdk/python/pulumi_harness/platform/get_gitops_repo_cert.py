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
    'GetGitopsRepoCertResult',
    'AwaitableGetGitopsRepoCertResult',
    'get_gitops_repo_cert',
    'get_gitops_repo_cert_output',
]

@pulumi.output_type
class GetGitopsRepoCertResult:
    """
    A collection of values returned by getGitopsRepoCert.
    """
    def __init__(__self__, account_id=None, agent_id=None, id=None, org_id=None, project_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if agent_id and not isinstance(agent_id, str):
            raise TypeError("Expected argument 'agent_id' to be a str")
        pulumi.set(__self__, "agent_id", agent_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Account identifier of the GitOps repository certificate.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="agentId")
    def agent_id(self) -> Optional[str]:
        """
        Agent identifier of the GitOps repository certificate.
        """
        return pulumi.get(self, "agent_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Organization identifier of the GitOps repository certificate.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project identifier of the GitOps repository certificate.
        """
        return pulumi.get(self, "project_id")


class AwaitableGetGitopsRepoCertResult(GetGitopsRepoCertResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGitopsRepoCertResult(
            account_id=self.account_id,
            agent_id=self.agent_id,
            id=self.id,
            org_id=self.org_id,
            project_id=self.project_id)


def get_gitops_repo_cert(account_id: Optional[str] = None,
                         agent_id: Optional[str] = None,
                         org_id: Optional[str] = None,
                         project_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitopsRepoCertResult:
    """
    Data source for retrieving a GitOps Repository Certificate. It fetches all the certificates that are added to the provided agent.


    :param str account_id: Account identifier of the GitOps repository certificate.
    :param str agent_id: Agent identifier of the GitOps repository certificate.
    :param str org_id: Organization identifier of the GitOps repository certificate.
    :param str project_id: Project identifier of the GitOps repository certificate.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getGitopsRepoCert:getGitopsRepoCert', __args__, opts=opts, typ=GetGitopsRepoCertResult).value

    return AwaitableGetGitopsRepoCertResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        agent_id=pulumi.get(__ret__, 'agent_id'),
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'))
def get_gitops_repo_cert_output(account_id: Optional[pulumi.Input[str]] = None,
                                agent_id: Optional[pulumi.Input[Optional[str]]] = None,
                                org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGitopsRepoCertResult]:
    """
    Data source for retrieving a GitOps Repository Certificate. It fetches all the certificates that are added to the provided agent.


    :param str account_id: Account identifier of the GitOps repository certificate.
    :param str agent_id: Agent identifier of the GitOps repository certificate.
    :param str org_id: Organization identifier of the GitOps repository certificate.
    :param str project_id: Project identifier of the GitOps repository certificate.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getGitopsRepoCert:getGitopsRepoCert', __args__, opts=opts, typ=GetGitopsRepoCertResult)
    return __ret__.apply(lambda __response__: GetGitopsRepoCertResult(
        account_id=pulumi.get(__response__, 'account_id'),
        agent_id=pulumi.get(__response__, 'agent_id'),
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id')))
