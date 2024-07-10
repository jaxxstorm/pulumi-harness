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
    public sealed class GitOpsRepoCertRequestCertificateMetadata
    {
        /// <summary>
        /// continue may be set if the user set a limit on the number of items returned.
        /// </summary>
        public readonly string? Continue;
        /// <summary>
        /// subsequent items in the list.
        /// </summary>
        public readonly string? RemainingItemCount;
        /// <summary>
        /// Identifies the server's internal version.
        /// </summary>
        public readonly string? ResourceVersion;
        /// <summary>
        /// selfLink is a URL representing this object.
        /// </summary>
        public readonly string? SelfLink;

        [OutputConstructor]
        private GitOpsRepoCertRequestCertificateMetadata(
            string? @continue,

            string? remainingItemCount,

            string? resourceVersion,

            string? selfLink)
        {
            Continue = @continue;
            RemainingItemCount = remainingItemCount;
            ResourceVersion = resourceVersion;
            SelfLink = selfLink;
        }
    }
}
