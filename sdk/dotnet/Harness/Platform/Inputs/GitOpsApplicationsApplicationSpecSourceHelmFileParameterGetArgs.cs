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

    public sealed class GitOpsApplicationsApplicationSpecSourceHelmFileParameterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("path")]
        public Input<string>? Path { get; set; }

        public GitOpsApplicationsApplicationSpecSourceHelmFileParameterGetArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecSourceHelmFileParameterGetArgs Empty => new GitOpsApplicationsApplicationSpecSourceHelmFileParameterGetArgs();
    }
}
