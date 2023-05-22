// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecSourceDirectoryArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecSourceHelmArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecSourceKsonnetArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecSourceKustomizeArgs;
import com.pulumi.harness.platform.inputs.GitopsApplicationsApplicationSpecSourcePluginArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsApplicationSpecSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsApplicationSpecSourceArgs Empty = new GitopsApplicationsApplicationSpecSourceArgs();

    @Import(name="chart")
    private @Nullable Output<String> chart;

    public Optional<Output<String>> chart() {
        return Optional.ofNullable(this.chart);
    }

    @Import(name="directories")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecSourceDirectoryArgs>> directories;

    public Optional<Output<List<GitopsApplicationsApplicationSpecSourceDirectoryArgs>>> directories() {
        return Optional.ofNullable(this.directories);
    }

    @Import(name="helms")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecSourceHelmArgs>> helms;

    public Optional<Output<List<GitopsApplicationsApplicationSpecSourceHelmArgs>>> helms() {
        return Optional.ofNullable(this.helms);
    }

    @Import(name="ksonnets")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecSourceKsonnetArgs>> ksonnets;

    public Optional<Output<List<GitopsApplicationsApplicationSpecSourceKsonnetArgs>>> ksonnets() {
        return Optional.ofNullable(this.ksonnets);
    }

    @Import(name="kustomizes")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecSourceKustomizeArgs>> kustomizes;

    public Optional<Output<List<GitopsApplicationsApplicationSpecSourceKustomizeArgs>>> kustomizes() {
        return Optional.ofNullable(this.kustomizes);
    }

    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    @Import(name="plugins")
    private @Nullable Output<List<GitopsApplicationsApplicationSpecSourcePluginArgs>> plugins;

    public Optional<Output<List<GitopsApplicationsApplicationSpecSourcePluginArgs>>> plugins() {
        return Optional.ofNullable(this.plugins);
    }

    @Import(name="repoUrl", required=true)
    private Output<String> repoUrl;

    public Output<String> repoUrl() {
        return this.repoUrl;
    }

    @Import(name="targetRevision", required=true)
    private Output<String> targetRevision;

    public Output<String> targetRevision() {
        return this.targetRevision;
    }

    private GitopsApplicationsApplicationSpecSourceArgs() {}

    private GitopsApplicationsApplicationSpecSourceArgs(GitopsApplicationsApplicationSpecSourceArgs $) {
        this.chart = $.chart;
        this.directories = $.directories;
        this.helms = $.helms;
        this.ksonnets = $.ksonnets;
        this.kustomizes = $.kustomizes;
        this.path = $.path;
        this.plugins = $.plugins;
        this.repoUrl = $.repoUrl;
        this.targetRevision = $.targetRevision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsApplicationSpecSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsApplicationSpecSourceArgs $;

        public Builder() {
            $ = new GitopsApplicationsApplicationSpecSourceArgs();
        }

        public Builder(GitopsApplicationsApplicationSpecSourceArgs defaults) {
            $ = new GitopsApplicationsApplicationSpecSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder chart(@Nullable Output<String> chart) {
            $.chart = chart;
            return this;
        }

        public Builder chart(String chart) {
            return chart(Output.of(chart));
        }

        public Builder directories(@Nullable Output<List<GitopsApplicationsApplicationSpecSourceDirectoryArgs>> directories) {
            $.directories = directories;
            return this;
        }

        public Builder directories(List<GitopsApplicationsApplicationSpecSourceDirectoryArgs> directories) {
            return directories(Output.of(directories));
        }

        public Builder directories(GitopsApplicationsApplicationSpecSourceDirectoryArgs... directories) {
            return directories(List.of(directories));
        }

        public Builder helms(@Nullable Output<List<GitopsApplicationsApplicationSpecSourceHelmArgs>> helms) {
            $.helms = helms;
            return this;
        }

        public Builder helms(List<GitopsApplicationsApplicationSpecSourceHelmArgs> helms) {
            return helms(Output.of(helms));
        }

        public Builder helms(GitopsApplicationsApplicationSpecSourceHelmArgs... helms) {
            return helms(List.of(helms));
        }

        public Builder ksonnets(@Nullable Output<List<GitopsApplicationsApplicationSpecSourceKsonnetArgs>> ksonnets) {
            $.ksonnets = ksonnets;
            return this;
        }

        public Builder ksonnets(List<GitopsApplicationsApplicationSpecSourceKsonnetArgs> ksonnets) {
            return ksonnets(Output.of(ksonnets));
        }

        public Builder ksonnets(GitopsApplicationsApplicationSpecSourceKsonnetArgs... ksonnets) {
            return ksonnets(List.of(ksonnets));
        }

        public Builder kustomizes(@Nullable Output<List<GitopsApplicationsApplicationSpecSourceKustomizeArgs>> kustomizes) {
            $.kustomizes = kustomizes;
            return this;
        }

        public Builder kustomizes(List<GitopsApplicationsApplicationSpecSourceKustomizeArgs> kustomizes) {
            return kustomizes(Output.of(kustomizes));
        }

        public Builder kustomizes(GitopsApplicationsApplicationSpecSourceKustomizeArgs... kustomizes) {
            return kustomizes(List.of(kustomizes));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder plugins(@Nullable Output<List<GitopsApplicationsApplicationSpecSourcePluginArgs>> plugins) {
            $.plugins = plugins;
            return this;
        }

        public Builder plugins(List<GitopsApplicationsApplicationSpecSourcePluginArgs> plugins) {
            return plugins(Output.of(plugins));
        }

        public Builder plugins(GitopsApplicationsApplicationSpecSourcePluginArgs... plugins) {
            return plugins(List.of(plugins));
        }

        public Builder repoUrl(Output<String> repoUrl) {
            $.repoUrl = repoUrl;
            return this;
        }

        public Builder repoUrl(String repoUrl) {
            return repoUrl(Output.of(repoUrl));
        }

        public Builder targetRevision(Output<String> targetRevision) {
            $.targetRevision = targetRevision;
            return this;
        }

        public Builder targetRevision(String targetRevision) {
            return targetRevision(Output.of(targetRevision));
        }

        public GitopsApplicationsApplicationSpecSourceArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.repoUrl = Objects.requireNonNull($.repoUrl, "expected parameter 'repoUrl' to be non-null");
            $.targetRevision = Objects.requireNonNull($.targetRevision, "expected parameter 'targetRevision' to be non-null");
            return $;
        }
    }

}
