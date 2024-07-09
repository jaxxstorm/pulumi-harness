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
public final class GetAwsConnectorManual {
    /**
     * @return AWS access key.
     * 
     */
    private String accessKey;
    /**
     * @return The plain text AWS access key.
     * 
     */
    private @Nullable String accessKeyPlainText;
    /**
     * @return Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String accessKeyRef;
    /**
     * @return Connect only use delegates with these tags.
     * 
     */
    private List<String> delegateSelectors;
    /**
     * @return AWS Region to perform Connection test of Connector.
     * 
     */
    private @Nullable String region;
    /**
     * @return Reference to the Harness secret containing the aws secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String secretKeyRef;

    private GetAwsConnectorManual() {}
    /**
     * @return AWS access key.
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return The plain text AWS access key.
     * 
     */
    public Optional<String> accessKeyPlainText() {
        return Optional.ofNullable(this.accessKeyPlainText);
    }
    /**
     * @return Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String accessKeyRef() {
        return this.accessKeyRef;
    }
    /**
     * @return Connect only use delegates with these tags.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors;
    }
    /**
     * @return AWS Region to perform Connection test of Connector.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
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

    public static Builder builder(GetAwsConnectorManual defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private @Nullable String accessKeyPlainText;
        private String accessKeyRef;
        private List<String> delegateSelectors;
        private @Nullable String region;
        private String secretKeyRef;
        public Builder() {}
        public Builder(GetAwsConnectorManual defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accessKeyPlainText = defaults.accessKeyPlainText;
    	      this.accessKeyRef = defaults.accessKeyRef;
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.region = defaults.region;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            if (accessKey == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorManual", "accessKey");
            }
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder accessKeyPlainText(@Nullable String accessKeyPlainText) {

            this.accessKeyPlainText = accessKeyPlainText;
            return this;
        }
        @CustomType.Setter
        public Builder accessKeyRef(String accessKeyRef) {
            if (accessKeyRef == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorManual", "accessKeyRef");
            }
            this.accessKeyRef = accessKeyRef;
            return this;
        }
        @CustomType.Setter
        public Builder delegateSelectors(List<String> delegateSelectors) {
            if (delegateSelectors == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorManual", "delegateSelectors");
            }
            this.delegateSelectors = delegateSelectors;
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secretKeyRef(String secretKeyRef) {
            if (secretKeyRef == null) {
              throw new MissingRequiredPropertyException("GetAwsConnectorManual", "secretKeyRef");
            }
            this.secretKeyRef = secretKeyRef;
            return this;
        }
        public GetAwsConnectorManual build() {
            final var _resultValue = new GetAwsConnectorManual();
            _resultValue.accessKey = accessKey;
            _resultValue.accessKeyPlainText = accessKeyPlainText;
            _resultValue.accessKeyRef = accessKeyRef;
            _resultValue.delegateSelectors = delegateSelectors;
            _resultValue.region = region;
            _resultValue.secretKeyRef = secretKeyRef;
            return _resultValue;
        }
    }
}
