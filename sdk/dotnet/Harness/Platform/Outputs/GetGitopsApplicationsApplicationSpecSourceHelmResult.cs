// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GetGitopsApplicationsApplicationSpecSourceHelmResult
    {
        public readonly ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourceHelmFileParameterResult> FileParameters;
        public readonly ImmutableArray<Outputs.GetGitopsApplicationsApplicationSpecSourceHelmParameterResult> Parameters;
        public readonly bool? PassCredentials;
        public readonly string? ReleaseName;
        public readonly ImmutableArray<string> ValueFiles;
        public readonly string? Values;
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
