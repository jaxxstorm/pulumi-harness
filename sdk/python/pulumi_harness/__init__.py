# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .add_user_to_group import *
from .application import *
from .application_git_sync import *
from .delegate_approval import *
from .encrypted_text import *
from .environment import *
from .get_application import *
from .get_current_account import *
from .get_delegate import *
from .get_encrypted_text import *
from .get_environment import *
from .get_git_connector import *
from .get_secret_manager import *
from .get_service import *
from .get_ssh_credential import *
from .get_sso_provider import *
from .get_trigger import *
from .get_user import *
from .get_user_group import *
from .get_yaml_config import *
from .git_connector import *
from .infrastructure_definition import *
from .platform_api_key import *
from .platform_ccm_filters import *
from .provider import *
from .ssh_credential import *
from .user import *
from .user_group import *
from .user_group_permissions import *
from .yaml_config import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_harness.autostopping as __autostopping
    autostopping = __autostopping
    import pulumi_harness.cloudprovider as __cloudprovider
    cloudprovider = __cloudprovider
    import pulumi_harness.cluster as __cluster
    cluster = __cluster
    import pulumi_harness.config as __config
    config = __config
    import pulumi_harness.governance as __governance
    governance = __governance
    import pulumi_harness.platform as __platform
    platform = __platform
    import pulumi_harness.service as __service
    service = __service
