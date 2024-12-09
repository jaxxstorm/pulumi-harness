// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GitOpsGnupgRequestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsGnupgArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsGnupgArgs Empty = new GitOpsGnupgArgs();

    /**
     * Account Identifier for the GnuPG Key.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account Identifier for the GnuPG Key.
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
     * Agent identifier for the GnuPG Key.
     * 
     */
    @Import(name="agentId", required=true)
    private Output<String> agentId;

    /**
     * @return Agent identifier for the GnuPG Key.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * Organization Identifier for the GnuPG Key.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization Identifier for the GnuPG Key.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier for the GnuPG Key.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier for the GnuPG Key.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * GnuPGPublicKey is a representation of a GnuPG public key
     * 
     */
    @Import(name="requests", required=true)
    private Output<List<GitOpsGnupgRequestArgs>> requests;

    /**
     * @return GnuPGPublicKey is a representation of a GnuPG public key
     * 
     */
    public Output<List<GitOpsGnupgRequestArgs>> requests() {
        return this.requests;
    }

    private GitOpsGnupgArgs() {}

    private GitOpsGnupgArgs(GitOpsGnupgArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.requests = $.requests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsGnupgArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsGnupgArgs $;

        public Builder() {
            $ = new GitOpsGnupgArgs();
        }

        public Builder(GitOpsGnupgArgs defaults) {
            $ = new GitOpsGnupgArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Identifier for the GnuPG Key.
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
         * @param accountId Account Identifier for the GnuPG Key.
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
         * @param agentId Agent identifier for the GnuPG Key.
         * 
         * @return builder
         * 
         */
        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param agentId Agent identifier for the GnuPG Key.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param orgId Organization Identifier for the GnuPG Key.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization Identifier for the GnuPG Key.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project Identifier for the GnuPG Key.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier for the GnuPG Key.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param requests GnuPGPublicKey is a representation of a GnuPG public key
         * 
         * @return builder
         * 
         */
        public Builder requests(Output<List<GitOpsGnupgRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        /**
         * @param requests GnuPGPublicKey is a representation of a GnuPG public key
         * 
         * @return builder
         * 
         */
        public Builder requests(List<GitOpsGnupgRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        /**
         * @param requests GnuPGPublicKey is a representation of a GnuPG public key
         * 
         * @return builder
         * 
         */
        public Builder requests(GitOpsGnupgRequestArgs... requests) {
            return requests(List.of(requests));
        }

        public GitOpsGnupgArgs build() {
            if ($.agentId == null) {
                throw new MissingRequiredPropertyException("GitOpsGnupgArgs", "agentId");
            }
            if ($.requests == null) {
                throw new MissingRequiredPropertyException("GitOpsGnupgArgs", "requests");
            }
            return $;
        }
    }

}
