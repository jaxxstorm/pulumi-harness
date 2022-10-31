// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsRepositoryRepo extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepositoryRepo Empty = new GetGitopsRepositoryRepo();

    @Import(name="connectionType", required=true)
    private String connectionType;

    public String connectionType() {
        return this.connectionType;
    }

    @Import(name="enableLfs")
    private @Nullable Boolean enableLfs;

    public Optional<Boolean> enableLfs() {
        return Optional.ofNullable(this.enableLfs);
    }

    @Import(name="enableOci")
    private @Nullable Boolean enableOci;

    public Optional<Boolean> enableOci() {
        return Optional.ofNullable(this.enableOci);
    }

    @Import(name="githubAppEnterpriseBaseUrl")
    private @Nullable String githubAppEnterpriseBaseUrl;

    public Optional<String> githubAppEnterpriseBaseUrl() {
        return Optional.ofNullable(this.githubAppEnterpriseBaseUrl);
    }

    @Import(name="githubAppId")
    private @Nullable String githubAppId;

    public Optional<String> githubAppId() {
        return Optional.ofNullable(this.githubAppId);
    }

    @Import(name="githubAppInstallationId")
    private @Nullable String githubAppInstallationId;

    public Optional<String> githubAppInstallationId() {
        return Optional.ofNullable(this.githubAppInstallationId);
    }

    @Import(name="githubAppPrivateKey")
    private @Nullable String githubAppPrivateKey;

    public Optional<String> githubAppPrivateKey() {
        return Optional.ofNullable(this.githubAppPrivateKey);
    }

    @Import(name="inheritedCreds")
    private @Nullable Boolean inheritedCreds;

    public Optional<Boolean> inheritedCreds() {
        return Optional.ofNullable(this.inheritedCreds);
    }

    @Import(name="insecure")
    private @Nullable Boolean insecure;

    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    @Import(name="insecureIgnoreHostKey")
    private @Nullable Boolean insecureIgnoreHostKey;

    public Optional<Boolean> insecureIgnoreHostKey() {
        return Optional.ofNullable(this.insecureIgnoreHostKey);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="password")
    private @Nullable String password;

    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="project", required=true)
    private String project;

    public String project() {
        return this.project;
    }

    @Import(name="proxy")
    private @Nullable String proxy;

    public Optional<String> proxy() {
        return Optional.ofNullable(this.proxy);
    }

    @Import(name="repo", required=true)
    private String repo;

    public String repo() {
        return this.repo;
    }

    @Import(name="sshPrivateKey")
    private @Nullable String sshPrivateKey;

    public Optional<String> sshPrivateKey() {
        return Optional.ofNullable(this.sshPrivateKey);
    }

    @Import(name="tlsClientCertData")
    private @Nullable String tlsClientCertData;

    public Optional<String> tlsClientCertData() {
        return Optional.ofNullable(this.tlsClientCertData);
    }

    @Import(name="tlsClientCertKey")
    private @Nullable String tlsClientCertKey;

    public Optional<String> tlsClientCertKey() {
        return Optional.ofNullable(this.tlsClientCertKey);
    }

    @Import(name="type_", required=true)
    private String type_;

    public String type_() {
        return this.type_;
    }

    @Import(name="username")
    private @Nullable String username;

    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    private GetGitopsRepositoryRepo() {}

    private GetGitopsRepositoryRepo(GetGitopsRepositoryRepo $) {
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
    public static Builder builder(GetGitopsRepositoryRepo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepositoryRepo $;

        public Builder() {
            $ = new GetGitopsRepositoryRepo();
        }

        public Builder(GetGitopsRepositoryRepo defaults) {
            $ = new GetGitopsRepositoryRepo(Objects.requireNonNull(defaults));
        }

        public Builder connectionType(String connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        public Builder enableLfs(@Nullable Boolean enableLfs) {
            $.enableLfs = enableLfs;
            return this;
        }

        public Builder enableOci(@Nullable Boolean enableOci) {
            $.enableOci = enableOci;
            return this;
        }

        public Builder githubAppEnterpriseBaseUrl(@Nullable String githubAppEnterpriseBaseUrl) {
            $.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            return this;
        }

        public Builder githubAppId(@Nullable String githubAppId) {
            $.githubAppId = githubAppId;
            return this;
        }

        public Builder githubAppInstallationId(@Nullable String githubAppInstallationId) {
            $.githubAppInstallationId = githubAppInstallationId;
            return this;
        }

        public Builder githubAppPrivateKey(@Nullable String githubAppPrivateKey) {
            $.githubAppPrivateKey = githubAppPrivateKey;
            return this;
        }

        public Builder inheritedCreds(@Nullable Boolean inheritedCreds) {
            $.inheritedCreds = inheritedCreds;
            return this;
        }

        public Builder insecure(@Nullable Boolean insecure) {
            $.insecure = insecure;
            return this;
        }

        public Builder insecureIgnoreHostKey(@Nullable Boolean insecureIgnoreHostKey) {
            $.insecureIgnoreHostKey = insecureIgnoreHostKey;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder password(@Nullable String password) {
            $.password = password;
            return this;
        }

        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public Builder proxy(@Nullable String proxy) {
            $.proxy = proxy;
            return this;
        }

        public Builder repo(String repo) {
            $.repo = repo;
            return this;
        }

        public Builder sshPrivateKey(@Nullable String sshPrivateKey) {
            $.sshPrivateKey = sshPrivateKey;
            return this;
        }

        public Builder tlsClientCertData(@Nullable String tlsClientCertData) {
            $.tlsClientCertData = tlsClientCertData;
            return this;
        }

        public Builder tlsClientCertKey(@Nullable String tlsClientCertKey) {
            $.tlsClientCertKey = tlsClientCertKey;
            return this;
        }

        public Builder type_(String type_) {
            $.type_ = type_;
            return this;
        }

        public Builder username(@Nullable String username) {
            $.username = username;
            return this;
        }

        public GetGitopsRepositoryRepo build() {
            $.connectionType = Objects.requireNonNull($.connectionType, "expected parameter 'connectionType' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.repo = Objects.requireNonNull($.repo, "expected parameter 'repo' to be non-null");
            $.type_ = Objects.requireNonNull($.type_, "expected parameter 'type_' to be non-null");
            return $;
        }
    }

}