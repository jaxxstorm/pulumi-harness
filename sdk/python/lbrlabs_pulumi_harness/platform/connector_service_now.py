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

__all__ = ['ConnectorServiceNowArgs', 'ConnectorServiceNow']

@pulumi.input_type
class ConnectorServiceNowArgs:
    def __init__(__self__, *,
                 auth: pulumi.Input['ConnectorServiceNowAuthArgs'],
                 identifier: pulumi.Input[str],
                 service_now_url: pulumi.Input[str],
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 password_ref: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 username_ref: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ConnectorServiceNow resource.
        :param pulumi.Input['ConnectorServiceNowAuthArgs'] auth: The credentials to use for the service now authentication.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] service_now_url: URL of service now.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] password_ref: Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] username: Username to use for authentication.
        :param pulumi.Input[str] username_ref: Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        pulumi.set(__self__, "auth", auth)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "service_now_url", service_now_url)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if password_ref is not None:
            pulumi.set(__self__, "password_ref", password_ref)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if username_ref is not None:
            pulumi.set(__self__, "username_ref", username_ref)

    @property
    @pulumi.getter
    def auth(self) -> pulumi.Input['ConnectorServiceNowAuthArgs']:
        """
        The credentials to use for the service now authentication.
        """
        return pulumi.get(self, "auth")

    @auth.setter
    def auth(self, value: pulumi.Input['ConnectorServiceNowAuthArgs']):
        pulumi.set(self, "auth", value)

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
    @pulumi.getter(name="serviceNowUrl")
    def service_now_url(self) -> pulumi.Input[str]:
        """
        URL of service now.
        """
        return pulumi.get(self, "service_now_url")

    @service_now_url.setter
    def service_now_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_now_url", value)

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
    @pulumi.getter(name="passwordRef")
    def password_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "password_ref")

    @password_ref.setter
    def password_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password_ref", value)

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
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        Username to use for authentication.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter(name="usernameRef")
    def username_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "username_ref")

    @username_ref.setter
    def username_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username_ref", value)


