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
    public sealed class GitOpsRepositoryRepo
    {
        /// <summary>
        /// Identifies the authentication method used to connect to the repository. Possible values: "HTTPS" "SSH" "GITHUB" "HTTPS*ANONYMOUS*CONNECTION_TYPE"
        /// </summary>
        public readonly string ConnectionType;
        /// <summary>
        /// Indicates if git-lfs support must be enabled for this repo. This is valid only for Git repositories.
        /// </summary>
        public readonly bool? EnableLfs;
        /// <summary>
        /// Indicates if helm-oci support must be enabled for this repo.
        /// </summary>
        public readonly bool? EnableOci;
        /// <summary>
        /// Base URL of GitHub Enterprise installation. If left empty, this defaults to https://api.github.com.
        /// </summary>
        public readonly string? GithubAppEnterpriseBaseUrl;
        /// <summary>
        /// Id of the GitHub app used to access the repo.
        /// </summary>
        public readonly string? GithubAppId;
        /// <summary>
        /// Installation id of the GitHub app used to access the repo.
        /// </summary>
        public readonly string? GithubAppInstallationId;
        /// <summary>
        /// GitHub app private key PEM data.
        /// </summary>
        public readonly string? GithubAppPrivateKey;
        /// <summary>
        /// Indicates if the credentials were inherited from a repository credential.
        /// </summary>
        public readonly bool? InheritedCreds;
        /// <summary>
        /// Indicates if the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys.
        /// </summary>
        public readonly bool? Insecure;
        /// <summary>
        /// Indicates if InsecureIgnoreHostKey should be used. Insecure is favored used only for git repos. Deprecated.
        /// </summary>
        public readonly bool? InsecureIgnoreHostKey;
        /// <summary>
        /// Name to be used for this repo. Only used with Helm repos.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Password or PAT to be used for authenticating the remote repository.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The ArgoCD project name corresponding to this GitOps repository. An empty string means that the GitOps repository belongs to the default project created by Harness.
        /// </summary>
        public readonly string? Project;
        /// <summary>
        /// The HTTP/HTTPS proxy used to access the repo.
        /// </summary>
        public readonly string? Proxy;
        /// <summary>
        /// URL to the remote repository.
        /// </summary>
        public readonly string Repo;
        /// <summary>
        /// SSH Key in PEM format for authenticating the repository. Used only for Git repository.
        /// </summary>
        public readonly string? SshPrivateKey;
        /// <summary>
        /// Certificate in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
        /// </summary>
        public readonly string? TlsClientCertData;
        /// <summary>
        /// Private key in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
        /// </summary>
        public readonly string? TlsClientCertKey;
        /// <summary>
        /// Type specifies the type of the repo. Can be either "git" or "helm. "git" is assumed if empty or absent.
        /// </summary>
        public readonly string? Type_;
        /// <summary>
        /// Username to be used for authenticating the remote repository.
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private GitOpsRepositoryRepo(
            string connectionType,

            bool? enableLfs,

            bool? enableOci,

            string? githubAppEnterpriseBaseUrl,

            string? githubAppId,

            string? githubAppInstallationId,

            string? githubAppPrivateKey,

            bool? inheritedCreds,

            bool? insecure,

            bool? insecureIgnoreHostKey,

            string? name,

            string? password,

            string? project,

            string? proxy,

            string repo,

            string? sshPrivateKey,

            string? tlsClientCertData,

            string? tlsClientCertKey,

            string? type_,

            string? username)
        {
            ConnectionType = connectionType;
            EnableLfs = enableLfs;
            EnableOci = enableOci;
            GithubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            GithubAppId = githubAppId;
            GithubAppInstallationId = githubAppInstallationId;
            GithubAppPrivateKey = githubAppPrivateKey;
            InheritedCreds = inheritedCreds;
            Insecure = insecure;
            InsecureIgnoreHostKey = insecureIgnoreHostKey;
            Name = name;
            Password = password;
            Project = project;
            Proxy = proxy;
            Repo = repo;
            SshPrivateKey = sshPrivateKey;
            TlsClientCertData = tlsClientCertData;
            TlsClientCertKey = tlsClientCertKey;
            Type_ = type_;
            Username = username;
        }
    }
}
