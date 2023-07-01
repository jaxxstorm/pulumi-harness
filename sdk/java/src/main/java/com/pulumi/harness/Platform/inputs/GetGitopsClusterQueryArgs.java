// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsClusterQueryIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsClusterQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsClusterQueryArgs Empty = new GetGitopsClusterQueryArgs();

    /**
     * Cluster server URL or the cluster name.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<GetGitopsClusterQueryIdArgs>> ids;

    /**
     * @return Cluster server URL or the cluster name.
     * 
     */
    public Optional<Output<List<GetGitopsClusterQueryIdArgs>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Name of the GitOps cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the GitOps cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Server of the GitOps cluster.
     * 
     */
    @Import(name="server")
    private @Nullable Output<String> server;

    /**
     * @return Server of the GitOps cluster.
     * 
     */
    public Optional<Output<String>> server() {
        return Optional.ofNullable(this.server);
    }

    private GetGitopsClusterQueryArgs() {}

    private GetGitopsClusterQueryArgs(GetGitopsClusterQueryArgs $) {
        this.ids = $.ids;
        this.name = $.name;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsClusterQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsClusterQueryArgs $;

        public Builder() {
            $ = new GetGitopsClusterQueryArgs();
        }

        public Builder(GetGitopsClusterQueryArgs defaults) {
            $ = new GetGitopsClusterQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids Cluster server URL or the cluster name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<GetGitopsClusterQueryIdArgs>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids Cluster server URL or the cluster name.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<GetGitopsClusterQueryIdArgs> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids Cluster server URL or the cluster name.
         * 
         * @return builder
         * 
         */
        public Builder ids(GetGitopsClusterQueryIdArgs... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param name Name of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param server Server of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder server(@Nullable Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server Server of the GitOps cluster.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        public GetGitopsClusterQueryArgs build() {
            return $;
        }
    }

}
