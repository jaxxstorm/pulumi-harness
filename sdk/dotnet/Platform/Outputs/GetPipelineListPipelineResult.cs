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
    public sealed class GetPipelineListPipelineResult
    {
        public readonly string Identifier;
        public readonly string Name;

        [OutputConstructor]
        private GetPipelineListPipelineResult(
            string identifier,

            string name)
        {
            Identifier = identifier;
            Name = name;
        }
    }
}
