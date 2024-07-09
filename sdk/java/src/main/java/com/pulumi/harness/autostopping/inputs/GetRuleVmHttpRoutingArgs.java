// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuleVmHttpRoutingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRuleVmHttpRoutingArgs Empty = new GetRuleVmHttpRoutingArgs();

    /**
     * Organization Identifier for the Entity
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Organization Identifier for the Entity
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Port on the proxy
     * 
     */
    @Import(name="sourcePort")
    private @Nullable Output<Integer> sourcePort;

    /**
     * @return Port on the proxy
     * 
     */
    public Optional<Output<Integer>> sourcePort() {
        return Optional.ofNullable(this.sourcePort);
    }

    /**
     * Source protocol of the proxy can be http or https
     * 
     */
    @Import(name="sourceProtocol", required=true)
    private Output<String> sourceProtocol;

    /**
     * @return Source protocol of the proxy can be http or https
     * 
     */
    public Output<String> sourceProtocol() {
        return this.sourceProtocol;
    }

    /**
     * Port on the VM
     * 
     */
    @Import(name="targetPort")
    private @Nullable Output<Integer> targetPort;

    /**
     * @return Port on the VM
     * 
     */
    public Optional<Output<Integer>> targetPort() {
        return Optional.ofNullable(this.targetPort);
    }

    /**
     * Target protocol of the instance can be http or https
     * 
     */
    @Import(name="targetProtocol", required=true)
    private Output<String> targetProtocol;

    /**
     * @return Target protocol of the instance can be http or https
     * 
     */
    public Output<String> targetProtocol() {
        return this.targetProtocol;
    }

    private GetRuleVmHttpRoutingArgs() {}

    private GetRuleVmHttpRoutingArgs(GetRuleVmHttpRoutingArgs $) {
        this.action = $.action;
        this.sourcePort = $.sourcePort;
        this.sourceProtocol = $.sourceProtocol;
        this.targetPort = $.targetPort;
        this.targetProtocol = $.targetProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleVmHttpRoutingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleVmHttpRoutingArgs $;

        public Builder() {
            $ = new GetRuleVmHttpRoutingArgs();
        }

        public Builder(GetRuleVmHttpRoutingArgs defaults) {
            $ = new GetRuleVmHttpRoutingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param sourcePort Port on the proxy
         * 
         * @return builder
         * 
         */
        public Builder sourcePort(@Nullable Output<Integer> sourcePort) {
            $.sourcePort = sourcePort;
            return this;
        }

        /**
         * @param sourcePort Port on the proxy
         * 
         * @return builder
         * 
         */
        public Builder sourcePort(Integer sourcePort) {
            return sourcePort(Output.of(sourcePort));
        }

        /**
         * @param sourceProtocol Source protocol of the proxy can be http or https
         * 
         * @return builder
         * 
         */
        public Builder sourceProtocol(Output<String> sourceProtocol) {
            $.sourceProtocol = sourceProtocol;
            return this;
        }

        /**
         * @param sourceProtocol Source protocol of the proxy can be http or https
         * 
         * @return builder
         * 
         */
        public Builder sourceProtocol(String sourceProtocol) {
            return sourceProtocol(Output.of(sourceProtocol));
        }

        /**
         * @param targetPort Port on the VM
         * 
         * @return builder
         * 
         */
        public Builder targetPort(@Nullable Output<Integer> targetPort) {
            $.targetPort = targetPort;
            return this;
        }

        /**
         * @param targetPort Port on the VM
         * 
         * @return builder
         * 
         */
        public Builder targetPort(Integer targetPort) {
            return targetPort(Output.of(targetPort));
        }

        /**
         * @param targetProtocol Target protocol of the instance can be http or https
         * 
         * @return builder
         * 
         */
        public Builder targetProtocol(Output<String> targetProtocol) {
            $.targetProtocol = targetProtocol;
            return this;
        }

        /**
         * @param targetProtocol Target protocol of the instance can be http or https
         * 
         * @return builder
         * 
         */
        public Builder targetProtocol(String targetProtocol) {
            return targetProtocol(Output.of(targetProtocol));
        }

        public GetRuleVmHttpRoutingArgs build() {
            if ($.sourceProtocol == null) {
                throw new MissingRequiredPropertyException("GetRuleVmHttpRoutingArgs", "sourceProtocol");
            }
            if ($.targetProtocol == null) {
                throw new MissingRequiredPropertyException("GetRuleVmHttpRoutingArgs", "targetProtocol");
            }
            return $;
        }
    }

}
