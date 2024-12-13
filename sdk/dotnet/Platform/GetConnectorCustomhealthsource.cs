// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetConnectorCustomhealthsource
    {
        /// <summary>
        /// Datasource for looking up a Custom Health source connector.
        /// </summary>
        public static Task<GetConnectorCustomhealthsourceResult> InvokeAsync(GetConnectorCustomhealthsourceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectorCustomhealthsourceResult>("harness:platform/getConnectorCustomhealthsource:getConnectorCustomhealthsource", args ?? new GetConnectorCustomhealthsourceArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Custom Health source connector.
        /// </summary>
        public static Output<GetConnectorCustomhealthsourceResult> Invoke(GetConnectorCustomhealthsourceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectorCustomhealthsourceResult>("harness:platform/getConnectorCustomhealthsource:getConnectorCustomhealthsource", args ?? new GetConnectorCustomhealthsourceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Custom Health source connector.
        /// </summary>
        public static Output<GetConnectorCustomhealthsourceResult> Invoke(GetConnectorCustomhealthsourceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectorCustomhealthsourceResult>("harness:platform/getConnectorCustomhealthsource:getConnectorCustomhealthsource", args ?? new GetConnectorCustomhealthsourceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectorCustomhealthsourceArgs : global::Pulumi.InvokeArgs
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

        public GetConnectorCustomhealthsourceArgs()
        {
        }
        public static new GetConnectorCustomhealthsourceArgs Empty => new GetConnectorCustomhealthsourceArgs();
    }

    public sealed class GetConnectorCustomhealthsourceInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetConnectorCustomhealthsourceInvokeArgs()
        {
        }
        public static new GetConnectorCustomhealthsourceInvokeArgs Empty => new GetConnectorCustomhealthsourceInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectorCustomhealthsourceResult
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
        public readonly ImmutableArray<Outputs.GetConnectorCustomhealthsourceHeaderResult> Headers;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// HTTP Verb Method for the API Call
        /// </summary>
        public readonly string Method;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Parameters.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectorCustomhealthsourceParamResult> Params;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// URL of the Custom Health source server.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// Body to be sent with the API Call
        /// </summary>
        public readonly string ValidationBody;
        /// <summary>
        /// Path to be added to the base URL for the API Call
        /// </summary>
        public readonly string ValidationPath;

        [OutputConstructor]
        private GetConnectorCustomhealthsourceResult(
            ImmutableArray<string> delegateSelectors,

            string description,

            ImmutableArray<Outputs.GetConnectorCustomhealthsourceHeaderResult> headers,

            string id,

            string identifier,

            string method,

            string? name,

            string? orgId,

            ImmutableArray<Outputs.GetConnectorCustomhealthsourceParamResult> @params,

            string? projectId,

            ImmutableArray<string> tags,

            string url,

            string validationBody,

            string validationPath)
        {
            DelegateSelectors = delegateSelectors;
            Description = description;
            Headers = headers;
            Id = id;
            Identifier = identifier;
            Method = method;
            Name = name;
            OrgId = orgId;
            Params = @params;
            ProjectId = projectId;
            Tags = tags;
            Url = url;
            ValidationBody = validationBody;
            ValidationPath = validationPath;
        }
    }
}
