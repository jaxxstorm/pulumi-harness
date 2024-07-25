// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetGitopsAppProject
    {
        public static Task<GetGitopsAppProjectResult> InvokeAsync(GetGitopsAppProjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGitopsAppProjectResult>("harness:platform/getGitopsAppProject:getGitopsAppProject", args ?? new GetGitopsAppProjectArgs(), options.WithDefaults());

        public static Output<GetGitopsAppProjectResult> Invoke(GetGitopsAppProjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitopsAppProjectResult>("harness:platform/getGitopsAppProject:getGitopsAppProject", args ?? new GetGitopsAppProjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGitopsAppProjectArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        [Input("agentId", required: true)]
        public string AgentId { get; set; } = null!;

        [Input("orgId")]
        public string? OrgId { get; set; }

        [Input("projectId")]
        public string? ProjectId { get; set; }

        [Input("queryName")]
        public string? QueryName { get; set; }

        public GetGitopsAppProjectArgs()
        {
        }
        public static new GetGitopsAppProjectArgs Empty => new GetGitopsAppProjectArgs();
    }

    public sealed class GetGitopsAppProjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("agentId", required: true)]
        public Input<string> AgentId { get; set; } = null!;

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("queryName")]
        public Input<string>? QueryName { get; set; }

        public GetGitopsAppProjectInvokeArgs()
        {
        }
        public static new GetGitopsAppProjectInvokeArgs Empty => new GetGitopsAppProjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetGitopsAppProjectResult
    {
        public readonly string AccountId;
        public readonly string AgentId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OrgId;
        public readonly string? ProjectId;
        public readonly string QueryName;

        [OutputConstructor]
        private GetGitopsAppProjectResult(
            string accountId,

            string agentId,

            string id,

            string? orgId,

            string? projectId,

            string queryName)
        {
            AccountId = accountId;
            AgentId = agentId;
            Id = id;
            OrgId = orgId;
            ProjectId = projectId;
            QueryName = queryName;
        }
    }
}