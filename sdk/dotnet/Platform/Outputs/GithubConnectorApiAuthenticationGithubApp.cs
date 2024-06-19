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
    public sealed class GithubConnectorApiAuthenticationGithubApp
    {
        /// <summary>
        /// Enter the GitHub App ID from the GitHub App General tab.
        /// </summary>
        public readonly string? ApplicationId;
        /// <summary>
        /// Reference to the secret containing application id To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? ApplicationIdRef;
        /// <summary>
        /// Enter the Installation ID located in the URL of the installed GitHub App.
        /// </summary>
        public readonly string? InstallationId;
        /// <summary>
        /// Reference to the secret containing installation id. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? InstallationIdRef;
        /// <summary>
        /// Reference to the secret containing the private key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string PrivateKeyRef;

        [OutputConstructor]
        private GithubConnectorApiAuthenticationGithubApp(
            string? applicationId,

            string? applicationIdRef,

            string? installationId,

            string? installationIdRef,

            string privateKeyRef)
        {
            ApplicationId = applicationId;
            ApplicationIdRef = applicationIdRef;
            InstallationId = installationId;
            InstallationIdRef = installationIdRef;
            PrivateKeyRef = privateKeyRef;
        }
    }
}
