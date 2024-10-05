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
    public sealed class GetServiceNowConnectorAuthRefreshTokenResult
    {
        /// <summary>
        /// Reference to a secret containing the client id to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string ClientIdRef;
        /// <summary>
        /// Reference to a secret containing the client secret to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string ClientSecretRef;
        /// <summary>
        /// Reference to a secret containing the refresh token to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string RefreshTokenRef;
        /// <summary>
        /// Scope string to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string Scope;
        /// <summary>
        /// Token url to use for authentication.
        /// </summary>
        public readonly string TokenUrl;

        [OutputConstructor]
        private GetServiceNowConnectorAuthRefreshTokenResult(
            string clientIdRef,

            string clientSecretRef,

            string refreshTokenRef,

            string scope,

            string tokenUrl)
        {
            ClientIdRef = clientIdRef;
            ClientSecretRef = clientSecretRef;
            RefreshTokenRef = refreshTokenRef;
            Scope = scope;
            TokenUrl = tokenUrl;
        }
    }
}