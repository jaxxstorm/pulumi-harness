// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.autostopping.inputs.GcpProxyCertificatesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpProxyState extends com.pulumi.resources.ResourceArgs {

    public static final GcpProxyState Empty = new GcpProxyState();

    /**
     * Boolean value to indicate if proxy vm needs to have static IP
     * 
     */
    @Import(name="allocateStaticIp")
    private @Nullable Output<Boolean> allocateStaticIp;

    /**
     * @return Boolean value to indicate if proxy vm needs to have static IP
     * 
     */
    public Optional<Output<Boolean>> allocateStaticIp() {
        return Optional.ofNullable(this.allocateStaticIp);
    }

    /**
     * Harness NG API key
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return Harness NG API key
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    @Import(name="certificates")
    private @Nullable Output<GcpProxyCertificatesArgs> certificates;

    public Optional<Output<GcpProxyCertificatesArgs>> certificates() {
        return Optional.ofNullable(this.certificates);
    }

    /**
     * Id of the cloud connector
     * 
     */
    @Import(name="cloudConnectorId")
    private @Nullable Output<String> cloudConnectorId;

    /**
     * @return Id of the cloud connector
     * 
     */
    public Optional<Output<String>> cloudConnectorId() {
        return Optional.ofNullable(this.cloudConnectorId);
    }

    @Import(name="deleteCloudResourcesOnDestroy")
    private @Nullable Output<Boolean> deleteCloudResourcesOnDestroy;

    public Optional<Output<Boolean>> deleteCloudResourcesOnDestroy() {
        return Optional.ofNullable(this.deleteCloudResourcesOnDestroy);
    }

    /**
     * Hostname for the proxy
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return Hostname for the proxy
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * Unique identifier of the resource
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier of the resource
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Machine instance type
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return Machine instance type
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * Name of the proxy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the proxy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Region in which cloud resources are hosted
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region in which cloud resources are hosted
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Security Group to define the security rules that determine the inbound and outbound traffic
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return Security Group to define the security rules that determine the inbound and outbound traffic
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * VPC in which cloud resources are hosted
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * VPC in which cloud resources are hosted
     * 
     */
    @Import(name="vpc")
    private @Nullable Output<String> vpc;

    /**
     * @return VPC in which cloud resources are hosted
     * 
     */
    public Optional<Output<String>> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    /**
     * Zone in which cloud resources are hosted
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return Zone in which cloud resources are hosted
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GcpProxyState() {}

    private GcpProxyState(GcpProxyState $) {
        this.allocateStaticIp = $.allocateStaticIp;
        this.apiKey = $.apiKey;
        this.certificates = $.certificates;
        this.cloudConnectorId = $.cloudConnectorId;
        this.deleteCloudResourcesOnDestroy = $.deleteCloudResourcesOnDestroy;
        this.hostName = $.hostName;
        this.identifier = $.identifier;
        this.machineType = $.machineType;
        this.name = $.name;
        this.region = $.region;
        this.securityGroups = $.securityGroups;
        this.subnetId = $.subnetId;
        this.vpc = $.vpc;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpProxyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpProxyState $;

        public Builder() {
            $ = new GcpProxyState();
        }

        public Builder(GcpProxyState defaults) {
            $ = new GcpProxyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocateStaticIp Boolean value to indicate if proxy vm needs to have static IP
         * 
         * @return builder
         * 
         */
        public Builder allocateStaticIp(@Nullable Output<Boolean> allocateStaticIp) {
            $.allocateStaticIp = allocateStaticIp;
            return this;
        }

        /**
         * @param allocateStaticIp Boolean value to indicate if proxy vm needs to have static IP
         * 
         * @return builder
         * 
         */
        public Builder allocateStaticIp(Boolean allocateStaticIp) {
            return allocateStaticIp(Output.of(allocateStaticIp));
        }

        /**
         * @param apiKey Harness NG API key
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey Harness NG API key
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        public Builder certificates(@Nullable Output<GcpProxyCertificatesArgs> certificates) {
            $.certificates = certificates;
            return this;
        }

        public Builder certificates(GcpProxyCertificatesArgs certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param cloudConnectorId Id of the cloud connector
         * 
         * @return builder
         * 
         */
        public Builder cloudConnectorId(@Nullable Output<String> cloudConnectorId) {
            $.cloudConnectorId = cloudConnectorId;
            return this;
        }

        /**
         * @param cloudConnectorId Id of the cloud connector
         * 
         * @return builder
         * 
         */
        public Builder cloudConnectorId(String cloudConnectorId) {
            return cloudConnectorId(Output.of(cloudConnectorId));
        }

        public Builder deleteCloudResourcesOnDestroy(@Nullable Output<Boolean> deleteCloudResourcesOnDestroy) {
            $.deleteCloudResourcesOnDestroy = deleteCloudResourcesOnDestroy;
            return this;
        }

        public Builder deleteCloudResourcesOnDestroy(Boolean deleteCloudResourcesOnDestroy) {
            return deleteCloudResourcesOnDestroy(Output.of(deleteCloudResourcesOnDestroy));
        }

        /**
         * @param hostName Hostname for the proxy
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Hostname for the proxy
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param machineType Machine instance type
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Machine instance type
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param name Name of the proxy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the proxy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region Region in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param securityGroups Security Group to define the security rules that determine the inbound and outbound traffic
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups Security Group to define the security rules that determine the inbound and outbound traffic
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups Security Group to define the security rules that determine the inbound and outbound traffic
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param subnetId VPC in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId VPC in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param vpc VPC in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder vpc(@Nullable Output<String> vpc) {
            $.vpc = vpc;
            return this;
        }

        /**
         * @param vpc VPC in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder vpc(String vpc) {
            return vpc(Output.of(vpc));
        }

        /**
         * @param zone Zone in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone Zone in which cloud resources are hosted
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GcpProxyState build() {
            return $;
        }
    }

}
