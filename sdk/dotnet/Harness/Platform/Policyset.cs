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
    /// <summary>
    /// Resource for creating a Harness Policyset.
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
    ///     var test = new Harness.Platform.Policyset("test", new()
    ///     {
    ///         Action = "onrun",
    ///         Enabled = true,
    ///         Identifier = "harness_platform_policyset.test.identifier",
    ///         Policies = new[]
    ///         {
    ///             new Harness.Platform.Inputs.PolicysetPolicyArgs
    ///             {
    ///                 Identifier = "always_run",
    ///                 Severity = "warning",
    ///             },
    ///         },
    ///         Type = "pipeline",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using the organization id
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/policyset:Policyset example &lt;organization_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/policyset:Policyset")]
    public partial class Policyset : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Action for the policyset.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Enabled for the policyset.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// List of policy identifiers / severity for the policyset.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<Outputs.PolicysetPolicy>> Policies { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Type for the policyset.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Policyset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Policyset(string name, PolicysetArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/policyset:Policyset", name, args ?? new PolicysetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Policyset(string name, Input<string> id, PolicysetState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/policyset:Policyset", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Policyset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Policyset Get(string name, Input<string> id, PolicysetState? state = null, CustomResourceOptions? options = null)
        {
            return new Policyset(name, id, state, options);
        }
    }

    public sealed class PolicysetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action for the policyset.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enabled for the policyset.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

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

        [Input("policies")]
        private InputList<Inputs.PolicysetPolicyArgs>? _policies;

        /// <summary>
        /// List of policy identifiers / severity for the policyset.
        /// </summary>
        public InputList<Inputs.PolicysetPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.PolicysetPolicyArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Type for the policyset.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public PolicysetArgs()
        {
        }
        public static new PolicysetArgs Empty => new PolicysetArgs();
    }

    public sealed class PolicysetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action for the policyset.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enabled for the policyset.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

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

        [Input("policies")]
        private InputList<Inputs.PolicysetPolicyGetArgs>? _policies;

        /// <summary>
        /// List of policy identifiers / severity for the policyset.
        /// </summary>
        public InputList<Inputs.PolicysetPolicyGetArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.PolicysetPolicyGetArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Type for the policyset.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public PolicysetState()
        {
        }
        public static new PolicysetState Empty => new PolicysetState();
    }
}
