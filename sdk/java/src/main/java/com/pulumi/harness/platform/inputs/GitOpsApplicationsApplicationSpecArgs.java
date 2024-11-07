// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsApplicationsApplicationSpecDestinationArgs;
import com.pulumi.harness.platform.inputs.GitOpsApplicationsApplicationSpecSourceArgs;
import com.pulumi.harness.platform.inputs.GitOpsApplicationsApplicationSpecSyncPolicyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsApplicationsApplicationSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsApplicationsApplicationSpecArgs Empty = new GitOpsApplicationsApplicationSpecArgs();

    /**
     * Information about the GitOps application&#39;s destination.
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<GitOpsApplicationsApplicationSpecDestinationArgs>> destinations;

    /**
     * @return Information about the GitOps application&#39;s destination.
     * 
     */
    public Optional<Output<List<GitOpsApplicationsApplicationSpecDestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    /**
     * The ArgoCD project name corresponding to this GitOps application. Value must match mappings of ArgoCD projects to harness project.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ArgoCD project name corresponding to this GitOps application. Value must match mappings of ArgoCD projects to harness project.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Contains all information about the source of the GitOps application.
     * 
     */
    @Import(name="source")
    private @Nullable Output<List<GitOpsApplicationsApplicationSpecSourceArgs>> source;

    /**
     * @return Contains all information about the source of the GitOps application.
     * 
     */
    public Optional<Output<List<GitOpsApplicationsApplicationSpecSourceArgs>>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * List of sources for the GitOps application. Multi Source support
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<GitOpsApplicationsApplicationSpecSourceArgs>> sources;

    /**
     * @return List of sources for the GitOps application. Multi Source support
     * 
     */
    public Optional<Output<List<GitOpsApplicationsApplicationSpecSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * Controls when a sync will be performed in response to updates in git.
     * 
     */
    @Import(name="syncPolicies")
    private @Nullable Output<List<GitOpsApplicationsApplicationSpecSyncPolicyArgs>> syncPolicies;

    /**
     * @return Controls when a sync will be performed in response to updates in git.
     * 
     */
    public Optional<Output<List<GitOpsApplicationsApplicationSpecSyncPolicyArgs>>> syncPolicies() {
        return Optional.ofNullable(this.syncPolicies);
    }

    private GitOpsApplicationsApplicationSpecArgs() {}

    private GitOpsApplicationsApplicationSpecArgs(GitOpsApplicationsApplicationSpecArgs $) {
        this.destinations = $.destinations;
        this.project = $.project;
        this.source = $.source;
        this.sources = $.sources;
        this.syncPolicies = $.syncPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsApplicationsApplicationSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsApplicationsApplicationSpecArgs $;

        public Builder() {
            $ = new GitOpsApplicationsApplicationSpecArgs();
        }

        public Builder(GitOpsApplicationsApplicationSpecArgs defaults) {
            $ = new GitOpsApplicationsApplicationSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations Information about the GitOps application&#39;s destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<GitOpsApplicationsApplicationSpecDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations Information about the GitOps application&#39;s destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<GitOpsApplicationsApplicationSpecDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations Information about the GitOps application&#39;s destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(GitOpsApplicationsApplicationSpecDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param project The ArgoCD project name corresponding to this GitOps application. Value must match mappings of ArgoCD projects to harness project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ArgoCD project name corresponding to this GitOps application. Value must match mappings of ArgoCD projects to harness project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param source Contains all information about the source of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<List<GitOpsApplicationsApplicationSpecSourceArgs>> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Contains all information about the source of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder source(List<GitOpsApplicationsApplicationSpecSourceArgs> source) {
            return source(Output.of(source));
        }

        /**
         * @param source Contains all information about the source of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder source(GitOpsApplicationsApplicationSpecSourceArgs... source) {
            return source(List.of(source));
        }

        /**
         * @param sources List of sources for the GitOps application. Multi Source support
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<GitOpsApplicationsApplicationSpecSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources List of sources for the GitOps application. Multi Source support
         * 
         * @return builder
         * 
         */
        public Builder sources(List<GitOpsApplicationsApplicationSpecSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources List of sources for the GitOps application. Multi Source support
         * 
         * @return builder
         * 
         */
        public Builder sources(GitOpsApplicationsApplicationSpecSourceArgs... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param syncPolicies Controls when a sync will be performed in response to updates in git.
         * 
         * @return builder
         * 
         */
        public Builder syncPolicies(@Nullable Output<List<GitOpsApplicationsApplicationSpecSyncPolicyArgs>> syncPolicies) {
            $.syncPolicies = syncPolicies;
            return this;
        }

        /**
         * @param syncPolicies Controls when a sync will be performed in response to updates in git.
         * 
         * @return builder
         * 
         */
        public Builder syncPolicies(List<GitOpsApplicationsApplicationSpecSyncPolicyArgs> syncPolicies) {
            return syncPolicies(Output.of(syncPolicies));
        }

        /**
         * @param syncPolicies Controls when a sync will be performed in response to updates in git.
         * 
         * @return builder
         * 
         */
        public Builder syncPolicies(GitOpsApplicationsApplicationSpecSyncPolicyArgs... syncPolicies) {
            return syncPolicies(List.of(syncPolicies));
        }

        public GitOpsApplicationsApplicationSpecArgs build() {
            return $;
        }
    }

}
