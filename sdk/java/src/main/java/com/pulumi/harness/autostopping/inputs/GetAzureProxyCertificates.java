// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAzureProxyCertificates extends com.pulumi.resources.InvokeArgs {

    public static final GetAzureProxyCertificates Empty = new GetAzureProxyCertificates();

    /**
     * ID of certificate secret uploaded to vault
     * 
     */
    @Import(name="certSecretId", required=true)
    private String certSecretId;

    /**
     * @return ID of certificate secret uploaded to vault
     * 
     */
    public String certSecretId() {
        return this.certSecretId;
    }

    /**
     * ID of certificate key uploaded to vault
     * 
     */
    @Import(name="keySecretId", required=true)
    private String keySecretId;

    /**
     * @return ID of certificate key uploaded to vault
     * 
     */
    public String keySecretId() {
        return this.keySecretId;
    }

    private GetAzureProxyCertificates() {}

    private GetAzureProxyCertificates(GetAzureProxyCertificates $) {
        this.certSecretId = $.certSecretId;
        this.keySecretId = $.keySecretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAzureProxyCertificates defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAzureProxyCertificates $;

        public Builder() {
            $ = new GetAzureProxyCertificates();
        }

        public Builder(GetAzureProxyCertificates defaults) {
            $ = new GetAzureProxyCertificates(Objects.requireNonNull(defaults));
        }

        /**
         * @param certSecretId ID of certificate secret uploaded to vault
         * 
         * @return builder
         * 
         */
        public Builder certSecretId(String certSecretId) {
            $.certSecretId = certSecretId;
            return this;
        }

        /**
         * @param keySecretId ID of certificate key uploaded to vault
         * 
         * @return builder
         * 
         */
        public Builder keySecretId(String keySecretId) {
            $.keySecretId = keySecretId;
            return this;
        }

        public GetAzureProxyCertificates build() {
            if ($.certSecretId == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyCertificates", "certSecretId");
            }
            if ($.keySecretId == null) {
                throw new MissingRequiredPropertyException("GetAzureProxyCertificates", "keySecretId");
            }
            return $;
        }
    }

}