// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SloRequestSloTarget {
    /**
     * @return Target percentage for the SLO.
     * 
     */
    private Double sloTargetPercentage;
    /**
     * @return Specification of the SLO Target.
     * 
     */
    private String spec;
    /**
     * @return Type of the SLO target.
     * 
     */
    private String type;

    private SloRequestSloTarget() {}
    /**
     * @return Target percentage for the SLO.
     * 
     */
    public Double sloTargetPercentage() {
        return this.sloTargetPercentage;
    }
    /**
     * @return Specification of the SLO Target.
     * 
     */
    public String spec() {
        return this.spec;
    }
    /**
     * @return Type of the SLO target.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloRequestSloTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double sloTargetPercentage;
        private String spec;
        private String type;
        public Builder() {}
        public Builder(SloRequestSloTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sloTargetPercentage = defaults.sloTargetPercentage;
    	      this.spec = defaults.spec;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder sloTargetPercentage(Double sloTargetPercentage) {
            if (sloTargetPercentage == null) {
              throw new MissingRequiredPropertyException("SloRequestSloTarget", "sloTargetPercentage");
            }
            this.sloTargetPercentage = sloTargetPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder spec(String spec) {
            if (spec == null) {
              throw new MissingRequiredPropertyException("SloRequestSloTarget", "spec");
            }
            this.spec = spec;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("SloRequestSloTarget", "type");
            }
            this.type = type;
            return this;
        }
        public SloRequestSloTarget build() {
            final var _resultValue = new SloRequestSloTarget();
            _resultValue.sloTargetPercentage = sloTargetPercentage;
            _resultValue.spec = spec;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
