// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWorkspaceEnvironmentVariable extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkspaceEnvironmentVariable Empty = new GetWorkspaceEnvironmentVariable();

    /**
     * Key is the identifier for the variable`
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return Key is the identifier for the variable`
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * value is the value of the variable
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return value is the value of the variable
     * 
     */
    public String value() {
        return this.value;
    }

    /**
     * Value type indicates the value type of the variable, text or secret
     * 
     */
    @Import(name="valueType", required=true)
    private String valueType;

    /**
     * @return Value type indicates the value type of the variable, text or secret
     * 
     */
    public String valueType() {
        return this.valueType;
    }

    private GetWorkspaceEnvironmentVariable() {}

    private GetWorkspaceEnvironmentVariable(GetWorkspaceEnvironmentVariable $) {
        this.key = $.key;
        this.value = $.value;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspaceEnvironmentVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspaceEnvironmentVariable $;

        public Builder() {
            $ = new GetWorkspaceEnvironmentVariable();
        }

        public Builder(GetWorkspaceEnvironmentVariable defaults) {
            $ = new GetWorkspaceEnvironmentVariable(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key is the identifier for the variable`
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value value is the value of the variable
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        /**
         * @param valueType Value type indicates the value type of the variable, text or secret
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            $.valueType = valueType;
            return this;
        }

        public GetWorkspaceEnvironmentVariable build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceEnvironmentVariable", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceEnvironmentVariable", "value");
            }
            if ($.valueType == null) {
                throw new MissingRequiredPropertyException("GetWorkspaceEnvironmentVariable", "valueType");
            }
            return $;
        }
    }

}
