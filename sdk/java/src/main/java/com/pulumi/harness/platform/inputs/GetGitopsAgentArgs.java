// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsAgentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsAgentArgs Empty = new GetGitopsAgentArgs();

    /**
     * Account identifier of the GitOps agent.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account identifier of the GitOps agent.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Identifier of the GitOps agent.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the GitOps agent.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Organization identifier of the GitOps agent.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization identifier of the GitOps agent.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps agent.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project identifier of the GitOps agent.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetGitopsAgentArgs() {}

    private GetGitopsAgentArgs(GetGitopsAgentArgs $) {
        this.accountId = $.accountId;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsAgentArgs $;

        public Builder() {
            $ = new GetGitopsAgentArgs();
        }

        public Builder(GetGitopsAgentArgs defaults) {
            $ = new GetGitopsAgentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param identifier Identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Organization identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetGitopsAgentArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetGitopsAgentArgs", "accountId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetGitopsAgentArgs", "identifier");
            }
            return $;
        }
    }

}