// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsRepositoryRepo {
    /**
     * @return Identifies the authentication method used to connect to the repository. Possible values: &#34;HTTPS&#34; &#34;SSH&#34; &#34;GITHUB&#34; &#34;HTTPS_ANONYMOUS_CONNECTION_TYPE&#34;
     * 
     */
    private @Nullable String connectionType;
    /**
     * @return Indicates if git-lfs support must be enabled for this repo. This is valid only for Git repositories.
     * 
     */
    private @Nullable Boolean enableLfs;
    /**
     * @return Indicates if helm-oci support must be enabled for this repo.
     * 
     */
    private @Nullable Boolean enableOci;
    /**
     * @return Base URL of GitHub Enterprise installation. If left empty, this defaults to https://api.github.com.
     * 
     */
    private @Nullable String githubAppEnterpriseBaseUrl;
    /**
     * @return Id of the GitHub app used to access the repo.
     * 
     */
    private @Nullable String githubAppId;
    /**
     * @return Installation id of the GitHub app used to access the repo.
     * 
     */
    private @Nullable String githubAppInstallationId;
    /**
     * @return GitHub app private key PEM data.
     * 
     */
    private @Nullable String githubAppPrivateKey;
    /**
     * @return Indicates if the credentials were inherited from a repository credential.
     * 
     */
    private @Nullable Boolean inheritedCreds;
    /**
     * @return Indicates if the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys.
     * 
     */
    private @Nullable Boolean insecure;
    /**
     * @return Indicates if InsecureIgnoreHostKey should be used. Insecure is favored used only for git repos. Deprecated.
     * 
     */
    private @Nullable Boolean insecureIgnoreHostKey;
    /**
     * @return Name to be used for this repo. Only used with Helm repos.
     * 
     */
    private @Nullable String name;
    /**
     * @return Password or PAT to be used for authenticating the remote repository.
     * 
     */
    private @Nullable String password;
    /**
     * @return The ArgoCD project name corresponding to this GitOps repository. An empty string means that the GitOps repository belongs to the default project created by Harness.
     * 
     */
    private String project;
    /**
     * @return The HTTP/HTTPS proxy used to access the repo.
     * 
     */
    private @Nullable String proxy;
    /**
     * @return URL to the remote repository.
     * 
     */
    private @Nullable String repo;
    /**
     * @return SSH Key in PEM format for authenticating the repository. Used only for Git repository.
     * 
     */
    private @Nullable String sshPrivateKey;
    /**
     * @return Certificate in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
     * 
     */
    private @Nullable String tlsClientCertData;
    /**
     * @return Private key in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
     * 
     */
    private @Nullable String tlsClientCertKey;
    /**
     * @return Type specifies the type of the repo. Can be either &#34;git&#34; or &#34;helm. &#34;git&#34; is assumed if empty or absent.
     * 
     */
    private String type_;
    /**
     * @return Username to be used for authenticating the remote repository.
     * 
     */
    private @Nullable String username;

    private GetGitopsRepositoryRepo() {}
    /**
     * @return Identifies the authentication method used to connect to the repository. Possible values: &#34;HTTPS&#34; &#34;SSH&#34; &#34;GITHUB&#34; &#34;HTTPS_ANONYMOUS_CONNECTION_TYPE&#34;
     * 
     */
    public Optional<String> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }
    /**
     * @return Indicates if git-lfs support must be enabled for this repo. This is valid only for Git repositories.
     * 
     */
    public Optional<Boolean> enableLfs() {
        return Optional.ofNullable(this.enableLfs);
    }
    /**
     * @return Indicates if helm-oci support must be enabled for this repo.
     * 
     */
    public Optional<Boolean> enableOci() {
        return Optional.ofNullable(this.enableOci);
    }
    /**
     * @return Base URL of GitHub Enterprise installation. If left empty, this defaults to https://api.github.com.
     * 
     */
    public Optional<String> githubAppEnterpriseBaseUrl() {
        return Optional.ofNullable(this.githubAppEnterpriseBaseUrl);
    }
    /**
     * @return Id of the GitHub app used to access the repo.
     * 
     */
    public Optional<String> githubAppId() {
        return Optional.ofNullable(this.githubAppId);
    }
    /**
     * @return Installation id of the GitHub app used to access the repo.
     * 
     */
    public Optional<String> githubAppInstallationId() {
        return Optional.ofNullable(this.githubAppInstallationId);
    }
    /**
     * @return GitHub app private key PEM data.
     * 
     */
    public Optional<String> githubAppPrivateKey() {
        return Optional.ofNullable(this.githubAppPrivateKey);
    }
    /**
     * @return Indicates if the credentials were inherited from a repository credential.
     * 
     */
    public Optional<Boolean> inheritedCreds() {
        return Optional.ofNullable(this.inheritedCreds);
    }
    /**
     * @return Indicates if the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys.
     * 
     */
    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }
    /**
     * @return Indicates if InsecureIgnoreHostKey should be used. Insecure is favored used only for git repos. Deprecated.
     * 
     */
    public Optional<Boolean> insecureIgnoreHostKey() {
        return Optional.ofNullable(this.insecureIgnoreHostKey);
    }
    /**
     * @return Name to be used for this repo. Only used with Helm repos.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Password or PAT to be used for authenticating the remote repository.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The ArgoCD project name corresponding to this GitOps repository. An empty string means that the GitOps repository belongs to the default project created by Harness.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The HTTP/HTTPS proxy used to access the repo.
     * 
     */
    public Optional<String> proxy() {
        return Optional.ofNullable(this.proxy);
    }
    /**
     * @return URL to the remote repository.
     * 
     */
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }
    /**
     * @return SSH Key in PEM format for authenticating the repository. Used only for Git repository.
     * 
     */
    public Optional<String> sshPrivateKey() {
        return Optional.ofNullable(this.sshPrivateKey);
    }
    /**
     * @return Certificate in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
     * 
     */
    public Optional<String> tlsClientCertData() {
        return Optional.ofNullable(this.tlsClientCertData);
    }
    /**
     * @return Private key in PEM format for authenticating at the repo server. This is used for mTLS. The value should be base64 encoded.
     * 
     */
    public Optional<String> tlsClientCertKey() {
        return Optional.ofNullable(this.tlsClientCertKey);
    }
    /**
     * @return Type specifies the type of the repo. Can be either &#34;git&#34; or &#34;helm. &#34;git&#34; is assumed if empty or absent.
     * 
     */
    public String type_() {
        return this.type_;
    }
    /**
     * @return Username to be used for authenticating the remote repository.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsRepositoryRepo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectionType;
        private @Nullable Boolean enableLfs;
        private @Nullable Boolean enableOci;
        private @Nullable String githubAppEnterpriseBaseUrl;
        private @Nullable String githubAppId;
        private @Nullable String githubAppInstallationId;
        private @Nullable String githubAppPrivateKey;
        private @Nullable Boolean inheritedCreds;
        private @Nullable Boolean insecure;
        private @Nullable Boolean insecureIgnoreHostKey;
        private @Nullable String name;
        private @Nullable String password;
        private String project;
        private @Nullable String proxy;
        private @Nullable String repo;
        private @Nullable String sshPrivateKey;
        private @Nullable String tlsClientCertData;
        private @Nullable String tlsClientCertKey;
        private String type_;
        private @Nullable String username;
        public Builder() {}
        public Builder(GetGitopsRepositoryRepo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionType = defaults.connectionType;
    	      this.enableLfs = defaults.enableLfs;
    	      this.enableOci = defaults.enableOci;
    	      this.githubAppEnterpriseBaseUrl = defaults.githubAppEnterpriseBaseUrl;
    	      this.githubAppId = defaults.githubAppId;
    	      this.githubAppInstallationId = defaults.githubAppInstallationId;
    	      this.githubAppPrivateKey = defaults.githubAppPrivateKey;
    	      this.inheritedCreds = defaults.inheritedCreds;
    	      this.insecure = defaults.insecure;
    	      this.insecureIgnoreHostKey = defaults.insecureIgnoreHostKey;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.project = defaults.project;
    	      this.proxy = defaults.proxy;
    	      this.repo = defaults.repo;
    	      this.sshPrivateKey = defaults.sshPrivateKey;
    	      this.tlsClientCertData = defaults.tlsClientCertData;
    	      this.tlsClientCertKey = defaults.tlsClientCertKey;
    	      this.type_ = defaults.type_;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder connectionType(@Nullable String connectionType) {

            this.connectionType = connectionType;
            return this;
        }
        @CustomType.Setter
        public Builder enableLfs(@Nullable Boolean enableLfs) {

            this.enableLfs = enableLfs;
            return this;
        }
        @CustomType.Setter
        public Builder enableOci(@Nullable Boolean enableOci) {

            this.enableOci = enableOci;
            return this;
        }
        @CustomType.Setter
        public Builder githubAppEnterpriseBaseUrl(@Nullable String githubAppEnterpriseBaseUrl) {

            this.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder githubAppId(@Nullable String githubAppId) {

            this.githubAppId = githubAppId;
            return this;
        }
        @CustomType.Setter
        public Builder githubAppInstallationId(@Nullable String githubAppInstallationId) {

            this.githubAppInstallationId = githubAppInstallationId;
            return this;
        }
        @CustomType.Setter
        public Builder githubAppPrivateKey(@Nullable String githubAppPrivateKey) {

            this.githubAppPrivateKey = githubAppPrivateKey;
            return this;
        }
        @CustomType.Setter
        public Builder inheritedCreds(@Nullable Boolean inheritedCreds) {

            this.inheritedCreds = inheritedCreds;
            return this;
        }
        @CustomType.Setter
        public Builder insecure(@Nullable Boolean insecure) {

            this.insecure = insecure;
            return this;
        }
        @CustomType.Setter
        public Builder insecureIgnoreHostKey(@Nullable Boolean insecureIgnoreHostKey) {

            this.insecureIgnoreHostKey = insecureIgnoreHostKey;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetGitopsRepositoryRepo", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder proxy(@Nullable String proxy) {

            this.proxy = proxy;
            return this;
        }
        @CustomType.Setter
        public Builder repo(@Nullable String repo) {

            this.repo = repo;
            return this;
        }
        @CustomType.Setter
        public Builder sshPrivateKey(@Nullable String sshPrivateKey) {

            this.sshPrivateKey = sshPrivateKey;
            return this;
        }
        @CustomType.Setter
        public Builder tlsClientCertData(@Nullable String tlsClientCertData) {

            this.tlsClientCertData = tlsClientCertData;
            return this;
        }
        @CustomType.Setter
        public Builder tlsClientCertKey(@Nullable String tlsClientCertKey) {

            this.tlsClientCertKey = tlsClientCertKey;
            return this;
        }
        @CustomType.Setter
        public Builder type_(String type_) {
            if (type_ == null) {
              throw new MissingRequiredPropertyException("GetGitopsRepositoryRepo", "type_");
            }
            this.type_ = type_;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public GetGitopsRepositoryRepo build() {
            final var _resultValue = new GetGitopsRepositoryRepo();
            _resultValue.connectionType = connectionType;
            _resultValue.enableLfs = enableLfs;
            _resultValue.enableOci = enableOci;
            _resultValue.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            _resultValue.githubAppId = githubAppId;
            _resultValue.githubAppInstallationId = githubAppInstallationId;
            _resultValue.githubAppPrivateKey = githubAppPrivateKey;
            _resultValue.inheritedCreds = inheritedCreds;
            _resultValue.insecure = insecure;
            _resultValue.insecureIgnoreHostKey = insecureIgnoreHostKey;
            _resultValue.name = name;
            _resultValue.password = password;
            _resultValue.project = project;
            _resultValue.proxy = proxy;
            _resultValue.repo = repo;
            _resultValue.sshPrivateKey = sshPrivateKey;
            _resultValue.tlsClientCertData = tlsClientCertData;
            _resultValue.tlsClientCertKey = tlsClientCertKey;
            _resultValue.type_ = type_;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
