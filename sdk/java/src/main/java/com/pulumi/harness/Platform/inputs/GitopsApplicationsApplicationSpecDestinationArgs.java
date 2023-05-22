// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsApplicationsApplicationSpecDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsApplicationsApplicationSpecDestinationArgs Empty = new GitopsApplicationsApplicationSpecDestinationArgs();

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

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    @Import(name="server")
    private @Nullable Output<String> server;

    public Optional<Output<String>> server() {
        return Optional.ofNullable(this.server);
    }

    private GitopsApplicationsApplicationSpecDestinationArgs() {}

    private GitopsApplicationsApplicationSpecDestinationArgs(GitopsApplicationsApplicationSpecDestinationArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsApplicationsApplicationSpecDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsApplicationsApplicationSpecDestinationArgs $;

        public Builder() {
            $ = new GitopsApplicationsApplicationSpecDestinationArgs();
        }

        public Builder(GitopsApplicationsApplicationSpecDestinationArgs defaults) {
            $ = new GitopsApplicationsApplicationSpecDestinationArgs(Objects.requireNonNull(defaults));
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

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder server(@Nullable Output<String> server) {
            $.server = server;
            return this;
        }

        public Builder server(String server) {
            return server(Output.of(server));
        }

        public GitopsApplicationsApplicationSpecDestinationArgs build() {
            return $;
        }
    }

}
