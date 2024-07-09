// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitOpsRepositoryGcrGenWorkloadIdentityServiceAccountRef
    {
        /// <summary>
        /// Audience specifies the `aud` claim for the service account token If the service account uses a well-known annotation for e.g. IRSA or GCP Workload Identity then this audiences will be appended to the list
        /// </summary>
        public readonly ImmutableArray<string> Audiences;
        /// <summary>
        /// The name of the ServiceAccount resource being referred to.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Namespace of the resource being referred to. Ignored if referent is not cluster-scoped. cluster-scoped defaults to the namespace of the referent.
        /// </summary>
        public readonly string? Namespace;

        [OutputConstructor]
        private GitOpsRepositoryGcrGenWorkloadIdentityServiceAccountRef(
            ImmutableArray<string> audiences,

            string? name,

            string? @namespace)
        {
            Audiences = audiences;
            Name = name;
            Namespace = @namespace;
        }
    }
}
