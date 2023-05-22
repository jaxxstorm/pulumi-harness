// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsRepoCredCred extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepoCredCred Empty = new GetGitopsRepoCredCred();

    /**
     * Specifies whether helm-oci support should be enabled for this repo.
     * 
     */
    @Import(name="enableOci")
    private @Nullable Boolean enableOci;

    /**
     * @return Specifies whether helm-oci support should be enabled for this repo.
     * 
     */
    public Optional<Boolean> enableOci() {
        return Optional.ofNullable(this.enableOci);
    }

    /**
     * Specifies the GitHub API URL for GitHub app authentication.
     * 
     */
    @Import(name="githubAppEnterpriseBaseUrl")
    private @Nullable String githubAppEnterpriseBaseUrl;

    /**
     * @return Specifies the GitHub API URL for GitHub app authentication.
     * 
     */
    public Optional<String> githubAppEnterpriseBaseUrl() {
        return Optional.ofNullable(this.githubAppEnterpriseBaseUrl);
    }

    /**
     * Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
     * 
     */
    @Import(name="githubAppId")
    private @Nullable String githubAppId;

    /**
     * @return Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
     * 
     */
    public Optional<String> githubAppId() {
        return Optional.ofNullable(this.githubAppId);
    }

    /**
     * Specifies the ID of the installed GitHub App for GitHub app authentication.
     * 
     */
    @Import(name="githubAppInstallationId")
    private @Nullable String githubAppInstallationId;

    /**
     * @return Specifies the ID of the installed GitHub App for GitHub app authentication.
     * 
     */
    public Optional<String> githubAppInstallationId() {
        return Optional.ofNullable(this.githubAppInstallationId);
    }

    /**
     * github*app*private_key specifies the private key PEM data for authentication via GitHub app.
     * 
     */
    @Import(name="githubAppPrivateKey")
    private @Nullable String githubAppPrivateKey;

    /**
     * @return github*app*private_key specifies the private key PEM data for authentication via GitHub app.
     * 
     */
    public Optional<String> githubAppPrivateKey() {
        return Optional.ofNullable(this.githubAppPrivateKey);
    }

    /**
     * Password for authenticating at the repo server.
     * 
     */
    @Import(name="password")
    private @Nullable String password;

    /**
     * @return Password for authenticating at the repo server.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Contains the private key data for authenticating at the repo server using SSH (only Git repos).
     * 
     */
    @Import(name="sshPrivateKey")
    private @Nullable String sshPrivateKey;

    /**
     * @return Contains the private key data for authenticating at the repo server using SSH (only Git repos).
     * 
     */
    public Optional<String> sshPrivateKey() {
        return Optional.ofNullable(this.sshPrivateKey);
    }

    /**
     * Specifies the TLS client cert data for authenticating at the repo server.
     * 
     */
    @Import(name="tlsClientCertData")
    private @Nullable String tlsClientCertData;

    /**
     * @return Specifies the TLS client cert data for authenticating at the repo server.
     * 
     */
    public Optional<String> tlsClientCertData() {
        return Optional.ofNullable(this.tlsClientCertData);
    }

    /**
     * Specifies the TLS client cert key for authenticating at the repo server.
     * 
     */
    @Import(name="tlsClientCertKey")
    private @Nullable String tlsClientCertKey;

    /**
     * @return Specifies the TLS client cert key for authenticating at the repo server.
     * 
     */
    public Optional<String> tlsClientCertKey() {
        return Optional.ofNullable(this.tlsClientCertKey);
    }

    /**
     * Type specifies the type of the repoCreds.Can be either &#39;git&#39; or &#39;helm. &#39;git&#39; is assumed if empty or absent
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Type specifies the type of the repoCreds.Can be either &#39;git&#39; or &#39;helm. &#39;git&#39; is assumed if empty or absent
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * url representing this object.
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return url representing this object.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * Username for authenticating at the repo server.
     * 
     */
    @Import(name="username")
    private @Nullable String username;

    /**
     * @return Username for authenticating at the repo server.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    private GetGitopsRepoCredCred() {}

    private GetGitopsRepoCredCred(GetGitopsRepoCredCred $) {
        this.enableOci = $.enableOci;
        this.githubAppEnterpriseBaseUrl = $.githubAppEnterpriseBaseUrl;
        this.githubAppId = $.githubAppId;
        this.githubAppInstallationId = $.githubAppInstallationId;
        this.githubAppPrivateKey = $.githubAppPrivateKey;
        this.password = $.password;
        this.sshPrivateKey = $.sshPrivateKey;
        this.tlsClientCertData = $.tlsClientCertData;
        this.tlsClientCertKey = $.tlsClientCertKey;
        this.type = $.type;
        this.url = $.url;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsRepoCredCred defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepoCredCred $;

        public Builder() {
            $ = new GetGitopsRepoCredCred();
        }

        public Builder(GetGitopsRepoCredCred defaults) {
            $ = new GetGitopsRepoCredCred(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableOci Specifies whether helm-oci support should be enabled for this repo.
         * 
         * @return builder
         * 
         */
        public Builder enableOci(@Nullable Boolean enableOci) {
            $.enableOci = enableOci;
            return this;
        }

        /**
         * @param githubAppEnterpriseBaseUrl Specifies the GitHub API URL for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppEnterpriseBaseUrl(@Nullable String githubAppEnterpriseBaseUrl) {
            $.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            return this;
        }

        /**
         * @param githubAppId Specifies the Github App ID of the app used to access the repo for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppId(@Nullable String githubAppId) {
            $.githubAppId = githubAppId;
            return this;
        }

        /**
         * @param githubAppInstallationId Specifies the ID of the installed GitHub App for GitHub app authentication.
         * 
         * @return builder
         * 
         */
        public Builder githubAppInstallationId(@Nullable String githubAppInstallationId) {
            $.githubAppInstallationId = githubAppInstallationId;
            return this;
        }

        /**
         * @param githubAppPrivateKey github*app*private_key specifies the private key PEM data for authentication via GitHub app.
         * 
         * @return builder
         * 
         */
        public Builder githubAppPrivateKey(@Nullable String githubAppPrivateKey) {
            $.githubAppPrivateKey = githubAppPrivateKey;
            return this;
        }

        /**
         * @param password Password for authenticating at the repo server.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable String password) {
            $.password = password;
            return this;
        }

        /**
         * @param sshPrivateKey Contains the private key data for authenticating at the repo server using SSH (only Git repos).
         * 
         * @return builder
         * 
         */
        public Builder sshPrivateKey(@Nullable String sshPrivateKey) {
            $.sshPrivateKey = sshPrivateKey;
            return this;
        }

        /**
         * @param tlsClientCertData Specifies the TLS client cert data for authenticating at the repo server.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertData(@Nullable String tlsClientCertData) {
            $.tlsClientCertData = tlsClientCertData;
            return this;
        }

        /**
         * @param tlsClientCertKey Specifies the TLS client cert key for authenticating at the repo server.
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCertKey(@Nullable String tlsClientCertKey) {
            $.tlsClientCertKey = tlsClientCertKey;
            return this;
        }

        /**
         * @param type Type specifies the type of the repoCreds.Can be either &#39;git&#39; or &#39;helm. &#39;git&#39; is assumed if empty or absent
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        /**
         * @param url url representing this object.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        /**
         * @param username Username for authenticating at the repo server.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable String username) {
            $.username = username;
            return this;
        }

        public GetGitopsRepoCredCred build() {
            return $;
        }
    }

}
