// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DelegatetokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final DelegatetokenArgs Empty = new DelegatetokenArgs();

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
     * Time when the delegate token is created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<Integer> createdAt;

    /**
     * @return Time when the delegate token is created.
     * 
     */
    public Optional<Output<Integer>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * created by details.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<Map<String,String>> createdBy;

    /**
     * @return created by details.
     * 
     */
    public Optional<Output<Map<String,String>>> createdBy() {
        return Optional.ofNullable(this.createdBy);
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
     * Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
     * 
     */
    @Import(name="tokenStatus")
    private @Nullable Output<String> tokenStatus;

    /**
     * @return Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
     * 
     */
    public Optional<Output<String>> tokenStatus() {
        return Optional.ofNullable(this.tokenStatus);
    }

    /**
     * Value of the delegate Token
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the delegate Token
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DelegatetokenArgs() {}

    private DelegatetokenArgs(DelegatetokenArgs $) {
        this.accountId = $.accountId;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.tokenStatus = $.tokenStatus;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DelegatetokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DelegatetokenArgs $;

        public Builder() {
            $ = new DelegatetokenArgs();
        }

        public Builder(DelegatetokenArgs defaults) {
            $ = new DelegatetokenArgs(Objects.requireNonNull(defaults));
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
         * @param createdAt Time when the delegate token is created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<Integer> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Time when the delegate token is created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(Integer createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy created by details.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<Map<String,String>> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy created by details.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(Map<String,String> createdBy) {
            return createdBy(Output.of(createdBy));
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
         * @param tokenStatus Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
         * 
         * @return builder
         * 
         */
        public Builder tokenStatus(@Nullable Output<String> tokenStatus) {
            $.tokenStatus = tokenStatus;
            return this;
        }

        /**
         * @param tokenStatus Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
         * 
         * @return builder
         * 
         */
        public Builder tokenStatus(String tokenStatus) {
            return tokenStatus(Output.of(tokenStatus));
        }

        /**
         * @param value Value of the delegate Token
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the delegate Token
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DelegatetokenArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("DelegatetokenArgs", "accountId");
            }
            return $;
        }
    }

}
