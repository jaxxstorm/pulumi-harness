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
    public sealed class GetGitopsApplicationsApplicationSpecSourceHelmResult
    {
        /// <summary>
        /// File parameters to the helm template.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourceHelmFileParameterResult> FileParameters;
        /// <summary>
        /// List of helm parameters which are passed to the helm template command upon manifest generation.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourceHelmParameterResult> Parameters;
        /// <summary>
        /// Indicates if to pass credentials to all domains (helm's --pass-credentials)
        /// </summary>
        public readonly bool? PassCredentials;
        /// <summary>
        /// Helm release name to use. If omitted it will use the GitOps application name.
        /// </summary>
        public readonly string? ReleaseName;
        /// <summary>
        /// List of helm value files to use when generating a template.
        /// </summary>
        public readonly ImmutableArray<string> ValueFiles;
        /// <summary>
        /// Helm values to be passed to helm template, typically defined as a block.
        /// </summary>
        public readonly string? Values;
        /// <summary>
        /// Helm version to use for templating (either "2" or "3")
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecSourceHelmResult(
            ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourceHelmFileParameterResult> fileParameters,

            ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourceHelmParameterResult> parameters,

            bool? passCredentials,

            string? releaseName,

            ImmutableArray<string> valueFiles,

            string? values,

            string? version)
        {
            FileParameters = fileParameters;
            Parameters = parameters;
            PassCredentials = passCredentials;
            ReleaseName = releaseName;
            ValueFiles = valueFiles;
            Values = values;
            Version = version;
        }
    }
}
