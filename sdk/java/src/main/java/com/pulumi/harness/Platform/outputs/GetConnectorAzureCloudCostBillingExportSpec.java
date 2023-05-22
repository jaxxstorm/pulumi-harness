// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectorAzureCloudCostBillingExportSpec {
    private String containerName;
    private String directoryName;
    private String reportName;
    private String storageAccountName;
    /**
     * @return Subsription id.
     * 
     */
    private String subscriptionId;

    private GetConnectorAzureCloudCostBillingExportSpec() {}
    public String containerName() {
        return this.containerName;
    }
    public String directoryName() {
        return this.directoryName;
    }
    public String reportName() {
        return this.reportName;
    }
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * @return Subsription id.
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorAzureCloudCostBillingExportSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerName;
        private String directoryName;
        private String reportName;
        private String storageAccountName;
        private String subscriptionId;
        public Builder() {}
        public Builder(GetConnectorAzureCloudCostBillingExportSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.directoryName = defaults.directoryName;
    	      this.reportName = defaults.reportName;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        @CustomType.Setter
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        @CustomType.Setter
        public Builder directoryName(String directoryName) {
            this.directoryName = Objects.requireNonNull(directoryName);
            return this;
        }
        @CustomType.Setter
        public Builder reportName(String reportName) {
            this.reportName = Objects.requireNonNull(reportName);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public GetConnectorAzureCloudCostBillingExportSpec build() {
            final var o = new GetConnectorAzureCloudCostBillingExportSpec();
            o.containerName = containerName;
            o.directoryName = directoryName;
            o.reportName = reportName;
            o.storageAccountName = storageAccountName;
            o.subscriptionId = subscriptionId;
            return o;
        }
    }
}
