// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AwsConnectorIrsaGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("delegateSelectors", required: true)]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// The delegates to inherit the credentials from.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Test Region to perform Connection test of AWS Connector.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public AwsConnectorIrsaGetArgs()
        {
        }
        public static new AwsConnectorIrsaGetArgs Empty => new AwsConnectorIrsaGetArgs();
    }
}
