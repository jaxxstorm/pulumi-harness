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
    public sealed class GitOpsApplicationsApplication
    {
        /// <summary>
        /// Metadata corresponding to the resources. This includes all the objects a user must create.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationMetadata> Metadatas;
        /// <summary>
        /// Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpec> Specs;

        [OutputConstructor]
        private GitOpsApplicationsApplication(
            ImmutableArray<Outputs.GitOpsApplicationsApplicationMetadata> metadatas,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpec> specs)
        {
            Metadatas = metadatas;
            Specs = specs;
        }
    }
}
