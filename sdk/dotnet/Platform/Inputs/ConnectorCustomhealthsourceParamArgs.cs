// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class ConnectorCustomhealthsourceParamArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the Harness secret containing the encrypted value. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("encryptedValueRef")]
        public Input<string>? EncryptedValueRef { get; set; }

        /// <summary>
        /// Key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// Encrypted value.
        /// </summary>
        [Input("valueEncrypted")]
        public Input<bool>? ValueEncrypted { get; set; }

        public ConnectorCustomhealthsourceParamArgs()
        {
        }
        public static new ConnectorCustomhealthsourceParamArgs Empty => new ConnectorCustomhealthsourceParamArgs();
    }
}
