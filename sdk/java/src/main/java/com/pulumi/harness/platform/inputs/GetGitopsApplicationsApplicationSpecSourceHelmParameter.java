// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceHelmParameter extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceHelmParameter Empty = new GetGitopsApplicationsApplicationSpecSourceHelmParameter();

    /**
     * Indicates if helm should interpret booleans and numbers as strings.
     * 
     */
    @Import(name="forceString")
    private @Nullable Boolean forceString;

    /**
     * @return Indicates if helm should interpret booleans and numbers as strings.
     * 
     */
    public Optional<Boolean> forceString() {
        return Optional.ofNullable(this.forceString);
    }

    /**
     * Name of the helm parameter.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the helm parameter.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value of the helm parameter.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return Value of the helm parameter.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetGitopsApplicationsApplicationSpecSourceHelmParameter() {}

    private GetGitopsApplicationsApplicationSpecSourceHelmParameter(GetGitopsApplicationsApplicationSpecSourceHelmParameter $) {
        this.forceString = $.forceString;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceHelmParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceHelmParameter $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceHelmParameter();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceHelmParameter defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceHelmParameter(Objects.requireNonNull(defaults));
        }

        /**
         * @param forceString Indicates if helm should interpret booleans and numbers as strings.
         * 
         * @return builder
         * 
         */
        public Builder forceString(@Nullable Boolean forceString) {
            $.forceString = forceString;
            return this;
        }

        /**
         * @param name Name of the helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value Value of the helm parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSourceHelmParameter build() {
            return $;
        }
    }

}
