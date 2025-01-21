// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHarRegistryConfigAuthUserPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetHarRegistryConfigAuthUserPasswordArgs Empty = new GetHarRegistryConfigAuthUserPasswordArgs();

    /**
     * Secret identifier
     * 
     */
    @Import(name="secretIdentifier")
    private @Nullable Output<String> secretIdentifier;

    /**
     * @return Secret identifier
     * 
     */
    public Optional<Output<String>> secretIdentifier() {
        return Optional.ofNullable(this.secretIdentifier);
    }

    /**
     * Secret space ID
     * 
     */
    @Import(name="secretSpaceId")
    private @Nullable Output<Integer> secretSpaceId;

    /**
     * @return Secret space ID
     * 
     */
    public Optional<Output<Integer>> secretSpaceId() {
        return Optional.ofNullable(this.secretSpaceId);
    }

    /**
     * Secret space path
     * 
     */
    @Import(name="secretSpacePath")
    private @Nullable Output<String> secretSpacePath;

    /**
     * @return Secret space path
     * 
     */
    public Optional<Output<String>> secretSpacePath() {
        return Optional.ofNullable(this.secretSpacePath);
    }

    /**
     * User name
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return User name
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private GetHarRegistryConfigAuthUserPasswordArgs() {}

    private GetHarRegistryConfigAuthUserPasswordArgs(GetHarRegistryConfigAuthUserPasswordArgs $) {
        this.secretIdentifier = $.secretIdentifier;
        this.secretSpaceId = $.secretSpaceId;
        this.secretSpacePath = $.secretSpacePath;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHarRegistryConfigAuthUserPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHarRegistryConfigAuthUserPasswordArgs $;

        public Builder() {
            $ = new GetHarRegistryConfigAuthUserPasswordArgs();
        }

        public Builder(GetHarRegistryConfigAuthUserPasswordArgs defaults) {
            $ = new GetHarRegistryConfigAuthUserPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretIdentifier Secret identifier
         * 
         * @return builder
         * 
         */
        public Builder secretIdentifier(@Nullable Output<String> secretIdentifier) {
            $.secretIdentifier = secretIdentifier;
            return this;
        }

        /**
         * @param secretIdentifier Secret identifier
         * 
         * @return builder
         * 
         */
        public Builder secretIdentifier(String secretIdentifier) {
            return secretIdentifier(Output.of(secretIdentifier));
        }

        /**
         * @param secretSpaceId Secret space ID
         * 
         * @return builder
         * 
         */
        public Builder secretSpaceId(@Nullable Output<Integer> secretSpaceId) {
            $.secretSpaceId = secretSpaceId;
            return this;
        }

        /**
         * @param secretSpaceId Secret space ID
         * 
         * @return builder
         * 
         */
        public Builder secretSpaceId(Integer secretSpaceId) {
            return secretSpaceId(Output.of(secretSpaceId));
        }

        /**
         * @param secretSpacePath Secret space path
         * 
         * @return builder
         * 
         */
        public Builder secretSpacePath(@Nullable Output<String> secretSpacePath) {
            $.secretSpacePath = secretSpacePath;
            return this;
        }

        /**
         * @param secretSpacePath Secret space path
         * 
         * @return builder
         * 
         */
        public Builder secretSpacePath(String secretSpacePath) {
            return secretSpacePath(Output.of(secretSpacePath));
        }

        /**
         * @param userName User name
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName User name
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public GetHarRegistryConfigAuthUserPasswordArgs build() {
            if ($.userName == null) {
                throw new MissingRequiredPropertyException("GetHarRegistryConfigAuthUserPasswordArgs", "userName");
            }
            return $;
        }
    }

}
