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
    public static class GetGitopsAgent
    {
        /// <summary>
        /// Datasource for fetching a Harness Gitops Agents.
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
        ///     var example = Harness.Platform.GetGitopsAgent.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGitopsAgentResult> InvokeAsync(GetGitopsAgentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGitopsAgentResult>("harness:platform/getGitopsAgent:getGitopsAgent", args ?? new GetGitopsAgentArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for fetching a Harness Gitops Agents.
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
        ///     var example = Harness.Platform.GetGitopsAgent.Invoke(new()
        ///     {
        ///         AccountId = "account_id",
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGitopsAgentResult> Invoke(GetGitopsAgentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitopsAgentResult>("harness:platform/getGitopsAgent:getGitopsAgent", args ?? new GetGitopsAgentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGitopsAgentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account identifier of the GitOps agent.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Identifier of the GitOps agent.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the GitOps agent.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Project identifier of the GitOps agent.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetGitopsAgentArgs()
        {
        }
        public static new GetGitopsAgentArgs Empty => new GetGitopsAgentArgs();
    }

    public sealed class GetGitopsAgentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account identifier of the GitOps agent.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Identifier of the GitOps agent.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the GitOps agent.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project identifier of the GitOps agent.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetGitopsAgentInvokeArgs()
        {
        }
        public static new GetGitopsAgentInvokeArgs Empty => new GetGitopsAgentInvokeArgs();
    }


    [OutputType]
    public sealed class GetGitopsAgentResult
    {
        /// <summary>
        /// Account identifier of the GitOps agent.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Description of the GitOps agent.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the GitOps agent.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Metadata of the agent.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsAgentMetadataResult> Metadatas;
        /// <summary>
        /// Name of the GitOps agent.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Organization identifier of the GitOps agent.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Project identifier of the GitOps agent.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Tags for the GitOps agents. These can be used to search or filter the GitOps agents.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Default: "AGENT*TYPE*UNSET"
        /// Enum: "AGENT*TYPE*UNSET" "CONNECTED*ARGO*PROVIDER" "MANAGED*ARGO*PROVIDER"
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetGitopsAgentResult(
            string accountId,

            string description,

            string id,

            string identifier,

            ImmutableArray<Outputs.GetGitopsAgentMetadataResult> metadatas,

            string name,

            string? orgId,

            string? projectId,

            ImmutableDictionary<string, string> tags,

            string type)
        {
            AccountId = accountId;
            Description = description;
            Id = id;
            Identifier = identifier;
            Metadatas = metadatas;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
            Type = type;
        }
    }
}
