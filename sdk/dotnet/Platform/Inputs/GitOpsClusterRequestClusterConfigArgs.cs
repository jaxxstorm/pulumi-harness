// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsClusterRequestClusterConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS Cluster name. If set then AWS CLI EKS token command will be used to access cluster.
        /// </summary>
        [Input("awsClusterName")]
        public Input<string>? AwsClusterName { get; set; }

        [Input("bearerToken")]
        private Input<string>? _bearerToken;

        /// <summary>
        /// Bearer authentication token the cluster.
        /// </summary>
        public Input<string>? BearerToken
        {
            get => _bearerToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _bearerToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Identifies the authentication method used to connect to the cluster.
        /// </summary>
        [Input("clusterConnectionType")]
        public Input<string>? ClusterConnectionType { get; set; }

        [Input("execProviderConfigs")]
        private InputList<Inputs.GitOpsClusterRequestClusterConfigExecProviderConfigArgs>? _execProviderConfigs;

        /// <summary>
        /// Configuration for an exec provider.
        /// </summary>
        public InputList<Inputs.GitOpsClusterRequestClusterConfigExecProviderConfigArgs> ExecProviderConfigs
        {
            get => _execProviderConfigs ?? (_execProviderConfigs = new InputList<Inputs.GitOpsClusterRequestClusterConfigExecProviderConfigArgs>());
            set => _execProviderConfigs = value;
        }

        /// <summary>
        /// Password of the server of the cluster.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Optional role ARN. If set then used for AWS IAM Authenticator.
        /// </summary>
        [Input("roleARN")]
        public Input<string>? RoleARN { get; set; }

        [Input("tlsClientConfigs")]
        private InputList<Inputs.GitOpsClusterRequestClusterConfigTlsClientConfigArgs>? _tlsClientConfigs;

        /// <summary>
        /// Settings to enable transport layer security.
        /// </summary>
        public InputList<Inputs.GitOpsClusterRequestClusterConfigTlsClientConfigArgs> TlsClientConfigs
        {
            get => _tlsClientConfigs ?? (_tlsClientConfigs = new InputList<Inputs.GitOpsClusterRequestClusterConfigTlsClientConfigArgs>());
            set => _tlsClientConfigs = value;
        }

        /// <summary>
        /// Username of the server of the cluster.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public GitOpsClusterRequestClusterConfigArgs()
        {
        }
        public static new GitOpsClusterRequestClusterConfigArgs Empty => new GitOpsClusterRequestClusterConfigArgs();
    }
}
