// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitopsAppProjectProjectMetadata
    {
        /// <summary>
        /// Annotations associated with the GitOps project.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Annotations;
        /// <summary>
        /// Name of the cluster associated with the GitOps project.
        /// </summary>
        public readonly string? ClusterName;
        /// <summary>
        /// Finalizers associated with the GitOps project.
        /// </summary>
        public readonly ImmutableArray<string> Finalizers;
        /// <summary>
        /// Labels associated with the GitOps project.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// Managed fields associated with the GitOps project.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitopsAppProjectProjectMetadataManagedField> ManagedFields;
        /// <summary>
        /// Name of the GitOps project.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Namespace of the GitOps project.
        /// </summary>
        public readonly string? Namespace;
        /// <summary>
        /// Resource Version for the GitOps project
        /// </summary>
        public readonly string? ResourceVersion;

        [OutputConstructor]
        private GitopsAppProjectProjectMetadata(
            ImmutableDictionary<string, string>? annotations,

            string? clusterName,

            ImmutableArray<string> finalizers,

            ImmutableDictionary<string, string>? labels,

            ImmutableArray<Outputs.GitopsAppProjectProjectMetadataManagedField> managedFields,

            string? name,

            string? @namespace,

            string? resourceVersion)
        {
            Annotations = annotations;
            ClusterName = clusterName;
            Finalizers = finalizers;
            Labels = labels;
            ManagedFields = managedFields;
            Name = name;
            Namespace = @namespace;
            ResourceVersion = resourceVersion;
        }
    }
}