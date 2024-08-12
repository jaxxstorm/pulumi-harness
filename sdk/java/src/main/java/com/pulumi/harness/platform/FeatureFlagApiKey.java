// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.FeatureFlagApiKeyArgs;
import com.pulumi.harness.platform.inputs.FeatureFlagApiKeyState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an environment SDK key for Feature Flags.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.FeatureFlagApiKey;
 * import com.pulumi.harness.platform.FeatureFlagApiKeyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testserverapikey = new FeatureFlagApiKey("testserverapikey", FeatureFlagApiKeyArgs.builder()
 *             .identifier("testserver")
 *             .name("TestServer")
 *             .description("this is a server SDK key")
 *             .orgId("test")
 *             .projectId("testff")
 *             .envId("testenv")
 *             .expiredAt(1713729225)
 *             .type("Server")
 *             .build());
 * 
 *         ctx.export("serversdkkey", testserverapikey.apiKey());
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="harness:platform/featureFlagApiKey:FeatureFlagApiKey")
public class FeatureFlagApiKey extends com.pulumi.resources.CustomResource {
    /**
     * The value of the SDK API Key
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output<String> apiKey;

    /**
     * @return The value of the SDK API Key
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }
    /**
     * Description of the SDK API Key
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the SDK API Key
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Environment Identifier
     * 
     */
    @Export(name="envId", refs={String.class}, tree="[0]")
    private Output<String> envId;

    /**
     * @return Environment Identifier
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }
    /**
     * Expiration datetime of the SDK API Key
     * 
     */
    @Export(name="expiredAt", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> expiredAt;

    /**
     * @return Expiration datetime of the SDK API Key
     * 
     */
    public Output<Optional<Integer>> expiredAt() {
        return Codegen.optional(this.expiredAt);
    }
    /**
     * Identifier of the SDK API Key
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier of the SDK API Key
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Name of the SDK API Key
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the SDK API Key
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Organization Identifier
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return Organization Identifier
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Project Identifier
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Project Identifier
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Type of SDK. Valid values are `Server` or `Client`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of SDK. Valid values are `Server` or `Client`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FeatureFlagApiKey(java.lang.String name) {
        this(name, FeatureFlagApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FeatureFlagApiKey(java.lang.String name, FeatureFlagApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FeatureFlagApiKey(java.lang.String name, FeatureFlagApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/featureFlagApiKey:FeatureFlagApiKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FeatureFlagApiKey(java.lang.String name, Output<java.lang.String> id, @Nullable FeatureFlagApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/featureFlagApiKey:FeatureFlagApiKey", name, state, makeResourceOptions(options, id), false);
    }

    private static FeatureFlagApiKeyArgs makeArgs(FeatureFlagApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FeatureFlagApiKeyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiKey"
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
    public static FeatureFlagApiKey get(java.lang.String name, Output<java.lang.String> id, @Nullable FeatureFlagApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FeatureFlagApiKey(name, id, state, options);
    }
}
