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
    /// Resource for creating a Sumologic connector.
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
    ///     var test = new Harness.Platform.SumologicConnector("test", new()
    ///     {
    ///         AccessIdRef = "account.secret_id",
    ///         AccessKeyRef = "account.secret_id",
    ///         DelegateSelectors = new[]
    ///         {
    ///             "harness-delegate",
    ///         },
    ///         Description = "test",
    ///         Identifier = "identifier",
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///         Url = "https://api.us2.sumologic.com/",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level sumologic connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/sumologicConnector:SumologicConnector example &lt;connector_id&gt;
    /// ```
    /// 
    ///  Import org level sumologic connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/sumologicConnector:SumologicConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
    /// ```
    /// 
    ///  Import project level sumologic connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/sumologicConnector:SumologicConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/sumologicConnector:SumologicConnector")]
    public partial class SumologicConnector : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Reference to the Harness secret containing the access id. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Output("accessIdRef")]
        public Output<string> AccessIdRef { get; private set; } = null!;

        /// <summary>
        /// Reference to the Harness secret containing the access key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Output("accessKeyRef")]
        public Output<string> AccessKeyRef { get; private set; } = null!;

        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        [Output("delegateSelectors")]
        public Output<ImmutableArray<string>> DelegateSelectors { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

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
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// URL of the SumoLogic server.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a SumologicConnector resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SumologicConnector(string name, SumologicConnectorArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/sumologicConnector:SumologicConnector", name, args ?? new SumologicConnectorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SumologicConnector(string name, Input<string> id, SumologicConnectorState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/sumologicConnector:SumologicConnector", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SumologicConnector resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SumologicConnector Get(string name, Input<string> id, SumologicConnectorState? state = null, CustomResourceOptions? options = null)
        {
            return new SumologicConnector(name, id, state, options);
        }
    }

    public sealed class SumologicConnectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the Harness secret containing the access id. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("accessIdRef", required: true)]
        public Input<string> AccessIdRef { get; set; } = null!;

        /// <summary>
        /// Reference to the Harness secret containing the access key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("accessKeyRef", required: true)]
        public Input<string> AccessKeyRef { get; set; } = null!;

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Tags to filter delegates for connection.
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
        /// URL of the SumoLogic server.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public SumologicConnectorArgs()
        {
        }
        public static new SumologicConnectorArgs Empty => new SumologicConnectorArgs();
    }

    public sealed class SumologicConnectorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the Harness secret containing the access id. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("accessIdRef")]
        public Input<string>? AccessIdRef { get; set; }

        /// <summary>
        /// Reference to the Harness secret containing the access key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("accessKeyRef")]
        public Input<string>? AccessKeyRef { get; set; }

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Tags to filter delegates for connection.
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
        /// URL of the SumoLogic server.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public SumologicConnectorState()
        {
        }
        public static new SumologicConnectorState Empty => new SumologicConnectorState();
    }
}
