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
public final class WorkspaceTerraformVariableFile {
    /**
     * @return Repository is the name of the repository to fetch the code from.
     * 
     */
    private String repository;
    /**
     * @return Repository branch is the name of the branch to fetch the variables from. This cannot be set if repository commit is set
     * 
     */
    private @Nullable String repositoryBranch;
    /**
     * @return Repository commit is commit or tag to fetch the variables from. This cannot be set if repository branch is set.
     * 
     */
    private @Nullable String repositoryCommit;
    /**
     * @return Repository connector is the reference to the connector used to fetch the variables.
     * 
     */
    private String repositoryConnector;
    /**
     * @return Repository path is the path in which the variables reside.
     * 
     */
    private @Nullable String repositoryPath;

    private WorkspaceTerraformVariableFile() {}
    /**
     * @return Repository is the name of the repository to fetch the code from.
     * 
     */
    public String repository() {
        return this.repository;
    }
    /**
     * @return Repository branch is the name of the branch to fetch the variables from. This cannot be set if repository commit is set
     * 
     */
    public Optional<String> repositoryBranch() {
        return Optional.ofNullable(this.repositoryBranch);
    }
    /**
     * @return Repository commit is commit or tag to fetch the variables from. This cannot be set if repository branch is set.
     * 
     */
    public Optional<String> repositoryCommit() {
        return Optional.ofNullable(this.repositoryCommit);
    }
    /**
     * @return Repository connector is the reference to the connector used to fetch the variables.
     * 
     */
    public String repositoryConnector() {
        return this.repositoryConnector;
    }
    /**
     * @return Repository path is the path in which the variables reside.
     * 
     */
    public Optional<String> repositoryPath() {
        return Optional.ofNullable(this.repositoryPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceTerraformVariableFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String repository;
        private @Nullable String repositoryBranch;
        private @Nullable String repositoryCommit;
        private String repositoryConnector;
        private @Nullable String repositoryPath;
        public Builder() {}
        public Builder(WorkspaceTerraformVariableFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.repositoryBranch = defaults.repositoryBranch;
    	      this.repositoryCommit = defaults.repositoryCommit;
    	      this.repositoryConnector = defaults.repositoryConnector;
    	      this.repositoryPath = defaults.repositoryPath;
        }

        @CustomType.Setter
        public Builder repository(String repository) {
            if (repository == null) {
              throw new MissingRequiredPropertyException("WorkspaceTerraformVariableFile", "repository");
            }
            this.repository = repository;
            return this;
        }
        @CustomType.Setter
        public Builder repositoryBranch(@Nullable String repositoryBranch) {

            this.repositoryBranch = repositoryBranch;
            return this;
        }
        @CustomType.Setter
        public Builder repositoryCommit(@Nullable String repositoryCommit) {

            this.repositoryCommit = repositoryCommit;
            return this;
        }
        @CustomType.Setter
        public Builder repositoryConnector(String repositoryConnector) {
            if (repositoryConnector == null) {
              throw new MissingRequiredPropertyException("WorkspaceTerraformVariableFile", "repositoryConnector");
            }
            this.repositoryConnector = repositoryConnector;
            return this;
        }
        @CustomType.Setter
        public Builder repositoryPath(@Nullable String repositoryPath) {

            this.repositoryPath = repositoryPath;
            return this;
        }
        public WorkspaceTerraformVariableFile build() {
            final var _resultValue = new WorkspaceTerraformVariableFile();
            _resultValue.repository = repository;
            _resultValue.repositoryBranch = repositoryBranch;
            _resultValue.repositoryCommit = repositoryCommit;
            _resultValue.repositoryConnector = repositoryConnector;
            _resultValue.repositoryPath = repositoryPath;
            return _resultValue;
        }
    }
}
