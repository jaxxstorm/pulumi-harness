// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsRepositoryRepoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepositoryRepoArgs Empty = new GitOpsRepositoryRepoArgs();

    /**
     * Identifies the authentication method used to connect to the repository. Possible values: &#34;HTTPS&#34; &#34;SSH&#34; &#34;GITHUB&#34; &#34;HTTPS*ANONYMOUS&#34;, &#34;GITHUB*ENTERPRISE&#34;.
     * 
     */
    @Import(name="connectionType", required=true)
    private Output<String> connectionType;

    /**
     * @return Identifies the authentication method used to connect to the repository. Possible values: &#34;HTTPS&#34; &#34;SSH&#34; &#34;GITHUB&#34; &#34;HTTPS*ANONYMOUS&#34;, &#34;GITHUB*ENTERPRISE&#34;.
     * 
     */
    public Output<String> connectionType() {
        return this.connectionType;
    }

    /**
     * Indicates if git-lfs support must be enabled for this repo. This is valid only for Git repositories.
     * 
     */
    @Import(name="enableLfs")
    private @Nullable Output<Boolean> enableLfs;

    /**
     * @return Indicates if git-lfs support must be enabled for this repo. This is valid only for Git repositories.
     * 
     */
    public Optional<Output<Boolean>> enableLfs() {
        return Optional.ofNullable(this.enableLfs);
    }

    /**
     * Indicates if helm-oci support must be enabled for this repo.
     * 
     */
    @Import(name="enableOci")
    private @Nullable Output<Boolean> enableOci;

    /**
     * @return Indicates if helm-oci support must be enabled for this repo.
     * 
     */
    public Optional<Output<Boolean>> enableOci() {
        return Optional.ofNullable(this.enableOci);
    }

    /**
     * Base URL of GitHub Enterprise installation. If left empty, this defaults to https://api.github.com.
     * 
     */
    @Import(name="githubAppEnterpriseBaseUrl")
    private @Nullable Output<String> githubAppEnterpriseBaseUrl;

    /**
     * @return Base URL of GitHub Enterprise installation. If left empty, this defaults to https://api.github.com.
     * 
     */
    public Optional<Output<String>> githubAppEnterpriseBaseUrl() {
        return Optional.ofNullable(this.githubAppEnterpriseBaseUrl);
    }

    /**
     * Id of the GitHub app used to access the repo.
     * 
     */
    @Import(name="githubAppId")
    private @Nullable Output<String> githubAppId;

    /**
     * @return Id of the GitHub app used to access the repo.
     * 
     */
    public Optional<Output<String>> githubAppId() {
        return Optional.ofNullable(this.githubAppId);
    }

    /**
     * Installation id of the GitHub app used to access the repo.
     * 
     */
    @Import(name="githubAppInstallationId")
    private @Nullable Output<String> githubAppInstallationId;

    /**
     * @return Installation id of the GitHub app used to access the repo.
     * 
     */
    public Optional<Output<String>> githubAppInstallationId() {
        return Optional.ofNullable(this.githubAppInstallationId);
    }

    /**
     * GitHub app private key PEM data.
     * 
     */
    @Import(name="githubAppPrivateKey")
    private @Nullable Output<String> githubAppPrivateKey;

    /**
     * @return GitHub app private key PEM data.
     * 
     */
    public Optional<Output<String>> githubAppPrivateKey() {
        return Optional.ofNullable(this.githubAppPrivateKey);
    }

    /**
     * Indicates if the credentials were inherited from a repository credential.
     * 
     */
    @Import(name="inheritedCreds")
    private @Nullable Output<Boolean> inheritedCreds;

    /**
     * @return Indicates if the credentials were inherited from a repository credential.
     * 
     */
    public Optional<Output<Boolean>> inheritedCreds() {
        return Optional.ofNullable(this.inheritedCreds);
    }

    /**
     * Indicates if the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys.
     * 
     */
    @Import(name="insecure")
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Indicates if the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys.
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * Indicates if InsecureIgnoreHostKey should be used. Insecure is favored used only for git repos. Deprecated.
     * 
     */
    @Import(name="insecureIgnoreHostKey")
    private @Nullable Output<Boolean> insecureIgnoreHostKey;

    /**
     * @return Indicates if InsecureIgnoreHostKey should be used. Insecure is favored used only for git repos. Deprecated.
     * 
     */
    public Optional<Output<Boolean>> insecureIgnoreHostKey() {
        return Optional.ofNullable(this.insecureIgnoreHostKey);
    }

    /**
     * Name to be used for this repo. Only used with Helm repos.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name to be used for this repo. Only used with Helm repos.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Password or PAT to be used for authenticating the remote repository.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password or PAT to be used for authenticating the remote repository.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The ArgoCD project name corresponding to this GitOps repository. An empty string means that the GitOps repository belongs to the default project created by Harness.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ArgoCD project name corresponding to this GitOps repository. An empty string means that the GitOps repository belongs to the default project created by Harness.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The HTTP/HTTPS proxy used to access the repo.
     * 
     */
    @Import(name="proxy")
    private @Nullable Output<String> proxy;

    /**
     * @return The HTTP/HTTPS proxy used to access the repo.
     * 
     */
    public Optional<Output<String>> proxy() {
        return Optional.ofNullable(this.proxy);
    }

    /**
     * URL to the remote repository.
     * 
     */
    @Import(name="repo", required=true)
    private Output<String> repo;

    /**
     * @return URL to the remote repository.
     * 
     */
    public Output<String> repo() {
        return this.repo;
    }

    /**
     * SSH Key in PEM format for authenticating the repository. Used only for Git repository.
     * 
     */
    @Import(name="sshPrivateKey")
    private @Nullable Output<String> sshPrivateKey;

    /**
     * @return SSH Key in PEM format for authenticating the repository. Used only for Git repository.
     * 
     */
    public Optional<Output<String>> sshPrivateKey() {
        return Optional.ofNullable(this.sshPrivateKey);
    }

    /**
     * Certificate in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
     * 
     */
    @Import(name="tlsClientCertData")
    private @Nullable Output<String> tlsClientCertData;

    /**
     * @return Certificate in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
     * 
     */
    public Optional<Output<String>> tlsClientCertData() {
        return Optional.ofNullable(this.tlsClientCertData);
    }

    /**
     * Private key in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
     * 
     */
    @Import(name="tlsClientCertKey")
    private @Nullable Output<String> tlsClientCertKey;

    /**
     * @return Private key in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
     * 
     */
    public Optional<Output<String>> tlsClientCertKey() {
        return Optional.ofNullable(this.tlsClientCertKey);
    }

    /**
     * Type specifies the type of the repo. Can be either &#34;git&#34; or &#34;helm. &#34;git&#34; is assumed if empty or absent.
     * 
     */
    @Import(name="type_")
    private @Nullable Output<String> type_;

    /**
     * @return Type specifies the type of the repo. Can be either &#34;git&#34; or &#34;helm. &#34;git&#34; is assumed if empty or absent.
     * 
     */
    public Optional<Output<String>> type_() {
        return Optional.ofNullable(this.type_);
    }

    /**
     * Username to be used for authenticating the remote repository.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username to be used for authenticating the remote repository.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GitOpsRepositoryRepoArgs() {}

    private GitOpsRepositoryRepoArgs(GitOpsRepositoryRepoArgs $) {
        this.connectionType = $.connectionType;
        this.enableLfs = $.enableLfs;
        this.enableOci = $.enableOci;
        this.githubAppEnterpriseBaseUrl = $.githubAppEnterpriseBaseUrl;
        this.githubAppId = $.githubAppId;
        this.githubAppInstallationId = $.githubAppInstallationId;
        this.githubAppPrivateKey = $.githubAppPrivateKey;
        this.inheritedCreds = $.inheritedCreds;
        this.insecure = $.insecure;
        this.insecureIgnoreHostKey = $.insecureIgnoreHostKey;
        this.name = $.name;
        this.password = $.password;
        this.project = $.project;
        this.proxy = $.proxy;
        this.repo = $.repo;
        this.sshPrivateKey = $.sshPrivateKey;
        this.tlsClientCertData = $.tlsClientCertData;
        this.tlsClientCertKey = $.tlsClientCertKey;
        this.type_ = $.type_;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepositoryRepoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepositoryRepoArgs $;

        public Builder() {
            $ = new GitOpsRepositoryRepoArgs();
        }

        public Builder(GitOpsRepositoryRepoArgs defaults) {
            $ = new GitOpsRepositoryRepoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionType Identifies the authentication method used to connect to the repository. Possible values: &#34;HTTPS&#34; &#34;SSH&#34; &#34;GITHUB&#34; &#34;HTTPS*ANONYMOUS&#34;, &#34;GITHUB*ENTERPRISE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(Output<String> connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param connectionType Identifies the authentication method used to connect to the repository. Possible values: &#34;HTTPS&#34; &#34;SSH&#34; &#34;GITHUB&#34; &#34;HTTPS*ANONYMOUS&#34;, &#34;GITHUB*ENTERPRISE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            return connectionType(Output.of(connectionType));
        }

        /**
         * @param enableLfs Indicates if git-lfs support must be enabled for this repo. This is valid only for Git repositories.
         * 
         * @return builder
         * 
         */
        public Builder enableLfs(@Nullable Output<Boolean> enableLfs) {
            $.enableLfs = enableLfs;
            return this;
        }

        /**
         * @param enableLfs Indicates if git-lfs support must be enabled for this repo. This is valid only for Git repositories.
         * 
         * @return builder
         * 
         */
        public Builder enableLfs(Boolean enableLfs) {
            return enableLfs(Output.of(enableLfs));
        }

        /**
         * @param enableOci Indicates if helm-oci support must be enabled for this repo.
         * 
         * @return builder
         * 
         */
        public Builder enableOci(@Nullable Output<Boolean> enableOci) {
            $.enableOci = enableOci;
            return this;
        }

        /**
         * @param enableOci Indicates if helm-oci support must be enabled for this repo.
         * 
         * @return builder
         * 
         */
        public Builder enableOci(Boolean enableOci) {
            return enableOci(Output.of(enableOci));
        }

        /**
         * @param githubAppEnterpriseBaseUrl Base URL of GitHub Enterprise installation. If left empty, this defaults to https://api.github.com.
         * 
         * @return builder
         * 
         */
        public Builder githubAppEnterpriseBaseUrl(@Nullable Output<String> githubAppEnterpriseBaseUrl) {
            $.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            return this;
        }

        /**
         * @param githubAppEnterpriseBaseUrl Base URL of GitHub Enterprise installation. If left empty, this defaults to https://api.github.com.
         * 
         * @return builder
         * 
         */
        public Builder githubAppEnterpriseBaseUrl(String githubAppEnterpriseBaseUrl) {
            return githubAppEnterpriseBaseUrl(Output.of(githubAppEnterpriseBaseUrl));
        }

        /**
         * @param githubAppId Id of the GitHub app used to access the repo.
         * 
         * @return builder
         * 
         */
        public Builder githubAppId(@Nullable Output<String> githubAppId) {
            $.githubAppId = githubAppId;
            return this;
        }

        /**
         * @param githubAppId Id of the GitHub app used to access the repo.
         * 
         * @return builder
         * 
         */
        public Builder githubAppId(String githubAppId) {
            return githubAppId(Output.of(githubAppId));
        }

        /**
         * @param githubAppInstallationId Installation id of the GitHub app used to access the repo.
         * 
         * @return builder
         * 
         */
        public Builder githubAppInstallationId(@Nullable Output<String> githubAppInstallationId) {
            $.githubAppInstallationId = githubAppInstallationId;
            return this;
        }

        /**
         * @param githubAppInstallationId Installation id of the GitHub app used to access the repo.
         * 
         * @return builder
         * 
         */
        public Builder githubAppInstallationId(String githubAppInstallationId) {
            return githubAppInstallationId(Output.of(githubAppInstallationId));
        }

        /**
         * @param githubAppPrivateKey GitHub app private key PEM data.
         * 
         * @return builder
         * 
         */
        public Builder githubAppPrivateKey(@Nullable Output<String> githubAppPrivateKey) {
            $.githubAppPrivateKey = githubAppPrivateKey;
            return this;
        }

        /**
         * @param githubAppPrivateKey GitHub app private key PEM data.
         * 
         * @return builder
         * 
         */
        public Builder githubAppPrivateKey(String githubAppPrivateKey) {
            return githubAppPrivateKey(Output.of(githubAppPrivateKey));
        }

        /**
         * @param inheritedCreds Indicates if the credentials were inherited from a repository credential.
         * 
         * @return builder
         * 
         */
        public Builder inheritedCreds(@Nullable Output<Boolean> inheritedCreds) {
            $.inheritedCreds = inheritedCreds;
            return this;
        }

        /**
         * @param inheritedCreds Indicates if the credentials were inherited from a repository credential.
         * 
         * @return builder
         * 
         */
        public Builder inheritedCreds(Boolean inheritedCreds) {
            return inheritedCreds(Output.of(inheritedCreds));
        }

        /**
         * @param insecure Indicates if the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys.
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Indicates if the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys.
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param insecureIgnoreHostKey Indicates if InsecureIgnoreHostKey should be used. Insecure is favored used only for git repos. Deprecated.
         * 
         * @return builder
         * 
         */
        public Builder insecureIgnoreHostKey(@Nullable Output<Boolean> insecureIgnoreHostKey) {
            $.insecureIgnoreHostKey = insecureIgnoreHostKey;
            return this;
        }

        /**
         * @param insecureIgnoreHostKey Indicates if InsecureIgnoreHostKey should be used. Insecure is favored used only for git repos. Deprecated.
         * 
         * @return builder
         * 
         */
        public Builder insecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
            return insecureIgnoreHostKey(Output.of(insecureIgnoreHostKey));
        }

        /**
         * @param name Name to be used for this repo. Only used with Helm repos.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name to be used for this repo. Only used with Helm repos.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password Password or PAT to be used for authenticating the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password or PAT to be used for authenticating the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param project The ArgoCD project name corresponding to this GitOps repository. An empty string means that the GitOps repository belongs to the default project created by Harness.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ArgoCD project name corresponding to this GitOps repository. An empty string means that the GitOps repository belongs to the default project created by Harness.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param proxy The HTTP/HTTPS proxy used to access the repo.
         * 
         * @return builder
         * 
         */
        public Builder proxy(@Nullable Output<String> proxy) {
            $.proxy = proxy;
            return this;
        }

        /**
         * @param proxy The HTTP/HTTPS proxy used to access the repo.
         * 
         * @return builder
         * 
         */
        public Builder proxy(String proxy) {
            return proxy(Output.of(proxy));
        }

        /**
         * @param repo URL to the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder repo(Output<String> repo) {
            $.repo = repo;
            return this;
        }

        /**
         * @param repo URL to the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder repo(String repo) {
            return repo(Output.of(repo));
        }

        /**
         * @param sshPrivateKey SSH Key in PEM format for authenticating the repository. Used only for Git repository.
         * 
         * @return builder
         * 
         */
        public Builder sshPrivateKey(@Nullable Output<String> sshPrivateKey) {
            $.sshPrivateKey = sshPrivateKey;
            return this;
        }

        /**
         * @param sshPrivateKey SSH Key in PEM format for authenticating the repository. Used only for Git repository.
         * 
         * @return builder
         * 
         */
        public Builder sshPrivateKey(String sshPrivateKey) {
            return sshPrivateKey(Output.of(sshPrivateKey));
        }

        /**
         * @param tlsClientCertData Certificate in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertData(@Nullable Output<String> tlsClientCertData) {
            $.tlsClientCertData = tlsClientCertData;
            return this;
        }

        /**
         * @param tlsClientCertData Certificate in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertData(String tlsClientCertData) {
            return tlsClientCertData(Output.of(tlsClientCertData));
        }

        /**
         * @param tlsClientCertKey Private key in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertKey(@Nullable Output<String> tlsClientCertKey) {
            $.tlsClientCertKey = tlsClientCertKey;
            return this;
        }

        /**
         * @param tlsClientCertKey Private key in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertKey(String tlsClientCertKey) {
            return tlsClientCertKey(Output.of(tlsClientCertKey));
        }

        /**
         * @param type_ Type specifies the type of the repo. Can be either &#34;git&#34; or &#34;helm. &#34;git&#34; is assumed if empty or absent.
         * 
         * @return builder
         * 
         */
        public Builder type_(@Nullable Output<String> type_) {
            $.type_ = type_;
            return this;
        }

        /**
         * @param type_ Type specifies the type of the repo. Can be either &#34;git&#34; or &#34;helm. &#34;git&#34; is assumed if empty or absent.
         * 
         * @return builder
         * 
         */
        public Builder type_(String type_) {
            return type_(Output.of(type_));
        }

        /**
         * @param username Username to be used for authenticating the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username to be used for authenticating the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GitOpsRepositoryRepoArgs build() {
            if ($.connectionType == null) {
                throw new MissingRequiredPropertyException("GitOpsRepositoryRepoArgs", "connectionType");
            }
            if ($.repo == null) {
                throw new MissingRequiredPropertyException("GitOpsRepositoryRepoArgs", "repo");
            }
            return $;
        }
    }

}
