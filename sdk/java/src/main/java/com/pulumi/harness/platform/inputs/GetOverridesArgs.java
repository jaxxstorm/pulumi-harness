// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetOverridesGitDetailsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOverridesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOverridesArgs Empty = new GetOverridesArgs();

    @Import(name="gitDetails")
    private @Nullable Output<GetOverridesGitDetailsArgs> gitDetails;

    public Optional<Output<GetOverridesGitDetailsArgs>> gitDetails() {
        return Optional.ofNullable(this.gitDetails);
    }

    @Import(name="identifier", required=true)
    private Output<String> identifier;

    public Output<String> identifier() {
        return this.identifier;
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetOverridesArgs() {}

    private GetOverridesArgs(GetOverridesArgs $) {
        this.gitDetails = $.gitDetails;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOverridesArgs $;

        public Builder() {
            $ = new GetOverridesArgs();
        }

        public Builder(GetOverridesArgs defaults) {
            $ = new GetOverridesArgs(Objects.requireNonNull(defaults));
        }

        public Builder gitDetails(@Nullable Output<GetOverridesGitDetailsArgs> gitDetails) {
            $.gitDetails = gitDetails;
            return this;
        }

        public Builder gitDetails(GetOverridesGitDetailsArgs gitDetails) {
            return gitDetails(Output.of(gitDetails));
        }

        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetOverridesArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetOverridesArgs", "identifier");
            }
            return $;
        }
    }

}
