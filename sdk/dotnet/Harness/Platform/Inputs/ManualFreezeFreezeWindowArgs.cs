// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class ManualFreezeFreezeWindowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Duration of the freeze
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// End time of the freeze
        /// </summary>
        [Input("endTime")]
        public Input<string>? EndTime { get; set; }

        [Input("recurrences")]
        private InputList<Inputs.ManualFreezeFreezeWindowRecurrenceArgs>? _recurrences;
        public InputList<Inputs.ManualFreezeFreezeWindowRecurrenceArgs> Recurrences
        {
            get => _recurrences ?? (_recurrences = new InputList<Inputs.ManualFreezeFreezeWindowRecurrenceArgs>());
            set => _recurrences = value;
        }

        /// <summary>
        /// Start time of the freeze
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// Timezone
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        public ManualFreezeFreezeWindowArgs()
        {
        }
        public static new ManualFreezeFreezeWindowArgs Empty => new ManualFreezeFreezeWindowArgs();
    }
}
