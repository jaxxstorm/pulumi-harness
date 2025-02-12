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

__all__ = ['GitlabConnectorArgs', 'GitlabConnector']

@pulumi.input_type
class GitlabConnectorArgs:
    def __init__(__self__, *,
                 connection_type: pulumi.Input[str],
                 credentials: pulumi.Input['GitlabConnectorCredentialsArgs'],
                 identifier: pulumi.Input[str],
                 url: pulumi.Input[str],
                 api_authentication: Optional[pulumi.Input['GitlabConnectorApiAuthenticationArgs']] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 execute_on_delegate: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 validation_repo: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a GitlabConnector resource.
        :param pulumi.Input[str] connection_type: Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        :param pulumi.Input['GitlabConnectorCredentialsArgs'] credentials: Credentials to use for the connection.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] url: URL of the gitlab repository or account.
        :param pulumi.Input['GitlabConnectorApiAuthenticationArgs'] api_authentication: Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[bool] execute_on_delegate: Execute on delegate or not.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] validation_repo: Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        pulumi.set(__self__, "connection_type", connection_type)
        pulumi.set(__self__, "credentials", credentials)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "url", url)
        if api_authentication is not None:
            pulumi.set(__self__, "api_authentication", api_authentication)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if execute_on_delegate is not None:
            pulumi.set(__self__, "execute_on_delegate", execute_on_delegate)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if validation_repo is not None:
            pulumi.set(__self__, "validation_repo", validation_repo)

    @property
    @pulumi.getter(name="connectionType")
    def connection_type(self) -> pulumi.Input[str]:
        """
        Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        """
        return pulumi.get(self, "connection_type")

    @connection_type.setter
    def connection_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_type", value)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Input['GitlabConnectorCredentialsArgs']:
        """
        Credentials to use for the connection.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: pulumi.Input['GitlabConnectorCredentialsArgs']):
        pulumi.set(self, "credentials", value)

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
        URL of the gitlab repository or account.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="apiAuthentication")
    def api_authentication(self) -> Optional[pulumi.Input['GitlabConnectorApiAuthenticationArgs']]:
        """
        Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        """
        return pulumi.get(self, "api_authentication")

    @api_authentication.setter
    def api_authentication(self, value: Optional[pulumi.Input['GitlabConnectorApiAuthenticationArgs']]):
        pulumi.set(self, "api_authentication", value)

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
    @pulumi.getter(name="executeOnDelegate")
    def execute_on_delegate(self) -> Optional[pulumi.Input[bool]]:
        """
        Execute on delegate or not.
        """
        return pulumi.get(self, "execute_on_delegate")

    @execute_on_delegate.setter
    def execute_on_delegate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "execute_on_delegate", value)

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

    @property
    @pulumi.getter(name="validationRepo")
    def validation_repo(self) -> Optional[pulumi.Input[str]]:
        """
        Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        return pulumi.get(self, "validation_repo")

    @validation_repo.setter
    def validation_repo(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "validation_repo", value)


