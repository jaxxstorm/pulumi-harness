// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetOverrides
    {
        public static Task<GetOverridesResult> InvokeAsync(GetOverridesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOverridesResult>("harness:platform/getOverrides:getOverrides", args ?? new GetOverridesArgs(), options.WithDefaults());

        public static Output<GetOverridesResult> Invoke(GetOverridesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOverridesResult>("harness:platform/getOverrides:getOverrides", args ?? new GetOverridesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOverridesArgs : global::Pulumi.InvokeArgs
    {
        [Input("gitDetails")]
        public Inputs.GetOverridesGitDetailsArgs? GitDetails { get; set; }

        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        [Input("orgId")]
        public string? OrgId { get; set; }

        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetOverridesArgs()
        {
        }
        public static new GetOverridesArgs Empty => new GetOverridesArgs();
    }

    public sealed class GetOverridesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("gitDetails")]
        public Input<Inputs.GetOverridesGitDetailsInputArgs>? GitDetails { get; set; }

        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetOverridesInvokeArgs()
        {
        }
        public static new GetOverridesInvokeArgs Empty => new GetOverridesInvokeArgs();
    }


    [OutputType]
    public sealed class GetOverridesResult
    {
        public readonly string ClusterId;
        public readonly string EnvId;
        public readonly Outputs.GetOverridesGitDetailsResult GitDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Identifier;
        public readonly string InfraId;
        public readonly string? OrgId;
        public readonly string? ProjectId;
        public readonly string ServiceId;
        public readonly string Type;
        public readonly string Yaml;

        [OutputConstructor]
        private GetOverridesResult(
            string clusterId,

            string envId,

            Outputs.GetOverridesGitDetailsResult gitDetails,

            string id,

            string identifier,

            string infraId,

            string? orgId,

            string? projectId,

            string serviceId,

            string type,

            string yaml)
        {
            ClusterId = clusterId;
            EnvId = envId;
            GitDetails = gitDetails;
            Id = id;
            Identifier = identifier;
            InfraId = infraId;
            OrgId = orgId;
            ProjectId = projectId;
            ServiceId = serviceId;
            Type = type;
            Yaml = yaml;
        }
    }
}
