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
    public sealed class GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffResult
    {
        /// <summary>
        /// Amount to back off. Default unit is seconds, but could also be a duration (e.g. "2m", "1h").
        /// </summary>
        public readonly string Duration;
        /// <summary>
        /// Factor to multiply the base duration after each failed retry.
        /// </summary>
        public readonly string Factor;
        /// <summary>
        /// Maximum amount of time allowed of the backoff strategy.
        /// </summary>
        public readonly string MaxDuration;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffResult(
            string duration,

            string factor,

            string maxDuration)
        {
            Duration = duration;
            Factor = factor;
            MaxDuration = maxDuration;
        }
    }
}
