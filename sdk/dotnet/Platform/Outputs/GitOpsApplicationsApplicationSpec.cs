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
    public sealed class GitOpsApplicationsApplicationSpec
    {
        /// <summary>
        /// Information about the GitOps application's destination.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecDestination> Destinations;
        /// <summary>
        /// Contains all information about the source of a GitOps application.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSource> Sources;
        /// <summary>
        /// Controls when a sync will be performed in response to updates in git.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSyncPolicy> SyncPolicies;

        [OutputConstructor]
        private GitOpsApplicationsApplicationSpec(
            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecDestination> destinations,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSource> sources,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSyncPolicy> syncPolicies)
        {
            Destinations = destinations;
            Sources = sources;
            SyncPolicies = syncPolicies;
        }
    }
}