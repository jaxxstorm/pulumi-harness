// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InfrastructureDefinitionAwsWinrmArgs extends com.pulumi.resources.ResourceArgs {

    public static final InfrastructureDefinitionAwsWinrmArgs Empty = new InfrastructureDefinitionAwsWinrmArgs();

    /**
     * The name of the autoscaling group.
     * 
     */
    @Import(name="autoscalingGroupName", required=true)
    private Output<String> autoscalingGroupName;

    /**
     * @return The name of the autoscaling group.
     * 
     */
    public Output<String> autoscalingGroupName() {
        return this.autoscalingGroupName;
    }

    /**
     * The name of the cloud provider to connect with.
     * 
     */
    @Import(name="cloudProviderName", required=true)
    private Output<String> cloudProviderName;

    /**
     * @return The name of the cloud provider to connect with.
     * 
     */
    public Output<String> cloudProviderName() {
        return this.cloudProviderName;
    }

    /**
     * The desired capacity of the autoscaling group.
     * 
     */
    @Import(name="desiredCapacity")
    private @Nullable Output<Integer> desiredCapacity;

    /**
     * @return The desired capacity of the autoscaling group.
     * 
     */
    public Optional<Output<Integer>> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }

    /**
     * The name of the host connection attributes to use.
     * 
     */
    @Import(name="hostConnectionAttrsName", required=true)
    private Output<String> hostConnectionAttrsName;

    /**
     * @return The name of the host connection attributes to use.
     * 
     */
    public Output<String> hostConnectionAttrsName() {
        return this.hostConnectionAttrsName;
    }

    /**
     * The type of host connection to use. Valid options are PRIVATE*DNS, PUBLIC*DNS, PRIVATE*IP, PUBLIC*IP
     * 
     */
    @Import(name="hostConnectionType", required=true)
    private Output<String> hostConnectionType;

    /**
     * @return The type of host connection to use. Valid options are PRIVATE*DNS, PUBLIC*DNS, PRIVATE*IP, PUBLIC*IP
     * 
     */
    public Output<String> hostConnectionType() {
        return this.hostConnectionType;
    }

    /**
     * The naming convention to use for the hostname. Defaults to ${host.ec2Instance.privateDnsName.split(&#39;.&#39;)[0]}
     * 
     */
    @Import(name="hostnameConvention")
    private @Nullable Output<String> hostnameConvention;

    /**
     * @return The naming convention to use for the hostname. Defaults to ${host.ec2Instance.privateDnsName.split(&#39;.&#39;)[0]}
     * 
     */
    public Optional<Output<String>> hostnameConvention() {
        return Optional.ofNullable(this.hostnameConvention);
    }

    /**
     * The name of the load balancer to use.
     * 
     */
    @Import(name="loadbalancerName")
    private @Nullable Output<String> loadbalancerName;

    /**
     * @return The name of the load balancer to use.
     * 
     */
    public Optional<Output<String>> loadbalancerName() {
        return Optional.ofNullable(this.loadbalancerName);
    }

    /**
     * The region to deploy to.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region to deploy to.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private InfrastructureDefinitionAwsWinrmArgs() {}

    private InfrastructureDefinitionAwsWinrmArgs(InfrastructureDefinitionAwsWinrmArgs $) {
        this.autoscalingGroupName = $.autoscalingGroupName;
        this.cloudProviderName = $.cloudProviderName;
        this.desiredCapacity = $.desiredCapacity;
        this.hostConnectionAttrsName = $.hostConnectionAttrsName;
        this.hostConnectionType = $.hostConnectionType;
        this.hostnameConvention = $.hostnameConvention;
        this.loadbalancerName = $.loadbalancerName;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfrastructureDefinitionAwsWinrmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfrastructureDefinitionAwsWinrmArgs $;

        public Builder() {
            $ = new InfrastructureDefinitionAwsWinrmArgs();
        }

        public Builder(InfrastructureDefinitionAwsWinrmArgs defaults) {
            $ = new InfrastructureDefinitionAwsWinrmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingGroupName The name of the autoscaling group.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingGroupName(Output<String> autoscalingGroupName) {
            $.autoscalingGroupName = autoscalingGroupName;
            return this;
        }

        /**
         * @param autoscalingGroupName The name of the autoscaling group.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingGroupName(String autoscalingGroupName) {
            return autoscalingGroupName(Output.of(autoscalingGroupName));
        }

        /**
         * @param cloudProviderName The name of the cloud provider to connect with.
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderName(Output<String> cloudProviderName) {
            $.cloudProviderName = cloudProviderName;
            return this;
        }

        /**
         * @param cloudProviderName The name of the cloud provider to connect with.
         * 
         * @return builder
         * 
         */
        public Builder cloudProviderName(String cloudProviderName) {
            return cloudProviderName(Output.of(cloudProviderName));
        }

        /**
         * @param desiredCapacity The desired capacity of the autoscaling group.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(@Nullable Output<Integer> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * @param desiredCapacity The desired capacity of the autoscaling group.
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        /**
         * @param hostConnectionAttrsName The name of the host connection attributes to use.
         * 
         * @return builder
         * 
         */
        public Builder hostConnectionAttrsName(Output<String> hostConnectionAttrsName) {
            $.hostConnectionAttrsName = hostConnectionAttrsName;
            return this;
        }

        /**
         * @param hostConnectionAttrsName The name of the host connection attributes to use.
         * 
         * @return builder
         * 
         */
        public Builder hostConnectionAttrsName(String hostConnectionAttrsName) {
            return hostConnectionAttrsName(Output.of(hostConnectionAttrsName));
        }

        /**
         * @param hostConnectionType The type of host connection to use. Valid options are PRIVATE*DNS, PUBLIC*DNS, PRIVATE*IP, PUBLIC*IP
         * 
         * @return builder
         * 
         */
        public Builder hostConnectionType(Output<String> hostConnectionType) {
            $.hostConnectionType = hostConnectionType;
            return this;
        }

        /**
         * @param hostConnectionType The type of host connection to use. Valid options are PRIVATE*DNS, PUBLIC*DNS, PRIVATE*IP, PUBLIC*IP
         * 
         * @return builder
         * 
         */
        public Builder hostConnectionType(String hostConnectionType) {
            return hostConnectionType(Output.of(hostConnectionType));
        }

        /**
         * @param hostnameConvention The naming convention to use for the hostname. Defaults to ${host.ec2Instance.privateDnsName.split(&#39;.&#39;)[0]}
         * 
         * @return builder
         * 
         */
        public Builder hostnameConvention(@Nullable Output<String> hostnameConvention) {
            $.hostnameConvention = hostnameConvention;
            return this;
        }

        /**
         * @param hostnameConvention The naming convention to use for the hostname. Defaults to ${host.ec2Instance.privateDnsName.split(&#39;.&#39;)[0]}
         * 
         * @return builder
         * 
         */
        public Builder hostnameConvention(String hostnameConvention) {
            return hostnameConvention(Output.of(hostnameConvention));
        }

        /**
         * @param loadbalancerName The name of the load balancer to use.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerName(@Nullable Output<String> loadbalancerName) {
            $.loadbalancerName = loadbalancerName;
            return this;
        }

        /**
         * @param loadbalancerName The name of the load balancer to use.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerName(String loadbalancerName) {
            return loadbalancerName(Output.of(loadbalancerName));
        }

        /**
         * @param region The region to deploy to.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region to deploy to.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public InfrastructureDefinitionAwsWinrmArgs build() {
            if ($.autoscalingGroupName == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrmArgs", "autoscalingGroupName");
            }
            if ($.cloudProviderName == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrmArgs", "cloudProviderName");
            }
            if ($.hostConnectionAttrsName == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrmArgs", "hostConnectionAttrsName");
            }
            if ($.hostConnectionType == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrmArgs", "hostConnectionType");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("InfrastructureDefinitionAwsWinrmArgs", "region");
            }
            return $;
        }
    }

}
