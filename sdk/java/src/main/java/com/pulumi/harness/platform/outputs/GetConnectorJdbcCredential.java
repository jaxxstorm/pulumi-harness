// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectorJdbcCredential {
    /**
     * @return The reference to the Harness secret containing the password to use for the database server. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String passwordRef;
    /**
     * @return The username to use for the database server.
     * 
     */
    private String username;
    /**
     * @return The reference to the Harness secret containing the username to use for the database server. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String usernameRef;

    private GetConnectorJdbcCredential() {}
    /**
     * @return The reference to the Harness secret containing the password to use for the database server. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String passwordRef() {
        return this.passwordRef;
    }
    /**
     * @return The username to use for the database server.
     * 
     */
    public String username() {
        return this.username;
    }
    /**
     * @return The reference to the Harness secret containing the username to use for the database server. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String usernameRef() {
        return this.usernameRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorJdbcCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String passwordRef;
        private String username;
        private String usernameRef;
        public Builder() {}
        public Builder(GetConnectorJdbcCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordRef = defaults.passwordRef;
    	      this.username = defaults.username;
    	      this.usernameRef = defaults.usernameRef;
        }

        @CustomType.Setter
        public Builder passwordRef(String passwordRef) {
            if (passwordRef == null) {
              throw new MissingRequiredPropertyException("GetConnectorJdbcCredential", "passwordRef");
            }
            this.passwordRef = passwordRef;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetConnectorJdbcCredential", "username");
            }
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder usernameRef(String usernameRef) {
            if (usernameRef == null) {
              throw new MissingRequiredPropertyException("GetConnectorJdbcCredential", "usernameRef");
            }
            this.usernameRef = usernameRef;
            return this;
        }
        public GetConnectorJdbcCredential build() {
            final var _resultValue = new GetConnectorJdbcCredential();
            _resultValue.passwordRef = passwordRef;
            _resultValue.username = username;
            _resultValue.usernameRef = usernameRef;
            return _resultValue;
        }
    }
}
