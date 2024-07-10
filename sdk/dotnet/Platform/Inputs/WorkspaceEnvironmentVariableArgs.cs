// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class WorkspaceEnvironmentVariableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Key is the identifier for the variable. Must be unique within the workspace.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Value is the value of the variable. For string value types this field should contain the value of the variable. For secret value types this should contain a reference to a valid harness secret.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        /// <summary>
        /// Value type indicates the value type of the variable. Currently we support string and secret.
        /// </summary>
        [Input("valueType", required: true)]
        public Input<string> ValueType { get; set; } = null!;

        public WorkspaceEnvironmentVariableArgs()
        {
        }
        public static new WorkspaceEnvironmentVariableArgs Empty => new WorkspaceEnvironmentVariableArgs();
    }
}
