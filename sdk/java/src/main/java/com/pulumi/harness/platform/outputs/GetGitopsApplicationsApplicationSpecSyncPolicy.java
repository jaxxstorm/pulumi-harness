// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSyncPolicyAutomated;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSyncPolicy {
    /**
     * @return Controls the behavior of an automated sync.
     * 
     */
    private List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomated> automateds;
    /**
     * @return Contains information about the strategy to apply when a sync failed.
     * 
     */
    private List<GetGitopsApplicationsApplicationSpecSyncPolicyRetry> retries;
    /**
     * @return Options allow you to specify whole app sync-options.
     * 
     */
    private List<String> syncOptions;

    private GetGitopsApplicationsApplicationSpecSyncPolicy() {}
    /**
     * @return Controls the behavior of an automated sync.
     * 
     */
    public List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomated> automateds() {
        return this.automateds;
    }
    /**
     * @return Contains information about the strategy to apply when a sync failed.
     * 
     */
    public List<GetGitopsApplicationsApplicationSpecSyncPolicyRetry> retries() {
        return this.retries;
    }
    /**
     * @return Options allow you to specify whole app sync-options.
     * 
     */
    public List<String> syncOptions() {
        return this.syncOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSyncPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomated> automateds;
        private List<GetGitopsApplicationsApplicationSpecSyncPolicyRetry> retries;
        private List<String> syncOptions;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSyncPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automateds = defaults.automateds;
    	      this.retries = defaults.retries;
    	      this.syncOptions = defaults.syncOptions;
        }

        @CustomType.Setter
        public Builder automateds(List<GetGitopsApplicationsApplicationSpecSyncPolicyAutomated> automateds) {
            if (automateds == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSyncPolicy", "automateds");
            }
            this.automateds = automateds;
            return this;
        }
        public Builder automateds(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated... automateds) {
            return automateds(List.of(automateds));
        }
        @CustomType.Setter
        public Builder retries(List<GetGitopsApplicationsApplicationSpecSyncPolicyRetry> retries) {
            if (retries == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSyncPolicy", "retries");
            }
            this.retries = retries;
            return this;
        }
        public Builder retries(GetGitopsApplicationsApplicationSpecSyncPolicyRetry... retries) {
            return retries(List.of(retries));
        }
        @CustomType.Setter
        public Builder syncOptions(List<String> syncOptions) {
            if (syncOptions == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSyncPolicy", "syncOptions");
            }
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