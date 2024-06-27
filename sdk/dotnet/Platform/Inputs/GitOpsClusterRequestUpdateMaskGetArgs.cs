// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsClusterRequestUpdateMaskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("paths")]
        private InputList<string>? _paths;

        /// <summary>
        /// The set of field mask paths.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        public GitOpsClusterRequestUpdateMaskGetArgs()
        {
        }
        public static new GitOpsClusterRequestUpdateMaskGetArgs Empty => new GitOpsClusterRequestUpdateMaskGetArgs();
    }
}