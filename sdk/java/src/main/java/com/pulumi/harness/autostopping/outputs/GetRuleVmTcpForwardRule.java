// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleVmTcpForwardRule {
    /**
     * @return Port to listen on the proxy
     * 
     */
    private @Nullable Integer connectOn;
    /**
     * @return Port to listen on the vm
     * 
     */
    private Integer port;

    private GetRuleVmTcpForwardRule() {}
    /**
     * @return Port to listen on the proxy
     * 
     */
    public Optional<Integer> connectOn() {
        return Optional.ofNullable(this.connectOn);
    }
    /**
     * @return Port to listen on the vm
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleVmTcpForwardRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer connectOn;
        private Integer port;
        public Builder() {}
        public Builder(GetRuleVmTcpForwardRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectOn = defaults.connectOn;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder connectOn(@Nullable Integer connectOn) {

            this.connectOn = connectOn;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetRuleVmTcpForwardRule", "port");
            }
            this.port = port;
            return this;
        }
        public GetRuleVmTcpForwardRule build() {
            final var _resultValue = new GetRuleVmTcpForwardRule();
            _resultValue.connectOn = connectOn;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
