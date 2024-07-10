// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentClustersMappingCluster extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentClustersMappingCluster Empty = new GetEnvironmentClustersMappingCluster();

    /**
     * agent identifier of the cluster (include scope prefix)
     * 
     */
    @Import(name="agentIdentifier")
    private @Nullable String agentIdentifier;

    /**
     * @return agent identifier of the cluster (include scope prefix)
     * 
     */
    public Optional<String> agentIdentifier() {
        return Optional.ofNullable(this.agentIdentifier);
    }

    /**
     * identifier of the cluster
     * 
     */
    @Import(name="identifier")
    private @Nullable String identifier;

    /**
     * @return identifier of the cluster
     * 
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * name of the cluster
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return name of the cluster
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * scope at which the cluster exists in harness gitops, one of &#34;ACCOUNT&#34;, &#34;ORGANIZATION&#34;, &#34;PROJECT&#34;. Scope of environment to which clusters are being mapped must be lower or equal to in hierarchy than the scope of the cluster
     * 
     */
    @Import(name="scope")
    private @Nullable String scope;

    /**
     * @return scope at which the cluster exists in harness gitops, one of &#34;ACCOUNT&#34;, &#34;ORGANIZATION&#34;, &#34;PROJECT&#34;. Scope of environment to which clusters are being mapped must be lower or equal to in hierarchy than the scope of the cluster
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    private GetEnvironmentClustersMappingCluster() {}

    private GetEnvironmentClustersMappingCluster(GetEnvironmentClustersMappingCluster $) {
        this.agentIdentifier = $.agentIdentifier;
        this.identifier = $.identifier;
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentClustersMappingCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentClustersMappingCluster $;

        public Builder() {
            $ = new GetEnvironmentClustersMappingCluster();
        }

        public Builder(GetEnvironmentClustersMappingCluster defaults) {
            $ = new GetEnvironmentClustersMappingCluster(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentIdentifier agent identifier of the cluster (include scope prefix)
         * 
         * @return builder
         * 
         */
        public Builder agentIdentifier(@Nullable String agentIdentifier) {
            $.agentIdentifier = agentIdentifier;
            return this;
        }

        /**
         * @param identifier identifier of the cluster
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param name name of the cluster
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param scope scope at which the cluster exists in harness gitops, one of &#34;ACCOUNT&#34;, &#34;ORGANIZATION&#34;, &#34;PROJECT&#34;. Scope of environment to which clusters are being mapped must be lower or equal to in hierarchy than the scope of the cluster
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable String scope) {
            $.scope = scope;
            return this;
        }

        public GetEnvironmentClustersMappingCluster build() {
            return $;
        }
    }

}
