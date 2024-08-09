// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.EncryptedTextArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.EncryptedTextState;
import com.pulumi.harness.outputs.EncryptedTextUsageScope;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an encrypted text secret
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
 * import com.pulumi.harness.HarnessFunctions;
 * import com.pulumi.harness.inputs.GetSecretManagerArgs;
 * import com.pulumi.harness.EncryptedText;
 * import com.pulumi.harness.EncryptedTextArgs;
 * import com.pulumi.harness.inputs.EncryptedTextUsageScopeArgs;
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
 *         final var default = HarnessFunctions.getSecretManager(GetSecretManagerArgs.builder()
 *             .default_(true)
 *             .build());
 * 
 *         var example = new EncryptedText("example", EncryptedTextArgs.builder()
 *             .name("example-secret")
 *             .value("someval")
 *             .secretManagerId(default_.id())
 *             .usageScopes(            
 *                 EncryptedTextUsageScopeArgs.builder()
 *                     .environmentFilterType("PRODUCTION_ENVIRONMENTS")
 *                     .build(),
 *                 EncryptedTextUsageScopeArgs.builder()
 *                     .environmentFilterType("NON_PRODUCTION_ENVIRONMENTS")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Import using the Harness encrypted text format.
 * 
 * NOTE: The secret value cannot be decrypted and imported.
 * 
 * ```sh
 * $ pulumi import harness:index/encryptedText:EncryptedText example &lt;secret_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:index/encryptedText:EncryptedText")
public class EncryptedText extends com.pulumi.resources.CustomResource {
    /**
     * Boolean that indicates whether or not to inherit the usage scopes from the secret manager
     * 
     */
    @Export(name="inheritScopesFromSecretManager", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> inheritScopesFromSecretManager;

    /**
     * @return Boolean that indicates whether or not to inherit the usage scopes from the secret manager
     * 
     */
    public Output<Optional<Boolean>> inheritScopesFromSecretManager() {
        return Codegen.optional(this.inheritScopesFromSecretManager);
    }
    /**
     * Name of the encrypted text secret
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the encrypted text secret
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Boolean that indicates whether or not the secret is scoped to the account
     * 
     */
    @Export(name="scopedToAccount", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> scopedToAccount;

    /**
     * @return Boolean that indicates whether or not the secret is scoped to the account
     * 
     */
    public Output<Optional<Boolean>> scopedToAccount() {
        return Codegen.optional(this.scopedToAccount);
    }
    /**
     * The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
     * 
     */
    @Export(name="secretManagerId", refs={String.class}, tree="[0]")
    private Output<String> secretManagerId;

    /**
     * @return The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
     * 
     */
    public Output<String> secretManagerId() {
        return this.secretManagerId;
    }
    /**
     * Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
     * 
     */
    @Export(name="secretReference", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secretReference;

    /**
     * @return Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
     * 
     */
    public Output<Optional<String>> secretReference() {
        return Codegen.optional(this.secretReference);
    }
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Export(name="usageScopes", refs={List.class,EncryptedTextUsageScope.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EncryptedTextUsageScope>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Output<Optional<List<EncryptedTextUsageScope>>> usageScopes() {
        return Codegen.optional(this.usageScopes);
    }
    /**
     * The value of the secret.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> value;

    /**
     * @return The value of the secret.
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EncryptedText(java.lang.String name) {
        this(name, EncryptedTextArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EncryptedText(java.lang.String name, EncryptedTextArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EncryptedText(java.lang.String name, EncryptedTextArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/encryptedText:EncryptedText", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EncryptedText(java.lang.String name, Output<java.lang.String> id, @Nullable EncryptedTextState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/encryptedText:EncryptedText", name, state, makeResourceOptions(options, id), false);
    }

    private static EncryptedTextArgs makeArgs(EncryptedTextArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EncryptedTextArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
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
    public static EncryptedText get(java.lang.String name, Output<java.lang.String> id, @Nullable EncryptedTextState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EncryptedText(name, id, state, options);
    }
}
