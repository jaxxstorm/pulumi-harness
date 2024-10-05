// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineGitImportInfo {
    /**
     * @return Name of the branch.
     * 
     */
    private @Nullable String branchName;
    /**
     * @return Identifier of the Harness Connector used for importing entity from Git To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    private @Nullable String connectorRef;
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    private @Nullable String filePath;
    /**
     * @return Name of the repository.
     * 
     */
    private @Nullable String repoName;

    private PipelineGitImportInfo() {}
    /**
     * @return Name of the branch.
     * 
     */
    public Optional<String> branchName() {
        return Optional.ofNullable(this.branchName);
    }
    /**
     * @return Identifier of the Harness Connector used for importing entity from Git To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<String> connectorRef() {
        return Optional.ofNullable(this.connectorRef);
    }
    /**
     * @return File path of the Entity in the repository.
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }
    /**
     * @return Name of the repository.
     * 
     */
    public Optional<String> repoName() {
        return Optional.ofNullable(this.repoName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineGitImportInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String connectorRef;
        private @Nullable String filePath;
        private @Nullable String repoName;
        public Builder() {}
        public Builder(PipelineGitImportInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.connectorRef = defaults.connectorRef;
    	      this.filePath = defaults.filePath;
    	      this.repoName = defaults.repoName;
        }

        @CustomType.Setter
        public Builder branchName(@Nullable String branchName) {

            this.branchName = branchName;
            return this;
        }
        @CustomType.Setter
        public Builder connectorRef(@Nullable String connectorRef) {

            this.connectorRef = connectorRef;
            return this;
        }
        @CustomType.Setter
        public Builder filePath(@Nullable String filePath) {

            this.filePath = filePath;
            return this;
        }
        @CustomType.Setter
        public Builder repoName(@Nullable String repoName) {

            this.repoName = repoName;
            return this;
        }
        public PipelineGitImportInfo build() {
            final var _resultValue = new PipelineGitImportInfo();
            _resultValue.branchName = branchName;
            _resultValue.connectorRef = connectorRef;
            _resultValue.filePath = filePath;
            _resultValue.repoName = repoName;
            return _resultValue;
        }
    }
}