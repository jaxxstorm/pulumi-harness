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
    /// Resource for creating a Jira connector.
    /// </summary>
    [HarnessResourceType("harness:platform/jiraConnector:JiraConnector")]
    public partial class JiraConnector : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Connect using only the delegates which have these tags.
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
        /// Unique identifier of the Organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Reference to a secret containing the password to use for authentication.
        /// </summary>
        [Output("passwordRef")]
        public Output<string> PasswordRef { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Url of the Jira server.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// Username to use for authentication.
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;

        /// <summary>
        /// Reference to a secret containing the username to use for authentication.
        /// </summary>
        [Output("usernameRef")]
        public Output<string?> UsernameRef { get; private set; } = null!;


        /// <summary>
        /// Create a JiraConnector resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public JiraConnector(string name, JiraConnectorArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/jiraConnector:JiraConnector", name, args ?? new JiraConnectorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private JiraConnector(string name, Input<string> id, JiraConnectorState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/jiraConnector:JiraConnector", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing JiraConnector resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static JiraConnector Get(string name, Input<string> id, JiraConnectorState? state = null, CustomResourceOptions? options = null)
        {
            return new JiraConnector(name, id, state, options);
        }
    }

    public sealed class JiraConnectorArgs : global::Pulumi.ResourceArgs
    {
        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Connect using only the delegates which have these tags.
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
        /// Unique identifier of the Organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Reference to a secret containing the password to use for authentication.
        /// </summary>
        [Input("passwordRef", required: true)]
        public Input<string> PasswordRef { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Url of the Jira server.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// Username to use for authentication.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// Reference to a secret containing the username to use for authentication.
        /// </summary>
        [Input("usernameRef")]
        public Input<string>? UsernameRef { get; set; }

        public JiraConnectorArgs()
        {
        }
        public static new JiraConnectorArgs Empty => new JiraConnectorArgs();
    }

    public sealed class JiraConnectorState : global::Pulumi.ResourceArgs
    {
        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Connect using only the delegates which have these tags.
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
        /// Unique identifier of the Organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Reference to a secret containing the password to use for authentication.
        /// </summary>
        [Input("passwordRef")]
        public Input<string>? PasswordRef { get; set; }

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Url of the Jira server.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Username to use for authentication.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// Reference to a secret containing the username to use for authentication.
        /// </summary>
        [Input("usernameRef")]
        public Input<string>? UsernameRef { get; set; }

        public JiraConnectorState()
        {
        }
        public static new JiraConnectorState Empty => new JiraConnectorState();
    }
}
