// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class MonitoredServiceRequestHealthSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of the health source.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the health source.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specification of the health source. Depends on the type of the health source.
        /// </summary>
        [Input("spec", required: true)]
        public Input<string> Spec { get; set; } = null!;

        /// <summary>
        /// Type of the health source.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Version of the health source.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public MonitoredServiceRequestHealthSourceArgs()
        {
        }
        public static new MonitoredServiceRequestHealthSourceArgs Empty => new MonitoredServiceRequestHealthSourceArgs();
    }
}
