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
    public sealed class SecretTextAdditionalMetadataValue
    {
        public readonly string? Version;

        [OutputConstructor]
        private SecretTextAdditionalMetadataValue(string? version)
        {
            Version = version;
        }
    }
}
