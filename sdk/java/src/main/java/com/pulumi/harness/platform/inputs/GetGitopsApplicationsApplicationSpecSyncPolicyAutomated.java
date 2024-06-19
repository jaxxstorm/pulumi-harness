// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSyncPolicyAutomated extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSyncPolicyAutomated Empty = new GetGitopsApplicationsApplicationSpecSyncPolicyAutomated();

    /**
     * Indicates to allows apps to have zero live resources (default: false).
     * 
     */
    @Import(name="allowEmpty")
    private @Nullable Boolean allowEmpty;

    /**
     * @return Indicates to allows apps to have zero live resources (default: false).
     * 
     */
    public Optional<Boolean> allowEmpty() {
        return Optional.ofNullable(this.allowEmpty);
    }

    /**
     * Indicates whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync (default: false).
     * 
     */
    @Import(name="prune")
    private @Nullable Boolean prune;

    /**
     * @return Indicates whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync (default: false).
     * 
     */
    public Optional<Boolean> prune() {
        return Optional.ofNullable(this.prune);
    }

    /**
     * Indicates whether to revert resources back to their desired state upon modification in the cluster (default: false).
     * 
     */
    @Import(name="selfHeal")
    private @Nullable Boolean selfHeal;

    /**
     * @return Indicates whether to revert resources back to their desired state upon modification in the cluster (default: false).
     * 
     */
    public Optional<Boolean> selfHeal() {
        return Optional.ofNullable(this.selfHeal);
    }

    private GetGitopsApplicationsApplicationSpecSyncPolicyAutomated() {}

    private GetGitopsApplicationsApplicationSpecSyncPolicyAutomated(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated $) {
        this.allowEmpty = $.allowEmpty;
        this.prune = $.prune;
        this.selfHeal = $.selfHeal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSyncPolicyAutomated $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSyncPolicyAutomated();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSyncPolicyAutomated(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowEmpty Indicates to allows apps to have zero live resources (default: false).
         * 
         * @return builder
         * 
         */
        public Builder allowEmpty(@Nullable Boolean allowEmpty) {
            $.allowEmpty = allowEmpty;
            return this;
        }

        /**
         * @param prune Indicates whether to delete resources from the cluster that are not found in the sources anymore as part of automated sync (default: false).
         * 
         * @return builder
         * 
         */
        public Builder prune(@Nullable Boolean prune) {
            $.prune = prune;
            return this;
        }

        /**
         * @param selfHeal Indicates whether to revert resources back to their desired state upon modification in the cluster (default: false).
         * 
         * @return builder
         * 
         */
        public Builder selfHeal(@Nullable Boolean selfHeal) {
            $.selfHeal = selfHeal;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSyncPolicyAutomated build() {
            return $;
        }
    }

}
