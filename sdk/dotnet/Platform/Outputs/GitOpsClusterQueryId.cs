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
    public sealed class GitOpsClusterQueryId
    {
        /// <summary>
        /// Type of the specified GitOps cluster identifier ( 'server' - default, 'name' ).
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Cluster server URL or the cluster name.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private GitOpsClusterQueryId(
            string? type,

            string? value)
        {
            Type = type;
            Value = value;
        }
    }
}
