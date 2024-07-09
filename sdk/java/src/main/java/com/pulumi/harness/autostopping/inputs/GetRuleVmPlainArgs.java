// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.inputs.GetRuleVmDepend;
import com.pulumi.harness.autostopping.inputs.GetRuleVmFilter;
import com.pulumi.harness.autostopping.inputs.GetRuleVmHttp;
import com.pulumi.harness.autostopping.inputs.GetRuleVmTcp;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuleVmPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleVmPlainArgs Empty = new GetRuleVmPlainArgs();

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

    /**
     * Custom URLs used to access the instances
     * 
     */
    @Import(name="customDomains")
    private @Nullable List<String> customDomains;

    /**
     * @return Custom URLs used to access the instances
     * 
     */
    public Optional<List<String>> customDomains() {
        return Optional.ofNullable(this.customDomains);
    }

    /**
     * Dependent rules
     * 
     */
    @Import(name="depends")
    private @Nullable List<GetRuleVmDepend> depends;

    /**
     * @return Dependent rules
     * 
     */
    public Optional<List<GetRuleVmDepend>> depends() {
        return Optional.ofNullable(this.depends);
    }

    @Import(name="filter", required=true)
    private GetRuleVmFilter filter;

    public GetRuleVmFilter filter() {
        return this.filter;
    }

    /**
     * Http routing configuration
     * 
     */
    @Import(name="https")
    private @Nullable List<GetRuleVmHttp> https;

    /**
     * @return Http routing configuration
     * 
     */
    public Optional<List<GetRuleVmHttp>> https() {
        return Optional.ofNullable(this.https);
    }

    /**
     * Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
     * 
     */
    @Import(name="idleTimeMins")
    private @Nullable Integer idleTimeMins;

    /**
     * @return Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
     * 
     */
    public Optional<Integer> idleTimeMins() {
        return Optional.ofNullable(this.idleTimeMins);
    }

    /**
     * Name of the rule
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the rule
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * TCP routing configuration
     * 
     */
    @Import(name="tcps")
    private @Nullable List<GetRuleVmTcp> tcps;

    /**
     * @return TCP routing configuration
     * 
     */
    public Optional<List<GetRuleVmTcp>> tcps() {
        return Optional.ofNullable(this.tcps);
    }

    /**
     * Boolean that indicates whether the selected instances should be converted to spot vm
     * 
     */
    @Import(name="useSpot")
    private @Nullable Boolean useSpot;

    /**
     * @return Boolean that indicates whether the selected instances should be converted to spot vm
     * 
     */
    public Optional<Boolean> useSpot() {
        return Optional.ofNullable(this.useSpot);
    }

    private GetRuleVmPlainArgs() {}

    private GetRuleVmPlainArgs(GetRuleVmPlainArgs $) {
        this.cloudConnectorId = $.cloudConnectorId;
        this.customDomains = $.customDomains;
        this.depends = $.depends;
        this.filter = $.filter;
        this.https = $.https;
        this.idleTimeMins = $.idleTimeMins;
        this.name = $.name;
        this.tcps = $.tcps;
        this.useSpot = $.useSpot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleVmPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleVmPlainArgs $;

        public Builder() {
            $ = new GetRuleVmPlainArgs();
        }

        public Builder(GetRuleVmPlainArgs defaults) {
            $ = new GetRuleVmPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param customDomains Custom URLs used to access the instances
         * 
         * @return builder
         * 
         */
        public Builder customDomains(@Nullable List<String> customDomains) {
            $.customDomains = customDomains;
            return this;
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
        public Builder depends(@Nullable List<GetRuleVmDepend> depends) {
            $.depends = depends;
            return this;
        }

        /**
         * @param depends Dependent rules
         * 
         * @return builder
         * 
         */
        public Builder depends(GetRuleVmDepend... depends) {
            return depends(List.of(depends));
        }

        public Builder filter(GetRuleVmFilter filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param https Http routing configuration
         * 
         * @return builder
         * 
         */
        public Builder https(@Nullable List<GetRuleVmHttp> https) {
            $.https = https;
            return this;
        }

        /**
         * @param https Http routing configuration
         * 
         * @return builder
         * 
         */
        public Builder https(GetRuleVmHttp... https) {
            return https(List.of(https));
        }

        /**
         * @param idleTimeMins Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeMins(@Nullable Integer idleTimeMins) {
            $.idleTimeMins = idleTimeMins;
            return this;
        }

        /**
         * @param name Name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tcps TCP routing configuration
         * 
         * @return builder
         * 
         */
        public Builder tcps(@Nullable List<GetRuleVmTcp> tcps) {
            $.tcps = tcps;
            return this;
        }

        /**
         * @param tcps TCP routing configuration
         * 
         * @return builder
         * 
         */
        public Builder tcps(GetRuleVmTcp... tcps) {
            return tcps(List.of(tcps));
        }

        /**
         * @param useSpot Boolean that indicates whether the selected instances should be converted to spot vm
         * 
         * @return builder
         * 
         */
        public Builder useSpot(@Nullable Boolean useSpot) {
            $.useSpot = useSpot;
            return this;
        }

        public GetRuleVmPlainArgs build() {
            if ($.cloudConnectorId == null) {
                throw new MissingRequiredPropertyException("GetRuleVmPlainArgs", "cloudConnectorId");
            }
            if ($.filter == null) {
                throw new MissingRequiredPropertyException("GetRuleVmPlainArgs", "filter");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetRuleVmPlainArgs", "name");
            }
            return $;
        }
    }

}
