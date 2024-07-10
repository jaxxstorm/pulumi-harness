// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetGitopsAgentDeployYamlProxy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsAgentDeployYamlPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsAgentDeployYamlPlainArgs Empty = new GetGitopsAgentDeployYamlPlainArgs();

    /**
     * Account identifier of the GitOps agent.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Account identifier of the GitOps agent.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * CA data of the GitOps agent, base64 encoded content of ca chain.
     * 
     */
    @Import(name="caData")
    private @Nullable String caData;

    /**
     * @return CA data of the GitOps agent, base64 encoded content of ca chain.
     * 
     */
    public Optional<String> caData() {
        return Optional.ofNullable(this.caData);
    }

    /**
     * Identifier of the GitOps agent.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Identifier of the GitOps agent.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * The kubernetes namespace where the agent is installed.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The kubernetes namespace where the agent is installed.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Organization identifier of the GitOps agent.
     * 
     */
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Organization identifier of the GitOps agent.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project identifier of the GitOps agent.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Project identifier of the GitOps agent.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Proxy settings for the GitOps agent.
     * 
     */
    @Import(name="proxies")
    private @Nullable List<GetGitopsAgentDeployYamlProxy> proxies;

    /**
     * @return Proxy settings for the GitOps agent.
     * 
     */
    public Optional<List<GetGitopsAgentDeployYamlProxy>> proxies() {
        return Optional.ofNullable(this.proxies);
    }

    private GetGitopsAgentDeployYamlPlainArgs() {}

    private GetGitopsAgentDeployYamlPlainArgs(GetGitopsAgentDeployYamlPlainArgs $) {
        this.accountId = $.accountId;
        this.caData = $.caData;
        this.identifier = $.identifier;
        this.namespace = $.namespace;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.proxies = $.proxies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsAgentDeployYamlPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsAgentDeployYamlPlainArgs $;

        public Builder() {
            $ = new GetGitopsAgentDeployYamlPlainArgs();
        }

        public Builder(GetGitopsAgentDeployYamlPlainArgs defaults) {
            $ = new GetGitopsAgentDeployYamlPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param caData CA data of the GitOps agent, base64 encoded content of ca chain.
         * 
         * @return builder
         * 
         */
        public Builder caData(@Nullable String caData) {
            $.caData = caData;
            return this;
        }

        /**
         * @param identifier Identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param namespace The kubernetes namespace where the agent is installed.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param orgId Organization identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param proxies Proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder proxies(@Nullable List<GetGitopsAgentDeployYamlProxy> proxies) {
            $.proxies = proxies;
            return this;
        }

        /**
         * @param proxies Proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder proxies(GetGitopsAgentDeployYamlProxy... proxies) {
            return proxies(List.of(proxies));
        }

        public GetGitopsAgentDeployYamlPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetGitopsAgentDeployYamlPlainArgs", "accountId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetGitopsAgentDeployYamlPlainArgs", "identifier");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("GetGitopsAgentDeployYamlPlainArgs", "namespace");
            }
            return $;
        }
    }

}
