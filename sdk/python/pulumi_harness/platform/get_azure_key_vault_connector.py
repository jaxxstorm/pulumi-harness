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
    'GetAzureKeyVaultConnectorResult',
    'AwaitableGetAzureKeyVaultConnectorResult',
    'get_azure_key_vault_connector',
    'get_azure_key_vault_connector_output',
]

@pulumi.output_type
class GetAzureKeyVaultConnectorResult:
    """
    A collection of values returned by getAzureKeyVaultConnector.
    """
    def __init__(__self__, azure_environment_type=None, client_id=None, delegate_selectors=None, description=None, id=None, identifier=None, is_default=None, name=None, org_id=None, project_id=None, secret_key=None, subscription=None, tags=None, tenant_id=None, vault_name=None):
        if azure_environment_type and not isinstance(azure_environment_type, str):
            raise TypeError("Expected argument 'azure_environment_type' to be a str")
        pulumi.set(__self__, "azure_environment_type", azure_environment_type)
        if client_id and not isinstance(client_id, str):
            raise TypeError("Expected argument 'client_id' to be a str")
        pulumi.set(__self__, "client_id", client_id)
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
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if secret_key and not isinstance(secret_key, str):
            raise TypeError("Expected argument 'secret_key' to be a str")
        pulumi.set(__self__, "secret_key", secret_key)
        if subscription and not isinstance(subscription, str):
            raise TypeError("Expected argument 'subscription' to be a str")
        pulumi.set(__self__, "subscription", subscription)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tenant_id and not isinstance(tenant_id, str):
            raise TypeError("Expected argument 'tenant_id' to be a str")
        pulumi.set(__self__, "tenant_id", tenant_id)
        if vault_name and not isinstance(vault_name, str):
            raise TypeError("Expected argument 'vault_name' to be a str")
        pulumi.set(__self__, "vault_name", vault_name)

    @property
    @pulumi.getter(name="azureEnvironmentType")
    def azure_environment_type(self) -> str:
        """
        Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
        """
        return pulumi.get(self, "azure_environment_type")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> str:
        """
        Application ID of the Azure App.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Sequence[str]:
        """
        Connect using only the delegates which have these tags.
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
        Specifies whether or not is the default value.
        """
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

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
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> str:
        """
        The Harness text secret with the Azure authentication key as its value.
        """
        return pulumi.get(self, "secret_key")

    @property
    @pulumi.getter
    def subscription(self) -> str:
        """
        Azure subscription ID.
        """
        return pulumi.get(self, "subscription")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> str:
        """
        The Azure Active Directory (AAD) directory ID where you created your application.
        """
        return pulumi.get(self, "tenant_id")

    @property
    @pulumi.getter(name="vaultName")
    def vault_name(self) -> str:
        """
        Name of the vault.
        """
        return pulumi.get(self, "vault_name")


class AwaitableGetAzureKeyVaultConnectorResult(GetAzureKeyVaultConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAzureKeyVaultConnectorResult(
            azure_environment_type=self.azure_environment_type,
            client_id=self.client_id,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            is_default=self.is_default,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            secret_key=self.secret_key,
            subscription=self.subscription,
            tags=self.tags,
            tenant_id=self.tenant_id,
            vault_name=self.vault_name)


def get_azure_key_vault_connector(identifier: Optional[str] = None,
                                  name: Optional[str] = None,
                                  org_id: Optional[str] = None,
                                  project_id: Optional[str] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAzureKeyVaultConnectorResult:
    """
    Data source for looking up an Azure key vault connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_azure_key_vault_connector(identifier="identifier")
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
    __ret__ = pulumi.runtime.invoke('harness:platform/getAzureKeyVaultConnector:getAzureKeyVaultConnector', __args__, opts=opts, typ=GetAzureKeyVaultConnectorResult).value

    return AwaitableGetAzureKeyVaultConnectorResult(
        azure_environment_type=pulumi.get(__ret__, 'azure_environment_type'),
        client_id=pulumi.get(__ret__, 'client_id'),
        delegate_selectors=pulumi.get(__ret__, 'delegate_selectors'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        is_default=pulumi.get(__ret__, 'is_default'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        secret_key=pulumi.get(__ret__, 'secret_key'),
        subscription=pulumi.get(__ret__, 'subscription'),
        tags=pulumi.get(__ret__, 'tags'),
        tenant_id=pulumi.get(__ret__, 'tenant_id'),
        vault_name=pulumi.get(__ret__, 'vault_name'))


@_utilities.lift_output_func(get_azure_key_vault_connector)
def get_azure_key_vault_connector_output(identifier: Optional[pulumi.Input[str]] = None,
                                         name: Optional[pulumi.Input[Optional[str]]] = None,
                                         org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                         project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAzureKeyVaultConnectorResult]:
    """
    Data source for looking up an Azure key vault connector.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_azure_key_vault_connector(identifier="identifier")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...