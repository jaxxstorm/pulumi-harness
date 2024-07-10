// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class InfrastructureGitDetailsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the default branch (this checks out a new branch titled by branch_name).
        /// </summary>
        [Input("baseBranch")]
        public Input<string>? BaseBranch { get; set; }

        /// <summary>
        /// Name of the branch.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// message for the commit in Git Repo.
        /// </summary>
        [Input("commitMessage")]
        public Input<string>? CommitMessage { get; set; }

        /// <summary>
        /// Identifier of the Harness Connector used for importing entity from Git To reference a connector at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a connector at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("connectorRef")]
        public Input<string>? ConnectorRef { get; set; }

        /// <summary>
        /// File path of the Entity in the repository.
        /// </summary>
        [Input("filePath")]
        public Input<string>? FilePath { get; set; }

        /// <summary>
        /// Flag to set if importing from Git
        /// </summary>
        [Input("importFromGit")]
        public Input<bool>? ImportFromGit { get; set; }

        /// <summary>
        /// Flag to set if force importing from Git
        /// </summary>
        [Input("isForceImport")]
        public Input<bool>? IsForceImport { get; set; }

        /// <summary>
        /// If the gitProvider is HarnessCode
        /// </summary>
        [Input("isHarnesscodeRepo")]
        public Input<bool>? IsHarnesscodeRepo { get; set; }

        /// <summary>
        /// If a new branch creation is requested.
        /// </summary>
        [Input("isNewBranch")]
        public Input<bool>? IsNewBranch { get; set; }

        /// <summary>
        /// Last commit identifier (for Git Repositories other than Github). To be provided only when updating Infrastructures.
        /// </summary>
        [Input("lastCommitId")]
        public Input<string>? LastCommitId { get; set; }

        /// <summary>
        /// Last object identifier (for Github). To be provided only when updating Infrastructures.
        /// </summary>
        [Input("lastObjectId")]
        public Input<string>? LastObjectId { get; set; }

        /// <summary>
        /// If the Entity is to be fetched from cache
        /// </summary>
        [Input("loadFromCache")]
        public Input<string>? LoadFromCache { get; set; }

        /// <summary>
        /// Whether the file has to be get from fallback_branch.
        /// </summary>
        [Input("loadFromFallbackBranch")]
        public Input<bool>? LoadFromFallbackBranch { get; set; }

        /// <summary>
        /// Identifier of the Harness Connector used for CRUD operations on the Parent Entity. To reference a connector at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a connector at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("parentEntityConnectorRef")]
        public Input<string>? ParentEntityConnectorRef { get; set; }

        /// <summary>
        /// Name of the repository where parent entity lies.
        /// </summary>
        [Input("parentEntityRepoName")]
        public Input<string>? ParentEntityRepoName { get; set; }

        /// <summary>
        /// Name of the repository.
        /// </summary>
        [Input("repoName")]
        public Input<string>? RepoName { get; set; }

        /// <summary>
        /// store type of the entity.
        /// </summary>
        [Input("storeType")]
        public Input<string>? StoreType { get; set; }

        public InfrastructureGitDetailsArgs()
        {
        }
        public static new InfrastructureGitDetailsArgs Empty => new InfrastructureGitDetailsArgs();
    }
}
