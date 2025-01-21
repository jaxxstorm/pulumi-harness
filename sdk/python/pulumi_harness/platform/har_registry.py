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

__all__ = ['HarRegistryArgs', 'HarRegistry']

@pulumi.input_type
class HarRegistryArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 package_type: pulumi.Input[str],
                 allowed_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 blocked_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['HarRegistryConfigArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 parent_ref: Optional[pulumi.Input[str]] = None,
                 space_ref: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HarRegistry resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] package_type: Type of package (DOCKER, MAVEN, etc.)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_patterns: Allowed pattern for the registry
        :param pulumi.Input[Sequence[pulumi.Input[str]]] blocked_patterns: Blocked pattern for the registry
        :param pulumi.Input[Sequence[pulumi.Input['HarRegistryConfigArgs']]] configs: Type of registry.
        :param pulumi.Input[str] description: Description of the registry
        :param pulumi.Input[str] parent_ref: Parent Reference of the registry.
        :param pulumi.Input[str] space_ref: Reference of the space.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "package_type", package_type)
        if allowed_patterns is not None:
            pulumi.set(__self__, "allowed_patterns", allowed_patterns)
        if blocked_patterns is not None:
            pulumi.set(__self__, "blocked_patterns", blocked_patterns)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if parent_ref is not None:
            pulumi.set(__self__, "parent_ref", parent_ref)
        if space_ref is not None:
            pulumi.set(__self__, "space_ref", space_ref)

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
    @pulumi.getter(name="packageType")
    def package_type(self) -> pulumi.Input[str]:
        """
        Type of package (DOCKER, MAVEN, etc.)
        """
        return pulumi.get(self, "package_type")

    @package_type.setter
    def package_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "package_type", value)

    @property
    @pulumi.getter(name="allowedPatterns")
    def allowed_patterns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Allowed pattern for the registry
        """
        return pulumi.get(self, "allowed_patterns")

    @allowed_patterns.setter
    def allowed_patterns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_patterns", value)

    @property
    @pulumi.getter(name="blockedPatterns")
    def blocked_patterns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Blocked pattern for the registry
        """
        return pulumi.get(self, "blocked_patterns")

    @blocked_patterns.setter
    def blocked_patterns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "blocked_patterns", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HarRegistryConfigArgs']]]]:
        """
        Type of registry.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HarRegistryConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the registry
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="parentRef")
    def parent_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Parent Reference of the registry.
        """
        return pulumi.get(self, "parent_ref")

    @parent_ref.setter
    def parent_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_ref", value)

    @property
    @pulumi.getter(name="spaceRef")
    def space_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Reference of the space.
        """
        return pulumi.get(self, "space_ref")

    @space_ref.setter
    def space_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "space_ref", value)


@pulumi.input_type
class _HarRegistryState:
    def __init__(__self__, *,
                 allowed_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 blocked_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['HarRegistryConfigArgs']]]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 package_type: Optional[pulumi.Input[str]] = None,
                 parent_ref: Optional[pulumi.Input[str]] = None,
                 space_ref: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HarRegistry resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_patterns: Allowed pattern for the registry
        :param pulumi.Input[Sequence[pulumi.Input[str]]] blocked_patterns: Blocked pattern for the registry
        :param pulumi.Input[Sequence[pulumi.Input['HarRegistryConfigArgs']]] configs: Type of registry.
        :param pulumi.Input[str] created_at: Timestamp when the registry was created
        :param pulumi.Input[str] description: Description of the registry
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] package_type: Type of package (DOCKER, MAVEN, etc.)
        :param pulumi.Input[str] parent_ref: Parent Reference of the registry.
        :param pulumi.Input[str] space_ref: Reference of the space.
        :param pulumi.Input[str] url: URL of the registry
        """
        if allowed_patterns is not None:
            pulumi.set(__self__, "allowed_patterns", allowed_patterns)
        if blocked_patterns is not None:
            pulumi.set(__self__, "blocked_patterns", blocked_patterns)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if package_type is not None:
            pulumi.set(__self__, "package_type", package_type)
        if parent_ref is not None:
            pulumi.set(__self__, "parent_ref", parent_ref)
        if space_ref is not None:
            pulumi.set(__self__, "space_ref", space_ref)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="allowedPatterns")
    def allowed_patterns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Allowed pattern for the registry
        """
        return pulumi.get(self, "allowed_patterns")

    @allowed_patterns.setter
    def allowed_patterns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_patterns", value)

    @property
    @pulumi.getter(name="blockedPatterns")
    def blocked_patterns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Blocked pattern for the registry
        """
        return pulumi.get(self, "blocked_patterns")

    @blocked_patterns.setter
    def blocked_patterns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "blocked_patterns", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HarRegistryConfigArgs']]]]:
        """
        Type of registry.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HarRegistryConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp when the registry was created
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the registry
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
    @pulumi.getter(name="packageType")
    def package_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of package (DOCKER, MAVEN, etc.)
        """
        return pulumi.get(self, "package_type")

    @package_type.setter
    def package_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "package_type", value)

    @property
    @pulumi.getter(name="parentRef")
    def parent_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Parent Reference of the registry.
        """
        return pulumi.get(self, "parent_ref")

    @parent_ref.setter
    def parent_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_ref", value)

    @property
    @pulumi.getter(name="spaceRef")
    def space_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Reference of the space.
        """
        return pulumi.get(self, "space_ref")

    @space_ref.setter
    def space_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "space_ref", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        URL of the registry
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class HarRegistry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 blocked_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HarRegistryConfigArgs', 'HarRegistryConfigArgsDict']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 package_type: Optional[pulumi.Input[str]] = None,
                 parent_ref: Optional[pulumi.Input[str]] = None,
                 space_ref: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for create, update, list registry

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.platform.HarRegistry("test",
            identifier="test_registry",
            space_ref="accountId/orgId/projectId",
            package_type="DOCKER",
            configs=[{
                "type": "VIRTUAL",
            }],
            parent_ref="accountId/orgId/projectId")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_patterns: Allowed pattern for the registry
        :param pulumi.Input[Sequence[pulumi.Input[str]]] blocked_patterns: Blocked pattern for the registry
        :param pulumi.Input[Sequence[pulumi.Input[Union['HarRegistryConfigArgs', 'HarRegistryConfigArgsDict']]]] configs: Type of registry.
        :param pulumi.Input[str] description: Description of the registry
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] package_type: Type of package (DOCKER, MAVEN, etc.)
        :param pulumi.Input[str] parent_ref: Parent Reference of the registry.
        :param pulumi.Input[str] space_ref: Reference of the space.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HarRegistryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for create, update, list registry

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.platform.HarRegistry("test",
            identifier="test_registry",
            space_ref="accountId/orgId/projectId",
            package_type="DOCKER",
            configs=[{
                "type": "VIRTUAL",
            }],
            parent_ref="accountId/orgId/projectId")
        ```

        :param str resource_name: The name of the resource.
        :param HarRegistryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HarRegistryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 blocked_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HarRegistryConfigArgs', 'HarRegistryConfigArgsDict']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 package_type: Optional[pulumi.Input[str]] = None,
                 parent_ref: Optional[pulumi.Input[str]] = None,
                 space_ref: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HarRegistryArgs.__new__(HarRegistryArgs)

            __props__.__dict__["allowed_patterns"] = allowed_patterns
            __props__.__dict__["blocked_patterns"] = blocked_patterns
            __props__.__dict__["configs"] = configs
            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            if package_type is None and not opts.urn:
                raise TypeError("Missing required property 'package_type'")
            __props__.__dict__["package_type"] = package_type
            __props__.__dict__["parent_ref"] = parent_ref
            __props__.__dict__["space_ref"] = space_ref
            __props__.__dict__["created_at"] = None
            __props__.__dict__["url"] = None
        super(HarRegistry, __self__).__init__(
            'harness:platform/harRegistry:HarRegistry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            blocked_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['HarRegistryConfigArgs', 'HarRegistryConfigArgsDict']]]]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            package_type: Optional[pulumi.Input[str]] = None,
            parent_ref: Optional[pulumi.Input[str]] = None,
            space_ref: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'HarRegistry':
        """
        Get an existing HarRegistry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_patterns: Allowed pattern for the registry
        :param pulumi.Input[Sequence[pulumi.Input[str]]] blocked_patterns: Blocked pattern for the registry
        :param pulumi.Input[Sequence[pulumi.Input[Union['HarRegistryConfigArgs', 'HarRegistryConfigArgsDict']]]] configs: Type of registry.
        :param pulumi.Input[str] created_at: Timestamp when the registry was created
        :param pulumi.Input[str] description: Description of the registry
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] package_type: Type of package (DOCKER, MAVEN, etc.)
        :param pulumi.Input[str] parent_ref: Parent Reference of the registry.
        :param pulumi.Input[str] space_ref: Reference of the space.
        :param pulumi.Input[str] url: URL of the registry
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HarRegistryState.__new__(_HarRegistryState)

        __props__.__dict__["allowed_patterns"] = allowed_patterns
        __props__.__dict__["blocked_patterns"] = blocked_patterns
        __props__.__dict__["configs"] = configs
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["package_type"] = package_type
        __props__.__dict__["parent_ref"] = parent_ref
        __props__.__dict__["space_ref"] = space_ref
        __props__.__dict__["url"] = url
        return HarRegistry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowedPatterns")
    def allowed_patterns(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Allowed pattern for the registry
        """
        return pulumi.get(self, "allowed_patterns")

    @property
    @pulumi.getter(name="blockedPatterns")
    def blocked_patterns(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Blocked pattern for the registry
        """
        return pulumi.get(self, "blocked_patterns")

    @property
    @pulumi.getter
    def configs(self) -> pulumi.Output[Optional[Sequence['outputs.HarRegistryConfig']]]:
        """
        Type of registry.
        """
        return pulumi.get(self, "configs")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Timestamp when the registry was created
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the registry
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
    @pulumi.getter(name="packageType")
    def package_type(self) -> pulumi.Output[str]:
        """
        Type of package (DOCKER, MAVEN, etc.)
        """
        return pulumi.get(self, "package_type")

    @property
    @pulumi.getter(name="parentRef")
    def parent_ref(self) -> pulumi.Output[Optional[str]]:
        """
        Parent Reference of the registry.
        """
        return pulumi.get(self, "parent_ref")

    @property
    @pulumi.getter(name="spaceRef")
    def space_ref(self) -> pulumi.Output[Optional[str]]:
        """
        Reference of the space.
        """
        return pulumi.get(self, "space_ref")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        URL of the registry
        """
        return pulumi.get(self, "url")

