// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.autostopping.inputs.RuleVmDependArgs;
import com.pulumi.harness.autostopping.inputs.RuleVmFilterArgs;
import com.pulumi.harness.autostopping.inputs.RuleVmHttpArgs;
import com.pulumi.harness.autostopping.inputs.RuleVmTcpArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleVmState extends com.pulumi.resources.ResourceArgs {

    public static final RuleVmState Empty = new RuleVmState();

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

    /**
     * Custom URLs used to access the instances
     * 
     */
    @Import(name="customDomains")
    private @Nullable Output<List<String>> customDomains;

    /**
     * @return Custom URLs used to access the instances
     * 
     */
    public Optional<Output<List<String>>> customDomains() {
        return Optional.ofNullable(this.customDomains);
    }

    /**
     * Dependent rules
     * 
     */
    @Import(name="depends")
    private @Nullable Output<List<RuleVmDependArgs>> depends;

    /**
     * @return Dependent rules
     * 
     */
    public Optional<Output<List<RuleVmDependArgs>>> depends() {
        return Optional.ofNullable(this.depends);
    }

    @Import(name="filter")
    private @Nullable Output<RuleVmFilterArgs> filter;

    public Optional<Output<RuleVmFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Http routing configuration
     * 
     */
    @Import(name="https")
    private @Nullable Output<List<RuleVmHttpArgs>> https;

    /**
     * @return Http routing configuration
     * 
     */
    public Optional<Output<List<RuleVmHttpArgs>>> https() {
        return Optional.ofNullable(this.https);
    }

    /**
     * Unique identifier of the resource
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<Double> identifier;

    /**
     * @return Unique identifier of the resource
     * 
     */
    public Optional<Output<Double>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
     * 
     */
    @Import(name="idleTimeMins")
    private @Nullable Output<Integer> idleTimeMins;

    /**
     * @return Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
     * 
     */
    public Optional<Output<Integer>> idleTimeMins() {
        return Optional.ofNullable(this.idleTimeMins);
    }

    /**
     * Name of the rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the rule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * TCP routing configuration
     * 
     */
    @Import(name="tcps")
    private @Nullable Output<List<RuleVmTcpArgs>> tcps;

    /**
     * @return TCP routing configuration
     * 
     */
    public Optional<Output<List<RuleVmTcpArgs>>> tcps() {
        return Optional.ofNullable(this.tcps);
    }

    /**
     * Boolean that indicates whether the selected instances should be converted to spot vm
     * 
     */
    @Import(name="useSpot")
    private @Nullable Output<Boolean> useSpot;

    /**
     * @return Boolean that indicates whether the selected instances should be converted to spot vm
     * 
     */
    public Optional<Output<Boolean>> useSpot() {
        return Optional.ofNullable(this.useSpot);
    }

    private RuleVmState() {}

    private RuleVmState(RuleVmState $) {
        this.cloudConnectorId = $.cloudConnectorId;
        this.customDomains = $.customDomains;
        this.depends = $.depends;
        this.filter = $.filter;
        this.https = $.https;
        this.identifier = $.identifier;
        this.idleTimeMins = $.idleTimeMins;
        this.name = $.name;
        this.tcps = $.tcps;
        this.useSpot = $.useSpot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleVmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleVmState $;

        public Builder() {
            $ = new RuleVmState();
        }

        public Builder(RuleVmState defaults) {
            $ = new RuleVmState(Objects.requireNonNull(defaults));
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

        /**
         * @param customDomains Custom URLs used to access the instances
         * 
         * @return builder
         * 
         */
        public Builder customDomains(@Nullable Output<List<String>> customDomains) {
            $.customDomains = customDomains;
            return this;
        }

        /**
         * @param customDomains Custom URLs used to access the instances
         * 
         * @return builder
         * 
         */
        public Builder customDomains(List<String> customDomains) {
            return customDomains(Output.of(customDomains));
        }

        /**
         * @param customDomains Custom URLs used to access the instances
         * 
         * @return builder
         * 
         */
        public Builder customDomains(String... customDomains) {
            return customDomains(List.of(customDomains));
        }

        /**
         * @param depends Dependent rules
         * 
         * @return builder
         * 
         */
        public Builder depends(@Nullable Output<List<RuleVmDependArgs>> depends) {
            $.depends = depends;
            return this;
        }

        /**
         * @param depends Dependent rules
         * 
         * @return builder
         * 
         */
        public Builder depends(List<RuleVmDependArgs> depends) {
            return depends(Output.of(depends));
        }

        /**
         * @param depends Dependent rules
         * 
         * @return builder
         * 
         */
        public Builder depends(RuleVmDependArgs... depends) {
            return depends(List.of(depends));
        }

        public Builder filter(@Nullable Output<RuleVmFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(RuleVmFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param https Http routing configuration
         * 
         * @return builder
         * 
         */
        public Builder https(@Nullable Output<List<RuleVmHttpArgs>> https) {
            $.https = https;
            return this;
        }

        /**
         * @param https Http routing configuration
         * 
         * @return builder
         * 
         */
        public Builder https(List<RuleVmHttpArgs> https) {
            return https(Output.of(https));
        }

        /**
         * @param https Http routing configuration
         * 
         * @return builder
         * 
         */
        public Builder https(RuleVmHttpArgs... https) {
            return https(List.of(https));
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<Double> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(Double identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param idleTimeMins Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeMins(@Nullable Output<Integer> idleTimeMins) {
            $.idleTimeMins = idleTimeMins;
            return this;
        }

        /**
         * @param idleTimeMins Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeMins(Integer idleTimeMins) {
            return idleTimeMins(Output.of(idleTimeMins));
        }

        /**
         * @param name Name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tcps TCP routing configuration
         * 
         * @return builder
         * 
         */
        public Builder tcps(@Nullable Output<List<RuleVmTcpArgs>> tcps) {
            $.tcps = tcps;
            return this;
        }

        /**
         * @param tcps TCP routing configuration
         * 
         * @return builder
         * 
         */
        public Builder tcps(List<RuleVmTcpArgs> tcps) {
            return tcps(Output.of(tcps));
        }

        /**
         * @param tcps TCP routing configuration
         * 
         * @return builder
         * 
         */
        public Builder tcps(RuleVmTcpArgs... tcps) {
            return tcps(List.of(tcps));
        }

        /**
         * @param useSpot Boolean that indicates whether the selected instances should be converted to spot vm
         * 
         * @return builder
         * 
         */
        public Builder useSpot(@Nullable Output<Boolean> useSpot) {
            $.useSpot = useSpot;
            return this;
        }

        /**
         * @param useSpot Boolean that indicates whether the selected instances should be converted to spot vm
         * 
         * @return builder
         * 
         */
        public Builder useSpot(Boolean useSpot) {
            return useSpot(Output.of(useSpot));
        }

        public RuleVmState build() {
            return $;
        }
    }

}
