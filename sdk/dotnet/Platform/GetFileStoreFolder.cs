// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetFileStoreFolder
    {
        /// <summary>
        /// Data source for retrieving folders.
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
        ///     var example = Harness.Platform.GetFileStoreFolder.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFileStoreFolderResult> InvokeAsync(GetFileStoreFolderArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFileStoreFolderResult>("harness:platform/getFileStoreFolder:getFileStoreFolder", args ?? new GetFileStoreFolderArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving folders.
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
        ///     var example = Harness.Platform.GetFileStoreFolder.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFileStoreFolderResult> Invoke(GetFileStoreFolderInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFileStoreFolderResult>("harness:platform/getFileStoreFolder:getFileStoreFolder", args ?? new GetFileStoreFolderInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving folders.
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
        ///     var example = Harness.Platform.GetFileStoreFolder.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFileStoreFolderResult> Invoke(GetFileStoreFolderInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFileStoreFolderResult>("harness:platform/getFileStoreFolder:getFileStoreFolder", args ?? new GetFileStoreFolderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFileStoreFolderArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

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

        public GetFileStoreFolderArgs()
        {
        }
        public static new GetFileStoreFolderArgs Empty => new GetFileStoreFolderArgs();
    }

    public sealed class GetFileStoreFolderInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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

        public GetFileStoreFolderInvokeArgs()
        {
        }
        public static new GetFileStoreFolderInvokeArgs Empty => new GetFileStoreFolderInvokeArgs();
    }


    [OutputType]
    public sealed class GetFileStoreFolderResult
    {
        /// <summary>
        /// Created by
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFileStoreFolderCreatedByResult> CreatedBies;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Last modified at
        /// </summary>
        public readonly int LastModifiedAt;
        /// <summary>
        /// Last modified by
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFileStoreFolderLastModifiedByResult> LastModifiedBies;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Folder parent identifier on Harness File Store
        /// </summary>
        public readonly string ParentIdentifier;
        /// <summary>
        /// Harness File Store folder path
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetFileStoreFolderResult(
            ImmutableArray<Outputs.GetFileStoreFolderCreatedByResult> createdBies,

            string description,

            string id,

            string identifier,

            int lastModifiedAt,

            ImmutableArray<Outputs.GetFileStoreFolderLastModifiedByResult> lastModifiedBies,

            string? name,

            string? orgId,

            string parentIdentifier,

            string path,

            string? projectId,

            ImmutableArray<string> tags)
        {
            CreatedBies = createdBies;
            Description = description;
            Id = id;
            Identifier = identifier;
            LastModifiedAt = lastModifiedAt;
            LastModifiedBies = lastModifiedBies;
            Name = name;
            OrgId = orgId;
            ParentIdentifier = parentIdentifier;
            Path = path;
            ProjectId = projectId;
            Tags = tags;
        }
    }
}
