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

__all__ = ['ElasticsearchConnectorArgs', 'ElasticsearchConnector']

@pulumi.input_type
class ElasticsearchConnectorArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 url: pulumi.Input[str],
                 api_token: Optional[pulumi.Input['ElasticsearchConnectorApiTokenArgs']] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 no_authentication: Optional[pulumi.Input['ElasticsearchConnectorNoAuthenticationArgs']] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username_password: Optional[pulumi.Input['ElasticsearchConnectorUsernamePasswordArgs']] = None):
        """
        The set of arguments for constructing a ElasticsearchConnector resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] url: URL of the ElasticSearch controller.
        :param pulumi.Input['ElasticsearchConnectorApiTokenArgs'] api_token: Authenticate to ElasticSearch using api token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input['ElasticsearchConnectorNoAuthenticationArgs'] no_authentication: No Authentication to ElasticSearch
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input['ElasticsearchConnectorUsernamePasswordArgs'] username_password: Authenticate to ElasticSearch using username and password.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "url", url)
        if api_token is not None:
            pulumi.set(__self__, "api_token", api_token)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if no_authentication is not None:
            pulumi.set(__self__, "no_authentication", no_authentication)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if username_password is not None:
            pulumi.set(__self__, "username_password", username_password)

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
    def url(self) -> pulumi.Input[str]:
        """
        URL of the ElasticSearch controller.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input['ElasticsearchConnectorApiTokenArgs']]:
        """
        Authenticate to ElasticSearch using api token.
        """
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input['ElasticsearchConnectorApiTokenArgs']]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to filter delegates for connection.
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
    @pulumi.getter(name="noAuthentication")
    def no_authentication(self) -> Optional[pulumi.Input['ElasticsearchConnectorNoAuthenticationArgs']]:
        """
        No Authentication to ElasticSearch
        """
        return pulumi.get(self, "no_authentication")

    @no_authentication.setter
    def no_authentication(self, value: Optional[pulumi.Input['ElasticsearchConnectorNoAuthenticationArgs']]):
        pulumi.set(self, "no_authentication", value)

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

    @property
    @pulumi.getter(name="usernamePassword")
    def username_password(self) -> Optional[pulumi.Input['ElasticsearchConnectorUsernamePasswordArgs']]:
        """
        Authenticate to ElasticSearch using username and password.
        """
        return pulumi.get(self, "username_password")

    @username_password.setter
    def username_password(self, value: Optional[pulumi.Input['ElasticsearchConnectorUsernamePasswordArgs']]):
        pulumi.set(self, "username_password", value)


@pulumi.input_type
class _ElasticsearchConnectorState:
    def __init__(__self__, *,
                 api_token: Optional[pulumi.Input['ElasticsearchConnectorApiTokenArgs']] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 no_authentication: Optional[pulumi.Input['ElasticsearchConnectorNoAuthenticationArgs']] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username_password: Optional[pulumi.Input['ElasticsearchConnectorUsernamePasswordArgs']] = None):
        """
        Input properties used for looking up and filtering ElasticsearchConnector resources.
        :param pulumi.Input['ElasticsearchConnectorApiTokenArgs'] api_token: Authenticate to ElasticSearch using api token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input['ElasticsearchConnectorNoAuthenticationArgs'] no_authentication: No Authentication to ElasticSearch
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] url: URL of the ElasticSearch controller.
        :param pulumi.Input['ElasticsearchConnectorUsernamePasswordArgs'] username_password: Authenticate to ElasticSearch using username and password.
        """
        if api_token is not None:
            pulumi.set(__self__, "api_token", api_token)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if no_authentication is not None:
            pulumi.set(__self__, "no_authentication", no_authentication)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if username_password is not None:
            pulumi.set(__self__, "username_password", username_password)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input['ElasticsearchConnectorApiTokenArgs']]:
        """
        Authenticate to ElasticSearch using api token.
        """
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input['ElasticsearchConnectorApiTokenArgs']]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to filter delegates for connection.
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
    @pulumi.getter(name="noAuthentication")
    def no_authentication(self) -> Optional[pulumi.Input['ElasticsearchConnectorNoAuthenticationArgs']]:
        """
        No Authentication to ElasticSearch
        """
        return pulumi.get(self, "no_authentication")

    @no_authentication.setter
    def no_authentication(self, value: Optional[pulumi.Input['ElasticsearchConnectorNoAuthenticationArgs']]):
        pulumi.set(self, "no_authentication", value)

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

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        URL of the ElasticSearch controller.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="usernamePassword")
    def username_password(self) -> Optional[pulumi.Input['ElasticsearchConnectorUsernamePasswordArgs']]:
        """
        Authenticate to ElasticSearch using username and password.
        """
        return pulumi.get(self, "username_password")

    @username_password.setter
    def username_password(self, value: Optional[pulumi.Input['ElasticsearchConnectorUsernamePasswordArgs']]):
        pulumi.set(self, "username_password", value)


class ElasticsearchConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token: Optional[pulumi.Input[Union['ElasticsearchConnectorApiTokenArgs', 'ElasticsearchConnectorApiTokenArgsDict']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 no_authentication: Optional[pulumi.Input[Union['ElasticsearchConnectorNoAuthenticationArgs', 'ElasticsearchConnectorNoAuthenticationArgsDict']]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username_password: Optional[pulumi.Input[Union['ElasticsearchConnectorUsernamePasswordArgs', 'ElasticsearchConnectorUsernamePasswordArgsDict']]] = None,
                 __props__=None):
        """
        Resource for creating an ElasticSearch connector.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        # Authentication mechanism as api token
        token = harness.platform.ElasticsearchConnector("token",
            identifier="identifier",
            name="name",
            description="test",
            tags=["foo:bar"],
            url="https://elasticsearch.com/",
            delegate_selectors=["harness-delegate"],
            api_token={
                "client_id": "client_id",
                "client_secret_ref": "account.secret_id",
            })
        # Authentication mechanism as username and password
        test = harness.platform.ElasticsearchConnector("test",
            identifier="identifier",
            name="name",
            description="test",
            tags=["foo:bar"],
            url="https://elasticsearch.com/",
            delegate_selectors=["harness-delegate"],
            username_password={
                "username": "username",
                "password_ref": "account.secret_id",
            })
        # Authentication mechanism as username and password
        no_authentication = harness.platform.ElasticsearchConnector("no_authentication",
            identifier="identifier",
            name="name",
            description="test",
            tags=["foo:bar"],
            url="https://elasticsearch.com/",
            delegate_selectors=["harness-delegate"])
        ```

        ## Import

        Import account level elasticsearch connector

        ```sh
        $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example <connector_id>
        ```

        Import org level elasticsearch connector

        ```sh
        $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example <ord_id>/<connector_id>
        ```

        Import project level elasticsearch connector

        ```sh
        $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ElasticsearchConnectorApiTokenArgs', 'ElasticsearchConnectorApiTokenArgsDict']] api_token: Authenticate to ElasticSearch using api token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[Union['ElasticsearchConnectorNoAuthenticationArgs', 'ElasticsearchConnectorNoAuthenticationArgsDict']] no_authentication: No Authentication to ElasticSearch
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] url: URL of the ElasticSearch controller.
        :param pulumi.Input[Union['ElasticsearchConnectorUsernamePasswordArgs', 'ElasticsearchConnectorUsernamePasswordArgsDict']] username_password: Authenticate to ElasticSearch using username and password.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ElasticsearchConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating an ElasticSearch connector.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        # Authentication mechanism as api token
        token = harness.platform.ElasticsearchConnector("token",
            identifier="identifier",
            name="name",
            description="test",
            tags=["foo:bar"],
            url="https://elasticsearch.com/",
            delegate_selectors=["harness-delegate"],
            api_token={
                "client_id": "client_id",
                "client_secret_ref": "account.secret_id",
            })
        # Authentication mechanism as username and password
        test = harness.platform.ElasticsearchConnector("test",
            identifier="identifier",
            name="name",
            description="test",
            tags=["foo:bar"],
            url="https://elasticsearch.com/",
            delegate_selectors=["harness-delegate"],
            username_password={
                "username": "username",
                "password_ref": "account.secret_id",
            })
        # Authentication mechanism as username and password
        no_authentication = harness.platform.ElasticsearchConnector("no_authentication",
            identifier="identifier",
            name="name",
            description="test",
            tags=["foo:bar"],
            url="https://elasticsearch.com/",
            delegate_selectors=["harness-delegate"])
        ```

        ## Import

        Import account level elasticsearch connector

        ```sh
        $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example <connector_id>
        ```

        Import org level elasticsearch connector

        ```sh
        $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example <ord_id>/<connector_id>
        ```

        Import project level elasticsearch connector

        ```sh
        $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param ElasticsearchConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ElasticsearchConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token: Optional[pulumi.Input[Union['ElasticsearchConnectorApiTokenArgs', 'ElasticsearchConnectorApiTokenArgsDict']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 no_authentication: Optional[pulumi.Input[Union['ElasticsearchConnectorNoAuthenticationArgs', 'ElasticsearchConnectorNoAuthenticationArgsDict']]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 username_password: Optional[pulumi.Input[Union['ElasticsearchConnectorUsernamePasswordArgs', 'ElasticsearchConnectorUsernamePasswordArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ElasticsearchConnectorArgs.__new__(ElasticsearchConnectorArgs)

            __props__.__dict__["api_token"] = api_token
            __props__.__dict__["delegate_selectors"] = delegate_selectors
            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["no_authentication"] = no_authentication
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["tags"] = tags
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
            __props__.__dict__["username_password"] = username_password
        super(ElasticsearchConnector, __self__).__init__(
            'harness:platform/elasticsearchConnector:ElasticsearchConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_token: Optional[pulumi.Input[Union['ElasticsearchConnectorApiTokenArgs', 'ElasticsearchConnectorApiTokenArgsDict']]] = None,
            delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            no_authentication: Optional[pulumi.Input[Union['ElasticsearchConnectorNoAuthenticationArgs', 'ElasticsearchConnectorNoAuthenticationArgsDict']]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            url: Optional[pulumi.Input[str]] = None,
            username_password: Optional[pulumi.Input[Union['ElasticsearchConnectorUsernamePasswordArgs', 'ElasticsearchConnectorUsernamePasswordArgsDict']]] = None) -> 'ElasticsearchConnector':
        """
        Get an existing ElasticsearchConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ElasticsearchConnectorApiTokenArgs', 'ElasticsearchConnectorApiTokenArgsDict']] api_token: Authenticate to ElasticSearch using api token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[Union['ElasticsearchConnectorNoAuthenticationArgs', 'ElasticsearchConnectorNoAuthenticationArgsDict']] no_authentication: No Authentication to ElasticSearch
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] url: URL of the ElasticSearch controller.
        :param pulumi.Input[Union['ElasticsearchConnectorUsernamePasswordArgs', 'ElasticsearchConnectorUsernamePasswordArgsDict']] username_password: Authenticate to ElasticSearch using username and password.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ElasticsearchConnectorState.__new__(_ElasticsearchConnectorState)

        __props__.__dict__["api_token"] = api_token
        __props__.__dict__["delegate_selectors"] = delegate_selectors
        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["no_authentication"] = no_authentication
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["url"] = url
        __props__.__dict__["username_password"] = username_password
        return ElasticsearchConnector(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> pulumi.Output[Optional['outputs.ElasticsearchConnectorApiToken']]:
        """
        Authenticate to ElasticSearch using api token.
        """
        return pulumi.get(self, "api_token")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to filter delegates for connection.
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
    @pulumi.getter(name="noAuthentication")
    def no_authentication(self) -> pulumi.Output[Optional['outputs.ElasticsearchConnectorNoAuthentication']]:
        """
        No Authentication to ElasticSearch
        """
        return pulumi.get(self, "no_authentication")

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

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        URL of the ElasticSearch controller.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="usernamePassword")
    def username_password(self) -> pulumi.Output[Optional['outputs.ElasticsearchConnectorUsernamePassword']]:
        """
        Authenticate to ElasticSearch using username and password.
        """
        return pulumi.get(self, "username_password")

