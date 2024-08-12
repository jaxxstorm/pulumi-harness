# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetEncryptedTextResult',
    'AwaitableGetEncryptedTextResult',
    'get_encrypted_text',
    'get_encrypted_text_output',
]

@pulumi.output_type
class GetEncryptedTextResult:
    """
    A collection of values returned by getEncryptedText.
    """
    def __init__(__self__, id=None, name=None, secret_manager_id=None, usage_scopes=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if secret_manager_id and not isinstance(secret_manager_id, str):
            raise TypeError("Expected argument 'secret_manager_id' to be a str")
        pulumi.set(__self__, "secret_manager_id", secret_manager_id)
        if usage_scopes and not isinstance(usage_scopes, list):
            raise TypeError("Expected argument 'usage_scopes' to be a list")
        pulumi.set(__self__, "usage_scopes", usage_scopes)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        """
        Unique identifier of the encrypted secret
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the encrypted secret
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="secretManagerId")
    def secret_manager_id(self) -> str:
        """
        The id of the associated secret manager
        """
        return pulumi.get(self, "secret_manager_id")

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[Sequence['outputs.GetEncryptedTextUsageScopeResult']]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")


class AwaitableGetEncryptedTextResult(GetEncryptedTextResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEncryptedTextResult(
            id=self.id,
            name=self.name,
            secret_manager_id=self.secret_manager_id,
            usage_scopes=self.usage_scopes)


def get_encrypted_text(id: Optional[str] = None,
                       name: Optional[str] = None,
                       usage_scopes: Optional[Sequence[Union['GetEncryptedTextUsageScopeArgs', 'GetEncryptedTextUsageScopeArgsDict']]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEncryptedTextResult:
    """
    Data source for retrieving a Harness application


    :param str id: Unique identifier of the encrypted secret
    :param str name: The name of the encrypted secret
    :param Sequence[Union['GetEncryptedTextUsageScopeArgs', 'GetEncryptedTextUsageScopeArgsDict']] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    __args__['usageScopes'] = usage_scopes
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:index/getEncryptedText:getEncryptedText', __args__, opts=opts, typ=GetEncryptedTextResult).value

    return AwaitableGetEncryptedTextResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        secret_manager_id=pulumi.get(__ret__, 'secret_manager_id'),
        usage_scopes=pulumi.get(__ret__, 'usage_scopes'))


@_utilities.lift_output_func(get_encrypted_text)
def get_encrypted_text_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                              name: Optional[pulumi.Input[Optional[str]]] = None,
                              usage_scopes: Optional[pulumi.Input[Optional[Sequence[Union['GetEncryptedTextUsageScopeArgs', 'GetEncryptedTextUsageScopeArgsDict']]]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEncryptedTextResult]:
    """
    Data source for retrieving a Harness application


    :param str id: Unique identifier of the encrypted secret
    :param str name: The name of the encrypted secret
    :param Sequence[Union['GetEncryptedTextUsageScopeArgs', 'GetEncryptedTextUsageScopeArgsDict']] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
    """
    ...
