// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.RepoRuleBranchBypassArgs;
import com.pulumi.harness.platform.inputs.RepoRuleBranchPatternArgs;
import com.pulumi.harness.platform.inputs.RepoRuleBranchPolicyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepoRuleBranchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepoRuleBranchArgs Empty = new RepoRuleBranchArgs();

    /**
     * List of users who can bypass this rule.
     * 
     */
    @Import(name="bypasses", required=true)
    private Output<List<RepoRuleBranchBypassArgs>> bypasses;

    /**
     * @return List of users who can bypass this rule.
     * 
     */
    public Output<List<RepoRuleBranchBypassArgs>> bypasses() {
        return this.bypasses;
    }

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Identifier of the rule.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the rule.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
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
     * Pattern of branch to which rule will apply.
     * 
     */
    @Import(name="patterns")
    private @Nullable Output<List<RepoRuleBranchPatternArgs>> patterns;

    /**
     * @return Pattern of branch to which rule will apply.
     * 
     */
    public Optional<Output<List<RepoRuleBranchPatternArgs>>> patterns() {
        return Optional.ofNullable(this.patterns);
    }

    /**
     * Policies to be applied for this rule.
     * 
     */
    @Import(name="policies", required=true)
    private Output<List<RepoRuleBranchPolicyArgs>> policies;

    /**
     * @return Policies to be applied for this rule.
     * 
     */
    public Output<List<RepoRuleBranchPolicyArgs>> policies() {
        return this.policies;
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
     * Repo identifier of the repository.
     * 
     */
    @Import(name="repoIdentifier", required=true)
    private Output<String> repoIdentifier;

    /**
     * @return Repo identifier of the repository.
     * 
     */
    public Output<String> repoIdentifier() {
        return this.repoIdentifier;
    }

    /**
     * State of the rule (active, disable, monitor).
     * 
     */
    @Import(name="state", required=true)
    private Output<String> state;

    /**
     * @return State of the rule (active, disable, monitor).
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    private RepoRuleBranchArgs() {}

    private RepoRuleBranchArgs(RepoRuleBranchArgs $) {
        this.bypasses = $.bypasses;
        this.description = $.description;
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.patterns = $.patterns;
        this.policies = $.policies;
        this.projectId = $.projectId;
        this.repoIdentifier = $.repoIdentifier;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepoRuleBranchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoRuleBranchArgs $;

        public Builder() {
            $ = new RepoRuleBranchArgs();
        }

        public Builder(RepoRuleBranchArgs defaults) {
            $ = new RepoRuleBranchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bypasses List of users who can bypass this rule.
         * 
         * @return builder
         * 
         */
        public Builder bypasses(Output<List<RepoRuleBranchBypassArgs>> bypasses) {
            $.bypasses = bypasses;
            return this;
        }

        /**
         * @param bypasses List of users who can bypass this rule.
         * 
         * @return builder
         * 
         */
        public Builder bypasses(List<RepoRuleBranchBypassArgs> bypasses) {
            return bypasses(Output.of(bypasses));
        }

        /**
         * @param bypasses List of users who can bypass this rule.
         * 
         * @return builder
         * 
         */
        public Builder bypasses(RepoRuleBranchBypassArgs... bypasses) {
            return bypasses(List.of(bypasses));
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Identifier of the rule.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the rule.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
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
         * @param patterns Pattern of branch to which rule will apply.
         * 
         * @return builder
         * 
         */
        public Builder patterns(@Nullable Output<List<RepoRuleBranchPatternArgs>> patterns) {
            $.patterns = patterns;
            return this;
        }

        /**
         * @param patterns Pattern of branch to which rule will apply.
         * 
         * @return builder
         * 
         */
        public Builder patterns(List<RepoRuleBranchPatternArgs> patterns) {
            return patterns(Output.of(patterns));
        }

        /**
         * @param patterns Pattern of branch to which rule will apply.
         * 
         * @return builder
         * 
         */
        public Builder patterns(RepoRuleBranchPatternArgs... patterns) {
            return patterns(List.of(patterns));
        }

        /**
         * @param policies Policies to be applied for this rule.
         * 
         * @return builder
         * 
         */
        public Builder policies(Output<List<RepoRuleBranchPolicyArgs>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies Policies to be applied for this rule.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<RepoRuleBranchPolicyArgs> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies Policies to be applied for this rule.
         * 
         * @return builder
         * 
         */
        public Builder policies(RepoRuleBranchPolicyArgs... policies) {
            return policies(List.of(policies));
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
         * @param repoIdentifier Repo identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoIdentifier(Output<String> repoIdentifier) {
            $.repoIdentifier = repoIdentifier;
            return this;
        }

        /**
         * @param repoIdentifier Repo identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoIdentifier(String repoIdentifier) {
            return repoIdentifier(Output.of(repoIdentifier));
        }

        /**
         * @param state State of the rule (active, disable, monitor).
         * 
         * @return builder
         * 
         */
        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the rule (active, disable, monitor).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public RepoRuleBranchArgs build() {
            if ($.bypasses == null) {
                throw new MissingRequiredPropertyException("RepoRuleBranchArgs", "bypasses");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("RepoRuleBranchArgs", "identifier");
            }
            if ($.policies == null) {
                throw new MissingRequiredPropertyException("RepoRuleBranchArgs", "policies");
            }
            if ($.repoIdentifier == null) {
                throw new MissingRequiredPropertyException("RepoRuleBranchArgs", "repoIdentifier");
            }
            if ($.state == null) {
                throw new MissingRequiredPropertyException("RepoRuleBranchArgs", "state");
            }
            return $;
        }
    }

}
