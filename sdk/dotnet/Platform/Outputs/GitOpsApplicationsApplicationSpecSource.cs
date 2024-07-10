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
    public sealed class GitOpsApplicationsApplicationSpecSource
    {
        /// <summary>
        /// Helm chart name, and must be specified for the GitOps applications sourced from a helm repo.
        /// </summary>
        public readonly string? Chart;
        /// <summary>
        /// Options for applications of type plain YAML or Jsonnet.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceDirectory> Directories;
        /// <summary>
        /// Holds helm specific options.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceHelm> Helms;
        /// <summary>
        /// Ksonnet specific options.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceKsonnet> Ksonnets;
        /// <summary>
        /// Options specific to a GitOps application source specific to Kustomize.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceKustomize> Kustomizes;
        /// <summary>
        /// Directory path within the git repository, and is only valid for the GitOps applications sourced from git.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Options specific to config management plugins.
        /// </summary>
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourcePlugin> Plugins;
        /// <summary>
        /// URL to the repository (git or helm) that contains the GitOps application manifests.
        /// </summary>
        public readonly string RepoUrl;
        /// <summary>
        /// Revision of the source to sync the GitOps application to. In case of git, this can be commit, tag, or branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag of the chart's version.
        /// </summary>
        public readonly string TargetRevision;

        [OutputConstructor]
        private GitOpsApplicationsApplicationSpecSource(
            string? chart,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceDirectory> directories,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceHelm> helms,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceKsonnet> ksonnets,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceKustomize> kustomizes,

            string? path,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourcePlugin> plugins,

            string repoUrl,

            string targetRevision)
        {
            Chart = chart;
            Directories = directories;
            Helms = helms;
            Ksonnets = ksonnets;
            Kustomizes = kustomizes;
            Path = path;
            Plugins = plugins;
            RepoUrl = repoUrl;
            TargetRevision = targetRevision;
        }
    }
}
