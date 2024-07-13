// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetInfrastructureGitDetails extends com.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureGitDetails Empty = new GetInfrastructureGitDetails();

    /**
     * Name of the branch.
     * 
     */
    @Import(name="branch", required=true)
    private String branch;

    /**
     * @return Name of the branch.
     * 
     */
    public String branch() {
        return this.branch;
    }

    /**
     * If the Entity is to be fetched from cache
     * 
     */
    @Import(name="loadFromCache", required=true)
    private String loadFromCache;

    /**
     * @return If the Entity is to be fetched from cache
     * 
     */
    public String loadFromCache() {
        return this.loadFromCache;
    }

    /**
     * Load Infrastructure yaml from fallback branch
     * 
     */
    @Import(name="loadFromFallbackBranch", required=true)
    private Boolean loadFromFallbackBranch;

    /**
     * @return Load Infrastructure yaml from fallback branch
     * 
     */
    public Boolean loadFromFallbackBranch() {
        return this.loadFromFallbackBranch;
    }

    /**
     * Repo name of remote Infrastructure
     * 
     */
    @Import(name="repoName", required=true)
    private String repoName;

    /**
     * @return Repo name of remote Infrastructure
     * 
     */
    public String repoName() {
        return this.repoName;
    }

    private GetInfrastructureGitDetails() {}

    private GetInfrastructureGitDetails(GetInfrastructureGitDetails $) {
        this.branch = $.branch;
        this.loadFromCache = $.loadFromCache;
        this.loadFromFallbackBranch = $.loadFromFallbackBranch;
        this.repoName = $.repoName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfrastructureGitDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfrastructureGitDetails $;

        public Builder() {
            $ = new GetInfrastructureGitDetails();
        }

        public Builder(GetInfrastructureGitDetails defaults) {
            $ = new GetInfrastructureGitDetails(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch Name of the branch.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param loadFromCache If the Entity is to be fetched from cache
         * 
         * @return builder
         * 
         */
        public Builder loadFromCache(String loadFromCache) {
            $.loadFromCache = loadFromCache;
            return this;
        }

        /**
         * @param loadFromFallbackBranch Load Infrastructure yaml from fallback branch
         * 
         * @return builder
         * 
         */
        public Builder loadFromFallbackBranch(Boolean loadFromFallbackBranch) {
            $.loadFromFallbackBranch = loadFromFallbackBranch;
            return this;
        }

        /**
         * @param repoName Repo name of remote Infrastructure
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            $.repoName = repoName;
            return this;
        }

        public GetInfrastructureGitDetails build() {
            if ($.branch == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureGitDetails", "branch");
            }
            if ($.loadFromCache == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureGitDetails", "loadFromCache");
            }
            if ($.loadFromFallbackBranch == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureGitDetails", "loadFromFallbackBranch");
            }
            if ($.repoName == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureGitDetails", "repoName");
            }
            return $;
        }
    }

}