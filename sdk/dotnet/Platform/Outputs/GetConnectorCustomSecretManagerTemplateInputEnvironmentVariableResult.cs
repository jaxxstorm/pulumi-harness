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
    public sealed class GetConnectorCustomSecretManagerTemplateInputEnvironmentVariableResult
    {
        public readonly bool Default;
        /// <summary>
        /// : Name of the resource.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// : Type of the custom secrets manager, typically set to `CustomSecretManager`.
        /// </summary>
        public readonly string Type;
        public readonly string Value;

        [OutputConstructor]
        private GetConnectorCustomSecretManagerTemplateInputEnvironmentVariableResult(
            bool @default,

            string name,

            string type,

            string value)
        {
            Default = @default;
            Name = name;
            Type = type;
            Value = value;
        }
    }
}
