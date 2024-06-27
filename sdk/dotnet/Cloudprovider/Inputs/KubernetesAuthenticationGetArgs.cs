// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cloudprovider.Inputs
{

    public sealed class KubernetesAuthenticationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Delegate selectors to inherit the GCP credentials from.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Service account configuration for connecting to the Kubernetes cluster
        /// </summary>
        [Input("oidc")]
        public Input<Inputs.KubernetesAuthenticationOidcGetArgs>? Oidc { get; set; }

        /// <summary>
        /// Username and password for authentication to the cluster
        /// </summary>
        [Input("serviceAccount")]
        public Input<Inputs.KubernetesAuthenticationServiceAccountGetArgs>? ServiceAccount { get; set; }

        /// <summary>
        /// Username and password for authentication to the cluster
        /// </summary>
        [Input("usernamePassword")]
        public Input<Inputs.KubernetesAuthenticationUsernamePasswordGetArgs>? UsernamePassword { get; set; }

        public KubernetesAuthenticationGetArgs()
        {
        }
        public static new KubernetesAuthenticationGetArgs Empty => new KubernetesAuthenticationGetArgs();
    }
}