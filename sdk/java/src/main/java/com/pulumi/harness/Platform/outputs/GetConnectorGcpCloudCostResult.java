// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetConnectorGcpCloudCostBillingExportSpec;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectorGcpCloudCostResult {
    /**
     * @return Returns billing details.
     * 
     */
    private List<GetConnectorGcpCloudCostBillingExportSpec> billingExportSpecs;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return Indicates which features to enable among Billing, Optimization, and Visibility.
     * 
     */
    private List<String> featuresEnableds;
    /**
     * @return GCP Project Id.
     * 
     */
    private String gcpProjectId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private String identifier;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Email corresponding to the Service Account.
     * 
     */
    private String serviceAccountEmail;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;

    private GetConnectorGcpCloudCostResult() {}
    /**
     * @return Returns billing details.
     * 
     */
    public List<GetConnectorGcpCloudCostBillingExportSpec> billingExportSpecs() {
        return this.billingExportSpecs;
    }
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Indicates which features to enable among Billing, Optimization, and Visibility.
     * 
     */
    public List<String> featuresEnableds() {
        return this.featuresEnableds;
    }
    /**
     * @return GCP Project Id.
     * 
     */
    public String gcpProjectId() {
        return this.gcpProjectId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Email corresponding to the Service Account.
     * 
     */
    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * @return Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorGcpCloudCostResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectorGcpCloudCostBillingExportSpec> billingExportSpecs;
        private String description;
        private List<String> featuresEnableds;
        private String gcpProjectId;
        private String id;
        private String identifier;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private String serviceAccountEmail;
        private List<String> tags;
        public Builder() {}
        public Builder(GetConnectorGcpCloudCostResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingExportSpecs = defaults.billingExportSpecs;
    	      this.description = defaults.description;
    	      this.featuresEnableds = defaults.featuresEnableds;
    	      this.gcpProjectId = defaults.gcpProjectId;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder billingExportSpecs(List<GetConnectorGcpCloudCostBillingExportSpec> billingExportSpecs) {
            this.billingExportSpecs = Objects.requireNonNull(billingExportSpecs);
            return this;
        }
        public Builder billingExportSpecs(GetConnectorGcpCloudCostBillingExportSpec... billingExportSpecs) {
            return billingExportSpecs(List.of(billingExportSpecs));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder featuresEnableds(List<String> featuresEnableds) {
            this.featuresEnableds = Objects.requireNonNull(featuresEnableds);
            return this;
        }
        public Builder featuresEnableds(String... featuresEnableds) {
            return featuresEnableds(List.of(featuresEnableds));
        }
        @CustomType.Setter
        public Builder gcpProjectId(String gcpProjectId) {
            this.gcpProjectId = Objects.requireNonNull(gcpProjectId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetConnectorGcpCloudCostResult build() {
            final var o = new GetConnectorGcpCloudCostResult();
            o.billingExportSpecs = billingExportSpecs;
            o.description = description;
            o.featuresEnableds = featuresEnableds;
            o.gcpProjectId = gcpProjectId;
            o.id = id;
            o.identifier = identifier;
            o.name = name;
            o.orgId = orgId;
            o.projectId = projectId;
            o.serviceAccountEmail = serviceAccountEmail;
            o.tags = tags;
            return o;
        }
    }
}
