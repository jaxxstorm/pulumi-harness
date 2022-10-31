// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsClusterRequestClusterInfoCacheInfoArgs;
import com.pulumi.harness.platform.inputs.GetGitopsClusterRequestClusterInfoConnectionStateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsClusterRequestClusterInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsClusterRequestClusterInfoArgs Empty = new GetGitopsClusterRequestClusterInfoArgs();

    @Import(name="apiVersions")
    private @Nullable Output<List<String>> apiVersions;

    public Optional<Output<List<String>>> apiVersions() {
        return Optional.ofNullable(this.apiVersions);
    }

    @Import(name="applicationsCount")
    private @Nullable Output<String> applicationsCount;

    public Optional<Output<String>> applicationsCount() {
        return Optional.ofNullable(this.applicationsCount);
    }

    @Import(name="cacheInfos")
    private @Nullable Output<List<GetGitopsClusterRequestClusterInfoCacheInfoArgs>> cacheInfos;

    public Optional<Output<List<GetGitopsClusterRequestClusterInfoCacheInfoArgs>>> cacheInfos() {
        return Optional.ofNullable(this.cacheInfos);
    }

    @Import(name="connectionStates")
    private @Nullable Output<List<GetGitopsClusterRequestClusterInfoConnectionStateArgs>> connectionStates;

    public Optional<Output<List<GetGitopsClusterRequestClusterInfoConnectionStateArgs>>> connectionStates() {
        return Optional.ofNullable(this.connectionStates);
    }

    @Import(name="serverVersion")
    private @Nullable Output<String> serverVersion;

    public Optional<Output<String>> serverVersion() {
        return Optional.ofNullable(this.serverVersion);
    }

    private GetGitopsClusterRequestClusterInfoArgs() {}

    private GetGitopsClusterRequestClusterInfoArgs(GetGitopsClusterRequestClusterInfoArgs $) {
        this.apiVersions = $.apiVersions;
        this.applicationsCount = $.applicationsCount;
        this.cacheInfos = $.cacheInfos;
        this.connectionStates = $.connectionStates;
        this.serverVersion = $.serverVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsClusterRequestClusterInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsClusterRequestClusterInfoArgs $;

        public Builder() {
            $ = new GetGitopsClusterRequestClusterInfoArgs();
        }

        public Builder(GetGitopsClusterRequestClusterInfoArgs defaults) {
            $ = new GetGitopsClusterRequestClusterInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiVersions(@Nullable Output<List<String>> apiVersions) {
            $.apiVersions = apiVersions;
            return this;
        }

        public Builder apiVersions(List<String> apiVersions) {
            return apiVersions(Output.of(apiVersions));
        }

        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }

        public Builder applicationsCount(@Nullable Output<String> applicationsCount) {
            $.applicationsCount = applicationsCount;
            return this;
        }

        public Builder applicationsCount(String applicationsCount) {
            return applicationsCount(Output.of(applicationsCount));
        }

        public Builder cacheInfos(@Nullable Output<List<GetGitopsClusterRequestClusterInfoCacheInfoArgs>> cacheInfos) {
            $.cacheInfos = cacheInfos;
            return this;
        }

        public Builder cacheInfos(List<GetGitopsClusterRequestClusterInfoCacheInfoArgs> cacheInfos) {
            return cacheInfos(Output.of(cacheInfos));
        }

        public Builder cacheInfos(GetGitopsClusterRequestClusterInfoCacheInfoArgs... cacheInfos) {
            return cacheInfos(List.of(cacheInfos));
        }

        public Builder connectionStates(@Nullable Output<List<GetGitopsClusterRequestClusterInfoConnectionStateArgs>> connectionStates) {
            $.connectionStates = connectionStates;
            return this;
        }

        public Builder connectionStates(List<GetGitopsClusterRequestClusterInfoConnectionStateArgs> connectionStates) {
            return connectionStates(Output.of(connectionStates));
        }

        public Builder connectionStates(GetGitopsClusterRequestClusterInfoConnectionStateArgs... connectionStates) {
            return connectionStates(List.of(connectionStates));
        }

        public Builder serverVersion(@Nullable Output<String> serverVersion) {
            $.serverVersion = serverVersion;
            return this;
        }

        public Builder serverVersion(String serverVersion) {
            return serverVersion(Output.of(serverVersion));
        }

        public GetGitopsClusterRequestClusterInfoArgs build() {
            return $;
        }
    }

}
