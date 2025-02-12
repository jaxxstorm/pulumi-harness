// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetAwsSecretManagerConnector
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetAwsSecretManagerConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAwsSecretManagerConnectorResult> InvokeAsync(GetAwsSecretManagerConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAwsSecretManagerConnectorResult>("harness:platform/getAwsSecretManagerConnector:getAwsSecretManagerConnector", args ?? new GetAwsSecretManagerConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetAwsSecretManagerConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAwsSecretManagerConnectorResult> Invoke(GetAwsSecretManagerConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsSecretManagerConnectorResult>("harness:platform/getAwsSecretManagerConnector:getAwsSecretManagerConnector", args ?? new GetAwsSecretManagerConnectorInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetAwsSecretManagerConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAwsSecretManagerConnectorResult> Invoke(GetAwsSecretManagerConnectorInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsSecretManagerConnectorResult>("harness:platform/getAwsSecretManagerConnector:getAwsSecretManagerConnector", args ?? new GetAwsSecretManagerConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsSecretManagerConnectorArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to force delete secret value or not.
        /// </summary>
        [Input("forceDeleteWithoutRecovery")]
        public bool? ForceDeleteWithoutRecovery { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// recovery duration in days in AWS Secrets Manager.
        /// </summary>
        [Input("recoveryWindowInDays")]
        public int? RecoveryWindowInDays { get; set; }

        public GetAwsSecretManagerConnectorArgs()
        {
        }
        public static new GetAwsSecretManagerConnectorArgs Empty => new GetAwsSecretManagerConnectorArgs();
    }

    public sealed class GetAwsSecretManagerConnectorInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to force delete secret value or not.
        /// </summary>
        [Input("forceDeleteWithoutRecovery")]
        public Input<bool>? ForceDeleteWithoutRecovery { get; set; }

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
        /// recovery duration in days in AWS Secrets Manager.
        /// </summary>
        [Input("recoveryWindowInDays")]
        public Input<int>? RecoveryWindowInDays { get; set; }

        public GetAwsSecretManagerConnectorInvokeArgs()
        {
        }
        public static new GetAwsSecretManagerConnectorInvokeArgs Empty => new GetAwsSecretManagerConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsSecretManagerConnectorResult
    {
        /// <summary>
        /// Credentials to connect to AWS.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAwsSecretManagerConnectorCredentialResult> Credentials;
        /// <summary>
        /// Whether this is the default connector.
        /// </summary>
        public readonly bool Default;
        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The delegate to execute the action on.
        /// </summary>
        public readonly bool ExecuteOnDelegate;
        /// <summary>
        /// Whether to force delete secret value or not.
        /// </summary>
        public readonly bool? ForceDeleteWithoutRecovery;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// recovery duration in days in AWS Secrets Manager.
        /// </summary>
        public readonly int? RecoveryWindowInDays;
        /// <summary>
        /// The AWS region where the AWS Secret Manager is.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// A prefix to be added to all secrets.
        /// </summary>
        public readonly string SecretNamePrefix;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Whether to update secret value using putSecretValue action.
        /// </summary>
        public readonly bool UsePutSecret;

        [OutputConstructor]
        private GetAwsSecretManagerConnectorResult(
            ImmutableArray<Outputs.GetAwsSecretManagerConnectorCredentialResult> credentials,

            bool @default,

            ImmutableArray<string> delegateSelectors,

            string description,

            bool executeOnDelegate,

            bool? forceDeleteWithoutRecovery,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string? projectId,

            int? recoveryWindowInDays,

            string region,

            string secretNamePrefix,

            ImmutableArray<string> tags,

            bool usePutSecret)
        {
            Credentials = credentials;
            Default = @default;
            DelegateSelectors = delegateSelectors;
            Description = description;
            ExecuteOnDelegate = executeOnDelegate;
            ForceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            RecoveryWindowInDays = recoveryWindowInDays;
            Region = region;
            SecretNamePrefix = secretNamePrefix;
            Tags = tags;
            UsePutSecret = usePutSecret;
        }
    }
}
