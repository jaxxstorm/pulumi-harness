// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineFiltersFilterPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineFiltersFilterPropertiesArgs Empty = new PipelineFiltersFilterPropertiesArgs();

    /**
     * Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
     * 
     */
    @Import(name="filterType", required=true)
    private Output<String> filterType;

    /**
     * @return Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
     * 
     */
    public Output<String> filterType() {
        return this.filterType;
    }

    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PipelineFiltersFilterPropertiesArgs() {}

    private PipelineFiltersFilterPropertiesArgs(PipelineFiltersFilterPropertiesArgs $) {
        this.filterType = $.filterType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineFiltersFilterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineFiltersFilterPropertiesArgs $;

        public Builder() {
            $ = new PipelineFiltersFilterPropertiesArgs();
        }

        public Builder(PipelineFiltersFilterPropertiesArgs defaults) {
            $ = new PipelineFiltersFilterPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterType Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
         * 
         * @return builder
         * 
         */
        public Builder filterType(Output<String> filterType) {
            $.filterType = filterType;
            return this;
        }

        /**
         * @param filterType Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, PipelineSetup, PipelineExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
         * 
         * @return builder
         * 
         */
        public Builder filterType(String filterType) {
            return filterType(Output.of(filterType));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public PipelineFiltersFilterPropertiesArgs build() {
            if ($.filterType == null) {
                throw new MissingRequiredPropertyException("PipelineFiltersFilterPropertiesArgs", "filterType");
            }
            return $;
        }
    }

}