else:
    autostopping = _utilities.lazy_import('pulumi_harness.autostopping')
    cloudprovider = _utilities.lazy_import('pulumi_harness.cloudprovider')
    cluster = _utilities.lazy_import('pulumi_harness.cluster')
    config = _utilities.lazy_import('pulumi_harness.config')
    governance = _utilities.lazy_import('pulumi_harness.governance')
    platform = _utilities.lazy_import('pulumi_harness.platform')
    service = _utilities.lazy_import('pulumi_harness.service')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "harness",
  "mod": "autostopping/awsAlb",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/awsAlb:AwsAlb": "AwsAlb"
  }
 },
 {
  "pkg": "harness",
  "mod": "autostopping/awsProxy",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/awsProxy:AwsProxy": "AwsProxy"
  }
 },
 {
  "pkg": "harness",
  "mod": "autostopping/azureGateway",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/azureGateway:AzureGateway": "AzureGateway"
  }
 },
 {
  "pkg": "harness",
  "mod": "autostopping/azureProxy",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/azureProxy:AzureProxy": "AzureProxy"
  }
 },
 {
  "pkg": "harness",
  "mod": "autostopping/gcpProxy",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/gcpProxy:GcpProxy": "GcpProxy"
  }
 },
 {
  "pkg": "harness",
  "mod": "autostopping/ruleEcs",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/ruleEcs:RuleEcs": "RuleEcs"
  }
 },
 {
  "pkg": "harness",
  "mod": "autostopping/ruleRds",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/ruleRds:RuleRds": "RuleRds"
  }
 },
 {
  "pkg": "harness",
  "mod": "autostopping/ruleVm",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/ruleVm:RuleVm": "RuleVm"
  }
 },
 {
  "pkg": "harness",
  "mod": "autostopping/schedule",
  "fqn": "pulumi_harness.autostopping",
  "classes": {
   "harness:autostopping/schedule:Schedule": "Schedule"
  }
 },
 {
  "pkg": "harness",
  "mod": "cloudprovider/aws",
  "fqn": "pulumi_harness.cloudprovider",
  "classes": {
   "harness:cloudprovider/aws:Aws": "Aws"
  }
 },
 {
  "pkg": "harness",
  "mod": "cloudprovider/azure",
  "fqn": "pulumi_harness.cloudprovider",
  "classes": {
   "harness:cloudprovider/azure:Azure": "Azure"
  }
 },
 {
  "pkg": "harness",
  "mod": "cloudprovider/datacenter",
  "fqn": "pulumi_harness.cloudprovider",
  "classes": {
   "harness:cloudprovider/datacenter:Datacenter": "Datacenter"
  }
 },
 {
  "pkg": "harness",
  "mod": "cloudprovider/gcp",
  "fqn": "pulumi_harness.cloudprovider",
  "classes": {
   "harness:cloudprovider/gcp:Gcp": "Gcp"
  }
 },
 {
  "pkg": "harness",
  "mod": "cloudprovider/kubernetes",
  "fqn": "pulumi_harness.cloudprovider",
  "classes": {
   "harness:cloudprovider/kubernetes:Kubernetes": "Kubernetes"
  }
 },
 {
  "pkg": "harness",
  "mod": "cloudprovider/spot",
  "fqn": "pulumi_harness.cloudprovider",
  "classes": {
   "harness:cloudprovider/spot:Spot": "Spot"
  }
 },
 {
  "pkg": "harness",
  "mod": "cloudprovider/tanzu",
  "fqn": "pulumi_harness.cloudprovider",
  "classes": {
   "harness:cloudprovider/tanzu:Tanzu": "Tanzu"
  }
 },
 {
  "pkg": "harness",
  "mod": "cluster/orchestrator",
  "fqn": "pulumi_harness.cluster",
  "classes": {
   "harness:cluster/orchestrator:Orchestrator": "Orchestrator"
  }
 },
 {
  "pkg": "harness",
  "mod": "governance/rule",
  "fqn": "pulumi_harness.governance",
  "classes": {
   "harness:governance/rule:Rule": "Rule"
  }
 },
 {
  "pkg": "harness",
  "mod": "governance/ruleEnforcement",
  "fqn": "pulumi_harness.governance",
  "classes": {
   "harness:governance/ruleEnforcement:RuleEnforcement": "RuleEnforcement"
  }
 },
 {
  "pkg": "harness",
  "mod": "governance/ruleSet",
  "fqn": "pulumi_harness.governance",
  "classes": {
   "harness:governance/ruleSet:RuleSet": "RuleSet"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/addUserToGroup",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/addUserToGroup:AddUserToGroup": "AddUserToGroup"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/application",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/application:Application": "Application"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/applicationGitSync",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/applicationGitSync:ApplicationGitSync": "ApplicationGitSync"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/delegateApproval",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/delegateApproval:DelegateApproval": "DelegateApproval"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/encryptedText",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/encryptedText:EncryptedText": "EncryptedText"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/environment",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/environment:Environment": "Environment"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/gitConnector",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/gitConnector:GitConnector": "GitConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/infrastructureDefinition",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/infrastructureDefinition:InfrastructureDefinition": "InfrastructureDefinition"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/platformApiKey",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/platformApiKey:PlatformApiKey": "PlatformApiKey"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/platformCcmFilters",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/platformCcmFilters:PlatformCcmFilters": "PlatformCcmFilters"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/sshCredential",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/sshCredential:SshCredential": "SshCredential"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/user",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/user:User": "User"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/userGroup",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/userGroup:UserGroup": "UserGroup"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/userGroupPermissions",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/userGroupPermissions:UserGroupPermissions": "UserGroupPermissions"
  }
 },
 {
  "pkg": "harness",
  "mod": "index/yamlConfig",
  "fqn": "pulumi_harness",
  "classes": {
   "harness:index/yamlConfig:YamlConfig": "YamlConfig"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/appDynamicsConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/appDynamicsConnector:AppDynamicsConnector": "AppDynamicsConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/artifactoryConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/artifactoryConnector:ArtifactoryConnector": "ArtifactoryConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/awsCCConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/awsCCConnector:AwsCCConnector": "AwsCCConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/awsConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/awsConnector:AwsConnector": "AwsConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/awsKmsConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/awsKmsConnector:AwsKmsConnector": "AwsKmsConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/awsSecretManagerConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector": "AwsSecretManagerConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/azureCloudCostConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/azureCloudCostConnector:AzureCloudCostConnector": "AzureCloudCostConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/azureCloudProviderConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector": "AzureCloudProviderConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/azureKeyVaultConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/azureKeyVaultConnector:AzureKeyVaultConnector": "AzureKeyVaultConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/bitbucketConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/bitbucketConnector:BitbucketConnector": "BitbucketConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/connectorCustomSecretManager",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/connectorCustomSecretManager:ConnectorCustomSecretManager": "ConnectorCustomSecretManager"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/connectorCustomhealthsource",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/connectorCustomhealthsource:ConnectorCustomhealthsource": "ConnectorCustomhealthsource"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/connectorJdbc",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/connectorJdbc:ConnectorJdbc": "ConnectorJdbc"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/connectorPdc",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/connectorPdc:ConnectorPdc": "ConnectorPdc"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/connectorRancher",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/connectorRancher:ConnectorRancher": "ConnectorRancher"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/datadogConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/datadogConnector:DatadogConnector": "DatadogConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/dbInstance",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/dbInstance:DbInstance": "DbInstance"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/dbSchema",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/dbSchema:DbSchema": "DbSchema"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/delegatetoken",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/delegatetoken:Delegatetoken": "Delegatetoken"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/dockerConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/dockerConnector:DockerConnector": "DockerConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/dynatraceConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/dynatraceConnector:DynatraceConnector": "DynatraceConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/elasticsearchConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/elasticsearchConnector:ElasticsearchConnector": "ElasticsearchConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/environment",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/environment:Environment": "Environment"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/environmentClustersMapping",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/environmentClustersMapping:EnvironmentClustersMapping": "EnvironmentClustersMapping"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/environmentGroup",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/environmentGroup:EnvironmentGroup": "EnvironmentGroup"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/environmentServiceOverrides",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides": "EnvironmentServiceOverrides"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/featureFlag",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/featureFlag:FeatureFlag": "FeatureFlag"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/featureFlagApiKey",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/featureFlagApiKey:FeatureFlagApiKey": "FeatureFlagApiKey"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/featureFlagTarget",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/featureFlagTarget:FeatureFlagTarget": "FeatureFlagTarget"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/featureFlagTargetGroup",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/featureFlagTargetGroup:FeatureFlagTargetGroup": "FeatureFlagTargetGroup"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/fileStoreFile",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/fileStoreFile:FileStoreFile": "FileStoreFile"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/fileStoreFolder",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/fileStoreFolder:FileStoreFolder": "FileStoreFolder"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/filters",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/filters:Filters": "Filters"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gcpCloudCostConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gcpCloudCostConnector:GcpCloudCostConnector": "GcpCloudCostConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gcpConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gcpConnector:GcpConnector": "GcpConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gcpSecretManagerConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gcpSecretManagerConnector:GcpSecretManagerConnector": "GcpSecretManagerConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitConnector:GitConnector": "GitConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitOpsAgent",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitOpsAgent:GitOpsAgent": "GitOpsAgent"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitOpsApplications",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitOpsApplications:GitOpsApplications": "GitOpsApplications"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitOpsCluster",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitOpsCluster:GitOpsCluster": "GitOpsCluster"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitOpsGnupg",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitOpsGnupg:GitOpsGnupg": "GitOpsGnupg"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitOpsRepoCert",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitOpsRepoCert:GitOpsRepoCert": "GitOpsRepoCert"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitOpsRepoCred",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitOpsRepoCred:GitOpsRepoCred": "GitOpsRepoCred"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitOpsRepository",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitOpsRepository:GitOpsRepository": "GitOpsRepository"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/githubConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/githubConnector:GithubConnector": "GithubConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitlabConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitlabConnector:GitlabConnector": "GitlabConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitopsAppProject",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitopsAppProject:GitopsAppProject": "GitopsAppProject"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitopsAppProjectMapping",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitopsAppProjectMapping:GitopsAppProjectMapping": "GitopsAppProjectMapping"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/gitxWebhook",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/gitxWebhook:GitxWebhook": "GitxWebhook"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/helmConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/helmConnector:HelmConnector": "HelmConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/iacmDefaultPipeline",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/iacmDefaultPipeline:IacmDefaultPipeline": "IacmDefaultPipeline"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/infraModule",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/infraModule:InfraModule": "InfraModule"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/infrastructure",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/infrastructure:Infrastructure": "Infrastructure"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/inputSet",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/inputSet:InputSet": "InputSet"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/jenkinsConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/jenkinsConnector:JenkinsConnector": "JenkinsConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/jiraConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/jiraConnector:JiraConnector": "JiraConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/kubernetesCloudCostConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/kubernetesCloudCostConnector:KubernetesCloudCostConnector": "KubernetesCloudCostConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/kubernetesConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/kubernetesConnector:KubernetesConnector": "KubernetesConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/manualFreeze",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/manualFreeze:ManualFreeze": "ManualFreeze"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/monitoredService",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/monitoredService:MonitoredService": "MonitoredService"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/newrelicConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/newrelicConnector:NewrelicConnector": "NewrelicConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/nexusConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/nexusConnector:NexusConnector": "NexusConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/notificationRule",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/notificationRule:NotificationRule": "NotificationRule"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/ociHelmConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/ociHelmConnector:OciHelmConnector": "OciHelmConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/organization",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/organization:Organization": "Organization"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/overrides",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/overrides:Overrides": "Overrides"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/pagerdutyConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/pagerdutyConnector:PagerdutyConnector": "PagerdutyConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/pipeline",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/pipeline:Pipeline": "Pipeline"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/pipelineFilters",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/pipelineFilters:PipelineFilters": "PipelineFilters"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/policy",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/policy:Policy": "Policy"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/policySet",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/policySet:PolicySet": "PolicySet"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/project",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/project:Project": "Project"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/prometheusConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/prometheusConnector:PrometheusConnector": "PrometheusConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/provider",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/provider:Provider": "Provider"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/repo",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/repo:Repo": "Repo"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/repoRuleBranch",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/repoRuleBranch:RepoRuleBranch": "RepoRuleBranch"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/repoWebhook",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/repoWebhook:RepoWebhook": "RepoWebhook"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/resourceGroup",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/resourceGroup:ResourceGroup": "ResourceGroup"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/roleAssignments",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/roleAssignments:RoleAssignments": "RoleAssignments"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/roles",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/roles:Roles": "Roles"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/secretFile",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/secretFile:SecretFile": "SecretFile"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/secretSshkey",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/secretSshkey:SecretSshkey": "SecretSshkey"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/secretText",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/secretText:SecretText": "SecretText"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/service",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/service:Service": "Service"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/serviceAccount",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/serviceAccount:ServiceAccount": "ServiceAccount"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/serviceNowConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/serviceNowConnector:ServiceNowConnector": "ServiceNowConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/serviceOverridesV2",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/serviceOverridesV2:ServiceOverridesV2": "ServiceOverridesV2"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/slo",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/slo:Slo": "Slo"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/splunkConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/splunkConnector:SplunkConnector": "SplunkConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/spotConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/spotConnector:SpotConnector": "SpotConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/sumologicConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/sumologicConnector:SumologicConnector": "SumologicConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/tasConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/tasConnector:TasConnector": "TasConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/template",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/template:Template": "Template"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/templateFilters",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/templateFilters:TemplateFilters": "TemplateFilters"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/terraformCloudConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/terraformCloudConnector:TerraformCloudConnector": "TerraformCloudConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/token",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/token:Token": "Token"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/triggers",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/triggers:Triggers": "Triggers"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/user",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/user:User": "User"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/usergroup",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/usergroup:Usergroup": "Usergroup"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/variables",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/variables:Variables": "Variables"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/vaultConnector",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/vaultConnector:VaultConnector": "VaultConnector"
  }
 },
 {
  "pkg": "harness",
  "mod": "platform/workspace",
  "fqn": "pulumi_harness.platform",
  "classes": {
   "harness:platform/workspace:Workspace": "Workspace"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/ami",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/ami:Ami": "Ami"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/codedeploy",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/codedeploy:Codedeploy": "Codedeploy"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/ecs",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/ecs:Ecs": "Ecs"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/helm",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/helm:Helm": "Helm"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/kubernetes",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/kubernetes:Kubernetes": "Kubernetes"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/lambda",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/lambda:Lambda": "Lambda"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/ssh",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/ssh:Ssh": "Ssh"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/tanzu",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/tanzu:Tanzu": "Tanzu"
  }
 },
 {
  "pkg": "harness",
  "mod": "service/winrm",
  "fqn": "pulumi_harness.service",
  "classes": {
   "harness:service/winrm:Winrm": "Winrm"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "harness",
  "token": "pulumi:providers:harness",
  "fqn": "pulumi_harness",
  "class": "Provider"
 }
]
"""
)
