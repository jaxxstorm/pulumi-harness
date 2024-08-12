// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetOverridesGitDetails;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOverridesResult {
    private String clusterId;
    private String envId;
    private GetOverridesGitDetails gitDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String identifier;
    private String infraId;
    private @Nullable String orgId;
    private @Nullable String projectId;
    private String serviceId;
    private String type;
    private String yaml;

    private GetOverridesResult() {}
    public String clusterId() {
        return this.clusterId;
    }
    public String envId() {
        return this.envId;
    }
    public GetOverridesGitDetails gitDetails() {
        return this.gitDetails;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String identifier() {
        return this.identifier;
    }
    public String infraId() {
        return this.infraId;
    }
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    public String serviceId() {
        return this.serviceId;
    }
    public String type() {
        return this.type;
    }
    public String yaml() {
        return this.yaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOverridesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterId;
        private String envId;
        private GetOverridesGitDetails gitDetails;
        private String id;
        private String identifier;
        private String infraId;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private String serviceId;
        private String type;
        private String yaml;
        public Builder() {}
        public Builder(GetOverridesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.envId = defaults.envId;
    	      this.gitDetails = defaults.gitDetails;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.infraId = defaults.infraId;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.serviceId = defaults.serviceId;
    	      this.type = defaults.type;
    	      this.yaml = defaults.yaml;
        }

        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder envId(String envId) {
            if (envId == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "envId");
            }
            this.envId = envId;
            return this;
        }
        @CustomType.Setter
        public Builder gitDetails(GetOverridesGitDetails gitDetails) {
            if (gitDetails == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "gitDetails");
            }
            this.gitDetails = gitDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder infraId(String infraId) {
            if (infraId == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "infraId");
            }
            this.infraId = infraId;
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
        public Builder serviceId(String serviceId) {
            if (serviceId == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "serviceId");
            }
            this.serviceId = serviceId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder yaml(String yaml) {
            if (yaml == null) {
              throw new MissingRequiredPropertyException("GetOverridesResult", "yaml");
            }
            this.yaml = yaml;
            return this;
        }
        public GetOverridesResult build() {
            final var _resultValue = new GetOverridesResult();
            _resultValue.clusterId = clusterId;
            _resultValue.envId = envId;
            _resultValue.gitDetails = gitDetails;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.infraId = infraId;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.serviceId = serviceId;
            _resultValue.type = type;
            _resultValue.yaml = yaml;
            return _resultValue;
        }
    }
}
