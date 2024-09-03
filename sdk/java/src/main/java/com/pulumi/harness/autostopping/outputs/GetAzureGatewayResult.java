// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAzureGatewayResult {
    /**
     * @return ID of Azure AppGateway for importing
     * 
     */
    private @Nullable String appGatewayId;
    /**
     * @return Region in which azure cloud function will be provisioned
     * 
     */
    private String azureFuncRegion;
    /**
     * @return ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
     * 
     */
    private @Nullable String certificateId;
    /**
     * @return Id of the cloud connector
     * 
     */
    private String cloudConnectorId;
    private Boolean deleteCloudResourcesOnDestroy;
    /**
     * @return ID of IP address to be used. Required only for creating new AppGateway. See [https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address](https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address) for more details
     * 
     */
    private @Nullable String frontendIp;
    /**
     * @return Hostname for the proxy
     * 
     */
    private String hostName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource
     * 
     */
    private String identifier;
    /**
     * @return Name of the proxy
     * 
     */
    private String name;
    /**
     * @return Region in which cloud resources are hosted
     * 
     */
    private String region;
    /**
     * @return Resource group in which cloud resources are hosted
     * 
     */
    private String resourceGroup;
    /**
     * @return Size of machine used for the gateway
     * 
     */
    private @Nullable String skuSize;
    /**
     * @return Subnet in which cloud resources are hosted
     * 
     */
    private @Nullable String subnetId;
    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    private String vpc;

    private GetAzureGatewayResult() {}
    /**
     * @return ID of Azure AppGateway for importing
     * 
     */
    public Optional<String> appGatewayId() {
        return Optional.ofNullable(this.appGatewayId);
    }
    /**
     * @return Region in which azure cloud function will be provisioned
     * 
     */
    public String azureFuncRegion() {
        return this.azureFuncRegion;
    }
    /**
     * @return ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
     * 
     */
    public Optional<String> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }
    /**
     * @return Id of the cloud connector
     * 
     */
    public String cloudConnectorId() {
        return this.cloudConnectorId;
    }
    public Boolean deleteCloudResourcesOnDestroy() {
        return this.deleteCloudResourcesOnDestroy;
    }
    /**
     * @return ID of IP address to be used. Required only for creating new AppGateway. See [https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address](https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address) for more details
     * 
     */
    public Optional<String> frontendIp() {
        return Optional.ofNullable(this.frontendIp);
    }
    /**
     * @return Hostname for the proxy
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Name of the proxy
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Region in which cloud resources are hosted
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Resource group in which cloud resources are hosted
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * @return Size of machine used for the gateway
     * 
     */
    public Optional<String> skuSize() {
        return Optional.ofNullable(this.skuSize);
    }
    /**
     * @return Subnet in which cloud resources are hosted
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureGatewayResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String appGatewayId;
        private String azureFuncRegion;
        private @Nullable String certificateId;
        private String cloudConnectorId;
        private Boolean deleteCloudResourcesOnDestroy;
        private @Nullable String frontendIp;
        private String hostName;
        private String id;
        private String identifier;
        private String name;
        private String region;
        private String resourceGroup;
        private @Nullable String skuSize;
        private @Nullable String subnetId;
        private String vpc;
        public Builder() {}
        public Builder(GetAzureGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appGatewayId = defaults.appGatewayId;
    	      this.azureFuncRegion = defaults.azureFuncRegion;
    	      this.certificateId = defaults.certificateId;
    	      this.cloudConnectorId = defaults.cloudConnectorId;
    	      this.deleteCloudResourcesOnDestroy = defaults.deleteCloudResourcesOnDestroy;
    	      this.frontendIp = defaults.frontendIp;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.skuSize = defaults.skuSize;
    	      this.subnetId = defaults.subnetId;
    	      this.vpc = defaults.vpc;
        }

        @CustomType.Setter
        public Builder appGatewayId(@Nullable String appGatewayId) {

            this.appGatewayId = appGatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder azureFuncRegion(String azureFuncRegion) {
            if (azureFuncRegion == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "azureFuncRegion");
            }
            this.azureFuncRegion = azureFuncRegion;
            return this;
        }
        @CustomType.Setter
        public Builder certificateId(@Nullable String certificateId) {

            this.certificateId = certificateId;
            return this;
        }
        @CustomType.Setter
        public Builder cloudConnectorId(String cloudConnectorId) {
            if (cloudConnectorId == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "cloudConnectorId");
            }
            this.cloudConnectorId = cloudConnectorId;
            return this;
        }
        @CustomType.Setter
        public Builder deleteCloudResourcesOnDestroy(Boolean deleteCloudResourcesOnDestroy) {
            if (deleteCloudResourcesOnDestroy == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "deleteCloudResourcesOnDestroy");
            }
            this.deleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder frontendIp(@Nullable String frontendIp) {

            this.frontendIp = frontendIp;
            return this;
        }
        @CustomType.Setter
        public Builder hostName(String hostName) {
            if (hostName == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "hostName");
            }
            this.hostName = hostName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(String resourceGroup) {
            if (resourceGroup == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "resourceGroup");
            }
            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder skuSize(@Nullable String skuSize) {

            this.skuSize = skuSize;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(@Nullable String subnetId) {

            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder vpc(String vpc) {
            if (vpc == null) {
              throw new MissingRequiredPropertyException("GetAzureGatewayResult", "vpc");
            }
            this.vpc = vpc;
            return this;
        }
        public GetAzureGatewayResult build() {
            final var _resultValue = new GetAzureGatewayResult();
            _resultValue.appGatewayId = appGatewayId;
            _resultValue.azureFuncRegion = azureFuncRegion;
            _resultValue.certificateId = certificateId;
            _resultValue.cloudConnectorId = cloudConnectorId;
            _resultValue.deleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            _resultValue.frontendIp = frontendIp;
            _resultValue.hostName = hostName;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            _resultValue.region = region;
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.skuSize = skuSize;
            _resultValue.subnetId = subnetId;
            _resultValue.vpc = vpc;
            return _resultValue;
        }
    }
}
