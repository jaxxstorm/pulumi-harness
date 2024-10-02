// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.governance.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRuleResult {
    /**
     * @return The cloud provider for the rule.
     * 
     */
    private String cloudProvider;
    /**
     * @return Description for rule.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Name of the rule.
     * 
     */
    private String name;
    /**
     * @return Id of rule.
     * 
     */
    private String ruleId;
    /**
     * @return Policy YAML of the rule.
     * 
     */
    private String rulesYaml;

    private GetRuleResult() {}
    /**
     * @return The cloud provider for the rule.
     * 
     */
    public String cloudProvider() {
        return this.cloudProvider;
    }
    /**
     * @return Description for rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Id of rule.
     * 
     */
    public String ruleId() {
        return this.ruleId;
    }
    /**
     * @return Policy YAML of the rule.
     * 
     */
    public String rulesYaml() {
        return this.rulesYaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProvider;
        private String description;
        private String id;
        private String name;
        private String ruleId;
        private String rulesYaml;
        public Builder() {}
        public Builder(GetRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.ruleId = defaults.ruleId;
    	      this.rulesYaml = defaults.rulesYaml;
        }

        @CustomType.Setter
        public Builder cloudProvider(String cloudProvider) {
            if (cloudProvider == null) {
              throw new MissingRequiredPropertyException("GetRuleResult", "cloudProvider");
            }
            this.cloudProvider = cloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRuleResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRuleResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRuleResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(String ruleId) {
            if (ruleId == null) {
              throw new MissingRequiredPropertyException("GetRuleResult", "ruleId");
            }
            this.ruleId = ruleId;
            return this;
        }
        @CustomType.Setter
        public Builder rulesYaml(String rulesYaml) {
            if (rulesYaml == null) {
              throw new MissingRequiredPropertyException("GetRuleResult", "rulesYaml");
            }
            this.rulesYaml = rulesYaml;
            return this;
        }
        public GetRuleResult build() {
            final var _resultValue = new GetRuleResult();
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.ruleId = ruleId;
            _resultValue.rulesYaml = rulesYaml;
            return _resultValue;
        }
    }
}
