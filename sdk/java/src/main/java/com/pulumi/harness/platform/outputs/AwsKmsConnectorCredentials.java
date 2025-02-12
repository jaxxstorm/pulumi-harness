// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.AwsKmsConnectorCredentialsAssumeRole;
import com.pulumi.harness.platform.outputs.AwsKmsConnectorCredentialsManual;
import com.pulumi.harness.platform.outputs.AwsKmsConnectorCredentialsOidcAuthentication;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsKmsConnectorCredentials {
    /**
     * @return Connect using STS assume role.
     * 
     */
    private @Nullable AwsKmsConnectorCredentialsAssumeRole assumeRole;
    /**
     * @return Inherit the credentials from from the delegate.
     * 
     */
    private @Nullable Boolean inheritFromDelegate;
    /**
     * @return Specify the AWS key and secret used for authenticating.
     * 
     */
    private @Nullable AwsKmsConnectorCredentialsManual manual;
    /**
     * @return Connect using OIDC authentication.
     * 
     */
    private @Nullable AwsKmsConnectorCredentialsOidcAuthentication oidcAuthentication;

    private AwsKmsConnectorCredentials() {}
    /**
     * @return Connect using STS assume role.
     * 
     */
    public Optional<AwsKmsConnectorCredentialsAssumeRole> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }
    /**
     * @return Inherit the credentials from from the delegate.
     * 
     */
    public Optional<Boolean> inheritFromDelegate() {
        return Optional.ofNullable(this.inheritFromDelegate);
    }
    /**
     * @return Specify the AWS key and secret used for authenticating.
     * 
     */
    public Optional<AwsKmsConnectorCredentialsManual> manual() {
        return Optional.ofNullable(this.manual);
    }
    /**
     * @return Connect using OIDC authentication.
     * 
     */
    public Optional<AwsKmsConnectorCredentialsOidcAuthentication> oidcAuthentication() {
        return Optional.ofNullable(this.oidcAuthentication);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsKmsConnectorCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AwsKmsConnectorCredentialsAssumeRole assumeRole;
        private @Nullable Boolean inheritFromDelegate;
        private @Nullable AwsKmsConnectorCredentialsManual manual;
        private @Nullable AwsKmsConnectorCredentialsOidcAuthentication oidcAuthentication;
        public Builder() {}
        public Builder(AwsKmsConnectorCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assumeRole = defaults.assumeRole;
    	      this.inheritFromDelegate = defaults.inheritFromDelegate;
    	      this.manual = defaults.manual;
    	      this.oidcAuthentication = defaults.oidcAuthentication;
        }

        @CustomType.Setter
        public Builder assumeRole(@Nullable AwsKmsConnectorCredentialsAssumeRole assumeRole) {

            this.assumeRole = assumeRole;
            return this;
        }
        @CustomType.Setter
        public Builder inheritFromDelegate(@Nullable Boolean inheritFromDelegate) {

            this.inheritFromDelegate = inheritFromDelegate;
            return this;
        }
        @CustomType.Setter
        public Builder manual(@Nullable AwsKmsConnectorCredentialsManual manual) {

            this.manual = manual;
            return this;
        }
        @CustomType.Setter
        public Builder oidcAuthentication(@Nullable AwsKmsConnectorCredentialsOidcAuthentication oidcAuthentication) {

            this.oidcAuthentication = oidcAuthentication;
            return this;
        }
        public AwsKmsConnectorCredentials build() {
            final var _resultValue = new AwsKmsConnectorCredentials();
            _resultValue.assumeRole = assumeRole;
            _resultValue.inheritFromDelegate = inheritFromDelegate;
            _resultValue.manual = manual;
            _resultValue.oidcAuthentication = oidcAuthentication;
            return _resultValue;
        }
    }
}
