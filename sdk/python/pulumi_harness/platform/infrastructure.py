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

__all__ = ['InfrastructureArgs', 'Infrastructure']

@pulumi.input_type
class InfrastructureArgs:
    def __init__(__self__, *,
                 env_id: pulumi.Input[str],
                 identifier: pulumi.Input[str],
                 deployment_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[str]] = None,
                 git_details: Optional[pulumi.Input['InfrastructureGitDetailsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Infrastructure resource.
        :param pulumi.Input[str] env_id: Environment Identifier.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] deployment_type: Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] force_delete: Enable this flag for force deletion of infrastructure
        :param pulumi.Input['InfrastructureGitDetailsArgs'] git_details: Contains Git Information for remote entities from Git for Create/Update/Import
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] type: Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
        :param pulumi.Input[str] yaml: Infrastructure YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
        """
        pulumi.set(__self__, "env_id", env_id)
        pulumi.set(__self__, "identifier", identifier)
        if deployment_type is not None:
            pulumi.set(__self__, "deployment_type", deployment_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if force_delete is not None:
            pulumi.set(__self__, "force_delete", force_delete)
        if git_details is not None:
            pulumi.set(__self__, "git_details", git_details)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if yaml is not None:
            pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> pulumi.Input[str]:
        """
        Environment Identifier.
        """
        return pulumi.get(self, "env_id")

    @env_id.setter
    def env_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "env_id", value)

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
    @pulumi.getter(name="deploymentType")
    def deployment_type(self) -> Optional[pulumi.Input[str]]:
        """
        Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
        """
        return pulumi.get(self, "deployment_type")

    @deployment_type.setter
    def deployment_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "deployment_type", value)

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
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> Optional[pulumi.Input[str]]:
        """
        Enable this flag for force deletion of infrastructure
        """
        return pulumi.get(self, "force_delete")

    @force_delete.setter
    def force_delete(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force_delete", value)

    @property
    @pulumi.getter(name="gitDetails")
    def git_details(self) -> Optional[pulumi.Input['InfrastructureGitDetailsArgs']]:
        """
        Contains Git Information for remote entities from Git for Create/Update/Import
        """
        return pulumi.get(self, "git_details")

    @git_details.setter
    def git_details(self, value: Optional[pulumi.Input['InfrastructureGitDetailsArgs']]):
        pulumi.set(self, "git_details", value)

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
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def yaml(self) -> Optional[pulumi.Input[str]]:
        """
        Infrastructure YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "yaml", value)


@pulumi.input_type
class _InfrastructureState:
    def __init__(__self__, *,
                 deployment_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 env_id: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[str]] = None,
                 git_details: Optional[pulumi.Input['InfrastructureGitDetailsArgs']] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Infrastructure resources.
        :param pulumi.Input[str] deployment_type: Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] env_id: Environment Identifier.
        :param pulumi.Input[str] force_delete: Enable this flag for force deletion of infrastructure
        :param pulumi.Input['InfrastructureGitDetailsArgs'] git_details: Contains Git Information for remote entities from Git for Create/Update/Import
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] type: Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
        :param pulumi.Input[str] yaml: Infrastructure YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
        """
        if deployment_type is not None:
            pulumi.set(__self__, "deployment_type", deployment_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if env_id is not None:
            pulumi.set(__self__, "env_id", env_id)
        if force_delete is not None:
            pulumi.set(__self__, "force_delete", force_delete)
        if git_details is not None:
            pulumi.set(__self__, "git_details", git_details)
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
        if type is not None:
            pulumi.set(__self__, "type", type)
        if yaml is not None:
            pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter(name="deploymentType")
    def deployment_type(self) -> Optional[pulumi.Input[str]]:
        """
        Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
        """
        return pulumi.get(self, "deployment_type")

    @deployment_type.setter
    def deployment_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "deployment_type", value)

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
    @pulumi.getter(name="envId")
    def env_id(self) -> Optional[pulumi.Input[str]]:
        """
        Environment Identifier.
        """
        return pulumi.get(self, "env_id")

    @env_id.setter
    def env_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "env_id", value)

    @property
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> Optional[pulumi.Input[str]]:
        """
        Enable this flag for force deletion of infrastructure
        """
        return pulumi.get(self, "force_delete")

    @force_delete.setter
    def force_delete(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force_delete", value)

    @property
    @pulumi.getter(name="gitDetails")
    def git_details(self) -> Optional[pulumi.Input['InfrastructureGitDetailsArgs']]:
        """
        Contains Git Information for remote entities from Git for Create/Update/Import
        """
        return pulumi.get(self, "git_details")

    @git_details.setter
    def git_details(self, value: Optional[pulumi.Input['InfrastructureGitDetailsArgs']]):
        pulumi.set(self, "git_details", value)

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
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def yaml(self) -> Optional[pulumi.Input[str]]:
        """
        Infrastructure YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "yaml", value)


