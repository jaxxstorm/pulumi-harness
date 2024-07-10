// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRuleRdsDatabase extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleRdsDatabase Empty = new GetRuleRdsDatabase();

    /**
     * ID of the database
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return ID of the database
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Region to which database belong to
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return Region to which database belong to
     * 
     */
    public String region() {
        return this.region;
    }

    private GetRuleRdsDatabase() {}

    private GetRuleRdsDatabase(GetRuleRdsDatabase $) {
        this.id = $.id;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleRdsDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleRdsDatabase $;

        public Builder() {
            $ = new GetRuleRdsDatabase();
        }

        public Builder(GetRuleRdsDatabase defaults) {
            $ = new GetRuleRdsDatabase(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the database
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param region Region to which database belong to
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetRuleRdsDatabase build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetRuleRdsDatabase", "id");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetRuleRdsDatabase", "region");
            }
            return $;
        }
    }

}
