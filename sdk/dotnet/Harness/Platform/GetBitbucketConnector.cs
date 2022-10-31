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
    public static class GetBitbucketConnector
    {
        /// <summary>
        /// Datasource for looking up a Bitbucket connector.
        /// </summary>
        public static Task<GetBitbucketConnectorResult> InvokeAsync(GetBitbucketConnectorArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBitbucketConnectorResult>("harness:platform/getBitbucketConnector:getBitbucketConnector", args ?? new GetBitbucketConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Bitbucket connector.
        /// </summary>
        public static Output<GetBitbucketConnectorResult> Invoke(GetBitbucketConnectorInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBitbucketConnectorResult>("harness:platform/getBitbucketConnector:getBitbucketConnector", args ?? new GetBitbucketConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBitbucketConnectorArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique identifier of the Organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetBitbucketConnectorArgs()
        {
        }
        public static new GetBitbucketConnectorArgs Empty => new GetBitbucketConnectorArgs();
    }

    public sealed class GetBitbucketConnectorInvokeArgs : global::Pulumi.InvokeArgs
    {
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

        public GetBitbucketConnectorInvokeArgs()
        {
        }
        public static new GetBitbucketConnectorInvokeArgs Empty => new GetBitbucketConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetBitbucketConnectorResult
    {
        /// <summary>
        /// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBitbucketConnectorApiAuthenticationResult> ApiAuthentications;
        /// <summary>
        /// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
        /// </summary>
        public readonly string ConnectionType;
        /// <summary>
        /// Credentials to use for the connection.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBitbucketConnectorCredentialResult> Credentials;
        /// <summary>
        /// Connect using only the delegates which have these tags.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string? Identifier;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the Organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Url of the BitBucket repository or account.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// Repository to test the connection with. This is only used when `connection_type` is `Account`.
        /// </summary>
        public readonly string ValidationRepo;

        [OutputConstructor]
        private GetBitbucketConnectorResult(
            ImmutableArray<Outputs.GetBitbucketConnectorApiAuthenticationResult> apiAuthentications,

            string connectionType,

            ImmutableArray<Outputs.GetBitbucketConnectorCredentialResult> credentials,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string? identifier,

            string? name,

            string? orgId,

            string? projectId,

            ImmutableArray<string> tags,

            string url,

            string validationRepo)
        {
            ApiAuthentications = apiAuthentications;
            ConnectionType = connectionType;
            Credentials = credentials;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
            Url = url;
            ValidationRepo = validationRepo;
        }
    }
}
