// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VariablesSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VariablesSpecArgs Empty = new VariablesSpecArgs();

    /**
     * FixedValue of the variable
     * 
     */
    @Import(name="fixedValue", required=true)
    private Output<String> fixedValue;

    /**
     * @return FixedValue of the variable
     * 
     */
    public Output<String> fixedValue() {
        return this.fixedValue;
    }

    /**
     * Type of Value of the Variable. For now only FIXED is supported
     * 
     */
    @Import(name="valueType", required=true)
    private Output<String> valueType;

    /**
     * @return Type of Value of the Variable. For now only FIXED is supported
     * 
     */
    public Output<String> valueType() {
        return this.valueType;
    }

    private VariablesSpecArgs() {}

    private VariablesSpecArgs(VariablesSpecArgs $) {
        this.fixedValue = $.fixedValue;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VariablesSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VariablesSpecArgs $;

        public Builder() {
            $ = new VariablesSpecArgs();
        }

        public Builder(VariablesSpecArgs defaults) {
            $ = new VariablesSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixedValue FixedValue of the variable
         * 
         * @return builder
         * 
         */
        public Builder fixedValue(Output<String> fixedValue) {
            $.fixedValue = fixedValue;
            return this;
        }

        /**
         * @param fixedValue FixedValue of the variable
         * 
         * @return builder
         * 
         */
        public Builder fixedValue(String fixedValue) {
            return fixedValue(Output.of(fixedValue));
        }

        /**
         * @param valueType Type of Value of the Variable. For now only FIXED is supported
         * 
         * @return builder
         * 
         */
        public Builder valueType(Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType Type of Value of the Variable. For now only FIXED is supported
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public VariablesSpecArgs build() {
            $.fixedValue = Objects.requireNonNull($.fixedValue, "expected parameter 'fixedValue' to be non-null");
            $.valueType = Objects.requireNonNull($.valueType, "expected parameter 'valueType' to be non-null");
            return $;
        }
    }

}
