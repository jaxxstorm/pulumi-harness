// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cloudprovider.Inputs
{

    public sealed class KubernetesAuthenticationServiceAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Harness secret containing the CA certificate for the cluster.
        /// </summary>
        [Input("caCertificateSecretName")]
        public Input<string>? CaCertificateSecretName { get; set; }

        /// <summary>
        /// URL of the Kubernetes master to connect to.
        /// </summary>
        [Input("masterUrl", required: true)]
        public Input<string> MasterUrl { get; set; } = null!;

        /// <summary>
        /// Name of the Harness secret containing the service account token for the cluster.
        /// </summary>
        [Input("serviceAccountTokenSecretName", required: true)]
        public Input<string> ServiceAccountTokenSecretName { get; set; } = null!;

        public KubernetesAuthenticationServiceAccountArgs()
        {
        }
        public static new KubernetesAuthenticationServiceAccountArgs Empty => new KubernetesAuthenticationServiceAccountArgs();
    }
}
