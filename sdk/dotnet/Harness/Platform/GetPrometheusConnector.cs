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
    public static class GetPrometheusConnector
    {
        /// <summary>
        /// Datasource for looking up a Prometheus connector.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetPrometheusConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrometheusConnectorResult> InvokeAsync(GetPrometheusConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrometheusConnectorResult>("harness:platform/getPrometheusConnector:getPrometheusConnector", args ?? new GetPrometheusConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Prometheus connector.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetPrometheusConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrometheusConnectorResult> Invoke(GetPrometheusConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrometheusConnectorResult>("harness:platform/getPrometheusConnector:getPrometheusConnector", args ?? new GetPrometheusConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrometheusConnectorArgs : global::Pulumi.InvokeArgs
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

        public GetPrometheusConnectorArgs()
        {
        }
        public static new GetPrometheusConnectorArgs Empty => new GetPrometheusConnectorArgs();
    }

    public sealed class GetPrometheusConnectorInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetPrometheusConnectorInvokeArgs()
        {
        }
        public static new GetPrometheusConnectorInvokeArgs Empty => new GetPrometheusConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrometheusConnectorResult
    {
        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Headers.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrometheusConnectorHeaderResult> Headers;
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
        /// Reference to the Harness secret containing the password. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
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
        /// URL of the Prometheus server.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// User name.
        /// </summary>
        public readonly string UserName;

        [OutputConstructor]
        private GetPrometheusConnectorResult(
            ImmutableArray<string> delegateSelectors,

            string description,

            ImmutableArray<Outputs.GetPrometheusConnectorHeaderResult> headers,

            string id,

            string identifier,

            string? name,

            string? orgId,

            string passwordRef,

            string? projectId,

            ImmutableArray<string> tags,

            string url,

            string userName)
        {
            DelegateSelectors = delegateSelectors;
            Description = description;
            Headers = headers;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            PasswordRef = passwordRef;
            ProjectId = projectId;
            Tags = tags;
            Url = url;
            UserName = userName;
        }
    }
}
