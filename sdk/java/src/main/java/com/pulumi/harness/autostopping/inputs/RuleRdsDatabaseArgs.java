// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RuleRdsDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleRdsDatabaseArgs Empty = new RuleRdsDatabaseArgs();

    /**
     * ID of the database
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of the database
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Region to which database belong to
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Region to which database belong to
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private RuleRdsDatabaseArgs() {}

    private RuleRdsDatabaseArgs(RuleRdsDatabaseArgs $) {
        this.id = $.id;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleRdsDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleRdsDatabaseArgs $;

        public Builder() {
            $ = new RuleRdsDatabaseArgs();
        }

        public Builder(RuleRdsDatabaseArgs defaults) {
            $ = new RuleRdsDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the database
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the database
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param region Region to which database belong to
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region to which database belong to
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public RuleRdsDatabaseArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("RuleRdsDatabaseArgs", "id");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("RuleRdsDatabaseArgs", "region");
            }
            return $;
        }
    }

}
