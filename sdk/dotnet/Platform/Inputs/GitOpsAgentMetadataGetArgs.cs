// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsAgentMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates if the agent is deployed in HA mode.
        /// </summary>
        [Input("highAvailability")]
        public Input<bool>? HighAvailability { get; set; }

        /// <summary>
        /// Indicates if the agent is namespaced.
        /// </summary>
        [Input("isNamespaced")]
        public Input<bool>? IsNamespaced { get; set; }

        /// <summary>
        /// The kubernetes namespace where the agent should be installed.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        public GitOpsAgentMetadataGetArgs()
        {
        }
        public static new GitOpsAgentMetadataGetArgs Empty => new GitOpsAgentMetadataGetArgs();
    }
}
