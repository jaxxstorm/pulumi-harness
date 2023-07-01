// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsRepositoryRepoArgs;
import com.pulumi.harness.platform.inputs.GitOpsRepositoryUpdateMaskArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsRepositoryState extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepositoryState Empty = new GitOpsRepositoryState();

    /**
     * Account identifier of the GitOps repository.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account identifier of the GitOps repository.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Agent identifier of the GitOps repository.
     * 
     */
    @Import(name="agentId")
    private @Nullable Output<String> agentId;

    /**
     * @return Agent identifier of the GitOps repository.
     * 
     */
    public Optional<Output<String>> agentId() {
        return Optional.ofNullable(this.agentId);
    }

    /**
     * Indicates if to operate on credential set instead of repository.
     * 
     */
    @Import(name="credsOnly")
    private @Nullable Output<Boolean> credsOnly;

    /**
     * @return Indicates if to operate on credential set instead of repository.
     * 
     */
    public Optional<Output<Boolean>> credsOnly() {
        return Optional.ofNullable(this.credsOnly);
    }

    /**
     * Identifier of the GitOps repository.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Identifier of the GitOps repository.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Organization identifier of the GitOps repository.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization identifier of the GitOps repository.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps repository.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project identifier of the GitOps repository.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Indicates to force refresh query for repository.
     * 
     */
    @Import(name="queryForceRefresh")
    private @Nullable Output<Boolean> queryForceRefresh;

    /**
     * @return Indicates to force refresh query for repository.
     * 
     */
    public Optional<Output<Boolean>> queryForceRefresh() {
        return Optional.ofNullable(this.queryForceRefresh);
    }

    /**
     * Project to query for the GitOps repo.
     * 
     */
    @Import(name="queryProject")
    private @Nullable Output<String> queryProject;

    /**
     * @return Project to query for the GitOps repo.
     * 
     */
    public Optional<Output<String>> queryProject() {
        return Optional.ofNullable(this.queryProject);
    }

    /**
     * GitOps repository to query.
     * 
     */
    @Import(name="queryRepo")
    private @Nullable Output<String> queryRepo;

    /**
     * @return GitOps repository to query.
     * 
     */
    public Optional<Output<String>> queryRepo() {
        return Optional.ofNullable(this.queryRepo);
    }

    /**
     * Repo details holding application configurations.
     * 
     */
    @Import(name="repos")
    private @Nullable Output<List<GitOpsRepositoryRepoArgs>> repos;

    /**
     * @return Repo details holding application configurations.
     * 
     */
    public Optional<Output<List<GitOpsRepositoryRepoArgs>>> repos() {
        return Optional.ofNullable(this.repos);
    }

    /**
     * Update mask of the repository.
     * 
     */
    @Import(name="updateMasks")
    private @Nullable Output<List<GitOpsRepositoryUpdateMaskArgs>> updateMasks;

    /**
     * @return Update mask of the repository.
     * 
     */
    public Optional<Output<List<GitOpsRepositoryUpdateMaskArgs>>> updateMasks() {
        return Optional.ofNullable(this.updateMasks);
    }

    /**
     * Indicates if the GitOps repository should be updated if existing and inserted if not.
     * 
     */
    @Import(name="upsert")
    private @Nullable Output<Boolean> upsert;

    /**
     * @return Indicates if the GitOps repository should be updated if existing and inserted if not.
     * 
     */
    public Optional<Output<Boolean>> upsert() {
        return Optional.ofNullable(this.upsert);
    }

    private GitOpsRepositoryState() {}

    private GitOpsRepositoryState(GitOpsRepositoryState $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.credsOnly = $.credsOnly;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.queryForceRefresh = $.queryForceRefresh;
        this.queryProject = $.queryProject;
        this.queryRepo = $.queryRepo;
        this.repos = $.repos;
        this.updateMasks = $.updateMasks;
        this.upsert = $.upsert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepositoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepositoryState $;

        public Builder() {
            $ = new GitOpsRepositoryState();
        }

        public Builder(GitOpsRepositoryState defaults) {
            $ = new GitOpsRepositoryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param agentId Agent identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder agentId(@Nullable Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param credsOnly Indicates if to operate on credential set instead of repository.
         * 
         * @return builder
         * 
         */
        public Builder credsOnly(@Nullable Output<Boolean> credsOnly) {
            $.credsOnly = credsOnly;
            return this;
        }

        /**
         * @param credsOnly Indicates if to operate on credential set instead of repository.
         * 
         * @return builder
         * 
         */
        public Builder credsOnly(Boolean credsOnly) {
            return credsOnly(Output.of(credsOnly));
        }

        /**
         * @param identifier Identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Organization identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param queryForceRefresh Indicates to force refresh query for repository.
         * 
         * @return builder
         * 
         */
        public Builder queryForceRefresh(@Nullable Output<Boolean> queryForceRefresh) {
            $.queryForceRefresh = queryForceRefresh;
            return this;
        }

        /**
         * @param queryForceRefresh Indicates to force refresh query for repository.
         * 
         * @return builder
         * 
         */
        public Builder queryForceRefresh(Boolean queryForceRefresh) {
            return queryForceRefresh(Output.of(queryForceRefresh));
        }

        /**
         * @param queryProject Project to query for the GitOps repo.
         * 
         * @return builder
         * 
         */
        public Builder queryProject(@Nullable Output<String> queryProject) {
            $.queryProject = queryProject;
            return this;
        }

        /**
         * @param queryProject Project to query for the GitOps repo.
         * 
         * @return builder
         * 
         */
        public Builder queryProject(String queryProject) {
            return queryProject(Output.of(queryProject));
        }

        /**
         * @param queryRepo GitOps repository to query.
         * 
         * @return builder
         * 
         */
        public Builder queryRepo(@Nullable Output<String> queryRepo) {
            $.queryRepo = queryRepo;
            return this;
        }

        /**
         * @param queryRepo GitOps repository to query.
         * 
         * @return builder
         * 
         */
        public Builder queryRepo(String queryRepo) {
            return queryRepo(Output.of(queryRepo));
        }

        /**
         * @param repos Repo details holding application configurations.
         * 
         * @return builder
         * 
         */
        public Builder repos(@Nullable Output<List<GitOpsRepositoryRepoArgs>> repos) {
            $.repos = repos;
            return this;
        }

        /**
         * @param repos Repo details holding application configurations.
         * 
         * @return builder
         * 
         */
        public Builder repos(List<GitOpsRepositoryRepoArgs> repos) {
            return repos(Output.of(repos));
        }

        /**
         * @param repos Repo details holding application configurations.
         * 
         * @return builder
         * 
         */
        public Builder repos(GitOpsRepositoryRepoArgs... repos) {
            return repos(List.of(repos));
        }

        /**
         * @param updateMasks Update mask of the repository.
         * 
         * @return builder
         * 
         */
        public Builder updateMasks(@Nullable Output<List<GitOpsRepositoryUpdateMaskArgs>> updateMasks) {
            $.updateMasks = updateMasks;
            return this;
        }

        /**
         * @param updateMasks Update mask of the repository.
         * 
         * @return builder
         * 
         */
        public Builder updateMasks(List<GitOpsRepositoryUpdateMaskArgs> updateMasks) {
            return updateMasks(Output.of(updateMasks));
        }

        /**
         * @param updateMasks Update mask of the repository.
         * 
         * @return builder
         * 
         */
        public Builder updateMasks(GitOpsRepositoryUpdateMaskArgs... updateMasks) {
            return updateMasks(List.of(updateMasks));
        }

        /**
         * @param upsert Indicates if the GitOps repository should be updated if existing and inserted if not.
         * 
         * @return builder
         * 
         */
        public Builder upsert(@Nullable Output<Boolean> upsert) {
            $.upsert = upsert;
            return this;
        }

        /**
         * @param upsert Indicates if the GitOps repository should be updated if existing and inserted if not.
         * 
         * @return builder
         * 
         */
        public Builder upsert(Boolean upsert) {
            return upsert(Output.of(upsert));
        }

        public GitOpsRepositoryState build() {
            return $;
        }
    }

}
