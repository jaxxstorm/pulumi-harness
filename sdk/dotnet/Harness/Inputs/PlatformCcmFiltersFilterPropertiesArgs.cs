// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Inputs
{

    public sealed class PlatformCcmFiltersFilterPropertiesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of CCM filters.
        /// </summary>
        [Input("filterType", required: true)]
        public Input<string> FilterType { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public PlatformCcmFiltersFilterPropertiesArgs()
        {
        }
        public static new PlatformCcmFiltersFilterPropertiesArgs Empty => new PlatformCcmFiltersFilterPropertiesArgs();
    }
}
