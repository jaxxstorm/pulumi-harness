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

__all__ = [
    'GetAwsConnectorResult',
    'AwaitableGetAwsConnectorResult',
    'get_aws_connector',
    'get_aws_connector_output',
]

@pulumi.output_type
class GetAwsConnectorResult:
    """
    A collection of values returned by getAwsConnector.
    """
    def __init__(__self__, cross_account_accesses=None, description=None, equal_jitter_backoff_strategies=None, fixed_delay_backoff_strategies=None, full_jitter_backoff_strategies=None, id=None, identifier=None, inherit_from_delegates=None, irsas=None, manuals=None, name=None, oidc_authentications=None, org_id=None, project_id=None, tags=None):
        if cross_account_accesses and not isinstance(cross_account_accesses, list):
            raise TypeError("Expected argument 'cross_account_accesses' to be a list")
        pulumi.set(__self__, "cross_account_accesses", cross_account_accesses)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if equal_jitter_backoff_strategies and not isinstance(equal_jitter_backoff_strategies, list):
            raise TypeError("Expected argument 'equal_jitter_backoff_strategies' to be a list")
        pulumi.set(__self__, "equal_jitter_backoff_strategies", equal_jitter_backoff_strategies)
        if fixed_delay_backoff_strategies and not isinstance(fixed_delay_backoff_strategies, list):
            raise TypeError("Expected argument 'fixed_delay_backoff_strategies' to be a list")
        pulumi.set(__self__, "fixed_delay_backoff_strategies", fixed_delay_backoff_strategies)
        if full_jitter_backoff_strategies and not isinstance(full_jitter_backoff_strategies, list):
            raise TypeError("Expected argument 'full_jitter_backoff_strategies' to be a list")
        pulumi.set(__self__, "full_jitter_backoff_strategies", full_jitter_backoff_strategies)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if inherit_from_delegates and not isinstance(inherit_from_delegates, list):
            raise TypeError("Expected argument 'inherit_from_delegates' to be a list")
        pulumi.set(__self__, "inherit_from_delegates", inherit_from_delegates)
        if irsas and not isinstance(irsas, list):
            raise TypeError("Expected argument 'irsas' to be a list")
        pulumi.set(__self__, "irsas", irsas)
        if manuals and not isinstance(manuals, list):
            raise TypeError("Expected argument 'manuals' to be a list")
        pulumi.set(__self__, "manuals", manuals)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if oidc_authentications and not isinstance(oidc_authentications, list):
            raise TypeError("Expected argument 'oidc_authentications' to be a list")
        pulumi.set(__self__, "oidc_authentications", oidc_authentications)
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
    @pulumi.getter(name="crossAccountAccesses")
    def cross_account_accesses(self) -> Sequence['outputs.GetAwsConnectorCrossAccountAccessResult']:
        """
        Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
        """
        return pulumi.get(self, "cross_account_accesses")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="equalJitterBackoffStrategies")
    def equal_jitter_backoff_strategies(self) -> Sequence['outputs.GetAwsConnectorEqualJitterBackoffStrategyResult']:
        """
        Equal Jitter BackOff Strategy.
        """
        return pulumi.get(self, "equal_jitter_backoff_strategies")

    @property
    @pulumi.getter(name="fixedDelayBackoffStrategies")
    def fixed_delay_backoff_strategies(self) -> Sequence['outputs.GetAwsConnectorFixedDelayBackoffStrategyResult']:
        """
        Fixed Delay BackOff Strategy.
        """
        return pulumi.get(self, "fixed_delay_backoff_strategies")

    @property
    @pulumi.getter(name="fullJitterBackoffStrategies")
    def full_jitter_backoff_strategies(self) -> Sequence['outputs.GetAwsConnectorFullJitterBackoffStrategyResult']:
        """
        Full Jitter BackOff Strategy.
        """
        return pulumi.get(self, "full_jitter_backoff_strategies")

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
    @pulumi.getter(name="inheritFromDelegates")
    def inherit_from_delegates(self) -> Sequence['outputs.GetAwsConnectorInheritFromDelegateResult']:
        """
        Inherit credentials from the delegate.
        """
        return pulumi.get(self, "inherit_from_delegates")

    @property
    @pulumi.getter
    def irsas(self) -> Sequence['outputs.GetAwsConnectorIrsaResult']:
        """
        Use IAM role for service accounts.
        """
        return pulumi.get(self, "irsas")

    @property
    @pulumi.getter
    def manuals(self) -> Sequence['outputs.GetAwsConnectorManualResult']:
        """
        Use IAM role for service accounts.
        """
        return pulumi.get(self, "manuals")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oidcAuthentications")
    def oidc_authentications(self) -> Sequence['outputs.GetAwsConnectorOidcAuthenticationResult']:
        """
        Authentication using harness oidc.
        """
        return pulumi.get(self, "oidc_authentications")

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


