# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TanzuArgs', 'Tanzu']

@pulumi.input_type
class TanzuArgs:
    def __init__(__self__, *,
                 endpoint: pulumi.Input[str],
                 password_secret_name: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 username_secret_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Tanzu resource.
        :param pulumi.Input[str] endpoint: The url of the Tanzu platform.
        :param pulumi.Input[str] password_secret_name: The name of the Harness secret containing the password to use to authenticate to Tanzu.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[bool] skip_validation: Skip validation of Tanzu configuration.
        :param pulumi.Input[str] username: The username to use to authenticate to Tanzu.
        :param pulumi.Input[str] username_secret_name: The name of the Harness secret containing the username to authenticate to Tanzu with.
        """
        pulumi.set(__self__, "endpoint", endpoint)
        pulumi.set(__self__, "password_secret_name", password_secret_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if skip_validation is not None:
            pulumi.set(__self__, "skip_validation", skip_validation)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if username_secret_name is not None:
            pulumi.set(__self__, "username_secret_name", username_secret_name)

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Input[str]:
        """
        The url of the Tanzu platform.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="passwordSecretName")
    def password_secret_name(self) -> pulumi.Input[str]:
        """
        The name of the Harness secret containing the password to use to authenticate to Tanzu.
        """
        return pulumi.get(self, "password_secret_name")

    @password_secret_name.setter
    def password_secret_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "password_secret_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Skip validation of Tanzu configuration.
        """
        return pulumi.get(self, "skip_validation")

    @skip_validation.setter
    def skip_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_validation", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username to use to authenticate to Tanzu.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter(name="usernameSecretName")
    def username_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Harness secret containing the username to authenticate to Tanzu with.
        """
        return pulumi.get(self, "username_secret_name")

    @username_secret_name.setter
    def username_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username_secret_name", value)


@pulumi.input_type
class _TanzuState:
    def __init__(__self__, *,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password_secret_name: Optional[pulumi.Input[str]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 username_secret_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Tanzu resources.
        :param pulumi.Input[str] endpoint: The url of the Tanzu platform.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[str] password_secret_name: The name of the Harness secret containing the password to use to authenticate to Tanzu.
        :param pulumi.Input[bool] skip_validation: Skip validation of Tanzu configuration.
        :param pulumi.Input[str] username: The username to use to authenticate to Tanzu.
        :param pulumi.Input[str] username_secret_name: The name of the Harness secret containing the username to authenticate to Tanzu with.
        """
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password_secret_name is not None:
            pulumi.set(__self__, "password_secret_name", password_secret_name)
        if skip_validation is not None:
            pulumi.set(__self__, "skip_validation", skip_validation)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if username_secret_name is not None:
            pulumi.set(__self__, "username_secret_name", username_secret_name)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The url of the Tanzu platform.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="passwordSecretName")
    def password_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Harness secret containing the password to use to authenticate to Tanzu.
        """
        return pulumi.get(self, "password_secret_name")

    @password_secret_name.setter
    def password_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password_secret_name", value)

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Skip validation of Tanzu configuration.
        """
        return pulumi.get(self, "skip_validation")

    @skip_validation.setter
    def skip_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_validation", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username to use to authenticate to Tanzu.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter(name="usernameSecretName")
    def username_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Harness secret containing the username to authenticate to Tanzu with.
        """
        return pulumi.get(self, "username_secret_name")

    @username_secret_name.setter
    def username_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username_secret_name", value)


class Tanzu(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password_secret_name: Optional[pulumi.Input[str]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 username_secret_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating a Tanzu cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        default = harness.get_secret_manager(default=True)
        tanzu_password = harness.EncryptedText("tanzu_password",
            name="tanzu_password",
            value="<PASSWORD>",
            secret_manager_id=default.id)
        example = harness.cloudprovider.Tanzu("example",
            name="example",
            endpoint="https://endpoint.com",
            skip_validation=True,
            username="<USERNAME>",
            password_secret_name=tanzu_password.name)
        ```

        ## Import

        Import using the Harness Tanzu cloud provider id.

        ```sh
        $ pulumi import harness:cloudprovider/tanzu:Tanzu example <provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint: The url of the Tanzu platform.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[str] password_secret_name: The name of the Harness secret containing the password to use to authenticate to Tanzu.
        :param pulumi.Input[bool] skip_validation: Skip validation of Tanzu configuration.
        :param pulumi.Input[str] username: The username to use to authenticate to Tanzu.
        :param pulumi.Input[str] username_secret_name: The name of the Harness secret containing the username to authenticate to Tanzu with.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TanzuArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Tanzu cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        default = harness.get_secret_manager(default=True)
        tanzu_password = harness.EncryptedText("tanzu_password",
            name="tanzu_password",
            value="<PASSWORD>",
            secret_manager_id=default.id)
        example = harness.cloudprovider.Tanzu("example",
            name="example",
            endpoint="https://endpoint.com",
            skip_validation=True,
            username="<USERNAME>",
            password_secret_name=tanzu_password.name)
        ```

        ## Import

        Import using the Harness Tanzu cloud provider id.

        ```sh
        $ pulumi import harness:cloudprovider/tanzu:Tanzu example <provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param TanzuArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TanzuArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password_secret_name: Optional[pulumi.Input[str]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 username_secret_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TanzuArgs.__new__(TanzuArgs)

            if endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint'")
            __props__.__dict__["endpoint"] = endpoint
            __props__.__dict__["name"] = name
            if password_secret_name is None and not opts.urn:
                raise TypeError("Missing required property 'password_secret_name'")
            __props__.__dict__["password_secret_name"] = password_secret_name
            __props__.__dict__["skip_validation"] = skip_validation
            __props__.__dict__["username"] = username
            __props__.__dict__["username_secret_name"] = username_secret_name
        super(Tanzu, __self__).__init__(
            'harness:cloudprovider/tanzu:Tanzu',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            endpoint: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password_secret_name: Optional[pulumi.Input[str]] = None,
            skip_validation: Optional[pulumi.Input[bool]] = None,
            username: Optional[pulumi.Input[str]] = None,
            username_secret_name: Optional[pulumi.Input[str]] = None) -> 'Tanzu':
        """
        Get an existing Tanzu resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint: The url of the Tanzu platform.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[str] password_secret_name: The name of the Harness secret containing the password to use to authenticate to Tanzu.
        :param pulumi.Input[bool] skip_validation: Skip validation of Tanzu configuration.
        :param pulumi.Input[str] username: The username to use to authenticate to Tanzu.
        :param pulumi.Input[str] username_secret_name: The name of the Harness secret containing the username to authenticate to Tanzu with.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TanzuState.__new__(_TanzuState)

        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["name"] = name
        __props__.__dict__["password_secret_name"] = password_secret_name
        __props__.__dict__["skip_validation"] = skip_validation
        __props__.__dict__["username"] = username
        __props__.__dict__["username_secret_name"] = username_secret_name
        return Tanzu(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[str]:
        """
        The url of the Tanzu platform.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="passwordSecretName")
    def password_secret_name(self) -> pulumi.Output[str]:
        """
        The name of the Harness secret containing the password to use to authenticate to Tanzu.
        """
        return pulumi.get(self, "password_secret_name")

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> pulumi.Output[Optional[bool]]:
        """
        Skip validation of Tanzu configuration.
        """
        return pulumi.get(self, "skip_validation")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[str]]:
        """
        The username to use to authenticate to Tanzu.
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter(name="usernameSecretName")
    def username_secret_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Harness secret containing the username to authenticate to Tanzu with.
        """
        return pulumi.get(self, "username_secret_name")

