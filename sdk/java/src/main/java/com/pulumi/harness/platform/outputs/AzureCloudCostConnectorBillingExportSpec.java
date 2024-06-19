// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureCloudCostConnectorBillingExportSpec {
    /**
     * @return Name of the container.
     * 
     */
    private String containerName;
    /**
     * @return Name of the directory.
     * 
     */
    private String directoryName;
    /**
     * @return Name of the report.
     * 
     */
    private String reportName;
    /**
     * @return Name of the storage account.
     * 
     */
    private String storageAccountName;
    /**
     * @return Subsription Id.
     * 
     */
    private String subscriptionId;

    private AzureCloudCostConnectorBillingExportSpec() {}
    /**
     * @return Name of the container.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return Name of the directory.
     * 
     */
    public String directoryName() {
        return this.directoryName;
    }
    /**
     * @return Name of the report.
     * 
     */
    public String reportName() {
        return this.reportName;
    }
    /**
     * @return Name of the storage account.
     * 
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * @return Subsription Id.
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCloudCostConnectorBillingExportSpec defaults) {
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
        public Builder(AzureCloudCostConnectorBillingExportSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.directoryName = defaults.directoryName;
    	      this.reportName = defaults.reportName;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        @CustomType.Setter
        public Builder containerName(String containerName) {
            if (containerName == null) {
              throw new MissingRequiredPropertyException("AzureCloudCostConnectorBillingExportSpec", "containerName");
            }
            this.containerName = containerName;
            return this;
        }
        @CustomType.Setter
        public Builder directoryName(String directoryName) {
            if (directoryName == null) {
              throw new MissingRequiredPropertyException("AzureCloudCostConnectorBillingExportSpec", "directoryName");
            }
            this.directoryName = directoryName;
            return this;
        }
        @CustomType.Setter
        public Builder reportName(String reportName) {
            if (reportName == null) {
              throw new MissingRequiredPropertyException("AzureCloudCostConnectorBillingExportSpec", "reportName");
            }
            this.reportName = reportName;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(String storageAccountName) {
            if (storageAccountName == null) {
              throw new MissingRequiredPropertyException("AzureCloudCostConnectorBillingExportSpec", "storageAccountName");
            }
            this.storageAccountName = storageAccountName;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionId(String subscriptionId) {
            if (subscriptionId == null) {
              throw new MissingRequiredPropertyException("AzureCloudCostConnectorBillingExportSpec", "subscriptionId");
            }
            this.subscriptionId = subscriptionId;
            return this;
        }
        public AzureCloudCostConnectorBillingExportSpec build() {
            final var _resultValue = new AzureCloudCostConnectorBillingExportSpec();
            _resultValue.containerName = containerName;
            _resultValue.directoryName = directoryName;
            _resultValue.reportName = reportName;
            _resultValue.storageAccountName = storageAccountName;
            _resultValue.subscriptionId = subscriptionId;
            return _resultValue;
        }
    }
}
