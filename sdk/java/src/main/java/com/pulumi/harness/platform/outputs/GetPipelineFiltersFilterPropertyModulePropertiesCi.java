// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetPipelineFiltersFilterPropertyModulePropertiesCiCiExecutionInfo;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPipelineFiltersFilterPropertyModulePropertiesCi {
    /**
     * @return Branch which was used while building.
     * 
     */
    private String branch;
    /**
     * @return Build type of the pipeline. Possible values: branch.
     * 
     */
    private String buildType;
    /**
     * @return CI execution info for the pipeline.
     * 
     */
    private GetPipelineFiltersFilterPropertyModulePropertiesCiCiExecutionInfo ciExecutionInfo;
    /**
     * @return name of the repository used in the pipeline.
     * 
     */
    private String repoNames;
    /**
     * @return Tags to associate with the CI pipeline resource.
     * 
     */
    private String tag;

    private GetPipelineFiltersFilterPropertyModulePropertiesCi() {}
    /**
     * @return Branch which was used while building.
     * 
     */
    public String branch() {
        return this.branch;
    }
    /**
     * @return Build type of the pipeline. Possible values: branch.
     * 
     */
    public String buildType() {
        return this.buildType;
    }
    /**
     * @return CI execution info for the pipeline.
     * 
     */
    public GetPipelineFiltersFilterPropertyModulePropertiesCiCiExecutionInfo ciExecutionInfo() {
        return this.ciExecutionInfo;
    }
    /**
     * @return name of the repository used in the pipeline.
     * 
     */
    public String repoNames() {
        return this.repoNames;
    }
    /**
     * @return Tags to associate with the CI pipeline resource.
     * 
     */
    public String tag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineFiltersFilterPropertyModulePropertiesCi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String branch;
        private String buildType;
        private GetPipelineFiltersFilterPropertyModulePropertiesCiCiExecutionInfo ciExecutionInfo;
        private String repoNames;
        private String tag;
        public Builder() {}
        public Builder(GetPipelineFiltersFilterPropertyModulePropertiesCi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.buildType = defaults.buildType;
    	      this.ciExecutionInfo = defaults.ciExecutionInfo;
    	      this.repoNames = defaults.repoNames;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder branch(String branch) {
            if (branch == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterPropertyModulePropertiesCi", "branch");
            }
            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder buildType(String buildType) {
            if (buildType == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterPropertyModulePropertiesCi", "buildType");
            }
            this.buildType = buildType;
            return this;
        }
        @CustomType.Setter
        public Builder ciExecutionInfo(GetPipelineFiltersFilterPropertyModulePropertiesCiCiExecutionInfo ciExecutionInfo) {
            if (ciExecutionInfo == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterPropertyModulePropertiesCi", "ciExecutionInfo");
            }
            this.ciExecutionInfo = ciExecutionInfo;
            return this;
        }
        @CustomType.Setter
        public Builder repoNames(String repoNames) {
            if (repoNames == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterPropertyModulePropertiesCi", "repoNames");
            }
            this.repoNames = repoNames;
            return this;
        }
        @CustomType.Setter
        public Builder tag(String tag) {
            if (tag == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterPropertyModulePropertiesCi", "tag");
            }
            this.tag = tag;
            return this;
        }
        public GetPipelineFiltersFilterPropertyModulePropertiesCi build() {
            final var _resultValue = new GetPipelineFiltersFilterPropertyModulePropertiesCi();
            _resultValue.branch = branch;
            _resultValue.buildType = buildType;
            _resultValue.ciExecutionInfo = ciExecutionInfo;
            _resultValue.repoNames = repoNames;
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}