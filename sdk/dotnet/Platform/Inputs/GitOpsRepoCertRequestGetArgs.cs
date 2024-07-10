// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsRepoCertRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificates")]
        private InputList<Inputs.GitOpsRepoCertRequestCertificateGetArgs>? _certificates;

        /// <summary>
        /// certificates details.
        /// </summary>
        public InputList<Inputs.GitOpsRepoCertRequestCertificateGetArgs> Certificates
        {
            get => _certificates ?? (_certificates = new InputList<Inputs.GitOpsRepoCertRequestCertificateGetArgs>());
            set => _certificates = value;
        }

        /// <summary>
        /// Indicates if the GitOps repository certificate should be updated if existing and inserted if not.
        /// </summary>
        [Input("upsert")]
        public Input<bool>? Upsert { get; set; }

        public GitOpsRepoCertRequestGetArgs()
        {
        }
        public static new GitOpsRepoCertRequestGetArgs Empty => new GitOpsRepoCertRequestGetArgs();
    }
}
