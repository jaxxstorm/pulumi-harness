// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWorkspaceEnvironmentVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetWorkspaceEnvironmentVariableArgs Empty = new GetWorkspaceEnvironmentVariableArgs();

    /**
     * Key is the identifier for the variable`
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Key is the identifier for the variable`
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * value is the value of the variable
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return value is the value of the variable
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     * Value type indicates the value type of the variable, text or secret
     * 
     */
    @Import(name="valueType", required=true)
    private Output<String> valueType;

    /**
     * @return Value type indicates the value type of the variable, text or secret
     * 
     */
    public Output<String> valueType() {
        return this.valueType;
    }

    private GetWorkspaceEnvironmentVariableArgs() {}

    private GetWorkspaceEnvironmentVariableArgs(GetWorkspaceEnvironmentVariableArgs $) {
        this.key = $.key;
        this.value = $.value;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspaceEnvironmentVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspaceEnvironmentVariableArgs $;

        public Builder() {
            $ = new GetWorkspaceEnvironmentVariableArgs();
        }

        public Builder(GetWorkspaceEnvironmentVariableArgs defaults) {
            $ = new GetWorkspaceEnvironmentVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key is the identifier for the variable`
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key is the identifier for the variable`
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value value is the value of the variable
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value value is the value of the variable
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueType Value type indicates the value type of the variable, text or secret
         * 
         * @return builder
         * 
         */
        public Builder valueType(Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType Value type indicates the value type of the variable, text or secret
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public GetWorkspaceEnvironmentVariableArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceEnvironmentVariableArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceEnvironmentVariableArgs", "value");
            }
            if ($.valueType == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceEnvironmentVariableArgs", "valueType");
            }
            return $;
        }
    }

}
