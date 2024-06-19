# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'AwsAssumeCrossAccountRoleArgs',
    'AwsUsageScopeArgs',
    'DatacenterUsageScopeArgs',
    'GcpUsageScopeArgs',
    'KubernetesAuthenticationArgs',
    'KubernetesAuthenticationOidcArgs',
    'KubernetesAuthenticationServiceAccountArgs',
    'KubernetesAuthenticationUsernamePasswordArgs',
    'KubernetesUsageScopeArgs',
]

@pulumi.input_type
class AwsAssumeCrossAccountRoleArgs:
    def __init__(__self__, *,
                 role_arn: pulumi.Input[str],
                 external_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] role_arn: This is an IAM role in the target deployment AWS account.
        :param pulumi.Input[str] external_id: If the administrator of the account to which the role belongs provided you with an external ID, then enter that value.
        """
        pulumi.set(__self__, "role_arn", role_arn)
        if external_id is not None:
            pulumi.set(__self__, "external_id", external_id)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Input[str]:
        """
        This is an IAM role in the target deployment AWS account.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter(name="externalId")
    def external_id(self) -> Optional[pulumi.Input[str]]:
        """
        If the administrator of the account to which the role belongs provided you with an external ID, then enter that value.
        """
        return pulumi.get(self, "external_id")

    @external_id.setter
    def external_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "external_id", value)


@pulumi.input_type
class AwsUsageScopeArgs:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 environment_filter_type: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] application_id: Id of the application to scope to. If empty then this scope applies to all applications.
        :param pulumi.Input[str] environment_filter_type: Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        :param pulumi.Input[str] environment_id: Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if environment_filter_type is not None:
            pulumi.set(__self__, "environment_filter_type", environment_filter_type)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the application to scope to. If empty then this scope applies to all applications.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="environmentFilterType")
    def environment_filter_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        """
        return pulumi.get(self, "environment_filter_type")

    @environment_filter_type.setter
    def environment_filter_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_filter_type", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)


@pulumi.input_type
class DatacenterUsageScopeArgs:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 environment_filter_type: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] application_id: Id of the application to scope to. If empty then this scope applies to all applications.
        :param pulumi.Input[str] environment_filter_type: Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        :param pulumi.Input[str] environment_id: Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if environment_filter_type is not None:
            pulumi.set(__self__, "environment_filter_type", environment_filter_type)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the application to scope to. If empty then this scope applies to all applications.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="environmentFilterType")
    def environment_filter_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        """
        return pulumi.get(self, "environment_filter_type")

    @environment_filter_type.setter
    def environment_filter_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_filter_type", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)


