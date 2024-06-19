// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTemplateGitDetails {
    /**
     * @return Name of the branch.
     * 
     */
    private @Nullable String branchName;
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    private @Nullable String filePath;
    /**
     * @return File url of the Entity in the repository.
     * 
     */
    private @Nullable String fileUrl;
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
    private @Nullable String repoName;
    /**
     * @return Repo url of the Entity in the repository.
     * 
     */
    private @Nullable String repoUrl;

    private GetTemplateGitDetails() {}
    /**
     * @return Name of the branch.
     * 
     */
    public Optional<String> branchName() {
        return Optional.ofNullable(this.branchName);
    }
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }
    /**
     * @return File url of the Entity in the repository.
     * 
     */
    public Optional<String> fileUrl() {
        return Optional.ofNullable(this.fileUrl);
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
    public Optional<String> repoName() {
        return Optional.ofNullable(this.repoName);
    }
    /**
     * @return Repo url of the Entity in the repository.
     * 
     */
    public Optional<String> repoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateGitDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String filePath;
        private @Nullable String fileUrl;
        private String lastCommitId;
        private String lastObjectId;
        private @Nullable String repoName;
        private @Nullable String repoUrl;
        public Builder() {}
        public Builder(GetTemplateGitDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.filePath = defaults.filePath;
    	      this.fileUrl = defaults.fileUrl;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.lastObjectId = defaults.lastObjectId;
    	      this.repoName = defaults.repoName;
    	      this.repoUrl = defaults.repoUrl;
        }

        @CustomType.Setter
        public Builder branchName(@Nullable String branchName) {

            this.branchName = branchName;
            return this;
        }
        @CustomType.Setter
        public Builder filePath(@Nullable String filePath) {

            this.filePath = filePath;
            return this;
        }
        @CustomType.Setter
        public Builder fileUrl(@Nullable String fileUrl) {

            this.fileUrl = fileUrl;
            return this;
        }
        @CustomType.Setter
        public Builder lastCommitId(String lastCommitId) {
            if (lastCommitId == null) {
              throw new MissingRequiredPropertyException("GetTemplateGitDetails", "lastCommitId");
            }
            this.lastCommitId = lastCommitId;
            return this;
        }
        @CustomType.Setter
        public Builder lastObjectId(String lastObjectId) {
            if (lastObjectId == null) {
              throw new MissingRequiredPropertyException("GetTemplateGitDetails", "lastObjectId");
            }
            this.lastObjectId = lastObjectId;
            return this;
        }
        @CustomType.Setter
        public Builder repoName(@Nullable String repoName) {

            this.repoName = repoName;
            return this;
        }
        @CustomType.Setter
        public Builder repoUrl(@Nullable String repoUrl) {

            this.repoUrl = repoUrl;
            return this;
        }
        public GetTemplateGitDetails build() {
            final var _resultValue = new GetTemplateGitDetails();
            _resultValue.branchName = branchName;
            _resultValue.filePath = filePath;
            _resultValue.fileUrl = fileUrl;
            _resultValue.lastCommitId = lastCommitId;
            _resultValue.lastObjectId = lastObjectId;
            _resultValue.repoName = repoName;
            _resultValue.repoUrl = repoUrl;
            return _resultValue;
        }
    }
}
