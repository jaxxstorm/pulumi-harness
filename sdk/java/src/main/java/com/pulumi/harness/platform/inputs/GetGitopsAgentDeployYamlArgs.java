// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetGitopsAgentDeployYamlProxyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsAgentDeployYamlArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsAgentDeployYamlArgs Empty = new GetGitopsAgentDeployYamlArgs();

    /**
     * Account identifier of the GitOps agent.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account identifier of the GitOps agent.
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
     * CA data of the GitOps agent, base64 encoded content of ca chain.
     * 
     */
    @Import(name="caData")
    private @Nullable Output<String> caData;

    /**
     * @return CA data of the GitOps agent, base64 encoded content of ca chain.
     * 
     */
    public Optional<Output<String>> caData() {
        return Optional.ofNullable(this.caData);
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
     * The kubernetes namespace where the agent is installed.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The kubernetes namespace where the agent is installed.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
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

    /**
     * Proxy settings for the GitOps agent.
     * 
     */
    @Import(name="proxies")
    private @Nullable Output<List<GetGitopsAgentDeployYamlProxyArgs>> proxies;

    /**
     * @return Proxy settings for the GitOps agent.
     * 
     */
    public Optional<Output<List<GetGitopsAgentDeployYamlProxyArgs>>> proxies() {
        return Optional.ofNullable(this.proxies);
    }

    private GetGitopsAgentDeployYamlArgs() {}

    private GetGitopsAgentDeployYamlArgs(GetGitopsAgentDeployYamlArgs $) {
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
    public static Builder builder(GetGitopsAgentDeployYamlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsAgentDeployYamlArgs $;

        public Builder() {
            $ = new GetGitopsAgentDeployYamlArgs();
        }

        public Builder(GetGitopsAgentDeployYamlArgs defaults) {
            $ = new GetGitopsAgentDeployYamlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier of the GitOps agent.
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
         * @param accountId Account identifier of the GitOps agent.
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
         * @param caData CA data of the GitOps agent, base64 encoded content of ca chain.
         * 
         * @return builder
         * 
         */
        public Builder caData(@Nullable Output<String> caData) {
            $.caData = caData;
            return this;
        }

        /**
         * @param caData CA data of the GitOps agent, base64 encoded content of ca chain.
         * 
         * @return builder
         * 
         */
        public Builder caData(String caData) {
            return caData(Output.of(caData));
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
         * @param namespace The kubernetes namespace where the agent is installed.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The kubernetes namespace where the agent is installed.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
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

        /**
         * @param proxies Proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder proxies(@Nullable Output<List<GetGitopsAgentDeployYamlProxyArgs>> proxies) {
            $.proxies = proxies;
            return this;
        }

        /**
         * @param proxies Proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder proxies(List<GetGitopsAgentDeployYamlProxyArgs> proxies) {
            return proxies(Output.of(proxies));
        }

        /**
         * @param proxies Proxy settings for the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder proxies(GetGitopsAgentDeployYamlProxyArgs... proxies) {
            return proxies(List.of(proxies));
        }

        public GetGitopsAgentDeployYamlArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetGitopsAgentDeployYamlArgs", "identifier");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("GetGitopsAgentDeployYamlArgs", "namespace");
            }
            return $;
        }
    }

}
