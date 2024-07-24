// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "harness:platform/appDynamicsConnector:AppDynamicsConnector":
		r = &AppDynamicsConnector{}
	case "harness:platform/artifactoryConnector:ArtifactoryConnector":
		r = &ArtifactoryConnector{}
	case "harness:platform/awsCCConnector:AwsCCConnector":
		r = &AwsCCConnector{}
	case "harness:platform/awsConnector:AwsConnector":
		r = &AwsConnector{}
	case "harness:platform/awsKmsConnector:AwsKmsConnector":
		r = &AwsKmsConnector{}
	case "harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector":
		r = &AwsSecretManagerConnector{}
	case "harness:platform/azureCloudCostConnector:AzureCloudCostConnector":
		r = &AzureCloudCostConnector{}
	case "harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector":
		r = &AzureCloudProviderConnector{}
	case "harness:platform/azureKeyVaultConnector:AzureKeyVaultConnector":
		r = &AzureKeyVaultConnector{}
	case "harness:platform/bitbucketConnector:BitbucketConnector":
		r = &BitbucketConnector{}
	case "harness:platform/connectorCustomSecretManager:ConnectorCustomSecretManager":
		r = &ConnectorCustomSecretManager{}
	case "harness:platform/connectorCustomhealthsource:ConnectorCustomhealthsource":
		r = &ConnectorCustomhealthsource{}
	case "harness:platform/connectorJdbc:ConnectorJdbc":
		r = &ConnectorJdbc{}
	case "harness:platform/connectorPdc:ConnectorPdc":
		r = &ConnectorPdc{}
	case "harness:platform/connectorRancher:ConnectorRancher":
		r = &ConnectorRancher{}
	case "harness:platform/datadogConnector:DatadogConnector":
		r = &DatadogConnector{}
	case "harness:platform/dbInstance:DbInstance":
		r = &DbInstance{}
	case "harness:platform/dbSchema:DbSchema":
		r = &DbSchema{}
	case "harness:platform/delegatetoken:Delegatetoken":
		r = &Delegatetoken{}
	case "harness:platform/dockerConnector:DockerConnector":
		r = &DockerConnector{}
	case "harness:platform/dynatraceConnector:DynatraceConnector":
		r = &DynatraceConnector{}
	case "harness:platform/elasticsearchConnector:ElasticsearchConnector":
		r = &ElasticsearchConnector{}
	case "harness:platform/environment:Environment":
		r = &Environment{}
	case "harness:platform/environmentClustersMapping:EnvironmentClustersMapping":
		r = &EnvironmentClustersMapping{}
	case "harness:platform/environmentGroup:EnvironmentGroup":
		r = &EnvironmentGroup{}
	case "harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides":
		r = &EnvironmentServiceOverrides{}
	case "harness:platform/featureFlag:FeatureFlag":
		r = &FeatureFlag{}
	case "harness:platform/featureFlagApiKey:FeatureFlagApiKey":
		r = &FeatureFlagApiKey{}
	case "harness:platform/featureFlagTarget:FeatureFlagTarget":
		r = &FeatureFlagTarget{}
	case "harness:platform/featureFlagTargetGroup:FeatureFlagTargetGroup":
		r = &FeatureFlagTargetGroup{}
	case "harness:platform/fileStoreFile:FileStoreFile":
		r = &FileStoreFile{}
	case "harness:platform/fileStoreFolder:FileStoreFolder":
		r = &FileStoreFolder{}
	case "harness:platform/filters:Filters":
		r = &Filters{}
	case "harness:platform/gcpCloudCostConnector:GcpCloudCostConnector":
		r = &GcpCloudCostConnector{}
	case "harness:platform/gcpConnector:GcpConnector":
		r = &GcpConnector{}
	case "harness:platform/gcpSecretManagerConnector:GcpSecretManagerConnector":
		r = &GcpSecretManagerConnector{}
	case "harness:platform/gitConnector:GitConnector":
		r = &GitConnector{}
	case "harness:platform/gitOpsAgent:GitOpsAgent":
		r = &GitOpsAgent{}
	case "harness:platform/gitOpsApplications:GitOpsApplications":
		r = &GitOpsApplications{}
	case "harness:platform/gitOpsCluster:GitOpsCluster":
		r = &GitOpsCluster{}
	case "harness:platform/gitOpsGnupg:GitOpsGnupg":
		r = &GitOpsGnupg{}
	case "harness:platform/gitOpsRepoCert:GitOpsRepoCert":
		r = &GitOpsRepoCert{}
	case "harness:platform/gitOpsRepoCred:GitOpsRepoCred":
		r = &GitOpsRepoCred{}
	case "harness:platform/gitOpsRepository:GitOpsRepository":
		r = &GitOpsRepository{}
	case "harness:platform/githubConnector:GithubConnector":
		r = &GithubConnector{}
	case "harness:platform/gitlabConnector:GitlabConnector":
		r = &GitlabConnector{}
	case "harness:platform/gitopsAppProject:GitopsAppProject":
		r = &GitopsAppProject{}
	case "harness:platform/gitopsAppProjectMapping:GitopsAppProjectMapping":
		r = &GitopsAppProjectMapping{}
	case "harness:platform/helmConnector:HelmConnector":
		r = &HelmConnector{}
	case "harness:platform/iacmDefaultPipeline:IacmDefaultPipeline":
		r = &IacmDefaultPipeline{}
	case "harness:platform/infrastructure:Infrastructure":
		r = &Infrastructure{}
	case "harness:platform/inputSet:InputSet":
		r = &InputSet{}
	case "harness:platform/jenkinsConnector:JenkinsConnector":
		r = &JenkinsConnector{}
	case "harness:platform/jiraConnector:JiraConnector":
		r = &JiraConnector{}
	case "harness:platform/kubernetesCloudCostConnector:KubernetesCloudCostConnector":
		r = &KubernetesCloudCostConnector{}
	case "harness:platform/kubernetesConnector:KubernetesConnector":
		r = &KubernetesConnector{}
	case "harness:platform/manualFreeze:ManualFreeze":
		r = &ManualFreeze{}
	case "harness:platform/monitoredService:MonitoredService":
		r = &MonitoredService{}
	case "harness:platform/newrelicConnector:NewrelicConnector":
		r = &NewrelicConnector{}
	case "harness:platform/nexusConnector:NexusConnector":
		r = &NexusConnector{}
	case "harness:platform/notificationRule:NotificationRule":
		r = &NotificationRule{}
	case "harness:platform/ociHelmConnector:OciHelmConnector":
		r = &OciHelmConnector{}
	case "harness:platform/organization:Organization":
		r = &Organization{}
	case "harness:platform/pagerdutyConnector:PagerdutyConnector":
		r = &PagerdutyConnector{}
	case "harness:platform/pipeline:Pipeline":
		r = &Pipeline{}
	case "harness:platform/pipelineFilters:PipelineFilters":
		r = &PipelineFilters{}
	case "harness:platform/policy:Policy":
		r = &Policy{}
	case "harness:platform/policySet:PolicySet":
		r = &PolicySet{}
	case "harness:platform/project:Project":
		r = &Project{}
	case "harness:platform/prometheusConnector:PrometheusConnector":
		r = &PrometheusConnector{}
	case "harness:platform/repo:Repo":
		r = &Repo{}
	case "harness:platform/repoRuleBranch:RepoRuleBranch":
		r = &RepoRuleBranch{}
	case "harness:platform/repoWebhook:RepoWebhook":
		r = &RepoWebhook{}
	case "harness:platform/resourceGroup:ResourceGroup":
		r = &ResourceGroup{}
	case "harness:platform/roleAssignments:RoleAssignments":
		r = &RoleAssignments{}
	case "harness:platform/roles:Roles":
		r = &Roles{}
	case "harness:platform/secretFile:SecretFile":
		r = &SecretFile{}
	case "harness:platform/secretSshkey:SecretSshkey":
		r = &SecretSshkey{}
	case "harness:platform/secretText:SecretText":
		r = &SecretText{}
	case "harness:platform/service:Service":
		r = &Service{}
	case "harness:platform/serviceAccount:ServiceAccount":
		r = &ServiceAccount{}
	case "harness:platform/serviceNowConnector:ServiceNowConnector":
		r = &ServiceNowConnector{}
	case "harness:platform/serviceOverridesV2:ServiceOverridesV2":
		r = &ServiceOverridesV2{}
	case "harness:platform/slo:Slo":
		r = &Slo{}
	case "harness:platform/splunkConnector:SplunkConnector":
		r = &SplunkConnector{}
	case "harness:platform/spotConnector:SpotConnector":
		r = &SpotConnector{}
	case "harness:platform/sumologicConnector:SumologicConnector":
		r = &SumologicConnector{}
	case "harness:platform/tasConnector:TasConnector":
		r = &TasConnector{}
	case "harness:platform/template:Template":
		r = &Template{}
	case "harness:platform/templateFilters:TemplateFilters":
		r = &TemplateFilters{}
	case "harness:platform/terraformCloudConnector:TerraformCloudConnector":
		r = &TerraformCloudConnector{}
	case "harness:platform/token:Token":
		r = &Token{}
	case "harness:platform/triggers:Triggers":
		r = &Triggers{}
	case "harness:platform/user:User":
		r = &User{}
	case "harness:platform/usergroup:Usergroup":
		r = &Usergroup{}
	case "harness:platform/variables:Variables":
		r = &Variables{}
	case "harness:platform/vaultConnector:VaultConnector":
		r = &VaultConnector{}
	case "harness:platform/workspace:Workspace":
		r = &Workspace{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"harness",
		"platform/appDynamicsConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/artifactoryConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/awsCCConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/awsConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/awsKmsConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/awsSecretManagerConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/azureCloudCostConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/azureCloudProviderConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/azureKeyVaultConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/bitbucketConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/connectorCustomSecretManager",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/connectorCustomhealthsource",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/connectorJdbc",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/connectorPdc",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/connectorRancher",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/datadogConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/dbInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/dbSchema",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/delegatetoken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/dockerConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/dynatraceConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/elasticsearchConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/environment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/environmentClustersMapping",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/environmentGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/environmentServiceOverrides",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/featureFlag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/featureFlagApiKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/featureFlagTarget",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/featureFlagTargetGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/fileStoreFile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/fileStoreFolder",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/filters",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gcpCloudCostConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gcpConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gcpSecretManagerConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitOpsAgent",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitOpsApplications",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitOpsCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitOpsGnupg",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitOpsRepoCert",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitOpsRepoCred",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitOpsRepository",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/githubConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitlabConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitopsAppProject",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/gitopsAppProjectMapping",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/helmConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/iacmDefaultPipeline",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/infrastructure",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/inputSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/jenkinsConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/jiraConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/kubernetesCloudCostConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/kubernetesConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/manualFreeze",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/monitoredService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/newrelicConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/nexusConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/notificationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/ociHelmConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/organization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/pagerdutyConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/pipeline",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/pipelineFilters",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/policy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/policySet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/project",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/prometheusConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/repo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/repoRuleBranch",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/repoWebhook",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/resourceGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/roleAssignments",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/roles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/secretFile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/secretSshkey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/secretText",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/service",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/serviceAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/serviceNowConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/serviceOverridesV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/slo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/splunkConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/spotConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/sumologicConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/tasConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/template",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/templateFilters",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/terraformCloudConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/token",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/triggers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/usergroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/variables",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/vaultConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"platform/workspace",
		&module{version},
	)
}
