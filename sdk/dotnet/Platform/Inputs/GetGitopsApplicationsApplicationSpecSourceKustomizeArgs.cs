// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSourceKustomizeInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("commonAnnotations")]
        private InputMap<string>? _commonAnnotations;

        /// <summary>
        /// List of additional annotations to add to rendered manifests.
        /// </summary>
        public InputMap<string> CommonAnnotations
        {
            get => _commonAnnotations ?? (_commonAnnotations = new InputMap<string>());
            set => _commonAnnotations = value;
        }

        [Input("commonLabels")]
        private InputMap<string>? _commonLabels;

        /// <summary>
        /// List of additional labels to add to rendered manifests.
        /// </summary>
        public InputMap<string> CommonLabels
        {
            get => _commonLabels ?? (_commonLabels = new InputMap<string>());
            set => _commonLabels = value;
        }

        /// <summary>
        /// Indicates if to force applying common annotations to resources for kustomize apps.
        /// </summary>
        [Input("forceCommonAnnotations")]
        public Input<bool>? ForceCommonAnnotations { get; set; }

        /// <summary>
        /// Indicates if to force apply common labels to resources for kustomize apps.
        /// </summary>
        [Input("forceCommonLabels")]
        public Input<bool>? ForceCommonLabels { get; set; }

        [Input("images")]
        private InputList<string>? _images;

        /// <summary>
        /// List of kustomize image override specifications.
        /// </summary>
        public InputList<string> Images
        {
            get => _images ?? (_images = new InputList<string>());
            set => _images = value;
        }

        /// <summary>
        /// Prefix prepended to resources for kustomize apps.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Suffix appended to resources for kustomize apps.
        /// </summary>
        [Input("nameSuffix")]
        public Input<string>? NameSuffix { get; set; }

        /// <summary>
        /// Version of kustomize to use for rendering manifests.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GetGitopsApplicationsApplicationSpecSourceKustomizeInputArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourceKustomizeInputArgs Empty => new GetGitopsApplicationsApplicationSpecSourceKustomizeInputArgs();
    }
}
