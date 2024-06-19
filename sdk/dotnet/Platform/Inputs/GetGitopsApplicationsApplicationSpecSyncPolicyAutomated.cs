// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicates to allows apps to have zero live resources (default: false).
        /// </summary>
        [Input("allowEmpty")]
        public bool? AllowEmpty { get; set; }

        /// <summary>
        /// Indicates whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync (default: false).
        /// </summary>
        [Input("prune")]
        public bool? Prune { get; set; }

        /// <summary>
        /// Indicates whether to revert resources back to their desired state upon modification in the cluster (default: false).
        /// </summary>
        [Input("selfHeal")]
        public bool? SelfHeal { get; set; }

        public GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs Empty => new GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs();
    }
}
