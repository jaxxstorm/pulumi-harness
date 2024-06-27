// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsConnectorManual {
    /**
     * @return AWS access key.
     * 
     */
    private @Nullable String accessKey;
    /**
     * @return Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private @Nullable String accessKeyRef;
    /**
     * @return Connect only use delegates with these tags.
     * 
     */
    private @Nullable List<String> delegateSelectors;
    /**
     * @return Reference to the Harness secret containing the aws secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String secretKeyRef;

    private AwsConnectorManual() {}
    /**
     * @return AWS access key.
     * 
     */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * @return Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<String> accessKeyRef() {
        return Optional.ofNullable(this.accessKeyRef);
    }
    /**
     * @return Connect only use delegates with these tags.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors == null ? List.of() : this.delegateSelectors;
    }
    /**
     * @return Reference to the Harness secret containing the aws secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String secretKeyRef() {
        return this.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsConnectorManual defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable String accessKeyRef;
        private @Nullable List<String> delegateSelectors;
        private String secretKeyRef;
        public Builder() {}
        public Builder(AwsConnectorManual defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accessKeyRef = defaults.accessKeyRef;
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        @CustomType.Setter
        public Builder accessKey(@Nullable String accessKey) {

            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder accessKeyRef(@Nullable String accessKeyRef) {

            this.accessKeyRef = accessKeyRef;
            return this;
        }
        @CustomType.Setter
        public Builder delegateSelectors(@Nullable List<String> delegateSelectors) {

            this.delegateSelectors = delegateSelectors;
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        @CustomType.Setter
        public Builder secretKeyRef(String secretKeyRef) {
            if (secretKeyRef == null) {
              throw new MissingRequiredPropertyException("AwsConnectorManual", "secretKeyRef");
            }
            this.secretKeyRef = secretKeyRef;
            return this;
        }
        public AwsConnectorManual build() {
            final var _resultValue = new AwsConnectorManual();
            _resultValue.accessKey = accessKey;
            _resultValue.accessKeyRef = accessKeyRef;
            _resultValue.delegateSelectors = delegateSelectors;
            _resultValue.secretKeyRef = secretKeyRef;
            return _resultValue;
        }
    }
}