// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GetRepoSourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepoArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepoArgs Empty = new GetRepoArgs();

    /**
     * Default branch of the repository (Applicate only for create).
     * 
     */
    @Import(name="defaultBranch")
    private @Nullable Output<String> defaultBranch;

    /**
     * @return Default branch of the repository (Applicate only for create).
     * 
     */
    public Optional<Output<String>> defaultBranch() {
        return Optional.ofNullable(this.defaultBranch);
    }

    /**
     * Description of the repository.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the repository.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Repository should be created with specified predefined gitignore file.
     * 
     */
    @Import(name="gitIgnore")
    private @Nullable Output<String> gitIgnore;

    /**
     * @return Repository should be created with specified predefined gitignore file.
     * 
     */
    public Optional<Output<String>> gitIgnore() {
        return Optional.ofNullable(this.gitIgnore);
    }

    /**
     * Identifier of the repository.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the repository.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Repository should be created with specified predefined license file.
     * 
     */
    @Import(name="license")
    private @Nullable Output<String> license;

    /**
     * @return Repository should be created with specified predefined license file.
     * 
     */
    public Optional<Output<String>> license() {
        return Optional.ofNullable(this.license);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Repository should be created with readme file.
     * 
     */
    @Import(name="readme")
    private @Nullable Output<Boolean> readme;

    /**
     * @return Repository should be created with readme file.
     * 
     */
    public Optional<Output<Boolean>> readme() {
        return Optional.ofNullable(this.readme);
    }

    /**
     * Configuration for importing an existing repository from SCM provider.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<GetRepoSourceArgs>> sources;

    /**
     * @return Configuration for importing an existing repository from SCM provider.
     * 
     */
    public Optional<Output<List<GetRepoSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    private GetRepoArgs() {}

    private GetRepoArgs(GetRepoArgs $) {
        this.defaultBranch = $.defaultBranch;
        this.description = $.description;
        this.gitIgnore = $.gitIgnore;
        this.identifier = $.identifier;
        this.license = $.license;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.readme = $.readme;
        this.sources = $.sources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepoArgs $;

        public Builder() {
            $ = new GetRepoArgs();
        }

        public Builder(GetRepoArgs defaults) {
            $ = new GetRepoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultBranch Default branch of the repository (Applicate only for create).
         * 
         * @return builder
         * 
         */
        public Builder defaultBranch(@Nullable Output<String> defaultBranch) {
            $.defaultBranch = defaultBranch;
            return this;
        }

        /**
         * @param defaultBranch Default branch of the repository (Applicate only for create).
         * 
         * @return builder
         * 
         */
        public Builder defaultBranch(String defaultBranch) {
            return defaultBranch(Output.of(defaultBranch));
        }

        /**
         * @param description Description of the repository.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the repository.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gitIgnore Repository should be created with specified predefined gitignore file.
         * 
         * @return builder
         * 
         */
        public Builder gitIgnore(@Nullable Output<String> gitIgnore) {
            $.gitIgnore = gitIgnore;
            return this;
        }

        /**
         * @param gitIgnore Repository should be created with specified predefined gitignore file.
         * 
         * @return builder
         * 
         */
        public Builder gitIgnore(String gitIgnore) {
            return gitIgnore(Output.of(gitIgnore));
        }

        /**
         * @param identifier Identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param license Repository should be created with specified predefined license file.
         * 
         * @return builder
         * 
         */
        public Builder license(@Nullable Output<String> license) {
            $.license = license;
            return this;
        }

        /**
         * @param license Repository should be created with specified predefined license file.
         * 
         * @return builder
         * 
         */
        public Builder license(String license) {
            return license(Output.of(license));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param readme Repository should be created with readme file.
         * 
         * @return builder
         * 
         */
        public Builder readme(@Nullable Output<Boolean> readme) {
            $.readme = readme;
            return this;
        }

        /**
         * @param readme Repository should be created with readme file.
         * 
         * @return builder
         * 
         */
        public Builder readme(Boolean readme) {
            return readme(Output.of(readme));
        }

        /**
         * @param sources Configuration for importing an existing repository from SCM provider.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<GetRepoSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Configuration for importing an existing repository from SCM provider.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<GetRepoSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Configuration for importing an existing repository from SCM provider.
         * 
         * @return builder
         * 
         */
        public Builder sources(GetRepoSourceArgs... sources) {
            return sources(List.of(sources));
        }

        public GetRepoArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetRepoArgs", "identifier");
            }
            return $;
        }
    }

}
