// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cloudprovider.Outputs
{

    [OutputType]
    public sealed class KubernetesAuthenticationUsernamePassword
    {
        /// <summary>
        /// URL of the Kubernetes master to connect to.
        /// </summary>
        public readonly string MasterUrl;
        /// <summary>
        /// Name of the Harness secret containing the password for the cluster.
        /// </summary>
        public readonly string PasswordSecretName;
        /// <summary>
        /// Username for authentication to the cluster
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// Name of the Harness secret containing the username for authentication to the cluster
        /// </summary>
        public readonly string? UsernameSecretName;

        [OutputConstructor]
        private KubernetesAuthenticationUsernamePassword(
            string masterUrl,

            string passwordSecretName,

            string? username,

            string? usernameSecretName)
        {
            MasterUrl = masterUrl;
            PasswordSecretName = passwordSecretName;
            Username = username;
            UsernameSecretName = usernameSecretName;
        }
    }
}
