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
    public sealed class WorkspaceTerraformVariable
    {
        /// <summary>
        /// Key is the identifier for the variable. Must be unique within the workspace.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Value is the value of the variable. For string value types this field should contain the value of the variable. For secret value types this should contain a reference to a valid harness secret.
        /// </summary>
        public readonly string Value;
        /// <summary>
        /// Value type indicates the value type of the variable. Currently we support string and secret.
        /// </summary>
        public readonly string ValueType;

        [OutputConstructor]
        private WorkspaceTerraformVariable(
            string key,

            string value,

            string valueType)
        {
            Key = key;
            Value = value;
            ValueType = valueType;
        }
    }
}
