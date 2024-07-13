// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVariablesSpec {
    /**
     * @return FixedValue of the variable
     * 
     */
    private String fixedValue;
    /**
     * @return Type of Value of the Variable. For now only FIXED is supported
     * 
     */
    private String valueType;

    private GetVariablesSpec() {}
    /**
     * @return FixedValue of the variable
     * 
     */
    public String fixedValue() {
        return this.fixedValue;
    }
    /**
     * @return Type of Value of the Variable. For now only FIXED is supported
     * 
     */
    public String valueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariablesSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fixedValue;
        private String valueType;
        public Builder() {}
        public Builder(GetVariablesSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedValue = defaults.fixedValue;
    	      this.valueType = defaults.valueType;
        }

        @CustomType.Setter
        public Builder fixedValue(String fixedValue) {
            if (fixedValue == null) {
              throw new MissingRequiredPropertyException("GetVariablesSpec", "fixedValue");
            }
            this.fixedValue = fixedValue;
            return this;
        }
        @CustomType.Setter
        public Builder valueType(String valueType) {
            if (valueType == null) {
              throw new MissingRequiredPropertyException("GetVariablesSpec", "valueType");
            }
            this.valueType = valueType;
            return this;
        }
        public GetVariablesSpec build() {
            final var _resultValue = new GetVariablesSpec();
            _resultValue.fixedValue = fixedValue;
            _resultValue.valueType = valueType;
            return _resultValue;
        }
    }
}