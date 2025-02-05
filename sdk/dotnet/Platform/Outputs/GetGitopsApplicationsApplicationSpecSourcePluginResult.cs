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
    public sealed class GetGitopsApplicationsApplicationSpecSourcePluginResult
    {
        /// <summary>
        /// Entry in the GitOps application's environment.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourcePluginEnvResult> Envs;
        /// <summary>
        /// Name of the plugin.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecSourcePluginResult(
            ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourcePluginEnvResult> envs,

            string? name)
        {
            Envs = envs;
            Name = name;
        }
    }
}
