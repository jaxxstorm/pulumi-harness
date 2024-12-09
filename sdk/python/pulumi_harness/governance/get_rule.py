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
    'GetRuleResult',
    'AwaitableGetRuleResult',
    'get_rule',
    'get_rule_output',
]

@pulumi.output_type
class GetRuleResult:
    """
    A collection of values returned by getRule.
    """
    def __init__(__self__, cloud_provider=None, description=None, id=None, name=None, rule_id=None, rules_yaml=None):
        if cloud_provider and not isinstance(cloud_provider, str):
            raise TypeError("Expected argument 'cloud_provider' to be a str")
        pulumi.set(__self__, "cloud_provider", cloud_provider)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if rule_id and not isinstance(rule_id, str):
            raise TypeError("Expected argument 'rule_id' to be a str")
        pulumi.set(__self__, "rule_id", rule_id)
        if rules_yaml and not isinstance(rules_yaml, str):
            raise TypeError("Expected argument 'rules_yaml' to be a str")
        pulumi.set(__self__, "rules_yaml", rules_yaml)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> str:
        """
        The cloud provider for the rule.
        """
        return pulumi.get(self, "cloud_provider")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description for rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the rule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> str:
        """
        Id of rule.
        """
        return pulumi.get(self, "rule_id")

    @property
    @pulumi.getter(name="rulesYaml")
    def rules_yaml(self) -> str:
        """
        Policy YAML of the rule.
        """
        return pulumi.get(self, "rules_yaml")


class AwaitableGetRuleResult(GetRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRuleResult(
            cloud_provider=self.cloud_provider,
            description=self.description,
            id=self.id,
            name=self.name,
            rule_id=self.rule_id,
            rules_yaml=self.rules_yaml)


def get_rule(rule_id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRuleResult:
    """
    Datasource for looking up a rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.governance.get_rule(rule_id="rule_id")
    ```


    :param str rule_id: Id of rule.
    """
    __args__ = dict()
    __args__['ruleId'] = rule_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:governance/getRule:getRule', __args__, opts=opts, typ=GetRuleResult).value

    return AwaitableGetRuleResult(
        cloud_provider=pulumi.get(__ret__, 'cloud_provider'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        rule_id=pulumi.get(__ret__, 'rule_id'),
        rules_yaml=pulumi.get(__ret__, 'rules_yaml'))
def get_rule_output(rule_id: Optional[pulumi.Input[str]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRuleResult]:
    """
    Datasource for looking up a rule.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.governance.get_rule(rule_id="rule_id")
    ```


    :param str rule_id: Id of rule.
    """
    __args__ = dict()
    __args__['ruleId'] = rule_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:governance/getRule:getRule', __args__, opts=opts, typ=GetRuleResult)
    return __ret__.apply(lambda __response__: GetRuleResult(
        cloud_provider=pulumi.get(__response__, 'cloud_provider'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        rule_id=pulumi.get(__response__, 'rule_id'),
        rules_yaml=pulumi.get(__response__, 'rules_yaml')))
