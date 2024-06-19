// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsApplicationsApplicationSpecDestinationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// URL of the target cluster and must be set to the kubernetes control plane API.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Target namespace of the GitOps application's resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Server of the destination of the GitOps application.
        /// </summary>
        [Input("server")]
        public Input<string>? Server { get; set; }

        public GitOpsApplicationsApplicationSpecDestinationGetArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecDestinationGetArgs Empty => new GitOpsApplicationsApplicationSpecDestinationGetArgs();
    }
}
