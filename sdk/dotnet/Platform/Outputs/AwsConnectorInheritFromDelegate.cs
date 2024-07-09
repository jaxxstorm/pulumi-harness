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
    public sealed class AwsConnectorInheritFromDelegate
    {
        /// <summary>
        /// The delegates to inherit the credentials from.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Test Region to perform Connection test of AWS Connector.
        /// </summary>
        public readonly string? Region;

        [OutputConstructor]
        private AwsConnectorInheritFromDelegate(
            ImmutableArray<string> delegateSelectors,

            string? region)
        {
            DelegateSelectors = delegateSelectors;
            Region = region;
        }
    }
}
