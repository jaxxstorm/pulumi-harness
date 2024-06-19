// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.inputs.EnvironmentVariableOverrideArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * The id of the application.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The id of the application.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The description of the environment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the environment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of the environment. Valid values are `PROD` and `NON_PROD`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the environment. Valid values are `PROD` and `NON_PROD`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Override for a service variable
     * 
     */
    @Import(name="variableOverrides")
    private @Nullable Output<List<EnvironmentVariableOverrideArgs>> variableOverrides;

    /**
     * @return Override for a service variable
     * 
     */
    public Optional<Output<List<EnvironmentVariableOverrideArgs>>> variableOverrides() {
        return Optional.ofNullable(this.variableOverrides);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.appId = $.appId;
        this.description = $.description;
        this.name = $.name;
        this.type = $.type;
        this.variableOverrides = $.variableOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The id of the application.
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The id of the application.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param description The description of the environment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the environment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the environment. Valid values are `PROD` and `NON_PROD`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the environment. Valid values are `PROD` and `NON_PROD`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param variableOverrides Override for a service variable
         * 
         * @return builder
         * 
         */
        public Builder variableOverrides(@Nullable Output<List<EnvironmentVariableOverrideArgs>> variableOverrides) {
            $.variableOverrides = variableOverrides;
            return this;
        }

        /**
         * @param variableOverrides Override for a service variable
         * 
         * @return builder
         * 
         */
        public Builder variableOverrides(List<EnvironmentVariableOverrideArgs> variableOverrides) {
            return variableOverrides(Output.of(variableOverrides));
        }

        /**
         * @param variableOverrides Override for a service variable
         * 
         * @return builder
         * 
         */
        public Builder variableOverrides(EnvironmentVariableOverrideArgs... variableOverrides) {
            return variableOverrides(List.of(variableOverrides));
        }

        public EnvironmentArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("EnvironmentArgs", "appId");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("EnvironmentArgs", "type");
            }
            return $;
        }
    }

}
