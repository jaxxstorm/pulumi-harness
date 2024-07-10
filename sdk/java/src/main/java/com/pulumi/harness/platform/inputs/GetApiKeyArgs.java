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


public final class GetApiKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiKeyArgs Empty = new GetApiKeyArgs();

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
     * Default expiration time of the Token within API Key
     * 
     */
    @Import(name="defaultTimeToExpireToken")
    private @Nullable Output<Integer> defaultTimeToExpireToken;

    /**
     * @return Default expiration time of the Token within API Key
     * 
     */
    public Optional<Output<Integer>> defaultTimeToExpireToken() {
        return Optional.ofNullable(this.defaultTimeToExpireToken);
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

    private GetApiKeyArgs() {}

    private GetApiKeyArgs(GetApiKeyArgs $) {
        this.accountId = $.accountId;
        this.apikeyType = $.apikeyType;
        this.defaultTimeToExpireToken = $.defaultTimeToExpireToken;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.parentId = $.parentId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiKeyArgs $;

        public Builder() {
            $ = new GetApiKeyArgs();
        }

        public Builder(GetApiKeyArgs defaults) {
            $ = new GetApiKeyArgs(Objects.requireNonNull(defaults));
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
         * @param defaultTimeToExpireToken Default expiration time of the Token within API Key
         * 
         * @return builder
         * 
         */
        public Builder defaultTimeToExpireToken(@Nullable Output<Integer> defaultTimeToExpireToken) {
            $.defaultTimeToExpireToken = defaultTimeToExpireToken;
            return this;
        }

        /**
         * @param defaultTimeToExpireToken Default expiration time of the Token within API Key
         * 
         * @return builder
         * 
         */
        public Builder defaultTimeToExpireToken(Integer defaultTimeToExpireToken) {
            return defaultTimeToExpireToken(Output.of(defaultTimeToExpireToken));
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

        public GetApiKeyArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetApiKeyArgs", "accountId");
            }
            if ($.apikeyType == null) {
                throw new MissingRequiredPropertyException("GetApiKeyArgs", "apikeyType");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetApiKeyArgs", "identifier");
            }
            if ($.parentId == null) {
                throw new MissingRequiredPropertyException("GetApiKeyArgs", "parentId");
            }
            return $;
        }
    }

}
