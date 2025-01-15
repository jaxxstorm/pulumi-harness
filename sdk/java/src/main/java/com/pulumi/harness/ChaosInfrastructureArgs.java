// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChaosInfrastructureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChaosInfrastructureArgs Empty = new ChaosInfrastructureArgs();

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
     * Environment ID of the chaos infrastructure.
     * 
     */
    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    /**
     * @return Environment ID of the chaos infrastructure.
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
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
     * Namespace of the chaos infrastructure.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return Namespace of the chaos infrastructure.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
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
     * Service Account of the chaos infrastructure.
     * 
     */
    @Import(name="serviceAccount", required=true)
    private Output<String> serviceAccount;

    /**
     * @return Service Account of the chaos infrastructure.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
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

    private ChaosInfrastructureArgs() {}

    private ChaosInfrastructureArgs(ChaosInfrastructureArgs $) {
        this.description = $.description;
        this.environmentId = $.environmentId;
        this.identifier = $.identifier;
        this.name = $.name;
        this.namespace = $.namespace;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.serviceAccount = $.serviceAccount;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChaosInfrastructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChaosInfrastructureArgs $;

        public Builder() {
            $ = new ChaosInfrastructureArgs();
        }

        public Builder(ChaosInfrastructureArgs defaults) {
            $ = new ChaosInfrastructureArgs(Objects.requireNonNull(defaults));
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
         * @param environmentId Environment ID of the chaos infrastructure.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId Environment ID of the chaos infrastructure.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
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
         * @param namespace Namespace of the chaos infrastructure.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace of the chaos infrastructure.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
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
         * @param serviceAccount Service Account of the chaos infrastructure.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Service Account of the chaos infrastructure.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
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

        public ChaosInfrastructureArgs build() {
            if ($.environmentId == null) {
                throw new MissingRequiredPropertyException("ChaosInfrastructureArgs", "environmentId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("ChaosInfrastructureArgs", "identifier");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("ChaosInfrastructureArgs", "namespace");
            }
            if ($.serviceAccount == null) {
                throw new MissingRequiredPropertyException("ChaosInfrastructureArgs", "serviceAccount");
            }
            return $;
        }
    }

}
