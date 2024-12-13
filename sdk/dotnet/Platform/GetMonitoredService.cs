// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetMonitoredService
    {
        /// <summary>
        /// Data source for retrieving a monitored service.
        /// </summary>
        public static Task<GetMonitoredServiceResult> InvokeAsync(GetMonitoredServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMonitoredServiceResult>("harness:platform/getMonitoredService:getMonitoredService", args ?? new GetMonitoredServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a monitored service.
        /// </summary>
        public static Output<GetMonitoredServiceResult> Invoke(GetMonitoredServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMonitoredServiceResult>("harness:platform/getMonitoredService:getMonitoredService", args ?? new GetMonitoredServiceInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a monitored service.
        /// </summary>
        public static Output<GetMonitoredServiceResult> Invoke(GetMonitoredServiceInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMonitoredServiceResult>("harness:platform/getMonitoredService:getMonitoredService", args ?? new GetMonitoredServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMonitoredServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the monitored service.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Identifier of the organization in which the monitored service is configured.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// Identifier of the project in which the monitored service is configured.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetMonitoredServiceArgs()
        {
        }
        public static new GetMonitoredServiceArgs Empty => new GetMonitoredServiceArgs();
    }

    public sealed class GetMonitoredServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the monitored service.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Identifier of the organization in which the monitored service is configured.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Identifier of the project in which the monitored service is configured.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetMonitoredServiceInvokeArgs()
        {
        }
        public static new GetMonitoredServiceInvokeArgs Empty => new GetMonitoredServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetMonitoredServiceResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the monitored service.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Identifier of the organization in which the monitored service is configured.
        /// </summary>
        public readonly string OrgId;
        /// <summary>
        /// Identifier of the project in which the monitored service is configured.
        /// </summary>
        public readonly string ProjectId;

        [OutputConstructor]
        private GetMonitoredServiceResult(
            string id,

            string identifier,

            string orgId,

            string projectId)
        {
            Id = id;
            Identifier = identifier;
            OrgId = orgId;
            ProjectId = projectId;
        }
    }
}
