# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecretTextArgs', 'SecretText']

@pulumi.input_type
class SecretTextArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 secret_manager_identifier: pulumi.Input[str],
                 value: pulumi.Input[str],
                 value_type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SecretText resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] secret_manager_identifier: Identifier of the Secret Manager used to manage the secret.
        :param pulumi.Input[str] value: Value of the Secret
        :param pulumi.Input[str] value_type: This has details to specify if the secret value is Inline or Reference.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "secret_manager_identifier", secret_manager_identifier)
        pulumi.set(__self__, "value", value)
        pulumi.set(__self__, "value_type", value_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="secretManagerIdentifier")
    def secret_manager_identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the Secret Manager used to manage the secret.
        """
        return pulumi.get(self, "secret_manager_identifier")

    @secret_manager_identifier.setter
    def secret_manager_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret_manager_identifier", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        Value of the Secret
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter(name="valueType")
    def value_type(self) -> pulumi.Input[str]:
        """
        This has details to specify if the secret value is Inline or Reference.
        """
        return pulumi.get(self, "value_type")

    @value_type.setter
    def value_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "value_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _SecretTextState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 secret_manager_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 value_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecretText resources.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] secret_manager_identifier: Identifier of the Secret Manager used to manage the secret.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] value: Value of the Secret
        :param pulumi.Input[str] value_type: This has details to specify if the secret value is Inline or Reference.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if secret_manager_identifier is not None:
            pulumi.set(__self__, "secret_manager_identifier", secret_manager_identifier)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if value is not None:
            pulumi.set(__self__, "value", value)
        if value_type is not None:
            pulumi.set(__self__, "value_type", value_type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="secretManagerIdentifier")
    def secret_manager_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the Secret Manager used to manage the secret.
        """
        return pulumi.get(self, "secret_manager_identifier")

    @secret_manager_identifier.setter
    def secret_manager_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_manager_identifier", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        Value of the Secret
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter(name="valueType")
    def value_type(self) -> Optional[pulumi.Input[str]]:
        """
        This has details to specify if the secret value is Inline or Reference.
        """
        return pulumi.get(self, "value_type")

    @value_type.setter
    def value_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value_type", value)


class SecretText(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 secret_manager_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 value_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating secret of type secret text

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        inline = harness.platform.SecretText("inline",
            description="example",
            identifier="identifier",
            secret_manager_identifier="harnessSecretManager",
            tags=["foo:bar"],
            value="secret",
            value_type="Inline")
        reference = harness.platform.SecretText("reference",
            description="example",
            identifier="identifier",
            secret_manager_identifier="azureSecretManager",
            tags=["foo:bar"],
            value="secret",
            value_type="Reference")
        ```

        ## Import

        Import account level secret text

        ```sh
         $ pulumi import harness:platform/secretText:SecretText example <secret_text_id>
        ```

         Import org level secret text

        ```sh
         $ pulumi import harness:platform/secretText:SecretText example <ord_id>/<secret_text_id>
        ```

         Import project level secret text

        ```sh
         $ pulumi import harness:platform/secretText:SecretText example <org_id>/<project_id>/<secret_text_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] secret_manager_identifier: Identifier of the Secret Manager used to manage the secret.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] value: Value of the Secret
        :param pulumi.Input[str] value_type: This has details to specify if the secret value is Inline or Reference.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretTextArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating secret of type secret text

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        inline = harness.platform.SecretText("inline",
            description="example",
            identifier="identifier",
            secret_manager_identifier="harnessSecretManager",
            tags=["foo:bar"],
            value="secret",
            value_type="Inline")
        reference = harness.platform.SecretText("reference",
            description="example",
            identifier="identifier",
            secret_manager_identifier="azureSecretManager",
            tags=["foo:bar"],
            value="secret",
            value_type="Reference")
        ```

        ## Import

        Import account level secret text

        ```sh
         $ pulumi import harness:platform/secretText:SecretText example <secret_text_id>
        ```

         Import org level secret text

        ```sh
         $ pulumi import harness:platform/secretText:SecretText example <ord_id>/<secret_text_id>
        ```

         Import project level secret text

        ```sh
         $ pulumi import harness:platform/secretText:SecretText example <org_id>/<project_id>/<secret_text_id>
        ```

        :param str resource_name: The name of the resource.
        :param SecretTextArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretTextArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 secret_manager_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 value_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretTextArgs.__new__(SecretTextArgs)

            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            if secret_manager_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'secret_manager_identifier'")
            __props__.__dict__["secret_manager_identifier"] = secret_manager_identifier
            __props__.__dict__["tags"] = tags
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = None if value is None else pulumi.Output.secret(value)
            if value_type is None and not opts.urn:
                raise TypeError("Missing required property 'value_type'")
            __props__.__dict__["value_type"] = value_type
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["value"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SecretText, __self__).__init__(
            'harness:platform/secretText:SecretText',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            secret_manager_identifier: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            value: Optional[pulumi.Input[str]] = None,
            value_type: Optional[pulumi.Input[str]] = None) -> 'SecretText':
        """
        Get an existing SecretText resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] secret_manager_identifier: Identifier of the Secret Manager used to manage the secret.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] value: Value of the Secret
        :param pulumi.Input[str] value_type: This has details to specify if the secret value is Inline or Reference.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretTextState.__new__(_SecretTextState)

        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["secret_manager_identifier"] = secret_manager_identifier
        __props__.__dict__["tags"] = tags
        __props__.__dict__["value"] = value
        __props__.__dict__["value_type"] = value_type
        return SecretText(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="secretManagerIdentifier")
    def secret_manager_identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the Secret Manager used to manage the secret.
        """
        return pulumi.get(self, "secret_manager_identifier")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        Value of the Secret
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="valueType")
    def value_type(self) -> pulumi.Output[str]:
        """
        This has details to specify if the secret value is Inline or Reference.
        """
        return pulumi.get(self, "value_type")

