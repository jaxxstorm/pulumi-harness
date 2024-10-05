// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Base branch for the new git branch.
     * 
     */
    @Import(name="gitBaseBranch")
    private @Nullable Output<String> gitBaseBranch;

    /**
     * @return Base branch for the new git branch.
     * 
     */
    public Optional<Output<String>> gitBaseBranch() {
        return Optional.ofNullable(this.gitBaseBranch);
    }

    /**
     * Git branch for the policy.
     * 
     */
    @Import(name="gitBranch")
    private @Nullable Output<String> gitBranch;

    /**
     * @return Git branch for the policy.
     * 
     */
    public Optional<Output<String>> gitBranch() {
        return Optional.ofNullable(this.gitBranch);
    }

    /**
     * Git commit message for the policy.
     * 
     */
    @Import(name="gitCommitMsg")
    private @Nullable Output<String> gitCommitMsg;

    /**
     * @return Git commit message for the policy.
     * 
     */
    public Optional<Output<String>> gitCommitMsg() {
        return Optional.ofNullable(this.gitCommitMsg);
    }

    /**
     * The existing commit sha of the file being updated
     * 
     */
    @Import(name="gitCommitSha")
    private @Nullable Output<String> gitCommitSha;

    /**
     * @return The existing commit sha of the file being updated
     * 
     */
    public Optional<Output<String>> gitCommitSha() {
        return Optional.ofNullable(this.gitCommitSha);
    }

    /**
     * Git connector reference for the policy.
     * 
     */
    @Import(name="gitConnectorRef")
    private @Nullable Output<String> gitConnectorRef;

    /**
     * @return Git connector reference for the policy.
     * 
     */
    public Optional<Output<String>> gitConnectorRef() {
        return Optional.ofNullable(this.gitConnectorRef);
    }

    /**
     * The existing file id of the file being updated, not required for bitbucket files
     * 
     */
    @Import(name="gitFileId")
    private @Nullable Output<String> gitFileId;

    /**
     * @return The existing file id of the file being updated, not required for bitbucket files
     * 
     */
    public Optional<Output<String>> gitFileId() {
        return Optional.ofNullable(this.gitFileId);
    }

    /**
     * Flag to import the policy from git.
     * 
     */
    @Import(name="gitImport")
    private @Nullable Output<Boolean> gitImport;

    /**
     * @return Flag to import the policy from git.
     * 
     */
    public Optional<Output<Boolean>> gitImport() {
        return Optional.ofNullable(this.gitImport);
    }

    /**
     * Flag to create a new branch for the policy.
     * 
     */
    @Import(name="gitIsNewBranch")
    private @Nullable Output<Boolean> gitIsNewBranch;

    /**
     * @return Flag to create a new branch for the policy.
     * 
     */
    public Optional<Output<Boolean>> gitIsNewBranch() {
        return Optional.ofNullable(this.gitIsNewBranch);
    }

    /**
     * Git path for the policy.
     * 
     */
    @Import(name="gitPath")
    private @Nullable Output<String> gitPath;

    /**
     * @return Git path for the policy.
     * 
     */
    public Optional<Output<String>> gitPath() {
        return Optional.ofNullable(this.gitPath);
    }

    /**
     * Git repository for the policy.
     * 
     */
    @Import(name="gitRepo")
    private @Nullable Output<String> gitRepo;

    /**
     * @return Git repository for the policy.
     * 
     */
    public Optional<Output<String>> gitRepo() {
        return Optional.ofNullable(this.gitRepo);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Rego code for the policy.
     * 
     */
    @Import(name="rego", required=true)
    private Output<String> rego;

    /**
     * @return Rego code for the policy.
     * 
     */
    public Output<String> rego() {
        return this.rego;
    }

    /**
     * Tags to associate with the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.description = $.description;
        this.gitBaseBranch = $.gitBaseBranch;
        this.gitBranch = $.gitBranch;
        this.gitCommitMsg = $.gitCommitMsg;
        this.gitCommitSha = $.gitCommitSha;
        this.gitConnectorRef = $.gitConnectorRef;
        this.gitFileId = $.gitFileId;
        this.gitImport = $.gitImport;
        this.gitIsNewBranch = $.gitIsNewBranch;
        this.gitPath = $.gitPath;
        this.gitRepo = $.gitRepo;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.rego = $.rego;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gitBaseBranch Base branch for the new git branch.
         * 
         * @return builder
         * 
         */
        public Builder gitBaseBranch(@Nullable Output<String> gitBaseBranch) {
            $.gitBaseBranch = gitBaseBranch;
            return this;
        }

        /**
         * @param gitBaseBranch Base branch for the new git branch.
         * 
         * @return builder
         * 
         */
        public Builder gitBaseBranch(String gitBaseBranch) {
            return gitBaseBranch(Output.of(gitBaseBranch));
        }

        /**
         * @param gitBranch Git branch for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitBranch(@Nullable Output<String> gitBranch) {
            $.gitBranch = gitBranch;
            return this;
        }

        /**
         * @param gitBranch Git branch for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitBranch(String gitBranch) {
            return gitBranch(Output.of(gitBranch));
        }

        /**
         * @param gitCommitMsg Git commit message for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitCommitMsg(@Nullable Output<String> gitCommitMsg) {
            $.gitCommitMsg = gitCommitMsg;
            return this;
        }

        /**
         * @param gitCommitMsg Git commit message for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitCommitMsg(String gitCommitMsg) {
            return gitCommitMsg(Output.of(gitCommitMsg));
        }

        /**
         * @param gitCommitSha The existing commit sha of the file being updated
         * 
         * @return builder
         * 
         */
        public Builder gitCommitSha(@Nullable Output<String> gitCommitSha) {
            $.gitCommitSha = gitCommitSha;
            return this;
        }

        /**
         * @param gitCommitSha The existing commit sha of the file being updated
         * 
         * @return builder
         * 
         */
        public Builder gitCommitSha(String gitCommitSha) {
            return gitCommitSha(Output.of(gitCommitSha));
        }

        /**
         * @param gitConnectorRef Git connector reference for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitConnectorRef(@Nullable Output<String> gitConnectorRef) {
            $.gitConnectorRef = gitConnectorRef;
            return this;
        }

        /**
         * @param gitConnectorRef Git connector reference for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitConnectorRef(String gitConnectorRef) {
            return gitConnectorRef(Output.of(gitConnectorRef));
        }

        /**
         * @param gitFileId The existing file id of the file being updated, not required for bitbucket files
         * 
         * @return builder
         * 
         */
        public Builder gitFileId(@Nullable Output<String> gitFileId) {
            $.gitFileId = gitFileId;
            return this;
        }

        /**
         * @param gitFileId The existing file id of the file being updated, not required for bitbucket files
         * 
         * @return builder
         * 
         */
        public Builder gitFileId(String gitFileId) {
            return gitFileId(Output.of(gitFileId));
        }

        /**
         * @param gitImport Flag to import the policy from git.
         * 
         * @return builder
         * 
         */
        public Builder gitImport(@Nullable Output<Boolean> gitImport) {
            $.gitImport = gitImport;
            return this;
        }

        /**
         * @param gitImport Flag to import the policy from git.
         * 
         * @return builder
         * 
         */
        public Builder gitImport(Boolean gitImport) {
            return gitImport(Output.of(gitImport));
        }

        /**
         * @param gitIsNewBranch Flag to create a new branch for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitIsNewBranch(@Nullable Output<Boolean> gitIsNewBranch) {
            $.gitIsNewBranch = gitIsNewBranch;
            return this;
        }

        /**
         * @param gitIsNewBranch Flag to create a new branch for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitIsNewBranch(Boolean gitIsNewBranch) {
            return gitIsNewBranch(Output.of(gitIsNewBranch));
        }

        /**
         * @param gitPath Git path for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitPath(@Nullable Output<String> gitPath) {
            $.gitPath = gitPath;
            return this;
        }

        /**
         * @param gitPath Git path for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitPath(String gitPath) {
            return gitPath(Output.of(gitPath));
        }

        /**
         * @param gitRepo Git repository for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitRepo(@Nullable Output<String> gitRepo) {
            $.gitRepo = gitRepo;
            return this;
        }

        /**
         * @param gitRepo Git repository for the policy.
         * 
         * @return builder
         * 
         */
        public Builder gitRepo(String gitRepo) {
            return gitRepo(Output.of(gitRepo));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param rego Rego code for the policy.
         * 
         * @return builder
         * 
         */
        public Builder rego(Output<String> rego) {
            $.rego = rego;
            return this;
        }

        /**
         * @param rego Rego code for the policy.
         * 
         * @return builder
         * 
         */
        public Builder rego(String rego) {
            return rego(Output.of(rego));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public PolicyArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "identifier");
            }
            if ($.rego == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "rego");
            }
            return $;
        }
    }

}