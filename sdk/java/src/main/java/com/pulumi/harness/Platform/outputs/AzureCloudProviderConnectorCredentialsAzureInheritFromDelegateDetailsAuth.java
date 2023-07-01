// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUa;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth {
    private @Nullable AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUa azureMsiAuthUa;
    private String type;

    private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth() {}
    public Optional<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUa> azureMsiAuthUa() {
        return Optional.ofNullable(this.azureMsiAuthUa);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUa azureMsiAuthUa;
        private String type;
        public Builder() {}
        public Builder(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureMsiAuthUa = defaults.azureMsiAuthUa;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder azureMsiAuthUa(@Nullable AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUa azureMsiAuthUa) {
            this.azureMsiAuthUa = azureMsiAuthUa;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth build() {
            final var o = new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth();
            o.azureMsiAuthUa = azureMsiAuthUa;
            o.type = type;
            return o;
        }
    }
}
