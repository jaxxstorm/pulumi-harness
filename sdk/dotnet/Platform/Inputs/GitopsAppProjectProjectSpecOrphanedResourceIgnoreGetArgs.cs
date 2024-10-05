// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsAppProjectProjectSpecOrphanedResourceIgnoreGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Group of the ignored orphaned resource.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// Kind of the ignored orphaned resource.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Name of the ignored orphaned resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GitopsAppProjectProjectSpecOrphanedResourceIgnoreGetArgs()
        {
        }
        public static new GitopsAppProjectProjectSpecOrphanedResourceIgnoreGetArgs Empty => new GitopsAppProjectProjectSpecOrphanedResourceIgnoreGetArgs();
    }
}