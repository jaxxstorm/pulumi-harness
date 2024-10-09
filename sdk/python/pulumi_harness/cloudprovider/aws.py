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

__all__ = ['AwsArgs', 'Aws']

@pulumi.input_type
class AwsArgs:
    def __init__(__self__, *,
                 access_key_id: Optional[pulumi.Input[str]] = None,
                 access_key_id_secret_name: Optional[pulumi.Input[str]] = None,
                 assume_cross_account_role: Optional[pulumi.Input['AwsAssumeCrossAccountRoleArgs']] = None,
                 delegate_selector: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret_access_key_secret_name: Optional[pulumi.Input[str]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input['AwsUsageScopeArgs']]]] = None,
                 use_ec2_iam_credentials: Optional[pulumi.Input[bool]] = None,
                 use_irsa: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Aws resource.
        :param pulumi.Input[str] access_key_id: The plain text AWS access key id.
        :param pulumi.Input[str] access_key_id_secret_name: The name of the Harness secret containing the AWS access key id
        :param pulumi.Input['AwsAssumeCrossAccountRoleArgs'] assume_cross_account_role: Configuration for assuming a cross account role.
        :param pulumi.Input[str] delegate_selector: Select the Delegate to use via one of its Selectors.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[str] secret_access_key_secret_name: The name of the Harness secret containing the AWS secret access key.
        :param pulumi.Input[Sequence[pulumi.Input['AwsUsageScopeArgs']]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        :param pulumi.Input[bool] use_ec2_iam_credentials: Use the EC2 Instance Profile for Service Accounts.
        :param pulumi.Input[bool] use_irsa: Use the AWS IAM Role for Service Accounts.
        """
        if access_key_id is not None:
            pulumi.set(__self__, "access_key_id", access_key_id)
        if access_key_id_secret_name is not None:
            pulumi.set(__self__, "access_key_id_secret_name", access_key_id_secret_name)
        if assume_cross_account_role is not None:
            pulumi.set(__self__, "assume_cross_account_role", assume_cross_account_role)
        if delegate_selector is not None:
            pulumi.set(__self__, "delegate_selector", delegate_selector)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret_access_key_secret_name is not None:
            pulumi.set(__self__, "secret_access_key_secret_name", secret_access_key_secret_name)
        if usage_scopes is not None:
            pulumi.set(__self__, "usage_scopes", usage_scopes)
        if use_ec2_iam_credentials is not None:
            pulumi.set(__self__, "use_ec2_iam_credentials", use_ec2_iam_credentials)
        if use_irsa is not None:
            pulumi.set(__self__, "use_irsa", use_irsa)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The plain text AWS access key id.
        """
        return pulumi.get(self, "access_key_id")

    @access_key_id.setter
    def access_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key_id", value)

    @property
    @pulumi.getter(name="accessKeyIdSecretName")
    def access_key_id_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Harness secret containing the AWS access key id
        """
        return pulumi.get(self, "access_key_id_secret_name")

    @access_key_id_secret_name.setter
    def access_key_id_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key_id_secret_name", value)

    @property
    @pulumi.getter(name="assumeCrossAccountRole")
    def assume_cross_account_role(self) -> Optional[pulumi.Input['AwsAssumeCrossAccountRoleArgs']]:
        """
        Configuration for assuming a cross account role.
        """
        return pulumi.get(self, "assume_cross_account_role")

    @assume_cross_account_role.setter
    def assume_cross_account_role(self, value: Optional[pulumi.Input['AwsAssumeCrossAccountRoleArgs']]):
        pulumi.set(self, "assume_cross_account_role", value)

    @property
    @pulumi.getter(name="delegateSelector")
    def delegate_selector(self) -> Optional[pulumi.Input[str]]:
        """
        Select the Delegate to use via one of its Selectors.
        """
        return pulumi.get(self, "delegate_selector")

    @delegate_selector.setter
    def delegate_selector(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delegate_selector", value)

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
    @pulumi.getter(name="secretAccessKeySecretName")
    def secret_access_key_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Harness secret containing the AWS secret access key.
        """
        return pulumi.get(self, "secret_access_key_secret_name")

    @secret_access_key_secret_name.setter
    def secret_access_key_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_access_key_secret_name", value)

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AwsUsageScopeArgs']]]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @usage_scopes.setter
    def usage_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AwsUsageScopeArgs']]]]):
        pulumi.set(self, "usage_scopes", value)

    @property
    @pulumi.getter(name="useEc2IamCredentials")
    def use_ec2_iam_credentials(self) -> Optional[pulumi.Input[bool]]:
        """
        Use the EC2 Instance Profile for Service Accounts.
        """
        return pulumi.get(self, "use_ec2_iam_credentials")

    @use_ec2_iam_credentials.setter
    def use_ec2_iam_credentials(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_ec2_iam_credentials", value)

    @property
    @pulumi.getter(name="useIrsa")
    def use_irsa(self) -> Optional[pulumi.Input[bool]]:
        """
        Use the AWS IAM Role for Service Accounts.
        """
        return pulumi.get(self, "use_irsa")

    @use_irsa.setter
    def use_irsa(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_irsa", value)


@pulumi.input_type
class _AwsState:
    def __init__(__self__, *,
                 access_key_id: Optional[pulumi.Input[str]] = None,
                 access_key_id_secret_name: Optional[pulumi.Input[str]] = None,
                 assume_cross_account_role: Optional[pulumi.Input['AwsAssumeCrossAccountRoleArgs']] = None,
                 delegate_selector: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret_access_key_secret_name: Optional[pulumi.Input[str]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input['AwsUsageScopeArgs']]]] = None,
                 use_ec2_iam_credentials: Optional[pulumi.Input[bool]] = None,
                 use_irsa: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Aws resources.
        :param pulumi.Input[str] access_key_id: The plain text AWS access key id.
        :param pulumi.Input[str] access_key_id_secret_name: The name of the Harness secret containing the AWS access key id
        :param pulumi.Input['AwsAssumeCrossAccountRoleArgs'] assume_cross_account_role: Configuration for assuming a cross account role.
        :param pulumi.Input[str] delegate_selector: Select the Delegate to use via one of its Selectors.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[str] secret_access_key_secret_name: The name of the Harness secret containing the AWS secret access key.
        :param pulumi.Input[Sequence[pulumi.Input['AwsUsageScopeArgs']]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        :param pulumi.Input[bool] use_ec2_iam_credentials: Use the EC2 Instance Profile for Service Accounts.
        :param pulumi.Input[bool] use_irsa: Use the AWS IAM Role for Service Accounts.
        """
        if access_key_id is not None:
            pulumi.set(__self__, "access_key_id", access_key_id)
        if access_key_id_secret_name is not None:
            pulumi.set(__self__, "access_key_id_secret_name", access_key_id_secret_name)
        if assume_cross_account_role is not None:
            pulumi.set(__self__, "assume_cross_account_role", assume_cross_account_role)
        if delegate_selector is not None:
            pulumi.set(__self__, "delegate_selector", delegate_selector)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret_access_key_secret_name is not None:
            pulumi.set(__self__, "secret_access_key_secret_name", secret_access_key_secret_name)
        if usage_scopes is not None:
            pulumi.set(__self__, "usage_scopes", usage_scopes)
        if use_ec2_iam_credentials is not None:
            pulumi.set(__self__, "use_ec2_iam_credentials", use_ec2_iam_credentials)
        if use_irsa is not None:
            pulumi.set(__self__, "use_irsa", use_irsa)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The plain text AWS access key id.
        """
        return pulumi.get(self, "access_key_id")

    @access_key_id.setter
    def access_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key_id", value)

    @property
    @pulumi.getter(name="accessKeyIdSecretName")
    def access_key_id_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Harness secret containing the AWS access key id
        """
        return pulumi.get(self, "access_key_id_secret_name")

    @access_key_id_secret_name.setter
    def access_key_id_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key_id_secret_name", value)

    @property
    @pulumi.getter(name="assumeCrossAccountRole")
    def assume_cross_account_role(self) -> Optional[pulumi.Input['AwsAssumeCrossAccountRoleArgs']]:
        """
        Configuration for assuming a cross account role.
        """
        return pulumi.get(self, "assume_cross_account_role")

    @assume_cross_account_role.setter
    def assume_cross_account_role(self, value: Optional[pulumi.Input['AwsAssumeCrossAccountRoleArgs']]):
        pulumi.set(self, "assume_cross_account_role", value)

    @property
    @pulumi.getter(name="delegateSelector")
    def delegate_selector(self) -> Optional[pulumi.Input[str]]:
        """
        Select the Delegate to use via one of its Selectors.
        """
        return pulumi.get(self, "delegate_selector")

    @delegate_selector.setter
    def delegate_selector(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delegate_selector", value)

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
    @pulumi.getter(name="secretAccessKeySecretName")
    def secret_access_key_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Harness secret containing the AWS secret access key.
        """
        return pulumi.get(self, "secret_access_key_secret_name")

    @secret_access_key_secret_name.setter
    def secret_access_key_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_access_key_secret_name", value)

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AwsUsageScopeArgs']]]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @usage_scopes.setter
    def usage_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AwsUsageScopeArgs']]]]):
        pulumi.set(self, "usage_scopes", value)

    @property
    @pulumi.getter(name="useEc2IamCredentials")
    def use_ec2_iam_credentials(self) -> Optional[pulumi.Input[bool]]:
        """
        Use the EC2 Instance Profile for Service Accounts.
        """
        return pulumi.get(self, "use_ec2_iam_credentials")

    @use_ec2_iam_credentials.setter
    def use_ec2_iam_credentials(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_ec2_iam_credentials", value)

    @property
    @pulumi.getter(name="useIrsa")
    def use_irsa(self) -> Optional[pulumi.Input[bool]]:
        """
        Use the AWS IAM Role for Service Accounts.
        """
        return pulumi.get(self, "use_irsa")

    @use_irsa.setter
    def use_irsa(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_irsa", value)


class Aws(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key_id: Optional[pulumi.Input[str]] = None,
                 access_key_id_secret_name: Optional[pulumi.Input[str]] = None,
                 assume_cross_account_role: Optional[pulumi.Input[Union['AwsAssumeCrossAccountRoleArgs', 'AwsAssumeCrossAccountRoleArgsDict']]] = None,
                 delegate_selector: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret_access_key_secret_name: Optional[pulumi.Input[str]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AwsUsageScopeArgs', 'AwsUsageScopeArgsDict']]]]] = None,
                 use_ec2_iam_credentials: Optional[pulumi.Input[bool]] = None,
                 use_irsa: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Resource for creating an AWS cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        default = harness.get_secret_manager(default=True)
        aws_access_key = harness.EncryptedText("aws_access_key",
            name="aws_access_key",
            value="<ACCESS_KEY_ID>",
            secret_manager_id=default.id)
        aws_secret_key = harness.EncryptedText("aws_secret_key",
            name="aws_secret_key",
            value="<SECRET_KEY_ID>",
            secret_manager_id=default.id)
        aws = harness.cloudprovider.Aws("aws",
            name="Example aws cloud provider",
            access_key_id_secret_name=aws_access_key.name,
            secret_access_key_secret_name=aws_secret_key.name)
        ```

        ## Import

        Import using the Harness aws cloud provider id.

        ```sh
        $ pulumi import harness:cloudprovider/aws:Aws example <provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key_id: The plain text AWS access key id.
        :param pulumi.Input[str] access_key_id_secret_name: The name of the Harness secret containing the AWS access key id
        :param pulumi.Input[Union['AwsAssumeCrossAccountRoleArgs', 'AwsAssumeCrossAccountRoleArgsDict']] assume_cross_account_role: Configuration for assuming a cross account role.
        :param pulumi.Input[str] delegate_selector: Select the Delegate to use via one of its Selectors.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[str] secret_access_key_secret_name: The name of the Harness secret containing the AWS secret access key.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AwsUsageScopeArgs', 'AwsUsageScopeArgsDict']]]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        :param pulumi.Input[bool] use_ec2_iam_credentials: Use the EC2 Instance Profile for Service Accounts.
        :param pulumi.Input[bool] use_irsa: Use the AWS IAM Role for Service Accounts.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AwsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating an AWS cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        default = harness.get_secret_manager(default=True)
        aws_access_key = harness.EncryptedText("aws_access_key",
            name="aws_access_key",
            value="<ACCESS_KEY_ID>",
            secret_manager_id=default.id)
        aws_secret_key = harness.EncryptedText("aws_secret_key",
            name="aws_secret_key",
            value="<SECRET_KEY_ID>",
            secret_manager_id=default.id)
        aws = harness.cloudprovider.Aws("aws",
            name="Example aws cloud provider",
            access_key_id_secret_name=aws_access_key.name,
            secret_access_key_secret_name=aws_secret_key.name)
        ```

        ## Import

        Import using the Harness aws cloud provider id.

        ```sh
        $ pulumi import harness:cloudprovider/aws:Aws example <provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param AwsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AwsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key_id: Optional[pulumi.Input[str]] = None,
                 access_key_id_secret_name: Optional[pulumi.Input[str]] = None,
                 assume_cross_account_role: Optional[pulumi.Input[Union['AwsAssumeCrossAccountRoleArgs', 'AwsAssumeCrossAccountRoleArgsDict']]] = None,
                 delegate_selector: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret_access_key_secret_name: Optional[pulumi.Input[str]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AwsUsageScopeArgs', 'AwsUsageScopeArgsDict']]]]] = None,
                 use_ec2_iam_credentials: Optional[pulumi.Input[bool]] = None,
                 use_irsa: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AwsArgs.__new__(AwsArgs)

            __props__.__dict__["access_key_id"] = access_key_id
            __props__.__dict__["access_key_id_secret_name"] = access_key_id_secret_name
            __props__.__dict__["assume_cross_account_role"] = assume_cross_account_role
            __props__.__dict__["delegate_selector"] = delegate_selector
            __props__.__dict__["name"] = name
            __props__.__dict__["secret_access_key_secret_name"] = secret_access_key_secret_name
            __props__.__dict__["usage_scopes"] = usage_scopes
            __props__.__dict__["use_ec2_iam_credentials"] = use_ec2_iam_credentials
            __props__.__dict__["use_irsa"] = use_irsa
        super(Aws, __self__).__init__(
            'harness:cloudprovider/aws:Aws',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_key_id: Optional[pulumi.Input[str]] = None,
            access_key_id_secret_name: Optional[pulumi.Input[str]] = None,
            assume_cross_account_role: Optional[pulumi.Input[Union['AwsAssumeCrossAccountRoleArgs', 'AwsAssumeCrossAccountRoleArgsDict']]] = None,
            delegate_selector: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            secret_access_key_secret_name: Optional[pulumi.Input[str]] = None,
            usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AwsUsageScopeArgs', 'AwsUsageScopeArgsDict']]]]] = None,
            use_ec2_iam_credentials: Optional[pulumi.Input[bool]] = None,
            use_irsa: Optional[pulumi.Input[bool]] = None) -> 'Aws':
        """
        Get an existing Aws resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key_id: The plain text AWS access key id.
        :param pulumi.Input[str] access_key_id_secret_name: The name of the Harness secret containing the AWS access key id
        :param pulumi.Input[Union['AwsAssumeCrossAccountRoleArgs', 'AwsAssumeCrossAccountRoleArgsDict']] assume_cross_account_role: Configuration for assuming a cross account role.
        :param pulumi.Input[str] delegate_selector: Select the Delegate to use via one of its Selectors.
        :param pulumi.Input[str] name: The name of the cloud provider.
        :param pulumi.Input[str] secret_access_key_secret_name: The name of the Harness secret containing the AWS secret access key.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AwsUsageScopeArgs', 'AwsUsageScopeArgsDict']]]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        :param pulumi.Input[bool] use_ec2_iam_credentials: Use the EC2 Instance Profile for Service Accounts.
        :param pulumi.Input[bool] use_irsa: Use the AWS IAM Role for Service Accounts.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AwsState.__new__(_AwsState)

        __props__.__dict__["access_key_id"] = access_key_id
        __props__.__dict__["access_key_id_secret_name"] = access_key_id_secret_name
        __props__.__dict__["assume_cross_account_role"] = assume_cross_account_role
        __props__.__dict__["delegate_selector"] = delegate_selector
        __props__.__dict__["name"] = name
        __props__.__dict__["secret_access_key_secret_name"] = secret_access_key_secret_name
        __props__.__dict__["usage_scopes"] = usage_scopes
        __props__.__dict__["use_ec2_iam_credentials"] = use_ec2_iam_credentials
        __props__.__dict__["use_irsa"] = use_irsa
        return Aws(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> pulumi.Output[Optional[str]]:
        """
        The plain text AWS access key id.
        """
        return pulumi.get(self, "access_key_id")

    @property
    @pulumi.getter(name="accessKeyIdSecretName")
    def access_key_id_secret_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Harness secret containing the AWS access key id
        """
        return pulumi.get(self, "access_key_id_secret_name")

    @property
    @pulumi.getter(name="assumeCrossAccountRole")
    def assume_cross_account_role(self) -> pulumi.Output[Optional['outputs.AwsAssumeCrossAccountRole']]:
        """
        Configuration for assuming a cross account role.
        """
        return pulumi.get(self, "assume_cross_account_role")

    @property
    @pulumi.getter(name="delegateSelector")
    def delegate_selector(self) -> pulumi.Output[Optional[str]]:
        """
        Select the Delegate to use via one of its Selectors.
        """
        return pulumi.get(self, "delegate_selector")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the cloud provider.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="secretAccessKeySecretName")
    def secret_access_key_secret_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Harness secret containing the AWS secret access key.
        """
        return pulumi.get(self, "secret_access_key_secret_name")

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> pulumi.Output[Optional[Sequence['outputs.AwsUsageScope']]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @property
    @pulumi.getter(name="useEc2IamCredentials")
    def use_ec2_iam_credentials(self) -> pulumi.Output[Optional[bool]]:
        """
        Use the EC2 Instance Profile for Service Accounts.
        """
        return pulumi.get(self, "use_ec2_iam_credentials")

    @property
    @pulumi.getter(name="useIrsa")
    def use_irsa(self) -> pulumi.Output[Optional[bool]]:
        """
        Use the AWS IAM Role for Service Accounts.
        """
        return pulumi.get(self, "use_irsa")

