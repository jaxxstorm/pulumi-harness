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

    public sealed class GitOpsClusterQueryIdGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public GitOpsClusterQueryIdGetArgs()
        {
        }
        public static new GitOpsClusterQueryIdGetArgs Empty => new GitOpsClusterQueryIdGetArgs();
    }
}
