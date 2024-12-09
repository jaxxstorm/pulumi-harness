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


public final class GetGitopsRepoCertArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepoCertArgs Empty = new GetGitopsRepoCertArgs();

    /**
     * Account identifier of the GitOps repository certificate.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account identifier of the GitOps repository certificate.
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
     * Agent identifier of the GitOps repository certificate.
     * 
     */
    @Import(name="agentId", required=true)
    private Output<String> agentId;

    /**
     * @return Agent identifier of the GitOps repository certificate.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * Organization identifier of the GitOps repository certificate.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization identifier of the GitOps repository certificate.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps repository certificate.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project identifier of the GitOps repository certificate.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetGitopsRepoCertArgs() {}

    private GetGitopsRepoCertArgs(GetGitopsRepoCertArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsRepoCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepoCertArgs $;

        public Builder() {
            $ = new GetGitopsRepoCertArgs();
        }

        public Builder(GetGitopsRepoCertArgs defaults) {
            $ = new GetGitopsRepoCertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps repository certificate.
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
         * @param accountId Account identifier of the GitOps repository certificate.
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
         * @param agentId Agent identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param orgId Organization identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps repository certificate.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetGitopsRepoCertArgs build() {
            if ($.agentId == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepoCertArgs", "agentId");
            }
            return $;
        }
    }

}
