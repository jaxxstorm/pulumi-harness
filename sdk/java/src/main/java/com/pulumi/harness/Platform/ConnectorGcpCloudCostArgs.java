// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ConnectorGcpCloudCostBillingExportSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorGcpCloudCostArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorGcpCloudCostArgs Empty = new ConnectorGcpCloudCostArgs();

    /**
     * Returns billing details.
     * 
     */
    @Import(name="billingExportSpec")
    private @Nullable Output<ConnectorGcpCloudCostBillingExportSpecArgs> billingExportSpec;

    /**
     * @return Returns billing details.
     * 
     */
    public Optional<Output<ConnectorGcpCloudCostBillingExportSpecArgs>> billingExportSpec() {
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
     * Indicates which features to enable among Billing, Optimization, and Visibility.
     * 
     */
    @Import(name="featuresEnableds", required=true)
    private Output<List<String>> featuresEnableds;

    /**
     * @return Indicates which features to enable among Billing, Optimization, and Visibility.
     * 
     */
    public Output<List<String>> featuresEnableds() {
        return this.featuresEnableds;
    }

    /**
     * GCP Project Id.
     * 
     */
    @Import(name="gcpProjectId", required=true)
    private Output<String> gcpProjectId;

    /**
     * @return GCP Project Id.
     * 
     */
    public Output<String> gcpProjectId() {
        return this.gcpProjectId;
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
     * Email corresponding to the Service Account.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
    private Output<String> serviceAccountEmail;

    /**
     * @return Email corresponding to the Service Account.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
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

    private ConnectorGcpCloudCostArgs() {}

    private ConnectorGcpCloudCostArgs(ConnectorGcpCloudCostArgs $) {
        this.billingExportSpec = $.billingExportSpec;
        this.description = $.description;
        this.featuresEnableds = $.featuresEnableds;
        this.gcpProjectId = $.gcpProjectId;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorGcpCloudCostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorGcpCloudCostArgs $;

        public Builder() {
            $ = new ConnectorGcpCloudCostArgs();
        }

        public Builder(ConnectorGcpCloudCostArgs defaults) {
            $ = new ConnectorGcpCloudCostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingExportSpec Returns billing details.
         * 
         * @return builder
         * 
         */
        public Builder billingExportSpec(@Nullable Output<ConnectorGcpCloudCostBillingExportSpecArgs> billingExportSpec) {
            $.billingExportSpec = billingExportSpec;
            return this;
        }

        /**
         * @param billingExportSpec Returns billing details.
         * 
         * @return builder
         * 
         */
        public Builder billingExportSpec(ConnectorGcpCloudCostBillingExportSpecArgs billingExportSpec) {
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
         * @param featuresEnableds Indicates which features to enable among Billing, Optimization, and Visibility.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(Output<List<String>> featuresEnableds) {
            $.featuresEnableds = featuresEnableds;
            return this;
        }

        /**
         * @param featuresEnableds Indicates which features to enable among Billing, Optimization, and Visibility.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(List<String> featuresEnableds) {
            return featuresEnableds(Output.of(featuresEnableds));
        }

        /**
         * @param featuresEnableds Indicates which features to enable among Billing, Optimization, and Visibility.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(String... featuresEnableds) {
            return featuresEnableds(List.of(featuresEnableds));
        }

        /**
         * @param gcpProjectId GCP Project Id.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(Output<String> gcpProjectId) {
            $.gcpProjectId = gcpProjectId;
            return this;
        }

        /**
         * @param gcpProjectId GCP Project Id.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(String gcpProjectId) {
            return gcpProjectId(Output.of(gcpProjectId));
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
         * @param serviceAccountEmail Email corresponding to the Service Account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail Email corresponding to the Service Account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
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

        public ConnectorGcpCloudCostArgs build() {
            $.featuresEnableds = Objects.requireNonNull($.featuresEnableds, "expected parameter 'featuresEnableds' to be non-null");
            $.gcpProjectId = Objects.requireNonNull($.gcpProjectId, "expected parameter 'gcpProjectId' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.serviceAccountEmail = Objects.requireNonNull($.serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
            return $;
        }
    }

}