@pulumi.input_type
class _ConnectorServiceNowState:
    def __init__(__self__, *,
                 auth: Optional[pulumi.Input['ConnectorServiceNowAuthArgs']] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 password_ref: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_now_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 username_ref: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ConnectorServiceNow resources.
        :param pulumi.Input['ConnectorServiceNowAuthArgs'] auth: The credentials to use for the service now authentication.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] password_ref: Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] service_now_url: URL of service now.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] username: Username to use for authentication.
        :param pulumi.Input[str] username_ref: Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        if auth is not None:
            pulumi.set(__self__, "auth", auth)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if password_ref is not None:
            pulumi.set(__self__, "password_ref", password_ref)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if service_now_url is not None:
            pulumi.set(__self__, "service_now_url", service_now_url)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if username_ref is not None:
            pulumi.set(__self__, "username_ref", username_ref)

    @property
    @pulumi.getter
    def auth(self) -> Optional[pulumi.Input['ConnectorServiceNowAuthArgs']]:
        """
        The credentials to use for the service now authentication.
        """
        return pulumi.get(self, "auth")

    @auth.setter
    def auth(self, value: Optional[pulumi.Input['ConnectorServiceNowAuthArgs']]):
        pulumi.set(self, "auth", value)

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
    @pulumi.getter(name="passwordRef")
    def password_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "password_ref")

    @password_ref.setter
    def password_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password_ref", value)

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
    @pulumi.getter(name="serviceNowUrl")
    def service_now_url(self) -> Optional[pulumi.Input[str]]:
        """
        URL of service now.
        """
        return pulumi.get(self, "service_now_url")

    @service_now_url.setter
    def service_now_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_now_url", value)

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
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        Username to use for authentication.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter(name="usernameRef")
    def username_ref(self) -> Optional[pulumi.Input[str]]:
        """
        Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "username_ref")

    @username_ref.setter
    def username_ref(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username_ref", value)


class ConnectorServiceNow(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth: Optional[pulumi.Input[pulumi.InputType['ConnectorServiceNowAuthArgs']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 password_ref: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_now_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 username_ref: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating a Service Now connector.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        # Credential type AdfsClientCredentialsWithCertificate
        test = harness.platform.ConnectorServiceNow("test",
            auth=harness.platform.ConnectorServiceNowAuthArgs(
                adfs=harness.platform.ConnectorServiceNowAuthAdfsArgs(
                    adfs_url="https://adfs_url.com",
                    certificate_ref="account.certificate_ref",
                    client_id_ref="account.client_id_ref",
                    private_key_ref="account.private_key_ref}",
                    resource_id_ref="account.resource_id_ref",
                ),
                auth_type="AdfsClientCredentialsWithCertificate",
            ),
            delegate_selectors=["harness-delegate"],
            description="test",
            identifier="identifier",
            service_now_url="https://servicenow.com",
            tags=["foo:bar"])
        ```

        ## Import

        Import account level service now connector

        ```sh
         $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <connector_id>
        ```

         Import org level service now connector

        ```sh
         $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <ord_id>/<connector_id>
        ```

         Import project level service now connector

        ```sh
         $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ConnectorServiceNowAuthArgs']] auth: The credentials to use for the service now authentication.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] password_ref: Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] service_now_url: URL of service now.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] username: Username to use for authentication.
        :param pulumi.Input[str] username_ref: Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectorServiceNowArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Service Now connector.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        # Credential type AdfsClientCredentialsWithCertificate
        test = harness.platform.ConnectorServiceNow("test",
            auth=harness.platform.ConnectorServiceNowAuthArgs(
                adfs=harness.platform.ConnectorServiceNowAuthAdfsArgs(
                    adfs_url="https://adfs_url.com",
                    certificate_ref="account.certificate_ref",
                    client_id_ref="account.client_id_ref",
                    private_key_ref="account.private_key_ref}",
                    resource_id_ref="account.resource_id_ref",
                ),
                auth_type="AdfsClientCredentialsWithCertificate",
            ),
            delegate_selectors=["harness-delegate"],
            description="test",
            identifier="identifier",
            service_now_url="https://servicenow.com",
            tags=["foo:bar"])
        ```

        ## Import

        Import account level service now connector

        ```sh
         $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <connector_id>
        ```

         Import org level service now connector

        ```sh
         $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <ord_id>/<connector_id>
        ```

         Import project level service now connector

        ```sh
         $ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param ConnectorServiceNowArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectorServiceNowArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth: Optional[pulumi.Input[pulumi.InputType['ConnectorServiceNowAuthArgs']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 password_ref: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_now_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 username_ref: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConnectorServiceNowArgs.__new__(ConnectorServiceNowArgs)

            if auth is None and not opts.urn:
                raise TypeError("Missing required property 'auth'")
            __props__.__dict__["auth"] = auth
            __props__.__dict__["delegate_selectors"] = delegate_selectors
            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["password_ref"] = password_ref
            __props__.__dict__["project_id"] = project_id
            if service_now_url is None and not opts.urn:
                raise TypeError("Missing required property 'service_now_url'")
            __props__.__dict__["service_now_url"] = service_now_url
            __props__.__dict__["tags"] = tags
            __props__.__dict__["username"] = username
            __props__.__dict__["username_ref"] = username_ref
        super(ConnectorServiceNow, __self__).__init__(
            'harness:platform/connectorServiceNow:ConnectorServiceNow',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auth: Optional[pulumi.Input[pulumi.InputType['ConnectorServiceNowAuthArgs']]] = None,
            delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            password_ref: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            service_now_url: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            username: Optional[pulumi.Input[str]] = None,
            username_ref: Optional[pulumi.Input[str]] = None) -> 'ConnectorServiceNow':
        """
        Get an existing ConnectorServiceNow resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ConnectorServiceNowAuthArgs']] auth: The credentials to use for the service now authentication.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] password_ref: Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] service_now_url: URL of service now.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] username: Username to use for authentication.
        :param pulumi.Input[str] username_ref: Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectorServiceNowState.__new__(_ConnectorServiceNowState)

        __props__.__dict__["auth"] = auth
        __props__.__dict__["delegate_selectors"] = delegate_selectors
        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["password_ref"] = password_ref
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["service_now_url"] = service_now_url
        __props__.__dict__["tags"] = tags
        __props__.__dict__["username"] = username
        __props__.__dict__["username_ref"] = username_ref
        return ConnectorServiceNow(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def auth(self) -> pulumi.Output['outputs.ConnectorServiceNowAuth']:
        """
        The credentials to use for the service now authentication.
        """
        return pulumi.get(self, "auth")

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
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="passwordRef")
    def password_ref(self) -> pulumi.Output[str]:
        """
        Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "password_ref")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="serviceNowUrl")
    def service_now_url(self) -> pulumi.Output[str]:
        """
        URL of service now.
        """
        return pulumi.get(self, "service_now_url")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        Username to use for authentication.
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter(name="usernameRef")
    def username_ref(self) -> pulumi.Output[str]:
        """
        Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        """
        return pulumi.get(self, "username_ref")

