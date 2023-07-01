// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness
{
    /// <summary>
    /// Resource for creating a Harness CCM Filters.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Lbrlabs.PulumiPackage.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Harness.PlatformCcmFilters("test", new()
    ///     {
    ///         FilterProperties = new Harness.Inputs.PlatformCcmFiltersFilterPropertiesArgs
    ///         {
    ///             FilterType = "CCMRecommendation",
    ///             Tags = new[]
    ///             {
    ///                 "foo:bar",
    ///             },
    ///         },
    ///         FilterVisibility = "EveryOne",
    ///         Identifier = "identifier",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Type = "CCMRecommendation",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level ccm filter
    /// 
    /// ```sh
    ///  $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example &lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// 
    ///  Import org level ccm filter
    /// 
    /// ```sh
    ///  $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example &lt;ord_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// 
    ///  Import project level ccm filter
    /// 
    /// ```sh
    ///  $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example &lt;org_id&gt;/&lt;project_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:index/platformCcmFilters:PlatformCcmFilters")]
    public partial class PlatformCcmFilters : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Output("filterProperties")]
        public Output<Outputs.PlatformCcmFiltersFilterProperties> FilterProperties { get; private set; } = null!;

        /// <summary>
        /// This indicates visibility of filters. By default, everyone can view this filter..
        /// </summary>
        [Output("filterVisibility")]
        public Output<string?> FilterVisibility { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the ccm filters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Organization Identifier for the Entity.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Project Identifier for the Entity.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Type of ccm filters.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a PlatformCcmFilters resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PlatformCcmFilters(string name, PlatformCcmFiltersArgs args, CustomResourceOptions? options = null)
            : base("harness:index/platformCcmFilters:PlatformCcmFilters", name, args ?? new PlatformCcmFiltersArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PlatformCcmFilters(string name, Input<string> id, PlatformCcmFiltersState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/platformCcmFilters:PlatformCcmFilters", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PlatformCcmFilters resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PlatformCcmFilters Get(string name, Input<string> id, PlatformCcmFiltersState? state = null, CustomResourceOptions? options = null)
        {
            return new PlatformCcmFilters(name, id, state, options);
        }
    }

    public sealed class PlatformCcmFiltersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Input("filterProperties", required: true)]
        public Input<Inputs.PlatformCcmFiltersFilterPropertiesArgs> FilterProperties { get; set; } = null!;

        /// <summary>
        /// This indicates visibility of filters. By default, everyone can view this filter..
        /// </summary>
        [Input("filterVisibility")]
        public Input<string>? FilterVisibility { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the ccm filters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// Type of ccm filters.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public PlatformCcmFiltersArgs()
        {
        }
        public static new PlatformCcmFiltersArgs Empty => new PlatformCcmFiltersArgs();
    }

    public sealed class PlatformCcmFiltersState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Properties of the filters entity defined in Harness.
        /// </summary>
        [Input("filterProperties")]
        public Input<Inputs.PlatformCcmFiltersFilterPropertiesGetArgs>? FilterProperties { get; set; }

        /// <summary>
        /// This indicates visibility of filters. By default, everyone can view this filter..
        /// </summary>
        [Input("filterVisibility")]
        public Input<string>? FilterVisibility { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the ccm filters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// Type of ccm filters.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public PlatformCcmFiltersState()
        {
        }
        public static new PlatformCcmFiltersState Empty => new PlatformCcmFiltersState();
    }
}
