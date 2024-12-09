// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetGitopsRepoCredCred;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsRepoCredPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepoCredPlainArgs Empty = new GetGitopsRepoCredPlainArgs();

    /**
     * Account identifier of the Repository Credentials.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Import(name="accountId")
    private @Nullable String accountId;

    /**
     * @return Account identifier of the Repository Credentials.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Agent identifier of the Repository Credentials.
     * 
     */
    @Import(name="agentId", required=true)
    private String agentId;

    /**
     * @return Agent identifier of the Repository Credentials.
     * 
     */
    public String agentId() {
        return this.agentId;
    }

    /**
     * credential details.
     * 
     */
    @Import(name="creds")
    private @Nullable List<GetGitopsRepoCredCred> creds;

    /**
     * @return credential details.
     * 
     */
    public Optional<List<GetGitopsRepoCredCred>> creds() {
        return Optional.ofNullable(this.creds);
    }

    /**
     * Identifier of the Repository Credentials.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Identifier of the Repository Credentials.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Organization identifier of the Repository Credentials.
     * 
     */
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Organization identifier of the Repository Credentials.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the Repository Credentials.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Project identifier of the Repository Credentials.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetGitopsRepoCredPlainArgs() {}

    private GetGitopsRepoCredPlainArgs(GetGitopsRepoCredPlainArgs $) {
        this.accountId = $.accountId;
        this.agentId = $.agentId;
        this.creds = $.creds;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsRepoCredPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepoCredPlainArgs $;

        public Builder() {
            $ = new GetGitopsRepoCredPlainArgs();
        }

        public Builder(GetGitopsRepoCredPlainArgs defaults) {
            $ = new GetGitopsRepoCredPlainArgs(Objects.requireNonNull(defaults));
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
        public Builder accountId(@Nullable String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param agentId Agent identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder agentId(String agentId) {
            $.agentId = agentId;
            return this;
        }

        /**
         * @param creds credential details.
         * 
         * @return builder
         * 
         */
        public Builder creds(@Nullable List<GetGitopsRepoCredCred> creds) {
            $.creds = creds;
            return this;
        }

        /**
         * @param creds credential details.
         * 
         * @return builder
         * 
         */
        public Builder creds(GetGitopsRepoCredCred... creds) {
            return creds(List.of(creds));
        }

        /**
         * @param identifier Identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param orgId Organization identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project identifier of the Repository Credentials.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetGitopsRepoCredPlainArgs build() {
            if ($.agentId == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepoCredPlainArgs", "agentId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetGitopsRepoCredPlainArgs", "identifier");
            }
            return $;
        }
    }

}
