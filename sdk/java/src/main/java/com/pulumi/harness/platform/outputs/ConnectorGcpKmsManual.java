// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorGcpKmsManual {
    /**
     * @return Reference to the Harness secret containing the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String credentials;
    /**
     * @return The delegates to connect with.
     * 
     */
    private @Nullable List<String> delegateSelectors;

    private ConnectorGcpKmsManual() {}
    /**
     * @return Reference to the Harness secret containing the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String credentials() {
        return this.credentials;
    }
    /**
     * @return The delegates to connect with.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors == null ? List.of() : this.delegateSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorGcpKmsManual defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String credentials;
        private @Nullable List<String> delegateSelectors;
        public Builder() {}
        public Builder(ConnectorGcpKmsManual defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.delegateSelectors = defaults.delegateSelectors;
        }

        @CustomType.Setter
        public Builder credentials(String credentials) {
            if (credentials == null) {
              throw new MissingRequiredPropertyException("ConnectorGcpKmsManual", "credentials");
            }
            this.credentials = credentials;
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
        public ConnectorGcpKmsManual build() {
            final var _resultValue = new ConnectorGcpKmsManual();
            _resultValue.credentials = credentials;
            _resultValue.delegateSelectors = delegateSelectors;
            return _resultValue;
        }
    }
}
