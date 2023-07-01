// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVariablesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVariablesPlainArgs Empty = new GetVariablesPlainArgs();

    /**
     * Unique identifier of the resource
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Unique identifier of the resource
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Organization Identifier for the Entity
     * 
     */
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Organization Identifier for the Entity
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier for the Entity
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Project Identifier for the Entity
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetVariablesPlainArgs() {}

    private GetVariablesPlainArgs(GetVariablesPlainArgs $) {
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVariablesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVariablesPlainArgs $;

        public Builder() {
            $ = new GetVariablesPlainArgs();
        }

        public Builder(GetVariablesPlainArgs defaults) {
            $ = new GetVariablesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param orgId Organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetVariablesPlainArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            return $;
        }
    }

}
