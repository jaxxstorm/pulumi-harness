// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.outputs.GetRuleVmDepend;
import com.pulumi.harness.autostopping.outputs.GetRuleVmFilter;
import com.pulumi.harness.autostopping.outputs.GetRuleVmHttp;
import com.pulumi.harness.autostopping.outputs.GetRuleVmTcp;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleVmResult {
    /**
     * @return Id of the cloud connector
     * 
     */
    private String cloudConnectorId;
    /**
     * @return Custom URLs used to access the instances
     * 
     */
    private @Nullable List<String> customDomains;
    /**
     * @return Dependent rules
     * 
     */
    private @Nullable List<GetRuleVmDepend> depends;
    private GetRuleVmFilter filter;
    /**
     * @return Http routing configuration
     * 
     */
    private @Nullable List<GetRuleVmHttp> https;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource
     * 
     */
    private Double identifier;
    /**
     * @return Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
     * 
     */
    private @Nullable Integer idleTimeMins;
    /**
     * @return Name of the rule
     * 
     */
    private String name;
    /**
     * @return TCP routing configuration
     * 
     */
    private @Nullable List<GetRuleVmTcp> tcps;
    /**
     * @return Boolean that indicates whether the selected instances should be converted to spot vm
     * 
     */
    private @Nullable Boolean useSpot;

    private GetRuleVmResult() {}
    /**
     * @return Id of the cloud connector
     * 
     */
    public String cloudConnectorId() {
        return this.cloudConnectorId;
    }
    /**
     * @return Custom URLs used to access the instances
     * 
     */
    public List<String> customDomains() {
        return this.customDomains == null ? List.of() : this.customDomains;
    }
    /**
     * @return Dependent rules
     * 
     */
    public List<GetRuleVmDepend> depends() {
        return this.depends == null ? List.of() : this.depends;
    }
    public GetRuleVmFilter filter() {
        return this.filter;
    }
    /**
     * @return Http routing configuration
     * 
     */
    public List<GetRuleVmHttp> https() {
        return this.https == null ? List.of() : this.https;
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
    public Double identifier() {
        return this.identifier;
    }
    /**
     * @return Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
     * 
     */
    public Optional<Integer> idleTimeMins() {
        return Optional.ofNullable(this.idleTimeMins);
    }
    /**
     * @return Name of the rule
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return TCP routing configuration
     * 
     */
    public List<GetRuleVmTcp> tcps() {
        return this.tcps == null ? List.of() : this.tcps;
    }
    /**
     * @return Boolean that indicates whether the selected instances should be converted to spot vm
     * 
     */
    public Optional<Boolean> useSpot() {
        return Optional.ofNullable(this.useSpot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleVmResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudConnectorId;
        private @Nullable List<String> customDomains;
        private @Nullable List<GetRuleVmDepend> depends;
        private GetRuleVmFilter filter;
        private @Nullable List<GetRuleVmHttp> https;
        private String id;
        private Double identifier;
        private @Nullable Integer idleTimeMins;
        private String name;
        private @Nullable List<GetRuleVmTcp> tcps;
        private @Nullable Boolean useSpot;
        public Builder() {}
        public Builder(GetRuleVmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudConnectorId = defaults.cloudConnectorId;
    	      this.customDomains = defaults.customDomains;
    	      this.depends = defaults.depends;
    	      this.filter = defaults.filter;
    	      this.https = defaults.https;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.idleTimeMins = defaults.idleTimeMins;
    	      this.name = defaults.name;
    	      this.tcps = defaults.tcps;
    	      this.useSpot = defaults.useSpot;
        }

        @CustomType.Setter
        public Builder cloudConnectorId(String cloudConnectorId) {
            if (cloudConnectorId == null) {
              throw new MissingRequiredPropertyException("GetRuleVmResult", "cloudConnectorId");
            }
            this.cloudConnectorId = cloudConnectorId;
            return this;
        }
        @CustomType.Setter
        public Builder customDomains(@Nullable List<String> customDomains) {

            this.customDomains = customDomains;
            return this;
        }
        public Builder customDomains(String... customDomains) {
            return customDomains(List.of(customDomains));
        }
        @CustomType.Setter
        public Builder depends(@Nullable List<GetRuleVmDepend> depends) {

            this.depends = depends;
            return this;
        }
        public Builder depends(GetRuleVmDepend... depends) {
            return depends(List.of(depends));
        }
        @CustomType.Setter
        public Builder filter(GetRuleVmFilter filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("GetRuleVmResult", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder https(@Nullable List<GetRuleVmHttp> https) {

            this.https = https;
            return this;
        }
        public Builder https(GetRuleVmHttp... https) {
            return https(List.of(https));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRuleVmResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(Double identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetRuleVmResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeMins(@Nullable Integer idleTimeMins) {

            this.idleTimeMins = idleTimeMins;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRuleVmResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tcps(@Nullable List<GetRuleVmTcp> tcps) {

            this.tcps = tcps;
            return this;
        }
        public Builder tcps(GetRuleVmTcp... tcps) {
            return tcps(List.of(tcps));
        }
        @CustomType.Setter
        public Builder useSpot(@Nullable Boolean useSpot) {

            this.useSpot = useSpot;
            return this;
        }
        public GetRuleVmResult build() {
            final var _resultValue = new GetRuleVmResult();
            _resultValue.cloudConnectorId = cloudConnectorId;
            _resultValue.customDomains = customDomains;
            _resultValue.depends = depends;
            _resultValue.filter = filter;
            _resultValue.https = https;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.idleTimeMins = idleTimeMins;
            _resultValue.name = name;
            _resultValue.tcps = tcps;
            _resultValue.useSpot = useSpot;
            return _resultValue;
        }
    }
}
