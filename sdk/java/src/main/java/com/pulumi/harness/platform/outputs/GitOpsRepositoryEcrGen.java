// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitOpsRepositoryEcrGenJwtAuth;
import com.pulumi.harness.platform.outputs.GitOpsRepositoryEcrGenSecretRef;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsRepositoryEcrGen {
    /**
     * @return JWT authentication specific configuration.
     * 
     */
    private @Nullable GitOpsRepositoryEcrGenJwtAuth jwtAuth;
    /**
     * @return AWS region.
     * 
     */
    private @Nullable String region;
    /**
     * @return Secret reference to the AWS credentials.
     * 
     */
    private @Nullable GitOpsRepositoryEcrGenSecretRef secretRef;

    private GitOpsRepositoryEcrGen() {}
    /**
     * @return JWT authentication specific configuration.
     * 
     */
    public Optional<GitOpsRepositoryEcrGenJwtAuth> jwtAuth() {
        return Optional.ofNullable(this.jwtAuth);
    }
    /**
     * @return AWS region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Secret reference to the AWS credentials.
     * 
     */
    public Optional<GitOpsRepositoryEcrGenSecretRef> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsRepositoryEcrGen defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitOpsRepositoryEcrGenJwtAuth jwtAuth;
        private @Nullable String region;
        private @Nullable GitOpsRepositoryEcrGenSecretRef secretRef;
        public Builder() {}
        public Builder(GitOpsRepositoryEcrGen defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jwtAuth = defaults.jwtAuth;
    	      this.region = defaults.region;
    	      this.secretRef = defaults.secretRef;
        }

        @CustomType.Setter
        public Builder jwtAuth(@Nullable GitOpsRepositoryEcrGenJwtAuth jwtAuth) {

            this.jwtAuth = jwtAuth;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secretRef(@Nullable GitOpsRepositoryEcrGenSecretRef secretRef) {

            this.secretRef = secretRef;
            return this;
        }
        public GitOpsRepositoryEcrGen build() {
            final var _resultValue = new GitOpsRepositoryEcrGen();
            _resultValue.jwtAuth = jwtAuth;
            _resultValue.region = region;
            _resultValue.secretRef = secretRef;
            return _resultValue;
        }
    }
}
