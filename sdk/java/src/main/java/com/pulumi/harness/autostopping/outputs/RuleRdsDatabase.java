// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleRdsDatabase {
    /**
     * @return ID of the database
     * 
     */
    private String id;
    /**
     * @return Region to which database belong to
     * 
     */
    private String region;

    private RuleRdsDatabase() {}
    /**
     * @return ID of the database
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Region to which database belong to
     * 
     */
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRdsDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String region;
        public Builder() {}
        public Builder(RuleRdsDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("RuleRdsDatabase", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("RuleRdsDatabase", "region");
            }
            this.region = region;
            return this;
        }
        public RuleRdsDatabase build() {
            final var _resultValue = new RuleRdsDatabase();
            _resultValue.id = id;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
