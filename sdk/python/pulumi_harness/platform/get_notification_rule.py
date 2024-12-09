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
    'GetNotificationRuleResult',
    'AwaitableGetNotificationRuleResult',
    'get_notification_rule',
    'get_notification_rule_output',
]

@pulumi.output_type
class GetNotificationRuleResult:
    """
    A collection of values returned by getNotificationRule.
    """
    def __init__(__self__, id=None, identifier=None, org_id=None, project_id=None):
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
        Identifier of the Notification Rule.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        """
        Identifier of the organization in which the Notification Rule is configured.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Identifier of the project in which the Notification Rule is configured.
        """
        return pulumi.get(self, "project_id")


class AwaitableGetNotificationRuleResult(GetNotificationRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNotificationRuleResult(
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            project_id=self.project_id)


def get_notification_rule(identifier: Optional[str] = None,
                          org_id: Optional[str] = None,
                          project_id: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNotificationRuleResult:
    """
    Data source for retrieving a Notification Rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_notification_rule(identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str identifier: Identifier of the Notification Rule.
    :param str org_id: Identifier of the organization in which the Notification Rule is configured.
    :param str project_id: Identifier of the project in which the Notification Rule is configured.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getNotificationRule:getNotificationRule', __args__, opts=opts, typ=GetNotificationRuleResult).value

    return AwaitableGetNotificationRuleResult(
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'))
def get_notification_rule_output(identifier: Optional[pulumi.Input[str]] = None,
                                 org_id: Optional[pulumi.Input[str]] = None,
                                 project_id: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNotificationRuleResult]:
    """
    Data source for retrieving a Notification Rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_notification_rule(identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str identifier: Identifier of the Notification Rule.
    :param str org_id: Identifier of the organization in which the Notification Rule is configured.
    :param str project_id: Identifier of the project in which the Notification Rule is configured.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getNotificationRule:getNotificationRule', __args__, opts=opts, typ=GetNotificationRuleResult)
    return __ret__.apply(lambda __response__: GetNotificationRuleResult(
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id')))
