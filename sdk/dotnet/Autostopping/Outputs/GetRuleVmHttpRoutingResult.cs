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
    public sealed class GetRuleVmHttpRoutingResult
    {
        /// <summary>
        /// Organization Identifier for the Entity
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// Port on the proxy
        /// </summary>
        public readonly int? SourcePort;
        /// <summary>
        /// Source protocol of the proxy can be http or https
        /// </summary>
        public readonly string SourceProtocol;
        /// <summary>
        /// Port on the VM
        /// </summary>
        public readonly int? TargetPort;
        /// <summary>
        /// Target protocol of the instance can be http or https
        /// </summary>
        public readonly string TargetProtocol;

        [OutputConstructor]
        private GetRuleVmHttpRoutingResult(
            string? action,

            int? sourcePort,

            string sourceProtocol,

            int? targetPort,

            string targetProtocol)
        {
            Action = action;
            SourcePort = sourcePort;
            SourceProtocol = sourceProtocol;
            TargetPort = targetPort;
            TargetProtocol = targetProtocol;
        }
    }
}
