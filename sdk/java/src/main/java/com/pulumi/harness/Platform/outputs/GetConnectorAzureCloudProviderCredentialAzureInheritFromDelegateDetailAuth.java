// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuth {
    private List<GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa> azureMsiAuthUas;
    private String type;

    private GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuth() {}
    public List<GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa> azureMsiAuthUas() {
        return this.azureMsiAuthUas;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa> azureMsiAuthUas;
        private String type;
        public Builder() {}
        public Builder(GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureMsiAuthUas = defaults.azureMsiAuthUas;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder azureMsiAuthUas(List<GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa> azureMsiAuthUas) {
            this.azureMsiAuthUas = Objects.requireNonNull(azureMsiAuthUas);
            return this;
        }
        public Builder azureMsiAuthUas(GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuthAzureMsiAuthUa... azureMsiAuthUas) {
            return azureMsiAuthUas(List.of(azureMsiAuthUas));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuth build() {
            final var o = new GetConnectorAzureCloudProviderCredentialAzureInheritFromDelegateDetailAuth();
            o.azureMsiAuthUas = azureMsiAuthUas;
            o.type = type;
            return o;
        }
    }
}
