// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetAwsCCConnectorCrossAccountAccess;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAwsCCConnectorResult {
    /**
     * @return The AWS account id.
     * 
     */
    private String accountId;
    /**
     * @return Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
     * 
     */
    private List<GetAwsCCConnectorCrossAccountAccess> crossAccountAccesses;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
     * 
     */
    private List<String> featuresEnableds;
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
     * @return The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
     * 
     */
    private String reportName;
    /**
     * @return The name of s3 bucket.
     * 
     */
    private String s3Bucket;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;

    private GetAwsCCConnectorResult() {}
    /**
     * @return The AWS account id.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
     * 
     */
    public List<GetAwsCCConnectorCrossAccountAccess> crossAccountAccesses() {
        return this.crossAccountAccesses;
    }
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
     * 
     */
    public List<String> featuresEnableds() {
        return this.featuresEnableds;
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
     * @return The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
     * 
     */
    public String reportName() {
        return this.reportName;
    }
    /**
     * @return The name of s3 bucket.
     * 
     */
    public String s3Bucket() {
        return this.s3Bucket;
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

    public static Builder builder(GetAwsCCConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private List<GetAwsCCConnectorCrossAccountAccess> crossAccountAccesses;
        private String description;
        private List<String> featuresEnableds;
        private String id;
        private String identifier;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private String reportName;
        private String s3Bucket;
        private List<String> tags;
        public Builder() {}
        public Builder(GetAwsCCConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.crossAccountAccesses = defaults.crossAccountAccesses;
    	      this.description = defaults.description;
    	      this.featuresEnableds = defaults.featuresEnableds;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.reportName = defaults.reportName;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder crossAccountAccesses(List<GetAwsCCConnectorCrossAccountAccess> crossAccountAccesses) {
            this.crossAccountAccesses = Objects.requireNonNull(crossAccountAccesses);
            return this;
        }
        public Builder crossAccountAccesses(GetAwsCCConnectorCrossAccountAccess... crossAccountAccesses) {
            return crossAccountAccesses(List.of(crossAccountAccesses));
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
        public Builder reportName(String reportName) {
            this.reportName = Objects.requireNonNull(reportName);
            return this;
        }
        @CustomType.Setter
        public Builder s3Bucket(String s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
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
        public GetAwsCCConnectorResult build() {
            final var o = new GetAwsCCConnectorResult();
            o.accountId = accountId;
            o.crossAccountAccesses = crossAccountAccesses;
            o.description = description;
            o.featuresEnableds = featuresEnableds;
            o.id = id;
            o.identifier = identifier;
            o.name = name;
            o.orgId = orgId;
            o.projectId = projectId;
            o.reportName = reportName;
            o.s3Bucket = s3Bucket;
            o.tags = tags;
            return o;
        }
    }
}
