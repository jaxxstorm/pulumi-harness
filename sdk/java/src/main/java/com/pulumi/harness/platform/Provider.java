// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ProviderArgs;
import com.pulumi.harness.platform.inputs.ProviderState;
import com.pulumi.harness.platform.outputs.ProviderSpec;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="harness:platform/provider:Provider")
public class Provider extends com.pulumi.resources.CustomResource {
    /**
     * The description of the provider entity.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the provider entity.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The identifier of the provider entity.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return The identifier of the provider entity.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * The last modified time of the provider entity.
     * 
     */
    @Export(name="lastModifiedAt", refs={Integer.class}, tree="[0]")
    private Output<Integer> lastModifiedAt;

    /**
     * @return The last modified time of the provider entity.
     * 
     */
    public Output<Integer> lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * The name of the provider entity.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the provider entity.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Contains parameters related to the provider entity.
     * 
     */
    @Export(name="spec", refs={ProviderSpec.class}, tree="[0]")
    private Output<ProviderSpec> spec;

    /**
     * @return Contains parameters related to the provider entity.
     * 
     */
    public Output<ProviderSpec> spec() {
        return this.spec;
    }
    /**
     * The type of the provider entity.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the provider entity.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(java.lang.String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(java.lang.String name, ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(java.lang.String name, ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/provider:Provider", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Provider(java.lang.String name, Output<java.lang.String> id, @Nullable ProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/provider:Provider", name, state, makeResourceOptions(options, id), false);
    }

    private static ProviderArgs makeArgs(ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Provider get(java.lang.String name, Output<java.lang.String> id, @Nullable ProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Provider(name, id, state, options);
    }
}