// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAwsKmsConnectorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAwsKmsConnectorPlainArgs Empty = new GetAwsKmsConnectorPlainArgs();

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable String orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetAwsKmsConnectorPlainArgs() {}

    private GetAwsKmsConnectorPlainArgs(GetAwsKmsConnectorPlainArgs $) {
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAwsKmsConnectorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAwsKmsConnectorPlainArgs $;

        public Builder() {
            $ = new GetAwsKmsConnectorPlainArgs();
        }

        public Builder(GetAwsKmsConnectorPlainArgs defaults) {
            $ = new GetAwsKmsConnectorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetAwsKmsConnectorPlainArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            return $;
        }
    }

}
