// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsProjectProjectSpecDestinationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Namespace specifies the target namespace for the application's resources.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        /// <summary>
        /// Server specifies the URL of the target cluster and must be set to the Kubernetes control plane API.
        /// </summary>
        [Input("server")]
        public string? Server { get; set; }

        public GetGitopsProjectProjectSpecDestinationArgs()
        {
        }
        public static new GetGitopsProjectProjectSpecDestinationArgs Empty => new GetGitopsProjectProjectSpecDestinationArgs();
    }
}