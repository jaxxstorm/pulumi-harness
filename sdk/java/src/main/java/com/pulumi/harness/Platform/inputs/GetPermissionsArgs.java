// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPermissionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPermissionsArgs Empty = new GetPermissionsArgs();

    /**
     * Organization Identifier
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization Identifier
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetPermissionsArgs() {}

    private GetPermissionsArgs(GetPermissionsArgs $) {
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPermissionsArgs $;

        public Builder() {
            $ = new GetPermissionsArgs();
        }

        public Builder(GetPermissionsArgs defaults) {
            $ = new GetPermissionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param orgId Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetPermissionsArgs build() {
            return $;
        }
    }

}
