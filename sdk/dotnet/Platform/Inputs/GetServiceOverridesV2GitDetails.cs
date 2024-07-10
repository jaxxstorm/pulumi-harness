// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetServiceOverridesV2GitDetailsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the branch.
        /// </summary>
        [Input("branch", required: true)]
        public string Branch { get; set; } = null!;

        /// <summary>
        /// Load service yaml from fallback branch
        /// </summary>
        [Input("loadFromCache", required: true)]
        public bool LoadFromCache { get; set; }

        /// <summary>
        /// Load service yaml from fallback branch
        /// </summary>
        [Input("loadFromFallbackBranch", required: true)]
        public bool LoadFromFallbackBranch { get; set; }

        /// <summary>
        /// Repo name of remote service override
        /// </summary>
        [Input("repoName", required: true)]
        public string RepoName { get; set; } = null!;

        public GetServiceOverridesV2GitDetailsArgs()
        {
        }
        public static new GetServiceOverridesV2GitDetailsArgs Empty => new GetServiceOverridesV2GitDetailsArgs();
    }
}
