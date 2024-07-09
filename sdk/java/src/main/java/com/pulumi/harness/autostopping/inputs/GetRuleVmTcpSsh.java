// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuleVmTcpSsh extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleVmTcpSsh Empty = new GetRuleVmTcpSsh();

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
    @Import(name="port")
    private @Nullable Integer port;

    /**
     * @return Port to listen on the vm
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    private GetRuleVmTcpSsh() {}

    private GetRuleVmTcpSsh(GetRuleVmTcpSsh $) {
        this.connectOn = $.connectOn;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleVmTcpSsh defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleVmTcpSsh $;

        public Builder() {
            $ = new GetRuleVmTcpSsh();
        }

        public Builder(GetRuleVmTcpSsh defaults) {
            $ = new GetRuleVmTcpSsh(Objects.requireNonNull(defaults));
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
        public Builder port(@Nullable Integer port) {
            $.port = port;
            return this;
        }

        public GetRuleVmTcpSsh build() {
            return $;
        }
    }

}
