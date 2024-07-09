// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureProxyCertificates {
    /**
     * @return ID of certificate secret uploaded to vault
     * 
     */
    private String certSecretId;
    /**
     * @return ID of certificate key uploaded to vault
     * 
     */
    private String keySecretId;

    private AzureProxyCertificates() {}
    /**
     * @return ID of certificate secret uploaded to vault
     * 
     */
    public String certSecretId() {
        return this.certSecretId;
    }
    /**
     * @return ID of certificate key uploaded to vault
     * 
     */
    public String keySecretId() {
        return this.keySecretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureProxyCertificates defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certSecretId;
        private String keySecretId;
        public Builder() {}
        public Builder(AzureProxyCertificates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certSecretId = defaults.certSecretId;
    	      this.keySecretId = defaults.keySecretId;
        }

        @CustomType.Setter
        public Builder certSecretId(String certSecretId) {
            if (certSecretId == null) {
              throw new MissingRequiredPropertyException("AzureProxyCertificates", "certSecretId");
            }
            this.certSecretId = certSecretId;
            return this;
        }
        @CustomType.Setter
        public Builder keySecretId(String keySecretId) {
            if (keySecretId == null) {
              throw new MissingRequiredPropertyException("AzureProxyCertificates", "keySecretId");
            }
            this.keySecretId = keySecretId;
            return this;
        }
        public AzureProxyCertificates build() {
            final var _resultValue = new AzureProxyCertificates();
            _resultValue.certSecretId = certSecretId;
            _resultValue.keySecretId = keySecretId;
            return _resultValue;
        }
    }
}
