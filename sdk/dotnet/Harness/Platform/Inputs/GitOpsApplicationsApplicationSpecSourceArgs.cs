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

    public sealed class GitOpsApplicationsApplicationSpecSourceArgs : global::Pulumi.ResourceArgs
    {
        [Input("chart")]
        public Input<string>? Chart { get; set; }

        [Input("directories")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceDirectoryArgs>? _directories;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceDirectoryArgs> Directories
        {
            get => _directories ?? (_directories = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceDirectoryArgs>());
            set => _directories = value;
        }

        [Input("helms")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmArgs>? _helms;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmArgs> Helms
        {
            get => _helms ?? (_helms = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceHelmArgs>());
            set => _helms = value;
        }

        [Input("ksonnets")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKsonnetArgs>? _ksonnets;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKsonnetArgs> Ksonnets
        {
            get => _ksonnets ?? (_ksonnets = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKsonnetArgs>());
            set => _ksonnets = value;
        }

        [Input("kustomizes")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKustomizeArgs>? _kustomizes;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKustomizeArgs> Kustomizes
        {
            get => _kustomizes ?? (_kustomizes = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceKustomizeArgs>());
            set => _kustomizes = value;
        }

        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        [Input("plugins")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginArgs>? _plugins;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginArgs> Plugins
        {
            get => _plugins ?? (_plugins = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginArgs>());
            set => _plugins = value;
        }

        [Input("repoUrl", required: true)]
        public Input<string> RepoUrl { get; set; } = null!;

        [Input("targetRevision", required: true)]
        public Input<string> TargetRevision { get; set; } = null!;

        public GitOpsApplicationsApplicationSpecSourceArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecSourceArgs Empty => new GitOpsApplicationsApplicationSpecSourceArgs();
    }
}
