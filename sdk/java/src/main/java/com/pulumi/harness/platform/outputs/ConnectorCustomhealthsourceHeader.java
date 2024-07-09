// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorCustomhealthsourceHeader {
    /**
     * @return Reference to the Harness secret containing the encrypted value. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private @Nullable String encryptedValueRef;
    /**
     * @return Key.
     * 
     */
    private String key;
    /**
     * @return Value.
     * 
     */
    private @Nullable String value;
    /**
     * @return Encrypted value.
     * 
     */
    private @Nullable Boolean valueEncrypted;

    private ConnectorCustomhealthsourceHeader() {}
    /**
     * @return Reference to the Harness secret containing the encrypted value. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<String> encryptedValueRef() {
        return Optional.ofNullable(this.encryptedValueRef);
    }
    /**
     * @return Key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    /**
     * @return Encrypted value.
     * 
     */
    public Optional<Boolean> valueEncrypted() {
        return Optional.ofNullable(this.valueEncrypted);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCustomhealthsourceHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String encryptedValueRef;
        private String key;
        private @Nullable String value;
        private @Nullable Boolean valueEncrypted;
        public Builder() {}
        public Builder(ConnectorCustomhealthsourceHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedValueRef = defaults.encryptedValueRef;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
    	      this.valueEncrypted = defaults.valueEncrypted;
        }

        @CustomType.Setter
        public Builder encryptedValueRef(@Nullable String encryptedValueRef) {

            this.encryptedValueRef = encryptedValueRef;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("ConnectorCustomhealthsourceHeader", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueEncrypted(@Nullable Boolean valueEncrypted) {

            this.valueEncrypted = valueEncrypted;
            return this;
        }
        public ConnectorCustomhealthsourceHeader build() {
            final var _resultValue = new ConnectorCustomhealthsourceHeader();
            _resultValue.encryptedValueRef = encryptedValueRef;
            _resultValue.key = key;
            _resultValue.value = value;
            _resultValue.valueEncrypted = valueEncrypted;
            return _resultValue;
        }
    }
}