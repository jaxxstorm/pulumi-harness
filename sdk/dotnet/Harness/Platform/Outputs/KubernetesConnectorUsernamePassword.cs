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
    public sealed class KubernetesConnectorUsernamePassword
    {
        /// <summary>
        /// The URL of the Kubernetes cluster.
        /// </summary>
        public readonly string MasterUrl;
        /// <summary>
        /// Reference to the secret containing the password for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string PasswordRef;
        /// <summary>
        /// Username for the connector.
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// Reference to the secret containing the username for the connector. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? UsernameRef;

        [OutputConstructor]
        private KubernetesConnectorUsernamePassword(
            string masterUrl,

            string passwordRef,

            string? username,

            string? usernameRef)
        {
            MasterUrl = masterUrl;
            PasswordRef = passwordRef;
            Username = username;
            UsernameRef = usernameRef;
        }
    }
}
