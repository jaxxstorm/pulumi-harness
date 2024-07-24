// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectMetadata;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProjectSpec;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GitopsAppProjectProject {
    /**
     * @return Metadata details for the GitOps project.
     * 
     */
    private List<GitopsAppProjectProjectMetadata> metadatas;
    /**
     * @return Specification details for the GitOps project.
     * 
     */
    private List<GitopsAppProjectProjectSpec> specs;

    private GitopsAppProjectProject() {}
    /**
     * @return Metadata details for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectMetadata> metadatas() {
        return this.metadatas;
    }
    /**
     * @return Specification details for the GitOps project.
     * 
     */
    public List<GitopsAppProjectProjectSpec> specs() {
        return this.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitopsAppProjectProject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GitopsAppProjectProjectMetadata> metadatas;
        private List<GitopsAppProjectProjectSpec> specs;
        public Builder() {}
        public Builder(GitopsAppProjectProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadatas = defaults.metadatas;
    	      this.specs = defaults.specs;
        }

        @CustomType.Setter
        public Builder metadatas(List<GitopsAppProjectProjectMetadata> metadatas) {
            if (metadatas == null) {
              throw new MissingRequiredPropertyException("GitopsAppProjectProject", "metadatas");
            }
            this.metadatas = metadatas;
            return this;
        }
        public Builder metadatas(GitopsAppProjectProjectMetadata... metadatas) {
            return metadatas(List.of(metadatas));
        }
        @CustomType.Setter
        public Builder specs(List<GitopsAppProjectProjectSpec> specs) {
            if (specs == null) {
              throw new MissingRequiredPropertyException("GitopsAppProjectProject", "specs");
            }
            this.specs = specs;
            return this;
        }
        public Builder specs(GitopsAppProjectProjectSpec... specs) {
            return specs(List.of(specs));
        }
        public GitopsAppProjectProject build() {
            final var _resultValue = new GitopsAppProjectProject();
            _resultValue.metadatas = metadatas;
            _resultValue.specs = specs;
            return _resultValue;
        }
    }
}
