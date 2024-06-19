// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitlabConnectorCredentialsSshArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the Harness secret containing the ssh key. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("sshKeyRef", required: true)]
        public Input<string> SshKeyRef { get; set; } = null!;

        public GitlabConnectorCredentialsSshArgs()
        {
        }
        public static new GitlabConnectorCredentialsSshArgs Empty => new GitlabConnectorCredentialsSshArgs();
    }
}
