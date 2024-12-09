// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GitOpsRepoCertRequestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsRepoCertArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepoCertArgs Empty = new GitOpsRepoCertArgs();

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

    /**
     * Repository Certificate create/update request.
     * 
     */
    @Import(name="requests", required=true)
    private Output<List<GitOpsRepoCertRequestArgs>> requests;

    /**
     * @return Repository Certificate create/update request.
     * 
     */
    public Output<List<GitOpsRepoCertRequestArgs>> requests() {
        return this.requests;
    }

    private GitOpsRepoCertArgs() {}

    private GitOpsRepoCertArgs(GitOpsRepoCertArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.requests = $.requests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepoCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepoCertArgs $;

        public Builder() {
            $ = new GitOpsRepoCertArgs();
        }

        public Builder(GitOpsRepoCertArgs defaults) {
            $ = new GitOpsRepoCertArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param requests Repository Certificate create/update request.
         * 
         * @return builder
         * 
         */
        public Builder requests(Output<List<GitOpsRepoCertRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        /**
         * @param requests Repository Certificate create/update request.
         * 
         * @return builder
         * 
         */
        public Builder requests(List<GitOpsRepoCertRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        /**
         * @param requests Repository Certificate create/update request.
         * 
         * @return builder
         * 
         */
        public Builder requests(GitOpsRepoCertRequestArgs... requests) {
            return requests(List.of(requests));
        }

        public GitOpsRepoCertArgs build() {
            if ($.agentId == null) {
                throw new MissingRequiredPropertyException("GitOpsRepoCertArgs", "agentId");
            }
            if ($.requests == null) {
                throw new MissingRequiredPropertyException("GitOpsRepoCertArgs", "requests");
            }
            return $;
        }
    }

}
