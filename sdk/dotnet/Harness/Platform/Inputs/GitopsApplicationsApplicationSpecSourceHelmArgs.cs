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

    public sealed class GitopsApplicationsApplicationSpecSourceHelmArgs : global::Pulumi.ResourceArgs
    {
        [Input("fileParameters")]
        private InputList<Inputs.GitopsApplicationsApplicationSpecSourceHelmFileParameterArgs>? _fileParameters;
        public InputList<Inputs.GitopsApplicationsApplicationSpecSourceHelmFileParameterArgs> FileParameters
        {
            get => _fileParameters ?? (_fileParameters = new InputList<Inputs.GitopsApplicationsApplicationSpecSourceHelmFileParameterArgs>());
            set => _fileParameters = value;
        }

        [Input("parameters")]
        private InputList<Inputs.GitopsApplicationsApplicationSpecSourceHelmParameterArgs>? _parameters;
        public InputList<Inputs.GitopsApplicationsApplicationSpecSourceHelmParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.GitopsApplicationsApplicationSpecSourceHelmParameterArgs>());
            set => _parameters = value;
        }

        [Input("passCredentials")]
        public Input<bool>? PassCredentials { get; set; }

        [Input("releaseName")]
        public Input<string>? ReleaseName { get; set; }

        [Input("valueFiles")]
        private InputList<string>? _valueFiles;
        public InputList<string> ValueFiles
        {
            get => _valueFiles ?? (_valueFiles = new InputList<string>());
            set => _valueFiles = value;
        }

        [Input("values")]
        public Input<string>? Values { get; set; }

        [Input("version")]
        public Input<string>? Version { get; set; }

        public GitopsApplicationsApplicationSpecSourceHelmArgs()
        {
        }
        public static new GitopsApplicationsApplicationSpecSourceHelmArgs Empty => new GitopsApplicationsApplicationSpecSourceHelmArgs();
    }
}
