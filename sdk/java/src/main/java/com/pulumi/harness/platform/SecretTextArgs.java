// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.inputs.SecretTextAdditionalMetadataArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretTextArgs Empty = new SecretTextArgs();

    /**
     * Additional Metadata for the Secret
     * 
     */
    @Import(name="additionalMetadatas")
    private @Nullable Output<List<SecretTextAdditionalMetadataArgs>> additionalMetadatas;

    /**
     * @return Additional Metadata for the Secret
     * 
     */
    public Optional<Output<List<SecretTextAdditionalMetadataArgs>>> additionalMetadatas() {
        return Optional.ofNullable(this.additionalMetadatas);
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
     * Identifier of the Secret Manager used to manage the secret.
     * 
     */
    @Import(name="secretManagerIdentifier", required=true)
    private Output<String> secretManagerIdentifier;

    /**
     * @return Identifier of the Secret Manager used to manage the secret.
     * 
     */
    public Output<String> secretManagerIdentifier() {
        return this.secretManagerIdentifier;
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
     * Value of the Secret
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the Secret
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * This has details to specify if the secret value is Inline or Reference.
     * 
     */
    @Import(name="valueType", required=true)
    private Output<String> valueType;

    /**
     * @return This has details to specify if the secret value is Inline or Reference.
     * 
     */
    public Output<String> valueType() {
        return this.valueType;
    }

    private SecretTextArgs() {}

    private SecretTextArgs(SecretTextArgs $) {
        this.additionalMetadatas = $.additionalMetadatas;
        this.description = $.description;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.secretManagerIdentifier = $.secretManagerIdentifier;
        this.tags = $.tags;
        this.value = $.value;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretTextArgs $;

        public Builder() {
            $ = new SecretTextArgs();
        }

        public Builder(SecretTextArgs defaults) {
            $ = new SecretTextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalMetadatas Additional Metadata for the Secret
         * 
         * @return builder
         * 
         */
        public Builder additionalMetadatas(@Nullable Output<List<SecretTextAdditionalMetadataArgs>> additionalMetadatas) {
            $.additionalMetadatas = additionalMetadatas;
            return this;
        }

        /**
         * @param additionalMetadatas Additional Metadata for the Secret
         * 
         * @return builder
         * 
         */
        public Builder additionalMetadatas(List<SecretTextAdditionalMetadataArgs> additionalMetadatas) {
            return additionalMetadatas(Output.of(additionalMetadatas));
        }

        /**
         * @param additionalMetadatas Additional Metadata for the Secret
         * 
         * @return builder
         * 
         */
        public Builder additionalMetadatas(SecretTextAdditionalMetadataArgs... additionalMetadatas) {
            return additionalMetadatas(List.of(additionalMetadatas));
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
         * @param secretManagerIdentifier Identifier of the Secret Manager used to manage the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretManagerIdentifier(Output<String> secretManagerIdentifier) {
            $.secretManagerIdentifier = secretManagerIdentifier;
            return this;
        }

        /**
         * @param secretManagerIdentifier Identifier of the Secret Manager used to manage the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretManagerIdentifier(String secretManagerIdentifier) {
            return secretManagerIdentifier(Output.of(secretManagerIdentifier));
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
         * @param value Value of the Secret
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the Secret
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueType This has details to specify if the secret value is Inline or Reference.
         * 
         * @return builder
         * 
         */
        public Builder valueType(Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType This has details to specify if the secret value is Inline or Reference.
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public SecretTextArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("SecretTextArgs", "identifier");
            }
            if ($.secretManagerIdentifier == null) {
                throw new MissingRequiredPropertyException("SecretTextArgs", "secretManagerIdentifier");
            }
            if ($.valueType == null) {
                throw new MissingRequiredPropertyException("SecretTextArgs", "valueType");
            }
            return $;
        }
    }

}