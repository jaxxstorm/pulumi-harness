// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetInfraModule
    {
        /// <summary>
        /// Data source for retrieving modules from the module registry.
        /// </summary>
        public static Task<GetInfraModuleResult> InvokeAsync(GetInfraModuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInfraModuleResult>("harness:platform/getInfraModule:getInfraModule", args ?? new GetInfraModuleArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving modules from the module registry.
        /// </summary>
        public static Output<GetInfraModuleResult> Invoke(GetInfraModuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInfraModuleResult>("harness:platform/getInfraModule:getInfraModule", args ?? new GetInfraModuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInfraModuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Timestamp when the module was created
        /// </summary>
        [Input("created")]
        public int? Created { get; set; }

        /// <summary>
        /// Description of the module
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// Identifier of the module
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// Name of the module
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// For account connectors, the repository where the module is stored
        /// </summary>
        [Input("repository")]
        public string? Repository { get; set; }

        /// <summary>
        /// Repository Branch in which the module should be accessed
        /// </summary>
        [Input("repositoryBranch")]
        public string? RepositoryBranch { get; set; }

        /// <summary>
        /// Repository Commit in which the module should be accessed
        /// </summary>
        [Input("repositoryCommit")]
        public string? RepositoryCommit { get; set; }

        /// <summary>
        /// Repository Connector is the reference to the connector for the repository
        /// </summary>
        [Input("repositoryConnector")]
        public string? RepositoryConnector { get; set; }

        /// <summary>
        /// Repository Path is the path in which the module resides
        /// </summary>
        [Input("repositoryPath")]
        public string? RepositoryPath { get; set; }

        /// <summary>
        /// URL where the module is stored
        /// </summary>
        [Input("repositoryUrl")]
        public string? RepositoryUrl { get; set; }

        /// <summary>
        /// Timestamp when the module was last synced
        /// </summary>
        [Input("synced")]
        public int? Synced { get; set; }

        /// <summary>
        /// Provider of the module
        /// </summary>
        [Input("system", required: true)]
        public string System { get; set; } = null!;

        /// <summary>
        /// Tags associated with the module
        /// </summary>
        [Input("tags")]
        public string? Tags { get; set; }

        public GetInfraModuleArgs()
        {
        }
        public static new GetInfraModuleArgs Empty => new GetInfraModuleArgs();
    }

    public sealed class GetInfraModuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Timestamp when the module was created
        /// </summary>
        [Input("created")]
        public Input<int>? Created { get; set; }

        /// <summary>
        /// Description of the module
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Identifier of the module
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Name of the module
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// For account connectors, the repository where the module is stored
        /// </summary>
        [Input("repository")]
        public Input<string>? Repository { get; set; }

        /// <summary>
        /// Repository Branch in which the module should be accessed
        /// </summary>
        [Input("repositoryBranch")]
        public Input<string>? RepositoryBranch { get; set; }

        /// <summary>
        /// Repository Commit in which the module should be accessed
        /// </summary>
        [Input("repositoryCommit")]
        public Input<string>? RepositoryCommit { get; set; }

        /// <summary>
        /// Repository Connector is the reference to the connector for the repository
        /// </summary>
        [Input("repositoryConnector")]
        public Input<string>? RepositoryConnector { get; set; }

        /// <summary>
        /// Repository Path is the path in which the module resides
        /// </summary>
        [Input("repositoryPath")]
        public Input<string>? RepositoryPath { get; set; }

        /// <summary>
        /// URL where the module is stored
        /// </summary>
        [Input("repositoryUrl")]
        public Input<string>? RepositoryUrl { get; set; }

        /// <summary>
        /// Timestamp when the module was last synced
        /// </summary>
        [Input("synced")]
        public Input<int>? Synced { get; set; }

        /// <summary>
        /// Provider of the module
        /// </summary>
        [Input("system", required: true)]
        public Input<string> System { get; set; } = null!;

        /// <summary>
        /// Tags associated with the module
        /// </summary>
        [Input("tags")]
        public Input<string>? Tags { get; set; }

        public GetInfraModuleInvokeArgs()
        {
        }
        public static new GetInfraModuleInvokeArgs Empty => new GetInfraModuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetInfraModuleResult
    {
        /// <summary>
        /// Timestamp when the module was created
        /// </summary>
        public readonly int Created;
        /// <summary>
        /// Description of the module
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Identifier of the module
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the module
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// For account connectors, the repository where the module is stored
        /// </summary>
        public readonly string Repository;
        /// <summary>
        /// Repository Branch in which the module should be accessed
        /// </summary>
        public readonly string RepositoryBranch;
        /// <summary>
        /// Repository Commit in which the module should be accessed
        /// </summary>
        public readonly string RepositoryCommit;
        /// <summary>
        /// Repository Connector is the reference to the connector for the repository
        /// </summary>
        public readonly string RepositoryConnector;
        /// <summary>
        /// Repository Path is the path in which the module resides
        /// </summary>
        public readonly string RepositoryPath;
        /// <summary>
        /// URL where the module is stored
        /// </summary>
        public readonly string RepositoryUrl;
        /// <summary>
        /// Timestamp when the module was last synced
        /// </summary>
        public readonly int Synced;
        /// <summary>
        /// Provider of the module
        /// </summary>
        public readonly string System;
        /// <summary>
        /// Tags associated with the module
        /// </summary>
        public readonly string Tags;

        [OutputConstructor]
        private GetInfraModuleResult(
            int created,

            string description,

            string id,

            string name,

            string repository,

            string repositoryBranch,

            string repositoryCommit,

            string repositoryConnector,

            string repositoryPath,

            string repositoryUrl,

            int synced,

            string system,

            string tags)
        {
            Created = created;
            Description = description;
            Id = id;
            Name = name;
            Repository = repository;
            RepositoryBranch = repositoryBranch;
            RepositoryCommit = repositoryCommit;
            RepositoryConnector = repositoryConnector;
            RepositoryPath = repositoryPath;
            RepositoryUrl = repositoryUrl;
            Synced = synced;
            System = system;
            Tags = tags;
        }
    }
}