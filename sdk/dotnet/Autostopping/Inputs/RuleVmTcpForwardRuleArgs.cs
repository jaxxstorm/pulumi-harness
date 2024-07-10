// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Inputs
{

    public sealed class RuleVmTcpForwardRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Port to listen on the proxy
        /// </summary>
        [Input("connectOn")]
        public Input<int>? ConnectOn { get; set; }

        /// <summary>
        /// Port to listen on the vm
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        public RuleVmTcpForwardRuleArgs()
        {
        }
        public static new RuleVmTcpForwardRuleArgs Empty => new RuleVmTcpForwardRuleArgs();
    }
}
