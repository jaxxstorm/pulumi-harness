// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsClusterPlainArgs Empty = new GetGitopsClusterPlainArgs();

    /**
     * Account identifier of the GitOps cluster.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Account identifier of the GitOps cluster.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Agent identifier of the GitOps cluster.
     * 
     */
    @Import(name="agentId", required=true)
    private String agentId;

    /**
     * @return Agent identifier of the GitOps cluster.
     * 
     */
    public String agentId() {
        return this.agentId;
    }

    /**
     * Identifier of the GitOps cluster.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Identifier of the GitOps cluster.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Organization identifier of the cluster.
     * 
     */
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Organization identifier of the cluster.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps cluster.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Project identifier of the GitOps cluster.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetGitopsClusterPlainArgs() {}

    private GetGitopsClusterPlainArgs(GetGitopsClusterPlainArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsClusterPlainArgs $;

        public Builder() {
            $ = new GetGitopsClusterPlainArgs();
        }

        public Builder(GetGitopsClusterPlainArgs defaults) {
            $ = new GetGitopsClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param identifier Identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param orgId Organization identifier of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetGitopsClusterPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetGitopsClusterPlainArgs", "accountId");
            }
            if ($.agentId == null) {
                throw new MissingRequiredPropertyException("GetGitopsClusterPlainArgs", "agentId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetGitopsClusterPlainArgs", "identifier");
            }
            return $;
        }
    }

}