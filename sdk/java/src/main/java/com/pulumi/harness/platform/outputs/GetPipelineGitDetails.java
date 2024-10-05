// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPipelineGitDetails {
    /**
     * @return Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    private String baseBranch;
    /**
     * @return Name of the branch.
     * 
     */
    private String branchName;
    /**
     * @return Commit message used for the merge commit.
     * 
     */
    private String commitMessage;
    /**
     * @return Identifier of the Harness Connector used for CRUD operations on the Entity.
     * 
     */
    private String connectorRef;
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    private String filePath;
    /**
     * @return Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
     * 
     */
    private String lastCommitId;
    /**
     * @return Last object identifier (for Github). To be provided only when updating Pipeline.
     * 
     */
    private String lastObjectId;
    /**
     * @return Name of the repository.
     * 
     */
    private String repoName;
    /**
     * @return Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    private String storeType;

    private GetPipelineGitDetails() {}
    /**
     * @return Name of the default branch (this checks out a new branch titled by branch_name).
     * 
     */
    public String baseBranch() {
        return this.baseBranch;
    }
    /**
     * @return Name of the branch.
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return Commit message used for the merge commit.
     * 
     */
    public String commitMessage() {
        return this.commitMessage;
    }
    /**
     * @return Identifier of the Harness Connector used for CRUD operations on the Entity.
     * 
     */
    public String connectorRef() {
        return this.connectorRef;
    }
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    public String filePath() {
        return this.filePath;
    }
    /**
     * @return Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
     * 
     */
    public String lastCommitId() {
        return this.lastCommitId;
    }
    /**
     * @return Last object identifier (for Github). To be provided only when updating Pipeline.
     * 
     */
    public String lastObjectId() {
        return this.lastObjectId;
    }
    /**
     * @return Name of the repository.
     * 
     */
    public String repoName() {
        return this.repoName;
    }
    /**
     * @return Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
     * 
     */
    public String storeType() {
        return this.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineGitDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String baseBranch;
        private String branchName;
        private String commitMessage;
        private String connectorRef;
        private String filePath;
        private String lastCommitId;
        private String lastObjectId;
        private String repoName;
        private String storeType;
        public Builder() {}
        public Builder(GetPipelineGitDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseBranch = defaults.baseBranch;
    	      this.branchName = defaults.branchName;
    	      this.commitMessage = defaults.commitMessage;
    	      this.connectorRef = defaults.connectorRef;
    	      this.filePath = defaults.filePath;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.lastObjectId = defaults.lastObjectId;
    	      this.repoName = defaults.repoName;
    	      this.storeType = defaults.storeType;
        }

        @CustomType.Setter
        public Builder baseBranch(String baseBranch) {
            if (baseBranch == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "baseBranch");
            }
            this.baseBranch = baseBranch;
            return this;
        }
        @CustomType.Setter
        public Builder branchName(String branchName) {
            if (branchName == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "branchName");
            }
            this.branchName = branchName;
            return this;
        }
        @CustomType.Setter
        public Builder commitMessage(String commitMessage) {
            if (commitMessage == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "commitMessage");
            }
            this.commitMessage = commitMessage;
            return this;
        }
        @CustomType.Setter
        public Builder connectorRef(String connectorRef) {
            if (connectorRef == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "connectorRef");
            }
            this.connectorRef = connectorRef;
            return this;
        }
        @CustomType.Setter
        public Builder filePath(String filePath) {
            if (filePath == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "filePath");
            }
            this.filePath = filePath;
            return this;
        }
        @CustomType.Setter
        public Builder lastCommitId(String lastCommitId) {
            if (lastCommitId == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "lastCommitId");
            }
            this.lastCommitId = lastCommitId;
            return this;
        }
        @CustomType.Setter
        public Builder lastObjectId(String lastObjectId) {
            if (lastObjectId == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "lastObjectId");
            }
            this.lastObjectId = lastObjectId;
            return this;
        }
        @CustomType.Setter
        public Builder repoName(String repoName) {
            if (repoName == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "repoName");
            }
            this.repoName = repoName;
            return this;
        }
        @CustomType.Setter
        public Builder storeType(String storeType) {
            if (storeType == null) {
              throw new MissingRequiredPropertyException("GetPipelineGitDetails", "storeType");
            }
            this.storeType = storeType;
            return this;
        }
        public GetPipelineGitDetails build() {
            final var _resultValue = new GetPipelineGitDetails();
            _resultValue.baseBranch = baseBranch;
            _resultValue.branchName = branchName;
            _resultValue.commitMessage = commitMessage;
            _resultValue.connectorRef = connectorRef;
            _resultValue.filePath = filePath;
            _resultValue.lastCommitId = lastCommitId;
            _resultValue.lastObjectId = lastObjectId;
            _resultValue.repoName = repoName;
            _resultValue.storeType = storeType;
            return _resultValue;
        }
    }
}