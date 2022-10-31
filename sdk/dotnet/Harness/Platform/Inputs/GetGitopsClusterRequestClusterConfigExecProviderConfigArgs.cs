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

    public sealed class GetGitopsClusterRequestClusterConfigExecProviderConfigInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        [Input("args")]
        private InputList<string>? _args;
        public InputList<string> Args
        {
            get => _args ?? (_args = new InputList<string>());
            set => _args = value;
        }

        [Input("command")]
        public Input<string>? Command { get; set; }

        [Input("env")]
        private InputMap<string>? _env;
        public InputMap<string> Env
        {
            get => _env ?? (_env = new InputMap<string>());
            set => _env = value;
        }

        [Input("installHint")]
        public Input<string>? InstallHint { get; set; }

        public GetGitopsClusterRequestClusterConfigExecProviderConfigInputArgs()
        {
        }
        public static new GetGitopsClusterRequestClusterConfigExecProviderConfigInputArgs Empty => new GetGitopsClusterRequestClusterConfigExecProviderConfigInputArgs();
    }
}
