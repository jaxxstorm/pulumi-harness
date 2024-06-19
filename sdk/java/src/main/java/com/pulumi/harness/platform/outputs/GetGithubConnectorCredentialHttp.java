// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGithubConnectorCredentialHttp {
    /**
     * @return Reference to a secret containing the personal access to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String tokenRef;
    /**
     * @return Username to use for authentication.
     * 
     */
    private String username;
    /**
     * @return Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String usernameRef;

    private GetGithubConnectorCredentialHttp() {}
    /**
     * @return Reference to a secret containing the personal access to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String tokenRef() {
        return this.tokenRef;
    }
    /**
     * @return Username to use for authentication.
     * 
     */
    public String username() {
        return this.username;
    }
    /**
     * @return Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String usernameRef() {
        return this.usernameRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGithubConnectorCredentialHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tokenRef;
        private String username;
        private String usernameRef;
        public Builder() {}
        public Builder(GetGithubConnectorCredentialHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tokenRef = defaults.tokenRef;
    	      this.username = defaults.username;
    	      this.usernameRef = defaults.usernameRef;
        }

        @CustomType.Setter
        public Builder tokenRef(String tokenRef) {
            if (tokenRef == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorCredentialHttp", "tokenRef");
            }
            this.tokenRef = tokenRef;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorCredentialHttp", "username");
            }
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder usernameRef(String usernameRef) {
            if (usernameRef == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorCredentialHttp", "usernameRef");
            }
            this.usernameRef = usernameRef;
            return this;
        }
        public GetGithubConnectorCredentialHttp build() {
            final var _resultValue = new GetGithubConnectorCredentialHttp();
            _resultValue.tokenRef = tokenRef;
            _resultValue.username = username;
            _resultValue.usernameRef = usernameRef;
            return _resultValue;
        }
    }
}
