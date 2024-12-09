// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsRepoCredCredArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsRepoCredState extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepoCredState Empty = new GitOpsRepoCredState();

    /**
     * Account identifier of the Repository Credentials.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account identifier of the Repository Credentials.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Agent identifier of the Repository Credentials.
     * 
     */
    @Import(name="agentId")
    private @Nullable Output<String> agentId;

    /**
     * @return Agent identifier of the Repository Credentials.
     * 
     */
    public Optional<Output<String>> agentId() {
        return Optional.ofNullable(this.agentId);
    }

    /**
     * credential details.
     * 
     */
    @Import(name="creds")
    private @Nullable Output<List<GitOpsRepoCredCredArgs>> creds;

    /**
     * @return credential details.
     * 
     */
    public Optional<Output<List<GitOpsRepoCredCredArgs>>> creds() {
        return Optional.ofNullable(this.creds);
    }

    /**
     * Identifier of the Repository Credentials.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Identifier of the Repository Credentials.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Organization identifier of the Repository Credentials.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization identifier of the Repository Credentials.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the Repository Credentials.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project identifier of the Repository Credentials.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Indicates if the GitOps repository credential should be updated if existing and inserted if not.
     * 
     */
    @Import(name="upsert")
    private @Nullable Output<Boolean> upsert;

    /**
     * @return Indicates if the GitOps repository credential should be updated if existing and inserted if not.
     * 
     */
    public Optional<Output<Boolean>> upsert() {
        return Optional.ofNullable(this.upsert);
    }

    private GitOpsRepoCredState() {}

    private GitOpsRepoCredState(GitOpsRepoCredState $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.creds = $.creds;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.upsert = $.upsert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepoCredState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepoCredState $;

        public Builder() {
            $ = new GitOpsRepoCredState();
        }

        public Builder(GitOpsRepoCredState defaults) {
            $ = new GitOpsRepoCredState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is deprecated and will be removed in a future release.
         * 
         */
        @Deprecated /* This field is deprecated and will be removed in a future release. */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is deprecated and will be removed in a future release.
         * 
         */
        @Deprecated /* This field is deprecated and will be removed in a future release. */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param agentId Agent identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder agentId(@Nullable Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param creds credential details.
         * 
         * @return builder
         * 
         */
        public Builder creds(@Nullable Output<List<GitOpsRepoCredCredArgs>> creds) {
            $.creds = creds;
            return this;
        }

        /**
         * @param creds credential details.
         * 
         * @return builder
         * 
         */
        public Builder creds(List<GitOpsRepoCredCredArgs> creds) {
            return creds(Output.of(creds));
        }

        /**
         * @param creds credential details.
         * 
         * @return builder
         * 
         */
        public Builder creds(GitOpsRepoCredCredArgs... creds) {
            return creds(List.of(creds));
        }

        /**
         * @param identifier Identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Organization identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param upsert Indicates if the GitOps repository credential should be updated if existing and inserted if not.
         * 
         * @return builder
         * 
         */
        public Builder upsert(@Nullable Output<Boolean> upsert) {
            $.upsert = upsert;
            return this;
        }

        /**
         * @param upsert Indicates if the GitOps repository credential should be updated if existing and inserted if not.
         * 
         * @return builder
         * 
         */
        public Builder upsert(Boolean upsert) {
            return upsert(Output.of(upsert));
        }

        public GitOpsRepoCredState build() {
            return $;
        }
    }

}