class Infrastructure(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 deployment_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 env_id: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[str]] = None,
                 git_details: Optional[pulumi.Input[Union['InfrastructureGitDetailsArgs', 'InfrastructureGitDetailsArgsDict']]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating a Harness Infrastructure.

        ## Example to create Infrastructure at different levels (Org, Project, Account)

        ### Account Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.Infrastructure("example",
            identifier="identifier",
            name="name",
            env_id="environmentIdentifier",
            type="KubernetesDirect",
            deployment_type="Kubernetes",
            yaml=\"\"\"infrastructureDefinition:
         name: name
         identifier: identifier
         description: ""
         tags:
           asda: ""
         orgIdentifier: orgIdentifer
         projectIdentifier: projectIdentifier
         environmentRef: environmentIdentifier
         deploymentType: Kubernetes
         type: KubernetesDirect
         spec:
          connectorRef: account.gfgf
          namespace: asdasdsa
          releaseName: release-<+INFRA_KEY>
          allowSimultaneousDeployments: false
        \"\"\")
        ```

        ### Org Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.Infrastructure("example",
            identifier="identifier",
            name="name",
            org_id="orgIdentifer",
            env_id="environmentIdentifier",
            type="KubernetesDirect",
            deployment_type="Kubernetes",
            yaml=\"\"\"infrastructureDefinition:
         name: name
         identifier: identifier
         description: ""
         tags:
           asda: ""
         orgIdentifier: orgIdentifer
         projectIdentifier: projectIdentifier
         environmentRef: environmentIdentifier
         deploymentType: Kubernetes
         type: KubernetesDirect
         spec:
          connectorRef: account.gfgf
          namespace: asdasdsa
          releaseName: release-<+INFRA_KEY>
          allowSimultaneousDeployments: false
        \"\"\")
        ```

        ### Project Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.Infrastructure("example",
            identifier="identifier",
            name="name",
            org_id="orgIdentifer",
            project_id="projectIdentifier",
            env_id="environmentIdentifier",
            type="KubernetesDirect",
            deployment_type="Kubernetes",
            yaml=\"\"\"infrastructureDefinition:
         name: name
         identifier: identifier
         description: ""
         tags:
           asda: ""
         orgIdentifier: orgIdentifer
         projectIdentifier: projectIdentifier
         environmentRef: environmentIdentifier
         deploymentType: Kubernetes
         type: KubernetesDirect
         spec:
          connectorRef: account.gfgf
          namespace: asdasdsa
          releaseName: release-<+INFRA_KEY>
          allowSimultaneousDeployments: false
        \"\"\")
        ```

        ### Importing Infrastructure From Git
        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.platform.Infrastructure("test",
            identifier="identifier",
            name="name",
            env_id="env_id",
            git_details={
                "store_type": "REMOTE",
                "connector_ref": "connector_ref",
                "repo_name": "repo_name",
                "file_path": "file_path",
                "branch": "branch",
                "import_from_git": True,
            })
        ```

        ## Import

        Import account level infrastructure

        ```sh
        $ pulumi import harness:platform/infrastructure:Infrastructure example <env_id>/<infrastructure_id>
        ```

        Import org level infrastructure

        ```sh
        $ pulumi import harness:platform/infrastructure:Infrastructure example <org_id>/<env_id>/<infrastructure_id>
        ```

        Import project level infrastructure

        ```sh
        $ pulumi import harness:platform/infrastructure:Infrastructure example <org_id>/<project_id>/<env_id>/<infrastructure_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] deployment_type: Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] env_id: Environment Identifier.
        :param pulumi.Input[str] force_delete: Enable this flag for force deletion of infrastructure
        :param pulumi.Input[Union['InfrastructureGitDetailsArgs', 'InfrastructureGitDetailsArgsDict']] git_details: Contains Git Information for remote entities from Git for Create/Update/Import
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] type: Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
        :param pulumi.Input[str] yaml: Infrastructure YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InfrastructureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Harness Infrastructure.

        ## Example to create Infrastructure at different levels (Org, Project, Account)

        ### Account Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.Infrastructure("example",
            identifier="identifier",
            name="name",
            env_id="environmentIdentifier",
            type="KubernetesDirect",
            deployment_type="Kubernetes",
            yaml=\"\"\"infrastructureDefinition:
         name: name
         identifier: identifier
         description: ""
         tags:
           asda: ""
         orgIdentifier: orgIdentifer
         projectIdentifier: projectIdentifier
         environmentRef: environmentIdentifier
         deploymentType: Kubernetes
         type: KubernetesDirect
         spec:
          connectorRef: account.gfgf
          namespace: asdasdsa
          releaseName: release-<+INFRA_KEY>
          allowSimultaneousDeployments: false
        \"\"\")
        ```

        ### Org Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.Infrastructure("example",
            identifier="identifier",
            name="name",
            org_id="orgIdentifer",
            env_id="environmentIdentifier",
            type="KubernetesDirect",
            deployment_type="Kubernetes",
            yaml=\"\"\"infrastructureDefinition:
         name: name
         identifier: identifier
         description: ""
         tags:
           asda: ""
         orgIdentifier: orgIdentifer
         projectIdentifier: projectIdentifier
         environmentRef: environmentIdentifier
         deploymentType: Kubernetes
         type: KubernetesDirect
         spec:
          connectorRef: account.gfgf
          namespace: asdasdsa
          releaseName: release-<+INFRA_KEY>
          allowSimultaneousDeployments: false
        \"\"\")
        ```

        ### Project Level
        ```python
        import pulumi
        import pulumi_harness as harness

        example = harness.platform.Infrastructure("example",
            identifier="identifier",
            name="name",
            org_id="orgIdentifer",
            project_id="projectIdentifier",
            env_id="environmentIdentifier",
            type="KubernetesDirect",
            deployment_type="Kubernetes",
            yaml=\"\"\"infrastructureDefinition:
         name: name
         identifier: identifier
         description: ""
         tags:
           asda: ""
         orgIdentifier: orgIdentifer
         projectIdentifier: projectIdentifier
         environmentRef: environmentIdentifier
         deploymentType: Kubernetes
         type: KubernetesDirect
         spec:
          connectorRef: account.gfgf
          namespace: asdasdsa
          releaseName: release-<+INFRA_KEY>
          allowSimultaneousDeployments: false
        \"\"\")
        ```

        ### Importing Infrastructure From Git
        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.platform.Infrastructure("test",
            identifier="identifier",
            name="name",
            env_id="env_id",
            git_details={
                "store_type": "REMOTE",
                "connector_ref": "connector_ref",
                "repo_name": "repo_name",
                "file_path": "file_path",
                "branch": "branch",
                "import_from_git": True,
            })
        ```

        ## Import

        Import account level infrastructure

        ```sh
        $ pulumi import harness:platform/infrastructure:Infrastructure example <env_id>/<infrastructure_id>
        ```

        Import org level infrastructure

        ```sh
        $ pulumi import harness:platform/infrastructure:Infrastructure example <org_id>/<env_id>/<infrastructure_id>
        ```

        Import project level infrastructure

        ```sh
        $ pulumi import harness:platform/infrastructure:Infrastructure example <org_id>/<project_id>/<env_id>/<infrastructure_id>
        ```

        :param str resource_name: The name of the resource.
        :param InfrastructureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InfrastructureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 deployment_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 env_id: Optional[pulumi.Input[str]] = None,
                 force_delete: Optional[pulumi.Input[str]] = None,
                 git_details: Optional[pulumi.Input[Union['InfrastructureGitDetailsArgs', 'InfrastructureGitDetailsArgsDict']]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InfrastructureArgs.__new__(InfrastructureArgs)

            __props__.__dict__["deployment_type"] = deployment_type
            __props__.__dict__["description"] = description
            if env_id is None and not opts.urn:
                raise TypeError("Missing required property 'env_id'")
            __props__.__dict__["env_id"] = env_id
            __props__.__dict__["force_delete"] = force_delete
            __props__.__dict__["git_details"] = git_details
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["type"] = type
            __props__.__dict__["yaml"] = yaml
        super(Infrastructure, __self__).__init__(
            'harness:platform/infrastructure:Infrastructure',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            deployment_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            env_id: Optional[pulumi.Input[str]] = None,
            force_delete: Optional[pulumi.Input[str]] = None,
            git_details: Optional[pulumi.Input[Union['InfrastructureGitDetailsArgs', 'InfrastructureGitDetailsArgsDict']]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            yaml: Optional[pulumi.Input[str]] = None) -> 'Infrastructure':
        """
        Get an existing Infrastructure resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] deployment_type: Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] env_id: Environment Identifier.
        :param pulumi.Input[str] force_delete: Enable this flag for force deletion of infrastructure
        :param pulumi.Input[Union['InfrastructureGitDetailsArgs', 'InfrastructureGitDetailsArgsDict']] git_details: Contains Git Information for remote entities from Git for Create/Update/Import
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        :param pulumi.Input[str] type: Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
        :param pulumi.Input[str] yaml: Infrastructure YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InfrastructureState.__new__(_InfrastructureState)

        __props__.__dict__["deployment_type"] = deployment_type
        __props__.__dict__["description"] = description
        __props__.__dict__["env_id"] = env_id
        __props__.__dict__["force_delete"] = force_delete
        __props__.__dict__["git_details"] = git_details
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["type"] = type
        __props__.__dict__["yaml"] = yaml
        return Infrastructure(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deploymentType")
    def deployment_type(self) -> pulumi.Output[str]:
        """
        Infrastructure deployment type. Valid values are Kubernetes, NativeHelm, Ssh, WinRm, ServerlessAwsLambda, AzureWebApp, Custom, ECS.
        """
        return pulumi.get(self, "deployment_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> pulumi.Output[str]:
        """
        Environment Identifier.
        """
        return pulumi.get(self, "env_id")

    @property
    @pulumi.getter(name="forceDelete")
    def force_delete(self) -> pulumi.Output[str]:
        """
        Enable this flag for force deletion of infrastructure
        """
        return pulumi.get(self, "force_delete")

    @property
    @pulumi.getter(name="gitDetails")
    def git_details(self) -> pulumi.Output['outputs.InfrastructureGitDetails']:
        """
        Contains Git Information for remote entities from Git for Create/Update/Import
        """
        return pulumi.get(self, "git_details")

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
    def tags(self) -> pulumi.Output[Sequence[str]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        Type of Infrastructure. Valid values are KubernetesDirect, KubernetesGcp, ServerlessAwsLambda, Pdc, KubernetesAzure, SshWinRmAzure, SshWinRmAws, AzureWebApp, ECS, GitOps, CustomDeployment, TAS, KubernetesRancher, AWS_SAM.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def yaml(self) -> pulumi.Output[Optional[str]]:
        """
        Infrastructure YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
        """
        return pulumi.get(self, "yaml")

