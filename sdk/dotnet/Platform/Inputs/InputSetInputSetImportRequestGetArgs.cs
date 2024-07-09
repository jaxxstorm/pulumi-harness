// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class InputSetInputSetImportRequestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the input set.
        /// </summary>
        [Input("inputSetDescription")]
        public Input<string>? InputSetDescription { get; set; }

        /// <summary>
        /// Name of the input set.
        /// </summary>
        [Input("inputSetName")]
        public Input<string>? InputSetName { get; set; }

        public InputSetInputSetImportRequestGetArgs()
        {
        }
        public static new InputSetInputSetImportRequestGetArgs Empty => new InputSetInputSetImportRequestGetArgs();
    }
}