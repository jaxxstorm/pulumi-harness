# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EnvironmentGroupArgs', 'EnvironmentGroup']

@pulumi.input_type
class EnvironmentGroupArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 yaml: pulumi.Input[str],
                 color: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EnvironmentGroup resource.
        :param pulumi.Input[str] identifier: identifier of the environment group.
        :param pulumi.Input[str] yaml: Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
               org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
               For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
               connectorRef: org.connectorId.
        :param pulumi.Input[str] color: Color of the environment group.
        :param pulumi.Input[str] force_delete: Enable this flag for force deletion of environment group
        :param pulumi.Input[str] org_id: org_id of the environment group.
        :param pulumi.Input[str] project_id: project_id of the environment group.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "yaml", yaml)
        if color is not None:
            pulumi.set(__self__, "color", color)
        if force_delete is not None:
            pulumi.set(__self__, "force_delete", force_delete)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        identifier of the environment group.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def yaml(self) -> pulumi.Input[str]:
        """
        Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
        org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
        For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
        connectorRef: org.connectorId.
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: pulumi.Input[str]):
        pulumi.set(self, "yaml", value)

    @property
    @pulumi.getter
    def color(self) -> Optional[pulumi.Input[str]]:
        """
        Color of the environment group.
        """
        return pulumi.get(self, "color")

    @color.setter
    def color(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "color", value)

    @property
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> Optional[pulumi.Input[str]]:
        """
        Enable this flag for force deletion of environment group
        """
        return pulumi.get(self, "force_delete")

    @force_delete.setter
    def force_delete(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force_delete", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        org_id of the environment group.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        project_id of the environment group.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


@pulumi.input_type
class _EnvironmentGroupState:
    def __init__(__self__, *,
                 color: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EnvironmentGroup resources.
        :param pulumi.Input[str] color: Color of the environment group.
        :param pulumi.Input[str] force_delete: Enable this flag for force deletion of environment group
        :param pulumi.Input[str] identifier: identifier of the environment group.
        :param pulumi.Input[str] org_id: org_id of the environment group.
        :param pulumi.Input[str] project_id: project_id of the environment group.
        :param pulumi.Input[str] yaml: Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
               org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
               For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
               connectorRef: org.connectorId.
        """
        if color is not None:
            pulumi.set(__self__, "color", color)
        if force_delete is not None:
            pulumi.set(__self__, "force_delete", force_delete)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if yaml is not None:
            pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter
    def color(self) -> Optional[pulumi.Input[str]]:
        """
        Color of the environment group.
        """
        return pulumi.get(self, "color")

    @color.setter
    def color(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "color", value)

    @property
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> Optional[pulumi.Input[str]]:
        """
        Enable this flag for force deletion of environment group
        """
        return pulumi.get(self, "force_delete")

    @force_delete.setter
    def force_delete(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force_delete", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        identifier of the environment group.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        org_id of the environment group.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        project_id of the environment group.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def yaml(self) -> Optional[pulumi.Input[str]]:
        """
        Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
        org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
        For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
        connectorRef: org.connectorId.
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "yaml", value)


class EnvironmentGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 color: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating a Harness environment group.

        ## Example to create Environment Group at different levels (Org, Project, Account)

        ### Account Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.EnvironmentGroup("example",
            identifier="identifier",
            color="#0063F7",
            yaml=\"\"\"environmentGroup:
          name: "name"
          identifier: "identifier"
          description: "temp"
          envIdentifiers: []
        \"\"\")
        ```

        ### Org Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.EnvironmentGroup("example",
            identifier="identifier",
            org_id="orgIdentifer",
            color="#0063F7",
            yaml=\"\"\"environmentGroup:
          name: "name"
          identifier: "identifier"
          description: "temp"
          orgIdentifier: "orgIdentifer"
          envIdentifiers: []
        \"\"\")
        ```

        ### Project Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.EnvironmentGroup("example",
            identifier="identifier",
            org_id="orgIdentifer",
            project_id="projectIdentifier",
            color="#0063F7",
            yaml=\"\"\"environmentGroup:
          name: "name"
          identifier: "identifier"
          description: "temp"
          orgIdentifier: "orgIdentifer"
          projectIdentifier: "projectIdentifier"
          envIdentifiers: []
        \"\"\")
        ```

        ## Import

        Import account level environment group.

        ```sh
        $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <environment_group_id>
        ```

        Import org level environment group.

        ```sh
        $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <org_id>/<environment_group_id>
        ```

        Import project level environment group.

        ```sh
        $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <org_id>/<project_id>/<environment_group_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] color: Color of the environment group.
        :param pulumi.Input[str] force_delete: Enable this flag for force deletion of environment group
        :param pulumi.Input[str] identifier: identifier of the environment group.
        :param pulumi.Input[str] org_id: org_id of the environment group.
        :param pulumi.Input[str] project_id: project_id of the environment group.
        :param pulumi.Input[str] yaml: Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
               org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
               For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
               connectorRef: org.connectorId.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EnvironmentGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Harness environment group.

        ## Example to create Environment Group at different levels (Org, Project, Account)

        ### Account Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.EnvironmentGroup("example",
            identifier="identifier",
            color="#0063F7",
            yaml=\"\"\"environmentGroup:
          name: "name"
          identifier: "identifier"
          description: "temp"
          envIdentifiers: []
        \"\"\")
        ```

        ### Org Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.EnvironmentGroup("example",
            identifier="identifier",
            org_id="orgIdentifer",
            color="#0063F7",
            yaml=\"\"\"environmentGroup:
          name: "name"
          identifier: "identifier"
          description: "temp"
          orgIdentifier: "orgIdentifer"
          envIdentifiers: []
        \"\"\")
        ```

        ### Project Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.EnvironmentGroup("example",
            identifier="identifier",
            org_id="orgIdentifer",
            project_id="projectIdentifier",
            color="#0063F7",
            yaml=\"\"\"environmentGroup:
          name: "name"
          identifier: "identifier"
          description: "temp"
          orgIdentifier: "orgIdentifer"
          projectIdentifier: "projectIdentifier"
          envIdentifiers: []
        \"\"\")
        ```

        ## Import

        Import account level environment group.

        ```sh
        $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <environment_group_id>
        ```

        Import org level environment group.

        ```sh
        $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <org_id>/<environment_group_id>
        ```

        Import project level environment group.

        ```sh
        $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <org_id>/<project_id>/<environment_group_id>
        ```

        :param str resource_name: The name of the resource.
        :param EnvironmentGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvironmentGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 color: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvironmentGroupArgs.__new__(EnvironmentGroupArgs)

            __props__.__dict__["color"] = color
            __props__.__dict__["force_delete"] = force_delete
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            if yaml is None and not opts.urn:
                raise TypeError("Missing required property 'yaml'")
            __props__.__dict__["yaml"] = yaml
        super(EnvironmentGroup, __self__).__init__(
            'harness:platform/environmentGroup:EnvironmentGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            color: Optional[pulumi.Input[str]] = None,
            force_delete: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            yaml: Optional[pulumi.Input[str]] = None) -> 'EnvironmentGroup':
        """
        Get an existing EnvironmentGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] color: Color of the environment group.
        :param pulumi.Input[str] force_delete: Enable this flag for force deletion of environment group
        :param pulumi.Input[str] identifier: identifier of the environment group.
        :param pulumi.Input[str] org_id: org_id of the environment group.
        :param pulumi.Input[str] project_id: project_id of the environment group.
        :param pulumi.Input[str] yaml: Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
               org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
               For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
               connectorRef: org.connectorId.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvironmentGroupState.__new__(_EnvironmentGroupState)

        __props__.__dict__["color"] = color
        __props__.__dict__["force_delete"] = force_delete
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["yaml"] = yaml
        return EnvironmentGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def color(self) -> pulumi.Output[str]:
        """
        Color of the environment group.
        """
        return pulumi.get(self, "color")

    @property
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> pulumi.Output[str]:
        """
        Enable this flag for force deletion of environment group
        """
        return pulumi.get(self, "force_delete")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        identifier of the environment group.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[str]]:
        """
        org_id of the environment group.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        project_id of the environment group.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def yaml(self) -> pulumi.Output[str]:
        """
        Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
        org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
        For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
        connectorRef: org.connectorId.
        """
        return pulumi.get(self, "yaml")

