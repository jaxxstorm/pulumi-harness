// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetPipelineFiltersFilterPropertyModulePropertiesCd;
import com.pulumi.harness.platform.outputs.GetPipelineFiltersFilterPropertyModulePropertiesCi;
import java.util.Objects;

@CustomType
public final class GetPipelineFiltersFilterPropertyModuleProperties {
    /**
     * @return CD related properties to be filtered on.
     * 
     */
    private GetPipelineFiltersFilterPropertyModulePropertiesCd cd;
    /**
     * @return CI related properties to be filtered on.
     * 
     */
    private GetPipelineFiltersFilterPropertyModulePropertiesCi ci;

    private GetPipelineFiltersFilterPropertyModuleProperties() {}
    /**
     * @return CD related properties to be filtered on.
     * 
     */
    public GetPipelineFiltersFilterPropertyModulePropertiesCd cd() {
        return this.cd;
    }
    /**
     * @return CI related properties to be filtered on.
     * 
     */
    public GetPipelineFiltersFilterPropertyModulePropertiesCi ci() {
        return this.ci;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineFiltersFilterPropertyModuleProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetPipelineFiltersFilterPropertyModulePropertiesCd cd;
        private GetPipelineFiltersFilterPropertyModulePropertiesCi ci;
        public Builder() {}
        public Builder(GetPipelineFiltersFilterPropertyModuleProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cd = defaults.cd;
    	      this.ci = defaults.ci;
        }

        @CustomType.Setter
        public Builder cd(GetPipelineFiltersFilterPropertyModulePropertiesCd cd) {
            if (cd == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterPropertyModuleProperties", "cd");
            }
            this.cd = cd;
            return this;
        }
        @CustomType.Setter
        public Builder ci(GetPipelineFiltersFilterPropertyModulePropertiesCi ci) {
            if (ci == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterPropertyModuleProperties", "ci");
            }
            this.ci = ci;
            return this;
        }
        public GetPipelineFiltersFilterPropertyModuleProperties build() {
            final var _resultValue = new GetPipelineFiltersFilterPropertyModuleProperties();
            _resultValue.cd = cd;
            _resultValue.ci = ci;
            return _resultValue;
        }
    }
}
