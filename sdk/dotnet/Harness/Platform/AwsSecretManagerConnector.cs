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
    /// Resource for creating an AWS Secret Manager connector.
    /// </summary>
    [HarnessResourceType("harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector")]
    public partial class AwsSecretManagerConnector : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The credentials to use for connecting to aws.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.AwsSecretManagerConnectorCredentials> Credentials { get; private set; } = null!;

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
        /// Unique identifier of the Project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The AWS region where the AWS Secret Manager is.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// A prefix to be added to all secrets.
        /// </summary>
        [Output("secretNamePrefix")]
        public Output<string?> SecretNamePrefix { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a AwsSecretManagerConnector resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AwsSecretManagerConnector(string name, AwsSecretManagerConnectorArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector", name, args ?? new AwsSecretManagerConnectorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AwsSecretManagerConnector(string name, Input<string> id, AwsSecretManagerConnectorState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/awsSecretManagerConnector:AwsSecretManagerConnector", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AwsSecretManagerConnector resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AwsSecretManagerConnector Get(string name, Input<string> id, AwsSecretManagerConnectorState? state = null, CustomResourceOptions? options = null)
        {
            return new AwsSecretManagerConnector(name, id, state, options);
        }
    }

    public sealed class AwsSecretManagerConnectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The credentials to use for connecting to aws.
        /// </summary>
        [Input("credentials", required: true)]
        public Input<Inputs.AwsSecretManagerConnectorCredentialsArgs> Credentials { get; set; } = null!;

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
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The AWS region where the AWS Secret Manager is.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// A prefix to be added to all secrets.
        /// </summary>
        [Input("secretNamePrefix")]
        public Input<string>? SecretNamePrefix { get; set; }

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

        public AwsSecretManagerConnectorArgs()
        {
        }
        public static new AwsSecretManagerConnectorArgs Empty => new AwsSecretManagerConnectorArgs();
    }

    public sealed class AwsSecretManagerConnectorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The credentials to use for connecting to aws.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.AwsSecretManagerConnectorCredentialsGetArgs>? Credentials { get; set; }

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
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The AWS region where the AWS Secret Manager is.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// A prefix to be added to all secrets.
        /// </summary>
        [Input("secretNamePrefix")]
        public Input<string>? SecretNamePrefix { get; set; }

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

        public AwsSecretManagerConnectorState()
        {
        }
        public static new AwsSecretManagerConnectorState Empty => new AwsSecretManagerConnectorState();
    }
}
