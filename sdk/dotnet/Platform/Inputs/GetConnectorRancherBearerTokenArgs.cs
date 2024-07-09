// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetConnectorRancherBearerTokenInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the secret containing the bearer token for the rancher cluster. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("passwordRef", required: true)]
        public Input<string> PasswordRef { get; set; } = null!;

        /// <summary>
        /// The URL of the Rancher cluster.
        /// </summary>
        [Input("rancherUrl", required: true)]
        public Input<string> RancherUrl { get; set; } = null!;

        public GetConnectorRancherBearerTokenInputArgs()
        {
        }
        public static new GetConnectorRancherBearerTokenInputArgs Empty => new GetConnectorRancherBearerTokenInputArgs();
    }
}
