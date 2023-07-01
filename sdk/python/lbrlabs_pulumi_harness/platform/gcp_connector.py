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

__all__ = ['GcpConnectorArgs', 'GcpConnector']

@pulumi.input_type
class GcpConnectorArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 inherit_from_delegates: Optional[pulumi.Input[Sequence[pulumi.Input['GcpConnectorInheritFromDelegateArgs']]]] = None,
                 manual: Optional[pulumi.Input['GcpConnectorManualArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a GcpConnector resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input['GcpConnectorInheritFromDelegateArgs']]] inherit_from_delegates: Inherit configuration from delegate.
        :param pulumi.Input['GcpConnectorManualArgs'] manual: Manual credential configuration.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        pulumi.set(__self__, "identifier", identifier)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if inherit_from_delegates is not None:
            pulumi.set(__self__, "inherit_from_delegates", inherit_from_delegates)
        if manual is not None:
            pulumi.set(__self__, "manual", manual)
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
    @pulumi.getter(name="inheritFromDelegates")
    def inherit_from_delegates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GcpConnectorInheritFromDelegateArgs']]]]:
        """
        Inherit configuration from delegate.
        """
        return pulumi.get(self, "inherit_from_delegates")

    @inherit_from_delegates.setter
    def inherit_from_delegates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GcpConnectorInheritFromDelegateArgs']]]]):
        pulumi.set(self, "inherit_from_delegates", value)

    @property
    @pulumi.getter
    def manual(self) -> Optional[pulumi.Input['GcpConnectorManualArgs']]:
        """
        Manual credential configuration.
        """
        return pulumi.get(self, "manual")

    @manual.setter
    def manual(self, value: Optional[pulumi.Input['GcpConnectorManualArgs']]):
        pulumi.set(self, "manual", value)

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
class _GcpConnectorState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 inherit_from_delegates: Optional[pulumi.Input[Sequence[pulumi.Input['GcpConnectorInheritFromDelegateArgs']]]] = None,
                 manual: Optional[pulumi.Input['GcpConnectorManualArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering GcpConnector resources.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[Sequence[pulumi.Input['GcpConnectorInheritFromDelegateArgs']]] inherit_from_delegates: Inherit configuration from delegate.
        :param pulumi.Input['GcpConnectorManualArgs'] manual: Manual credential configuration.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if inherit_from_delegates is not None:
            pulumi.set(__self__, "inherit_from_delegates", inherit_from_delegates)
        if manual is not None:
            pulumi.set(__self__, "manual", manual)
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
    @pulumi.getter(name="inheritFromDelegates")
    def inherit_from_delegates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GcpConnectorInheritFromDelegateArgs']]]]:
        """
        Inherit configuration from delegate.
        """
        return pulumi.get(self, "inherit_from_delegates")

    @inherit_from_delegates.setter
    def inherit_from_delegates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GcpConnectorInheritFromDelegateArgs']]]]):
        pulumi.set(self, "inherit_from_delegates", value)

    @property
    @pulumi.getter
    def manual(self) -> Optional[pulumi.Input['GcpConnectorManualArgs']]:
        """
        Manual credential configuration.
        """
        return pulumi.get(self, "manual")

    @manual.setter
    def manual(self, value: Optional[pulumi.Input['GcpConnectorManualArgs']]):
        pulumi.set(self, "manual", value)

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


class GcpConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 inherit_from_delegates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GcpConnectorInheritFromDelegateArgs']]]]] = None,
                 manual: Optional[pulumi.Input[pulumi.InputType['GcpConnectorManualArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for creating a Gcp connector.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        # Credentials inherit_from_delegate
        test = harness.platform.GcpConnector("test",
            description="test",
            identifier="identifier",
            inherit_from_delegates=[harness.platform.GcpConnectorInheritFromDelegateArgs(
                delegate_selectors=["harness-delegate"],
            )],
            tags=["foo:bar"])
        ```

        ## Import

        Import account level gcp connector

        ```sh
         $ pulumi import harness:platform/gcpConnector:GcpConnector example <connector_id>
        ```

         Import org level gcp connector

        ```sh
         $ pulumi import harness:platform/gcpConnector:GcpConnector example <ord_id>/<connector_id>
        ```

         Import project level gcp connector

        ```sh
         $ pulumi import harness:platform/gcpConnector:GcpConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GcpConnectorInheritFromDelegateArgs']]]] inherit_from_delegates: Inherit configuration from delegate.
        :param pulumi.Input[pulumi.InputType['GcpConnectorManualArgs']] manual: Manual credential configuration.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GcpConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Gcp connector.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        # Credentials inherit_from_delegate
        test = harness.platform.GcpConnector("test",
            description="test",
            identifier="identifier",
            inherit_from_delegates=[harness.platform.GcpConnectorInheritFromDelegateArgs(
                delegate_selectors=["harness-delegate"],
            )],
            tags=["foo:bar"])
        ```

        ## Import

        Import account level gcp connector

        ```sh
         $ pulumi import harness:platform/gcpConnector:GcpConnector example <connector_id>
        ```

         Import org level gcp connector

        ```sh
         $ pulumi import harness:platform/gcpConnector:GcpConnector example <ord_id>/<connector_id>
        ```

         Import project level gcp connector

        ```sh
         $ pulumi import harness:platform/gcpConnector:GcpConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param GcpConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GcpConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 inherit_from_delegates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GcpConnectorInheritFromDelegateArgs']]]]] = None,
                 manual: Optional[pulumi.Input[pulumi.InputType['GcpConnectorManualArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GcpConnectorArgs.__new__(GcpConnectorArgs)

            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["inherit_from_delegates"] = inherit_from_delegates
            __props__.__dict__["manual"] = manual
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["tags"] = tags
        super(GcpConnector, __self__).__init__(
            'harness:platform/gcpConnector:GcpConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            inherit_from_delegates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GcpConnectorInheritFromDelegateArgs']]]]] = None,
            manual: Optional[pulumi.Input[pulumi.InputType['GcpConnectorManualArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'GcpConnector':
        """
        Get an existing GcpConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GcpConnectorInheritFromDelegateArgs']]]] inherit_from_delegates: Inherit configuration from delegate.
        :param pulumi.Input[pulumi.InputType['GcpConnectorManualArgs']] manual: Manual credential configuration.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GcpConnectorState.__new__(_GcpConnectorState)

        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["inherit_from_delegates"] = inherit_from_delegates
        __props__.__dict__["manual"] = manual
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tags"] = tags
        return GcpConnector(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter(name="inheritFromDelegates")
    def inherit_from_delegates(self) -> pulumi.Output[Optional[Sequence['outputs.GcpConnectorInheritFromDelegate']]]:
        """
        Inherit configuration from delegate.
        """
        return pulumi.get(self, "inherit_from_delegates")

    @property
    @pulumi.getter
    def manual(self) -> pulumi.Output[Optional['outputs.GcpConnectorManual']]:
        """
        Manual credential configuration.
        """
        return pulumi.get(self, "manual")

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
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

