// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourcePluginEnv extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSourcePluginEnv Empty = new GetGitopsApplicationsApplicationSpecSourcePluginEnv();

    /**
     * Name of the GitOps application.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the GitOps application.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetGitopsApplicationsApplicationSpecSourcePluginEnv() {}

    private GetGitopsApplicationsApplicationSpecSourcePluginEnv(GetGitopsApplicationsApplicationSpecSourcePluginEnv $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourcePluginEnv defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourcePluginEnv $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourcePluginEnv();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourcePluginEnv defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourcePluginEnv(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSourcePluginEnv build() {
            return $;
        }
    }

}
