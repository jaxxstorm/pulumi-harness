// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetGitopsClusterRequestCluster;
import com.pulumi.harness.platform.outputs.GetGitopsClusterRequestId;
import com.pulumi.harness.platform.outputs.GetGitopsClusterRequestUpdateMask;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsClusterRequest {
    /**
     * @return GitOps cluster details.
     * 
     */
    private @Nullable List<GetGitopsClusterRequestCluster> clusters;
    /**
     * @return Cluster server URL or the cluster name.
     * 
     */
    private @Nullable List<GetGitopsClusterRequestId> ids;
    /**
     * @return Tags associated with the clusters
     * 
     */
    private List<String> tags;
    /**
     * @return Update mask of the GitOps cluster.
     * 
     */
    private @Nullable List<GetGitopsClusterRequestUpdateMask> updateMasks;
    /**
     * @return Fields which are updated.
     * 
     */
    private @Nullable List<String> updatedFields;
    /**
     * @return Indicates if the GitOps cluster should be updated if existing and inserted if not.
     * 
     */
    private @Nullable Boolean upsert;

    private GetGitopsClusterRequest() {}
    /**
     * @return GitOps cluster details.
     * 
     */
    public List<GetGitopsClusterRequestCluster> clusters() {
        return this.clusters == null ? List.of() : this.clusters;
    }
    /**
     * @return Cluster server URL or the cluster name.
     * 
     */
    public List<GetGitopsClusterRequestId> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    /**
     * @return Tags associated with the clusters
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Update mask of the GitOps cluster.
     * 
     */
    public List<GetGitopsClusterRequestUpdateMask> updateMasks() {
        return this.updateMasks == null ? List.of() : this.updateMasks;
    }
    /**
     * @return Fields which are updated.
     * 
     */
    public List<String> updatedFields() {
        return this.updatedFields == null ? List.of() : this.updatedFields;
    }
    /**
     * @return Indicates if the GitOps cluster should be updated if existing and inserted if not.
     * 
     */
    public Optional<Boolean> upsert() {
        return Optional.ofNullable(this.upsert);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsClusterRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetGitopsClusterRequestCluster> clusters;
        private @Nullable List<GetGitopsClusterRequestId> ids;
        private List<String> tags;
        private @Nullable List<GetGitopsClusterRequestUpdateMask> updateMasks;
        private @Nullable List<String> updatedFields;
        private @Nullable Boolean upsert;
        public Builder() {}
        public Builder(GetGitopsClusterRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusters = defaults.clusters;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
    	      this.updateMasks = defaults.updateMasks;
    	      this.updatedFields = defaults.updatedFields;
    	      this.upsert = defaults.upsert;
        }

        @CustomType.Setter
        public Builder clusters(@Nullable List<GetGitopsClusterRequestCluster> clusters) {

            this.clusters = clusters;
            return this;
        }
        public Builder clusters(GetGitopsClusterRequestCluster... clusters) {
            return clusters(List.of(clusters));
        }
        @CustomType.Setter
        public Builder ids(@Nullable List<GetGitopsClusterRequestId> ids) {

            this.ids = ids;
            return this;
        }
        public Builder ids(GetGitopsClusterRequestId... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetGitopsClusterRequest", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder updateMasks(@Nullable List<GetGitopsClusterRequestUpdateMask> updateMasks) {

            this.updateMasks = updateMasks;
            return this;
        }
        public Builder updateMasks(GetGitopsClusterRequestUpdateMask... updateMasks) {
            return updateMasks(List.of(updateMasks));
        }
        @CustomType.Setter
        public Builder updatedFields(@Nullable List<String> updatedFields) {

            this.updatedFields = updatedFields;
            return this;
        }
        public Builder updatedFields(String... updatedFields) {
            return updatedFields(List.of(updatedFields));
        }
        @CustomType.Setter
        public Builder upsert(@Nullable Boolean upsert) {

            this.upsert = upsert;
            return this;
        }
        public GetGitopsClusterRequest build() {
            final var _resultValue = new GetGitopsClusterRequest();
            _resultValue.clusters = clusters;
            _resultValue.ids = ids;
            _resultValue.tags = tags;
            _resultValue.updateMasks = updateMasks;
            _resultValue.updatedFields = updatedFields;
            _resultValue.upsert = upsert;
            return _resultValue;
        }
    }
}
