// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentServiceOverridesArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentServiceOverridesArgs Empty = new EnvironmentServiceOverridesArgs();

    /**
     * The env ID to which the overrides associated.
     * 
     */
    @Import(name="envId", required=true)
    private Output<String> envId;

    /**
     * @return The env ID to which the overrides associated.
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }

    /**
     * identifier of the service overrides.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return identifier of the service overrides.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Unique identifier of the Organization.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return Unique identifier of the Organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Unique identifier of the Project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique identifier of the Project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The service ID to which the overrides applies.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The service ID to which the overrides applies.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     * Environment Service Overrides YAML
     * 
     */
    @Import(name="yaml", required=true)
    private Output<String> yaml;

    /**
     * @return Environment Service Overrides YAML
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    private EnvironmentServiceOverridesArgs() {}

    private EnvironmentServiceOverridesArgs(EnvironmentServiceOverridesArgs $) {
        this.envId = $.envId;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.serviceId = $.serviceId;
        this.yaml = $.yaml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentServiceOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentServiceOverridesArgs $;

        public Builder() {
            $ = new EnvironmentServiceOverridesArgs();
        }

        public Builder(EnvironmentServiceOverridesArgs defaults) {
            $ = new EnvironmentServiceOverridesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param envId The env ID to which the overrides associated.
         * 
         * @return builder
         * 
         */
        public Builder envId(Output<String> envId) {
            $.envId = envId;
            return this;
        }

        /**
         * @param envId The env ID to which the overrides associated.
         * 
         * @return builder
         * 
         */
        public Builder envId(String envId) {
            return envId(Output.of(envId));
        }

        /**
         * @param identifier identifier of the service overrides.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier identifier of the service overrides.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param serviceId The service ID to which the overrides applies.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The service ID to which the overrides applies.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param yaml Environment Service Overrides YAML
         * 
         * @return builder
         * 
         */
        public Builder yaml(Output<String> yaml) {
            $.yaml = yaml;
            return this;
        }

        /**
         * @param yaml Environment Service Overrides YAML
         * 
         * @return builder
         * 
         */
        public Builder yaml(String yaml) {
            return yaml(Output.of(yaml));
        }

        public EnvironmentServiceOverridesArgs build() {
            $.envId = Objects.requireNonNull($.envId, "expected parameter 'envId' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            $.yaml = Objects.requireNonNull($.yaml, "expected parameter 'yaml' to be non-null");
            return $;
        }
    }

}
