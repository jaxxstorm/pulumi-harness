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
    'GetVaultConnectorResult',
    'AwaitableGetVaultConnectorResult',
    'get_vault_connector',
    'get_vault_connector_output',
]

@pulumi.output_type
class GetVaultConnectorResult:
    """
    A collection of values returned by getVaultConnector.
    """
    def __init__(__self__, access_type=None, app_role_id=None, auth_token=None, aws_region=None, base_path=None, default=None, delegate_selectors=None, description=None, id=None, identifier=None, is_default=None, is_read_only=None, k8s_auth_endpoint=None, name=None, namespace=None, org_id=None, project_id=None, read_only=None, renew_app_role_token=None, renewal_interval_minutes=None, secret_engine_manually_configured=None, secret_engine_name=None, secret_engine_version=None, secret_id=None, service_account_token_path=None, sink_path=None, tags=None, use_aws_iam=None, use_k8s_auth=None, use_vault_agent=None, vault_aws_iam_role=None, vault_k8s_auth_role=None, vault_url=None, xvault_aws_iam_server_id=None):
        if access_type and not isinstance(access_type, str):
            raise TypeError("Expected argument 'access_type' to be a str")
        pulumi.set(__self__, "access_type", access_type)
        if app_role_id and not isinstance(app_role_id, str):
            raise TypeError("Expected argument 'app_role_id' to be a str")
        pulumi.set(__self__, "app_role_id", app_role_id)
        if auth_token and not isinstance(auth_token, str):
            raise TypeError("Expected argument 'auth_token' to be a str")
        pulumi.set(__self__, "auth_token", auth_token)
        if aws_region and not isinstance(aws_region, str):
            raise TypeError("Expected argument 'aws_region' to be a str")
        pulumi.set(__self__, "aws_region", aws_region)
        if base_path and not isinstance(base_path, str):
            raise TypeError("Expected argument 'base_path' to be a str")
        pulumi.set(__self__, "base_path", base_path)
        if default and not isinstance(default, bool):
            raise TypeError("Expected argument 'default' to be a bool")
        pulumi.set(__self__, "default", default)
        if delegate_selectors and not isinstance(delegate_selectors, list):
            raise TypeError("Expected argument 'delegate_selectors' to be a list")
        pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if is_default and not isinstance(is_default, bool):
            raise TypeError("Expected argument 'is_default' to be a bool")
        pulumi.set(__self__, "is_default", is_default)
        if is_read_only and not isinstance(is_read_only, bool):
            raise TypeError("Expected argument 'is_read_only' to be a bool")
        pulumi.set(__self__, "is_read_only", is_read_only)
        if k8s_auth_endpoint and not isinstance(k8s_auth_endpoint, str):
            raise TypeError("Expected argument 'k8s_auth_endpoint' to be a str")
        pulumi.set(__self__, "k8s_auth_endpoint", k8s_auth_endpoint)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace and not isinstance(namespace, str):
            raise TypeError("Expected argument 'namespace' to be a str")
        pulumi.set(__self__, "namespace", namespace)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if read_only and not isinstance(read_only, bool):
            raise TypeError("Expected argument 'read_only' to be a bool")
        pulumi.set(__self__, "read_only", read_only)
        if renew_app_role_token and not isinstance(renew_app_role_token, bool):
            raise TypeError("Expected argument 'renew_app_role_token' to be a bool")
        pulumi.set(__self__, "renew_app_role_token", renew_app_role_token)
        if renewal_interval_minutes and not isinstance(renewal_interval_minutes, int):
            raise TypeError("Expected argument 'renewal_interval_minutes' to be a int")
        pulumi.set(__self__, "renewal_interval_minutes", renewal_interval_minutes)
        if secret_engine_manually_configured and not isinstance(secret_engine_manually_configured, bool):
            raise TypeError("Expected argument 'secret_engine_manually_configured' to be a bool")
        pulumi.set(__self__, "secret_engine_manually_configured", secret_engine_manually_configured)
        if secret_engine_name and not isinstance(secret_engine_name, str):
            raise TypeError("Expected argument 'secret_engine_name' to be a str")
        pulumi.set(__self__, "secret_engine_name", secret_engine_name)
        if secret_engine_version and not isinstance(secret_engine_version, int):
            raise TypeError("Expected argument 'secret_engine_version' to be a int")
        pulumi.set(__self__, "secret_engine_version", secret_engine_version)
        if secret_id and not isinstance(secret_id, str):
            raise TypeError("Expected argument 'secret_id' to be a str")
        pulumi.set(__self__, "secret_id", secret_id)
        if service_account_token_path and not isinstance(service_account_token_path, str):
            raise TypeError("Expected argument 'service_account_token_path' to be a str")
        pulumi.set(__self__, "service_account_token_path", service_account_token_path)
        if sink_path and not isinstance(sink_path, str):
            raise TypeError("Expected argument 'sink_path' to be a str")
        pulumi.set(__self__, "sink_path", sink_path)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if use_aws_iam and not isinstance(use_aws_iam, bool):
            raise TypeError("Expected argument 'use_aws_iam' to be a bool")
        pulumi.set(__self__, "use_aws_iam", use_aws_iam)
        if use_k8s_auth and not isinstance(use_k8s_auth, bool):
            raise TypeError("Expected argument 'use_k8s_auth' to be a bool")
        pulumi.set(__self__, "use_k8s_auth", use_k8s_auth)
        if use_vault_agent and not isinstance(use_vault_agent, bool):
            raise TypeError("Expected argument 'use_vault_agent' to be a bool")
        pulumi.set(__self__, "use_vault_agent", use_vault_agent)
        if vault_aws_iam_role and not isinstance(vault_aws_iam_role, str):
            raise TypeError("Expected argument 'vault_aws_iam_role' to be a str")
        pulumi.set(__self__, "vault_aws_iam_role", vault_aws_iam_role)
        if vault_k8s_auth_role and not isinstance(vault_k8s_auth_role, str):
            raise TypeError("Expected argument 'vault_k8s_auth_role' to be a str")
        pulumi.set(__self__, "vault_k8s_auth_role", vault_k8s_auth_role)
        if vault_url and not isinstance(vault_url, str):
            raise TypeError("Expected argument 'vault_url' to be a str")
        pulumi.set(__self__, "vault_url", vault_url)
        if xvault_aws_iam_server_id and not isinstance(xvault_aws_iam_server_id, str):
            raise TypeError("Expected argument 'xvault_aws_iam_server_id' to be a str")
        pulumi.set(__self__, "xvault_aws_iam_server_id", xvault_aws_iam_server_id)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> str:
        """
        Access type.
        """
        return pulumi.get(self, "access_type")

    @property
    @pulumi.getter(name="appRoleId")
    def app_role_id(self) -> str:
        """
        ID of App Role.
        """
        return pulumi.get(self, "app_role_id")

    @property
    @pulumi.getter(name="authToken")
    def auth_token(self) -> str:
        """
        The authentication token for Vault.
        """
        return pulumi.get(self, "auth_token")

    @property
    @pulumi.getter(name="awsRegion")
    def aws_region(self) -> str:
        """
        The AWS region where AWS IAM auth will happen.
        """
        return pulumi.get(self, "aws_region")

    @property
    @pulumi.getter(name="basePath")
    def base_path(self) -> str:
        """
        The location of the Vault directory where Secret will be stored.
        """
        return pulumi.get(self, "base_path")

    @property
    @pulumi.getter
    def default(self) -> bool:
        """
        Is default or not.
        """
        return pulumi.get(self, "default")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Sequence[str]:
        """
        List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
        """
        return pulumi.get(self, "delegate_selectors")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> str:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> bool:
        """
        Is default or not.
        """
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter(name="isReadOnly")
    def is_read_only(self) -> bool:
        """
        Read only or not.
        """
        return pulumi.get(self, "is_read_only")

    @property
    @pulumi.getter(name="k8sAuthEndpoint")
    def k8s_auth_endpoint(self) -> str:
        """
        The path where kubernetes auth is enabled in Vault.
        """
        return pulumi.get(self, "k8s_auth_endpoint")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> str:
        """
        The Vault namespace where Secret will be created.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> bool:
        """
        Read only.
        """
        return pulumi.get(self, "read_only")

    @property
    @pulumi.getter(name="renewAppRoleToken")
    def renew_app_role_token(self) -> bool:
        """
        Boolean value to indicate if appRole token renewal is enabled or not.
        """
        return pulumi.get(self, "renew_app_role_token")

    @property
    @pulumi.getter(name="renewalIntervalMinutes")
    def renewal_interval_minutes(self) -> int:
        """
        The time interval for token renewal.
        """
        return pulumi.get(self, "renewal_interval_minutes")

    @property
    @pulumi.getter(name="secretEngineManuallyConfigured")
    def secret_engine_manually_configured(self) -> bool:
        """
        Manually entered Secret Engine.
        """
        return pulumi.get(self, "secret_engine_manually_configured")

    @property
    @pulumi.getter(name="secretEngineName")
    def secret_engine_name(self) -> str:
        """
        Name of the Secret Engine.
        """
        return pulumi.get(self, "secret_engine_name")

    @property
    @pulumi.getter(name="secretEngineVersion")
    def secret_engine_version(self) -> int:
        """
        Version of Secret Engine.
        """
        return pulumi.get(self, "secret_engine_version")

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> str:
        """
        ID of the Secret.
        """
        return pulumi.get(self, "secret_id")

    @property
    @pulumi.getter(name="serviceAccountTokenPath")
    def service_account_token_path(self) -> str:
        """
        The SA token path where the token is mounted in the K8s Pod.
        """
        return pulumi.get(self, "service_account_token_path")

    @property
    @pulumi.getter(name="sinkPath")
    def sink_path(self) -> str:
        """
        The location at which auth token is to be read from.
        """
        return pulumi.get(self, "sink_path")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="useAwsIam")
    def use_aws_iam(self) -> bool:
        """
        Boolean value to indicate if AWS IAM is used for authentication.
        """
        return pulumi.get(self, "use_aws_iam")

    @property
    @pulumi.getter(name="useK8sAuth")
    def use_k8s_auth(self) -> bool:
        """
        Boolean value to indicate if K8s Auth is used for authentication.
        """
        return pulumi.get(self, "use_k8s_auth")

    @property
    @pulumi.getter(name="useVaultAgent")
    def use_vault_agent(self) -> bool:
        """
        Boolean value to indicate if Vault Agent is used for authentication.
        """
        return pulumi.get(self, "use_vault_agent")

    @property
    @pulumi.getter(name="vaultAwsIamRole")
    def vault_aws_iam_role(self) -> str:
        """
        The Vault role defined to bind to AWS IAM account/role being accessed.
        """
        return pulumi.get(self, "vault_aws_iam_role")

    @property
    @pulumi.getter(name="vaultK8sAuthRole")
    def vault_k8s_auth_role(self) -> str:
        """
        The role where K8s auth will happen.
        """
        return pulumi.get(self, "vault_k8s_auth_role")

    @property
    @pulumi.getter(name="vaultUrl")
    def vault_url(self) -> str:
        """
        URL of the HashiCorp Vault.
        """
        return pulumi.get(self, "vault_url")

    @property
    @pulumi.getter(name="xvaultAwsIamServerId")
    def xvault_aws_iam_server_id(self) -> str:
        """
        The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
        """
        return pulumi.get(self, "xvault_aws_iam_server_id")


class AwaitableGetVaultConnectorResult(GetVaultConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVaultConnectorResult(
            access_type=self.access_type,
            app_role_id=self.app_role_id,
            auth_token=self.auth_token,
            aws_region=self.aws_region,
            base_path=self.base_path,
            default=self.default,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            is_default=self.is_default,
            is_read_only=self.is_read_only,
            k8s_auth_endpoint=self.k8s_auth_endpoint,
            name=self.name,
            namespace=self.namespace,
            org_id=self.org_id,
            project_id=self.project_id,
            read_only=self.read_only,
            renew_app_role_token=self.renew_app_role_token,
            renewal_interval_minutes=self.renewal_interval_minutes,
            secret_engine_manually_configured=self.secret_engine_manually_configured,
            secret_engine_name=self.secret_engine_name,
            secret_engine_version=self.secret_engine_version,
            secret_id=self.secret_id,
            service_account_token_path=self.service_account_token_path,
            sink_path=self.sink_path,
            tags=self.tags,
            use_aws_iam=self.use_aws_iam,
            use_k8s_auth=self.use_k8s_auth,
            use_vault_agent=self.use_vault_agent,
            vault_aws_iam_role=self.vault_aws_iam_role,
            vault_k8s_auth_role=self.vault_k8s_auth_role,
            vault_url=self.vault_url,
            xvault_aws_iam_server_id=self.xvault_aws_iam_server_id)


def get_vault_connector(identifier: Optional[str] = None,
                        name: Optional[str] = None,
                        org_id: Optional[str] = None,
                        project_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVaultConnectorResult:
    """
    DataSource for looking up a Vault connector in Harness.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_vault_connector(identifier="identifier")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getVaultConnector:getVaultConnector', __args__, opts=opts, typ=GetVaultConnectorResult).value

    return AwaitableGetVaultConnectorResult(
        access_type=pulumi.get(__ret__, 'access_type'),
        app_role_id=pulumi.get(__ret__, 'app_role_id'),
        auth_token=pulumi.get(__ret__, 'auth_token'),
        aws_region=pulumi.get(__ret__, 'aws_region'),
        base_path=pulumi.get(__ret__, 'base_path'),
        default=pulumi.get(__ret__, 'default'),
        delegate_selectors=pulumi.get(__ret__, 'delegate_selectors'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        is_default=pulumi.get(__ret__, 'is_default'),
        is_read_only=pulumi.get(__ret__, 'is_read_only'),
        k8s_auth_endpoint=pulumi.get(__ret__, 'k8s_auth_endpoint'),
        name=pulumi.get(__ret__, 'name'),
        namespace=pulumi.get(__ret__, 'namespace'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        read_only=pulumi.get(__ret__, 'read_only'),
        renew_app_role_token=pulumi.get(__ret__, 'renew_app_role_token'),
        renewal_interval_minutes=pulumi.get(__ret__, 'renewal_interval_minutes'),
        secret_engine_manually_configured=pulumi.get(__ret__, 'secret_engine_manually_configured'),
        secret_engine_name=pulumi.get(__ret__, 'secret_engine_name'),
        secret_engine_version=pulumi.get(__ret__, 'secret_engine_version'),
        secret_id=pulumi.get(__ret__, 'secret_id'),
        service_account_token_path=pulumi.get(__ret__, 'service_account_token_path'),
        sink_path=pulumi.get(__ret__, 'sink_path'),
        tags=pulumi.get(__ret__, 'tags'),
        use_aws_iam=pulumi.get(__ret__, 'use_aws_iam'),
        use_k8s_auth=pulumi.get(__ret__, 'use_k8s_auth'),
        use_vault_agent=pulumi.get(__ret__, 'use_vault_agent'),
        vault_aws_iam_role=pulumi.get(__ret__, 'vault_aws_iam_role'),
        vault_k8s_auth_role=pulumi.get(__ret__, 'vault_k8s_auth_role'),
        vault_url=pulumi.get(__ret__, 'vault_url'),
        xvault_aws_iam_server_id=pulumi.get(__ret__, 'xvault_aws_iam_server_id'))


@_utilities.lift_output_func(get_vault_connector)
def get_vault_connector_output(identifier: Optional[pulumi.Input[str]] = None,
                               name: Optional[pulumi.Input[Optional[str]]] = None,
                               org_id: Optional[pulumi.Input[Optional[str]]] = None,
                               project_id: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVaultConnectorResult]:
    """
    DataSource for looking up a Vault connector in Harness.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_vault_connector(identifier="identifier")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...
