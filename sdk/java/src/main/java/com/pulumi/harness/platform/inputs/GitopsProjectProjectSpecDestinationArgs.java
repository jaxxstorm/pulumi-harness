// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsProjectProjectSpecDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsProjectProjectSpecDestinationArgs Empty = new GitopsProjectProjectSpecDestinationArgs();

    /**
     * Namespace specifies the target namespace for the application&#39;s resources.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Namespace specifies the target namespace for the application&#39;s resources.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Server specifies the URL of the target cluster and must be set to the Kubernetes control plane API.
     * 
     */
    @Import(name="server")
    private @Nullable Output<String> server;

    /**
     * @return Server specifies the URL of the target cluster and must be set to the Kubernetes control plane API.
     * 
     */
    public Optional<Output<String>> server() {
        return Optional.ofNullable(this.server);
    }

    private GitopsProjectProjectSpecDestinationArgs() {}

    private GitopsProjectProjectSpecDestinationArgs(GitopsProjectProjectSpecDestinationArgs $) {
        this.namespace = $.namespace;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsProjectProjectSpecDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsProjectProjectSpecDestinationArgs $;

        public Builder() {
            $ = new GitopsProjectProjectSpecDestinationArgs();
        }

        public Builder(GitopsProjectProjectSpecDestinationArgs defaults) {
            $ = new GitopsProjectProjectSpecDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace Namespace specifies the target namespace for the application&#39;s resources.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace specifies the target namespace for the application&#39;s resources.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param server Server specifies the URL of the target cluster and must be set to the Kubernetes control plane API.
         * 
         * @return builder
         * 
         */
        public Builder server(@Nullable Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server Server specifies the URL of the target cluster and must be set to the Kubernetes control plane API.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        public GitopsProjectProjectSpecDestinationArgs build() {
            return $;
        }
    }

}
