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
    /// Resource for creating a Gitlab connector.
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
    ///     // Credentials ssh
    ///     var test = new Harness.Platform.GitlabConnector("test", new()
    ///     {
    ///         ConnectionType = "Account",
    ///         Credentials = new Harness.Platform.Inputs.GitlabConnectorCredentialsArgs
    ///         {
    ///             Ssh = new Harness.Platform.Inputs.GitlabConnectorCredentialsSshArgs
    ///             {
    ///                 SshKeyRef = "account.test",
    ///             },
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
    ///         Url = "https://gitlab.com/account",
    ///         ValidationRepo = "some_repo",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level gitlab connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/gitlabConnector:GitlabConnector example &lt;connector_id&gt;
    /// ```
    /// 
    ///  Import org level gitlab connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/gitlabConnector:GitlabConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
    /// ```
    /// 
    ///  Import project level gitlab connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/gitlabConnector:GitlabConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/gitlabConnector:GitlabConnector")]
    public partial class GitlabConnector : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        /// </summary>
        [Output("apiAuthentication")]
        public Output<Outputs.GitlabConnectorApiAuthentication?> ApiAuthentication { get; private set; } = null!;

        /// <summary>
        /// Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        /// </summary>
        [Output("connectionType")]
        public Output<string> ConnectionType { get; private set; } = null!;

        /// <summary>
        /// Credentials to use for the connection.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.GitlabConnectorCredentials> Credentials { get; private set; } = null!;

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
        /// URL of the gitlab repository or account.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// Repository to test the connection with. This is only used when `connection_type` is `Account`.
        /// </summary>
        [Output("validationRepo")]
        public Output<string?> ValidationRepo { get; private set; } = null!;


        /// <summary>
        /// Create a GitlabConnector resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GitlabConnector(string name, GitlabConnectorArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/gitlabConnector:GitlabConnector", name, args ?? new GitlabConnectorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GitlabConnector(string name, Input<string> id, GitlabConnectorState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/gitlabConnector:GitlabConnector", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GitlabConnector resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GitlabConnector Get(string name, Input<string> id, GitlabConnectorState? state = null, CustomResourceOptions? options = null)
        {
            return new GitlabConnector(name, id, state, options);
        }
    }

    public sealed class GitlabConnectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        /// </summary>
        [Input("apiAuthentication")]
        public Input<Inputs.GitlabConnectorApiAuthenticationArgs>? ApiAuthentication { get; set; }

        /// <summary>
        /// Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        /// </summary>
        [Input("connectionType", required: true)]
        public Input<string> ConnectionType { get; set; } = null!;

        /// <summary>
        /// Credentials to use for the connection.
        /// </summary>
        [Input("credentials", required: true)]
        public Input<Inputs.GitlabConnectorCredentialsArgs> Credentials { get; set; } = null!;

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
        /// URL of the gitlab repository or account.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// Repository to test the connection with. This is only used when `connection_type` is `Account`.
        /// </summary>
        [Input("validationRepo")]
        public Input<string>? ValidationRepo { get; set; }

        public GitlabConnectorArgs()
        {
        }
        public static new GitlabConnectorArgs Empty => new GitlabConnectorArgs();
    }

    public sealed class GitlabConnectorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        /// </summary>
        [Input("apiAuthentication")]
        public Input<Inputs.GitlabConnectorApiAuthenticationGetArgs>? ApiAuthentication { get; set; }

        /// <summary>
        /// Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// Credentials to use for the connection.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.GitlabConnectorCredentialsGetArgs>? Credentials { get; set; }

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
        /// URL of the gitlab repository or account.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Repository to test the connection with. This is only used when `connection_type` is `Account`.
        /// </summary>
        [Input("validationRepo")]
        public Input<string>? ValidationRepo { get; set; }

        public GitlabConnectorState()
        {
        }
        public static new GitlabConnectorState Empty => new GitlabConnectorState();
    }
}
