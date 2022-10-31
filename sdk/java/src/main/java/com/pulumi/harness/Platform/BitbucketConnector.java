// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.BitbucketConnectorArgs;
import com.pulumi.harness.platform.inputs.BitbucketConnectorState;
import com.pulumi.harness.platform.outputs.BitbucketConnectorApiAuthentication;
import com.pulumi.harness.platform.outputs.BitbucketConnectorCredentials;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Bitbucket connector.
 * 
 */
@ResourceType(type="harness:platform/bitbucketConnector:BitbucketConnector")
public class BitbucketConnector extends com.pulumi.resources.CustomResource {
    /**
     * Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     * 
     */
    @Export(name="apiAuthentication", type=BitbucketConnectorApiAuthentication.class, parameters={})
    private Output</* @Nullable */ BitbucketConnectorApiAuthentication> apiAuthentication;

    /**
     * @return Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     * 
     */
    public Output<Optional<BitbucketConnectorApiAuthentication>> apiAuthentication() {
        return Codegen.optional(this.apiAuthentication);
    }
    /**
     * Whether the connection we&#39;re making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
     * 
     */
    @Export(name="connectionType", type=String.class, parameters={})
    private Output<String> connectionType;

    /**
     * @return Whether the connection we&#39;re making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
     * 
     */
    public Output<String> connectionType() {
        return this.connectionType;
    }
    /**
     * Credentials to use for the connection.
     * 
     */
    @Export(name="credentials", type=BitbucketConnectorCredentials.class, parameters={})
    private Output<BitbucketConnectorCredentials> credentials;

    /**
     * @return Credentials to use for the connection.
     * 
     */
    public Output<BitbucketConnectorCredentials> credentials() {
        return this.credentials;
    }
    /**
     * Connect using only the delegates which have these tags.
     * 
     */
    @Export(name="delegateSelectors", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Connect using only the delegates which have these tags.
     * 
     */
    public Output<Optional<List<String>>> delegateSelectors() {
        return Codegen.optional(this.delegateSelectors);
    }
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique identifier of the resource.
     * 
     */
    @Export(name="identifier", type=String.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique identifier of the Organization.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Unique identifier of the Organization.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Unique identifier of the Project.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Unique identifier of the Project.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Url of the BitBucket repository or account.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return Url of the BitBucket repository or account.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    @Export(name="validationRepo", type=String.class, parameters={})
    private Output</* @Nullable */ String> validationRepo;

    /**
     * @return Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    public Output<Optional<String>> validationRepo() {
        return Codegen.optional(this.validationRepo);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BitbucketConnector(String name) {
        this(name, BitbucketConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BitbucketConnector(String name, BitbucketConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BitbucketConnector(String name, BitbucketConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/bitbucketConnector:BitbucketConnector", name, args == null ? BitbucketConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BitbucketConnector(String name, Output<String> id, @Nullable BitbucketConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/bitbucketConnector:BitbucketConnector", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BitbucketConnector get(String name, Output<String> id, @Nullable BitbucketConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BitbucketConnector(name, id, state, options);
    }
}
