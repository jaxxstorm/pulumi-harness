// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPipelineFiltersFilterProperty {
    /**
     * @return Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
     * 
     */
    private String filterType;
    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    private List<String> tags;

    private GetPipelineFiltersFilterProperty() {}
    /**
     * @return Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
     * 
     */
    public String filterType() {
        return this.filterType;
    }
    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineFiltersFilterProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filterType;
        private List<String> tags;
        public Builder() {}
        public Builder(GetPipelineFiltersFilterProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filterType(String filterType) {
            if (filterType == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "filterType");
            }
            this.filterType = filterType;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetPipelineFiltersFilterProperty", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetPipelineFiltersFilterProperty build() {
            final var _resultValue = new GetPipelineFiltersFilterProperty();
            _resultValue.filterType = filterType;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
