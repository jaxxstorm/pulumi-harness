// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsAppProjectProjectMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations associated with the GitOps project.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Name of the cluster associated with the GitOps project.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("finalizers")]
        private InputList<string>? _finalizers;

        /// <summary>
        /// Finalizers associated with the GitOps project.
        /// </summary>
        public InputList<string> Finalizers
        {
            get => _finalizers ?? (_finalizers = new InputList<string>());
            set => _finalizers = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels associated with the GitOps project.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("managedFields")]
        private InputList<Inputs.GitopsAppProjectProjectMetadataManagedFieldGetArgs>? _managedFields;

        /// <summary>
        /// Managed fields associated with the GitOps project.
        /// </summary>
        public InputList<Inputs.GitopsAppProjectProjectMetadataManagedFieldGetArgs> ManagedFields
        {
            get => _managedFields ?? (_managedFields = new InputList<Inputs.GitopsAppProjectProjectMetadataManagedFieldGetArgs>());
            set => _managedFields = value;
        }

        /// <summary>
        /// Name of the GitOps project.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Namespace of the GitOps project.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        public GitopsAppProjectProjectMetadataGetArgs()
        {
        }
        public static new GitopsAppProjectProjectMetadataGetArgs Empty => new GitopsAppProjectProjectMetadataGetArgs();
    }
}
