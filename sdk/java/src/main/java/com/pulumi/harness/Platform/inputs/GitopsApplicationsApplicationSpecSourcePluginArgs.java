// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecSourcePluginEnvArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsApplicationSpecSourcePluginArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsApplicationSpecSourcePluginArgs Empty = new GitopsApplicationsApplicationSpecSourcePluginArgs();

    @Import(name="envs")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecSourcePluginEnvArgs>> envs;

    public Optional<Output<List<GitopsApplicationsApplicationSpecSourcePluginEnvArgs>>> envs() {
        return Optional.ofNullable(this.envs);
    }

    /**
     * Name of the GitOps application.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the GitOps application.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GitopsApplicationsApplicationSpecSourcePluginArgs() {}

    private GitopsApplicationsApplicationSpecSourcePluginArgs(GitopsApplicationsApplicationSpecSourcePluginArgs $) {
        this.envs = $.envs;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsApplicationSpecSourcePluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsApplicationSpecSourcePluginArgs $;

        public Builder() {
            $ = new GitopsApplicationsApplicationSpecSourcePluginArgs();
        }

        public Builder(GitopsApplicationsApplicationSpecSourcePluginArgs defaults) {
            $ = new GitopsApplicationsApplicationSpecSourcePluginArgs(Objects.requireNonNull(defaults));
        }

        public Builder envs(@Nullable Output<List<GitopsApplicationsApplicationSpecSourcePluginEnvArgs>> envs) {
            $.envs = envs;
            return this;
        }

        public Builder envs(List<GitopsApplicationsApplicationSpecSourcePluginEnvArgs> envs) {
            return envs(Output.of(envs));
        }

        public Builder envs(GitopsApplicationsApplicationSpecSourcePluginEnvArgs... envs) {
            return envs(List.of(envs));
        }

        /**
         * @param name Name of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GitopsApplicationsApplicationSpecSourcePluginArgs build() {
            return $;
        }
    }

}
