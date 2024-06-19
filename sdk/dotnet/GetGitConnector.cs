// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness
{
    public static class GetGitConnector
    {
        /// <summary>
        /// Data source for retrieving a Harness application
        /// </summary>
        public static Task<GetGitConnectorResult> InvokeAsync(GetGitConnectorArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGitConnectorResult>("harness:index/getGitConnector:getGitConnector", args ?? new GetGitConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness application
        /// </summary>
        public static Output<GetGitConnectorResult> Invoke(GetGitConnectorInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitConnectorResult>("harness:index/getGitConnector:getGitConnector", args ?? new GetGitConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGitConnectorArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of the git connector.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name of the git connector.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetGitConnectorArgs()
        {
        }
        public static new GetGitConnectorArgs Empty => new GetGitConnectorArgs();
    }

    public sealed class GetGitConnectorInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of the git connector.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the git connector.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetGitConnectorInvokeArgs()
        {
        }
        public static new GetGitConnectorInvokeArgs Empty => new GetGitConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetGitConnectorResult
    {
        /// <summary>
        /// The branch of the git connector to use.
        /// </summary>
        public readonly string Branch;
        /// <summary>
        /// Custom details to use when making commits using this git connector.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitConnectorCommitDetailResult> CommitDetails;
        /// <summary>
        /// The time the git connector was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Delegate selectors to apply to this git connector.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Boolean indicating whether or not to generate a webhook url.
        /// </summary>
        public readonly bool GenerateWebhookUrl;
        /// <summary>
        /// Id of the git connector.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The name of the git connector.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The id of the secret for connecting to the git repository.
        /// </summary>
        public readonly string PasswordSecretId;
        /// <summary>
        /// The id of the SSH secret to use.
        /// </summary>
        public readonly string SshSettingId;
        /// <summary>
        /// The URL of the git repository or account/organization.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The type of git url being used. Options are `ACCOUNT`, and `REPO`.
        /// </summary>
        public readonly string UrlType;
        /// <summary>
        /// The name of the user used to connect to the git repository.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// The generated webhook url.
        /// </summary>
        public readonly string WebhookUrl;

        [OutputConstructor]
        private GetGitConnectorResult(
            string branch,

            ImmutableArray<Outputs.GetGitConnectorCommitDetailResult> commitDetails,

            string createdAt,

            ImmutableArray<string> delegateSelectors,

            bool generateWebhookUrl,

            string? id,

            string? name,

            string passwordSecretId,

            string sshSettingId,

            string url,

            string urlType,

            string username,

            string webhookUrl)
        {
            Branch = branch;
            CommitDetails = commitDetails;
            CreatedAt = createdAt;
            DelegateSelectors = delegateSelectors;
            GenerateWebhookUrl = generateWebhookUrl;
            Id = id;
            Name = name;
            PasswordSecretId = passwordSecretId;
            SshSettingId = sshSettingId;
            Url = url;
            UrlType = urlType;
            Username = username;
            WebhookUrl = webhookUrl;
        }
    }
}
