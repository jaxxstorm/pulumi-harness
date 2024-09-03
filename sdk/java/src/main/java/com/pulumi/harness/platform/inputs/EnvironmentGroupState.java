// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentGroupState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentGroupState Empty = new EnvironmentGroupState();

    /**
     * Color of the environment group.
     * 
     */
    @Import(name="color")
    private @Nullable Output<String> color;

    /**
     * @return Color of the environment group.
     * 
     */
    public Optional<Output<String>> color() {
        return Optional.ofNullable(this.color);
    }

    /**
     * Enable this flag for force deletion of environment group
     * 
     */
    @Import(name="forceDelete")
    private @Nullable Output<String> forceDelete;

    /**
     * @return Enable this flag for force deletion of environment group
     * 
     */
    public Optional<Output<String>> forceDelete() {
        return Optional.ofNullable(this.forceDelete);
    }

    /**
     * identifier of the environment group.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return identifier of the environment group.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * org_id of the environment group.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return org_id of the environment group.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * project_id of the environment group.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return project_id of the environment group.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Env group YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    @Import(name="yaml")
    private @Nullable Output<String> yaml;

    /**
     * @return Env group YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    public Optional<Output<String>> yaml() {
        return Optional.ofNullable(this.yaml);
    }

    private EnvironmentGroupState() {}

    private EnvironmentGroupState(EnvironmentGroupState $) {
        this.color = $.color;
        this.forceDelete = $.forceDelete;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.yaml = $.yaml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentGroupState $;

        public Builder() {
            $ = new EnvironmentGroupState();
        }

        public Builder(EnvironmentGroupState defaults) {
            $ = new EnvironmentGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param color Color of the environment group.
         * 
         * @return builder
         * 
         */
        public Builder color(@Nullable Output<String> color) {
            $.color = color;
            return this;
        }

        /**
         * @param color Color of the environment group.
         * 
         * @return builder
         * 
         */
        public Builder color(String color) {
            return color(Output.of(color));
        }

        /**
         * @param forceDelete Enable this flag for force deletion of environment group
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(@Nullable Output<String> forceDelete) {
            $.forceDelete = forceDelete;
            return this;
        }

        /**
         * @param forceDelete Enable this flag for force deletion of environment group
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(String forceDelete) {
            return forceDelete(Output.of(forceDelete));
        }

        /**
         * @param identifier identifier of the environment group.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier identifier of the environment group.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId org_id of the environment group.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId org_id of the environment group.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId project_id of the environment group.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId project_id of the environment group.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param yaml Env group YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
         * 
         * @return builder
         * 
         */
        public Builder yaml(@Nullable Output<String> yaml) {
            $.yaml = yaml;
            return this;
        }

        /**
         * @param yaml Env group YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
         * 
         * @return builder
         * 
         */
        public Builder yaml(String yaml) {
            return yaml(Output.of(yaml));
        }

        public EnvironmentGroupState build() {
            return $;
        }
    }

}
