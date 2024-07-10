// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Outputs
{

    [OutputType]
    public sealed class GcpProxyCertificates
    {
        /// <summary>
        /// Certificate secret ID
        /// </summary>
        public readonly string CertSecretId;
        /// <summary>
        /// Private key secret ID
        /// </summary>
        public readonly string KeySecretId;

        [OutputConstructor]
        private GcpProxyCertificates(
            string certSecretId,

            string keySecretId)
        {
            CertSecretId = certSecretId;
            KeySecretId = keySecretId;
        }
    }
}
