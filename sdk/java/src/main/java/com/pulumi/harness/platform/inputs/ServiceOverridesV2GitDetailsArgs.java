// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceOverridesV2GitDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceOverridesV2GitDetailsArgs Empty = new ServiceOverridesV2GitDetailsArgs();

    /**
     * Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    @Import(name="baseBranch")
    private @Nullable Output<String> baseBranch;

    /**
     * @return Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    public Optional<Output<String>> baseBranch() {
        return Optional.ofNullable(this.baseBranch);
    }

    /**
     * Name of the branch.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return Name of the branch.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Commit message used for the merge commit.
     * 
     */
    @Import(name="commitMessage")
    private @Nullable Output<String> commitMessage;

    /**
     * @return Commit message used for the merge commit.
     * 
     */
    public Optional<Output<String>> commitMessage() {
        return Optional.ofNullable(this.commitMessage);
    }

    /**
     * Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="connectorRef")
    private @Nullable Output<String> connectorRef;

    /**
     * @return Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<Output<String>> connectorRef() {
        return Optional.ofNullable(this.connectorRef);
    }

    /**
     * File path of the Entity in the repository.
     * 
     */
    @Import(name="filePath")
    private @Nullable Output<String> filePath;

    /**
     * @return File path of the Entity in the repository.
     * 
     */
    public Optional<Output<String>> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * If the repo is in harness code
     * 
     */
    @Import(name="isHarnessCodeRepo")
    private @Nullable Output<Boolean> isHarnessCodeRepo;

    /**
     * @return If the repo is in harness code
     * 
     */
    public Optional<Output<Boolean>> isHarnessCodeRepo() {
        return Optional.ofNullable(this.isHarnessCodeRepo);
    }

    /**
     * If the branch being created is new
     * 
     */
    @Import(name="isNewBranch")
    private @Nullable Output<Boolean> isNewBranch;

    /**
     * @return If the branch being created is new
     * 
     */
    public Optional<Output<Boolean>> isNewBranch() {
        return Optional.ofNullable(this.isNewBranch);
    }

    /**
     * Last commit identifier (for Git Repositories other than Github). To be provided only when updating override.
     * 
     */
    @Import(name="lastCommitId")
    private @Nullable Output<String> lastCommitId;

    /**
     * @return Last commit identifier (for Git Repositories other than Github). To be provided only when updating override.
     * 
     */
    public Optional<Output<String>> lastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }

    /**
     * Last object identifier (for Github). To be provided only when updating override.
     * 
     */
    @Import(name="lastObjectId")
    private @Nullable Output<String> lastObjectId;

    /**
     * @return Last object identifier (for Github). To be provided only when updating override.
     * 
     */
    public Optional<Output<String>> lastObjectId() {
        return Optional.ofNullable(this.lastObjectId);
    }

    /**
     * Load service yaml from catch
     * 
     */
    @Import(name="loadFromCache")
    private @Nullable Output<Boolean> loadFromCache;

    /**
     * @return Load service yaml from catch
     * 
     */
    public Optional<Output<Boolean>> loadFromCache() {
        return Optional.ofNullable(this.loadFromCache);
    }

    /**
     * Load service yaml from fallback branch
     * 
     */
    @Import(name="loadFromFallbackBranch")
    private @Nullable Output<Boolean> loadFromFallbackBranch;

    /**
     * @return Load service yaml from fallback branch
     * 
     */
    public Optional<Output<Boolean>> loadFromFallbackBranch() {
        return Optional.ofNullable(this.loadFromFallbackBranch);
    }

    /**
     * Name of the repository.
     * 
     */
    @Import(name="repoName")
    private @Nullable Output<String> repoName;

    /**
     * @return Name of the repository.
     * 
     */
    public Optional<Output<String>> repoName() {
        return Optional.ofNullable(this.repoName);
    }

    /**
     * Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    @Import(name="storeType")
    private @Nullable Output<String> storeType;

    /**
     * @return Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    public Optional<Output<String>> storeType() {
        return Optional.ofNullable(this.storeType);
    }

    private ServiceOverridesV2GitDetailsArgs() {}

    private ServiceOverridesV2GitDetailsArgs(ServiceOverridesV2GitDetailsArgs $) {
        this.baseBranch = $.baseBranch;
        this.branch = $.branch;
        this.commitMessage = $.commitMessage;
        this.connectorRef = $.connectorRef;
        this.filePath = $.filePath;
        this.isHarnessCodeRepo = $.isHarnessCodeRepo;
        this.isNewBranch = $.isNewBranch;
        this.lastCommitId = $.lastCommitId;
        this.lastObjectId = $.lastObjectId;
        this.loadFromCache = $.loadFromCache;
        this.loadFromFallbackBranch = $.loadFromFallbackBranch;
        this.repoName = $.repoName;
        this.storeType = $.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceOverridesV2GitDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceOverridesV2GitDetailsArgs $;

        public Builder() {
            $ = new ServiceOverridesV2GitDetailsArgs();
        }

        public Builder(ServiceOverridesV2GitDetailsArgs defaults) {
            $ = new ServiceOverridesV2GitDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseBranch Name of the default branch (this checks out a new branch titled by branch_name).
         * 
         * @return builder
         * 
         */
        public Builder baseBranch(@Nullable Output<String> baseBranch) {
            $.baseBranch = baseBranch;
            return this;
        }

        /**
         * @param baseBranch Name of the default branch (this checks out a new branch titled by branch_name).
         * 
         * @return builder
         * 
         */
        public Builder baseBranch(String baseBranch) {
            return baseBranch(Output.of(baseBranch));
        }

        /**
         * @param branch Name of the branch.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch Name of the branch.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param commitMessage Commit message used for the merge commit.
         * 
         * @return builder
         * 
         */
        public Builder commitMessage(@Nullable Output<String> commitMessage) {
            $.commitMessage = commitMessage;
            return this;
        }

        /**
         * @param commitMessage Commit message used for the merge commit.
         * 
         * @return builder
         * 
         */
        public Builder commitMessage(String commitMessage) {
            return commitMessage(Output.of(commitMessage));
        }

        /**
         * @param connectorRef Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder connectorRef(@Nullable Output<String> connectorRef) {
            $.connectorRef = connectorRef;
            return this;
        }

        /**
         * @param connectorRef Identifier of the Harness Connector used for CRUD operations on the Entity. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder connectorRef(String connectorRef) {
            return connectorRef(Output.of(connectorRef));
        }

        /**
         * @param filePath File path of the Entity in the repository.
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable Output<String> filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param filePath File path of the Entity in the repository.
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            return filePath(Output.of(filePath));
        }

        /**
         * @param isHarnessCodeRepo If the repo is in harness code
         * 
         * @return builder
         * 
         */
        public Builder isHarnessCodeRepo(@Nullable Output<Boolean> isHarnessCodeRepo) {
            $.isHarnessCodeRepo = isHarnessCodeRepo;
            return this;
        }

        /**
         * @param isHarnessCodeRepo If the repo is in harness code
         * 
         * @return builder
         * 
         */
        public Builder isHarnessCodeRepo(Boolean isHarnessCodeRepo) {
            return isHarnessCodeRepo(Output.of(isHarnessCodeRepo));
        }

        /**
         * @param isNewBranch If the branch being created is new
         * 
         * @return builder
         * 
         */
        public Builder isNewBranch(@Nullable Output<Boolean> isNewBranch) {
            $.isNewBranch = isNewBranch;
            return this;
        }

        /**
         * @param isNewBranch If the branch being created is new
         * 
         * @return builder
         * 
         */
        public Builder isNewBranch(Boolean isNewBranch) {
            return isNewBranch(Output.of(isNewBranch));
        }

        /**
         * @param lastCommitId Last commit identifier (for Git Repositories other than Github). To be provided only when updating override.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(@Nullable Output<String> lastCommitId) {
            $.lastCommitId = lastCommitId;
            return this;
        }

        /**
         * @param lastCommitId Last commit identifier (for Git Repositories other than Github). To be provided only when updating override.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(String lastCommitId) {
            return lastCommitId(Output.of(lastCommitId));
        }

        /**
         * @param lastObjectId Last object identifier (for Github). To be provided only when updating override.
         * 
         * @return builder
         * 
         */
        public Builder lastObjectId(@Nullable Output<String> lastObjectId) {
            $.lastObjectId = lastObjectId;
            return this;
        }

        /**
         * @param lastObjectId Last object identifier (for Github). To be provided only when updating override.
         * 
         * @return builder
         * 
         */
        public Builder lastObjectId(String lastObjectId) {
            return lastObjectId(Output.of(lastObjectId));
        }

        /**
         * @param loadFromCache Load service yaml from catch
         * 
         * @return builder
         * 
         */
        public Builder loadFromCache(@Nullable Output<Boolean> loadFromCache) {
            $.loadFromCache = loadFromCache;
            return this;
        }

        /**
         * @param loadFromCache Load service yaml from catch
         * 
         * @return builder
         * 
         */
        public Builder loadFromCache(Boolean loadFromCache) {
            return loadFromCache(Output.of(loadFromCache));
        }

        /**
         * @param loadFromFallbackBranch Load service yaml from fallback branch
         * 
         * @return builder
         * 
         */
        public Builder loadFromFallbackBranch(@Nullable Output<Boolean> loadFromFallbackBranch) {
            $.loadFromFallbackBranch = loadFromFallbackBranch;
            return this;
        }

        /**
         * @param loadFromFallbackBranch Load service yaml from fallback branch
         * 
         * @return builder
         * 
         */
        public Builder loadFromFallbackBranch(Boolean loadFromFallbackBranch) {
            return loadFromFallbackBranch(Output.of(loadFromFallbackBranch));
        }

        /**
         * @param repoName Name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoName(@Nullable Output<String> repoName) {
            $.repoName = repoName;
            return this;
        }

        /**
         * @param repoName Name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            return repoName(Output.of(repoName));
        }

        /**
         * @param storeType Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
         * 
         * @return builder
         * 
         */
        public Builder storeType(@Nullable Output<String> storeType) {
            $.storeType = storeType;
            return this;
        }

        /**
         * @param storeType Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
         * 
         * @return builder
         * 
         */
        public Builder storeType(String storeType) {
            return storeType(Output.of(storeType));
        }

        public ServiceOverridesV2GitDetailsArgs build() {
            return $;
        }
    }

}
