// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsClusterRequestClusterInfoCacheInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsClusterRequestClusterInfoCacheInfoArgs Empty = new GitOpsClusterRequestClusterInfoCacheInfoArgs();

    /**
     * Number of observed kubernetes API count.
     * 
     */
    @Import(name="apisCount")
    private @Nullable Output<String> apisCount;

    /**
     * @return Number of observed kubernetes API count.
     * 
     */
    public Optional<Output<String>> apisCount() {
        return Optional.ofNullable(this.apisCount);
    }

    /**
     * Time of most recent cache synchronization.
     * 
     */
    @Import(name="lastCacheSyncTime")
    private @Nullable Output<String> lastCacheSyncTime;

    /**
     * @return Time of most recent cache synchronization.
     * 
     */
    public Optional<Output<String>> lastCacheSyncTime() {
        return Optional.ofNullable(this.lastCacheSyncTime);
    }

    /**
     * Number of observed kubernetes resources.
     * 
     */
    @Import(name="resourcesCount")
    private @Nullable Output<String> resourcesCount;

    /**
     * @return Number of observed kubernetes resources.
     * 
     */
    public Optional<Output<String>> resourcesCount() {
        return Optional.ofNullable(this.resourcesCount);
    }

    private GitOpsClusterRequestClusterInfoCacheInfoArgs() {}

    private GitOpsClusterRequestClusterInfoCacheInfoArgs(GitOpsClusterRequestClusterInfoCacheInfoArgs $) {
        this.apisCount = $.apisCount;
        this.lastCacheSyncTime = $.lastCacheSyncTime;
        this.resourcesCount = $.resourcesCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsClusterRequestClusterInfoCacheInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsClusterRequestClusterInfoCacheInfoArgs $;

        public Builder() {
            $ = new GitOpsClusterRequestClusterInfoCacheInfoArgs();
        }

        public Builder(GitOpsClusterRequestClusterInfoCacheInfoArgs defaults) {
            $ = new GitOpsClusterRequestClusterInfoCacheInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apisCount Number of observed kubernetes API count.
         * 
         * @return builder
         * 
         */
        public Builder apisCount(@Nullable Output<String> apisCount) {
            $.apisCount = apisCount;
            return this;
        }

        /**
         * @param apisCount Number of observed kubernetes API count.
         * 
         * @return builder
         * 
         */
        public Builder apisCount(String apisCount) {
            return apisCount(Output.of(apisCount));
        }

        /**
         * @param lastCacheSyncTime Time of most recent cache synchronization.
         * 
         * @return builder
         * 
         */
        public Builder lastCacheSyncTime(@Nullable Output<String> lastCacheSyncTime) {
            $.lastCacheSyncTime = lastCacheSyncTime;
            return this;
        }

        /**
         * @param lastCacheSyncTime Time of most recent cache synchronization.
         * 
         * @return builder
         * 
         */
        public Builder lastCacheSyncTime(String lastCacheSyncTime) {
            return lastCacheSyncTime(Output.of(lastCacheSyncTime));
        }

        /**
         * @param resourcesCount Number of observed kubernetes resources.
         * 
         * @return builder
         * 
         */
        public Builder resourcesCount(@Nullable Output<String> resourcesCount) {
            $.resourcesCount = resourcesCount;
            return this;
        }

        /**
         * @param resourcesCount Number of observed kubernetes resources.
         * 
         * @return builder
         * 
         */
        public Builder resourcesCount(String resourcesCount) {
            return resourcesCount(Output.of(resourcesCount));
        }

        public GitOpsClusterRequestClusterInfoCacheInfoArgs build() {
            return $;
        }
    }

}
