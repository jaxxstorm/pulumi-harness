// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceKsonnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceKsonnetArgs Empty = new GetGitopsApplicationsApplicationSpecSourceKsonnetArgs();

    @Import(name="environment")
    private @Nullable Output<String> environment;

    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    @Import(name="parameters")
    private @Nullable Output<List<GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs>> parameters;

    public Optional<Output<List<GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GetGitopsApplicationsApplicationSpecSourceKsonnetArgs() {}

    private GetGitopsApplicationsApplicationSpecSourceKsonnetArgs(GetGitopsApplicationsApplicationSpecSourceKsonnetArgs $) {
        this.environment = $.environment;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceKsonnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceKsonnetArgs $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceKsonnetArgs();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceKsonnetArgs defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceKsonnetArgs(Objects.requireNonNull(defaults));
        }

        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        public Builder parameters(@Nullable Output<List<GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(GetGitopsApplicationsApplicationSpecSourceKsonnetParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public GetGitopsApplicationsApplicationSpecSourceKsonnetArgs build() {
            return $;
        }
    }

}
