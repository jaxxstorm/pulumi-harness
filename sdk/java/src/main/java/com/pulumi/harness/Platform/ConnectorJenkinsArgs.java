// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ConnectorJenkinsAuthArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorJenkinsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorJenkinsArgs Empty = new ConnectorJenkinsArgs();

    /**
     * This entity contains the details for Jenkins Authentication.
     * 
     */
    @Import(name="auth")
    private @Nullable Output<ConnectorJenkinsAuthArgs> auth;

    /**
     * @return This entity contains the details for Jenkins Authentication.
     * 
     */
    public Optional<Output<ConnectorJenkinsAuthArgs>> auth() {
        return Optional.ofNullable(this.auth);
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
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Jenkins Url.
     * 
     */
    @Import(name="jenkinsUrl", required=true)
    private Output<String> jenkinsUrl;

    /**
     * @return Jenkins Url.
     * 
     */
    public Output<String> jenkinsUrl() {
        return this.jenkinsUrl;
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

    private ConnectorJenkinsArgs() {}

    private ConnectorJenkinsArgs(ConnectorJenkinsArgs $) {
        this.auth = $.auth;
        this.delegateSelectors = $.delegateSelectors;
        this.description = $.description;
        this.identifier = $.identifier;
        this.jenkinsUrl = $.jenkinsUrl;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorJenkinsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorJenkinsArgs $;

        public Builder() {
            $ = new ConnectorJenkinsArgs();
        }

        public Builder(ConnectorJenkinsArgs defaults) {
            $ = new ConnectorJenkinsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auth This entity contains the details for Jenkins Authentication.
         * 
         * @return builder
         * 
         */
        public Builder auth(@Nullable Output<ConnectorJenkinsAuthArgs> auth) {
            $.auth = auth;
            return this;
        }

        /**
         * @param auth This entity contains the details for Jenkins Authentication.
         * 
         * @return builder
         * 
         */
        public Builder auth(ConnectorJenkinsAuthArgs auth) {
            return auth(Output.of(auth));
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
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
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
         * @param jenkinsUrl Jenkins Url.
         * 
         * @return builder
         * 
         */
        public Builder jenkinsUrl(Output<String> jenkinsUrl) {
            $.jenkinsUrl = jenkinsUrl;
            return this;
        }

        /**
         * @param jenkinsUrl Jenkins Url.
         * 
         * @return builder
         * 
         */
        public Builder jenkinsUrl(String jenkinsUrl) {
            return jenkinsUrl(Output.of(jenkinsUrl));
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

        public ConnectorJenkinsArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.jenkinsUrl = Objects.requireNonNull($.jenkinsUrl, "expected parameter 'jenkinsUrl' to be non-null");
            return $;
        }
    }

}
