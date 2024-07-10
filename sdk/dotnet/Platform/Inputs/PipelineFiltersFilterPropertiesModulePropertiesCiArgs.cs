// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class PipelineFiltersFilterPropertiesModulePropertiesCiArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Branch which was used while building.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// Build type of the pipeline. Possible values: branch.
        /// </summary>
        [Input("buildType")]
        public Input<string>? BuildType { get; set; }

        /// <summary>
        /// CI execution info for the pipeline.
        /// </summary>
        [Input("ciExecutionInfo")]
        public Input<Inputs.PipelineFiltersFilterPropertiesModulePropertiesCiCiExecutionInfoArgs>? CiExecutionInfo { get; set; }

        /// <summary>
        /// name of the repository used in the pipeline.
        /// </summary>
        [Input("repoNames")]
        public Input<string>? RepoNames { get; set; }

        /// <summary>
        /// Tags to associate with the CI pipeline resource.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        public PipelineFiltersFilterPropertiesModulePropertiesCiArgs()
        {
        }
        public static new PipelineFiltersFilterPropertiesModulePropertiesCiArgs Empty => new PipelineFiltersFilterPropertiesModulePropertiesCiArgs();
    }
}
