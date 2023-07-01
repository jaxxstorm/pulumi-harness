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
from ._inputs import *

__all__ = [
    'GetGitopsRepoCredResult',
    'AwaitableGetGitopsRepoCredResult',
    'get_gitops_repo_cred',
    'get_gitops_repo_cred_output',
]

@pulumi.output_type
class GetGitopsRepoCredResult:
    """
    A collection of values returned by getGitopsRepoCred.
    """
    def __init__(__self__, account_id=None, agent_id=None, creds=None, id=None, identifier=None, org_id=None, project_id=None, upsert=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if agent_id and not isinstance(agent_id, str):
            raise TypeError("Expected argument 'agent_id' to be a str")
        pulumi.set(__self__, "agent_id", agent_id)
        if creds and not isinstance(creds, list):
            raise TypeError("Expected argument 'creds' to be a list")
        pulumi.set(__self__, "creds", creds)
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
        if upsert and not isinstance(upsert, bool):
            raise TypeError("Expected argument 'upsert' to be a bool")
        pulumi.set(__self__, "upsert", upsert)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        account identifier of the Repository Credentials.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="agentId")
    def agent_id(self) -> str:
        """
        agent identifier of the Repository Credentials.
        """
        return pulumi.get(self, "agent_id")

    @property
    @pulumi.getter
    def creds(self) -> Sequence['outputs.GetGitopsRepoCredCredResult']:
        """
        credential details.
        """
        return pulumi.get(self, "creds")

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
        Identifier of the Repository Credentials.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Organization identifier of the Repository Credential.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project identifier of the Repository Credential.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def upsert(self) -> Optional[bool]:
        """
        if the Repository credential should be upserted.
        """
        return pulumi.get(self, "upsert")


class AwaitableGetGitopsRepoCredResult(GetGitopsRepoCredResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGitopsRepoCredResult(
            account_id=self.account_id,
            agent_id=self.agent_id,
            creds=self.creds,
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            project_id=self.project_id,
            upsert=self.upsert)


def get_gitops_repo_cred(account_id: Optional[str] = None,
                         agent_id: Optional[str] = None,
                         creds: Optional[Sequence[pulumi.InputType['GetGitopsRepoCredCredArgs']]] = None,
                         identifier: Optional[str] = None,
                         org_id: Optional[str] = None,
                         project_id: Optional[str] = None,
                         upsert: Optional[bool] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitopsRepoCredResult:
    """
    Data source for retrieving a GitOps RepoCred.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_gitops_repo_cred(account_id="account_id",
        agent_id="agent_id",
        identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str account_id: account identifier of the Repository Credentials.
    :param str agent_id: agent identifier of the Repository Credentials.
    :param Sequence[pulumi.InputType['GetGitopsRepoCredCredArgs']] creds: credential details.
    :param str identifier: Identifier of the Repository Credentials.
    :param str org_id: Organization identifier of the Repository Credential.
    :param str project_id: Project identifier of the Repository Credential.
    :param bool upsert: if the Repository credential should be upserted.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['creds'] = creds
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['upsert'] = upsert
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getGitopsRepoCred:getGitopsRepoCred', __args__, opts=opts, typ=GetGitopsRepoCredResult).value

    return AwaitableGetGitopsRepoCredResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        agent_id=pulumi.get(__ret__, 'agent_id'),
        creds=pulumi.get(__ret__, 'creds'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        upsert=pulumi.get(__ret__, 'upsert'))


@_utilities.lift_output_func(get_gitops_repo_cred)
def get_gitops_repo_cred_output(account_id: Optional[pulumi.Input[str]] = None,
                                agent_id: Optional[pulumi.Input[str]] = None,
                                creds: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetGitopsRepoCredCredArgs']]]]] = None,
                                identifier: Optional[pulumi.Input[str]] = None,
                                org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                upsert: Optional[pulumi.Input[Optional[bool]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGitopsRepoCredResult]:
    """
    Data source for retrieving a GitOps RepoCred.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_gitops_repo_cred(account_id="account_id",
        agent_id="agent_id",
        identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str account_id: account identifier of the Repository Credentials.
    :param str agent_id: agent identifier of the Repository Credentials.
    :param Sequence[pulumi.InputType['GetGitopsRepoCredCredArgs']] creds: credential details.
    :param str identifier: Identifier of the Repository Credentials.
    :param str org_id: Organization identifier of the Repository Credential.
    :param str project_id: Project identifier of the Repository Credential.
    :param bool upsert: if the Repository credential should be upserted.
    """
    ...
