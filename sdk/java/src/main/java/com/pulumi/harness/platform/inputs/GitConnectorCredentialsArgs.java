// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitConnectorCredentialsHttpArgs;
import com.pulumi.harness.platform.inputs.GitConnectorCredentialsSshArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitConnectorCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitConnectorCredentialsArgs Empty = new GitConnectorCredentialsArgs();

    /**
     * Authenticate using Username and password over http(s) for the connection.
     * 
     */
    @Import(name="http")
    private @Nullable Output<GitConnectorCredentialsHttpArgs> http;

    /**
     * @return Authenticate using Username and password over http(s) for the connection.
     * 
     */
    public Optional<Output<GitConnectorCredentialsHttpArgs>> http() {
        return Optional.ofNullable(this.http);
    }

    /**
     * Authenticate using SSH for the connection.
     * 
     */
    @Import(name="ssh")
    private @Nullable Output<GitConnectorCredentialsSshArgs> ssh;

    /**
     * @return Authenticate using SSH for the connection.
     * 
     */
    public Optional<Output<GitConnectorCredentialsSshArgs>> ssh() {
        return Optional.ofNullable(this.ssh);
    }

    private GitConnectorCredentialsArgs() {}

    private GitConnectorCredentialsArgs(GitConnectorCredentialsArgs $) {
        this.http = $.http;
        this.ssh = $.ssh;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitConnectorCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitConnectorCredentialsArgs $;

        public Builder() {
            $ = new GitConnectorCredentialsArgs();
        }

        public Builder(GitConnectorCredentialsArgs defaults) {
            $ = new GitConnectorCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param http Authenticate using Username and password over http(s) for the connection.
         * 
         * @return builder
         * 
         */
        public Builder http(@Nullable Output<GitConnectorCredentialsHttpArgs> http) {
            $.http = http;
            return this;
        }

        /**
         * @param http Authenticate using Username and password over http(s) for the connection.
         * 
         * @return builder
         * 
         */
        public Builder http(GitConnectorCredentialsHttpArgs http) {
            return http(Output.of(http));
        }

        /**
         * @param ssh Authenticate using SSH for the connection.
         * 
         * @return builder
         * 
         */
        public Builder ssh(@Nullable Output<GitConnectorCredentialsSshArgs> ssh) {
            $.ssh = ssh;
            return this;
        }

        /**
         * @param ssh Authenticate using SSH for the connection.
         * 
         * @return builder
         * 
         */
        public Builder ssh(GitConnectorCredentialsSshArgs ssh) {
            return ssh(Output.of(ssh));
        }

        public GitConnectorCredentialsArgs build() {
            return $;
        }
    }

}