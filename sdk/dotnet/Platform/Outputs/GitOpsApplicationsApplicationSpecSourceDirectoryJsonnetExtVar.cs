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
    public sealed class GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar
    {
        /// <summary>
        /// Code of the external variables of jsonnet application.
        /// </summary>
        public readonly bool? Code;
        /// <summary>
        /// Name of the external variables of jsonnet application.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Value of the external variables of jsonnet application.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar(
            bool? code,

            string? name,

            string? value)
        {
            Code = code;
            Name = name;
            Value = value;
        }
    }
}
