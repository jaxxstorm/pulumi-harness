# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FeatureFlagTargetArgs', 'FeatureFlagTarget']

@pulumi.input_type
class FeatureFlagTargetArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 environment: pulumi.Input[str],
                 identifier: pulumi.Input[str],
                 org_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FeatureFlagTarget resource.
        :param pulumi.Input[str] account_id: Account Identifier
        :param pulumi.Input[str] environment: Environment Identifier
        :param pulumi.Input[str] identifier: Identifier of the Feature Flag Target
        :param pulumi.Input[str] org_id: Organization Identifier
        :param pulumi.Input[str] project_id: Project Identifier
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Attributes
        :param pulumi.Input[str] name: Target Name
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "project_id", project_id)
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        Account Identifier
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input[str]:
        """
        Environment Identifier
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the Feature Flag Target
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        Organization Identifier
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Attributes
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Target Name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FeatureFlagTargetState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FeatureFlagTarget resources.
        :param pulumi.Input[str] account_id: Account Identifier
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Attributes
        :param pulumi.Input[str] environment: Environment Identifier
        :param pulumi.Input[str] identifier: Identifier of the Feature Flag Target
        :param pulumi.Input[str] name: Target Name
        :param pulumi.Input[str] org_id: Organization Identifier
        :param pulumi.Input[str] project_id: Project Identifier
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Account Identifier
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Attributes
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        Environment Identifier
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the Feature Flag Target
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Target Name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Organization Identifier
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


class FeatureFlagTarget(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing Feature Flag Targets.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        target = harness.platform.FeatureFlagTarget("target",
            org_id="test",
            project_id="test",
            identifier="MY_FEATURE",
            environment="MY_ENVIRONMENT",
            name="MY_FEATURE",
            account_id="MY_ACCOUNT_ID",
            attributes={
                "foo": "bar",
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account Identifier
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Attributes
        :param pulumi.Input[str] environment: Environment Identifier
        :param pulumi.Input[str] identifier: Identifier of the Feature Flag Target
        :param pulumi.Input[str] name: Target Name
        :param pulumi.Input[str] org_id: Organization Identifier
        :param pulumi.Input[str] project_id: Project Identifier
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FeatureFlagTargetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing Feature Flag Targets.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        target = harness.platform.FeatureFlagTarget("target",
            org_id="test",
            project_id="test",
            identifier="MY_FEATURE",
            environment="MY_ENVIRONMENT",
            name="MY_FEATURE",
            account_id="MY_ACCOUNT_ID",
            attributes={
                "foo": "bar",
            })
        ```

        :param str resource_name: The name of the resource.
        :param FeatureFlagTargetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FeatureFlagTargetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FeatureFlagTargetArgs.__new__(FeatureFlagTargetArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["attributes"] = attributes
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
        super(FeatureFlagTarget, __self__).__init__(
            'harness:platform/featureFlagTarget:FeatureFlagTarget',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            environment: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None) -> 'FeatureFlagTarget':
        """
        Get an existing FeatureFlagTarget resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Account Identifier
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Attributes
        :param pulumi.Input[str] environment: Environment Identifier
        :param pulumi.Input[str] identifier: Identifier of the Feature Flag Target
        :param pulumi.Input[str] name: Target Name
        :param pulumi.Input[str] org_id: Organization Identifier
        :param pulumi.Input[str] project_id: Project Identifier
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FeatureFlagTargetState.__new__(_FeatureFlagTargetState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["attributes"] = attributes
        __props__.__dict__["environment"] = environment
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        return FeatureFlagTarget(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        Account Identifier
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Attributes
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[str]:
        """
        Environment Identifier
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the Feature Flag Target
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Target Name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        Organization Identifier
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")
