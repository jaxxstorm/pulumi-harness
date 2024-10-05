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
    /// Resource for creating a Rancher connector.
    /// 
    /// ## Import
    /// 
    /// Import account level rancher connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/connectorRancher:ConnectorRancher example &lt;connector_id&gt;
    /// ```
    /// 
    /// Import org level rancher connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/connectorRancher:ConnectorRancher example &lt;ord_id&gt;/&lt;connector_id&gt;
    /// ```
    /// 
    /// Import project level rancher connector
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/connectorRancher:ConnectorRancher example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/connectorRancher:ConnectorRancher")]
    public partial class ConnectorRancher : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Bearer token information for the rancher cluster.
        /// </summary>
        [Output("bearerToken")]
        public Output<Outputs.ConnectorRancherBearerToken?> BearerToken { get; private set; } = null!;

        /// <summary>
        /// Selectors to use for the delegate.
        /// </summary>
        [Output("delegateSelectors")]
        public Output<ImmutableArray<string>> DelegateSelectors { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Enable this flag for force deletion of connector
        /// </summary>
        [Output("forceDelete")]
        public Output<bool> ForceDelete { get; private set; } = null!;

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
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The URL of the Rancher cluster.
        /// </summary>
        [Output("rancherUrl")]
        public Output<string> RancherUrl { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectorRancher resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectorRancher(string name, ConnectorRancherArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/connectorRancher:ConnectorRancher", name, args ?? new ConnectorRancherArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectorRancher(string name, Input<string> id, ConnectorRancherState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/connectorRancher:ConnectorRancher", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConnectorRancher resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectorRancher Get(string name, Input<string> id, ConnectorRancherState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectorRancher(name, id, state, options);
        }
    }

    public sealed class ConnectorRancherArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bearer token information for the rancher cluster.
        /// </summary>
        [Input("bearerToken")]
        public Input<Inputs.ConnectorRancherBearerTokenArgs>? BearerToken { get; set; }

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Selectors to use for the delegate.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enable this flag for force deletion of connector
        /// </summary>
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

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

        /// <summary>
        /// The URL of the Rancher cluster.
        /// </summary>
        [Input("rancherUrl", required: true)]
        public Input<string> RancherUrl { get; set; } = null!;

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

        public ConnectorRancherArgs()
        {
        }
        public static new ConnectorRancherArgs Empty => new ConnectorRancherArgs();
    }

    public sealed class ConnectorRancherState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bearer token information for the rancher cluster.
        /// </summary>
        [Input("bearerToken")]
        public Input<Inputs.ConnectorRancherBearerTokenGetArgs>? BearerToken { get; set; }

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Selectors to use for the delegate.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enable this flag for force deletion of connector
        /// </summary>
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

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

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The URL of the Rancher cluster.
        /// </summary>
        [Input("rancherUrl")]
        public Input<string>? RancherUrl { get; set; }

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

        public ConnectorRancherState()
        {
        }
        public static new ConnectorRancherState Empty => new ConnectorRancherState();
    }
}