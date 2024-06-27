// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGitConnectorCredentialSsh {
    /**
     * @return Reference to the Harness secret containing the ssh key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private String sshKeyRef;

    private GetGitConnectorCredentialSsh() {}
    /**
     * @return Reference to the Harness secret containing the ssh key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public String sshKeyRef() {
        return this.sshKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitConnectorCredentialSsh defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sshKeyRef;
        public Builder() {}
        public Builder(GetGitConnectorCredentialSsh defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sshKeyRef = defaults.sshKeyRef;
        }

        @CustomType.Setter
        public Builder sshKeyRef(String sshKeyRef) {
            if (sshKeyRef == null) {
              throw new MissingRequiredPropertyException("GetGitConnectorCredentialSsh", "sshKeyRef");
            }
            this.sshKeyRef = sshKeyRef;
            return this;
        }
        public GetGitConnectorCredentialSsh build() {
            final var _resultValue = new GetGitConnectorCredentialSsh();
            _resultValue.sshKeyRef = sshKeyRef;
            return _resultValue;
        }
    }
}