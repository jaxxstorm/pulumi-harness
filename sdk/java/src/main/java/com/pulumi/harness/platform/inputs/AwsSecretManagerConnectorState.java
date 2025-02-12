// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.AwsSecretManagerConnectorCredentialsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsSecretManagerConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final AwsSecretManagerConnectorState Empty = new AwsSecretManagerConnectorState();

    /**
     * Credentials to connect to AWS.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<AwsSecretManagerConnectorCredentialsArgs> credentials;

    /**
     * @return Credentials to connect to AWS.
     * 
     */
    public Optional<Output<AwsSecretManagerConnectorCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * Use as Default Secrets Manager.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return Use as Default Secrets Manager.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * Tags to filter delegates for connection.
     * 
     */
    @Import(name="delegateSelectors")
    private @Nullable Output<List<String>> delegateSelectors;

    /**
     * @return Tags to filter delegates for connection.
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
     * Run the operation on the delegate or harness platform.
     * 
     */
    @Import(name="executeOnDelegate")
    private @Nullable Output<Boolean> executeOnDelegate;

    /**
     * @return Run the operation on the delegate or harness platform.
     * 
     */
    public Optional<Output<Boolean>> executeOnDelegate() {
        return Optional.ofNullable(this.executeOnDelegate);
    }

    /**
     * Whether to force delete secret value or not.
     * 
     */
    @Import(name="forceDeleteWithoutRecovery")
    private @Nullable Output<Boolean> forceDeleteWithoutRecovery;

    /**
     * @return Whether to force delete secret value or not.
     * 
     */
    public Optional<Output<Boolean>> forceDeleteWithoutRecovery() {
        return Optional.ofNullable(this.forceDeleteWithoutRecovery);
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
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * recovery duration in days in AWS Secrets Manager.
     * 
     */
    @Import(name="recoveryWindowInDays")
    private @Nullable Output<Integer> recoveryWindowInDays;

    /**
     * @return recovery duration in days in AWS Secrets Manager.
     * 
     */
    public Optional<Output<Integer>> recoveryWindowInDays() {
        return Optional.ofNullable(this.recoveryWindowInDays);
    }

    /**
     * The AWS region where the AWS Secret Manager is.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The AWS region where the AWS Secret Manager is.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * A prefix to be added to all secrets.
     * 
     */
    @Import(name="secretNamePrefix")
    private @Nullable Output<String> secretNamePrefix;

    /**
     * @return A prefix to be added to all secrets.
     * 
     */
    public Optional<Output<String>> secretNamePrefix() {
        return Optional.ofNullable(this.secretNamePrefix);
    }

    /**
     * Tags to associate with the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Whether to update secret value using putSecretValue action.
     * 
     */
    @Import(name="usePutSecret")
    private @Nullable Output<Boolean> usePutSecret;

    /**
     * @return Whether to update secret value using putSecretValue action.
     * 
     */
    public Optional<Output<Boolean>> usePutSecret() {
        return Optional.ofNullable(this.usePutSecret);
    }

    private AwsSecretManagerConnectorState() {}

    private AwsSecretManagerConnectorState(AwsSecretManagerConnectorState $) {
        this.credentials = $.credentials;
        this.default_ = $.default_;
        this.delegateSelectors = $.delegateSelectors;
        this.description = $.description;
        this.executeOnDelegate = $.executeOnDelegate;
        this.forceDeleteWithoutRecovery = $.forceDeleteWithoutRecovery;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.recoveryWindowInDays = $.recoveryWindowInDays;
        this.region = $.region;
        this.secretNamePrefix = $.secretNamePrefix;
        this.tags = $.tags;
        this.usePutSecret = $.usePutSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsSecretManagerConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsSecretManagerConnectorState $;

        public Builder() {
            $ = new AwsSecretManagerConnectorState();
        }

        public Builder(AwsSecretManagerConnectorState defaults) {
            $ = new AwsSecretManagerConnectorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials Credentials to connect to AWS.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<AwsSecretManagerConnectorCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Credentials to connect to AWS.
         * 
         * @return builder
         * 
         */
        public Builder credentials(AwsSecretManagerConnectorCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param default_ Use as Default Secrets Manager.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Use as Default Secrets Manager.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param delegateSelectors Tags to filter delegates for connection.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(@Nullable Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors Tags to filter delegates for connection.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors Tags to filter delegates for connection.
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
         * @param executeOnDelegate Run the operation on the delegate or harness platform.
         * 
         * @return builder
         * 
         */
        public Builder executeOnDelegate(@Nullable Output<Boolean> executeOnDelegate) {
            $.executeOnDelegate = executeOnDelegate;
            return this;
        }

        /**
         * @param executeOnDelegate Run the operation on the delegate or harness platform.
         * 
         * @return builder
         * 
         */
        public Builder executeOnDelegate(Boolean executeOnDelegate) {
            return executeOnDelegate(Output.of(executeOnDelegate));
        }

        /**
         * @param forceDeleteWithoutRecovery Whether to force delete secret value or not.
         * 
         * @return builder
         * 
         */
        public Builder forceDeleteWithoutRecovery(@Nullable Output<Boolean> forceDeleteWithoutRecovery) {
            $.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
            return this;
        }

        /**
         * @param forceDeleteWithoutRecovery Whether to force delete secret value or not.
         * 
         * @return builder
         * 
         */
        public Builder forceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
            return forceDeleteWithoutRecovery(Output.of(forceDeleteWithoutRecovery));
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
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param recoveryWindowInDays recovery duration in days in AWS Secrets Manager.
         * 
         * @return builder
         * 
         */
        public Builder recoveryWindowInDays(@Nullable Output<Integer> recoveryWindowInDays) {
            $.recoveryWindowInDays = recoveryWindowInDays;
            return this;
        }

        /**
         * @param recoveryWindowInDays recovery duration in days in AWS Secrets Manager.
         * 
         * @return builder
         * 
         */
        public Builder recoveryWindowInDays(Integer recoveryWindowInDays) {
            return recoveryWindowInDays(Output.of(recoveryWindowInDays));
        }

        /**
         * @param region The AWS region where the AWS Secret Manager is.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The AWS region where the AWS Secret Manager is.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secretNamePrefix A prefix to be added to all secrets.
         * 
         * @return builder
         * 
         */
        public Builder secretNamePrefix(@Nullable Output<String> secretNamePrefix) {
            $.secretNamePrefix = secretNamePrefix;
            return this;
        }

        /**
         * @param secretNamePrefix A prefix to be added to all secrets.
         * 
         * @return builder
         * 
         */
        public Builder secretNamePrefix(String secretNamePrefix) {
            return secretNamePrefix(Output.of(secretNamePrefix));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param usePutSecret Whether to update secret value using putSecretValue action.
         * 
         * @return builder
         * 
         */
        public Builder usePutSecret(@Nullable Output<Boolean> usePutSecret) {
            $.usePutSecret = usePutSecret;
            return this;
        }

        /**
         * @param usePutSecret Whether to update secret value using putSecretValue action.
         * 
         * @return builder
         * 
         */
        public Builder usePutSecret(Boolean usePutSecret) {
            return usePutSecret(Output.of(usePutSecret));
        }

        public AwsSecretManagerConnectorState build() {
            return $;
        }
    }

}
