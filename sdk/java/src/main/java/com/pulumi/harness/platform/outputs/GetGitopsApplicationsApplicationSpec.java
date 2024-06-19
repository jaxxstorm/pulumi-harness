// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecDestination;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSource;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSyncPolicy;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsApplicationsApplicationSpec {
    /**
     * @return Information about the GitOps application&#39;s destination.
     * 
     */
    private @Nullable List<GetGitopsApplicationsApplicationSpecDestination> destinations;
    /**
     * @return Contains all information about the source of a GitOps application.
     * 
     */
    private @Nullable List<GetGitopsApplicationsApplicationSpecSource> sources;
    /**
     * @return Controls when a sync will be performed in response to updates in git.
     * 
     */
    private @Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicy> syncPolicies;

    private GetGitopsApplicationsApplicationSpec() {}
    /**
     * @return Information about the GitOps application&#39;s destination.
     * 
     */
    public List<GetGitopsApplicationsApplicationSpecDestination> destinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }
    /**
     * @return Contains all information about the source of a GitOps application.
     * 
     */
    public List<GetGitopsApplicationsApplicationSpecSource> sources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * @return Controls when a sync will be performed in response to updates in git.
     * 
     */
    public List<GetGitopsApplicationsApplicationSpecSyncPolicy> syncPolicies() {
        return this.syncPolicies == null ? List.of() : this.syncPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetGitopsApplicationsApplicationSpecDestination> destinations;
        private @Nullable List<GetGitopsApplicationsApplicationSpecSource> sources;
        private @Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicy> syncPolicies;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.sources = defaults.sources;
    	      this.syncPolicies = defaults.syncPolicies;
        }

        @CustomType.Setter
        public Builder destinations(@Nullable List<GetGitopsApplicationsApplicationSpecDestination> destinations) {

            this.destinations = destinations;
            return this;
        }
        public Builder destinations(GetGitopsApplicationsApplicationSpecDestination... destinations) {
            return destinations(List.of(destinations));
        }
        @CustomType.Setter
        public Builder sources(@Nullable List<GetGitopsApplicationsApplicationSpecSource> sources) {

            this.sources = sources;
            return this;
        }
        public Builder sources(GetGitopsApplicationsApplicationSpecSource... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder syncPolicies(@Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicy> syncPolicies) {

            this.syncPolicies = syncPolicies;
            return this;
        }
        public Builder syncPolicies(GetGitopsApplicationsApplicationSpecSyncPolicy... syncPolicies) {
            return syncPolicies(List.of(syncPolicies));
        }
        public GetGitopsApplicationsApplicationSpec build() {
            final var _resultValue = new GetGitopsApplicationsApplicationSpec();
            _resultValue.destinations = destinations;
            _resultValue.sources = sources;
            _resultValue.syncPolicies = syncPolicies;
            return _resultValue;
        }
    }
}
