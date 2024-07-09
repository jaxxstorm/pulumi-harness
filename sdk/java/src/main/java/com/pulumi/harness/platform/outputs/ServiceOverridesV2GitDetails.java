// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceOverridesV2GitDetails {
    /**
     * @return Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    private @Nullable String baseBranch;
    /**
     * @return Name of the branch.
     * 
     */
    private @Nullable String branch;
    /**
     * @return Commit message used for the merge commit.
     * 
     */
    private @Nullable String commitMessage;
    /**
     * @return Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private @Nullable String connectorRef;
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    private @Nullable String filePath;
    /**
     * @return If the repo is in harness code
     * 
     */
    private @Nullable Boolean isHarnessCodeRepo;
    /**
     * @return If the branch being created is new
     * 
     */
    private @Nullable Boolean isNewBranch;
    /**
     * @return Last commit identifier (for Git Repositories other than Github). To be provided only when updating override.
     * 
     */
    private @Nullable String lastCommitId;
    /**
     * @return Last object identifier (for Github). To be provided only when updating override.
     * 
     */
    private @Nullable String lastObjectId;
    /**
     * @return Load service yaml from catch
     * 
     */
    private @Nullable Boolean loadFromCache;
    /**
     * @return Load service yaml from fallback branch
     * 
     */
    private @Nullable Boolean loadFromFallbackBranch;
    /**
     * @return Name of the repository.
     * 
     */
    private @Nullable String repoName;
    /**
     * @return Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    private @Nullable String storeType;

    private ServiceOverridesV2GitDetails() {}
    /**
     * @return Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    public Optional<String> baseBranch() {
        return Optional.ofNullable(this.baseBranch);
    }
    /**
     * @return Name of the branch.
     * 
     */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * @return Commit message used for the merge commit.
     * 
     */
    public Optional<String> commitMessage() {
        return Optional.ofNullable(this.commitMessage);
    }
    /**
     * @return Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<String> connectorRef() {
        return Optional.ofNullable(this.connectorRef);
    }
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }
    /**
     * @return If the repo is in harness code
     * 
     */
    public Optional<Boolean> isHarnessCodeRepo() {
        return Optional.ofNullable(this.isHarnessCodeRepo);
    }
    /**
     * @return If the branch being created is new
     * 
     */
    public Optional<Boolean> isNewBranch() {
        return Optional.ofNullable(this.isNewBranch);
    }
    /**
     * @return Last commit identifier (for Git Repositories other than Github). To be provided only when updating override.
     * 
     */
    public Optional<String> lastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }
    /**
     * @return Last object identifier (for Github). To be provided only when updating override.
     * 
     */
    public Optional<String> lastObjectId() {
        return Optional.ofNullable(this.lastObjectId);
    }
    /**
     * @return Load service yaml from catch
     * 
     */
    public Optional<Boolean> loadFromCache() {
        return Optional.ofNullable(this.loadFromCache);
    }
    /**
     * @return Load service yaml from fallback branch
     * 
     */
    public Optional<Boolean> loadFromFallbackBranch() {
        return Optional.ofNullable(this.loadFromFallbackBranch);
    }
    /**
     * @return Name of the repository.
     * 
     */
    public Optional<String> repoName() {
        return Optional.ofNullable(this.repoName);
    }
    /**
     * @return Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    public Optional<String> storeType() {
        return Optional.ofNullable(this.storeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceOverridesV2GitDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String baseBranch;
        private @Nullable String branch;
        private @Nullable String commitMessage;
        private @Nullable String connectorRef;
        private @Nullable String filePath;
        private @Nullable Boolean isHarnessCodeRepo;
        private @Nullable Boolean isNewBranch;
        private @Nullable String lastCommitId;
        private @Nullable String lastObjectId;
        private @Nullable Boolean loadFromCache;
        private @Nullable Boolean loadFromFallbackBranch;
        private @Nullable String repoName;
        private @Nullable String storeType;
        public Builder() {}
        public Builder(ServiceOverridesV2GitDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseBranch = defaults.baseBranch;
    	      this.branch = defaults.branch;
    	      this.commitMessage = defaults.commitMessage;
    	      this.connectorRef = defaults.connectorRef;
    	      this.filePath = defaults.filePath;
    	      this.isHarnessCodeRepo = defaults.isHarnessCodeRepo;
    	      this.isNewBranch = defaults.isNewBranch;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.lastObjectId = defaults.lastObjectId;
    	      this.loadFromCache = defaults.loadFromCache;
    	      this.loadFromFallbackBranch = defaults.loadFromFallbackBranch;
    	      this.repoName = defaults.repoName;
    	      this.storeType = defaults.storeType;
        }

        @CustomType.Setter
        public Builder baseBranch(@Nullable String baseBranch) {

            this.baseBranch = baseBranch;
            return this;
        }
        @CustomType.Setter
        public Builder branch(@Nullable String branch) {

            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder commitMessage(@Nullable String commitMessage) {

            this.commitMessage = commitMessage;
            return this;
        }
        @CustomType.Setter
        public Builder connectorRef(@Nullable String connectorRef) {

            this.connectorRef = connectorRef;
            return this;
        }
        @CustomType.Setter
        public Builder filePath(@Nullable String filePath) {

            this.filePath = filePath;
            return this;
        }
        @CustomType.Setter
        public Builder isHarnessCodeRepo(@Nullable Boolean isHarnessCodeRepo) {

            this.isHarnessCodeRepo = isHarnessCodeRepo;
            return this;
        }
        @CustomType.Setter
        public Builder isNewBranch(@Nullable Boolean isNewBranch) {

            this.isNewBranch = isNewBranch;
            return this;
        }
        @CustomType.Setter
        public Builder lastCommitId(@Nullable String lastCommitId) {

            this.lastCommitId = lastCommitId;
            return this;
        }
        @CustomType.Setter
        public Builder lastObjectId(@Nullable String lastObjectId) {

            this.lastObjectId = lastObjectId;
            return this;
        }
        @CustomType.Setter
        public Builder loadFromCache(@Nullable Boolean loadFromCache) {

            this.loadFromCache = loadFromCache;
            return this;
        }
        @CustomType.Setter
        public Builder loadFromFallbackBranch(@Nullable Boolean loadFromFallbackBranch) {

            this.loadFromFallbackBranch = loadFromFallbackBranch;
            return this;
        }
        @CustomType.Setter
        public Builder repoName(@Nullable String repoName) {

            this.repoName = repoName;
            return this;
        }
        @CustomType.Setter
        public Builder storeType(@Nullable String storeType) {

            this.storeType = storeType;
            return this;
        }
        public ServiceOverridesV2GitDetails build() {
            final var _resultValue = new ServiceOverridesV2GitDetails();
            _resultValue.baseBranch = baseBranch;
            _resultValue.branch = branch;
            _resultValue.commitMessage = commitMessage;
            _resultValue.connectorRef = connectorRef;
            _resultValue.filePath = filePath;
            _resultValue.isHarnessCodeRepo = isHarnessCodeRepo;
            _resultValue.isNewBranch = isNewBranch;
            _resultValue.lastCommitId = lastCommitId;
            _resultValue.lastObjectId = lastObjectId;
            _resultValue.loadFromCache = loadFromCache;
            _resultValue.loadFromFallbackBranch = loadFromFallbackBranch;
            _resultValue.repoName = repoName;
            _resultValue.storeType = storeType;
            return _resultValue;
        }
    }
}
