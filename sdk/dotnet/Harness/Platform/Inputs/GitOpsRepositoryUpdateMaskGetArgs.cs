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

    public sealed class GitOpsRepositoryUpdateMaskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("paths")]
        private InputList<string>? _paths;
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        public GitOpsRepositoryUpdateMaskGetArgs()
        {
        }
        public static new GitOpsRepositoryUpdateMaskGetArgs Empty => new GitOpsRepositoryUpdateMaskGetArgs();
    }
}
