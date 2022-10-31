// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentClustersMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentClustersMappingArgs Empty = new GetEnvironmentClustersMappingArgs();

    /**
     * environment identifier of the cluster.
     * 
     */
    @Import(name="envId", required=true)
    private Output<String> envId;

    /**
     * @return environment identifier of the cluster.
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }

    /**
     * identifier of the cluster.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return identifier of the cluster.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * org_id of the cluster.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return org_id of the cluster.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * project_id of the cluster.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return project_id of the cluster.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetEnvironmentClustersMappingArgs() {}

    private GetEnvironmentClustersMappingArgs(GetEnvironmentClustersMappingArgs $) {
        this.envId = $.envId;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentClustersMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentClustersMappingArgs $;

        public Builder() {
            $ = new GetEnvironmentClustersMappingArgs();
        }

        public Builder(GetEnvironmentClustersMappingArgs defaults) {
            $ = new GetEnvironmentClustersMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param envId environment identifier of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder envId(Output<String> envId) {
            $.envId = envId;
            return this;
        }

        /**
         * @param envId environment identifier of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder envId(String envId) {
            return envId(Output.of(envId));
        }

        /**
         * @param identifier identifier of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier identifier of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId org_id of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId org_id of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId project_id of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId project_id of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetEnvironmentClustersMappingArgs build() {
            $.envId = Objects.requireNonNull($.envId, "expected parameter 'envId' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            return $;
        }
    }

}
