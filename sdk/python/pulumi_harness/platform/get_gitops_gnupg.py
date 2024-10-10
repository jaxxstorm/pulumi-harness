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
    'GetGitopsGnupgResult',
    'AwaitableGetGitopsGnupgResult',
    'get_gitops_gnupg',
    'get_gitops_gnupg_output',
]

@pulumi.output_type
class GetGitopsGnupgResult:
    """
    A collection of values returned by getGitopsGnupg.
    """
    def __init__(__self__, account_id=None, agent_id=None, id=None, identifier=None, org_id=None, project_id=None, requests=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if agent_id and not isinstance(agent_id, str):
            raise TypeError("Expected argument 'agent_id' to be a str")
        pulumi.set(__self__, "agent_id", agent_id)
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
        if requests and not isinstance(requests, list):
            raise TypeError("Expected argument 'requests' to be a list")
        pulumi.set(__self__, "requests", requests)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Account Identifier for the GnuPG Key.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="agentId")
    def agent_id(self) -> str:
        """
        Agent identifier for the GnuPG Key.
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
    @pulumi.getter
    def identifier(self) -> str:
        """
        Identifier for the GnuPG Key.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Organization Identifier for the GnuPG Key.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project Identifier for the GnuPG Key.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def requests(self) -> Sequence['outputs.GetGitopsGnupgRequestResult']:
        """
        GnuPGPublicKey is a representation of a GnuPG public key
        """
        return pulumi.get(self, "requests")


class AwaitableGetGitopsGnupgResult(GetGitopsGnupgResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGitopsGnupgResult(
            account_id=self.account_id,
            agent_id=self.agent_id,
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            project_id=self.project_id,
            requests=self.requests)


def get_gitops_gnupg(account_id: Optional[str] = None,
                     agent_id: Optional[str] = None,
                     identifier: Optional[str] = None,
                     org_id: Optional[str] = None,
                     project_id: Optional[str] = None,
                     requests: Optional[Sequence[Union['GetGitopsGnupgRequestArgs', 'GetGitopsGnupgRequestArgsDict']]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGitopsGnupgResult:
    """
    Data source for fetching a Harness GitOps GPG public key.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_gitops_gnupg(account_id="account_id",
        agent_id="agent_id",
        identifier="identifier")
    ```


    :param str account_id: Account Identifier for the GnuPG Key.
    :param str agent_id: Agent identifier for the GnuPG Key.
    :param str identifier: Identifier for the GnuPG Key.
    :param str org_id: Organization Identifier for the GnuPG Key.
    :param str project_id: Project Identifier for the GnuPG Key.
    :param Sequence[Union['GetGitopsGnupgRequestArgs', 'GetGitopsGnupgRequestArgsDict']] requests: GnuPGPublicKey is a representation of a GnuPG public key
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['requests'] = requests
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getGitopsGnupg:getGitopsGnupg', __args__, opts=opts, typ=GetGitopsGnupgResult).value

    return AwaitableGetGitopsGnupgResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        agent_id=pulumi.get(__ret__, 'agent_id'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        requests=pulumi.get(__ret__, 'requests'))
def get_gitops_gnupg_output(account_id: Optional[pulumi.Input[str]] = None,
                            agent_id: Optional[pulumi.Input[str]] = None,
                            identifier: Optional[pulumi.Input[str]] = None,
                            org_id: Optional[pulumi.Input[Optional[str]]] = None,
                            project_id: Optional[pulumi.Input[Optional[str]]] = None,
                            requests: Optional[pulumi.Input[Optional[Sequence[Union['GetGitopsGnupgRequestArgs', 'GetGitopsGnupgRequestArgsDict']]]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGitopsGnupgResult]:
    """
    Data source for fetching a Harness GitOps GPG public key.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_gitops_gnupg(account_id="account_id",
        agent_id="agent_id",
        identifier="identifier")
    ```


    :param str account_id: Account Identifier for the GnuPG Key.
    :param str agent_id: Agent identifier for the GnuPG Key.
    :param str identifier: Identifier for the GnuPG Key.
    :param str org_id: Organization Identifier for the GnuPG Key.
    :param str project_id: Project Identifier for the GnuPG Key.
    :param Sequence[Union['GetGitopsGnupgRequestArgs', 'GetGitopsGnupgRequestArgsDict']] requests: GnuPGPublicKey is a representation of a GnuPG public key
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['agentId'] = agent_id
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['requests'] = requests
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getGitopsGnupg:getGitopsGnupg', __args__, opts=opts, typ=GetGitopsGnupgResult)
    return __ret__.apply(lambda __response__: GetGitopsGnupgResult(
        account_id=pulumi.get(__response__, 'account_id'),
        agent_id=pulumi.get(__response__, 'agent_id'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        requests=pulumi.get(__response__, 'requests')))
