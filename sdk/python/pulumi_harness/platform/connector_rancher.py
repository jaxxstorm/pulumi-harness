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

__all__ = ['ConnectorRancherArgs', 'ConnectorRancher']

@pulumi.input_type
class ConnectorRancherArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 rancher_url: pulumi.Input[str],
                 bearer_token: Optional[pulumi.Input['ConnectorRancherBearerTokenArgs']] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ConnectorRancher resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] rancher_url: The URL of the Rancher cluster.
        :param pulumi.Input['ConnectorRancherBearerTokenArgs'] bearer_token: Bearer token information for the rancher cluster.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Selectors to use for the delegate.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[bool] force_delete: Enable this flag for force deletion of connector
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "rancher_url", rancher_url)
        if bearer_token is not None:
            pulumi.set(__self__, "bearer_token", bearer_token)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if force_delete is not None:
            pulumi.set(__self__, "force_delete", force_delete)
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
    @pulumi.getter(name="rancherUrl")
    def rancher_url(self) -> pulumi.Input[str]:
        """
        The URL of the Rancher cluster.
        """
        return pulumi.get(self, "rancher_url")

    @rancher_url.setter
    def rancher_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "rancher_url", value)

    @property
    @pulumi.getter(name="bearerToken")
    def bearer_token(self) -> Optional[pulumi.Input['ConnectorRancherBearerTokenArgs']]:
        """
        Bearer token information for the rancher cluster.
        """
        return pulumi.get(self, "bearer_token")

    @bearer_token.setter
    def bearer_token(self, value: Optional[pulumi.Input['ConnectorRancherBearerTokenArgs']]):
        pulumi.set(self, "bearer_token", value)

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Selectors to use for the delegate.
        """
        return pulumi.get(self, "delegate_selectors")

    @delegate_selectors.setter
    def delegate_selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "delegate_selectors", value)

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
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable this flag for force deletion of connector
        """
        return pulumi.get(self, "force_delete")

    @force_delete.setter
    def force_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_delete", value)

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
class _ConnectorRancherState:
    def __init__(__self__, *,
                 bearer_token: Optional[pulumi.Input['ConnectorRancherBearerTokenArgs']] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 rancher_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ConnectorRancher resources.
        :param pulumi.Input['ConnectorRancherBearerTokenArgs'] bearer_token: Bearer token information for the rancher cluster.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Selectors to use for the delegate.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[bool] force_delete: Enable this flag for force deletion of connector
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] rancher_url: The URL of the Rancher cluster.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        if bearer_token is not None:
            pulumi.set(__self__, "bearer_token", bearer_token)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if force_delete is not None:
            pulumi.set(__self__, "force_delete", force_delete)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if rancher_url is not None:
            pulumi.set(__self__, "rancher_url", rancher_url)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="bearerToken")
    def bearer_token(self) -> Optional[pulumi.Input['ConnectorRancherBearerTokenArgs']]:
        """
        Bearer token information for the rancher cluster.
        """
        return pulumi.get(self, "bearer_token")

    @bearer_token.setter
    def bearer_token(self, value: Optional[pulumi.Input['ConnectorRancherBearerTokenArgs']]):
        pulumi.set(self, "bearer_token", value)

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Selectors to use for the delegate.
        """
        return pulumi.get(self, "delegate_selectors")

    @delegate_selectors.setter
    def delegate_selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "delegate_selectors", value)

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
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable this flag for force deletion of connector
        """
        return pulumi.get(self, "force_delete")

    @force_delete.setter
    def force_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_delete", value)

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
    @pulumi.getter(name="rancherUrl")
    def rancher_url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the Rancher cluster.
        """
        return pulumi.get(self, "rancher_url")

    @rancher_url.setter
    def rancher_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rancher_url", value)

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


class ConnectorRancher(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bearer_token: Optional[pulumi.Input[Union['ConnectorRancherBearerTokenArgs', 'ConnectorRancherBearerTokenArgsDict']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 rancher_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for creating a Rancher connector.

        ## Import

        Import account level rancher connector

        ```sh
        $ pulumi import harness:platform/connectorRancher:ConnectorRancher example <connector_id>
        ```

        Import org level rancher connector

        ```sh
        $ pulumi import harness:platform/connectorRancher:ConnectorRancher example <ord_id>/<connector_id>
        ```

        Import project level rancher connector

        ```sh
        $ pulumi import harness:platform/connectorRancher:ConnectorRancher example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ConnectorRancherBearerTokenArgs', 'ConnectorRancherBearerTokenArgsDict']] bearer_token: Bearer token information for the rancher cluster.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Selectors to use for the delegate.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[bool] force_delete: Enable this flag for force deletion of connector
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] rancher_url: The URL of the Rancher cluster.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectorRancherArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Rancher connector.

        ## Import

        Import account level rancher connector

        ```sh
        $ pulumi import harness:platform/connectorRancher:ConnectorRancher example <connector_id>
        ```

        Import org level rancher connector

        ```sh
        $ pulumi import harness:platform/connectorRancher:ConnectorRancher example <ord_id>/<connector_id>
        ```

        Import project level rancher connector

        ```sh
        $ pulumi import harness:platform/connectorRancher:ConnectorRancher example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param ConnectorRancherArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectorRancherArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bearer_token: Optional[pulumi.Input[Union['ConnectorRancherBearerTokenArgs', 'ConnectorRancherBearerTokenArgsDict']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 rancher_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConnectorRancherArgs.__new__(ConnectorRancherArgs)

            __props__.__dict__["bearer_token"] = bearer_token
            __props__.__dict__["delegate_selectors"] = delegate_selectors
            __props__.__dict__["description"] = description
            __props__.__dict__["force_delete"] = force_delete
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            if rancher_url is None and not opts.urn:
                raise TypeError("Missing required property 'rancher_url'")
            __props__.__dict__["rancher_url"] = rancher_url
            __props__.__dict__["tags"] = tags
        super(ConnectorRancher, __self__).__init__(
            'harness:platform/connectorRancher:ConnectorRancher',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bearer_token: Optional[pulumi.Input[Union['ConnectorRancherBearerTokenArgs', 'ConnectorRancherBearerTokenArgsDict']]] = None,
            delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            force_delete: Optional[pulumi.Input[bool]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            rancher_url: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'ConnectorRancher':
        """
        Get an existing ConnectorRancher resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ConnectorRancherBearerTokenArgs', 'ConnectorRancherBearerTokenArgsDict']] bearer_token: Bearer token information for the rancher cluster.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Selectors to use for the delegate.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[bool] force_delete: Enable this flag for force deletion of connector
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] rancher_url: The URL of the Rancher cluster.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectorRancherState.__new__(_ConnectorRancherState)

        __props__.__dict__["bearer_token"] = bearer_token
        __props__.__dict__["delegate_selectors"] = delegate_selectors
        __props__.__dict__["description"] = description
        __props__.__dict__["force_delete"] = force_delete
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["rancher_url"] = rancher_url
        __props__.__dict__["tags"] = tags
        return ConnectorRancher(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bearerToken")
    def bearer_token(self) -> pulumi.Output[Optional['outputs.ConnectorRancherBearerToken']]:
        """
        Bearer token information for the rancher cluster.
        """
        return pulumi.get(self, "bearer_token")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Selectors to use for the delegate.
        """
        return pulumi.get(self, "delegate_selectors")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> pulumi.Output[bool]:
        """
        Enable this flag for force deletion of connector
        """
        return pulumi.get(self, "force_delete")

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
    @pulumi.getter(name="rancherUrl")
    def rancher_url(self) -> pulumi.Output[str]:
        """
        The URL of the Rancher cluster.
        """
        return pulumi.get(self, "rancher_url")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

