// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.outputs.GetRuleEcsContainer;
import com.pulumi.harness.autostopping.outputs.GetRuleEcsDepend;
import com.pulumi.harness.autostopping.outputs.GetRuleEcsHttp;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleEcsResult {
    /**
     * @return Id of the cloud connector
     * 
     */
    private String cloudConnectorId;
    private @Nullable GetRuleEcsContainer container;
    /**
     * @return Custom URLs used to access the instances
     * 
     */
    private @Nullable List<String> customDomains;
    /**
     * @return Dependent rules
     * 
     */
    private @Nullable List<GetRuleEcsDepend> depends;
    /**
     * @return Http routing configuration
     * 
     */
    private @Nullable List<GetRuleEcsHttp> https;
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

    private GetRuleEcsResult() {}
    /**
     * @return Id of the cloud connector
     * 
     */
    public String cloudConnectorId() {
        return this.cloudConnectorId;
    }
    public Optional<GetRuleEcsContainer> container() {
        return Optional.ofNullable(this.container);
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
    public List<GetRuleEcsDepend> depends() {
        return this.depends == null ? List.of() : this.depends;
    }
    /**
     * @return Http routing configuration
     * 
     */
    public List<GetRuleEcsHttp> https() {
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleEcsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudConnectorId;
        private @Nullable GetRuleEcsContainer container;
        private @Nullable List<String> customDomains;
        private @Nullable List<GetRuleEcsDepend> depends;
        private @Nullable List<GetRuleEcsHttp> https;
        private String id;
        private Double identifier;
        private @Nullable Integer idleTimeMins;
        private String name;
        public Builder() {}
        public Builder(GetRuleEcsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudConnectorId = defaults.cloudConnectorId;
    	      this.container = defaults.container;
    	      this.customDomains = defaults.customDomains;
    	      this.depends = defaults.depends;
    	      this.https = defaults.https;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.idleTimeMins = defaults.idleTimeMins;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder cloudConnectorId(String cloudConnectorId) {
            if (cloudConnectorId == null) {
              throw new MissingRequiredPropertyException("GetRuleEcsResult", "cloudConnectorId");
            }
            this.cloudConnectorId = cloudConnectorId;
            return this;
        }
        @CustomType.Setter
        public Builder container(@Nullable GetRuleEcsContainer container) {

            this.container = container;
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
        public Builder depends(@Nullable List<GetRuleEcsDepend> depends) {

            this.depends = depends;
            return this;
        }
        public Builder depends(GetRuleEcsDepend... depends) {
            return depends(List.of(depends));
        }
        @CustomType.Setter
        public Builder https(@Nullable List<GetRuleEcsHttp> https) {

            this.https = https;
            return this;
        }
        public Builder https(GetRuleEcsHttp... https) {
            return https(List.of(https));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRuleEcsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(Double identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetRuleEcsResult", "identifier");
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
              throw new MissingRequiredPropertyException("GetRuleEcsResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetRuleEcsResult build() {
            final var _resultValue = new GetRuleEcsResult();
            _resultValue.cloudConnectorId = cloudConnectorId;
            _resultValue.container = container;
            _resultValue.customDomains = customDomains;
            _resultValue.depends = depends;
            _resultValue.https = https;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.idleTimeMins = idleTimeMins;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
