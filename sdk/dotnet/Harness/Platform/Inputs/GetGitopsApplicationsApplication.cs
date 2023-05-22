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

    public sealed class GetGitopsApplicationsApplicationArgs : global::Pulumi.InvokeArgs
    {
        [Input("metadatas")]
        private List<Inputs.GetGitopsApplicationsApplicationMetadataArgs>? _metadatas;

        /// <summary>
        /// Metadata corresponding to the resources. This includes all the objects a user must create.
        /// </summary>
        public List<Inputs.GetGitopsApplicationsApplicationMetadataArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new List<Inputs.GetGitopsApplicationsApplicationMetadataArgs>());
            set => _metadatas = value;
        }

        [Input("specs")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecArgs>? _specs;

        /// <summary>
        /// Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
        /// </summary>
        public List<Inputs.GetGitopsApplicationsApplicationSpecArgs> Specs
        {
            get => _specs ?? (_specs = new List<Inputs.GetGitopsApplicationsApplicationSpecArgs>());
            set => _specs = value;
        }

        public GetGitopsApplicationsApplicationArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationArgs Empty => new GetGitopsApplicationsApplicationArgs();
    }
}
