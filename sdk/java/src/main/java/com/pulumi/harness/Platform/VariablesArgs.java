// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.VariablesSpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VariablesArgs extends com.pulumi.resources.ResourceArgs {

    public static final VariablesArgs Empty = new VariablesArgs();

    /**
     * Description of the entity
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the entity
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier of the resource
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Name of the Variable
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Variable
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Organization Identifier for the Entity
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization Identifier for the Entity
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier for the Entity
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier for the Entity
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * List of Spec Fields.
     * 
     */
    @Import(name="spec", required=true)
    private Output<VariablesSpecArgs> spec;

    /**
     * @return List of Spec Fields.
     * 
     */
    public Output<VariablesSpecArgs> spec() {
        return this.spec;
    }

    /**
     * Type of Variable
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of Variable
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private VariablesArgs() {}

    private VariablesArgs(VariablesArgs $) {
        this.description = $.description;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.spec = $.spec;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VariablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VariablesArgs $;

        public Builder() {
            $ = new VariablesArgs();
        }

        public Builder(VariablesArgs defaults) {
            $ = new VariablesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the entity
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the entity
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the Variable
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Variable
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param spec List of Spec Fields.
         * 
         * @return builder
         * 
         */
        public Builder spec(Output<VariablesSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec List of Spec Fields.
         * 
         * @return builder
         * 
         */
        public Builder spec(VariablesSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param type Type of Variable
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of Variable
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public VariablesArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.spec = Objects.requireNonNull($.spec, "expected parameter 'spec' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
