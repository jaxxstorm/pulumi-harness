// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleVmTcpSsh {
    /**
     * @return Port to listen on the proxy
     * 
     */
    private @Nullable Integer connectOn;
    /**
     * @return Port to listen on the vm
     * 
     */
    private @Nullable Integer port;

    private GetRuleVmTcpSsh() {}
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
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleVmTcpSsh defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer connectOn;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(GetRuleVmTcpSsh defaults) {
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
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        public GetRuleVmTcpSsh build() {
            final var _resultValue = new GetRuleVmTcpSsh();
            _resultValue.connectOn = connectOn;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
