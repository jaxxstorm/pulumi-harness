// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetSplunkConnector
    {
        /// <summary>
        /// Datasource for looking up a Splunk connector.
        /// 
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
        ///     var example = Harness.Platform.GetSplunkConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSplunkConnectorResult> InvokeAsync(GetSplunkConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSplunkConnectorResult>("harness:platform/getSplunkConnector:getSplunkConnector", args ?? new GetSplunkConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Splunk connector.
        /// 
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
        ///     var example = Harness.Platform.GetSplunkConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSplunkConnectorResult> Invoke(GetSplunkConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSplunkConnectorResult>("harness:platform/getSplunkConnector:getSplunkConnector", args ?? new GetSplunkConnectorInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Splunk connector.
        /// 
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
        ///     var example = Harness.Platform.GetSplunkConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSplunkConnectorResult> Invoke(GetSplunkConnectorInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSplunkConnectorResult>("harness:platform/getSplunkConnector:getSplunkConnector", args ?? new GetSplunkConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSplunkConnectorArgs : global::Pulumi.InvokeArgs
    {
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

        public GetSplunkConnectorArgs()
        {
        }
        public static new GetSplunkConnectorArgs Empty => new GetSplunkConnectorArgs();
    }

    public sealed class GetSplunkConnectorInvokeArgs : global::Pulumi.InvokeArgs
    {
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

        public GetSplunkConnectorInvokeArgs()
        {
        }
        public static new GetSplunkConnectorInvokeArgs Empty => new GetSplunkConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetSplunkConnectorResult
    {
        /// <summary>
        /// Splunk account id.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Tags to filter delegates for connection.
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
        /// The reference to the Harness secret containing the Splunk password. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string PasswordRef;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// URL of the Splunk server.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The username used for connecting to Splunk.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetSplunkConnectorResult(
            string accountId,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string passwordRef,

            string? projectId,

            ImmutableArray<string> tags,

            string url,

            string username)
        {
            AccountId = accountId;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            PasswordRef = passwordRef;
            ProjectId = projectId;
            Tags = tags;
            Url = url;
            Username = username;
        }
    }
}
