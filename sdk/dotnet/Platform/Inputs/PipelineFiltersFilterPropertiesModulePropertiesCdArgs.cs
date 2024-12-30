// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class PipelineFiltersFilterPropertiesModulePropertiesCdArgs : global::Pulumi.ResourceArgs
    {
        [Input("artifactDisplayNames")]
        private InputList<string>? _artifactDisplayNames;

        /// <summary>
        /// Artifact display names of the CD pipeline.
        /// </summary>
        public InputList<string> ArtifactDisplayNames
        {
            get => _artifactDisplayNames ?? (_artifactDisplayNames = new InputList<string>());
            set => _artifactDisplayNames = value;
        }

        /// <summary>
        /// Deployment type of the CD pipeline, eg. Kubernetes
        /// </summary>
        [Input("deploymentTypes")]
        public Input<string>? DeploymentTypes { get; set; }

        [Input("environmentIdentifiers")]
        private InputList<string>? _environmentIdentifiers;

        /// <summary>
        /// Environment identifier of the CD pipeline.
        /// </summary>
        public InputList<string> EnvironmentIdentifiers
        {
            get => _environmentIdentifiers ?? (_environmentIdentifiers = new InputList<string>());
            set => _environmentIdentifiers = value;
        }

        [Input("environmentNames")]
        private InputList<string>? _environmentNames;

        /// <summary>
        /// Environment names of the CD pipeline.
        /// </summary>
        public InputList<string> EnvironmentNames
        {
            get => _environmentNames ?? (_environmentNames = new InputList<string>());
            set => _environmentNames = value;
        }

        /// <summary>
        /// Deployment type of the CD pipeline, eg. Kubernetes
        /// </summary>
        [Input("serviceDefinitionTypes")]
        public Input<string>? ServiceDefinitionTypes { get; set; }

        [Input("serviceIdentifiers")]
        private InputList<string>? _serviceIdentifiers;

        /// <summary>
        /// Service identifiers of the CD pipeline.
        /// </summary>
        public InputList<string> ServiceIdentifiers
        {
            get => _serviceIdentifiers ?? (_serviceIdentifiers = new InputList<string>());
            set => _serviceIdentifiers = value;
        }

        [Input("serviceNames")]
        private InputList<string>? _serviceNames;

        /// <summary>
        /// Service names of the CD pipeline.
        /// </summary>
        public InputList<string> ServiceNames
        {
            get => _serviceNames ?? (_serviceNames = new InputList<string>());
            set => _serviceNames = value;
        }

        public PipelineFiltersFilterPropertiesModulePropertiesCdArgs()
        {
        }
        public static new PipelineFiltersFilterPropertiesModulePropertiesCdArgs Empty => new PipelineFiltersFilterPropertiesModulePropertiesCdArgs();
    }
}
