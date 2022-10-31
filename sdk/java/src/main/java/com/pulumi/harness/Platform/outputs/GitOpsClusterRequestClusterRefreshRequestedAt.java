// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsClusterRequestClusterRefreshRequestedAt {
    private @Nullable Integer nanos;
    private @Nullable String seconds;

    private GitOpsClusterRequestClusterRefreshRequestedAt() {}
    public Optional<Integer> nanos() {
        return Optional.ofNullable(this.nanos);
    }
    public Optional<String> seconds() {
        return Optional.ofNullable(this.seconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsClusterRequestClusterRefreshRequestedAt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer nanos;
        private @Nullable String seconds;
        public Builder() {}
        public Builder(GitOpsClusterRequestClusterRefreshRequestedAt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        @CustomType.Setter
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = nanos;
            return this;
        }
        @CustomType.Setter
        public Builder seconds(@Nullable String seconds) {
            this.seconds = seconds;
            return this;
        }
        public GitOpsClusterRequestClusterRefreshRequestedAt build() {
            final var o = new GitOpsClusterRequestClusterRefreshRequestedAt();
            o.nanos = nanos;
            o.seconds = seconds;
            return o;
        }
    }
}
