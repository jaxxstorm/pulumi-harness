// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetAwsConnectorCrossAccountAccess;
import com.pulumi.harness.platform.outputs.GetAwsConnectorInheritFromDelegate;
import com.pulumi.harness.platform.outputs.GetAwsConnectorIrsa;
import com.pulumi.harness.platform.outputs.GetAwsConnectorManual;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAwsConnectorResult {
    /**
     * @return Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     * 
     */
    private List<GetAwsConnectorCrossAccountAccess> crossAccountAccesses;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private @Nullable String identifier;
    /**
     * @return Inherit credentials from the delegate.
     * 
     */
    private List<GetAwsConnectorInheritFromDelegate> inheritFromDelegates;
    /**
     * @return Use IAM role for service accounts.
     * 
     */
    private List<GetAwsConnectorIrsa> irsas;
    /**
     * @return Use IAM role for service accounts.
     * 
     */
    private List<GetAwsConnectorManual> manuals;
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
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    private List<String> tags;

    private GetAwsConnectorResult() {}
    /**
     * @return Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     * 
     */
    public List<GetAwsConnectorCrossAccountAccess> crossAccountAccesses() {
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
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }
    /**
     * @return Inherit credentials from the delegate.
     * 
     */
    public List<GetAwsConnectorInheritFromDelegate> inheritFromDelegates() {
        return this.inheritFromDelegates;
    }
    /**
     * @return Use IAM role for service accounts.
     * 
     */
    public List<GetAwsConnectorIrsa> irsas() {
        return this.irsas;
    }
    /**
     * @return Use IAM role for service accounts.
     * 
     */
    public List<GetAwsConnectorManual> manuals() {
        return this.manuals;
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
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAwsConnectorCrossAccountAccess> crossAccountAccesses;
        private String description;
        private String id;
        private @Nullable String identifier;
        private List<GetAwsConnectorInheritFromDelegate> inheritFromDelegates;
        private List<GetAwsConnectorIrsa> irsas;
        private List<GetAwsConnectorManual> manuals;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private List<String> tags;
        public Builder() {}
        public Builder(GetAwsConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossAccountAccesses = defaults.crossAccountAccesses;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.inheritFromDelegates = defaults.inheritFromDelegates;
    	      this.irsas = defaults.irsas;
    	      this.manuals = defaults.manuals;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder crossAccountAccesses(List<GetAwsConnectorCrossAccountAccess> crossAccountAccesses) {
            this.crossAccountAccesses = Objects.requireNonNull(crossAccountAccesses);
            return this;
        }
        public Builder crossAccountAccesses(GetAwsConnectorCrossAccountAccess... crossAccountAccesses) {
            return crossAccountAccesses(List.of(crossAccountAccesses));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identifier(@Nullable String identifier) {
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder inheritFromDelegates(List<GetAwsConnectorInheritFromDelegate> inheritFromDelegates) {
            this.inheritFromDelegates = Objects.requireNonNull(inheritFromDelegates);
            return this;
        }
        public Builder inheritFromDelegates(GetAwsConnectorInheritFromDelegate... inheritFromDelegates) {
            return inheritFromDelegates(List.of(inheritFromDelegates));
        }
        @CustomType.Setter
        public Builder irsas(List<GetAwsConnectorIrsa> irsas) {
            this.irsas = Objects.requireNonNull(irsas);
            return this;
        }
        public Builder irsas(GetAwsConnectorIrsa... irsas) {
            return irsas(List.of(irsas));
        }
        @CustomType.Setter
        public Builder manuals(List<GetAwsConnectorManual> manuals) {
            this.manuals = Objects.requireNonNull(manuals);
            return this;
        }
        public Builder manuals(GetAwsConnectorManual... manuals) {
            return manuals(List.of(manuals));
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
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetAwsConnectorResult build() {
            final var o = new GetAwsConnectorResult();
            o.crossAccountAccesses = crossAccountAccesses;
            o.description = description;
            o.id = id;
            o.identifier = identifier;
            o.inheritFromDelegates = inheritFromDelegates;
            o.irsas = irsas;
            o.manuals = manuals;
            o.name = name;
            o.orgId = orgId;
            o.projectId = projectId;
            o.tags = tags;
            return o;
        }
    }
}