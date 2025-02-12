// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorGcpKmsOidcAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorGcpKmsOidcAuthenticationArgs Empty = new ConnectorGcpKmsOidcAuthenticationArgs();

    /**
     * The delegates to inherit the credentials from.
     * 
     */
    @Import(name="delegateSelectors")
    private @Nullable Output<List<String>> delegateSelectors;

    /**
     * @return The delegates to inherit the credentials from.
     * 
     */
    public Optional<Output<List<String>>> delegateSelectors() {
        return Optional.ofNullable(this.delegateSelectors);
    }

    /**
     * The project number of the GCP project that is used to create the workload identity.
     * 
     */
    @Import(name="gcpProjectId", required=true)
    private Output<String> gcpProjectId;

    /**
     * @return The project number of the GCP project that is used to create the workload identity.
     * 
     */
    public Output<String> gcpProjectId() {
        return this.gcpProjectId;
    }

    /**
     * The OIDC provider ID value configured in GCP.
     * 
     */
    @Import(name="providerId", required=true)
    private Output<String> providerId;

    /**
     * @return The OIDC provider ID value configured in GCP.
     * 
     */
    public Output<String> providerId() {
        return this.providerId;
    }

    /**
     * The service account linked to workload identity pool while setting GCP workload identity provider.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
    private Output<String> serviceAccountEmail;

    /**
     * @return The service account linked to workload identity pool while setting GCP workload identity provider.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    /**
     * The workload pool ID value created in GCP.
     * 
     */
    @Import(name="workloadPoolId", required=true)
    private Output<String> workloadPoolId;

    /**
     * @return The workload pool ID value created in GCP.
     * 
     */
    public Output<String> workloadPoolId() {
        return this.workloadPoolId;
    }

    private ConnectorGcpKmsOidcAuthenticationArgs() {}

    private ConnectorGcpKmsOidcAuthenticationArgs(ConnectorGcpKmsOidcAuthenticationArgs $) {
        this.delegateSelectors = $.delegateSelectors;
        this.gcpProjectId = $.gcpProjectId;
        this.providerId = $.providerId;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.workloadPoolId = $.workloadPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorGcpKmsOidcAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorGcpKmsOidcAuthenticationArgs $;

        public Builder() {
            $ = new ConnectorGcpKmsOidcAuthenticationArgs();
        }

        public Builder(ConnectorGcpKmsOidcAuthenticationArgs defaults) {
            $ = new ConnectorGcpKmsOidcAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delegateSelectors The delegates to inherit the credentials from.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(@Nullable Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors The delegates to inherit the credentials from.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors The delegates to inherit the credentials from.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }

        /**
         * @param gcpProjectId The project number of the GCP project that is used to create the workload identity.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(Output<String> gcpProjectId) {
            $.gcpProjectId = gcpProjectId;
            return this;
        }

        /**
         * @param gcpProjectId The project number of the GCP project that is used to create the workload identity.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(String gcpProjectId) {
            return gcpProjectId(Output.of(gcpProjectId));
        }

        /**
         * @param providerId The OIDC provider ID value configured in GCP.
         * 
         * @return builder
         * 
         */
        public Builder providerId(Output<String> providerId) {
            $.providerId = providerId;
            return this;
        }

        /**
         * @param providerId The OIDC provider ID value configured in GCP.
         * 
         * @return builder
         * 
         */
        public Builder providerId(String providerId) {
            return providerId(Output.of(providerId));
        }

        /**
         * @param serviceAccountEmail The service account linked to workload identity pool while setting GCP workload identity provider.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail The service account linked to workload identity pool while setting GCP workload identity provider.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param workloadPoolId The workload pool ID value created in GCP.
         * 
         * @return builder
         * 
         */
        public Builder workloadPoolId(Output<String> workloadPoolId) {
            $.workloadPoolId = workloadPoolId;
            return this;
        }

        /**
         * @param workloadPoolId The workload pool ID value created in GCP.
         * 
         * @return builder
         * 
         */
        public Builder workloadPoolId(String workloadPoolId) {
            return workloadPoolId(Output.of(workloadPoolId));
        }

        public ConnectorGcpKmsOidcAuthenticationArgs build() {
            if ($.gcpProjectId == null) {
                throw new MissingRequiredPropertyException("ConnectorGcpKmsOidcAuthenticationArgs", "gcpProjectId");
            }
            if ($.providerId == null) {
                throw new MissingRequiredPropertyException("ConnectorGcpKmsOidcAuthenticationArgs", "providerId");
            }
            if ($.serviceAccountEmail == null) {
                throw new MissingRequiredPropertyException("ConnectorGcpKmsOidcAuthenticationArgs", "serviceAccountEmail");
            }
            if ($.workloadPoolId == null) {
                throw new MissingRequiredPropertyException("ConnectorGcpKmsOidcAuthenticationArgs", "workloadPoolId");
            }
            return $;
        }
    }

}
