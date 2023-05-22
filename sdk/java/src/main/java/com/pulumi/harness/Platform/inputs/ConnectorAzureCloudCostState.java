// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ConnectorAzureCloudCostBillingExportSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorAzureCloudCostState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorAzureCloudCostState Empty = new ConnectorAzureCloudCostState();

    /**
     * Returns billing details for the Azure account.
     * 
     */
    @Import(name="billingExportSpec")
    private @Nullable Output<ConnectorAzureCloudCostBillingExportSpecArgs> billingExportSpec;

    /**
     * @return Returns billing details for the Azure account.
     * 
     */
    public Optional<Output<ConnectorAzureCloudCostBillingExportSpecArgs>> billingExportSpec() {
        return Optional.ofNullable(this.billingExportSpec);
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
     * Indicates which feature to enable among Billing, Optimization, and Visibility.
     * 
     */
    @Import(name="featuresEnableds")
    private @Nullable Output<List<String>> featuresEnableds;

    /**
     * @return Indicates which feature to enable among Billing, Optimization, and Visibility.
     * 
     */
    public Optional<Output<List<String>>> featuresEnableds() {
        return Optional.ofNullable(this.featuresEnableds);
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
     * Subsription id.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return Subsription id.
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
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
     * Tenant id.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Tenant id.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private ConnectorAzureCloudCostState() {}

    private ConnectorAzureCloudCostState(ConnectorAzureCloudCostState $) {
        this.billingExportSpec = $.billingExportSpec;
        this.description = $.description;
        this.featuresEnableds = $.featuresEnableds;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.subscriptionId = $.subscriptionId;
        this.tags = $.tags;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorAzureCloudCostState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorAzureCloudCostState $;

        public Builder() {
            $ = new ConnectorAzureCloudCostState();
        }

        public Builder(ConnectorAzureCloudCostState defaults) {
            $ = new ConnectorAzureCloudCostState(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingExportSpec Returns billing details for the Azure account.
         * 
         * @return builder
         * 
         */
        public Builder billingExportSpec(@Nullable Output<ConnectorAzureCloudCostBillingExportSpecArgs> billingExportSpec) {
            $.billingExportSpec = billingExportSpec;
            return this;
        }

        /**
         * @param billingExportSpec Returns billing details for the Azure account.
         * 
         * @return builder
         * 
         */
        public Builder billingExportSpec(ConnectorAzureCloudCostBillingExportSpecArgs billingExportSpec) {
            return billingExportSpec(Output.of(billingExportSpec));
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
         * @param featuresEnableds Indicates which feature to enable among Billing, Optimization, and Visibility.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(@Nullable Output<List<String>> featuresEnableds) {
            $.featuresEnableds = featuresEnableds;
            return this;
        }

        /**
         * @param featuresEnableds Indicates which feature to enable among Billing, Optimization, and Visibility.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(List<String> featuresEnableds) {
            return featuresEnableds(Output.of(featuresEnableds));
        }

        /**
         * @param featuresEnableds Indicates which feature to enable among Billing, Optimization, and Visibility.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(String... featuresEnableds) {
            return featuresEnableds(List.of(featuresEnableds));
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
         * @param subscriptionId Subsription id.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subsription id.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
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
         * @param tenantId Tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ConnectorAzureCloudCostState build() {
            return $;
        }
    }

}
