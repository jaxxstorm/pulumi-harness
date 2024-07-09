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
    public sealed class RuleVmHttpHealth
    {
        /// <summary>
        /// API path to use for health check
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Health check port on the VM
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Protocol can be http or https
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// Lower limit for acceptable status code
        /// </summary>
        public readonly int? StatusCodeFrom;
        /// <summary>
        /// Upper limit for acceptable status code
        /// </summary>
        public readonly int? StatusCodeTo;
        /// <summary>
        /// Health check timeout
        /// </summary>
        public readonly int? Timeout;

        [OutputConstructor]
        private RuleVmHttpHealth(
            string? path,

            int port,

            string protocol,

            int? statusCodeFrom,

            int? statusCodeTo,

            int? timeout)
        {
            Path = path;
            Port = port;
            Protocol = protocol;
            StatusCodeFrom = statusCodeFrom;
            StatusCodeTo = statusCodeTo;
            Timeout = timeout;
        }
    }
}
