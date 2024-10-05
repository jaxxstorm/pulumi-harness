// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetRepoRuleBranchPatternResult
    {
        /// <summary>
        /// Should rule apply to default branch of the repository.
        /// </summary>
        public readonly bool? DefaultBranch;
        /// <summary>
        /// Globstar branch patterns on which rules will NOT be applied.
        /// </summary>
        public readonly ImmutableArray<string> Excludes;
        /// <summary>
        /// Globstar branch patterns on which rules will be applied.
        /// </summary>
        public readonly ImmutableArray<string> Includes;

        [OutputConstructor]
        private GetRepoRuleBranchPatternResult(
            bool? defaultBranch,

            ImmutableArray<string> excludes,

            ImmutableArray<string> includes)
        {
            DefaultBranch = defaultBranch;
            Excludes = excludes;
            Includes = includes;
        }
    }
}