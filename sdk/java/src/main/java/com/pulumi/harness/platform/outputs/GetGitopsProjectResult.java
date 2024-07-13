// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetGitopsProjectProject;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsProjectResult {
    /**
     * @return Account identifier of the GitOps project.
     * 
     */
    private String accountId;
    /**
     * @return Agent identifier of the GitOps project.
     * 
     */
    private String agentId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Org identifier of the GitOps project.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Project identifier of the GitOps repository.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return App projects configuration details.
     * 
     */
    private List<GetGitopsProjectProject> projects;
    /**
     * @return Identifier for the GitOps project.
     * 
     */
    private @Nullable String queryName;
    /**
     * @return Indicates if the GitOps repository should be updated if existing and inserted if not.
     * 
     */
    private @Nullable Boolean upsert;

    private GetGitopsProjectResult() {}
    /**
     * @return Account identifier of the GitOps project.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Agent identifier of the GitOps project.
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
     * @return Org identifier of the GitOps project.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Project identifier of the GitOps repository.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return App projects configuration details.
     * 
     */
    public List<GetGitopsProjectProject> projects() {
        return this.projects;
    }
    /**
     * @return Identifier for the GitOps project.
     * 
     */
    public Optional<String> queryName() {
        return Optional.ofNullable(this.queryName);
    }
    /**
     * @return Indicates if the GitOps repository should be updated if existing and inserted if not.
     * 
     */
    public Optional<Boolean> upsert() {
        return Optional.ofNullable(this.upsert);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsProjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String agentId;
        private String id;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private List<GetGitopsProjectProject> projects;
        private @Nullable String queryName;
        private @Nullable Boolean upsert;
        public Builder() {}
        public Builder(GetGitopsProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.agentId = defaults.agentId;
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.projects = defaults.projects;
    	      this.queryName = defaults.queryName;
    	      this.upsert = defaults.upsert;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetGitopsProjectResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder agentId(String agentId) {
            if (agentId == null) {
              throw new MissingRequiredPropertyException("GetGitopsProjectResult", "agentId");
            }
            this.agentId = agentId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGitopsProjectResult", "id");
            }
            this.id = id;
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
        public Builder projects(List<GetGitopsProjectProject> projects) {
            if (projects == null) {
              throw new MissingRequiredPropertyException("GetGitopsProjectResult", "projects");
            }
            this.projects = projects;
            return this;
        }
        public Builder projects(GetGitopsProjectProject... projects) {
            return projects(List.of(projects));
        }
        @CustomType.Setter
        public Builder queryName(@Nullable String queryName) {

            this.queryName = queryName;
            return this;
        }
        @CustomType.Setter
        public Builder upsert(@Nullable Boolean upsert) {

            this.upsert = upsert;
            return this;
        }
        public GetGitopsProjectResult build() {
            final var _resultValue = new GetGitopsProjectResult();
            _resultValue.accountId = accountId;
            _resultValue.agentId = agentId;
            _resultValue.id = id;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.projects = projects;
            _resultValue.queryName = queryName;
            _resultValue.upsert = upsert;
            return _resultValue;
        }
    }
}