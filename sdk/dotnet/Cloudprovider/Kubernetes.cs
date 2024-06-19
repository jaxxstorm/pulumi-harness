// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cloudprovider
{
    /// <summary>
    /// Resource for creating a Kubernetes cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
    /// 
    /// ## Import
    /// 
    /// Import using the Harness kubernetes cloud provider id.
    /// 
    /// ```sh
    /// $ pulumi import harness:cloudprovider/kubernetes:Kubernetes example &lt;provider_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:cloudprovider/kubernetes:Kubernetes")]
    public partial class Kubernetes : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Authentication configuration for the Kubernetes cluster
        /// </summary>
        [Output("authentication")]
        public Output<Outputs.KubernetesAuthentication> Authentication { get; private set; } = null!;

        /// <summary>
        /// The name of the cloud provider.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Skip validation of Kubernetes configuration.
        /// </summary>
        [Output("skipValidation")]
        public Output<bool?> SkipValidation { get; private set; } = null!;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        [Output("usageScopes")]
        public Output<ImmutableArray<Outputs.KubernetesUsageScope>> UsageScopes { get; private set; } = null!;


        /// <summary>
        /// Create a Kubernetes resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Kubernetes(string name, KubernetesArgs args, CustomResourceOptions? options = null)
            : base("harness:cloudprovider/kubernetes:Kubernetes", name, args ?? new KubernetesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Kubernetes(string name, Input<string> id, KubernetesState? state = null, CustomResourceOptions? options = null)
            : base("harness:cloudprovider/kubernetes:Kubernetes", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Kubernetes resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Kubernetes Get(string name, Input<string> id, KubernetesState? state = null, CustomResourceOptions? options = null)
        {
            return new Kubernetes(name, id, state, options);
        }
    }

    public sealed class KubernetesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication configuration for the Kubernetes cluster
        /// </summary>
        [Input("authentication", required: true)]
        public Input<Inputs.KubernetesAuthenticationArgs> Authentication { get; set; } = null!;

        /// <summary>
        /// The name of the cloud provider.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Skip validation of Kubernetes configuration.
        /// </summary>
        [Input("skipValidation")]
        public Input<bool>? SkipValidation { get; set; }

        [Input("usageScopes")]
        private InputList<Inputs.KubernetesUsageScopeArgs>? _usageScopes;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public InputList<Inputs.KubernetesUsageScopeArgs> UsageScopes
        {
            get => _usageScopes ?? (_usageScopes = new InputList<Inputs.KubernetesUsageScopeArgs>());
            set => _usageScopes = value;
        }

        public KubernetesArgs()
        {
        }
        public static new KubernetesArgs Empty => new KubernetesArgs();
    }

    public sealed class KubernetesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication configuration for the Kubernetes cluster
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.KubernetesAuthenticationGetArgs>? Authentication { get; set; }

        /// <summary>
        /// The name of the cloud provider.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Skip validation of Kubernetes configuration.
        /// </summary>
        [Input("skipValidation")]
        public Input<bool>? SkipValidation { get; set; }

        [Input("usageScopes")]
        private InputList<Inputs.KubernetesUsageScopeGetArgs>? _usageScopes;

        /// <summary>
        /// This block is used for scoping the resource to a specific set of applications or environments.
        /// </summary>
        public InputList<Inputs.KubernetesUsageScopeGetArgs> UsageScopes
        {
            get => _usageScopes ?? (_usageScopes = new InputList<Inputs.KubernetesUsageScopeGetArgs>());
            set => _usageScopes = value;
        }

        public KubernetesState()
        {
        }
        public static new KubernetesState Empty => new KubernetesState();
    }
}
