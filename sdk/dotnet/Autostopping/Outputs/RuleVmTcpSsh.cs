// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Outputs
{

    [OutputType]
    public sealed class RuleVmTcpSsh
    {
        /// <summary>
        /// Port to listen on the proxy
        /// </summary>
        public readonly int? ConnectOn;
        /// <summary>
        /// Port to listen on the vm
        /// </summary>
        public readonly int? Port;

        [OutputConstructor]
        private RuleVmTcpSsh(
            int? connectOn,

            int? port)
        {
            ConnectOn = connectOn;
            Port = port;
        }
    }
}
