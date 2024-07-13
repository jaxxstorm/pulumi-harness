// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Outputs
{

    [OutputType]
    public sealed class SshCredentialSshAuthentication
    {
        /// <summary>
        /// Inline SSH authentication configuration. Only ond of `passphrase_secret_id` or `ssh_key_file_id` should be used
        /// </summary>
        public readonly Outputs.SshCredentialSshAuthenticationInlineSsh? InlineSsh;
        /// <summary>
        /// The port to connect to
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Server password authentication configuration
        /// </summary>
        public readonly Outputs.SshCredentialSshAuthenticationServerPassword? ServerPassword;
        /// <summary>
        /// Use ssh key file for authentication
        /// </summary>
        public readonly Outputs.SshCredentialSshAuthenticationSshKeyFile? SshKeyFile;
        /// <summary>
        /// The username to use when connecting to ssh
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private SshCredentialSshAuthentication(
            Outputs.SshCredentialSshAuthenticationInlineSsh? inlineSsh,

            int port,

            Outputs.SshCredentialSshAuthenticationServerPassword? serverPassword,

            Outputs.SshCredentialSshAuthenticationSshKeyFile? sshKeyFile,

            string username)
        {
            InlineSsh = inlineSsh;
            Port = port;
            ServerPassword = serverPassword;
            SshKeyFile = sshKeyFile;
            Username = username;
        }
    }
}