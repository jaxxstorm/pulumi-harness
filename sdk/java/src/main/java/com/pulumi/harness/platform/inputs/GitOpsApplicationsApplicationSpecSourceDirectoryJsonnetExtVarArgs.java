// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs Empty = new GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs();

    /**
     * Code of the external variables of jsonnet application.
     * 
     */
    @Import(name="code")
    private @Nullable Output<Boolean> code;

    /**
     * @return Code of the external variables of jsonnet application.
     * 
     */
    public Optional<Output<Boolean>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Name of the external variables of jsonnet application.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the external variables of jsonnet application.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value of the external variables of jsonnet application.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the external variables of jsonnet application.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs() {}

    private GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs(GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs $) {
        this.code = $.code;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs $;

        public Builder() {
            $ = new GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs();
        }

        public Builder(GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs defaults) {
            $ = new GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Code of the external variables of jsonnet application.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<Boolean> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code Code of the external variables of jsonnet application.
         * 
         * @return builder
         * 
         */
        public Builder code(Boolean code) {
            return code(Output.of(code));
        }

        /**
         * @param name Name of the external variables of jsonnet application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the external variables of jsonnet application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of the external variables of jsonnet application.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the external variables of jsonnet application.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GitOpsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs build() {
            return $;
        }
    }

}