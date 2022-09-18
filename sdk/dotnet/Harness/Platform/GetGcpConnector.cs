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
    public static class GetGcpConnector
    {
        /// <summary>
        /// Datasource for looking up a Gcp connector.
        /// </summary>
        public static Task<GetGcpConnectorResult> InvokeAsync(GetGcpConnectorArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGcpConnectorResult>("harness:platform/getGcpConnector:getGcpConnector", args ?? new GetGcpConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Gcp connector.
        /// </summary>
        public static Output<GetGcpConnectorResult> Invoke(GetGcpConnectorInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetGcpConnectorResult>("harness:platform/getGcpConnector:getGcpConnector", args ?? new GetGcpConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGcpConnectorArgs : global::Pulumi.InvokeArgs
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
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetGcpConnectorArgs()
        {
        }
        public static new GetGcpConnectorArgs Empty => new GetGcpConnectorArgs();
    }

    public sealed class GetGcpConnectorInvokeArgs : global::Pulumi.InvokeArgs
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
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetGcpConnectorInvokeArgs()
        {
        }
        public static new GetGcpConnectorInvokeArgs Empty => new GetGcpConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetGcpConnectorResult
    {
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
        /// Inherit configuration from delegate.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGcpConnectorInheritFromDelegateResult> InheritFromDelegates;
        /// <summary>
        /// Manual credential configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGcpConnectorManualResult> Manuals;
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
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetGcpConnectorResult(
            string description,

            string id,

            string? identifier,

            ImmutableArray<Outputs.GetGcpConnectorInheritFromDelegateResult> inheritFromDelegates,

            ImmutableArray<Outputs.GetGcpConnectorManualResult> manuals,

            string? name,

            string? orgId,

            string? projectId,

            ImmutableArray<string> tags)
        {
            Description = description;
            Id = id;
            Identifier = identifier;
            InheritFromDelegates = inheritFromDelegates;
            Manuals = manuals;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
        }
    }
}