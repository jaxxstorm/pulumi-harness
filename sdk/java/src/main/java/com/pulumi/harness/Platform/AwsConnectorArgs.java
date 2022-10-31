// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.AwsConnectorCrossAccountAccessArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorInheritFromDelegateArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorIrsaArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorManualArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsConnectorArgs Empty = new AwsConnectorArgs();

    /**
     * Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     * 
     */
    @Import(name="crossAccountAccess")
    private @Nullable Output<AwsConnectorCrossAccountAccessArgs> crossAccountAccess;

    /**
     * @return Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     * 
     */
    public Optional<Output<AwsConnectorCrossAccountAccessArgs>> crossAccountAccess() {
        return Optional.ofNullable(this.crossAccountAccess);
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
     * Inherit credentials from the delegate.
     * 
     */
    @Import(name="inheritFromDelegate")
    private @Nullable Output<AwsConnectorInheritFromDelegateArgs> inheritFromDelegate;

    /**
     * @return Inherit credentials from the delegate.
     * 
     */
    public Optional<Output<AwsConnectorInheritFromDelegateArgs>> inheritFromDelegate() {
        return Optional.ofNullable(this.inheritFromDelegate);
    }

    /**
     * Use IAM role for service accounts.
     * 
     */
    @Import(name="irsa")
    private @Nullable Output<AwsConnectorIrsaArgs> irsa;

    /**
     * @return Use IAM role for service accounts.
     * 
     */
    public Optional<Output<AwsConnectorIrsaArgs>> irsa() {
        return Optional.ofNullable(this.irsa);
    }

    /**
     * Use IAM role for service accounts.
     * 
     */
    @Import(name="manual")
    private @Nullable Output<AwsConnectorManualArgs> manual;

    /**
     * @return Use IAM role for service accounts.
     * 
     */
    public Optional<Output<AwsConnectorManualArgs>> manual() {
        return Optional.ofNullable(this.manual);
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
     * Unique identifier of the Organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the Organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the Project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the Project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AwsConnectorArgs() {}

    private AwsConnectorArgs(AwsConnectorArgs $) {
        this.crossAccountAccess = $.crossAccountAccess;
        this.description = $.description;
        this.identifier = $.identifier;
        this.inheritFromDelegate = $.inheritFromDelegate;
        this.irsa = $.irsa;
        this.manual = $.manual;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsConnectorArgs $;

        public Builder() {
            $ = new AwsConnectorArgs();
        }

        public Builder(AwsConnectorArgs defaults) {
            $ = new AwsConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossAccountAccess Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
         * 
         * @return builder
         * 
         */
        public Builder crossAccountAccess(@Nullable Output<AwsConnectorCrossAccountAccessArgs> crossAccountAccess) {
            $.crossAccountAccess = crossAccountAccess;
            return this;
        }

        /**
         * @param crossAccountAccess Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
         * 
         * @return builder
         * 
         */
        public Builder crossAccountAccess(AwsConnectorCrossAccountAccessArgs crossAccountAccess) {
            return crossAccountAccess(Output.of(crossAccountAccess));
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
         * @param inheritFromDelegate Inherit credentials from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(@Nullable Output<AwsConnectorInheritFromDelegateArgs> inheritFromDelegate) {
            $.inheritFromDelegate = inheritFromDelegate;
            return this;
        }

        /**
         * @param inheritFromDelegate Inherit credentials from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(AwsConnectorInheritFromDelegateArgs inheritFromDelegate) {
            return inheritFromDelegate(Output.of(inheritFromDelegate));
        }

        /**
         * @param irsa Use IAM role for service accounts.
         * 
         * @return builder
         * 
         */
        public Builder irsa(@Nullable Output<AwsConnectorIrsaArgs> irsa) {
            $.irsa = irsa;
            return this;
        }

        /**
         * @param irsa Use IAM role for service accounts.
         * 
         * @return builder
         * 
         */
        public Builder irsa(AwsConnectorIrsaArgs irsa) {
            return irsa(Output.of(irsa));
        }

        /**
         * @param manual Use IAM role for service accounts.
         * 
         * @return builder
         * 
         */
        public Builder manual(@Nullable Output<AwsConnectorManualArgs> manual) {
            $.manual = manual;
            return this;
        }

        /**
         * @param manual Use IAM role for service accounts.
         * 
         * @return builder
         * 
         */
        public Builder manual(AwsConnectorManualArgs manual) {
            return manual(Output.of(manual));
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
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public AwsConnectorArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            return $;
        }
    }

}
