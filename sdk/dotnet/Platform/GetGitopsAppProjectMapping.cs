// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetGitopsAppProjectMapping
    {
        /// <summary>
        /// Resource for managing the Harness GitOps Application Project Mappings.
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
        ///     var example = Harness.Platform.GetGitopsAppProjectMapping.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         AccountId = "account_id",
        ///         OrgId = "organization_id",
        ///         ProjectId = "project_id",
        ///         AgentId = "agent_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetGitopsAppProjectMappingResult> InvokeAsync(GetGitopsAppProjectMappingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGitopsAppProjectMappingResult>("harness:platform/getGitopsAppProjectMapping:getGitopsAppProjectMapping", args ?? new GetGitopsAppProjectMappingArgs(), options.WithDefaults());

        /// <summary>
        /// Resource for managing the Harness GitOps Application Project Mappings.
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
        ///     var example = Harness.Platform.GetGitopsAppProjectMapping.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         AccountId = "account_id",
        ///         OrgId = "organization_id",
        ///         ProjectId = "project_id",
        ///         AgentId = "agent_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetGitopsAppProjectMappingResult> Invoke(GetGitopsAppProjectMappingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitopsAppProjectMappingResult>("harness:platform/getGitopsAppProjectMapping:getGitopsAppProjectMapping", args ?? new GetGitopsAppProjectMappingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGitopsAppProjectMappingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account identifier of the GitOps agent's Application Project.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Agent identifier for which the ArgoCD and Harness project mapping is to be created.
        /// </summary>
        [Input("agentId", required: true)]
        public string AgentId { get; set; } = null!;

        /// <summary>
        /// Identifier of the GitOps Application Project.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the GitOps agent's Application Project.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// Project identifier of the GitOps agent's Application Project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetGitopsAppProjectMappingArgs()
        {
        }
        public static new GetGitopsAppProjectMappingArgs Empty => new GetGitopsAppProjectMappingArgs();
    }

    public sealed class GetGitopsAppProjectMappingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account identifier of the GitOps agent's Application Project.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Agent identifier for which the ArgoCD and Harness project mapping is to be created.
        /// </summary>
        [Input("agentId", required: true)]
        public Input<string> AgentId { get; set; } = null!;

        /// <summary>
        /// Identifier of the GitOps Application Project.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the GitOps agent's Application Project.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Project identifier of the GitOps agent's Application Project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetGitopsAppProjectMappingInvokeArgs()
        {
        }
        public static new GetGitopsAppProjectMappingInvokeArgs Empty => new GetGitopsAppProjectMappingInvokeArgs();
    }


    [OutputType]
    public sealed class GetGitopsAppProjectMappingResult
    {
        /// <summary>
        /// Account identifier of the GitOps agent's Application Project.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Agent identifier for which the ArgoCD and Harness project mapping is to be created.
        /// </summary>
        public readonly string AgentId;
        /// <summary>
        /// ArgoCD Project name which is to be mapped to the Harness project.
        /// </summary>
        public readonly string ArgoProjectName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the GitOps Application Project.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Organization identifier of the GitOps agent's Application Project.
        /// </summary>
        public readonly string OrgId;
        /// <summary>
        /// Project identifier of the GitOps agent's Application Project.
        /// </summary>
        public readonly string ProjectId;

        [OutputConstructor]
        private GetGitopsAppProjectMappingResult(
            string accountId,

            string agentId,

            string argoProjectName,

            string id,

            string identifier,

            string orgId,

            string projectId)
        {
            AccountId = accountId;
            AgentId = agentId;
            ArgoProjectName = argoProjectName;
            Id = id;
            Identifier = identifier;
            OrgId = orgId;
            ProjectId = projectId;
        }
    }
}