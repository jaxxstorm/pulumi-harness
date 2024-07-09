// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetRepoSource;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRepoResult {
    /**
     * @return Timestamp when the repository was created.
     * 
     */
    private Integer created;
    /**
     * @return ID of the user who created the repository.
     * 
     */
    private Integer createdBy;
    /**
     * @return Default branch of the repository (Applicate only for create).
     * 
     */
    private @Nullable String defaultBranch;
    /**
     * @return Description of the repository.
     * 
     */
    private @Nullable String description;
    /**
     * @return Repository should be created with specified predefined gitignore file.
     * 
     */
    private @Nullable String gitIgnore;
    /**
     * @return Git URL of the repository.
     * 
     */
    private String gitUrl;
    /**
     * @return Internal ID of the repository.
     * 
     */
    private String id;
    /**
     * @return Identifier of the repository.
     * 
     */
    private String identifier;
    /**
     * @return Repository should be created with specified predefined license file.
     * 
     */
    private @Nullable String license;
    /**
     * @return Name of the repository.
     * 
     */
    private String name;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Path of the repository.
     * 
     */
    private String path;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Repository should be created with readme file.
     * 
     */
    private @Nullable Boolean readme;
    /**
     * @return Configuration for importing an existing repository from SCM provider.
     * 
     */
    private @Nullable List<GetRepoSource> sources;
    /**
     * @return Timestamp when the repository was last updated.
     * 
     */
    private Integer updated;

    private GetRepoResult() {}
    /**
     * @return Timestamp when the repository was created.
     * 
     */
    public Integer created() {
        return this.created;
    }
    /**
     * @return ID of the user who created the repository.
     * 
     */
    public Integer createdBy() {
        return this.createdBy;
    }
    /**
     * @return Default branch of the repository (Applicate only for create).
     * 
     */
    public Optional<String> defaultBranch() {
        return Optional.ofNullable(this.defaultBranch);
    }
    /**
     * @return Description of the repository.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Repository should be created with specified predefined gitignore file.
     * 
     */
    public Optional<String> gitIgnore() {
        return Optional.ofNullable(this.gitIgnore);
    }
    /**
     * @return Git URL of the repository.
     * 
     */
    public String gitUrl() {
        return this.gitUrl;
    }
    /**
     * @return Internal ID of the repository.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the repository.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Repository should be created with specified predefined license file.
     * 
     */
    public Optional<String> license() {
        return Optional.ofNullable(this.license);
    }
    /**
     * @return Name of the repository.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Path of the repository.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Repository should be created with readme file.
     * 
     */
    public Optional<Boolean> readme() {
        return Optional.ofNullable(this.readme);
    }
    /**
     * @return Configuration for importing an existing repository from SCM provider.
     * 
     */
    public List<GetRepoSource> sources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * @return Timestamp when the repository was last updated.
     * 
     */
    public Integer updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepoResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer created;
        private Integer createdBy;
        private @Nullable String defaultBranch;
        private @Nullable String description;
        private @Nullable String gitIgnore;
        private String gitUrl;
        private String id;
        private String identifier;
        private @Nullable String license;
        private String name;
        private @Nullable String orgId;
        private String path;
        private @Nullable String projectId;
        private @Nullable Boolean readme;
        private @Nullable List<GetRepoSource> sources;
        private Integer updated;
        public Builder() {}
        public Builder(GetRepoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.createdBy = defaults.createdBy;
    	      this.defaultBranch = defaults.defaultBranch;
    	      this.description = defaults.description;
    	      this.gitIgnore = defaults.gitIgnore;
    	      this.gitUrl = defaults.gitUrl;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.license = defaults.license;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.path = defaults.path;
    	      this.projectId = defaults.projectId;
    	      this.readme = defaults.readme;
    	      this.sources = defaults.sources;
    	      this.updated = defaults.updated;
        }

        @CustomType.Setter
        public Builder created(Integer created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetRepoResult", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(Integer createdBy) {
            if (createdBy == null) {
              throw new MissingRequiredPropertyException("GetRepoResult", "createdBy");
            }
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder defaultBranch(@Nullable String defaultBranch) {

            this.defaultBranch = defaultBranch;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder gitIgnore(@Nullable String gitIgnore) {

            this.gitIgnore = gitIgnore;
            return this;
        }
        @CustomType.Setter
        public Builder gitUrl(String gitUrl) {
            if (gitUrl == null) {
              throw new MissingRequiredPropertyException("GetRepoResult", "gitUrl");
            }
            this.gitUrl = gitUrl;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRepoResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetRepoResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder license(@Nullable String license) {

            this.license = license;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRepoResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetRepoResult", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder readme(@Nullable Boolean readme) {

            this.readme = readme;
            return this;
        }
        @CustomType.Setter
        public Builder sources(@Nullable List<GetRepoSource> sources) {

            this.sources = sources;
            return this;
        }
        public Builder sources(GetRepoSource... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder updated(Integer updated) {
            if (updated == null) {
              throw new MissingRequiredPropertyException("GetRepoResult", "updated");
            }
            this.updated = updated;
            return this;
        }
        public GetRepoResult build() {
            final var _resultValue = new GetRepoResult();
            _resultValue.created = created;
            _resultValue.createdBy = createdBy;
            _resultValue.defaultBranch = defaultBranch;
            _resultValue.description = description;
            _resultValue.gitIgnore = gitIgnore;
            _resultValue.gitUrl = gitUrl;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.license = license;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.path = path;
            _resultValue.projectId = projectId;
            _resultValue.readme = readme;
            _resultValue.sources = sources;
            _resultValue.updated = updated;
            return _resultValue;
        }
    }
}
