// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetServiceOverridesV2GitDetailsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceOverridesV2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceOverridesV2Args Empty = new GetServiceOverridesV2Args();

    @Import(name="gitDetails")
    private @Nullable Output<GetServiceOverridesV2GitDetailsArgs> gitDetails;

    public Optional<Output<GetServiceOverridesV2GitDetailsArgs>> gitDetails() {
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

    private GetServiceOverridesV2Args() {}

    private GetServiceOverridesV2Args(GetServiceOverridesV2Args $) {
        this.gitDetails = $.gitDetails;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceOverridesV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceOverridesV2Args $;

        public Builder() {
            $ = new GetServiceOverridesV2Args();
        }

        public Builder(GetServiceOverridesV2Args defaults) {
            $ = new GetServiceOverridesV2Args(Objects.requireNonNull(defaults));
        }

        public Builder gitDetails(@Nullable Output<GetServiceOverridesV2GitDetailsArgs> gitDetails) {
            $.gitDetails = gitDetails;
            return this;
        }

        public Builder gitDetails(GetServiceOverridesV2GitDetailsArgs gitDetails) {
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

        public GetServiceOverridesV2Args build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetServiceOverridesV2Args", "identifier");
            }
            return $;
        }
    }

}
