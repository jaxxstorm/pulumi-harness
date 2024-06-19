// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSyncPolicyAutomated;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSyncPolicy {
    /**
     * @return Controls the behavior of an automated sync.
     * 
     */
    private @Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomated> automateds;
    /**
     * @return Contains information about the strategy to apply when a sync failed.
     * 
     */
    private @Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyRetry> retries;
    /**
     * @return Options allow you to specify whole app sync-options.
     * 
     */
    private @Nullable List<String> syncOptions;

    private GetGitopsApplicationsApplicationSpecSyncPolicy() {}
    /**
     * @return Controls the behavior of an automated sync.
     * 
     */
    public List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomated> automateds() {
        return this.automateds == null ? List.of() : this.automateds;
    }
    /**
     * @return Contains information about the strategy to apply when a sync failed.
     * 
     */
    public List<GetGitopsApplicationsApplicationSpecSyncPolicyRetry> retries() {
        return this.retries == null ? List.of() : this.retries;
    }
    /**
     * @return Options allow you to specify whole app sync-options.
     * 
     */
    public List<String> syncOptions() {
        return this.syncOptions == null ? List.of() : this.syncOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSyncPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomated> automateds;
        private @Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyRetry> retries;
        private @Nullable List<String> syncOptions;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSyncPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automateds = defaults.automateds;
    	      this.retries = defaults.retries;
    	      this.syncOptions = defaults.syncOptions;
        }

        @CustomType.Setter
        public Builder automateds(@Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomated> automateds) {

            this.automateds = automateds;
            return this;
        }
        public Builder automateds(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated... automateds) {
            return automateds(List.of(automateds));
        }
        @CustomType.Setter
        public Builder retries(@Nullable List<GetGitopsApplicationsApplicationSpecSyncPolicyRetry> retries) {

            this.retries = retries;
            return this;
        }
        public Builder retries(GetGitopsApplicationsApplicationSpecSyncPolicyRetry... retries) {
            return retries(List.of(retries));
        }
        @CustomType.Setter
        public Builder syncOptions(@Nullable List<String> syncOptions) {

            this.syncOptions = syncOptions;
            return this;
        }
        public Builder syncOptions(String... syncOptions) {
            return syncOptions(List.of(syncOptions));
        }
        public GetGitopsApplicationsApplicationSpecSyncPolicy build() {
            final var _resultValue = new GetGitopsApplicationsApplicationSpecSyncPolicy();
            _resultValue.automateds = automateds;
            _resultValue.retries = retries;
            _resultValue.syncOptions = syncOptions;
            return _resultValue;
        }
    }
}
