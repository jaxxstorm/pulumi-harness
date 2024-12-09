// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetGitopsClusterRequest;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsClusterResult {
    /**
     * @return Account identifier of the GitOps cluster.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    private String accountId;
    /**
     * @return Agent identifier of the GitOps cluster.
     * 
     */
    private String agentId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Identifier of the GitOps cluster.
     * 
     */
    private String identifier;
    /**
     * @return Organization identifier of the cluster.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Project identifier of the GitOps cluster.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Cluster create or update request.
     * 
     */
    private List<GetGitopsClusterRequest> requests;

    private GetGitopsClusterResult() {}
    /**
     * @return Account identifier of the GitOps cluster.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Agent identifier of the GitOps cluster.
     * 
     */
    public String agentId() {
        return this.agentId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the GitOps cluster.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Organization identifier of the cluster.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Project identifier of the GitOps cluster.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Cluster create or update request.
     * 
     */
    public List<GetGitopsClusterRequest> requests() {
        return this.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String agentId;
        private String id;
        private String identifier;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private List<GetGitopsClusterRequest> requests;
        public Builder() {}
        public Builder(GetGitopsClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.agentId = defaults.agentId;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.requests = defaults.requests;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetGitopsClusterResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder agentId(String agentId) {
            if (agentId == null) {
              throw new MissingRequiredPropertyException("GetGitopsClusterResult", "agentId");
            }
            this.agentId = agentId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGitopsClusterResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetGitopsClusterResult", "identifier");
            }
            this.identifier = identifier;
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
        public Builder requests(List<GetGitopsClusterRequest> requests) {
            if (requests == null) {
              throw new MissingRequiredPropertyException("GetGitopsClusterResult", "requests");
            }
            this.requests = requests;
            return this;
        }
        public Builder requests(GetGitopsClusterRequest... requests) {
            return requests(List.of(requests));
        }
        public GetGitopsClusterResult build() {
            final var _resultValue = new GetGitopsClusterResult();
            _resultValue.accountId = accountId;
            _resultValue.agentId = agentId;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.requests = requests;
            return _resultValue;
        }
    }
}
