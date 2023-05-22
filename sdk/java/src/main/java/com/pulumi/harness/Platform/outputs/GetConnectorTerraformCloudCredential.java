// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetConnectorTerraformCloudCredentialApiToken;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectorTerraformCloudCredential {
    private List<GetConnectorTerraformCloudCredentialApiToken> apiTokens;

    private GetConnectorTerraformCloudCredential() {}
    public List<GetConnectorTerraformCloudCredentialApiToken> apiTokens() {
        return this.apiTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorTerraformCloudCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectorTerraformCloudCredentialApiToken> apiTokens;
        public Builder() {}
        public Builder(GetConnectorTerraformCloudCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiTokens = defaults.apiTokens;
        }

        @CustomType.Setter
        public Builder apiTokens(List<GetConnectorTerraformCloudCredentialApiToken> apiTokens) {
            this.apiTokens = Objects.requireNonNull(apiTokens);
            return this;
        }
        public Builder apiTokens(GetConnectorTerraformCloudCredentialApiToken... apiTokens) {
            return apiTokens(List.of(apiTokens));
        }
        public GetConnectorTerraformCloudCredential build() {
            final var o = new GetConnectorTerraformCloudCredential();
            o.apiTokens = apiTokens;
            return o;
        }
    }
}
