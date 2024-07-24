// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecClusterResourceBlacklist;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecClusterResourceWhitelist;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecDestination;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecNamespaceResourceBlacklist;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecNamespaceResourceWhitelist;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecOrphanedResource;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecRole;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecSignatureKey;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpecSyncWindow;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitopsAppProjectProjectSpec {
    /**
     * @return Cluster resource blacklist for the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecClusterResourceBlacklist> clusterResourceBlacklists;
    /**
     * @return Cluster resource whitelist for the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecClusterResourceWhitelist> clusterResourceWhitelists;
    /**
     * @return Description of the GitOps project.
     * 
     */
    private @Nullable String description;
    /**
     * @return Destinations for deployment of the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecDestination> destinations;
    /**
     * @return Namespace resource blacklist for the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecNamespaceResourceBlacklist> namespaceResourceBlacklists;
    /**
     * @return Namespace resource whitelist for the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecNamespaceResourceWhitelist> namespaceResourceWhitelists;
    /**
     * @return Orphaned resources configuration for the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecOrphanedResource> orphanedResources;
    /**
     * @return Roles associated with the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecRole> roles;
    /**
     * @return Signature keys for the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecSignatureKey> signatureKeys;
    /**
     * @return Source repositories for the GitOps project.
     * 
     */
    private @Nullable List<String> sourceRepos;
    /**
     * @return Synchronization windows for the GitOps project.
     * 
     */
    private @Nullable List<GitopsAppProjectProjectSpecSyncWindow> syncWindows;

    private GitopsAppProjectProjectSpec() {}
    /**
     * @return Cluster resource blacklist for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecClusterResourceBlacklist> clusterResourceBlacklists() {
        return this.clusterResourceBlacklists == null ? List.of() : this.clusterResourceBlacklists;
    }
    /**
     * @return Cluster resource whitelist for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecClusterResourceWhitelist> clusterResourceWhitelists() {
        return this.clusterResourceWhitelists == null ? List.of() : this.clusterResourceWhitelists;
    }
    /**
     * @return Description of the GitOps project.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Destinations for deployment of the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecDestination> destinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }
    /**
     * @return Namespace resource blacklist for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecNamespaceResourceBlacklist> namespaceResourceBlacklists() {
        return this.namespaceResourceBlacklists == null ? List.of() : this.namespaceResourceBlacklists;
    }
    /**
     * @return Namespace resource whitelist for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecNamespaceResourceWhitelist> namespaceResourceWhitelists() {
        return this.namespaceResourceWhitelists == null ? List.of() : this.namespaceResourceWhitelists;
    }
    /**
     * @return Orphaned resources configuration for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecOrphanedResource> orphanedResources() {
        return this.orphanedResources == null ? List.of() : this.orphanedResources;
    }
    /**
     * @return Roles associated with the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecRole> roles() {
        return this.roles == null ? List.of() : this.roles;
    }
    /**
     * @return Signature keys for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecSignatureKey> signatureKeys() {
        return this.signatureKeys == null ? List.of() : this.signatureKeys;
    }
    /**
     * @return Source repositories for the GitOps project.
     * 
     */
    public List<String> sourceRepos() {
        return this.sourceRepos == null ? List.of() : this.sourceRepos;
    }
    /**
     * @return Synchronization windows for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpecSyncWindow> syncWindows() {
        return this.syncWindows == null ? List.of() : this.syncWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsAppProjectProjectSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitopsAppProjectProjectSpecClusterResourceBlacklist> clusterResourceBlacklists;
        private @Nullable List<GitopsAppProjectProjectSpecClusterResourceWhitelist> clusterResourceWhitelists;
        private @Nullable String description;
        private @Nullable List<GitopsAppProjectProjectSpecDestination> destinations;
        private @Nullable List<GitopsAppProjectProjectSpecNamespaceResourceBlacklist> namespaceResourceBlacklists;
        private @Nullable List<GitopsAppProjectProjectSpecNamespaceResourceWhitelist> namespaceResourceWhitelists;
        private @Nullable List<GitopsAppProjectProjectSpecOrphanedResource> orphanedResources;
        private @Nullable List<GitopsAppProjectProjectSpecRole> roles;
        private @Nullable List<GitopsAppProjectProjectSpecSignatureKey> signatureKeys;
        private @Nullable List<String> sourceRepos;
        private @Nullable List<GitopsAppProjectProjectSpecSyncWindow> syncWindows;
        public Builder() {}
        public Builder(GitopsAppProjectProjectSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterResourceBlacklists = defaults.clusterResourceBlacklists;
    	      this.clusterResourceWhitelists = defaults.clusterResourceWhitelists;
    	      this.description = defaults.description;
    	      this.destinations = defaults.destinations;
    	      this.namespaceResourceBlacklists = defaults.namespaceResourceBlacklists;
    	      this.namespaceResourceWhitelists = defaults.namespaceResourceWhitelists;
    	      this.orphanedResources = defaults.orphanedResources;
    	      this.roles = defaults.roles;
    	      this.signatureKeys = defaults.signatureKeys;
    	      this.sourceRepos = defaults.sourceRepos;
    	      this.syncWindows = defaults.syncWindows;
        }

        @CustomType.Setter
        public Builder clusterResourceBlacklists(@Nullable List<GitopsAppProjectProjectSpecClusterResourceBlacklist> clusterResourceBlacklists) {

            this.clusterResourceBlacklists = clusterResourceBlacklists;
            return this;
        }
        public Builder clusterResourceBlacklists(GitopsAppProjectProjectSpecClusterResourceBlacklist... clusterResourceBlacklists) {
            return clusterResourceBlacklists(List.of(clusterResourceBlacklists));
        }
        @CustomType.Setter
        public Builder clusterResourceWhitelists(@Nullable List<GitopsAppProjectProjectSpecClusterResourceWhitelist> clusterResourceWhitelists) {

            this.clusterResourceWhitelists = clusterResourceWhitelists;
            return this;
        }
        public Builder clusterResourceWhitelists(GitopsAppProjectProjectSpecClusterResourceWhitelist... clusterResourceWhitelists) {
            return clusterResourceWhitelists(List.of(clusterResourceWhitelists));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinations(@Nullable List<GitopsAppProjectProjectSpecDestination> destinations) {

            this.destinations = destinations;
            return this;
        }
        public Builder destinations(GitopsAppProjectProjectSpecDestination... destinations) {
            return destinations(List.of(destinations));
        }
        @CustomType.Setter
        public Builder namespaceResourceBlacklists(@Nullable List<GitopsAppProjectProjectSpecNamespaceResourceBlacklist> namespaceResourceBlacklists) {

            this.namespaceResourceBlacklists = namespaceResourceBlacklists;
            return this;
        }
        public Builder namespaceResourceBlacklists(GitopsAppProjectProjectSpecNamespaceResourceBlacklist... namespaceResourceBlacklists) {
            return namespaceResourceBlacklists(List.of(namespaceResourceBlacklists));
        }
        @CustomType.Setter
        public Builder namespaceResourceWhitelists(@Nullable List<GitopsAppProjectProjectSpecNamespaceResourceWhitelist> namespaceResourceWhitelists) {

            this.namespaceResourceWhitelists = namespaceResourceWhitelists;
            return this;
        }
        public Builder namespaceResourceWhitelists(GitopsAppProjectProjectSpecNamespaceResourceWhitelist... namespaceResourceWhitelists) {
            return namespaceResourceWhitelists(List.of(namespaceResourceWhitelists));
        }
        @CustomType.Setter
        public Builder orphanedResources(@Nullable List<GitopsAppProjectProjectSpecOrphanedResource> orphanedResources) {

            this.orphanedResources = orphanedResources;
            return this;
        }
        public Builder orphanedResources(GitopsAppProjectProjectSpecOrphanedResource... orphanedResources) {
            return orphanedResources(List.of(orphanedResources));
        }
        @CustomType.Setter
        public Builder roles(@Nullable List<GitopsAppProjectProjectSpecRole> roles) {

            this.roles = roles;
            return this;
        }
        public Builder roles(GitopsAppProjectProjectSpecRole... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder signatureKeys(@Nullable List<GitopsAppProjectProjectSpecSignatureKey> signatureKeys) {

            this.signatureKeys = signatureKeys;
            return this;
        }
        public Builder signatureKeys(GitopsAppProjectProjectSpecSignatureKey... signatureKeys) {
            return signatureKeys(List.of(signatureKeys));
        }
        @CustomType.Setter
        public Builder sourceRepos(@Nullable List<String> sourceRepos) {

            this.sourceRepos = sourceRepos;
            return this;
        }
        public Builder sourceRepos(String... sourceRepos) {
            return sourceRepos(List.of(sourceRepos));
        }
        @CustomType.Setter
        public Builder syncWindows(@Nullable List<GitopsAppProjectProjectSpecSyncWindow> syncWindows) {

            this.syncWindows = syncWindows;
            return this;
        }
        public Builder syncWindows(GitopsAppProjectProjectSpecSyncWindow... syncWindows) {
            return syncWindows(List.of(syncWindows));
        }
        public GitopsAppProjectProjectSpec build() {
            final var _resultValue = new GitopsAppProjectProjectSpec();
            _resultValue.clusterResourceBlacklists = clusterResourceBlacklists;
            _resultValue.clusterResourceWhitelists = clusterResourceWhitelists;
            _resultValue.description = description;
            _resultValue.destinations = destinations;
            _resultValue.namespaceResourceBlacklists = namespaceResourceBlacklists;
            _resultValue.namespaceResourceWhitelists = namespaceResourceWhitelists;
            _resultValue.orphanedResources = orphanedResources;
            _resultValue.roles = roles;
            _resultValue.signatureKeys = signatureKeys;
            _resultValue.sourceRepos = sourceRepos;
            _resultValue.syncWindows = syncWindows;
            return _resultValue;
        }
    }
}
