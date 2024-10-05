// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetRepoRuleBranch
    {
        /// <summary>
        /// Data source for retrieving a Harness repo branch rule.
        /// </summary>
        public static Task<GetRepoRuleBranchResult> InvokeAsync(GetRepoRuleBranchArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRepoRuleBranchResult>("harness:platform/getRepoRuleBranch:getRepoRuleBranch", args ?? new GetRepoRuleBranchArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness repo branch rule.
        /// </summary>
        public static Output<GetRepoRuleBranchResult> Invoke(GetRepoRuleBranchInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRepoRuleBranchResult>("harness:platform/getRepoRuleBranch:getRepoRuleBranch", args ?? new GetRepoRuleBranchInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRepoRuleBranchArgs : global::Pulumi.InvokeArgs
    {
        [Input("bypasses", required: true)]
        private List<Inputs.GetRepoRuleBranchBypassArgs>? _bypasses;

        /// <summary>
        /// List of users who can bypass this rule.
        /// </summary>
        public List<Inputs.GetRepoRuleBranchBypassArgs> Bypasses
        {
            get => _bypasses ?? (_bypasses = new List<Inputs.GetRepoRuleBranchBypassArgs>());
            set => _bypasses = value;
        }

        /// <summary>
        /// Description of the rule.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// Identifier of the rule.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        [Input("patterns")]
        private List<Inputs.GetRepoRuleBranchPatternArgs>? _patterns;

        /// <summary>
        /// Pattern of branch to which rule will apply.
        /// </summary>
        public List<Inputs.GetRepoRuleBranchPatternArgs> Patterns
        {
            get => _patterns ?? (_patterns = new List<Inputs.GetRepoRuleBranchPatternArgs>());
            set => _patterns = value;
        }

        [Input("policies", required: true)]
        private List<Inputs.GetRepoRuleBranchPolicyArgs>? _policies;

        /// <summary>
        /// Policies to be applied for this rule.
        /// </summary>
        public List<Inputs.GetRepoRuleBranchPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new List<Inputs.GetRepoRuleBranchPolicyArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Repo identifier of the repository.
        /// </summary>
        [Input("repoIdentifier", required: true)]
        public string RepoIdentifier { get; set; } = null!;

        /// <summary>
        /// State of the rule (active, disable, monitor).
        /// </summary>
        [Input("state", required: true)]
        public string State { get; set; } = null!;

        public GetRepoRuleBranchArgs()
        {
        }
        public static new GetRepoRuleBranchArgs Empty => new GetRepoRuleBranchArgs();
    }

    public sealed class GetRepoRuleBranchInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("bypasses", required: true)]
        private InputList<Inputs.GetRepoRuleBranchBypassInputArgs>? _bypasses;

        /// <summary>
        /// List of users who can bypass this rule.
        /// </summary>
        public InputList<Inputs.GetRepoRuleBranchBypassInputArgs> Bypasses
        {
            get => _bypasses ?? (_bypasses = new InputList<Inputs.GetRepoRuleBranchBypassInputArgs>());
            set => _bypasses = value;
        }

        /// <summary>
        /// Description of the rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Identifier of the rule.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("patterns")]
        private InputList<Inputs.GetRepoRuleBranchPatternInputArgs>? _patterns;

        /// <summary>
        /// Pattern of branch to which rule will apply.
        /// </summary>
        public InputList<Inputs.GetRepoRuleBranchPatternInputArgs> Patterns
        {
            get => _patterns ?? (_patterns = new InputList<Inputs.GetRepoRuleBranchPatternInputArgs>());
            set => _patterns = value;
        }

        [Input("policies", required: true)]
        private InputList<Inputs.GetRepoRuleBranchPolicyInputArgs>? _policies;

        /// <summary>
        /// Policies to be applied for this rule.
        /// </summary>
        public InputList<Inputs.GetRepoRuleBranchPolicyInputArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.GetRepoRuleBranchPolicyInputArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Repo identifier of the repository.
        /// </summary>
        [Input("repoIdentifier", required: true)]
        public Input<string> RepoIdentifier { get; set; } = null!;

        /// <summary>
        /// State of the rule (active, disable, monitor).
        /// </summary>
        [Input("state", required: true)]
        public Input<string> State { get; set; } = null!;

        public GetRepoRuleBranchInvokeArgs()
        {
        }
        public static new GetRepoRuleBranchInvokeArgs Empty => new GetRepoRuleBranchInvokeArgs();
    }


    [OutputType]
    public sealed class GetRepoRuleBranchResult
    {
        /// <summary>
        /// List of users who can bypass this rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepoRuleBranchBypassResult> Bypasses;
        /// <summary>
        /// Timestamp when the rule was created.
        /// </summary>
        public readonly int Created;
        /// <summary>
        /// ID of the user who created the rule.
        /// </summary>
        public readonly int CreatedBy;
        /// <summary>
        /// Description of the rule.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the rule.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Pattern of branch to which rule will apply.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepoRuleBranchPatternResult> Patterns;
        /// <summary>
        /// Policies to be applied for this rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepoRuleBranchPolicyResult> Policies;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Repo identifier of the repository.
        /// </summary>
        public readonly string RepoIdentifier;
        /// <summary>
        /// State of the rule (active, disable, monitor).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Timestamp when the rule was updated.
        /// </summary>
        public readonly int Updated;
        /// <summary>
        /// ID of the user who updated the rule.
        /// </summary>
        public readonly int UpdatedBy;

        [OutputConstructor]
        private GetRepoRuleBranchResult(
            ImmutableArray<Outputs.GetRepoRuleBranchBypassResult> bypasses,

            int created,

            int createdBy,

            string? description,

            string id,

            string identifier,

            string? orgId,

            ImmutableArray<Outputs.GetRepoRuleBranchPatternResult> patterns,

            ImmutableArray<Outputs.GetRepoRuleBranchPolicyResult> policies,

            string? projectId,

            string repoIdentifier,

            string state,

            int updated,

            int updatedBy)
        {
            Bypasses = bypasses;
            Created = created;
            CreatedBy = createdBy;
            Description = description;
            Id = id;
            Identifier = identifier;
            OrgId = orgId;
            Patterns = patterns;
            Policies = policies;
            ProjectId = projectId;
            RepoIdentifier = repoIdentifier;
            State = state;
            Updated = updated;
            UpdatedBy = updatedBy;
        }
    }
}