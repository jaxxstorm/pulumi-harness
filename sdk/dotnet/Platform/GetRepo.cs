// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetRepo
    {
        /// <summary>
        /// Data source for retrieving a Harness repo.
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
        ///     var exampleByIdentifier = Harness.Platform.GetRepo.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "proj_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetRepoResult> InvokeAsync(GetRepoArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRepoResult>("harness:platform/getRepo:getRepo", args ?? new GetRepoArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness repo.
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
        ///     var exampleByIdentifier = Harness.Platform.GetRepo.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "proj_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRepoResult> Invoke(GetRepoInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRepoResult>("harness:platform/getRepo:getRepo", args ?? new GetRepoInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRepoArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default branch of the repository (Applicate only for create).
        /// </summary>
        [Input("defaultBranch")]
        public string? DefaultBranch { get; set; }

        /// <summary>
        /// Description of the repository.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// Repository should be created with specified predefined gitignore file.
        /// </summary>
        [Input("gitIgnore")]
        public string? GitIgnore { get; set; }

        /// <summary>
        /// Identifier of the repository.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Repository should be created with specified predefined license file.
        /// </summary>
        [Input("license")]
        public string? License { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Repository should be created with readme file.
        /// </summary>
        [Input("readme")]
        public bool? Readme { get; set; }

        [Input("sources")]
        private List<Inputs.GetRepoSourceArgs>? _sources;

        /// <summary>
        /// Configuration for importing an existing repository from SCM provider.
        /// </summary>
        public List<Inputs.GetRepoSourceArgs> Sources
        {
            get => _sources ?? (_sources = new List<Inputs.GetRepoSourceArgs>());
            set => _sources = value;
        }

        public GetRepoArgs()
        {
        }
        public static new GetRepoArgs Empty => new GetRepoArgs();
    }

    public sealed class GetRepoInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default branch of the repository (Applicate only for create).
        /// </summary>
        [Input("defaultBranch")]
        public Input<string>? DefaultBranch { get; set; }

        /// <summary>
        /// Description of the repository.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Repository should be created with specified predefined gitignore file.
        /// </summary>
        [Input("gitIgnore")]
        public Input<string>? GitIgnore { get; set; }

        /// <summary>
        /// Identifier of the repository.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Repository should be created with specified predefined license file.
        /// </summary>
        [Input("license")]
        public Input<string>? License { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Repository should be created with readme file.
        /// </summary>
        [Input("readme")]
        public Input<bool>? Readme { get; set; }

        [Input("sources")]
        private InputList<Inputs.GetRepoSourceInputArgs>? _sources;

        /// <summary>
        /// Configuration for importing an existing repository from SCM provider.
        /// </summary>
        public InputList<Inputs.GetRepoSourceInputArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.GetRepoSourceInputArgs>());
            set => _sources = value;
        }

        public GetRepoInvokeArgs()
        {
        }
        public static new GetRepoInvokeArgs Empty => new GetRepoInvokeArgs();
    }


    [OutputType]
    public sealed class GetRepoResult
    {
        /// <summary>
        /// Timestamp when the repository was created.
        /// </summary>
        public readonly int Created;
        /// <summary>
        /// ID of the user who created the repository.
        /// </summary>
        public readonly int CreatedBy;
        /// <summary>
        /// Default branch of the repository (Applicate only for create).
        /// </summary>
        public readonly string? DefaultBranch;
        /// <summary>
        /// Description of the repository.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Repository should be created with specified predefined gitignore file.
        /// </summary>
        public readonly string? GitIgnore;
        /// <summary>
        /// Git URL of the repository.
        /// </summary>
        public readonly string GitUrl;
        /// <summary>
        /// Internal ID of the repository.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the repository.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Repository should be created with specified predefined license file.
        /// </summary>
        public readonly string? License;
        /// <summary>
        /// Name of the repository.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Path of the repository.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Repository should be created with readme file.
        /// </summary>
        public readonly bool? Readme;
        /// <summary>
        /// Configuration for importing an existing repository from SCM provider.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepoSourceResult> Sources;
        /// <summary>
        /// Timestamp when the repository was last updated.
        /// </summary>
        public readonly int Updated;

        [OutputConstructor]
        private GetRepoResult(
            int created,

            int createdBy,

            string? defaultBranch,

            string? description,

            string? gitIgnore,

            string gitUrl,

            string id,

            string identifier,

            string? license,

            string name,

            string? orgId,

            string path,

            string? projectId,

            bool? readme,

            ImmutableArray<Outputs.GetRepoSourceResult> sources,

            int updated)
        {
            Created = created;
            CreatedBy = createdBy;
            DefaultBranch = defaultBranch;
            Description = description;
            GitIgnore = gitIgnore;
            GitUrl = gitUrl;
            Id = id;
            Identifier = identifier;
            License = license;
            Name = name;
            OrgId = orgId;
            Path = path;
            ProjectId = projectId;
            Readme = readme;
            Sources = sources;
            Updated = updated;
        }
    }
}