// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEncryptedTextUsageScope {
    /**
     * @return Id of the application to scope to. If empty then this scope applies to all applications.
     * 
     */
    private @Nullable String applicationId;
    /**
     * @return Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
     * 
     */
    private @Nullable String environmentFilterType;
    /**
     * @return Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
     * 
     */
    private @Nullable String environmentId;

    private GetEncryptedTextUsageScope() {}
    /**
     * @return Id of the application to scope to. If empty then this scope applies to all applications.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * @return Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
     * 
     */
    public Optional<String> environmentFilterType() {
        return Optional.ofNullable(this.environmentFilterType);
    }
    /**
     * @return Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
     * 
     */
    public Optional<String> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptedTextUsageScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String environmentFilterType;
        private @Nullable String environmentId;
        public Builder() {}
        public Builder(GetEncryptedTextUsageScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.environmentFilterType = defaults.environmentFilterType;
    	      this.environmentId = defaults.environmentId;
        }

        @CustomType.Setter
        public Builder applicationId(@Nullable String applicationId) {

            this.applicationId = applicationId;
            return this;
        }
        @CustomType.Setter
        public Builder environmentFilterType(@Nullable String environmentFilterType) {

            this.environmentFilterType = environmentFilterType;
            return this;
        }
        @CustomType.Setter
        public Builder environmentId(@Nullable String environmentId) {

            this.environmentId = environmentId;
            return this;
        }
        public GetEncryptedTextUsageScope build() {
            final var _resultValue = new GetEncryptedTextUsageScope();
            _resultValue.applicationId = applicationId;
            _resultValue.environmentFilterType = environmentFilterType;
            _resultValue.environmentId = environmentId;
            return _resultValue;
        }
    }
}
