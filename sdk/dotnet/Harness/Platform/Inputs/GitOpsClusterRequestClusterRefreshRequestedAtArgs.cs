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

    public sealed class GitOpsClusterRequestClusterRefreshRequestedAtArgs : global::Pulumi.ResourceArgs
    {
        [Input("nanos")]
        public Input<int>? Nanos { get; set; }

        [Input("seconds")]
        public Input<string>? Seconds { get; set; }

        public GitOpsClusterRequestClusterRefreshRequestedAtArgs()
        {
        }
        public static new GitOpsClusterRequestClusterRefreshRequestedAtArgs Empty => new GitOpsClusterRequestClusterRefreshRequestedAtArgs();
    }
}
