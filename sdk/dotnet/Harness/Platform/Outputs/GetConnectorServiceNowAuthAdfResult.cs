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
    public sealed class GetConnectorServiceNowAuthAdfResult
    {
        public readonly string AdfsUrl;
        public readonly string CertificateRef;
        public readonly string ClientIdRef;
        public readonly string PrivateKeyRef;
        public readonly string ResourceIdRef;

        [OutputConstructor]
        private GetConnectorServiceNowAuthAdfResult(
            string adfsUrl,

            string certificateRef,

            string clientIdRef,

            string privateKeyRef,

            string resourceIdRef)
        {
            AdfsUrl = adfsUrl;
            CertificateRef = certificateRef;
            ClientIdRef = clientIdRef;
            PrivateKeyRef = privateKeyRef;
            ResourceIdRef = resourceIdRef;
        }
    }
}
