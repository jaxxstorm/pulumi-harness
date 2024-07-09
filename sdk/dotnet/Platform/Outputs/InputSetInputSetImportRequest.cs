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
    public sealed class InputSetInputSetImportRequest
    {
        /// <summary>
        /// Description of the input set.
        /// </summary>
        public readonly string? InputSetDescription;
        /// <summary>
        /// Name of the input set.
        /// </summary>
        public readonly string? InputSetName;

        [OutputConstructor]
        private InputSetInputSetImportRequest(
            string? inputSetDescription,

            string? inputSetName)
        {
            InputSetDescription = inputSetDescription;
            InputSetName = inputSetName;
        }
    }
}