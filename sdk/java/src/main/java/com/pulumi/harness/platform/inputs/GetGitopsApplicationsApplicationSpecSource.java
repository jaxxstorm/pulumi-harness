// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceDirectory;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceHelm;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceKsonnet;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceKustomize;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourcePlugin;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSource extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSource Empty = new GetGitopsApplicationsApplicationSpecSource();

    /**
     * Helm chart name, and must be specified for the GitOps applications sourced from a helm repo.
     * 
     */
    @Import(name="chart")
    private @Nullable String chart;

    /**
     * @return Helm chart name, and must be specified for the GitOps applications sourced from a helm repo.
     * 
     */
    public Optional<String> chart() {
        return Optional.ofNullable(this.chart);
    }

    /**
     * Options for applications of type plain YAML or Jsonnet.
     * 
     */
    @Import(name="directories")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectory> directories;

    /**
     * @return Options for applications of type plain YAML or Jsonnet.
     * 
     */
    public Optional<List<GetGitopsApplicationsApplicationSpecSourceDirectory>> directories() {
        return Optional.ofNullable(this.directories);
    }

    /**
     * Holds helm specific options.
     * 
     */
    @Import(name="helms")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceHelm> helms;

    /**
     * @return Holds helm specific options.
     * 
     */
    public Optional<List<GetGitopsApplicationsApplicationSpecSourceHelm>> helms() {
        return Optional.ofNullable(this.helms);
    }

    /**
     * Ksonnet specific options.
     * 
     */
    @Import(name="ksonnets")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceKsonnet> ksonnets;

    /**
     * @return Ksonnet specific options.
     * 
     */
    public Optional<List<GetGitopsApplicationsApplicationSpecSourceKsonnet>> ksonnets() {
        return Optional.ofNullable(this.ksonnets);
    }

    /**
     * Options specific to a GitOps application source specific to Kustomize.
     * 
     */
    @Import(name="kustomizes")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceKustomize> kustomizes;

    /**
     * @return Options specific to a GitOps application source specific to Kustomize.
     * 
     */
    public Optional<List<GetGitopsApplicationsApplicationSpecSourceKustomize>> kustomizes() {
        return Optional.ofNullable(this.kustomizes);
    }

    /**
     * Directory path within the git repository, and is only valid for the GitOps applications sourced from git.
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    /**
     * @return Directory path within the git repository, and is only valid for the GitOps applications sourced from git.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Options specific to config management plugins.
     * 
     */
    @Import(name="plugins")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourcePlugin> plugins;

    /**
     * @return Options specific to config management plugins.
     * 
     */
    public Optional<List<GetGitopsApplicationsApplicationSpecSourcePlugin>> plugins() {
        return Optional.ofNullable(this.plugins);
    }

    /**
     * URL to the repository (git or helm) that contains the GitOps application manifests.
     * 
     */
    @Import(name="repoUrl")
    private @Nullable String repoUrl;

    /**
     * @return URL to the repository (git or helm) that contains the GitOps application manifests.
     * 
     */
    public Optional<String> repoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }

    /**
     * Revision of the source to sync the GitOps application to. In case of git, this can be commit, tag, or branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag of the chart&#39;s version.
     * 
     */
    @Import(name="targetRevision")
    private @Nullable String targetRevision;

    /**
     * @return Revision of the source to sync the GitOps application to. In case of git, this can be commit, tag, or branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag of the chart&#39;s version.
     * 
     */
    public Optional<String> targetRevision() {
        return Optional.ofNullable(this.targetRevision);
    }

    private GetGitopsApplicationsApplicationSpecSource() {}

    private GetGitopsApplicationsApplicationSpecSource(GetGitopsApplicationsApplicationSpecSource $) {
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
    public static Builder builder(GetGitopsApplicationsApplicationSpecSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSource $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSource();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSource defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSource(Objects.requireNonNull(defaults));
        }

        /**
         * @param chart Helm chart name, and must be specified for the GitOps applications sourced from a helm repo.
         * 
         * @return builder
         * 
         */
        public Builder chart(@Nullable String chart) {
            $.chart = chart;
            return this;
        }

        /**
         * @param directories Options for applications of type plain YAML or Jsonnet.
         * 
         * @return builder
         * 
         */
        public Builder directories(@Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectory> directories) {
            $.directories = directories;
            return this;
        }

        /**
         * @param directories Options for applications of type plain YAML or Jsonnet.
         * 
         * @return builder
         * 
         */
        public Builder directories(GetGitopsApplicationsApplicationSpecSourceDirectory... directories) {
            return directories(List.of(directories));
        }

        /**
         * @param helms Holds helm specific options.
         * 
         * @return builder
         * 
         */
        public Builder helms(@Nullable List<GetGitopsApplicationsApplicationSpecSourceHelm> helms) {
            $.helms = helms;
            return this;
        }

        /**
         * @param helms Holds helm specific options.
         * 
         * @return builder
         * 
         */
        public Builder helms(GetGitopsApplicationsApplicationSpecSourceHelm... helms) {
            return helms(List.of(helms));
        }

        /**
         * @param ksonnets Ksonnet specific options.
         * 
         * @return builder
         * 
         */
        public Builder ksonnets(@Nullable List<GetGitopsApplicationsApplicationSpecSourceKsonnet> ksonnets) {
            $.ksonnets = ksonnets;
            return this;
        }

        /**
         * @param ksonnets Ksonnet specific options.
         * 
         * @return builder
         * 
         */
        public Builder ksonnets(GetGitopsApplicationsApplicationSpecSourceKsonnet... ksonnets) {
            return ksonnets(List.of(ksonnets));
        }

        /**
         * @param kustomizes Options specific to a GitOps application source specific to Kustomize.
         * 
         * @return builder
         * 
         */
        public Builder kustomizes(@Nullable List<GetGitopsApplicationsApplicationSpecSourceKustomize> kustomizes) {
            $.kustomizes = kustomizes;
            return this;
        }

        /**
         * @param kustomizes Options specific to a GitOps application source specific to Kustomize.
         * 
         * @return builder
         * 
         */
        public Builder kustomizes(GetGitopsApplicationsApplicationSpecSourceKustomize... kustomizes) {
            return kustomizes(List.of(kustomizes));
        }

        /**
         * @param path Directory path within the git repository, and is only valid for the GitOps applications sourced from git.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        /**
         * @param plugins Options specific to config management plugins.
         * 
         * @return builder
         * 
         */
        public Builder plugins(@Nullable List<GetGitopsApplicationsApplicationSpecSourcePlugin> plugins) {
            $.plugins = plugins;
            return this;
        }

        /**
         * @param plugins Options specific to config management plugins.
         * 
         * @return builder
         * 
         */
        public Builder plugins(GetGitopsApplicationsApplicationSpecSourcePlugin... plugins) {
            return plugins(List.of(plugins));
        }

        /**
         * @param repoUrl URL to the repository (git or helm) that contains the GitOps application manifests.
         * 
         * @return builder
         * 
         */
        public Builder repoUrl(@Nullable String repoUrl) {
            $.repoUrl = repoUrl;
            return this;
        }

        /**
         * @param targetRevision Revision of the source to sync the GitOps application to. In case of git, this can be commit, tag, or branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag of the chart&#39;s version.
         * 
         * @return builder
         * 
         */
        public Builder targetRevision(@Nullable String targetRevision) {
            $.targetRevision = targetRevision;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSource build() {
            return $;
        }
    }

}
