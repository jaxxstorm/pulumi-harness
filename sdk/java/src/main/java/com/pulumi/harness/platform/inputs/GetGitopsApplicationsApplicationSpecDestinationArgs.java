// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsApplicationsApplicationSpecDestinationArgs Empty = new GetGitopsApplicationsApplicationSpecDestinationArgs();

    /**
     * URL of the target cluster and must be set to the kubernetes control plane API.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return URL of the target cluster and must be set to the kubernetes control plane API.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Target namespace of the GitOps application&#39;s resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Target namespace of the GitOps application&#39;s resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Server of the destination of the GitOps application.
     * 
     */
    @Import(name="server")
    private @Nullable Output<String> server;

    /**
     * @return Server of the destination of the GitOps application.
     * 
     */
    public Optional<Output<String>> server() {
        return Optional.ofNullable(this.server);
    }

    private GetGitopsApplicationsApplicationSpecDestinationArgs() {}

    private GetGitopsApplicationsApplicationSpecDestinationArgs(GetGitopsApplicationsApplicationSpecDestinationArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecDestinationArgs $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecDestinationArgs();
        }

        public Builder(GetGitopsApplicationsApplicationSpecDestinationArgs defaults) {
            $ = new GetGitopsApplicationsApplicationSpecDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name URL of the target cluster and must be set to the kubernetes control plane API.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name URL of the target cluster and must be set to the kubernetes control plane API.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Target namespace of the GitOps application&#39;s resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Target namespace of the GitOps application&#39;s resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param server Server of the destination of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder server(@Nullable Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server Server of the destination of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        public GetGitopsApplicationsApplicationSpecDestinationArgs build() {
            return $;
        }
    }

}
