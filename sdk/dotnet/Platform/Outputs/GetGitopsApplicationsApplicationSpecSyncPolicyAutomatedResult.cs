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
    public sealed class GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedResult
    {
        /// <summary>
        /// Indicates to allows apps to have zero live resources (default: false).
        /// </summary>
        public readonly bool AllowEmpty;
        /// <summary>
        /// Indicates whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync (default: false).
        /// </summary>
        public readonly bool Prune;
        /// <summary>
        /// Indicates whether to revert resources back to their desired state upon modification in the cluster (default: false).
        /// </summary>
        public readonly bool SelfHeal;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedResult(
            bool allowEmpty,

            bool prune,

            bool selfHeal)
        {
            AllowEmpty = allowEmpty;
            Prune = prune;
            SelfHeal = selfHeal;
        }
    }
}
