// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    /// <summary>
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
    ///     var test = new Harness.Platform.Filters("test", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Type = "Connector",
    ///         FilterProperties = new Harness.Platform.Inputs.FiltersFilterPropertiesArgs
    ///         {
    ///             Tags = new[]
    ///             {
    ///                 "foo:bar",
    ///             },
    ///             FilterType = "Connector",
    ///         },
    ///         FilterVisibility = "EveryOne",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/filters:Filters example &lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// 
    /// Import org level filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/filters:Filters example &lt;ord_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// 
    /// Import project level filter
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/filters:Filters example &lt;org_id&gt;/&lt;project_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/filters:Filters")]
    public partial class Filters : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Properties of the filter entity defined in Harness.
        /// </summary>
        [Output("filterProperties")]
        public Output<Outputs.FiltersFilterProperties> FilterProperties { get; private set; } = null!;

        /// <summary>
        /// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
        /// </summary>
        [Output("filterVisibility")]
        public Output<string> FilterVisibility { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the Filter
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// organization Identifier for the Entity
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// project Identifier for the Entity
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Filters resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Filters(string name, FiltersArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/filters:Filters", name, args ?? new FiltersArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Filters(string name, Input<string> id, FiltersState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/filters:Filters", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Filters resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Filters Get(string name, Input<string> id, FiltersState? state = null, CustomResourceOptions? options = null)
        {
            return new Filters(name, id, state, options);
        }
    }

    public sealed class FiltersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Properties of the filter entity defined in Harness.
        /// </summary>
        [Input("filterProperties", required: true)]
        public Input<Inputs.FiltersFilterPropertiesArgs> FilterProperties { get; set; } = null!;

        /// <summary>
        /// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
        /// </summary>
        [Input("filterVisibility")]
        public Input<string>? FilterVisibility { get; set; }

        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the Filter
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// organization Identifier for the Entity
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// project Identifier for the Entity
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FiltersArgs()
        {
        }
        public static new FiltersArgs Empty => new FiltersArgs();
    }

    public sealed class FiltersState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Properties of the filter entity defined in Harness.
        /// </summary>
        [Input("filterProperties")]
        public Input<Inputs.FiltersFilterPropertiesGetArgs>? FilterProperties { get; set; }

        /// <summary>
        /// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
        /// </summary>
        [Input("filterVisibility")]
        public Input<string>? FilterVisibility { get; set; }

        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the Filter
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// organization Identifier for the Entity
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// project Identifier for the Entity
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public FiltersState()
        {
        }
        public static new FiltersState Empty => new FiltersState();
    }
}
