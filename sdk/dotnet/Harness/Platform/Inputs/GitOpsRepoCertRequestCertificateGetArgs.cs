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

    public sealed class GitOpsRepoCertRequestCertificateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("items")]
        private InputList<Inputs.GitOpsRepoCertRequestCertificateItemGetArgs>? _items;
        public InputList<Inputs.GitOpsRepoCertRequestCertificateItemGetArgs> Items
        {
            get => _items ?? (_items = new InputList<Inputs.GitOpsRepoCertRequestCertificateItemGetArgs>());
            set => _items = value;
        }

        [Input("metadatas")]
        private InputList<Inputs.GitOpsRepoCertRequestCertificateMetadataGetArgs>? _metadatas;
        public InputList<Inputs.GitOpsRepoCertRequestCertificateMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.GitOpsRepoCertRequestCertificateMetadataGetArgs>());
            set => _metadatas = value;
        }

        public GitOpsRepoCertRequestCertificateGetArgs()
        {
        }
        public static new GitOpsRepoCertRequestCertificateGetArgs Empty => new GitOpsRepoCertRequestCertificateGetArgs();
    }
}
