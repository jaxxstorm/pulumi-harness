// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuleRdsTcpForwardRule extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleRdsTcpForwardRule Empty = new GetRuleRdsTcpForwardRule();

    /**
     * Port to listen on the proxy
     * 
     */
    @Import(name="connectOn")
    private @Nullable Integer connectOn;

    /**
     * @return Port to listen on the proxy
     * 
     */
    public Optional<Integer> connectOn() {
        return Optional.ofNullable(this.connectOn);
    }

    /**
     * Port to listen on the vm
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    /**
     * @return Port to listen on the vm
     * 
     */
    public Integer port() {
        return this.port;
    }

    private GetRuleRdsTcpForwardRule() {}

    private GetRuleRdsTcpForwardRule(GetRuleRdsTcpForwardRule $) {
        this.connectOn = $.connectOn;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleRdsTcpForwardRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleRdsTcpForwardRule $;

        public Builder() {
            $ = new GetRuleRdsTcpForwardRule();
        }

        public Builder(GetRuleRdsTcpForwardRule defaults) {
            $ = new GetRuleRdsTcpForwardRule(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectOn Port to listen on the proxy
         * 
         * @return builder
         * 
         */
        public Builder connectOn(@Nullable Integer connectOn) {
            $.connectOn = connectOn;
            return this;
        }

        /**
         * @param port Port to listen on the vm
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        public GetRuleRdsTcpForwardRule build() {
            if ($.port == null) {
                throw new MissingRequiredPropertyException("GetRuleRdsTcpForwardRule", "port");
            }
            return $;
        }
    }

}