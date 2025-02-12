// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AwsKmsConnectorCredentialsOidcAuthentication {
    /**
     * @return The ARN of the IAM role to assume.
     * 
     */
    private String iamRoleArn;

    private AwsKmsConnectorCredentialsOidcAuthentication() {}
    /**
     * @return The ARN of the IAM role to assume.
     * 
     */
    public String iamRoleArn() {
        return this.iamRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsKmsConnectorCredentialsOidcAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String iamRoleArn;
        public Builder() {}
        public Builder(AwsKmsConnectorCredentialsOidcAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRoleArn = defaults.iamRoleArn;
        }

        @CustomType.Setter
        public Builder iamRoleArn(String iamRoleArn) {
            if (iamRoleArn == null) {
              throw new MissingRequiredPropertyException("AwsKmsConnectorCredentialsOidcAuthentication", "iamRoleArn");
            }
            this.iamRoleArn = iamRoleArn;
            return this;
        }
        public AwsKmsConnectorCredentialsOidcAuthentication build() {
            final var _resultValue = new AwsKmsConnectorCredentialsOidcAuthentication();
            _resultValue.iamRoleArn = iamRoleArn;
            return _resultValue;
        }
    }
}
