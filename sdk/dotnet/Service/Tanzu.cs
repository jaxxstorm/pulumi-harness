// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Service
{
    /// <summary>
    /// Resource for creating a Tanzu (PCF) service. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
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
    ///     var example = new Harness.Application("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleTanzu = new Harness.Service.Tanzu("example", new()
    ///     {
    ///         AppId = example.Id,
    ///         Name = "tanzu-svc",
    ///         Description = "A service for deploying Tanzu applications.",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using the Harness application id and service id
    /// 
    /// ```sh
    /// $ pulumi import harness:service/tanzu:Tanzu example &lt;app_id&gt;/&lt;svc_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:service/tanzu:Tanzu")]
    public partial class Tanzu : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the application the service belongs to
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// Description of th service
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the service
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Variables to be used in the service
        /// </summary>
        [Output("variables")]
        public Output<ImmutableArray<Outputs.TanzuVariable>> Variables { get; private set; } = null!;


        /// <summary>
        /// Create a Tanzu resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tanzu(string name, TanzuArgs args, CustomResourceOptions? options = null)
            : base("harness:service/tanzu:Tanzu", name, args ?? new TanzuArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tanzu(string name, Input<string> id, TanzuState? state = null, CustomResourceOptions? options = null)
            : base("harness:service/tanzu:Tanzu", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Tanzu resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tanzu Get(string name, Input<string> id, TanzuState? state = null, CustomResourceOptions? options = null)
        {
            return new Tanzu(name, id, state, options);
        }
    }

    public sealed class TanzuArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the application the service belongs to
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// Description of th service
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the service
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("variables")]
        private InputList<Inputs.TanzuVariableArgs>? _variables;

        /// <summary>
        /// Variables to be used in the service
        /// </summary>
        public InputList<Inputs.TanzuVariableArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.TanzuVariableArgs>());
            set => _variables = value;
        }

        public TanzuArgs()
        {
        }
        public static new TanzuArgs Empty => new TanzuArgs();
    }

    public sealed class TanzuState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the application the service belongs to
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// Description of th service
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the service
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("variables")]
        private InputList<Inputs.TanzuVariableGetArgs>? _variables;

        /// <summary>
        /// Variables to be used in the service
        /// </summary>
        public InputList<Inputs.TanzuVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.TanzuVariableGetArgs>());
            set => _variables = value;
        }

        public TanzuState()
        {
        }
        public static new TanzuState Empty => new TanzuState();
    }
}
