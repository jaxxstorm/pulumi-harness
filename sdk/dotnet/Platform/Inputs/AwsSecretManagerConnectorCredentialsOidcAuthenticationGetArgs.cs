// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AwsSecretManagerConnectorCredentialsOidcAuthenticationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IAM role ARN.
        /// </summary>
        [Input("iamRoleArn", required: true)]
        public Input<string> IamRoleArn { get; set; } = null!;

        public AwsSecretManagerConnectorCredentialsOidcAuthenticationGetArgs()
        {
        }
        public static new AwsSecretManagerConnectorCredentialsOidcAuthenticationGetArgs Empty => new AwsSecretManagerConnectorCredentialsOidcAuthenticationGetArgs();
    }
}
