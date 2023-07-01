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
    /// Resource for creating an ElasticSearch connector.
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
    ///     // Authentication mechanism as api token
    ///     var token = new Harness.Platform.ElasticsearchConnector("token", new()
    ///     {
    ///         ApiToken = new Harness.Platform.Inputs.ElasticsearchConnectorApiTokenArgs
    ///         {
    ///             ClientId = "client_id",
    ///             ClientSecretRef = "account.secret_id",
    ///         },
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
    ///         Url = "https://elasticsearch.com/",
    ///     });
    /// 
    ///     // Authentication mechanism as username and password
    ///     var test = new Harness.Platform.ElasticsearchConnector("test", new()
    ///     {
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
    ///         Url = "https://elasticsearch.com/",
    ///         UsernamePassword = new Harness.Platform.Inputs.ElasticsearchConnectorUsernamePasswordArgs
    ///         {
    ///             PasswordRef = "account.secret_id",
    ///             Username = "username",
    ///         },
    ///     });
    /// 
    ///     // Authentication mechanism as username and password
    ///     var noAuthentication = new Harness.Platform.ElasticsearchConnector("noAuthentication", new()
    ///     {
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
    ///         Url = "https://elasticsearch.com/",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level elasticsearch connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example &lt;connector_id&gt;
    /// ```
    /// 
    ///  Import org level elasticsearch connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
    /// ```
    /// 
    ///  Import project level elasticsearch connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/elasticsearchConnector:ElasticsearchConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/elasticsearchConnector:ElasticsearchConnector")]
    public partial class ElasticsearchConnector : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Authenticate to ElasticSearch using api token.
        /// </summary>
        [Output("apiToken")]
        public Output<Outputs.ElasticsearchConnectorApiToken?> ApiToken { get; private set; } = null!;

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
        /// No Authentication to ElasticSearch
        /// </summary>
        [Output("noAuthentication")]
        public Output<Outputs.ElasticsearchConnectorNoAuthentication?> NoAuthentication { get; private set; } = null!;

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
        /// URL of the ElasticSearch controller.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// Authenticate to ElasticSearch using username and password.
        /// </summary>
        [Output("usernamePassword")]
        public Output<Outputs.ElasticsearchConnectorUsernamePassword?> UsernamePassword { get; private set; } = null!;


        /// <summary>
        /// Create a ElasticsearchConnector resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ElasticsearchConnector(string name, ElasticsearchConnectorArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/elasticsearchConnector:ElasticsearchConnector", name, args ?? new ElasticsearchConnectorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ElasticsearchConnector(string name, Input<string> id, ElasticsearchConnectorState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/elasticsearchConnector:ElasticsearchConnector", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ElasticsearchConnector resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ElasticsearchConnector Get(string name, Input<string> id, ElasticsearchConnectorState? state = null, CustomResourceOptions? options = null)
        {
            return new ElasticsearchConnector(name, id, state, options);
        }
    }

    public sealed class ElasticsearchConnectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authenticate to ElasticSearch using api token.
        /// </summary>
        [Input("apiToken")]
        public Input<Inputs.ElasticsearchConnectorApiTokenArgs>? ApiToken { get; set; }

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
        /// No Authentication to ElasticSearch
        /// </summary>
        [Input("noAuthentication")]
        public Input<Inputs.ElasticsearchConnectorNoAuthenticationArgs>? NoAuthentication { get; set; }

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
        /// URL of the ElasticSearch controller.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// Authenticate to ElasticSearch using username and password.
        /// </summary>
        [Input("usernamePassword")]
        public Input<Inputs.ElasticsearchConnectorUsernamePasswordArgs>? UsernamePassword { get; set; }

        public ElasticsearchConnectorArgs()
        {
        }
        public static new ElasticsearchConnectorArgs Empty => new ElasticsearchConnectorArgs();
    }

    public sealed class ElasticsearchConnectorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authenticate to ElasticSearch using api token.
        /// </summary>
        [Input("apiToken")]
        public Input<Inputs.ElasticsearchConnectorApiTokenGetArgs>? ApiToken { get; set; }

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
        /// No Authentication to ElasticSearch
        /// </summary>
        [Input("noAuthentication")]
        public Input<Inputs.ElasticsearchConnectorNoAuthenticationGetArgs>? NoAuthentication { get; set; }

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
        /// URL of the ElasticSearch controller.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Authenticate to ElasticSearch using username and password.
        /// </summary>
        [Input("usernamePassword")]
        public Input<Inputs.ElasticsearchConnectorUsernamePasswordGetArgs>? UsernamePassword { get; set; }

        public ElasticsearchConnectorState()
        {
        }
        public static new ElasticsearchConnectorState Empty => new ElasticsearchConnectorState();
    }
}
