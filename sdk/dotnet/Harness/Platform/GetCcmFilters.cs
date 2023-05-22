// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform
{
    public static class GetCcmFilters
    {
        /// <summary>
        /// Data source for retrieving a Harness CCM Filter.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetCcmFilters.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         Type = "CCMRecommendation",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCcmFiltersResult> InvokeAsync(GetCcmFiltersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCcmFiltersResult>("harness:platform/getCcmFilters:getCcmFilters", args ?? new GetCcmFiltersArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness CCM Filter.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetCcmFilters.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         Type = "CCMRecommendation",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCcmFiltersResult> Invoke(GetCcmFiltersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCcmFiltersResult>("harness:platform/getCcmFilters:getCcmFilters", args ?? new GetCcmFiltersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCcmFiltersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier for the Entity.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the Entity.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Type of filter.
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetCcmFiltersArgs()
        {
        }
        public static new GetCcmFiltersArgs Empty => new GetCcmFiltersArgs();
    }

    public sealed class GetCcmFiltersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier for the Entity.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the Entity.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Type of filter.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetCcmFiltersInvokeArgs()
        {
        }
        public static new GetCcmFiltersInvokeArgs Empty => new GetCcmFiltersInvokeArgs();
    }


    [OutputType]
    public sealed class GetCcmFiltersResult
    {
        /// <summary>
        /// Properties of the filter entity defined in Harness.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCcmFiltersFilterPropertyResult> FilterProperties;
        /// <summary>
        /// This indicates visibility of filter. By default, everyone can view this filter.
        /// </summary>
        public readonly string FilterVisibility;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Name of the Filter.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Organization Identifier for the Entity.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Project Identifier for the Entity.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Type of filter.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetCcmFiltersResult(
            ImmutableArray<Outputs.GetCcmFiltersFilterPropertyResult> filterProperties,

            string filterVisibility,

            string id,

            string identifier,

            string name,

            string? orgId,

            string? projectId,

            string type)
        {
            FilterProperties = filterProperties;
            FilterVisibility = filterVisibility;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Type = type;
        }
    }
}
