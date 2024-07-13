// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class KubernetesConnectorServiceAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("caCertRef")]
        public Input<string>? CaCertRef { get; set; }

        /// <summary>
        /// The URL of the Kubernetes cluster.
        /// </summary>
        [Input("masterUrl", required: true)]
        public Input<string> MasterUrl { get; set; } = null!;

        /// <summary>
        /// Reference to the secret containing the service account token for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("serviceAccountTokenRef", required: true)]
        public Input<string> ServiceAccountTokenRef { get; set; } = null!;

        public KubernetesConnectorServiceAccountArgs()
        {
        }
        public static new KubernetesConnectorServiceAccountArgs Empty => new KubernetesConnectorServiceAccountArgs();
    }
}