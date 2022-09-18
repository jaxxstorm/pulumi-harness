// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitlabConnectorCredentialHttp;
import com.pulumi.harness.platform.outputs.GetGitlabConnectorCredentialSsh;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGitlabConnectorCredential {
    private List<GetGitlabConnectorCredentialHttp> https;
    private List<GetGitlabConnectorCredentialSsh> sshes;

    private GetGitlabConnectorCredential() {}
    public List<GetGitlabConnectorCredentialHttp> https() {
        return this.https;
    }
    public List<GetGitlabConnectorCredentialSsh> sshes() {
        return this.sshes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitlabConnectorCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGitlabConnectorCredentialHttp> https;
        private List<GetGitlabConnectorCredentialSsh> sshes;
        public Builder() {}
        public Builder(GetGitlabConnectorCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.https = defaults.https;
    	      this.sshes = defaults.sshes;
        }

        @CustomType.Setter
        public Builder https(List<GetGitlabConnectorCredentialHttp> https) {
            this.https = Objects.requireNonNull(https);
            return this;
        }
        public Builder https(GetGitlabConnectorCredentialHttp... https) {
            return https(List.of(https));
        }
        @CustomType.Setter
        public Builder sshes(List<GetGitlabConnectorCredentialSsh> sshes) {
            this.sshes = Objects.requireNonNull(sshes);
            return this;
        }
        public Builder sshes(GetGitlabConnectorCredentialSsh... sshes) {
            return sshes(List.of(sshes));
        }
        public GetGitlabConnectorCredential build() {
            final var o = new GetGitlabConnectorCredential();
            o.https = https;
            o.sshes = sshes;
            return o;
        }
    }
}