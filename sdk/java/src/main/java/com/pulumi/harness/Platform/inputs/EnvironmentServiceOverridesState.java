// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentServiceOverridesState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentServiceOverridesState Empty = new EnvironmentServiceOverridesState();

    /**
     * The env ID to which the overrides associated.
     * 
     */
    @Import(name="envId")
    private @Nullable Output<String> envId;

    /**
     * @return The env ID to which the overrides associated.
     * 
     */
    public Optional<Output<String>> envId() {
        return Optional.ofNullable(this.envId);
    }

    /**
     * identifier of the service overrides.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return identifier of the service overrides.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The service ID to which the overrides applies.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return The service ID to which the overrides applies.
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    @Import(name="yaml")
    private @Nullable Output<String> yaml;

    /**
     * @return Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    public Optional<Output<String>> yaml() {
        return Optional.ofNullable(this.yaml);
    }

    private EnvironmentServiceOverridesState() {}

    private EnvironmentServiceOverridesState(EnvironmentServiceOverridesState $) {
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
    public static Builder builder(EnvironmentServiceOverridesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentServiceOverridesState $;

        public Builder() {
            $ = new EnvironmentServiceOverridesState();
        }

        public Builder(EnvironmentServiceOverridesState defaults) {
            $ = new EnvironmentServiceOverridesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param envId The env ID to which the overrides associated.
         * 
         * @return builder
         * 
         */
        public Builder envId(@Nullable Output<String> envId) {
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
        public Builder identifier(@Nullable Output<String> identifier) {
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
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
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
        public Builder serviceId(@Nullable Output<String> serviceId) {
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
         * @param yaml Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
         * 
         * @return builder
         * 
         */
        public Builder yaml(@Nullable Output<String> yaml) {
            $.yaml = yaml;
            return this;
        }

        /**
         * @param yaml Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
         * 
         * @return builder
         * 
         */
        public Builder yaml(String yaml) {
            return yaml(Output.of(yaml));
        }

        public EnvironmentServiceOverridesState build() {
            return $;
        }
    }

}
