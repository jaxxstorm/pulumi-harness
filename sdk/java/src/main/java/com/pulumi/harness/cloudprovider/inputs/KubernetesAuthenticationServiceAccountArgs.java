// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesAuthenticationServiceAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesAuthenticationServiceAccountArgs Empty = new KubernetesAuthenticationServiceAccountArgs();

    /**
     * Name of the Harness secret containing the CA certificate for the cluster.
     * 
     */
    @Import(name="caCertificateSecretName")
    private @Nullable Output<String> caCertificateSecretName;

    /**
     * @return Name of the Harness secret containing the CA certificate for the cluster.
     * 
     */
    public Optional<Output<String>> caCertificateSecretName() {
        return Optional.ofNullable(this.caCertificateSecretName);
    }

    /**
     * URL of the Kubernetes master to connect to.
     * 
     */
    @Import(name="masterUrl", required=true)
    private Output<String> masterUrl;

    /**
     * @return URL of the Kubernetes master to connect to.
     * 
     */
    public Output<String> masterUrl() {
        return this.masterUrl;
    }

    /**
     * Name of the Harness secret containing the service account token for the cluster.
     * 
     */
    @Import(name="serviceAccountTokenSecretName", required=true)
    private Output<String> serviceAccountTokenSecretName;

    /**
     * @return Name of the Harness secret containing the service account token for the cluster.
     * 
     */
    public Output<String> serviceAccountTokenSecretName() {
        return this.serviceAccountTokenSecretName;
    }

    private KubernetesAuthenticationServiceAccountArgs() {}

    private KubernetesAuthenticationServiceAccountArgs(KubernetesAuthenticationServiceAccountArgs $) {
        this.caCertificateSecretName = $.caCertificateSecretName;
        this.masterUrl = $.masterUrl;
        this.serviceAccountTokenSecretName = $.serviceAccountTokenSecretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesAuthenticationServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesAuthenticationServiceAccountArgs $;

        public Builder() {
            $ = new KubernetesAuthenticationServiceAccountArgs();
        }

        public Builder(KubernetesAuthenticationServiceAccountArgs defaults) {
            $ = new KubernetesAuthenticationServiceAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCertificateSecretName Name of the Harness secret containing the CA certificate for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder caCertificateSecretName(@Nullable Output<String> caCertificateSecretName) {
            $.caCertificateSecretName = caCertificateSecretName;
            return this;
        }

        /**
         * @param caCertificateSecretName Name of the Harness secret containing the CA certificate for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder caCertificateSecretName(String caCertificateSecretName) {
            return caCertificateSecretName(Output.of(caCertificateSecretName));
        }

        /**
         * @param masterUrl URL of the Kubernetes master to connect to.
         * 
         * @return builder
         * 
         */
        public Builder masterUrl(Output<String> masterUrl) {
            $.masterUrl = masterUrl;
            return this;
        }

        /**
         * @param masterUrl URL of the Kubernetes master to connect to.
         * 
         * @return builder
         * 
         */
        public Builder masterUrl(String masterUrl) {
            return masterUrl(Output.of(masterUrl));
        }

        /**
         * @param serviceAccountTokenSecretName Name of the Harness secret containing the service account token for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountTokenSecretName(Output<String> serviceAccountTokenSecretName) {
            $.serviceAccountTokenSecretName = serviceAccountTokenSecretName;
            return this;
        }

        /**
         * @param serviceAccountTokenSecretName Name of the Harness secret containing the service account token for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountTokenSecretName(String serviceAccountTokenSecretName) {
            return serviceAccountTokenSecretName(Output.of(serviceAccountTokenSecretName));
        }

        public KubernetesAuthenticationServiceAccountArgs build() {
            if ($.masterUrl == null) {
                throw new MissingRequiredPropertyException("KubernetesAuthenticationServiceAccountArgs", "masterUrl");
            }
            if ($.serviceAccountTokenSecretName == null) {
                throw new MissingRequiredPropertyException("KubernetesAuthenticationServiceAccountArgs", "serviceAccountTokenSecretName");
            }
            return $;
        }
    }

}