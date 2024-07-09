// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AwsProxyCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsProxyCertificatesArgs Empty = new AwsProxyCertificatesArgs();

    /**
     * Certificate secret ID
     * 
     */
    @Import(name="certSecretId", required=true)
    private Output<String> certSecretId;

    /**
     * @return Certificate secret ID
     * 
     */
    public Output<String> certSecretId() {
        return this.certSecretId;
    }

    /**
     * Private key secret ID
     * 
     */
    @Import(name="keySecretId", required=true)
    private Output<String> keySecretId;

    /**
     * @return Private key secret ID
     * 
     */
    public Output<String> keySecretId() {
        return this.keySecretId;
    }

    private AwsProxyCertificatesArgs() {}

    private AwsProxyCertificatesArgs(AwsProxyCertificatesArgs $) {
        this.certSecretId = $.certSecretId;
        this.keySecretId = $.keySecretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsProxyCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsProxyCertificatesArgs $;

        public Builder() {
            $ = new AwsProxyCertificatesArgs();
        }

        public Builder(AwsProxyCertificatesArgs defaults) {
            $ = new AwsProxyCertificatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certSecretId Certificate secret ID
         * 
         * @return builder
         * 
         */
        public Builder certSecretId(Output<String> certSecretId) {
            $.certSecretId = certSecretId;
            return this;
        }

        /**
         * @param certSecretId Certificate secret ID
         * 
         * @return builder
         * 
         */
        public Builder certSecretId(String certSecretId) {
            return certSecretId(Output.of(certSecretId));
        }

        /**
         * @param keySecretId Private key secret ID
         * 
         * @return builder
         * 
         */
        public Builder keySecretId(Output<String> keySecretId) {
            $.keySecretId = keySecretId;
            return this;
        }

        /**
         * @param keySecretId Private key secret ID
         * 
         * @return builder
         * 
         */
        public Builder keySecretId(String keySecretId) {
            return keySecretId(Output.of(keySecretId));
        }

        public AwsProxyCertificatesArgs build() {
            if ($.certSecretId == null) {
                throw new MissingRequiredPropertyException("AwsProxyCertificatesArgs", "certSecretId");
            }
            if ($.keySecretId == null) {
                throw new MissingRequiredPropertyException("AwsProxyCertificatesArgs", "keySecretId");
            }
            return $;
        }
    }

}
