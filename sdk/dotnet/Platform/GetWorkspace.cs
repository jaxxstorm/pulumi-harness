// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetWorkspace
    {
        /// <summary>
        /// Data source for retrieving workspaces.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetWorkspace.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetWorkspaceResult> InvokeAsync(GetWorkspaceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWorkspaceResult>("harness:platform/getWorkspace:getWorkspace", args ?? new GetWorkspaceArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving workspaces.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetWorkspace.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWorkspaceResult> Invoke(GetWorkspaceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWorkspaceResult>("harness:platform/getWorkspace:getWorkspace", args ?? new GetWorkspaceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving workspaces.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetWorkspace.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWorkspaceResult> Invoke(GetWorkspaceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWorkspaceResult>("harness:platform/getWorkspace:getWorkspace", args ?? new GetWorkspaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWorkspaceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Description of the Workspace
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        [Input("environmentVariables")]
        private List<Inputs.GetWorkspaceEnvironmentVariableArgs>? _environmentVariables;

        /// <summary>
        /// Environment variables configured on the workspace
        /// </summary>
        public List<Inputs.GetWorkspaceEnvironmentVariableArgs> EnvironmentVariables
        {
            get => _environmentVariables ?? (_environmentVariables = new List<Inputs.GetWorkspaceEnvironmentVariableArgs>());
            set => _environmentVariables = value;
        }

        /// <summary>
        /// Identifier of the Workspace
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Repository Branch in which the code should be accessed
        /// </summary>
        [Input("repositoryBranch")]
        public string? RepositoryBranch { get; set; }

        /// <summary>
        /// Repository Tag in which the code should be accessed
        /// </summary>
        [Input("repositoryCommit")]
        public string? RepositoryCommit { get; set; }

        /// <summary>
        /// Repository SHA in which the code should be accessed
        /// </summary>
        [Input("repositorySha")]
        public string? RepositorySha { get; set; }

        [Input("terraformVariableFiles")]
        private List<Inputs.GetWorkspaceTerraformVariableFileArgs>? _terraformVariableFiles;
        public List<Inputs.GetWorkspaceTerraformVariableFileArgs> TerraformVariableFiles
        {
            get => _terraformVariableFiles ?? (_terraformVariableFiles = new List<Inputs.GetWorkspaceTerraformVariableFileArgs>());
            set => _terraformVariableFiles = value;
        }

        [Input("terraformVariables")]
        private List<Inputs.GetWorkspaceTerraformVariableArgs>? _terraformVariables;
        public List<Inputs.GetWorkspaceTerraformVariableArgs> TerraformVariables
        {
            get => _terraformVariables ?? (_terraformVariables = new List<Inputs.GetWorkspaceTerraformVariableArgs>());
            set => _terraformVariables = value;
        }

        public GetWorkspaceArgs()
        {
        }
        public static new GetWorkspaceArgs Empty => new GetWorkspaceArgs();
    }

    public sealed class GetWorkspaceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Description of the Workspace
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("environmentVariables")]
        private InputList<Inputs.GetWorkspaceEnvironmentVariableInputArgs>? _environmentVariables;

        /// <summary>
        /// Environment variables configured on the workspace
        /// </summary>
        public InputList<Inputs.GetWorkspaceEnvironmentVariableInputArgs> EnvironmentVariables
        {
            get => _environmentVariables ?? (_environmentVariables = new InputList<Inputs.GetWorkspaceEnvironmentVariableInputArgs>());
            set => _environmentVariables = value;
        }

        /// <summary>
        /// Identifier of the Workspace
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Repository Branch in which the code should be accessed
        /// </summary>
        [Input("repositoryBranch")]
        public Input<string>? RepositoryBranch { get; set; }

        /// <summary>
        /// Repository Tag in which the code should be accessed
        /// </summary>
        [Input("repositoryCommit")]
        public Input<string>? RepositoryCommit { get; set; }

        /// <summary>
        /// Repository SHA in which the code should be accessed
        /// </summary>
        [Input("repositorySha")]
        public Input<string>? RepositorySha { get; set; }

        [Input("terraformVariableFiles")]
        private InputList<Inputs.GetWorkspaceTerraformVariableFileInputArgs>? _terraformVariableFiles;
        public InputList<Inputs.GetWorkspaceTerraformVariableFileInputArgs> TerraformVariableFiles
        {
            get => _terraformVariableFiles ?? (_terraformVariableFiles = new InputList<Inputs.GetWorkspaceTerraformVariableFileInputArgs>());
            set => _terraformVariableFiles = value;
        }

        [Input("terraformVariables")]
        private InputList<Inputs.GetWorkspaceTerraformVariableInputArgs>? _terraformVariables;
        public InputList<Inputs.GetWorkspaceTerraformVariableInputArgs> TerraformVariables
        {
            get => _terraformVariables ?? (_terraformVariables = new InputList<Inputs.GetWorkspaceTerraformVariableInputArgs>());
            set => _terraformVariables = value;
        }

        public GetWorkspaceInvokeArgs()
        {
        }
        public static new GetWorkspaceInvokeArgs Empty => new GetWorkspaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetWorkspaceResult
    {
        /// <summary>
        /// If enabled cost estimation operations will be performed in this workspace
        /// </summary>
        public readonly bool CostEstimationEnabled;
        public readonly ImmutableDictionary<string, string> DefaultPipelines;
        /// <summary>
        /// Description of the Workspace
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Environment variables configured on the workspace
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWorkspaceEnvironmentVariableResult> EnvironmentVariables;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the Workspace
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Name of the Workspace
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Organization Identifier
        /// </summary>
        public readonly string OrgId;
        /// <summary>
        /// Project Identifier
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Provider Connector is the reference to the connector for the infrastructure provider
        /// </summary>
        public readonly string ProviderConnector;
        /// <summary>
        /// Provisioner type defines the provisioning tool to use.
        /// </summary>
        public readonly string ProvisionerType;
        /// <summary>
        /// Provisioner Version defines the tool version to use
        /// </summary>
        public readonly string ProvisionerVersion;
        /// <summary>
        /// Repository is the name of the repository to use
        /// </summary>
        public readonly string Repository;
        /// <summary>
        /// Repository Branch in which the code should be accessed
        /// </summary>
        public readonly string RepositoryBranch;
        /// <summary>
        /// Repository Tag in which the code should be accessed
        /// </summary>
        public readonly string RepositoryCommit;
        /// <summary>
        /// Repository Connector is the reference to the connector to use for this code
        /// </summary>
        public readonly string RepositoryConnector;
        /// <summary>
        /// Repository Path is the path in which the infra code resides
        /// </summary>
        public readonly string RepositoryPath;
        /// <summary>
        /// Repository SHA in which the code should be accessed
        /// </summary>
        public readonly string RepositorySha;
        public readonly ImmutableArray<Outputs.GetWorkspaceTerraformVariableFileResult> TerraformVariableFiles;
        public readonly ImmutableArray<Outputs.GetWorkspaceTerraformVariableResult> TerraformVariables;

        [OutputConstructor]
        private GetWorkspaceResult(
            bool costEstimationEnabled,

            ImmutableDictionary<string, string> defaultPipelines,

            string description,

            ImmutableArray<Outputs.GetWorkspaceEnvironmentVariableResult> environmentVariables,

            string id,

            string identifier,

            string name,

            string orgId,

            string projectId,

            string providerConnector,

            string provisionerType,

            string provisionerVersion,

            string repository,

            string repositoryBranch,

            string repositoryCommit,

            string repositoryConnector,

            string repositoryPath,

            string repositorySha,

            ImmutableArray<Outputs.GetWorkspaceTerraformVariableFileResult> terraformVariableFiles,

            ImmutableArray<Outputs.GetWorkspaceTerraformVariableResult> terraformVariables)
        {
            CostEstimationEnabled = costEstimationEnabled;
            DefaultPipelines = defaultPipelines;
            Description = description;
            EnvironmentVariables = environmentVariables;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            ProviderConnector = providerConnector;
            ProvisionerType = provisionerType;
            ProvisionerVersion = provisionerVersion;
            Repository = repository;
            RepositoryBranch = repositoryBranch;
            RepositoryCommit = repositoryCommit;
            RepositoryConnector = repositoryConnector;
            RepositoryPath = repositoryPath;
            RepositorySha = repositorySha;
            TerraformVariableFiles = terraformVariableFiles;
            TerraformVariables = terraformVariables;
        }
    }
}
