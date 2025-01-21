// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHarRegistryConfigAuthUserPassword extends com.pulumi.resources.InvokeArgs {

    public static final GetHarRegistryConfigAuthUserPassword Empty = new GetHarRegistryConfigAuthUserPassword();

    /**
     * Secret identifier
     * 
     */
    @Import(name="secretIdentifier")
    private @Nullable String secretIdentifier;

    /**
     * @return Secret identifier
     * 
     */
    public Optional<String> secretIdentifier() {
        return Optional.ofNullable(this.secretIdentifier);
    }

    /**
     * Secret space ID
     * 
     */
    @Import(name="secretSpaceId")
    private @Nullable Integer secretSpaceId;

    /**
     * @return Secret space ID
     * 
     */
    public Optional<Integer> secretSpaceId() {
        return Optional.ofNullable(this.secretSpaceId);
    }

    /**
     * Secret space path
     * 
     */
    @Import(name="secretSpacePath")
    private @Nullable String secretSpacePath;

    /**
     * @return Secret space path
     * 
     */
    public Optional<String> secretSpacePath() {
        return Optional.ofNullable(this.secretSpacePath);
    }

    /**
     * User name
     * 
     */
    @Import(name="userName", required=true)
    private String userName;

    /**
     * @return User name
     * 
     */
    public String userName() {
        return this.userName;
    }

    private GetHarRegistryConfigAuthUserPassword() {}

    private GetHarRegistryConfigAuthUserPassword(GetHarRegistryConfigAuthUserPassword $) {
        this.secretIdentifier = $.secretIdentifier;
        this.secretSpaceId = $.secretSpaceId;
        this.secretSpacePath = $.secretSpacePath;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHarRegistryConfigAuthUserPassword defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHarRegistryConfigAuthUserPassword $;

        public Builder() {
            $ = new GetHarRegistryConfigAuthUserPassword();
        }

        public Builder(GetHarRegistryConfigAuthUserPassword defaults) {
            $ = new GetHarRegistryConfigAuthUserPassword(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretIdentifier Secret identifier
         * 
         * @return builder
         * 
         */
        public Builder secretIdentifier(@Nullable String secretIdentifier) {
            $.secretIdentifier = secretIdentifier;
            return this;
        }

        /**
         * @param secretSpaceId Secret space ID
         * 
         * @return builder
         * 
         */
        public Builder secretSpaceId(@Nullable Integer secretSpaceId) {
            $.secretSpaceId = secretSpaceId;
            return this;
        }

        /**
         * @param secretSpacePath Secret space path
         * 
         * @return builder
         * 
         */
        public Builder secretSpacePath(@Nullable String secretSpacePath) {
            $.secretSpacePath = secretSpacePath;
            return this;
        }

        /**
         * @param userName User name
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public GetHarRegistryConfigAuthUserPassword build() {
            if ($.userName == null) {
                throw new MissingRequiredPropertyException("GetHarRegistryConfigAuthUserPassword", "userName");
            }
            return $;
        }
    }

}
