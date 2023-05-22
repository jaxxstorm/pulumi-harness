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
    public sealed class GitopsApplicationsApplicationSpecSourceHelmFileParameter
    {
        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        public readonly string? Name;
        public readonly string? Path;

        [OutputConstructor]
        private GitopsApplicationsApplicationSpecSourceHelmFileParameter(
            string? name,

            string? path)
        {
            Name = name;
            Path = path;
        }
    }
}
