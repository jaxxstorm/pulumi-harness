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

    public sealed class GetGitopsApplicationsApplicationSpecSourcePluginArgs : global::Pulumi.InvokeArgs
    {
        [Input("envs")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginEnvArgs>? _envs;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginEnvArgs> Envs
        {
            get => _envs ?? (_envs = new List<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginEnvArgs>());
            set => _envs = value;
        }

        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetGitopsApplicationsApplicationSpecSourcePluginArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourcePluginArgs Empty => new GetGitopsApplicationsApplicationSpecSourcePluginArgs();
    }
}
