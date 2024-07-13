// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsProjectProjectMetadataArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A sequence number representing a specific generation of the desired state.
        /// </summary>
        [Input("generation")]
        public string? Generation { get; set; }

        /// <summary>
        /// Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The namespace where the GitOps project should be created.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        public GetGitopsProjectProjectMetadataArgs()
        {
        }
        public static new GetGitopsProjectProjectMetadataArgs Empty => new GetGitopsProjectProjectMetadataArgs();
    }
}