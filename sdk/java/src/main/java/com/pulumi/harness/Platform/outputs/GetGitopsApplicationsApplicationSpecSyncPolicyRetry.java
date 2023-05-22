// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSyncPolicyRetry {
    private @Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff> backoffs;
    private @Nullable String limit;

    private GetGitopsApplicationsApplicationSpecSyncPolicyRetry() {}
    public List<GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff> backoffs() {
        return this.backoffs == null ? List.of() : this.backoffs;
    }
    public Optional<String> limit() {
        return Optional.ofNullable(this.limit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSyncPolicyRetry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff> backoffs;
        private @Nullable String limit;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSyncPolicyRetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backoffs = defaults.backoffs;
    	      this.limit = defaults.limit;
        }

        @CustomType.Setter
        public Builder backoffs(@Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff> backoffs) {
            this.backoffs = backoffs;
            return this;
        }
        public Builder backoffs(GetGitopsApplicationsApplicationSpecSyncPolicyRetryBackoff... backoffs) {
            return backoffs(List.of(backoffs));
        }
        @CustomType.Setter
        public Builder limit(@Nullable String limit) {
            this.limit = limit;
            return this;
        }
        public GetGitopsApplicationsApplicationSpecSyncPolicyRetry build() {
            final var o = new GetGitopsApplicationsApplicationSpecSyncPolicyRetry();
            o.backoffs = backoffs;
            o.limit = limit;
            return o;
        }
    }
}
