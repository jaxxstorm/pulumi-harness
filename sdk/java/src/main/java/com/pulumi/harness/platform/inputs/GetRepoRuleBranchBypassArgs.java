// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepoRuleBranchBypassArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRepoRuleBranchBypassArgs Empty = new GetRepoRuleBranchBypassArgs();

    /**
     * Allow users with repository edit permission to bypass.
     * 
     */
    @Import(name="repoOwners")
    private @Nullable Output<Boolean> repoOwners;

    /**
     * @return Allow users with repository edit permission to bypass.
     * 
     */
    public Optional<Output<Boolean>> repoOwners() {
        return Optional.ofNullable(this.repoOwners);
    }

    /**
     * List of user ids with who can bypass.
     * 
     */
    @Import(name="userIds")
    private @Nullable Output<List<String>> userIds;

    /**
     * @return List of user ids with who can bypass.
     * 
     */
    public Optional<Output<List<String>>> userIds() {
        return Optional.ofNullable(this.userIds);
    }

    private GetRepoRuleBranchBypassArgs() {}

    private GetRepoRuleBranchBypassArgs(GetRepoRuleBranchBypassArgs $) {
        this.repoOwners = $.repoOwners;
        this.userIds = $.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepoRuleBranchBypassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepoRuleBranchBypassArgs $;

        public Builder() {
            $ = new GetRepoRuleBranchBypassArgs();
        }

        public Builder(GetRepoRuleBranchBypassArgs defaults) {
            $ = new GetRepoRuleBranchBypassArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repoOwners Allow users with repository edit permission to bypass.
         * 
         * @return builder
         * 
         */
        public Builder repoOwners(@Nullable Output<Boolean> repoOwners) {
            $.repoOwners = repoOwners;
            return this;
        }

        /**
         * @param repoOwners Allow users with repository edit permission to bypass.
         * 
         * @return builder
         * 
         */
        public Builder repoOwners(Boolean repoOwners) {
            return repoOwners(Output.of(repoOwners));
        }

        /**
         * @param userIds List of user ids with who can bypass.
         * 
         * @return builder
         * 
         */
        public Builder userIds(@Nullable Output<List<String>> userIds) {
            $.userIds = userIds;
            return this;
        }

        /**
         * @param userIds List of user ids with who can bypass.
         * 
         * @return builder
         * 
         */
        public Builder userIds(List<String> userIds) {
            return userIds(Output.of(userIds));
        }

        /**
         * @param userIds List of user ids with who can bypass.
         * 
         * @return builder
         * 
         */
        public Builder userIds(String... userIds) {
            return userIds(List.of(userIds));
        }

        public GetRepoRuleBranchBypassArgs build() {
            return $;
        }
    }

}
