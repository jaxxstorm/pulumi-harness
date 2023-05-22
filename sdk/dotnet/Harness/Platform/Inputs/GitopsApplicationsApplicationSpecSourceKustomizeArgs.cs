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

    public sealed class GitopsApplicationsApplicationSpecSourceKustomizeArgs : global::Pulumi.ResourceArgs
    {
        [Input("commonAnnotations")]
        private InputMap<string>? _commonAnnotations;
        public InputMap<string> CommonAnnotations
        {
            get => _commonAnnotations ?? (_commonAnnotations = new InputMap<string>());
            set => _commonAnnotations = value;
        }

        [Input("commonLabels")]
        private InputMap<string>? _commonLabels;
        public InputMap<string> CommonLabels
        {
            get => _commonLabels ?? (_commonLabels = new InputMap<string>());
            set => _commonLabels = value;
        }

        [Input("forceCommonAnnotations")]
        public Input<bool>? ForceCommonAnnotations { get; set; }

        [Input("forceCommonLabels")]
        public Input<bool>? ForceCommonLabels { get; set; }

        [Input("images")]
        private InputList<string>? _images;
        public InputList<string> Images
        {
            get => _images ?? (_images = new InputList<string>());
            set => _images = value;
        }

        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        [Input("nameSuffix")]
        public Input<string>? NameSuffix { get; set; }

        [Input("version")]
        public Input<string>? Version { get; set; }

        public GitopsApplicationsApplicationSpecSourceKustomizeArgs()
        {
        }
        public static new GitopsApplicationsApplicationSpecSourceKustomizeArgs Empty => new GitopsApplicationsApplicationSpecSourceKustomizeArgs();
    }
}
