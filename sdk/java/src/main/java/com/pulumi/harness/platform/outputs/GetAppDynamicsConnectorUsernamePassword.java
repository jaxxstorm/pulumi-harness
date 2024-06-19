// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppDynamicsConnectorUsernamePassword {
    /**
     * @return Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String passwordRef;
    /**
     * @return Username to use for authentication.
     * 
     */
    private String username;

    private GetAppDynamicsConnectorUsernamePassword() {}
    /**
     * @return Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String passwordRef() {
        return this.passwordRef;
    }
    /**
     * @return Username to use for authentication.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppDynamicsConnectorUsernamePassword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String passwordRef;
        private String username;
        public Builder() {}
        public Builder(GetAppDynamicsConnectorUsernamePassword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordRef = defaults.passwordRef;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder passwordRef(String passwordRef) {
            if (passwordRef == null) {
              throw new MissingRequiredPropertyException("GetAppDynamicsConnectorUsernamePassword", "passwordRef");
            }
            this.passwordRef = passwordRef;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetAppDynamicsConnectorUsernamePassword", "username");
            }
            this.username = username;
            return this;
        }
        public GetAppDynamicsConnectorUsernamePassword build() {
            final var _resultValue = new GetAppDynamicsConnectorUsernamePassword();
            _resultValue.passwordRef = passwordRef;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
