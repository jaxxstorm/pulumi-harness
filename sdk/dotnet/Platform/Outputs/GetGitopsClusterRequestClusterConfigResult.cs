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
    public sealed class GetGitopsClusterRequestClusterConfigResult
    {
        /// <summary>
        /// IAM authentication configuration for AWS.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsClusterRequestClusterConfigAwsAuthConfigResult> AwsAuthConfigs;
        /// <summary>
        /// Bearer authentication token the cluster.
        /// </summary>
        public readonly string? BearerToken;
        /// <summary>
        /// Identifies the authentication method used to connect to the cluster.
        /// </summary>
        public readonly string? ClusterConnectionType;
        /// <summary>
        /// Configuration for an exec provider.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsClusterRequestClusterConfigExecProviderConfigResult> ExecProviderConfigs;
        /// <summary>
        /// Password of the server of the cluster.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Settings to enable transport layer security.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGitopsClusterRequestClusterConfigTlsClientConfigResult> TlsClientConfigs;
        /// <summary>
        /// Username of the server of the cluster.
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private GetGitopsClusterRequestClusterConfigResult(
            ImmutableArray<Outputs.GetGitopsClusterRequestClusterConfigAwsAuthConfigResult> awsAuthConfigs,

            string? bearerToken,

            string? clusterConnectionType,

            ImmutableArray<Outputs.GetGitopsClusterRequestClusterConfigExecProviderConfigResult> execProviderConfigs,

            string? password,

            ImmutableArray<Outputs.GetGitopsClusterRequestClusterConfigTlsClientConfigResult> tlsClientConfigs,

            string? username)
        {
            AwsAuthConfigs = awsAuthConfigs;
            BearerToken = bearerToken;
            ClusterConnectionType = clusterConnectionType;
            ExecProviderConfigs = execProviderConfigs;
            Password = password;
            TlsClientConfigs = tlsClientConfigs;
            Username = username;
        }
    }
}
