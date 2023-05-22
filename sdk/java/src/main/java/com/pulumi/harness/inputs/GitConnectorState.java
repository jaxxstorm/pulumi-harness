// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.inputs.GitConnectorCommitDetailsArgs;
import com.pulumi.harness.inputs.GitConnectorUsageScopeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final GitConnectorState Empty = new GitConnectorState();

    /**
     * The branch of the git connector to use
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return The branch of the git connector to use
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Custom details to use when making commits using this git connector
     * 
     */
    @Import(name="commitDetails")
    private @Nullable Output<GitConnectorCommitDetailsArgs> commitDetails;

    /**
     * @return Custom details to use when making commits using this git connector
     * 
     */
    public Optional<Output<GitConnectorCommitDetailsArgs>> commitDetails() {
        return Optional.ofNullable(this.commitDetails);
    }

    /**
     * The time the git connector was created
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The time the git connector was created
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Delegate selectors to apply to this git connector.
     * 
     */
    @Import(name="delegateSelectors")
    private @Nullable Output<List<String>> delegateSelectors;

    /**
     * @return Delegate selectors to apply to this git connector.
     * 
     */
    public Optional<Output<List<String>>> delegateSelectors() {
        return Optional.ofNullable(this.delegateSelectors);
    }

    /**
     * Boolean indicating whether or not to generate a webhook url.
     * 
     */
    @Import(name="generateWebhookUrl")
    private @Nullable Output<Boolean> generateWebhookUrl;

    /**
     * @return Boolean indicating whether or not to generate a webhook url.
     * 
     */
    public Optional<Output<Boolean>> generateWebhookUrl() {
        return Optional.ofNullable(this.generateWebhookUrl);
    }

    /**
     * Name of the git connector.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the git connector.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The id of the secret for connecting to the git repository.
     * 
     */
    @Import(name="passwordSecretId")
    private @Nullable Output<String> passwordSecretId;

    /**
     * @return The id of the secret for connecting to the git repository.
     * 
     */
    public Optional<Output<String>> passwordSecretId() {
        return Optional.ofNullable(this.passwordSecretId);
    }

    /**
     * The id of the SSH secret to use
     * 
     */
    @Import(name="sshSettingId")
    private @Nullable Output<String> sshSettingId;

    /**
     * @return The id of the SSH secret to use
     * 
     */
    public Optional<Output<String>> sshSettingId() {
        return Optional.ofNullable(this.sshSettingId);
    }

    /**
     * The URL of the git repository or account/organization
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the git repository or account/organization
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The type of git url being used. Options are `ACCOUNT`, and `REPO.`
     * 
     */
    @Import(name="urlType")
    private @Nullable Output<String> urlType;

    /**
     * @return The type of git url being used. Options are `ACCOUNT`, and `REPO.`
     * 
     */
    public Optional<Output<String>> urlType() {
        return Optional.ofNullable(this.urlType);
    }

    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Import(name="usageScopes")
    private @Nullable Output<List<GitConnectorUsageScopeArgs>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Optional<Output<List<GitConnectorUsageScopeArgs>>> usageScopes() {
        return Optional.ofNullable(this.usageScopes);
    }

    /**
     * The name of the user used to connect to the git repository
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The name of the user used to connect to the git repository
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * The generated webhook url
     * 
     */
    @Import(name="webhookUrl")
    private @Nullable Output<String> webhookUrl;

    /**
     * @return The generated webhook url
     * 
     */
    public Optional<Output<String>> webhookUrl() {
        return Optional.ofNullable(this.webhookUrl);
    }

    private GitConnectorState() {}

    private GitConnectorState(GitConnectorState $) {
        this.branch = $.branch;
        this.commitDetails = $.commitDetails;
        this.createdAt = $.createdAt;
        this.delegateSelectors = $.delegateSelectors;
        this.generateWebhookUrl = $.generateWebhookUrl;
        this.name = $.name;
        this.passwordSecretId = $.passwordSecretId;
        this.sshSettingId = $.sshSettingId;
        this.url = $.url;
        this.urlType = $.urlType;
        this.usageScopes = $.usageScopes;
        this.username = $.username;
        this.webhookUrl = $.webhookUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitConnectorState $;

        public Builder() {
            $ = new GitConnectorState();
        }

        public Builder(GitConnectorState defaults) {
            $ = new GitConnectorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch The branch of the git connector to use
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch The branch of the git connector to use
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param commitDetails Custom details to use when making commits using this git connector
         * 
         * @return builder
         * 
         */
        public Builder commitDetails(@Nullable Output<GitConnectorCommitDetailsArgs> commitDetails) {
            $.commitDetails = commitDetails;
            return this;
        }

        /**
         * @param commitDetails Custom details to use when making commits using this git connector
         * 
         * @return builder
         * 
         */
        public Builder commitDetails(GitConnectorCommitDetailsArgs commitDetails) {
            return commitDetails(Output.of(commitDetails));
        }

        /**
         * @param createdAt The time the git connector was created
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The time the git connector was created
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param delegateSelectors Delegate selectors to apply to this git connector.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(@Nullable Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors Delegate selectors to apply to this git connector.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors Delegate selectors to apply to this git connector.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }

        /**
         * @param generateWebhookUrl Boolean indicating whether or not to generate a webhook url.
         * 
         * @return builder
         * 
         */
        public Builder generateWebhookUrl(@Nullable Output<Boolean> generateWebhookUrl) {
            $.generateWebhookUrl = generateWebhookUrl;
            return this;
        }

        /**
         * @param generateWebhookUrl Boolean indicating whether or not to generate a webhook url.
         * 
         * @return builder
         * 
         */
        public Builder generateWebhookUrl(Boolean generateWebhookUrl) {
            return generateWebhookUrl(Output.of(generateWebhookUrl));
        }

        /**
         * @param name Name of the git connector.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the git connector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param passwordSecretId The id of the secret for connecting to the git repository.
         * 
         * @return builder
         * 
         */
        public Builder passwordSecretId(@Nullable Output<String> passwordSecretId) {
            $.passwordSecretId = passwordSecretId;
            return this;
        }

        /**
         * @param passwordSecretId The id of the secret for connecting to the git repository.
         * 
         * @return builder
         * 
         */
        public Builder passwordSecretId(String passwordSecretId) {
            return passwordSecretId(Output.of(passwordSecretId));
        }

        /**
         * @param sshSettingId The id of the SSH secret to use
         * 
         * @return builder
         * 
         */
        public Builder sshSettingId(@Nullable Output<String> sshSettingId) {
            $.sshSettingId = sshSettingId;
            return this;
        }

        /**
         * @param sshSettingId The id of the SSH secret to use
         * 
         * @return builder
         * 
         */
        public Builder sshSettingId(String sshSettingId) {
            return sshSettingId(Output.of(sshSettingId));
        }

        /**
         * @param url The URL of the git repository or account/organization
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the git repository or account/organization
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param urlType The type of git url being used. Options are `ACCOUNT`, and `REPO.`
         * 
         * @return builder
         * 
         */
        public Builder urlType(@Nullable Output<String> urlType) {
            $.urlType = urlType;
            return this;
        }

        /**
         * @param urlType The type of git url being used. Options are `ACCOUNT`, and `REPO.`
         * 
         * @return builder
         * 
         */
        public Builder urlType(String urlType) {
            return urlType(Output.of(urlType));
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(@Nullable Output<List<GitConnectorUsageScopeArgs>> usageScopes) {
            $.usageScopes = usageScopes;
            return this;
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(List<GitConnectorUsageScopeArgs> usageScopes) {
            return usageScopes(Output.of(usageScopes));
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(GitConnectorUsageScopeArgs... usageScopes) {
            return usageScopes(List.of(usageScopes));
        }

        /**
         * @param username The name of the user used to connect to the git repository
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The name of the user used to connect to the git repository
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param webhookUrl The generated webhook url
         * 
         * @return builder
         * 
         */
        public Builder webhookUrl(@Nullable Output<String> webhookUrl) {
            $.webhookUrl = webhookUrl;
            return this;
        }

        /**
         * @param webhookUrl The generated webhook url
         * 
         * @return builder
         * 
         */
        public Builder webhookUrl(String webhookUrl) {
            return webhookUrl(Output.of(webhookUrl));
        }

        public GitConnectorState build() {
            return $;
        }
    }

}
