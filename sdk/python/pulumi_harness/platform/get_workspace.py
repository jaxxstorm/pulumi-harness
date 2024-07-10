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

__all__ = [
    'GetWorkspaceResult',
    'AwaitableGetWorkspaceResult',
    'get_workspace',
    'get_workspace_output',
]

@pulumi.output_type
class GetWorkspaceResult:
    """
    A collection of values returned by getWorkspace.
    """
    def __init__(__self__, cost_estimation_enabled=None, default_pipelines=None, description=None, environment_variables=None, id=None, identifier=None, name=None, org_id=None, project_id=None, provider_connector=None, provisioner_type=None, provisioner_version=None, repository=None, repository_branch=None, repository_commit=None, repository_connector=None, repository_path=None, terraform_variable_files=None, terraform_variables=None):
        if cost_estimation_enabled and not isinstance(cost_estimation_enabled, bool):
            raise TypeError("Expected argument 'cost_estimation_enabled' to be a bool")
        pulumi.set(__self__, "cost_estimation_enabled", cost_estimation_enabled)
        if default_pipelines and not isinstance(default_pipelines, dict):
            raise TypeError("Expected argument 'default_pipelines' to be a dict")
        pulumi.set(__self__, "default_pipelines", default_pipelines)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if environment_variables and not isinstance(environment_variables, list):
            raise TypeError("Expected argument 'environment_variables' to be a list")
        pulumi.set(__self__, "environment_variables", environment_variables)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if provider_connector and not isinstance(provider_connector, str):
            raise TypeError("Expected argument 'provider_connector' to be a str")
        pulumi.set(__self__, "provider_connector", provider_connector)
        if provisioner_type and not isinstance(provisioner_type, str):
            raise TypeError("Expected argument 'provisioner_type' to be a str")
        pulumi.set(__self__, "provisioner_type", provisioner_type)
        if provisioner_version and not isinstance(provisioner_version, str):
            raise TypeError("Expected argument 'provisioner_version' to be a str")
        pulumi.set(__self__, "provisioner_version", provisioner_version)
        if repository and not isinstance(repository, str):
            raise TypeError("Expected argument 'repository' to be a str")
        pulumi.set(__self__, "repository", repository)
        if repository_branch and not isinstance(repository_branch, str):
            raise TypeError("Expected argument 'repository_branch' to be a str")
        pulumi.set(__self__, "repository_branch", repository_branch)
        if repository_commit and not isinstance(repository_commit, str):
            raise TypeError("Expected argument 'repository_commit' to be a str")
        pulumi.set(__self__, "repository_commit", repository_commit)
        if repository_connector and not isinstance(repository_connector, str):
            raise TypeError("Expected argument 'repository_connector' to be a str")
        pulumi.set(__self__, "repository_connector", repository_connector)
        if repository_path and not isinstance(repository_path, str):
            raise TypeError("Expected argument 'repository_path' to be a str")
        pulumi.set(__self__, "repository_path", repository_path)
        if terraform_variable_files and not isinstance(terraform_variable_files, list):
            raise TypeError("Expected argument 'terraform_variable_files' to be a list")
        pulumi.set(__self__, "terraform_variable_files", terraform_variable_files)
        if terraform_variables and not isinstance(terraform_variables, list):
            raise TypeError("Expected argument 'terraform_variables' to be a list")
        pulumi.set(__self__, "terraform_variables", terraform_variables)

    @property
    @pulumi.getter(name="costEstimationEnabled")
    def cost_estimation_enabled(self) -> bool:
        """
        If enabled cost estimation operations will be performed in this workspace
        """
        return pulumi.get(self, "cost_estimation_enabled")

    @property
    @pulumi.getter(name="defaultPipelines")
    def default_pipelines(self) -> Mapping[str, Any]:
        return pulumi.get(self, "default_pipelines")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the Workspace
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="environmentVariables")
    def environment_variables(self) -> Sequence['outputs.GetWorkspaceEnvironmentVariableResult']:
        """
        Environment variables configured on the workspace
        """
        return pulumi.get(self, "environment_variables")

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
        Identifier of the Workspace
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the Workspace
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        """
        Organization Identifier
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerConnector")
    def provider_connector(self) -> str:
        """
        Provider Connector is the reference to the connector for the infrastructure provider
        """
        return pulumi.get(self, "provider_connector")

    @property
    @pulumi.getter(name="provisionerType")
    def provisioner_type(self) -> str:
        """
        Provisioner type defines the provisioning tool to use.
        """
        return pulumi.get(self, "provisioner_type")

    @property
    @pulumi.getter(name="provisionerVersion")
    def provisioner_version(self) -> str:
        """
        Provisioner Version defines the tool version to use
        """
        return pulumi.get(self, "provisioner_version")

    @property
    @pulumi.getter
    def repository(self) -> str:
        """
        Repository is the name of the repository to use
        """
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter(name="repositoryBranch")
    def repository_branch(self) -> str:
        """
        Repository Branch in which the code should be accessed
        """
        return pulumi.get(self, "repository_branch")

    @property
    @pulumi.getter(name="repositoryCommit")
    def repository_commit(self) -> str:
        """
        Repository Commit/Tag in which the code should be accessed
        """
        return pulumi.get(self, "repository_commit")

    @property
    @pulumi.getter(name="repositoryConnector")
    def repository_connector(self) -> str:
        """
        Repository Connector is the reference to the connector to use for this code
        """
        return pulumi.get(self, "repository_connector")

    @property
    @pulumi.getter(name="repositoryPath")
    def repository_path(self) -> str:
        """
        Repository Path is the path in which the infra code resides
        """
        return pulumi.get(self, "repository_path")

    @property
    @pulumi.getter(name="terraformVariableFiles")
    def terraform_variable_files(self) -> Sequence['outputs.GetWorkspaceTerraformVariableFileResult']:
        return pulumi.get(self, "terraform_variable_files")

    @property
    @pulumi.getter(name="terraformVariables")
    def terraform_variables(self) -> Sequence['outputs.GetWorkspaceTerraformVariableResult']:
        return pulumi.get(self, "terraform_variables")


class AwaitableGetWorkspaceResult(GetWorkspaceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWorkspaceResult(
            cost_estimation_enabled=self.cost_estimation_enabled,
            default_pipelines=self.default_pipelines,
            description=self.description,
            environment_variables=self.environment_variables,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            provider_connector=self.provider_connector,
            provisioner_type=self.provisioner_type,
            provisioner_version=self.provisioner_version,
            repository=self.repository,
            repository_branch=self.repository_branch,
            repository_commit=self.repository_commit,
            repository_connector=self.repository_connector,
            repository_path=self.repository_path,
            terraform_variable_files=self.terraform_variable_files,
            terraform_variables=self.terraform_variables)


def get_workspace(description: Optional[str] = None,
                  environment_variables: Optional[Sequence[pulumi.InputType['GetWorkspaceEnvironmentVariableArgs']]] = None,
                  identifier: Optional[str] = None,
                  org_id: Optional[str] = None,
                  project_id: Optional[str] = None,
                  repository_branch: Optional[str] = None,
                  repository_commit: Optional[str] = None,
                  terraform_variable_files: Optional[Sequence[pulumi.InputType['GetWorkspaceTerraformVariableFileArgs']]] = None,
                  terraform_variables: Optional[Sequence[pulumi.InputType['GetWorkspaceTerraformVariableArgs']]] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWorkspaceResult:
    """
    Data source for retrieving workspaces.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_workspace(identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str description: Description of the Workspace
    :param Sequence[pulumi.InputType['GetWorkspaceEnvironmentVariableArgs']] environment_variables: Environment variables configured on the workspace
    :param str identifier: Identifier of the Workspace
    :param str org_id: Organization Identifier
    :param str project_id: Project Identifier
    :param str repository_branch: Repository Branch in which the code should be accessed
    :param str repository_commit: Repository Commit/Tag in which the code should be accessed
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['environmentVariables'] = environment_variables
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['repositoryBranch'] = repository_branch
    __args__['repositoryCommit'] = repository_commit
    __args__['terraformVariableFiles'] = terraform_variable_files
    __args__['terraformVariables'] = terraform_variables
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getWorkspace:getWorkspace', __args__, opts=opts, typ=GetWorkspaceResult).value

    return AwaitableGetWorkspaceResult(
        cost_estimation_enabled=pulumi.get(__ret__, 'cost_estimation_enabled'),
        default_pipelines=pulumi.get(__ret__, 'default_pipelines'),
        description=pulumi.get(__ret__, 'description'),
        environment_variables=pulumi.get(__ret__, 'environment_variables'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        provider_connector=pulumi.get(__ret__, 'provider_connector'),
        provisioner_type=pulumi.get(__ret__, 'provisioner_type'),
        provisioner_version=pulumi.get(__ret__, 'provisioner_version'),
        repository=pulumi.get(__ret__, 'repository'),
        repository_branch=pulumi.get(__ret__, 'repository_branch'),
        repository_commit=pulumi.get(__ret__, 'repository_commit'),
        repository_connector=pulumi.get(__ret__, 'repository_connector'),
        repository_path=pulumi.get(__ret__, 'repository_path'),
        terraform_variable_files=pulumi.get(__ret__, 'terraform_variable_files'),
        terraform_variables=pulumi.get(__ret__, 'terraform_variables'))


@_utilities.lift_output_func(get_workspace)
def get_workspace_output(description: Optional[pulumi.Input[Optional[str]]] = None,
                         environment_variables: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetWorkspaceEnvironmentVariableArgs']]]]] = None,
                         identifier: Optional[pulumi.Input[str]] = None,
                         org_id: Optional[pulumi.Input[str]] = None,
                         project_id: Optional[pulumi.Input[str]] = None,
                         repository_branch: Optional[pulumi.Input[Optional[str]]] = None,
                         repository_commit: Optional[pulumi.Input[Optional[str]]] = None,
                         terraform_variable_files: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetWorkspaceTerraformVariableFileArgs']]]]] = None,
                         terraform_variables: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetWorkspaceTerraformVariableArgs']]]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWorkspaceResult]:
    """
    Data source for retrieving workspaces.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_workspace(identifier="identifier",
        org_id="org_id",
        project_id="project_id")
    ```


    :param str description: Description of the Workspace
    :param Sequence[pulumi.InputType['GetWorkspaceEnvironmentVariableArgs']] environment_variables: Environment variables configured on the workspace
    :param str identifier: Identifier of the Workspace
    :param str org_id: Organization Identifier
    :param str project_id: Project Identifier
    :param str repository_branch: Repository Branch in which the code should be accessed
    :param str repository_commit: Repository Commit/Tag in which the code should be accessed
    """
    ...
