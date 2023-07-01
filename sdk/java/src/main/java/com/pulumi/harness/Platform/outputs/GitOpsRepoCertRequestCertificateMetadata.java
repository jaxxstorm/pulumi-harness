// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsRepoCertRequestCertificateMetadata {
    private @Nullable String continue_;
    private @Nullable String remainingItemCount;
    private @Nullable String resourceVersion;
    private @Nullable String selfLink;

    private GitOpsRepoCertRequestCertificateMetadata() {}
    public Optional<String> continue_() {
        return Optional.ofNullable(this.continue_);
    }
    public Optional<String> remainingItemCount() {
        return Optional.ofNullable(this.remainingItemCount);
    }
    public Optional<String> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }
    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsRepoCertRequestCertificateMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String continue_;
        private @Nullable String remainingItemCount;
        private @Nullable String resourceVersion;
        private @Nullable String selfLink;
        public Builder() {}
        public Builder(GitOpsRepoCertRequestCertificateMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continue_ = defaults.continue_;
    	      this.remainingItemCount = defaults.remainingItemCount;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
        }

        @CustomType.Setter("continue")
        public Builder continue_(@Nullable String continue_) {
            this.continue_ = continue_;
            return this;
        }
        @CustomType.Setter
        public Builder remainingItemCount(@Nullable String remainingItemCount) {
            this.remainingItemCount = remainingItemCount;
            return this;
        }
        @CustomType.Setter
        public Builder resourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public GitOpsRepoCertRequestCertificateMetadata build() {
            final var o = new GitOpsRepoCertRequestCertificateMetadata();
            o.continue_ = continue_;
            o.remainingItemCount = remainingItemCount;
            o.resourceVersion = resourceVersion;
            o.selfLink = selfLink;
            return o;
        }
    }
}
