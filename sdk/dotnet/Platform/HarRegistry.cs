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
    /// Resource for create, update, list registry
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
    ///     var test = new Harness.Platform.HarRegistry("test", new()
    ///     {
    ///         Identifier = "test_registry",
    ///         SpaceRef = "accountId/orgId/projectId",
    ///         PackageType = "DOCKER",
    ///         Configs = new[]
    ///         {
    ///             new Harness.Platform.Inputs.HarRegistryConfigArgs
    ///             {
    ///                 Type = "VIRTUAL",
    ///             },
    ///         },
    ///         ParentRef = "accountId/orgId/projectId",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/harRegistry:HarRegistry")]
    public partial class HarRegistry : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Allowed pattern for the registry
        /// </summary>
        [Output("allowedPatterns")]
        public Output<ImmutableArray<string>> AllowedPatterns { get; private set; } = null!;

        /// <summary>
        /// Blocked pattern for the registry
        /// </summary>
        [Output("blockedPatterns")]
        public Output<ImmutableArray<string>> BlockedPatterns { get; private set; } = null!;

        /// <summary>
        /// Type of registry.
        /// </summary>
        [Output("configs")]
        public Output<ImmutableArray<Outputs.HarRegistryConfig>> Configs { get; private set; } = null!;

        /// <summary>
        /// Timestamp when the registry was created
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Description of the registry
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Type of package (DOCKER, MAVEN, etc.)
        /// </summary>
        [Output("packageType")]
        public Output<string> PackageType { get; private set; } = null!;

        /// <summary>
        /// Parent Reference of the registry.
        /// </summary>
        [Output("parentRef")]
        public Output<string?> ParentRef { get; private set; } = null!;

        /// <summary>
        /// Reference of the space.
        /// </summary>
        [Output("spaceRef")]
        public Output<string?> SpaceRef { get; private set; } = null!;

        /// <summary>
        /// URL of the registry
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a HarRegistry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HarRegistry(string name, HarRegistryArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/harRegistry:HarRegistry", name, args ?? new HarRegistryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HarRegistry(string name, Input<string> id, HarRegistryState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/harRegistry:HarRegistry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HarRegistry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HarRegistry Get(string name, Input<string> id, HarRegistryState? state = null, CustomResourceOptions? options = null)
        {
            return new HarRegistry(name, id, state, options);
        }
    }

    public sealed class HarRegistryArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedPatterns")]
        private InputList<string>? _allowedPatterns;

        /// <summary>
        /// Allowed pattern for the registry
        /// </summary>
        public InputList<string> AllowedPatterns
        {
            get => _allowedPatterns ?? (_allowedPatterns = new InputList<string>());
            set => _allowedPatterns = value;
        }

        [Input("blockedPatterns")]
        private InputList<string>? _blockedPatterns;

        /// <summary>
        /// Blocked pattern for the registry
        /// </summary>
        public InputList<string> BlockedPatterns
        {
            get => _blockedPatterns ?? (_blockedPatterns = new InputList<string>());
            set => _blockedPatterns = value;
        }

        [Input("configs")]
        private InputList<Inputs.HarRegistryConfigArgs>? _configs;

        /// <summary>
        /// Type of registry.
        /// </summary>
        public InputList<Inputs.HarRegistryConfigArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.HarRegistryConfigArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// Description of the registry
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Type of package (DOCKER, MAVEN, etc.)
        /// </summary>
        [Input("packageType", required: true)]
        public Input<string> PackageType { get; set; } = null!;

        /// <summary>
        /// Parent Reference of the registry.
        /// </summary>
        [Input("parentRef")]
        public Input<string>? ParentRef { get; set; }

        /// <summary>
        /// Reference of the space.
        /// </summary>
        [Input("spaceRef")]
        public Input<string>? SpaceRef { get; set; }

        public HarRegistryArgs()
        {
        }
        public static new HarRegistryArgs Empty => new HarRegistryArgs();
    }

    public sealed class HarRegistryState : global::Pulumi.ResourceArgs
    {
        [Input("allowedPatterns")]
        private InputList<string>? _allowedPatterns;

        /// <summary>
        /// Allowed pattern for the registry
        /// </summary>
        public InputList<string> AllowedPatterns
        {
            get => _allowedPatterns ?? (_allowedPatterns = new InputList<string>());
            set => _allowedPatterns = value;
        }

        [Input("blockedPatterns")]
        private InputList<string>? _blockedPatterns;

        /// <summary>
        /// Blocked pattern for the registry
        /// </summary>
        public InputList<string> BlockedPatterns
        {
            get => _blockedPatterns ?? (_blockedPatterns = new InputList<string>());
            set => _blockedPatterns = value;
        }

        [Input("configs")]
        private InputList<Inputs.HarRegistryConfigGetArgs>? _configs;

        /// <summary>
        /// Type of registry.
        /// </summary>
        public InputList<Inputs.HarRegistryConfigGetArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.HarRegistryConfigGetArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// Timestamp when the registry was created
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Description of the registry
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Type of package (DOCKER, MAVEN, etc.)
        /// </summary>
        [Input("packageType")]
        public Input<string>? PackageType { get; set; }

        /// <summary>
        /// Parent Reference of the registry.
        /// </summary>
        [Input("parentRef")]
        public Input<string>? ParentRef { get; set; }

        /// <summary>
        /// Reference of the space.
        /// </summary>
        [Input("spaceRef")]
        public Input<string>? SpaceRef { get; set; }

        /// <summary>
        /// URL of the registry
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public HarRegistryState()
        {
        }
        public static new HarRegistryState Empty => new HarRegistryState();
    }
}
