// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.RepoWebhookArgs;
import com.pulumi.harness.platform.inputs.RepoWebhookState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness Repo Webhook.
 * 
 */
@ResourceType(type="harness:platform/repoWebhook:RepoWebhook")
public class RepoWebhook extends com.pulumi.resources.CustomResource {
    /**
     * Timestamp when the webhook was created.
     * 
     */
    @Export(name="created", refs={Integer.class}, tree="[0]")
    private Output<Integer> created;

    /**
     * @return Timestamp when the webhook was created.
     * 
     */
    public Output<Integer> created() {
        return this.created;
    }
    /**
     * ID of the user who created the webhook.
     * 
     */
    @Export(name="createdBy", refs={Integer.class}, tree="[0]")
    private Output<Integer> createdBy;

    /**
     * @return ID of the user who created the webhook.
     * 
     */
    public Output<Integer> createdBy() {
        return this.createdBy;
    }
    /**
     * Description of the webhook.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the webhook.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Webhook enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Webhook enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Created webhook has secret encoding.
     * 
     */
    @Export(name="hasSecret", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hasSecret;

    /**
     * @return Created webhook has secret encoding.
     * 
     */
    public Output<Boolean> hasSecret() {
        return this.hasSecret;
    }
    /**
     * Identifier of the webhook.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier of the webhook.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Allow insecure connections for provided webhook URL.
     * 
     */
    @Export(name="insecure", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> insecure;

    /**
     * @return Allow insecure connections for provided webhook URL.
     * 
     */
    public Output<Boolean> insecure() {
        return this.insecure;
    }
    /**
     * Unique identifier of the organization.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Identifier of the repository.
     * 
     */
    @Export(name="repoIdentifier", refs={String.class}, tree="[0]")
    private Output<String> repoIdentifier;

    /**
     * @return Identifier of the repository.
     * 
     */
    public Output<String> repoIdentifier() {
        return this.repoIdentifier;
    }
    /**
     * Webhook secret which will be used to sign the webhook payload.
     * 
     */
    @Export(name="secret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secret;

    /**
     * @return Webhook secret which will be used to sign the webhook payload.
     * 
     */
    public Output<Optional<String>> secret() {
        return Codegen.optional(this.secret);
    }
    /**
     * List of triggers of the webhook (keep empty for all triggers).
     * 
     */
    @Export(name="triggers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> triggers;

    /**
     * @return List of triggers of the webhook (keep empty for all triggers).
     * 
     */
    public Output<Optional<List<String>>> triggers() {
        return Codegen.optional(this.triggers);
    }
    /**
     * URL that&#39;s called by the webhook.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return URL that&#39;s called by the webhook.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RepoWebhook(java.lang.String name) {
        this(name, RepoWebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RepoWebhook(java.lang.String name, RepoWebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepoWebhook(java.lang.String name, RepoWebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/repoWebhook:RepoWebhook", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RepoWebhook(java.lang.String name, Output<java.lang.String> id, @Nullable RepoWebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/repoWebhook:RepoWebhook", name, state, makeResourceOptions(options, id), false);
    }

    private static RepoWebhookArgs makeArgs(RepoWebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RepoWebhookArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secret"
            ))
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
    public static RepoWebhook get(java.lang.String name, Output<java.lang.String> id, @Nullable RepoWebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RepoWebhook(name, id, state, options);
    }
}
