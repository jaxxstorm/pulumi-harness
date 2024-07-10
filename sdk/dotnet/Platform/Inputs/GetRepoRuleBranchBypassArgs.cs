// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetRepoRuleBranchBypassInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allow users with repository edit permission to bypass.
        /// </summary>
        [Input("repoOwners")]
        public Input<bool>? RepoOwners { get; set; }

        [Input("userIds")]
        private InputList<string>? _userIds;

        /// <summary>
        /// List of user ids with who can bypass.
        /// </summary>
        public InputList<string> UserIds
        {
            get => _userIds ?? (_userIds = new InputList<string>());
            set => _userIds = value;
        }

        public GetRepoRuleBranchBypassInputArgs()
        {
        }
        public static new GetRepoRuleBranchBypassInputArgs Empty => new GetRepoRuleBranchBypassInputArgs();
    }
}
