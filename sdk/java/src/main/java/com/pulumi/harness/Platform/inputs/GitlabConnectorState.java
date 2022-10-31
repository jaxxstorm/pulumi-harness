// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitlabConnectorApiAuthenticationArgs;
import com.pulumi.harness.platform.inputs.GitlabConnectorCredentialsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitlabConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final GitlabConnectorState Empty = new GitlabConnectorState();

    /**
     * Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     * 
     */
    @Import(name="apiAuthentication")
    private @Nullable Output<GitlabConnectorApiAuthenticationArgs> apiAuthentication;

    /**
     * @return Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     * 
     */
    public Optional<Output<GitlabConnectorApiAuthenticationArgs>> apiAuthentication() {
        return Optional.ofNullable(this.apiAuthentication);
    }

    /**
     * Whether the connection we&#39;re making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
     * 
     */
    @Import(name="connectionType")
    private @Nullable Output<String> connectionType;

    /**
     * @return Whether the connection we&#39;re making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
     * 
     */
    public Optional<Output<String>> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }

    /**
     * Credentials to use for the connection.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<GitlabConnectorCredentialsArgs> credentials;

    /**
     * @return Credentials to use for the connection.
     * 
     */
    public Optional<Output<GitlabConnectorCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * Connect using only the delegates which have these tags.
     * 
     */
    @Import(name="delegateSelectors")
    private @Nullable Output<List<String>> delegateSelectors;

    /**
     * @return Connect using only the delegates which have these tags.
     * 
     */
    public Optional<Output<List<String>>> delegateSelectors() {
        return Optional.ofNullable(this.delegateSelectors);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the Organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the Organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the Project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the Project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Url of the gitlab repository or account.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Url of the gitlab repository or account.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    @Import(name="validationRepo")
    private @Nullable Output<String> validationRepo;

    /**
     * @return Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    public Optional<Output<String>> validationRepo() {
        return Optional.ofNullable(this.validationRepo);
    }

    private GitlabConnectorState() {}

    private GitlabConnectorState(GitlabConnectorState $) {
        this.apiAuthentication = $.apiAuthentication;
        this.connectionType = $.connectionType;
        this.credentials = $.credentials;
        this.delegateSelectors = $.delegateSelectors;
        this.description = $.description;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.tags = $.tags;
        this.url = $.url;
        this.validationRepo = $.validationRepo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitlabConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitlabConnectorState $;

        public Builder() {
            $ = new GitlabConnectorState();
        }

        public Builder(GitlabConnectorState defaults) {
            $ = new GitlabConnectorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiAuthentication Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
         * 
         * @return builder
         * 
         */
        public Builder apiAuthentication(@Nullable Output<GitlabConnectorApiAuthenticationArgs> apiAuthentication) {
            $.apiAuthentication = apiAuthentication;
            return this;
        }

        /**
         * @param apiAuthentication Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
         * 
         * @return builder
         * 
         */
        public Builder apiAuthentication(GitlabConnectorApiAuthenticationArgs apiAuthentication) {
            return apiAuthentication(Output.of(apiAuthentication));
        }

        /**
         * @param connectionType Whether the connection we&#39;re making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(@Nullable Output<String> connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param connectionType Whether the connection we&#39;re making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            return connectionType(Output.of(connectionType));
        }

        /**
         * @param credentials Credentials to use for the connection.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<GitlabConnectorCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Credentials to use for the connection.
         * 
         * @return builder
         * 
         */
        public Builder credentials(GitlabConnectorCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param delegateSelectors Connect using only the delegates which have these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(@Nullable Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors Connect using only the delegates which have these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors Connect using only the delegates which have these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param url Url of the gitlab repository or account.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Url of the gitlab repository or account.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param validationRepo Repository to test the connection with. This is only used when `connection_type` is `Account`.
         * 
         * @return builder
         * 
         */
        public Builder validationRepo(@Nullable Output<String> validationRepo) {
            $.validationRepo = validationRepo;
            return this;
        }

        /**
         * @param validationRepo Repository to test the connection with. This is only used when `connection_type` is `Account`.
         * 
         * @return builder
         * 
         */
        public Builder validationRepo(String validationRepo) {
            return validationRepo(Output.of(validationRepo));
        }

        public GitlabConnectorState build() {
            return $;
        }
    }

}
