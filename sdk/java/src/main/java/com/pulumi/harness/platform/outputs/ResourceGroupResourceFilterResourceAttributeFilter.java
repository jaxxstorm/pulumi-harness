// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceGroupResourceFilterResourceAttributeFilter {
    /**
     * @return Name of the attribute. Valid values are `category`, `type`, `labels`, `tag` or `tags`.
     * 
     */
    private @Nullable String attributeName;
    /**
     * @return Value of the attributes.Valid values for `category` are [ARTIFACTORY,CLOUD*COST,CLOUD*PROVIDER,CODE*REPO,MONITORING,SECRET*MANAGER,TICKETING], for `type` are [Production,PreProduction], for `labels`, it can be using the syntax &#39;label:value&#39;, for `tag` or `tags` it can be any string.
     * 
     */
    private @Nullable List<String> attributeValues;

    private ResourceGroupResourceFilterResourceAttributeFilter() {}
    /**
     * @return Name of the attribute. Valid values are `category`, `type`, `labels`, `tag` or `tags`.
     * 
     */
    public Optional<String> attributeName() {
        return Optional.ofNullable(this.attributeName);
    }
    /**
     * @return Value of the attributes.Valid values for `category` are [ARTIFACTORY,CLOUD*COST,CLOUD*PROVIDER,CODE*REPO,MONITORING,SECRET*MANAGER,TICKETING], for `type` are [Production,PreProduction], for `labels`, it can be using the syntax &#39;label:value&#39;, for `tag` or `tags` it can be any string.
     * 
     */
    public List<String> attributeValues() {
        return this.attributeValues == null ? List.of() : this.attributeValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGroupResourceFilterResourceAttributeFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String attributeName;
        private @Nullable List<String> attributeValues;
        public Builder() {}
        public Builder(ResourceGroupResourceFilterResourceAttributeFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeValues = defaults.attributeValues;
        }

        @CustomType.Setter
        public Builder attributeName(@Nullable String attributeName) {

            this.attributeName = attributeName;
            return this;
        }
        @CustomType.Setter
        public Builder attributeValues(@Nullable List<String> attributeValues) {

            this.attributeValues = attributeValues;
            return this;
        }
        public Builder attributeValues(String... attributeValues) {
            return attributeValues(List.of(attributeValues));
        }
        public ResourceGroupResourceFilterResourceAttributeFilter build() {
            final var _resultValue = new ResourceGroupResourceFilterResourceAttributeFilter();
            _resultValue.attributeName = attributeName;
            _resultValue.attributeValues = attributeValues;
            return _resultValue;
        }
    }
}
