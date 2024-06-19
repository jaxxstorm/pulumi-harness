// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class ServiceNowConnectorAuthAdfsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// asdf URL.
        /// </summary>
        [Input("adfsUrl", required: true)]
        public Input<string> AdfsUrl { get; set; } = null!;

        /// <summary>
        /// Reference to a secret containing the certificate to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("certificateRef", required: true)]
        public Input<string> CertificateRef { get; set; } = null!;

        /// <summary>
        /// Reference to a secret containing the clientIdRef to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("clientIdRef", required: true)]
        public Input<string> ClientIdRef { get; set; } = null!;

        /// <summary>
        /// Reference to a secret containing the privateKeyRef to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("privateKeyRef", required: true)]
        public Input<string> PrivateKeyRef { get; set; } = null!;

        /// <summary>
        /// Reference to a secret containing the resourceIdRef to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("resourceIdRef", required: true)]
        public Input<string> ResourceIdRef { get; set; } = null!;

        public ServiceNowConnectorAuthAdfsGetArgs()
        {
        }
        public static new ServiceNowConnectorAuthAdfsGetArgs Empty => new ServiceNowConnectorAuthAdfsGetArgs();
    }
}
