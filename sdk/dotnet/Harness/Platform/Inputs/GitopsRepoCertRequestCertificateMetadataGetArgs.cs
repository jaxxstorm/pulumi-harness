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

    public sealed class GitopsRepoCertRequestCertificateMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("continue")]
        public Input<string>? Continue { get; set; }

        [Input("remainingItemCount")]
        public Input<string>? RemainingItemCount { get; set; }

        [Input("resourceVersion")]
        public Input<string>? ResourceVersion { get; set; }

        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        public GitopsRepoCertRequestCertificateMetadataGetArgs()
        {
        }
        public static new GitopsRepoCertRequestCertificateMetadataGetArgs Empty => new GitopsRepoCertRequestCertificateMetadataGetArgs();
    }
}
