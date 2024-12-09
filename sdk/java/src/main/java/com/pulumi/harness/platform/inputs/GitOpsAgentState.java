// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsAgentMetadataArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsAgentState extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsAgentState Empty = new GitOpsAgentState();

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
     * Agent token to be used for authentication of the agent with Harness.
     * 
     */
    @Import(name="agentToken")
    private @Nullable Output<String> agentToken;

    /**
     * @return Agent token to be used for authentication of the agent with Harness.
     * 
     */
    public Optional<Output<String>> agentToken() {
        return Optional.ofNullable(this.agentToken);
    }

    /**
     * Description of the GitOps agent.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the GitOps agent.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Identifier of the GitOps agent.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Identifier of the GitOps agent.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Metadata of the agent.
     * 
     */
    @Import(name="metadatas")
    private @Nullable Output<List<GitOpsAgentMetadataArgs>> metadatas;

    /**
     * @return Metadata of the agent.
     * 
     */
    public Optional<Output<List<GitOpsAgentMetadataArgs>>> metadatas() {
        return Optional.ofNullable(this.metadatas);
    }

    /**
     * Name of the GitOps agent.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the GitOps agent.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Operator to use for the Harness GitOps agent. Enum: &#34;ARGO&#34; &#34;FLAMINGO&#34;
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return The Operator to use for the Harness GitOps agent. Enum: &#34;ARGO&#34; &#34;FLAMINGO&#34;
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
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
     * Prefixed identifier of the GitOps agent. Agent identifier prefixed with scope of the agent
     * 
     */
    @Import(name="prefixedIdentifier")
    private @Nullable Output<String> prefixedIdentifier;

    /**
     * @return Prefixed identifier of the GitOps agent. Agent identifier prefixed with scope of the agent
     * 
     */
    public Optional<Output<String>> prefixedIdentifier() {
        return Optional.ofNullable(this.prefixedIdentifier);
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
     * Tags for the GitOps agents. These can be used to search or filter the GitOps agents.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags for the GitOps agents. These can be used to search or filter the GitOps agents.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Default: &#34;AGENT*TYPE*UNSET&#34;
     * Enum: &#34;AGENT*TYPE*UNSET&#34; &#34;CONNECTED*ARGO*PROVIDER&#34; &#34;MANAGED*ARGO*PROVIDER&#34;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Default: &#34;AGENT*TYPE*UNSET&#34;
     * Enum: &#34;AGENT*TYPE*UNSET&#34; &#34;CONNECTED*ARGO*PROVIDER&#34; &#34;MANAGED*ARGO*PROVIDER&#34;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GitOpsAgentState() {}

    private GitOpsAgentState(GitOpsAgentState $) {
        this.accountId = $.accountId;
        this.agentToken = $.agentToken;
        this.description = $.description;
        this.identifier = $.identifier;
        this.metadatas = $.metadatas;
        this.name = $.name;
        this.operator = $.operator;
        this.orgId = $.orgId;
        this.prefixedIdentifier = $.prefixedIdentifier;
        this.projectId = $.projectId;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsAgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsAgentState $;

        public Builder() {
            $ = new GitOpsAgentState();
        }

        public Builder(GitOpsAgentState defaults) {
            $ = new GitOpsAgentState(Objects.requireNonNull(defaults));
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
         * @param agentToken Agent token to be used for authentication of the agent with Harness.
         * 
         * @return builder
         * 
         */
        public Builder agentToken(@Nullable Output<String> agentToken) {
            $.agentToken = agentToken;
            return this;
        }

        /**
         * @param agentToken Agent token to be used for authentication of the agent with Harness.
         * 
         * @return builder
         * 
         */
        public Builder agentToken(String agentToken) {
            return agentToken(Output.of(agentToken));
        }

        /**
         * @param description Description of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Identifier of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
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
         * @param metadatas Metadata of the agent.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(@Nullable Output<List<GitOpsAgentMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        /**
         * @param metadatas Metadata of the agent.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(List<GitOpsAgentMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        /**
         * @param metadatas Metadata of the agent.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(GitOpsAgentMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        /**
         * @param name Name of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the GitOps agent.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operator The Operator to use for the Harness GitOps agent. Enum: &#34;ARGO&#34; &#34;FLAMINGO&#34;
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The Operator to use for the Harness GitOps agent. Enum: &#34;ARGO&#34; &#34;FLAMINGO&#34;
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
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
         * @param prefixedIdentifier Prefixed identifier of the GitOps agent. Agent identifier prefixed with scope of the agent
         * 
         * @return builder
         * 
         */
        public Builder prefixedIdentifier(@Nullable Output<String> prefixedIdentifier) {
            $.prefixedIdentifier = prefixedIdentifier;
            return this;
        }

        /**
         * @param prefixedIdentifier Prefixed identifier of the GitOps agent. Agent identifier prefixed with scope of the agent
         * 
         * @return builder
         * 
         */
        public Builder prefixedIdentifier(String prefixedIdentifier) {
            return prefixedIdentifier(Output.of(prefixedIdentifier));
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
         * @param tags Tags for the GitOps agents. These can be used to search or filter the GitOps agents.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for the GitOps agents. These can be used to search or filter the GitOps agents.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type Default: &#34;AGENT*TYPE*UNSET&#34;
         * Enum: &#34;AGENT*TYPE*UNSET&#34; &#34;CONNECTED*ARGO*PROVIDER&#34; &#34;MANAGED*ARGO*PROVIDER&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Default: &#34;AGENT*TYPE*UNSET&#34;
         * Enum: &#34;AGENT*TYPE*UNSET&#34; &#34;CONNECTED*ARGO*PROVIDER&#34; &#34;MANAGED*ARGO*PROVIDER&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GitOpsAgentState build() {
            return $;
        }
    }

}
