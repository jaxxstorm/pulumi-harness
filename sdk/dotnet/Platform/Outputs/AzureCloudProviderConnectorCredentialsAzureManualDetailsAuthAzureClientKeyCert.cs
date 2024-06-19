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
    public sealed class AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCert
    {
        /// <summary>
        /// Reference of the secret for the certificate. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? CertificateRef;

        [OutputConstructor]
        private AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCert(string? certificateRef)
        {
            CertificateRef = certificateRef;
        }
    }
}
