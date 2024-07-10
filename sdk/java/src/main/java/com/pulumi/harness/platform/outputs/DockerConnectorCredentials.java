// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DockerConnectorCredentials {
    /**
     * @return The reference to the Harness secret containing the password to use for the docker registry. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}. To reference a secret at the project scope, use directly without any prefix.
     * 
     */
    private String passwordRef;
    /**
     * @return The username to use for the docker registry.
     * 
     */
    private @Nullable String username;
    /**
     * @return The reference to the Harness secret containing the username to use for the docker registry. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private @Nullable String usernameRef;

    private DockerConnectorCredentials() {}
    /**
     * @return The reference to the Harness secret containing the password to use for the docker registry. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}. To reference a secret at the project scope, use directly without any prefix.
     * 
     */
    public String passwordRef() {
        return this.passwordRef;
    }
    /**
     * @return The username to use for the docker registry.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    /**
     * @return The reference to the Harness secret containing the username to use for the docker registry. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<String> usernameRef() {
        return Optional.ofNullable(this.usernameRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerConnectorCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String passwordRef;
        private @Nullable String username;
        private @Nullable String usernameRef;
        public Builder() {}
        public Builder(DockerConnectorCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordRef = defaults.passwordRef;
    	      this.username = defaults.username;
    	      this.usernameRef = defaults.usernameRef;
        }

        @CustomType.Setter
        public Builder passwordRef(String passwordRef) {
            if (passwordRef == null) {
              throw new MissingRequiredPropertyException("DockerConnectorCredentials", "passwordRef");
            }
            this.passwordRef = passwordRef;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder usernameRef(@Nullable String usernameRef) {

            this.usernameRef = usernameRef;
            return this;
        }
        public DockerConnectorCredentials build() {
            final var _resultValue = new DockerConnectorCredentials();
            _resultValue.passwordRef = passwordRef;
            _resultValue.username = username;
            _resultValue.usernameRef = usernameRef;
            return _resultValue;
        }
    }
}