@pulumi.input_type
class GcpUsageScopeArgs:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 environment_filter_type: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] application_id: Id of the application to scope to. If empty then this scope applies to all applications.
        :param pulumi.Input[str] environment_filter_type: Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        :param pulumi.Input[str] environment_id: Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if environment_filter_type is not None:
            pulumi.set(__self__, "environment_filter_type", environment_filter_type)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the application to scope to. If empty then this scope applies to all applications.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="environmentFilterType")
    def environment_filter_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        """
        return pulumi.get(self, "environment_filter_type")

    @environment_filter_type.setter
    def environment_filter_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_filter_type", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)


@pulumi.input_type
class KubernetesAuthenticationArgs:
    def __init__(__self__, *,
                 delegate_selectors: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oidc: Optional[pulumi.Input['KubernetesAuthenticationOidcArgs']] = None,
                 service_account: Optional[pulumi.Input['KubernetesAuthenticationServiceAccountArgs']] = None,
                 username_password: Optional[pulumi.Input['KubernetesAuthenticationUsernamePasswordArgs']] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] delegate_selectors: Delegate selectors to inherit the GCP credentials from.
        :param pulumi.Input['KubernetesAuthenticationOidcArgs'] oidc: Service account configuration for connecting to the Kubernetes cluster
        :param pulumi.Input['KubernetesAuthenticationServiceAccountArgs'] service_account: Username and password for authentication to the cluster
        :param pulumi.Input['KubernetesAuthenticationUsernamePasswordArgs'] username_password: Username and password for authentication to the cluster
        """
        if delegate_selectors is not None:
            pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if oidc is not None:
            pulumi.set(__self__, "oidc", oidc)
        if service_account is not None:
            pulumi.set(__self__, "service_account", service_account)
        if username_password is not None:
            pulumi.set(__self__, "username_password", username_password)

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Delegate selectors to inherit the GCP credentials from.
        """
        return pulumi.get(self, "delegate_selectors")

    @delegate_selectors.setter
    def delegate_selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "delegate_selectors", value)

    @property
    @pulumi.getter
    def oidc(self) -> Optional[pulumi.Input['KubernetesAuthenticationOidcArgs']]:
        """
        Service account configuration for connecting to the Kubernetes cluster
        """
        return pulumi.get(self, "oidc")

    @oidc.setter
    def oidc(self, value: Optional[pulumi.Input['KubernetesAuthenticationOidcArgs']]):
        pulumi.set(self, "oidc", value)

    @property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> Optional[pulumi.Input['KubernetesAuthenticationServiceAccountArgs']]:
        """
        Username and password for authentication to the cluster
        """
        return pulumi.get(self, "service_account")

    @service_account.setter
    def service_account(self, value: Optional[pulumi.Input['KubernetesAuthenticationServiceAccountArgs']]):
        pulumi.set(self, "service_account", value)

    @property
    @pulumi.getter(name="usernamePassword")
    def username_password(self) -> Optional[pulumi.Input['KubernetesAuthenticationUsernamePasswordArgs']]:
        """
        Username and password for authentication to the cluster
        """
        return pulumi.get(self, "username_password")

    @username_password.setter
    def username_password(self, value: Optional[pulumi.Input['KubernetesAuthenticationUsernamePasswordArgs']]):
        pulumi.set(self, "username_password", value)


@pulumi.input_type
class KubernetesAuthenticationOidcArgs:
    def __init__(__self__, *,
                 client_id_secret_name: pulumi.Input[str],
                 identity_provider_url: pulumi.Input[str],
                 master_url: pulumi.Input[str],
                 password_secret_name: pulumi.Input[str],
                 username: pulumi.Input[str],
                 client_secret_secret_name: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[str] client_id_secret_name: Name of the Harness secret containing the client ID for the cluster.
        :param pulumi.Input[str] identity_provider_url: URL of the identity provider to use.
        :param pulumi.Input[str] master_url: URL of the Kubernetes master to connect to.
        :param pulumi.Input[str] password_secret_name: Name of the Harness secret containing the password for the cluster.
        :param pulumi.Input[str] username: Username for authentication to the cluster. This can be the username itself or the ID of a harness secret.
        :param pulumi.Input[str] client_secret_secret_name: Name of the Harness secret containing the client secret for the cluster.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] scopes: Scopes to request from the identity provider.
        """
        pulumi.set(__self__, "client_id_secret_name", client_id_secret_name)
        pulumi.set(__self__, "identity_provider_url", identity_provider_url)
        pulumi.set(__self__, "master_url", master_url)
        pulumi.set(__self__, "password_secret_name", password_secret_name)
        pulumi.set(__self__, "username", username)
        if client_secret_secret_name is not None:
            pulumi.set(__self__, "client_secret_secret_name", client_secret_secret_name)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)

    @property
    @pulumi.getter(name="clientIdSecretName")
    def client_id_secret_name(self) -> pulumi.Input[str]:
        """
        Name of the Harness secret containing the client ID for the cluster.
        """
        return pulumi.get(self, "client_id_secret_name")

    @client_id_secret_name.setter
    def client_id_secret_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_id_secret_name", value)

    @property
    @pulumi.getter(name="identityProviderUrl")
    def identity_provider_url(self) -> pulumi.Input[str]:
        """
        URL of the identity provider to use.
        """
        return pulumi.get(self, "identity_provider_url")

    @identity_provider_url.setter
    def identity_provider_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "identity_provider_url", value)

    @property
    @pulumi.getter(name="masterUrl")
    def master_url(self) -> pulumi.Input[str]:
        """
        URL of the Kubernetes master to connect to.
        """
        return pulumi.get(self, "master_url")

    @master_url.setter
    def master_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "master_url", value)

    @property
    @pulumi.getter(name="passwordSecretName")
    def password_secret_name(self) -> pulumi.Input[str]:
        """
        Name of the Harness secret containing the password for the cluster.
        """
        return pulumi.get(self, "password_secret_name")

    @password_secret_name.setter
    def password_secret_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "password_secret_name", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        Username for authentication to the cluster. This can be the username itself or the ID of a harness secret.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter(name="clientSecretSecretName")
    def client_secret_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Harness secret containing the client secret for the cluster.
        """
        return pulumi.get(self, "client_secret_secret_name")

    @client_secret_secret_name.setter
    def client_secret_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret_secret_name", value)

    @property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Scopes to request from the identity provider.
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "scopes", value)


@pulumi.input_type
class KubernetesAuthenticationServiceAccountArgs:
    def __init__(__self__, *,
                 master_url: pulumi.Input[str],
                 service_account_token_secret_name: pulumi.Input[str],
                 ca_certificate_secret_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] master_url: URL of the Kubernetes master to connect to.
        :param pulumi.Input[str] service_account_token_secret_name: Name of the Harness secret containing the service account token for the cluster.
        :param pulumi.Input[str] ca_certificate_secret_name: Name of the Harness secret containing the CA certificate for the cluster.
        """
        pulumi.set(__self__, "master_url", master_url)
        pulumi.set(__self__, "service_account_token_secret_name", service_account_token_secret_name)
        if ca_certificate_secret_name is not None:
            pulumi.set(__self__, "ca_certificate_secret_name", ca_certificate_secret_name)

    @property
    @pulumi.getter(name="masterUrl")
    def master_url(self) -> pulumi.Input[str]:
        """
        URL of the Kubernetes master to connect to.
        """
        return pulumi.get(self, "master_url")

    @master_url.setter
    def master_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "master_url", value)

    @property
    @pulumi.getter(name="serviceAccountTokenSecretName")
    def service_account_token_secret_name(self) -> pulumi.Input[str]:
        """
        Name of the Harness secret containing the service account token for the cluster.
        """
        return pulumi.get(self, "service_account_token_secret_name")

    @service_account_token_secret_name.setter
    def service_account_token_secret_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_account_token_secret_name", value)

    @property
    @pulumi.getter(name="caCertificateSecretName")
    def ca_certificate_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Harness secret containing the CA certificate for the cluster.
        """
        return pulumi.get(self, "ca_certificate_secret_name")

    @ca_certificate_secret_name.setter
    def ca_certificate_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ca_certificate_secret_name", value)


@pulumi.input_type
class KubernetesAuthenticationUsernamePasswordArgs:
    def __init__(__self__, *,
                 master_url: pulumi.Input[str],
                 password_secret_name: pulumi.Input[str],
                 username: Optional[pulumi.Input[str]] = None,
                 username_secret_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] master_url: URL of the Kubernetes master to connect to.
        :param pulumi.Input[str] password_secret_name: Name of the Harness secret containing the password for the cluster.
        :param pulumi.Input[str] username: Username for authentication to the cluster
        :param pulumi.Input[str] username_secret_name: Name of the Harness secret containing the username for authentication to the cluster
        """
        pulumi.set(__self__, "master_url", master_url)
        pulumi.set(__self__, "password_secret_name", password_secret_name)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if username_secret_name is not None:
            pulumi.set(__self__, "username_secret_name", username_secret_name)

    @property
    @pulumi.getter(name="masterUrl")
    def master_url(self) -> pulumi.Input[str]:
        """
        URL of the Kubernetes master to connect to.
        """
        return pulumi.get(self, "master_url")

    @master_url.setter
    def master_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "master_url", value)

    @property
    @pulumi.getter(name="passwordSecretName")
    def password_secret_name(self) -> pulumi.Input[str]:
        """
        Name of the Harness secret containing the password for the cluster.
        """
        return pulumi.get(self, "password_secret_name")

    @password_secret_name.setter
    def password_secret_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "password_secret_name", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        Username for authentication to the cluster
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter(name="usernameSecretName")
    def username_secret_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Harness secret containing the username for authentication to the cluster
        """
        return pulumi.get(self, "username_secret_name")

    @username_secret_name.setter
    def username_secret_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username_secret_name", value)


@pulumi.input_type
class KubernetesUsageScopeArgs:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 environment_filter_type: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] application_id: Id of the application to scope to. If empty then this scope applies to all applications.
        :param pulumi.Input[str] environment_filter_type: Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        :param pulumi.Input[str] environment_id: Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if environment_filter_type is not None:
            pulumi.set(__self__, "environment_filter_type", environment_filter_type)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the application to scope to. If empty then this scope applies to all applications.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="environmentFilterType")
    def environment_filter_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        """
        return pulumi.get(self, "environment_filter_type")

    @environment_filter_type.setter
    def environment_filter_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_filter_type", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)


