// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsArgs;
import com.pulumi.harness.platform.inputs.ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorAzureCloudProviderCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorAzureCloudProviderCredentialsArgs Empty = new ConnectorAzureCloudProviderCredentialsArgs();

    /**
     * Authenticate to Azure Cloud Provider using details inheriting from delegate.
     * 
     */
    @Import(name="azureInheritFromDelegateDetails")
    private @Nullable Output<ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsArgs> azureInheritFromDelegateDetails;

    /**
     * @return Authenticate to Azure Cloud Provider using details inheriting from delegate.
     * 
     */
    public Optional<Output<ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsArgs>> azureInheritFromDelegateDetails() {
        return Optional.ofNullable(this.azureInheritFromDelegateDetails);
    }

    /**
     * Authenticate to Azure Cloud Provider using manual details.
     * 
     */
    @Import(name="azureManualDetails")
    private @Nullable Output<ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs> azureManualDetails;

    /**
     * @return Authenticate to Azure Cloud Provider using manual details.
     * 
     */
    public Optional<Output<ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs>> azureManualDetails() {
        return Optional.ofNullable(this.azureManualDetails);
    }

    /**
     * Type can either be InheritFromDelegate or ManualConfig.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type can either be InheritFromDelegate or ManualConfig.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ConnectorAzureCloudProviderCredentialsArgs() {}

    private ConnectorAzureCloudProviderCredentialsArgs(ConnectorAzureCloudProviderCredentialsArgs $) {
        this.azureInheritFromDelegateDetails = $.azureInheritFromDelegateDetails;
        this.azureManualDetails = $.azureManualDetails;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorAzureCloudProviderCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorAzureCloudProviderCredentialsArgs $;

        public Builder() {
            $ = new ConnectorAzureCloudProviderCredentialsArgs();
        }

        public Builder(ConnectorAzureCloudProviderCredentialsArgs defaults) {
            $ = new ConnectorAzureCloudProviderCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureInheritFromDelegateDetails Authenticate to Azure Cloud Provider using details inheriting from delegate.
         * 
         * @return builder
         * 
         */
        public Builder azureInheritFromDelegateDetails(@Nullable Output<ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsArgs> azureInheritFromDelegateDetails) {
            $.azureInheritFromDelegateDetails = azureInheritFromDelegateDetails;
            return this;
        }

        /**
         * @param azureInheritFromDelegateDetails Authenticate to Azure Cloud Provider using details inheriting from delegate.
         * 
         * @return builder
         * 
         */
        public Builder azureInheritFromDelegateDetails(ConnectorAzureCloudProviderCredentialsAzureInheritFromDelegateDetailsArgs azureInheritFromDelegateDetails) {
            return azureInheritFromDelegateDetails(Output.of(azureInheritFromDelegateDetails));
        }

        /**
         * @param azureManualDetails Authenticate to Azure Cloud Provider using manual details.
         * 
         * @return builder
         * 
         */
        public Builder azureManualDetails(@Nullable Output<ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs> azureManualDetails) {
            $.azureManualDetails = azureManualDetails;
            return this;
        }

        /**
         * @param azureManualDetails Authenticate to Azure Cloud Provider using manual details.
         * 
         * @return builder
         * 
         */
        public Builder azureManualDetails(ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs azureManualDetails) {
            return azureManualDetails(Output.of(azureManualDetails));
        }

        /**
         * @param type Type can either be InheritFromDelegate or ManualConfig.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type can either be InheritFromDelegate or ManualConfig.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ConnectorAzureCloudProviderCredentialsArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
