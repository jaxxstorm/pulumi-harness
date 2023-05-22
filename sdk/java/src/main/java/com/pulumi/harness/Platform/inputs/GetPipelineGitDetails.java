// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineGitDetails extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineGitDetails Empty = new GetPipelineGitDetails();

    /**
     * Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    @Import(name="baseBranch", required=true)
    private String baseBranch;

    /**
     * @return Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    public String baseBranch() {
        return this.baseBranch;
    }

    /**
     * Name of the branch.
     * 
     */
    @Import(name="branchName", required=true)
    private String branchName;

    /**
     * @return Name of the branch.
     * 
     */
    public String branchName() {
        return this.branchName;
    }

    /**
     * Commit message used for the merge commit.
     * 
     */
    @Import(name="commitMessage", required=true)
    private String commitMessage;

    /**
     * @return Commit message used for the merge commit.
     * 
     */
    public String commitMessage() {
        return this.commitMessage;
    }

    /**
     * Identifier of the Harness Connector used for CRUD operations on the Entity.
     * 
     */
    @Import(name="connectorRef", required=true)
    private String connectorRef;

    /**
     * @return Identifier of the Harness Connector used for CRUD operations on the Entity.
     * 
     */
    public String connectorRef() {
        return this.connectorRef;
    }

    /**
     * File path of the Entity in the repository.
     * 
     */
    @Import(name="filePath", required=true)
    private String filePath;

    /**
     * @return File path of the Entity in the repository.
     * 
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
     * 
     */
    @Import(name="lastCommitId", required=true)
    private String lastCommitId;

    /**
     * @return Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
     * 
     */
    public String lastCommitId() {
        return this.lastCommitId;
    }

    /**
     * Last object identifier (for Github). To be provided only when updating Pipeline.
     * 
     */
    @Import(name="lastObjectId", required=true)
    private String lastObjectId;

    /**
     * @return Last object identifier (for Github). To be provided only when updating Pipeline.
     * 
     */
    public String lastObjectId() {
        return this.lastObjectId;
    }

    /**
     * Name of the repository.
     * 
     */
    @Import(name="repoName", required=true)
    private String repoName;

    /**
     * @return Name of the repository.
     * 
     */
    public String repoName() {
        return this.repoName;
    }

    /**
     * Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    @Import(name="storeType", required=true)
    private String storeType;

    /**
     * @return Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    public String storeType() {
        return this.storeType;
    }

    private GetPipelineGitDetails() {}

    private GetPipelineGitDetails(GetPipelineGitDetails $) {
        this.baseBranch = $.baseBranch;
        this.branchName = $.branchName;
        this.commitMessage = $.commitMessage;
        this.connectorRef = $.connectorRef;
        this.filePath = $.filePath;
        this.lastCommitId = $.lastCommitId;
        this.lastObjectId = $.lastObjectId;
        this.repoName = $.repoName;
        this.storeType = $.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineGitDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineGitDetails $;

        public Builder() {
            $ = new GetPipelineGitDetails();
        }

        public Builder(GetPipelineGitDetails defaults) {
            $ = new GetPipelineGitDetails(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseBranch Name of the default branch (this checks out a new branch titled by branch_name).
         * 
         * @return builder
         * 
         */
        public Builder baseBranch(String baseBranch) {
            $.baseBranch = baseBranch;
            return this;
        }

        /**
         * @param branchName Name of the branch.
         * 
         * @return builder
         * 
         */
        public Builder branchName(String branchName) {
            $.branchName = branchName;
            return this;
        }

        /**
         * @param commitMessage Commit message used for the merge commit.
         * 
         * @return builder
         * 
         */
        public Builder commitMessage(String commitMessage) {
            $.commitMessage = commitMessage;
            return this;
        }

        /**
         * @param connectorRef Identifier of the Harness Connector used for CRUD operations on the Entity.
         * 
         * @return builder
         * 
         */
        public Builder connectorRef(String connectorRef) {
            $.connectorRef = connectorRef;
            return this;
        }

        /**
         * @param filePath File path of the Entity in the repository.
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param lastCommitId Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(String lastCommitId) {
            $.lastCommitId = lastCommitId;
            return this;
        }

        /**
         * @param lastObjectId Last object identifier (for Github). To be provided only when updating Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder lastObjectId(String lastObjectId) {
            $.lastObjectId = lastObjectId;
            return this;
        }

        /**
         * @param repoName Name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            $.repoName = repoName;
            return this;
        }

        /**
         * @param storeType Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
         * 
         * @return builder
         * 
         */
        public Builder storeType(String storeType) {
            $.storeType = storeType;
            return this;
        }

        public GetPipelineGitDetails build() {
            $.baseBranch = Objects.requireNonNull($.baseBranch, "expected parameter 'baseBranch' to be non-null");
            $.branchName = Objects.requireNonNull($.branchName, "expected parameter 'branchName' to be non-null");
            $.commitMessage = Objects.requireNonNull($.commitMessage, "expected parameter 'commitMessage' to be non-null");
            $.connectorRef = Objects.requireNonNull($.connectorRef, "expected parameter 'connectorRef' to be non-null");
            $.filePath = Objects.requireNonNull($.filePath, "expected parameter 'filePath' to be non-null");
            $.lastCommitId = Objects.requireNonNull($.lastCommitId, "expected parameter 'lastCommitId' to be non-null");
            $.lastObjectId = Objects.requireNonNull($.lastObjectId, "expected parameter 'lastObjectId' to be non-null");
            $.repoName = Objects.requireNonNull($.repoName, "expected parameter 'repoName' to be non-null");
            $.storeType = Objects.requireNonNull($.storeType, "expected parameter 'storeType' to be non-null");
            return $;
        }
    }

}
