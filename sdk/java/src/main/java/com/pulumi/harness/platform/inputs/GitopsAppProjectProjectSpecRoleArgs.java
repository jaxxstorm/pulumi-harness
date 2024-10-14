// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.GitopsAppProjectProjectSpecRoleJwtTokenArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitopsAppProjectProjectSpecRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitopsAppProjectProjectSpecRoleArgs Empty = new GitopsAppProjectProjectSpecRoleArgs();

    /**
     * Description of the role.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description of the role.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Groups associated with the role.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    /**
     * @return Groups associated with the role.
     * 
     */
    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * JWT tokens associated with the role.
     * 
     */
    @Import(name="jwtTokens")
    private @Nullable Output<List<GitopsAppProjectProjectSpecRoleJwtTokenArgs>> jwtTokens;

    /**
     * @return JWT tokens associated with the role.
     * 
     */
    public Optional<Output<List<GitopsAppProjectProjectSpecRoleJwtTokenArgs>>> jwtTokens() {
        return Optional.ofNullable(this.jwtTokens);
    }

    /**
     * Name of the role.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the role.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Policies associated with the role. These are argo RBAC policies and may not necessarily reflect in harness.
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<String>> policies;

    /**
     * @return Policies associated with the role. These are argo RBAC policies and may not necessarily reflect in harness.
     * 
     */
    public Optional<Output<List<String>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    private GitopsAppProjectProjectSpecRoleArgs() {}

    private GitopsAppProjectProjectSpecRoleArgs(GitopsAppProjectProjectSpecRoleArgs $) {
        this.description = $.description;
        this.groups = $.groups;
        this.jwtTokens = $.jwtTokens;
        this.name = $.name;
        this.policies = $.policies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitopsAppProjectProjectSpecRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitopsAppProjectProjectSpecRoleArgs $;

        public Builder() {
            $ = new GitopsAppProjectProjectSpecRoleArgs();
        }

        public Builder(GitopsAppProjectProjectSpecRoleArgs defaults) {
            $ = new GitopsAppProjectProjectSpecRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the role.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the role.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param groups Groups associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups Groups associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups Groups associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param jwtTokens JWT tokens associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder jwtTokens(@Nullable Output<List<GitopsAppProjectProjectSpecRoleJwtTokenArgs>> jwtTokens) {
            $.jwtTokens = jwtTokens;
            return this;
        }

        /**
         * @param jwtTokens JWT tokens associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder jwtTokens(List<GitopsAppProjectProjectSpecRoleJwtTokenArgs> jwtTokens) {
            return jwtTokens(Output.of(jwtTokens));
        }

        /**
         * @param jwtTokens JWT tokens associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder jwtTokens(GitopsAppProjectProjectSpecRoleJwtTokenArgs... jwtTokens) {
            return jwtTokens(List.of(jwtTokens));
        }

        /**
         * @param name Name of the role.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the role.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policies Policies associated with the role. These are argo RBAC policies and may not necessarily reflect in harness.
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies Policies associated with the role. These are argo RBAC policies and may not necessarily reflect in harness.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies Policies associated with the role. These are argo RBAC policies and may not necessarily reflect in harness.
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        public GitopsAppProjectProjectSpecRoleArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("GitopsAppProjectProjectSpecRoleArgs", "description");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GitopsAppProjectProjectSpecRoleArgs", "name");
            }
            return $;
        }
    }

}
