// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final TokenArgs Empty = new TokenArgs();

    /**
     * Account Identifier for the Entity
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account Identifier for the Entity
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Identifier of the API Key
     * 
     */
    @Import(name="apikeyId", required=true)
    private Output<String> apikeyId;

    /**
     * @return Identifier of the API Key
     * 
     */
    public Output<String> apikeyId() {
        return this.apikeyId;
    }

    /**
     * Type of the API Key
     * 
     */
    @Import(name="apikeyType", required=true)
    private Output<String> apikeyType;

    /**
     * @return Type of the API Key
     * 
     */
    public Output<String> apikeyType() {
        return this.apikeyType;
    }

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
     * Email Id of the user who created the Token
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email Id of the user who created the Token
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Encoded password of the Token
     * 
     */
    @Import(name="encodedPassword")
    private @Nullable Output<String> encodedPassword;

    /**
     * @return Encoded password of the Token
     * 
     */
    public Optional<Output<String>> encodedPassword() {
        return Optional.ofNullable(this.encodedPassword);
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
     * Parent Entity Identifier of the API Key
     * 
     */
    @Import(name="parentId", required=true)
    private Output<String> parentId;

    /**
     * @return Parent Entity Identifier of the API Key
     * 
     */
    public Output<String> parentId() {
        return this.parentId;
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
     * Scheduled expiry time in milliseconds
     * 
     */
    @Import(name="scheduledExpireTime")
    private @Nullable Output<Integer> scheduledExpireTime;

    /**
     * @return Scheduled expiry time in milliseconds
     * 
     */
    public Optional<Output<Integer>> scheduledExpireTime() {
        return Optional.ofNullable(this.scheduledExpireTime);
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

    /**
     * Name of the user who created the Token
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Name of the user who created the Token
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * Boolean value to indicate if Token is valid or not.
     * 
     */
    @Import(name="valid")
    private @Nullable Output<Boolean> valid;

    /**
     * @return Boolean value to indicate if Token is valid or not.
     * 
     */
    public Optional<Output<Boolean>> valid() {
        return Optional.ofNullable(this.valid);
    }

    /**
     * This is the time from which the Token is valid. The time is in milliseconds
     * 
     */
    @Import(name="validFrom")
    private @Nullable Output<Integer> validFrom;

    /**
     * @return This is the time from which the Token is valid. The time is in milliseconds
     * 
     */
    public Optional<Output<Integer>> validFrom() {
        return Optional.ofNullable(this.validFrom);
    }

    /**
     * This is the time till which the Token is valid. The time is in milliseconds
     * 
     */
    @Import(name="validTo")
    private @Nullable Output<Integer> validTo;

    /**
     * @return This is the time till which the Token is valid. The time is in milliseconds
     * 
     */
    public Optional<Output<Integer>> validTo() {
        return Optional.ofNullable(this.validTo);
    }

    private TokenArgs() {}

    private TokenArgs(TokenArgs $) {
        this.accountId = $.accountId;
        this.apikeyId = $.apikeyId;
        this.apikeyType = $.apikeyType;
        this.description = $.description;
        this.email = $.email;
        this.encodedPassword = $.encodedPassword;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.parentId = $.parentId;
        this.projectId = $.projectId;
        this.scheduledExpireTime = $.scheduledExpireTime;
        this.tags = $.tags;
        this.username = $.username;
        this.valid = $.valid;
        this.validFrom = $.validFrom;
        this.validTo = $.validTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenArgs $;

        public Builder() {
            $ = new TokenArgs();
        }

        public Builder(TokenArgs defaults) {
            $ = new TokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param apikeyId Identifier of the API Key
         * 
         * @return builder
         * 
         */
        public Builder apikeyId(Output<String> apikeyId) {
            $.apikeyId = apikeyId;
            return this;
        }

        /**
         * @param apikeyId Identifier of the API Key
         * 
         * @return builder
         * 
         */
        public Builder apikeyId(String apikeyId) {
            return apikeyId(Output.of(apikeyId));
        }

        /**
         * @param apikeyType Type of the API Key
         * 
         * @return builder
         * 
         */
        public Builder apikeyType(Output<String> apikeyType) {
            $.apikeyType = apikeyType;
            return this;
        }

        /**
         * @param apikeyType Type of the API Key
         * 
         * @return builder
         * 
         */
        public Builder apikeyType(String apikeyType) {
            return apikeyType(Output.of(apikeyType));
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
         * @param email Email Id of the user who created the Token
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email Id of the user who created the Token
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param encodedPassword Encoded password of the Token
         * 
         * @return builder
         * 
         */
        public Builder encodedPassword(@Nullable Output<String> encodedPassword) {
            $.encodedPassword = encodedPassword;
            return this;
        }

        /**
         * @param encodedPassword Encoded password of the Token
         * 
         * @return builder
         * 
         */
        public Builder encodedPassword(String encodedPassword) {
            return encodedPassword(Output.of(encodedPassword));
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
         * @param parentId Parent Entity Identifier of the API Key
         * 
         * @return builder
         * 
         */
        public Builder parentId(Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId Parent Entity Identifier of the API Key
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
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
         * @param scheduledExpireTime Scheduled expiry time in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder scheduledExpireTime(@Nullable Output<Integer> scheduledExpireTime) {
            $.scheduledExpireTime = scheduledExpireTime;
            return this;
        }

        /**
         * @param scheduledExpireTime Scheduled expiry time in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder scheduledExpireTime(Integer scheduledExpireTime) {
            return scheduledExpireTime(Output.of(scheduledExpireTime));
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

        /**
         * @param username Name of the user who created the Token
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Name of the user who created the Token
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param valid Boolean value to indicate if Token is valid or not.
         * 
         * @return builder
         * 
         */
        public Builder valid(@Nullable Output<Boolean> valid) {
            $.valid = valid;
            return this;
        }

        /**
         * @param valid Boolean value to indicate if Token is valid or not.
         * 
         * @return builder
         * 
         */
        public Builder valid(Boolean valid) {
            return valid(Output.of(valid));
        }

        /**
         * @param validFrom This is the time from which the Token is valid. The time is in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder validFrom(@Nullable Output<Integer> validFrom) {
            $.validFrom = validFrom;
            return this;
        }

        /**
         * @param validFrom This is the time from which the Token is valid. The time is in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder validFrom(Integer validFrom) {
            return validFrom(Output.of(validFrom));
        }

        /**
         * @param validTo This is the time till which the Token is valid. The time is in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder validTo(@Nullable Output<Integer> validTo) {
            $.validTo = validTo;
            return this;
        }

        /**
         * @param validTo This is the time till which the Token is valid. The time is in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder validTo(Integer validTo) {
            return validTo(Output.of(validTo));
        }

        public TokenArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("TokenArgs", "accountId");
            }
            if ($.apikeyId == null) {
                throw new MissingRequiredPropertyException("TokenArgs", "apikeyId");
            }
            if ($.apikeyType == null) {
                throw new MissingRequiredPropertyException("TokenArgs", "apikeyType");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("TokenArgs", "identifier");
            }
            if ($.parentId == null) {
                throw new MissingRequiredPropertyException("TokenArgs", "parentId");
            }
            return $;
        }
    }

}
