// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetGitopsRepositoryUpdateMask;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsRepositoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepositoryPlainArgs Empty = new GetGitopsRepositoryPlainArgs();

    /**
     * Account identifier of the GitOps repository.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Account identifier of the GitOps repository.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Agent identifier of the GitOps repository.
     * 
     */
    @Import(name="agentId", required=true)
    private String agentId;

    /**
     * @return Agent identifier of the GitOps repository.
     * 
     */
    public String agentId() {
        return this.agentId;
    }

    /**
     * Indicates if helm-oci support must be enabled for this repo.
     * 
     */
    @Import(name="enableOci")
    private @Nullable Boolean enableOci;

    /**
     * @return Indicates if helm-oci support must be enabled for this repo.
     * 
     */
    public Optional<Boolean> enableOci() {
        return Optional.ofNullable(this.enableOci);
    }

    /**
     * Identifier of the GitOps repository.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Identifier of the GitOps repository.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Organization identifier of the GitOps repository.
     * 
     */
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Organization identifier of the GitOps repository.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps repository.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Project identifier of the GitOps repository.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Update mask of the repository.
     * 
     */
    @Import(name="updateMasks")
    private @Nullable List<GetGitopsRepositoryUpdateMask> updateMasks;

    /**
     * @return Update mask of the repository.
     * 
     */
    public Optional<List<GetGitopsRepositoryUpdateMask>> updateMasks() {
        return Optional.ofNullable(this.updateMasks);
    }

    private GetGitopsRepositoryPlainArgs() {}

    private GetGitopsRepositoryPlainArgs(GetGitopsRepositoryPlainArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.enableOci = $.enableOci;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.updateMasks = $.updateMasks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsRepositoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepositoryPlainArgs $;

        public Builder() {
            $ = new GetGitopsRepositoryPlainArgs();
        }

        public Builder(GetGitopsRepositoryPlainArgs defaults) {
            $ = new GetGitopsRepositoryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param enableOci Indicates if helm-oci support must be enabled for this repo.
         * 
         * @return builder
         * 
         */
        public Builder enableOci(@Nullable Boolean enableOci) {
            $.enableOci = enableOci;
            return this;
        }

        /**
         * @param identifier Identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param orgId Organization identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps repository.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param updateMasks Update mask of the repository.
         * 
         * @return builder
         * 
         */
        public Builder updateMasks(@Nullable List<GetGitopsRepositoryUpdateMask> updateMasks) {
            $.updateMasks = updateMasks;
            return this;
        }

        /**
         * @param updateMasks Update mask of the repository.
         * 
         * @return builder
         * 
         */
        public Builder updateMasks(GetGitopsRepositoryUpdateMask... updateMasks) {
            return updateMasks(List.of(updateMasks));
        }

        public GetGitopsRepositoryPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepositoryPlainArgs", "accountId");
            }
            if ($.agentId == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepositoryPlainArgs", "agentId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepositoryPlainArgs", "identifier");
            }
            return $;
        }
    }

}