class AwaitableGetAwsConnectorResult(GetAwsConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAwsConnectorResult(
            cross_account_accesses=self.cross_account_accesses,
            description=self.description,
            equal_jitter_backoff_strategies=self.equal_jitter_backoff_strategies,
            fixed_delay_backoff_strategies=self.fixed_delay_backoff_strategies,
            full_jitter_backoff_strategies=self.full_jitter_backoff_strategies,
            id=self.id,
            identifier=self.identifier,
            inherit_from_delegates=self.inherit_from_delegates,
            irsas=self.irsas,
            manuals=self.manuals,
            name=self.name,
            oidc_authentications=self.oidc_authentications,
            org_id=self.org_id,
            project_id=self.project_id,
            tags=self.tags)


def get_aws_connector(identifier: Optional[str] = None,
                      name: Optional[str] = None,
                      org_id: Optional[str] = None,
                      project_id: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAwsConnectorResult:
    """
    Datasource for looking up an AWS connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_aws_connector(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke('harness:platform/getAwsConnector:getAwsConnector', __args__, opts=opts, typ=GetAwsConnectorResult).value

    return AwaitableGetAwsConnectorResult(
        cross_account_accesses=pulumi.get(__ret__, 'cross_account_accesses'),
        description=pulumi.get(__ret__, 'description'),
        equal_jitter_backoff_strategies=pulumi.get(__ret__, 'equal_jitter_backoff_strategies'),
        fixed_delay_backoff_strategies=pulumi.get(__ret__, 'fixed_delay_backoff_strategies'),
        full_jitter_backoff_strategies=pulumi.get(__ret__, 'full_jitter_backoff_strategies'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        inherit_from_delegates=pulumi.get(__ret__, 'inherit_from_delegates'),
        irsas=pulumi.get(__ret__, 'irsas'),
        manuals=pulumi.get(__ret__, 'manuals'),
        name=pulumi.get(__ret__, 'name'),
        oidc_authentications=pulumi.get(__ret__, 'oidc_authentications'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        tags=pulumi.get(__ret__, 'tags'))
def get_aws_connector_output(identifier: Optional[pulumi.Input[str]] = None,
                             name: Optional[pulumi.Input[Optional[str]]] = None,
                             org_id: Optional[pulumi.Input[Optional[str]]] = None,
                             project_id: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAwsConnectorResult]:
    """
    Datasource for looking up an AWS connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_aws_connector(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getAwsConnector:getAwsConnector', __args__, opts=opts, typ=GetAwsConnectorResult)
    return __ret__.apply(lambda __response__: GetAwsConnectorResult(
        cross_account_accesses=pulumi.get(__response__, 'cross_account_accesses'),
        description=pulumi.get(__response__, 'description'),
        equal_jitter_backoff_strategies=pulumi.get(__response__, 'equal_jitter_backoff_strategies'),
        fixed_delay_backoff_strategies=pulumi.get(__response__, 'fixed_delay_backoff_strategies'),
        full_jitter_backoff_strategies=pulumi.get(__response__, 'full_jitter_backoff_strategies'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        inherit_from_delegates=pulumi.get(__response__, 'inherit_from_delegates'),
        irsas=pulumi.get(__response__, 'irsas'),
        manuals=pulumi.get(__response__, 'manuals'),
        name=pulumi.get(__response__, 'name'),
        oidc_authentications=pulumi.get(__response__, 'oidc_authentications'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        tags=pulumi.get(__response__, 'tags')))