@pulumi.input_type
class _GitlabConnectorState:
    def __init__(__self__, *,
                 api_authentication: Optional[pulumi.Input['GitlabConnectorApiAuthenticationArgs']] = None,
                 connection_type: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input['GitlabConnectorCredentialsArgs']] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 execute_on_delegate: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 validation_repo: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GitlabConnector resources.
        :param pulumi.Input['GitlabConnectorApiAuthenticationArgs'] api_authentication: Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        :param pulumi.Input[str] connection_type: Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        :param pulumi.Input['GitlabConnectorCredentialsArgs'] credentials: Credentials to use for the connection.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[bool] execute_on_delegate: Execute on delegate or not.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] url: URL of the gitlab repository or account.
        :param pulumi.Input[str] validation_repo: Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        if api_authentication is not None:
            pulumi.set(__self__, "api_authentication", api_authentication)
        if connection_type is not None:
            pulumi.set(__self__, "connection_type", connection_type)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if execute_on_delegate is not None:
            pulumi.set(__self__, "execute_on_delegate", execute_on_delegate)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if validation_repo is not None:
            pulumi.set(__self__, "validation_repo", validation_repo)

    @property
    @pulumi.getter(name="apiAuthentication")
    def api_authentication(self) -> Optional[pulumi.Input['GitlabConnectorApiAuthenticationArgs']]:
        """
        Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        """
        return pulumi.get(self, "api_authentication")

    @api_authentication.setter
    def api_authentication(self, value: Optional[pulumi.Input['GitlabConnectorApiAuthenticationArgs']]):
        pulumi.set(self, "api_authentication", value)

    @property
    @pulumi.getter(name="connectionType")
    def connection_type(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        """
        return pulumi.get(self, "connection_type")

    @connection_type.setter
    def connection_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_type", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['GitlabConnectorCredentialsArgs']]:
        """
        Credentials to use for the connection.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['GitlabConnectorCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

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
    @pulumi.getter(name="executeOnDelegate")
    def execute_on_delegate(self) -> Optional[pulumi.Input[bool]]:
        """
        Execute on delegate or not.
        """
        return pulumi.get(self, "execute_on_delegate")

    @execute_on_delegate.setter
    def execute_on_delegate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "execute_on_delegate", value)

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
        URL of the gitlab repository or account.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="validationRepo")
    def validation_repo(self) -> Optional[pulumi.Input[str]]:
        """
        Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        return pulumi.get(self, "validation_repo")

    @validation_repo.setter
    def validation_repo(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "validation_repo", value)


class GitlabConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_authentication: Optional[pulumi.Input[Union['GitlabConnectorApiAuthenticationArgs', 'GitlabConnectorApiAuthenticationArgsDict']]] = None,
                 connection_type: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[Union['GitlabConnectorCredentialsArgs', 'GitlabConnectorCredentialsArgsDict']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 execute_on_delegate: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 validation_repo: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating a Gitlab connector.

        ## Import

        Import account level gitlab connector

        ```sh
        $ pulumi import harness:platform/gitlabConnector:GitlabConnector example <connector_id>
        ```

        Import org level gitlab connector

        ```sh
        $ pulumi import harness:platform/gitlabConnector:GitlabConnector example <ord_id>/<connector_id>
        ```

        Import project level gitlab connector

        ```sh
        $ pulumi import harness:platform/gitlabConnector:GitlabConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['GitlabConnectorApiAuthenticationArgs', 'GitlabConnectorApiAuthenticationArgsDict']] api_authentication: Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        :param pulumi.Input[str] connection_type: Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        :param pulumi.Input[Union['GitlabConnectorCredentialsArgs', 'GitlabConnectorCredentialsArgsDict']] credentials: Credentials to use for the connection.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[bool] execute_on_delegate: Execute on delegate or not.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] url: URL of the gitlab repository or account.
        :param pulumi.Input[str] validation_repo: Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GitlabConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Gitlab connector.

        ## Import

        Import account level gitlab connector

        ```sh
        $ pulumi import harness:platform/gitlabConnector:GitlabConnector example <connector_id>
        ```

        Import org level gitlab connector

        ```sh
        $ pulumi import harness:platform/gitlabConnector:GitlabConnector example <ord_id>/<connector_id>
        ```

        Import project level gitlab connector

        ```sh
        $ pulumi import harness:platform/gitlabConnector:GitlabConnector example <org_id>/<project_id>/<connector_id>
        ```

        :param str resource_name: The name of the resource.
        :param GitlabConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GitlabConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_authentication: Optional[pulumi.Input[Union['GitlabConnectorApiAuthenticationArgs', 'GitlabConnectorApiAuthenticationArgsDict']]] = None,
                 connection_type: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[Union['GitlabConnectorCredentialsArgs', 'GitlabConnectorCredentialsArgsDict']]] = None,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 execute_on_delegate: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 validation_repo: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GitlabConnectorArgs.__new__(GitlabConnectorArgs)

            __props__.__dict__["api_authentication"] = api_authentication
            if connection_type is None and not opts.urn:
                raise TypeError("Missing required property 'connection_type'")
            __props__.__dict__["connection_type"] = connection_type
            if credentials is None and not opts.urn:
                raise TypeError("Missing required property 'credentials'")
            __props__.__dict__["credentials"] = credentials
            __props__.__dict__["delegate_selectors"] = delegate_selectors
            __props__.__dict__["description"] = description
            __props__.__dict__["execute_on_delegate"] = execute_on_delegate
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["tags"] = tags
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
            __props__.__dict__["validation_repo"] = validation_repo
        super(GitlabConnector, __self__).__init__(
            'harness:platform/gitlabConnector:GitlabConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_authentication: Optional[pulumi.Input[Union['GitlabConnectorApiAuthenticationArgs', 'GitlabConnectorApiAuthenticationArgsDict']]] = None,
            connection_type: Optional[pulumi.Input[str]] = None,
            credentials: Optional[pulumi.Input[Union['GitlabConnectorCredentialsArgs', 'GitlabConnectorCredentialsArgsDict']]] = None,
            delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            execute_on_delegate: Optional[pulumi.Input[bool]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            url: Optional[pulumi.Input[str]] = None,
            validation_repo: Optional[pulumi.Input[str]] = None) -> 'GitlabConnector':
        """
        Get an existing GitlabConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['GitlabConnectorApiAuthenticationArgs', 'GitlabConnectorApiAuthenticationArgsDict']] api_authentication: Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        :param pulumi.Input[str] connection_type: Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        :param pulumi.Input[Union['GitlabConnectorCredentialsArgs', 'GitlabConnectorCredentialsArgsDict']] credentials: Credentials to use for the connection.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Tags to filter delegates for connection.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[bool] execute_on_delegate: Execute on delegate or not.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] url: URL of the gitlab repository or account.
        :param pulumi.Input[str] validation_repo: Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GitlabConnectorState.__new__(_GitlabConnectorState)

        __props__.__dict__["api_authentication"] = api_authentication
        __props__.__dict__["connection_type"] = connection_type
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["delegate_selectors"] = delegate_selectors
        __props__.__dict__["description"] = description
        __props__.__dict__["execute_on_delegate"] = execute_on_delegate
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["url"] = url
        __props__.__dict__["validation_repo"] = validation_repo
        return GitlabConnector(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiAuthentication")
    def api_authentication(self) -> pulumi.Output[Optional['outputs.GitlabConnectorApiAuthentication']]:
        """
        Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        """
        return pulumi.get(self, "api_authentication")

    @property
    @pulumi.getter(name="connectionType")
    def connection_type(self) -> pulumi.Output[str]:
        """
        Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        """
        return pulumi.get(self, "connection_type")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output['outputs.GitlabConnectorCredentials']:
        """
        Credentials to use for the connection.
        """
        return pulumi.get(self, "credentials")

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
    @pulumi.getter(name="executeOnDelegate")
    def execute_on_delegate(self) -> pulumi.Output[Optional[bool]]:
        """
        Execute on delegate or not.
        """
        return pulumi.get(self, "execute_on_delegate")

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
        URL of the gitlab repository or account.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="validationRepo")
    def validation_repo(self) -> pulumi.Output[Optional[str]]:
        """
        Repository to test the connection with. This is only used when `connection_type` is `Account`.
        """
        return pulumi.get(self, "validation_repo")

