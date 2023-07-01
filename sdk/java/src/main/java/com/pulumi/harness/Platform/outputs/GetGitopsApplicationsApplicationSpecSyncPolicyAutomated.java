// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSyncPolicyAutomated {
    private @Nullable Boolean allowEmpty;
    private @Nullable Boolean prune;
    private @Nullable Boolean selfHeal;

    private GetGitopsApplicationsApplicationSpecSyncPolicyAutomated() {}
    public Optional<Boolean> allowEmpty() {
        return Optional.ofNullable(this.allowEmpty);
    }
    public Optional<Boolean> prune() {
        return Optional.ofNullable(this.prune);
    }
    public Optional<Boolean> selfHeal() {
        return Optional.ofNullable(this.selfHeal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowEmpty;
        private @Nullable Boolean prune;
        private @Nullable Boolean selfHeal;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowEmpty = defaults.allowEmpty;
    	      this.prune = defaults.prune;
    	      this.selfHeal = defaults.selfHeal;
        }

        @CustomType.Setter
        public Builder allowEmpty(@Nullable Boolean allowEmpty) {
            this.allowEmpty = allowEmpty;
            return this;
        }
        @CustomType.Setter
        public Builder prune(@Nullable Boolean prune) {
            this.prune = prune;
            return this;
        }
        @CustomType.Setter
        public Builder selfHeal(@Nullable Boolean selfHeal) {
            this.selfHeal = selfHeal;
            return this;
        }
        public GetGitopsApplicationsApplicationSpecSyncPolicyAutomated build() {
            final var o = new GetGitopsApplicationsApplicationSpecSyncPolicyAutomated();
            o.allowEmpty = allowEmpty;
            o.prune = prune;
            o.selfHeal = selfHeal;
            return o;
        }
    }
}
