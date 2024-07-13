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
    'GetSecretTextResult',
    'AwaitableGetSecretTextResult',
    'get_secret_text',
    'get_secret_text_output',
]

@pulumi.output_type
class GetSecretTextResult:
    """
    A collection of values returned by getSecretText.
    """
    def __init__(__self__, additional_metadatas=None, description=None, id=None, identifier=None, name=None, org_id=None, project_id=None, secret_manager_identifier=None, tags=None, value=None, value_type=None):
        if additional_metadatas and not isinstance(additional_metadatas, list):
            raise TypeError("Expected argument 'additional_metadatas' to be a list")
        pulumi.set(__self__, "additional_metadatas", additional_metadatas)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if secret_manager_identifier and not isinstance(secret_manager_identifier, str):
            raise TypeError("Expected argument 'secret_manager_identifier' to be a str")
        pulumi.set(__self__, "secret_manager_identifier", secret_manager_identifier)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if value and not isinstance(value, str):
            raise TypeError("Expected argument 'value' to be a str")
        pulumi.set(__self__, "value", value)
        if value_type and not isinstance(value_type, str):
            raise TypeError("Expected argument 'value_type' to be a str")
        pulumi.set(__self__, "value_type", value_type)

    @property
    @pulumi.getter(name="additionalMetadatas")
    def additional_metadatas(self) -> Optional[Sequence['outputs.GetSecretTextAdditionalMetadataResult']]:
        """
        Additional Metadata for the Secret
        """
        return pulumi.get(self, "additional_metadatas")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
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
    def identifier(self) -> str:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

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
    @pulumi.getter(name="secretManagerIdentifier")
    def secret_manager_identifier(self) -> str:
        """
        Identifier of the Secret Manager used to manage the secret.
        """
        return pulumi.get(self, "secret_manager_identifier")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Value of the Secret
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="valueType")
    def value_type(self) -> str:
        """
        This has details to specify if the secret value is Inline or Reference.
        """
        return pulumi.get(self, "value_type")


class AwaitableGetSecretTextResult(GetSecretTextResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretTextResult(
            additional_metadatas=self.additional_metadatas,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            secret_manager_identifier=self.secret_manager_identifier,
            tags=self.tags,
            value=self.value,
            value_type=self.value_type)


def get_secret_text(additional_metadatas: Optional[Sequence[pulumi.InputType['GetSecretTextAdditionalMetadataArgs']]] = None,
                    identifier: Optional[str] = None,
                    name: Optional[str] = None,
                    org_id: Optional[str] = None,
                    project_id: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretTextResult:
    """
    DataSource for looking up secret of type secret text.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_secret_text(identifier="identifier")
    ```


    :param Sequence[pulumi.InputType['GetSecretTextAdditionalMetadataArgs']] additional_metadatas: Additional Metadata for the Secret
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['additionalMetadatas'] = additional_metadatas
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getSecretText:getSecretText', __args__, opts=opts, typ=GetSecretTextResult).value

    return AwaitableGetSecretTextResult(
        additional_metadatas=pulumi.get(__ret__, 'additional_metadatas'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        secret_manager_identifier=pulumi.get(__ret__, 'secret_manager_identifier'),
        tags=pulumi.get(__ret__, 'tags'),
        value=pulumi.get(__ret__, 'value'),
        value_type=pulumi.get(__ret__, 'value_type'))


@_utilities.lift_output_func(get_secret_text)
def get_secret_text_output(additional_metadatas: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetSecretTextAdditionalMetadataArgs']]]]] = None,
                           identifier: Optional[pulumi.Input[str]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           org_id: Optional[pulumi.Input[Optional[str]]] = None,
                           project_id: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSecretTextResult]:
    """
    DataSource for looking up secret of type secret text.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_secret_text(identifier="identifier")
    ```


    :param Sequence[pulumi.InputType['GetSecretTextAdditionalMetadataArgs']] additional_metadatas: Additional Metadata for the Secret
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...