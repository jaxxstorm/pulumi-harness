// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitopsRepoCertRequest
    {
        /// <summary>
        /// certificates details.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsRepoCertRequestCertificate> Certificates;
        /// <summary>
        /// if the Repository Certificates should be upserted.
        /// </summary>
        public readonly bool? Upsert;

        [OutputConstructor]
        private GitopsRepoCertRequest(
            ImmutableArray<Outputs.GitopsRepoCertRequestCertificate> certificates,

            bool? upsert)
        {
            Certificates = certificates;
            Upsert = upsert;
        }
    }
}
