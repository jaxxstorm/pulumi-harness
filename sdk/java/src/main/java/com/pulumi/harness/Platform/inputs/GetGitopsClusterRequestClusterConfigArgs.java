// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs;
import com.pulumi.harness.platform.inputs.GetGitopsClusterRequestClusterConfigExecProviderConfigArgs;
import com.pulumi.harness.platform.inputs.GetGitopsClusterRequestClusterConfigTlsClientConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsClusterRequestClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsClusterRequestClusterConfigArgs Empty = new GetGitopsClusterRequestClusterConfigArgs();

    @Import(name="awsAuthConfigs")
    private @Nullable Output<List<GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs>> awsAuthConfigs;

    public Optional<Output<List<GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs>>> awsAuthConfigs() {
        return Optional.ofNullable(this.awsAuthConfigs);
    }

    @Import(name="bearerToken")
    private @Nullable Output<String> bearerToken;

    public Optional<Output<String>> bearerToken() {
        return Optional.ofNullable(this.bearerToken);
    }

    @Import(name="clusterConnectionType")
    private @Nullable Output<String> clusterConnectionType;

    public Optional<Output<String>> clusterConnectionType() {
        return Optional.ofNullable(this.clusterConnectionType);
    }

    @Import(name="execProviderConfigs")
    private @Nullable Output<List<GetGitopsClusterRequestClusterConfigExecProviderConfigArgs>> execProviderConfigs;

    public Optional<Output<List<GetGitopsClusterRequestClusterConfigExecProviderConfigArgs>>> execProviderConfigs() {
        return Optional.ofNullable(this.execProviderConfigs);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="tlsClientConfigs")
    private @Nullable Output<List<GetGitopsClusterRequestClusterConfigTlsClientConfigArgs>> tlsClientConfigs;

    public Optional<Output<List<GetGitopsClusterRequestClusterConfigTlsClientConfigArgs>>> tlsClientConfigs() {
        return Optional.ofNullable(this.tlsClientConfigs);
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GetGitopsClusterRequestClusterConfigArgs() {}

    private GetGitopsClusterRequestClusterConfigArgs(GetGitopsClusterRequestClusterConfigArgs $) {
        this.awsAuthConfigs = $.awsAuthConfigs;
        this.bearerToken = $.bearerToken;
        this.clusterConnectionType = $.clusterConnectionType;
        this.execProviderConfigs = $.execProviderConfigs;
        this.password = $.password;
        this.tlsClientConfigs = $.tlsClientConfigs;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsClusterRequestClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsClusterRequestClusterConfigArgs $;

        public Builder() {
            $ = new GetGitopsClusterRequestClusterConfigArgs();
        }

        public Builder(GetGitopsClusterRequestClusterConfigArgs defaults) {
            $ = new GetGitopsClusterRequestClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsAuthConfigs(@Nullable Output<List<GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs>> awsAuthConfigs) {
            $.awsAuthConfigs = awsAuthConfigs;
            return this;
        }

        public Builder awsAuthConfigs(List<GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs> awsAuthConfigs) {
            return awsAuthConfigs(Output.of(awsAuthConfigs));
        }

        public Builder awsAuthConfigs(GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs... awsAuthConfigs) {
            return awsAuthConfigs(List.of(awsAuthConfigs));
        }

        public Builder bearerToken(@Nullable Output<String> bearerToken) {
            $.bearerToken = bearerToken;
            return this;
        }

        public Builder bearerToken(String bearerToken) {
            return bearerToken(Output.of(bearerToken));
        }

        public Builder clusterConnectionType(@Nullable Output<String> clusterConnectionType) {
            $.clusterConnectionType = clusterConnectionType;
            return this;
        }

        public Builder clusterConnectionType(String clusterConnectionType) {
            return clusterConnectionType(Output.of(clusterConnectionType));
        }

        public Builder execProviderConfigs(@Nullable Output<List<GetGitopsClusterRequestClusterConfigExecProviderConfigArgs>> execProviderConfigs) {
            $.execProviderConfigs = execProviderConfigs;
            return this;
        }

        public Builder execProviderConfigs(List<GetGitopsClusterRequestClusterConfigExecProviderConfigArgs> execProviderConfigs) {
            return execProviderConfigs(Output.of(execProviderConfigs));
        }

        public Builder execProviderConfigs(GetGitopsClusterRequestClusterConfigExecProviderConfigArgs... execProviderConfigs) {
            return execProviderConfigs(List.of(execProviderConfigs));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder tlsClientConfigs(@Nullable Output<List<GetGitopsClusterRequestClusterConfigTlsClientConfigArgs>> tlsClientConfigs) {
            $.tlsClientConfigs = tlsClientConfigs;
            return this;
        }

        public Builder tlsClientConfigs(List<GetGitopsClusterRequestClusterConfigTlsClientConfigArgs> tlsClientConfigs) {
            return tlsClientConfigs(Output.of(tlsClientConfigs));
        }

        public Builder tlsClientConfigs(GetGitopsClusterRequestClusterConfigTlsClientConfigArgs... tlsClientConfigs) {
            return tlsClientConfigs(List.of(tlsClientConfigs));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetGitopsClusterRequestClusterConfigArgs build() {
            return $;
        }
    }

}
