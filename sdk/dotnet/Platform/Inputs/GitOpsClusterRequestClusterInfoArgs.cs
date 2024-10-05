// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsClusterRequestClusterInfoArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiVersions")]
        private InputList<string>? _apiVersions;

        /// <summary>
        /// List of API versions supported by the cluster.
        /// </summary>
        public InputList<string> ApiVersions
        {
            get => _apiVersions ?? (_apiVersions = new InputList<string>());
            set => _apiVersions = value;
        }

        /// <summary>
        /// Number of applications managed by Argo CD on the cluster.
        /// </summary>
        [Input("applicationsCount")]
        public Input<string>? ApplicationsCount { get; set; }

        [Input("cacheInfos")]
        private InputList<Inputs.GitOpsClusterRequestClusterInfoCacheInfoArgs>? _cacheInfos;

        /// <summary>
        /// Information about the cluster cache.
        /// </summary>
        public InputList<Inputs.GitOpsClusterRequestClusterInfoCacheInfoArgs> CacheInfos
        {
            get => _cacheInfos ?? (_cacheInfos = new InputList<Inputs.GitOpsClusterRequestClusterInfoCacheInfoArgs>());
            set => _cacheInfos = value;
        }

        [Input("connectionStates")]
        private InputList<Inputs.GitOpsClusterRequestClusterInfoConnectionStateArgs>? _connectionStates;

        /// <summary>
        /// Information about the connection to the cluster.
        /// </summary>
        public InputList<Inputs.GitOpsClusterRequestClusterInfoConnectionStateArgs> ConnectionStates
        {
            get => _connectionStates ?? (_connectionStates = new InputList<Inputs.GitOpsClusterRequestClusterInfoConnectionStateArgs>());
            set => _connectionStates = value;
        }

        /// <summary>
        /// Kubernetes version of the cluster.
        /// </summary>
        [Input("serverVersion")]
        public Input<string>? ServerVersion { get; set; }

        public GitOpsClusterRequestClusterInfoArgs()
        {
        }
        public static new GitOpsClusterRequestClusterInfoArgs Empty => new GitOpsClusterRequestClusterInfoArgs();
    }
}