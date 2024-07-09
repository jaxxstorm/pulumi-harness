// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.TemplateFiltersFilterPropertiesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateFiltersArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateFiltersArgs Empty = new TemplateFiltersArgs();

    /**
     * Properties of the filters entity defined in Harness.
     * 
     */
    @Import(name="filterProperties", required=true)
    private Output<TemplateFiltersFilterPropertiesArgs> filterProperties;

    /**
     * @return Properties of the filters entity defined in Harness.
     * 
     */
    public Output<TemplateFiltersFilterPropertiesArgs> filterProperties() {
        return this.filterProperties;
    }

    /**
     * Only accept values &#34;EveryOne&#34; and &#34;OnlyCreator&#34;. This indicates visibility of filters. By default, everyone can view this filter.
     * 
     */
    @Import(name="filterVisibility")
    private @Nullable Output<String> filterVisibility;

    /**
     * @return Only accept values &#34;EveryOne&#34; and &#34;OnlyCreator&#34;. This indicates visibility of filters. By default, everyone can view this filter.
     * 
     */
    public Optional<Output<String>> filterVisibility() {
        return Optional.ofNullable(this.filterVisibility);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Name of the template filters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the template filters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Organization Identifier for the Entity.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization Identifier for the Entity.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier for the Entity.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier for the Entity.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Type of template filters. Currently supported types are { Template}
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of template filters. Currently supported types are { Template}
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TemplateFiltersArgs() {}

    private TemplateFiltersArgs(TemplateFiltersArgs $) {
        this.filterProperties = $.filterProperties;
        this.filterVisibility = $.filterVisibility;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateFiltersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateFiltersArgs $;

        public Builder() {
            $ = new TemplateFiltersArgs();
        }

        public Builder(TemplateFiltersArgs defaults) {
            $ = new TemplateFiltersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterProperties Properties of the filters entity defined in Harness.
         * 
         * @return builder
         * 
         */
        public Builder filterProperties(Output<TemplateFiltersFilterPropertiesArgs> filterProperties) {
            $.filterProperties = filterProperties;
            return this;
        }

        /**
         * @param filterProperties Properties of the filters entity defined in Harness.
         * 
         * @return builder
         * 
         */
        public Builder filterProperties(TemplateFiltersFilterPropertiesArgs filterProperties) {
            return filterProperties(Output.of(filterProperties));
        }

        /**
         * @param filterVisibility Only accept values &#34;EveryOne&#34; and &#34;OnlyCreator&#34;. This indicates visibility of filters. By default, everyone can view this filter.
         * 
         * @return builder
         * 
         */
        public Builder filterVisibility(@Nullable Output<String> filterVisibility) {
            $.filterVisibility = filterVisibility;
            return this;
        }

        /**
         * @param filterVisibility Only accept values &#34;EveryOne&#34; and &#34;OnlyCreator&#34;. This indicates visibility of filters. By default, everyone can view this filter.
         * 
         * @return builder
         * 
         */
        public Builder filterVisibility(String filterVisibility) {
            return filterVisibility(Output.of(filterVisibility));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the template filters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the template filters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Organization Identifier for the Entity.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization Identifier for the Entity.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project Identifier for the Entity.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier for the Entity.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param type Type of template filters. Currently supported types are { Template}
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of template filters. Currently supported types are { Template}
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TemplateFiltersArgs build() {
            if ($.filterProperties == null) {
                throw new MissingRequiredPropertyException("TemplateFiltersArgs", "filterProperties");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("TemplateFiltersArgs", "identifier");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("TemplateFiltersArgs", "type");
            }
            return $;
        }
    }

}
