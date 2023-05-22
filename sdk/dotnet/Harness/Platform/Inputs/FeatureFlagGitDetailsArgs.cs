// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class FeatureFlagGitDetailsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The commit message to use as part of a gitsync operation
        /// </summary>
        [Input("commitMsg", required: true)]
        public Input<string> CommitMsg { get; set; } = null!;

        public FeatureFlagGitDetailsArgs()
        {
        }
        public static new FeatureFlagGitDetailsArgs Empty => new FeatureFlagGitDetailsArgs();
    }
}
