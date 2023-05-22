// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ConnectorAzureCloudProviderCredentialsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorAzureCloudProviderState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorAzureCloudProviderState Empty = new ConnectorAzureCloudProviderState();

    /**
     * Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
     * 
     */
    @Import(name="azureEnvironmentType")
    private @Nullable Output<String> azureEnvironmentType;

    /**
     * @return Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
     * 
     */
    public Optional<Output<String>> azureEnvironmentType() {
        return Optional.ofNullable(this.azureEnvironmentType);
    }

    /**
     * Contains Azure connector credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<ConnectorAzureCloudProviderCredentialsArgs> credentials;

    /**
     * @return Contains Azure connector credentials.
     * 
     */
    public Optional<Output<ConnectorAzureCloudProviderCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
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
     * Execute on delegate or not.
     * 
     */
    @Import(name="executeOnDelegate")
    private @Nullable Output<Boolean> executeOnDelegate;

    /**
     * @return Execute on delegate or not.
     * 
     */
    public Optional<Output<Boolean>> executeOnDelegate() {
        return Optional.ofNullable(this.executeOnDelegate);
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

    private ConnectorAzureCloudProviderState() {}

    private ConnectorAzureCloudProviderState(ConnectorAzureCloudProviderState $) {
        this.azureEnvironmentType = $.azureEnvironmentType;
        this.credentials = $.credentials;
        this.delegateSelectors = $.delegateSelectors;
        this.description = $.description;
        this.executeOnDelegate = $.executeOnDelegate;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorAzureCloudProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorAzureCloudProviderState $;

        public Builder() {
            $ = new ConnectorAzureCloudProviderState();
        }

        public Builder(ConnectorAzureCloudProviderState defaults) {
            $ = new ConnectorAzureCloudProviderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureEnvironmentType Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
         * 
         * @return builder
         * 
         */
        public Builder azureEnvironmentType(@Nullable Output<String> azureEnvironmentType) {
            $.azureEnvironmentType = azureEnvironmentType;
            return this;
        }

        /**
         * @param azureEnvironmentType Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
         * 
         * @return builder
         * 
         */
        public Builder azureEnvironmentType(String azureEnvironmentType) {
            return azureEnvironmentType(Output.of(azureEnvironmentType));
        }

        /**
         * @param credentials Contains Azure connector credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<ConnectorAzureCloudProviderCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Contains Azure connector credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(ConnectorAzureCloudProviderCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
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
         * @param executeOnDelegate Execute on delegate or not.
         * 
         * @return builder
         * 
         */
        public Builder executeOnDelegate(@Nullable Output<Boolean> executeOnDelegate) {
            $.executeOnDelegate = executeOnDelegate;
            return this;
        }

        /**
         * @param executeOnDelegate Execute on delegate or not.
         * 
         * @return builder
         * 
         */
        public Builder executeOnDelegate(Boolean executeOnDelegate) {
            return executeOnDelegate(Output.of(executeOnDelegate));
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

        public ConnectorAzureCloudProviderState build() {
            return $;
        }
    }

}
