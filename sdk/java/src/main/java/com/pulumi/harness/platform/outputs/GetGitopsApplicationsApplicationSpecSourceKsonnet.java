// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSourceKsonnetParameter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSourceKsonnet {
    /**
     * @return Ksonnet application environment name.
     * 
     */
    private @Nullable String environment;
    /**
     * @return List of ksonnet component parameter override values.
     * 
     */
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceKsonnetParameter> parameters;

    private GetGitopsApplicationsApplicationSpecSourceKsonnet() {}
    /**
     * @return Ksonnet application environment name.
     * 
     */
    public Optional<String> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return List of ksonnet component parameter override values.
     * 
     */
    public List<GetGitopsApplicationsApplicationSpecSourceKsonnetParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceKsonnet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String environment;
        private @Nullable List<GetGitopsApplicationsApplicationSpecSourceKsonnetParameter> parameters;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSourceKsonnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder environment(@Nullable String environment) {

            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable List<GetGitopsApplicationsApplicationSpecSourceKsonnetParameter> parameters) {

            this.parameters = parameters;
            return this;
        }
        public Builder parameters(GetGitopsApplicationsApplicationSpecSourceKsonnetParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public GetGitopsApplicationsApplicationSpecSourceKsonnet build() {
            final var _resultValue = new GetGitopsApplicationsApplicationSpecSourceKsonnet();
            _resultValue.environment = environment;
            _resultValue.parameters = parameters;
            return _resultValue;
        }
    }
}
