// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.outputs.RuleVmHttpHealth;
import com.pulumi.harness.autostopping.outputs.RuleVmHttpRouting;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RuleVmHttp {
    /**
     * @return Health Check Details
     * 
     */
    private @Nullable List<RuleVmHttpHealth> healths;
    /**
     * @return Id of the proxy
     * 
     */
    private String proxyId;
    /**
     * @return Routing configuration used to access the instances
     * 
     */
    private @Nullable List<RuleVmHttpRouting> routings;

    private RuleVmHttp() {}
    /**
     * @return Health Check Details
     * 
     */
    public List<RuleVmHttpHealth> healths() {
        return this.healths == null ? List.of() : this.healths;
    }
    /**
     * @return Id of the proxy
     * 
     */
    public String proxyId() {
        return this.proxyId;
    }
    /**
     * @return Routing configuration used to access the instances
     * 
     */
    public List<RuleVmHttpRouting> routings() {
        return this.routings == null ? List.of() : this.routings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleVmHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RuleVmHttpHealth> healths;
        private String proxyId;
        private @Nullable List<RuleVmHttpRouting> routings;
        public Builder() {}
        public Builder(RuleVmHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healths = defaults.healths;
    	      this.proxyId = defaults.proxyId;
    	      this.routings = defaults.routings;
        }

        @CustomType.Setter
        public Builder healths(@Nullable List<RuleVmHttpHealth> healths) {

            this.healths = healths;
            return this;
        }
        public Builder healths(RuleVmHttpHealth... healths) {
            return healths(List.of(healths));
        }
        @CustomType.Setter
        public Builder proxyId(String proxyId) {
            if (proxyId == null) {
              throw new MissingRequiredPropertyException("RuleVmHttp", "proxyId");
            }
            this.proxyId = proxyId;
            return this;
        }
        @CustomType.Setter
        public Builder routings(@Nullable List<RuleVmHttpRouting> routings) {

            this.routings = routings;
            return this;
        }
        public Builder routings(RuleVmHttpRouting... routings) {
            return routings(List.of(routings));
        }
        public RuleVmHttp build() {
            final var _resultValue = new RuleVmHttp();
            _resultValue.healths = healths;
            _resultValue.proxyId = proxyId;
            _resultValue.routings = routings;
            return _resultValue;
        }
    }
}
