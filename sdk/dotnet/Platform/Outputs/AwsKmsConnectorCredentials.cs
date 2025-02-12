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
    public sealed class AwsKmsConnectorCredentials
    {
        /// <summary>
        /// Connect using STS assume role.
        /// </summary>
        public readonly Outputs.AwsKmsConnectorCredentialsAssumeRole? AssumeRole;
        /// <summary>
        /// Inherit the credentials from from the delegate.
        /// </summary>
        public readonly bool? InheritFromDelegate;
        /// <summary>
        /// Specify the AWS key and secret used for authenticating.
        /// </summary>
        public readonly Outputs.AwsKmsConnectorCredentialsManual? Manual;
        /// <summary>
        /// Connect using OIDC authentication.
        /// </summary>
        public readonly Outputs.AwsKmsConnectorCredentialsOidcAuthentication? OidcAuthentication;

        [OutputConstructor]
        private AwsKmsConnectorCredentials(
            Outputs.AwsKmsConnectorCredentialsAssumeRole? assumeRole,

            bool? inheritFromDelegate,

            Outputs.AwsKmsConnectorCredentialsManual? manual,

            Outputs.AwsKmsConnectorCredentialsOidcAuthentication? oidcAuthentication)
        {
            AssumeRole = assumeRole;
            InheritFromDelegate = inheritFromDelegate;
            Manual = manual;
            OidcAuthentication = oidcAuthentication;
        }
    }
}
