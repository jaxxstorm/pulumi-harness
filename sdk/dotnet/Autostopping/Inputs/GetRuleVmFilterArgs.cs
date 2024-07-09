// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Inputs
{

    public sealed class GetRuleVmFilterInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// Regions of instances that needs to be managed using the AutoStopping rules
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        [Input("tags")]
        private InputList<Inputs.GetRuleVmFilterTagInputArgs>? _tags;

        /// <summary>
        /// Tags of instances that needs to be managed using the AutoStopping rules
        /// </summary>
        public InputList<Inputs.GetRuleVmFilterTagInputArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.GetRuleVmFilterTagInputArgs>());
            set => _tags = value;
        }

        [Input("vmIds", required: true)]
        private InputList<string>? _vmIds;

        /// <summary>
        /// Ids of instances that needs to be managed using the AutoStopping rules
        /// </summary>
        public InputList<string> VmIds
        {
            get => _vmIds ?? (_vmIds = new InputList<string>());
            set => _vmIds = value;
        }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// Zones of instances that needs to be managed using the AutoStopping rules
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public GetRuleVmFilterInputArgs()
        {
        }
        public static new GetRuleVmFilterInputArgs Empty => new GetRuleVmFilterInputArgs();
    }
}
