// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsClusterRequestId {
    /**
     * @return Type of the specified cluster identifier ( &#39;server&#39; - default, &#39;name&#39; ).
     * 
     */
    private @Nullable String type;
    /**
     * @return Cluster server URL or the cluster name.
     * 
     */
    private @Nullable String value;

    private GetGitopsClusterRequestId() {}
    /**
     * @return Type of the specified cluster identifier ( &#39;server&#39; - default, &#39;name&#39; ).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Cluster server URL or the cluster name.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsClusterRequestId defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetGitopsClusterRequestId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public GetGitopsClusterRequestId build() {
            final var _resultValue = new GetGitopsClusterRequestId();
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
