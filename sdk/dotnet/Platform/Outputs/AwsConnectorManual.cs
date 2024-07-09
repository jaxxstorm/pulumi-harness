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
    public sealed class AwsConnectorManual
    {
        /// <summary>
        /// AWS access key.
        /// </summary>
        public readonly string? AccessKey;
        /// <summary>
        /// Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? AccessKeyRef;
        /// <summary>
        /// Connect only use delegates with these tags.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Test Region to perform Connection test of AWS Connector.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// Reference to the Harness secret containing the aws secret key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string SecretKeyRef;

        [OutputConstructor]
        private AwsConnectorManual(
            string? accessKey,

            string? accessKeyRef,

            ImmutableArray<string> delegateSelectors,

            string? region,

            string secretKeyRef)
        {
            AccessKey = accessKey;
            AccessKeyRef = accessKeyRef;
            DelegateSelectors = delegateSelectors;
            Region = region;
            SecretKeyRef = secretKeyRef;
        }
    }
}
