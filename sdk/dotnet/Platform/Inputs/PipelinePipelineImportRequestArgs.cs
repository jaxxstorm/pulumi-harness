// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class PipelinePipelineImportRequestArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the pipeline.
        /// </summary>
        [Input("pipelineDescription")]
        public Input<string>? PipelineDescription { get; set; }

        /// <summary>
        /// Name of the pipeline.
        /// </summary>
        [Input("pipelineName")]
        public Input<string>? PipelineName { get; set; }

        public PipelinePipelineImportRequestArgs()
        {
        }
        public static new PipelinePipelineImportRequestArgs Empty => new PipelinePipelineImportRequestArgs();
    }
}
