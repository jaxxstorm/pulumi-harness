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

    public sealed class GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs : global::Pulumi.InvokeArgs
    {
        [Input("backoffs")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs>? _backoffs;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs> Backoffs
        {
            get => _backoffs ?? (_backoffs = new List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs>());
            set => _backoffs = value;
        }

        [Input("limit")]
        public string? Limit { get; set; }

        public GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs Empty => new GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs();
    }
}
