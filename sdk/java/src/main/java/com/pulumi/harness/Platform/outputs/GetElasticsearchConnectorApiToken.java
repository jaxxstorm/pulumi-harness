// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetElasticsearchConnectorApiToken {
    /**
     * @return The client id used for connecting to ElasticSearch.
     * 
     */
    private String clientId;
    /**
     * @return Reference to the Harness secret containing the ElasticSearch client secret. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String clientSecretRef;

    private GetElasticsearchConnectorApiToken() {}
    /**
     * @return The client id used for connecting to ElasticSearch.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Reference to the Harness secret containing the ElasticSearch client secret. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String clientSecretRef() {
        return this.clientSecretRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticsearchConnectorApiToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String clientSecretRef;
        public Builder() {}
        public Builder(GetElasticsearchConnectorApiToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecretRef = defaults.clientSecretRef;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecretRef(String clientSecretRef) {
            this.clientSecretRef = Objects.requireNonNull(clientSecretRef);
            return this;
        }
        public GetElasticsearchConnectorApiToken build() {
            final var o = new GetElasticsearchConnectorApiToken();
            o.clientId = clientId;
            o.clientSecretRef = clientSecretRef;
            return o;
        }
    }
}
