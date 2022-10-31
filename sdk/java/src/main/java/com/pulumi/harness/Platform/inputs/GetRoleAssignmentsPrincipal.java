// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRoleAssignmentsPrincipal extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleAssignmentsPrincipal Empty = new GetRoleAssignmentsPrincipal();

    /**
     * Identifier.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Identifier.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Scope level.
     * 
     */
    @Import(name="scopeLevel", required=true)
    private String scopeLevel;

    /**
     * @return Scope level.
     * 
     */
    public String scopeLevel() {
        return this.scopeLevel;
    }

    /**
     * Type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetRoleAssignmentsPrincipal() {}

    private GetRoleAssignmentsPrincipal(GetRoleAssignmentsPrincipal $) {
        this.identifier = $.identifier;
        this.scopeLevel = $.scopeLevel;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleAssignmentsPrincipal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleAssignmentsPrincipal $;

        public Builder() {
            $ = new GetRoleAssignmentsPrincipal();
        }

        public Builder(GetRoleAssignmentsPrincipal defaults) {
            $ = new GetRoleAssignmentsPrincipal(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Identifier.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param scopeLevel Scope level.
         * 
         * @return builder
         * 
         */
        public Builder scopeLevel(String scopeLevel) {
            $.scopeLevel = scopeLevel;
            return this;
        }

        /**
         * @param type Type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetRoleAssignmentsPrincipal build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.scopeLevel = Objects.requireNonNull($.scopeLevel, "expected parameter 'scopeLevel' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}