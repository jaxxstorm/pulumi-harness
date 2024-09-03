// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetProjectList
    {
        /// <summary>
        /// Data source for retrieving Harness project list.
        /// 
        /// ## Example Usage
        /// 
        /// ### Org level Project list
        /// 
        /// ### Without the Pagination
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetProjectList.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### With Pagination Logic
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetProjectList.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///         Page = 1,
        ///         Limit = 4,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetProjectListResult> InvokeAsync(GetProjectListArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectListResult>("harness:platform/getProjectList:getProjectList", args ?? new GetProjectListArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving Harness project list.
        /// 
        /// ## Example Usage
        /// 
        /// ### Org level Project list
        /// 
        /// ### Without the Pagination
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetProjectList.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### With Pagination Logic
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetProjectList.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///         Page = 1,
        ///         Limit = 4,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetProjectListResult> Invoke(GetProjectListInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectListResult>("harness:platform/getProjectList:getProjectList", args ?? new GetProjectListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectListArgs : global::Pulumi.InvokeArgs
    {
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
        /// </summary>
        [Input("limit")]
        public int? Limit { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// Optional pagination parameter indicating the page number when retrieving entities.
        /// </summary>
        [Input("page")]
        public int? Page { get; set; }

        public GetProjectListArgs()
        {
        }
        public static new GetProjectListArgs Empty => new GetProjectListArgs();
    }

    public sealed class GetProjectListInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Optional pagination parameter indicating the page number when retrieving entities.
        /// </summary>
        [Input("page")]
        public Input<int>? Page { get; set; }

        public GetProjectListInvokeArgs()
        {
        }
        public static new GetProjectListInvokeArgs Empty => new GetProjectListInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectListResult
    {
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Identifier;
        /// <summary>
        /// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
        /// </summary>
        public readonly int? Limit;
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string OrgId;
        /// <summary>
        /// Optional pagination parameter indicating the page number when retrieving entities.
        /// </summary>
        public readonly int? Page;
        /// <summary>
        /// Containing list of all projects with details identifier and name.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectListProjectResult> Projects;
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetProjectListResult(
            string description,

            string id,

            string? identifier,

            int? limit,

            string? name,

            string orgId,

            int? page,

            ImmutableArray<Outputs.GetProjectListProjectResult> projects,

            ImmutableArray<string> tags)
        {
            Description = description;
            Id = id;
            Identifier = identifier;
            Limit = limit;
            Name = name;
            OrgId = orgId;
            Page = page;
            Projects = projects;
            Tags = tags;
        }
    }
}
