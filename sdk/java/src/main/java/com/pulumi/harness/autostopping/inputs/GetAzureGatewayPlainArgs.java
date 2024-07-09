// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAzureGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAzureGatewayPlainArgs Empty = new GetAzureGatewayPlainArgs();

    /**
     * ID of Azure AppGateway for importing
     * 
     */
    @Import(name="appGatewayId")
    private @Nullable String appGatewayId;

    /**
     * @return ID of Azure AppGateway for importing
     * 
     */
    public Optional<String> appGatewayId() {
        return Optional.ofNullable(this.appGatewayId);
    }

    /**
     * Region in which azure cloud function will be provisioned
     * 
     */
    @Import(name="azureFuncRegion", required=true)
    private String azureFuncRegion;

    /**
     * @return Region in which azure cloud function will be provisioned
     * 
     */
    public String azureFuncRegion() {
        return this.azureFuncRegion;
    }

    /**
     * ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
     * 
     */
    @Import(name="certificateId")
    private @Nullable String certificateId;

    /**
     * @return ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
     * 
     */
    public Optional<String> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * Id of the cloud connector
     * 
     */
    @Import(name="cloudConnectorId", required=true)
    private String cloudConnectorId;

    /**
     * @return Id of the cloud connector
     * 
     */
    public String cloudConnectorId() {
        return this.cloudConnectorId;
    }

    @Import(name="deleteCloudResourcesOnDestroy", required=true)
    private Boolean deleteCloudResourcesOnDestroy;

    public Boolean deleteCloudResourcesOnDestroy() {
        return this.deleteCloudResourcesOnDestroy;
    }

    /**
     * ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
     * 
     */
    @Import(name="frontendIp")
    private @Nullable String frontendIp;

    /**
     * @return ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
     * 
     */
    public Optional<String> frontendIp() {
        return Optional.ofNullable(this.frontendIp);
    }

    /**
     * Hostname for the proxy
     * 
     */
    @Import(name="hostName", required=true)
    private String hostName;

    /**
     * @return Hostname for the proxy
     * 
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Name of the proxy
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the proxy
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Region in which cloud resources are hosted
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return Region in which cloud resources are hosted
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * Resource group in which cloud resources are hosted
     * 
     */
    @Import(name="resourceGroup", required=true)
    private String resourceGroup;

    /**
     * @return Resource group in which cloud resources are hosted
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Size of machine used for the gateway
     * 
     */
    @Import(name="skuSize")
    private @Nullable String skuSize;

    /**
     * @return Size of machine used for the gateway
     * 
     */
    public Optional<String> skuSize() {
        return Optional.ofNullable(this.skuSize);
    }

    /**
     * Subnet in which cloud resources are hosted
     * 
     */
    @Import(name="subnetId")
    private @Nullable String subnetId;

    /**
     * @return Subnet in which cloud resources are hosted
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * VPC in which cloud resources are hosted
     * 
     */
    @Import(name="vpc", required=true)
    private String vpc;

    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    private GetAzureGatewayPlainArgs() {}

    private GetAzureGatewayPlainArgs(GetAzureGatewayPlainArgs $) {
        this.appGatewayId = $.appGatewayId;
        this.azureFuncRegion = $.azureFuncRegion;
        this.certificateId = $.certificateId;
        this.cloudConnectorId = $.cloudConnectorId;
        this.deleteCloudResourcesOnDestroy = $.deleteCloudResourcesOnDestroy;
        this.frontendIp = $.frontendIp;
        this.hostName = $.hostName;
        this.name = $.name;
        this.region = $.region;
        this.resourceGroup = $.resourceGroup;
        this.skuSize = $.skuSize;
        this.subnetId = $.subnetId;
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAzureGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAzureGatewayPlainArgs $;

        public Builder() {
            $ = new GetAzureGatewayPlainArgs();
        }

        public Builder(GetAzureGatewayPlainArgs defaults) {
            $ = new GetAzureGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appGatewayId ID of Azure AppGateway for importing
         * 
         * @return builder
         * 
         */
        public Builder appGatewayId(@Nullable String appGatewayId) {
            $.appGatewayId = appGatewayId;
            return this;
        }

        /**
         * @param azureFuncRegion Region in which azure cloud function will be provisioned
         * 
         * @return builder
         * 
         */
        public Builder azureFuncRegion(String azureFuncRegion) {
            $.azureFuncRegion = azureFuncRegion;
            return this;
        }

        /**
         * @param certificateId ID of existing SSL certificate from AppGateway being imported. Required only for SSL based rules
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable String certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param cloudConnectorId Id of the cloud connector
         * 
         * @return builder
         * 
         */
        public Builder cloudConnectorId(String cloudConnectorId) {
            $.cloudConnectorId = cloudConnectorId;
            return this;
        }

        public Builder deleteCloudResourcesOnDestroy(Boolean deleteCloudResourcesOnDestroy) {
            $.deleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            return this;
        }

        /**
         * @param frontendIp ID of IP address to be used. Required only for creating new AppGateway. See https://learn.microsoft.com/en-us/azure/application-gateway/application-gateway-components#static-versus-dynamic-public-ip-address for more details
         * 
         * @return builder
         * 
         */
        public Builder frontendIp(@Nullable String frontendIp) {
            $.frontendIp = frontendIp;
            return this;
        }

        /**
         * @param hostName Hostname for the proxy
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param name Name of the proxy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param region Region in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param resourceGroup Resource group in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param skuSize Size of machine used for the gateway
         * 
         * @return builder
         * 
         */
        public Builder skuSize(@Nullable String skuSize) {
            $.skuSize = skuSize;
            return this;
        }

        /**
         * @param subnetId Subnet in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable String subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param vpc VPC in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder vpc(String vpc) {
            $.vpc = vpc;
            return this;
        }

        public GetAzureGatewayPlainArgs build() {
            if ($.azureFuncRegion == null) {
                throw new MissingRequiredPropertyException("GetAzureGatewayPlainArgs", "azureFuncRegion");
            }
            if ($.cloudConnectorId == null) {
                throw new MissingRequiredPropertyException("GetAzureGatewayPlainArgs", "cloudConnectorId");
            }
            if ($.deleteCloudResourcesOnDestroy == null) {
                throw new MissingRequiredPropertyException("GetAzureGatewayPlainArgs", "deleteCloudResourcesOnDestroy");
            }
            if ($.hostName == null) {
                throw new MissingRequiredPropertyException("GetAzureGatewayPlainArgs", "hostName");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAzureGatewayPlainArgs", "name");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetAzureGatewayPlainArgs", "region");
            }
            if ($.resourceGroup == null) {
                throw new MissingRequiredPropertyException("GetAzureGatewayPlainArgs", "resourceGroup");
            }
            if ($.vpc == null) {
                throw new MissingRequiredPropertyException("GetAzureGatewayPlainArgs", "vpc");
            }
            return $;
        }
    }

}
