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
public final class ConnectorGcpKmsOidcAuthentication {
    /**
     * @return The delegates to inherit the credentials from.
     * 
     */
    private @Nullable List<String> delegateSelectors;
    /**
     * @return The project number of the GCP project that is used to create the workload identity.
     * 
     */
    private String gcpProjectId;
    /**
     * @return The OIDC provider ID value configured in GCP.
     * 
     */
    private String providerId;
    /**
     * @return The service account linked to workload identity pool while setting GCP workload identity provider.
     * 
     */
    private String serviceAccountEmail;
    /**
     * @return The workload pool ID value created in GCP.
     * 
     */
    private String workloadPoolId;

    private ConnectorGcpKmsOidcAuthentication() {}
    /**
     * @return The delegates to inherit the credentials from.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors == null ? List.of() : this.delegateSelectors;
    }
    /**
     * @return The project number of the GCP project that is used to create the workload identity.
     * 
     */
    public String gcpProjectId() {
        return this.gcpProjectId;
    }
    /**
     * @return The OIDC provider ID value configured in GCP.
     * 
     */
    public String providerId() {
        return this.providerId;
    }
    /**
     * @return The service account linked to workload identity pool while setting GCP workload identity provider.
     * 
     */
    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * @return The workload pool ID value created in GCP.
     * 
     */
    public String workloadPoolId() {
        return this.workloadPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorGcpKmsOidcAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> delegateSelectors;
        private String gcpProjectId;
        private String providerId;
        private String serviceAccountEmail;
        private String workloadPoolId;
        public Builder() {}
        public Builder(ConnectorGcpKmsOidcAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.gcpProjectId = defaults.gcpProjectId;
    	      this.providerId = defaults.providerId;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.workloadPoolId = defaults.workloadPoolId;
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
        public Builder gcpProjectId(String gcpProjectId) {
            if (gcpProjectId == null) {
              throw new MissingRequiredPropertyException("ConnectorGcpKmsOidcAuthentication", "gcpProjectId");
            }
            this.gcpProjectId = gcpProjectId;
            return this;
        }
        @CustomType.Setter
        public Builder providerId(String providerId) {
            if (providerId == null) {
              throw new MissingRequiredPropertyException("ConnectorGcpKmsOidcAuthentication", "providerId");
            }
            this.providerId = providerId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            if (serviceAccountEmail == null) {
              throw new MissingRequiredPropertyException("ConnectorGcpKmsOidcAuthentication", "serviceAccountEmail");
            }
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }
        @CustomType.Setter
        public Builder workloadPoolId(String workloadPoolId) {
            if (workloadPoolId == null) {
              throw new MissingRequiredPropertyException("ConnectorGcpKmsOidcAuthentication", "workloadPoolId");
            }
            this.workloadPoolId = workloadPoolId;
            return this;
        }
        public ConnectorGcpKmsOidcAuthentication build() {
            final var _resultValue = new ConnectorGcpKmsOidcAuthentication();
            _resultValue.delegateSelectors = delegateSelectors;
            _resultValue.gcpProjectId = gcpProjectId;
            _resultValue.providerId = providerId;
            _resultValue.serviceAccountEmail = serviceAccountEmail;
            _resultValue.workloadPoolId = workloadPoolId;
            return _resultValue;
        }
    }
}
