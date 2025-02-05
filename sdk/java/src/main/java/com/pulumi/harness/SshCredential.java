// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.SshCredentialArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.SshCredentialState;
import com.pulumi.harness.outputs.SshCredentialKerberosAuthentication;
import com.pulumi.harness.outputs.SshCredentialSshAuthentication;
import com.pulumi.harness.outputs.SshCredentialUsageScope;
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
 * import com.pulumi.tls.privateKey;
 * import com.pulumi.tls.PrivateKeyArgs;
 * import com.pulumi.harness.HarnessFunctions;
 * import com.pulumi.harness.inputs.GetSecretManagerArgs;
 * import com.pulumi.harness.EncryptedText;
 * import com.pulumi.harness.EncryptedTextArgs;
 * import com.pulumi.harness.SshCredential;
 * import com.pulumi.harness.SshCredentialArgs;
 * import com.pulumi.harness.inputs.SshCredentialSshAuthenticationArgs;
 * import com.pulumi.harness.inputs.SshCredentialSshAuthenticationInlineSshArgs;
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
 *         var harnessDeployKey = new PrivateKey("harnessDeployKey", PrivateKeyArgs.builder()
 *             .algorithm("RSA")
 *             .rsaBits(4096)
 *             .build());
 * 
 *         final var secretManager = HarnessFunctions.getSecretManager(GetSecretManagerArgs.builder()
 *             .default_(true)
 *             .build());
 * 
 *         var mySecret = new EncryptedText("mySecret", EncryptedTextArgs.builder()
 *             .name("my_secret")
 *             .value(harnessDeployKey.privateKeyPem())
 *             .secretManagerId(secretManager.applyValue(getSecretManagerResult -> getSecretManagerResult.id()))
 *             .build());
 * 
 *         var sshCreds = new SshCredential("sshCreds", SshCredentialArgs.builder()
 *             .name("ssh-test")
 *             .sshAuthentication(SshCredentialSshAuthenticationArgs.builder()
 *                 .port(22)
 *                 .username("git")
 *                 .inlineSsh(SshCredentialSshAuthenticationInlineSshArgs.builder()
 *                     .sshKeyFileId(mySecret.id())
 *                     .build())
 *                 .build())
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
 * Import using the Harness ssh credential id
 * 
 * ```sh
 * $ pulumi import harness:index/sshCredential:SshCredential example &lt;credential_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:index/sshCredential:SshCredential")
public class SshCredential extends com.pulumi.resources.CustomResource {
    /**
     * Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
     * 
     */
    @Export(name="kerberosAuthentication", refs={SshCredentialKerberosAuthentication.class}, tree="[0]")
    private Output</* @Nullable */ SshCredentialKerberosAuthentication> kerberosAuthentication;

    /**
     * @return Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
     * 
     */
    public Output<Optional<SshCredentialKerberosAuthentication>> kerberosAuthentication() {
        return Codegen.optional(this.kerberosAuthentication);
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
     * Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
     * 
     */
    @Export(name="sshAuthentication", refs={SshCredentialSshAuthentication.class}, tree="[0]")
    private Output</* @Nullable */ SshCredentialSshAuthentication> sshAuthentication;

    /**
     * @return Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
     * 
     */
    public Output<Optional<SshCredentialSshAuthentication>> sshAuthentication() {
        return Codegen.optional(this.sshAuthentication);
    }
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Export(name="usageScopes", refs={List.class,SshCredentialUsageScope.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SshCredentialUsageScope>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Output<Optional<List<SshCredentialUsageScope>>> usageScopes() {
        return Codegen.optional(this.usageScopes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshCredential(java.lang.String name) {
        this(name, SshCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshCredential(java.lang.String name, @Nullable SshCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshCredential(java.lang.String name, @Nullable SshCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/sshCredential:SshCredential", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SshCredential(java.lang.String name, Output<java.lang.String> id, @Nullable SshCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/sshCredential:SshCredential", name, state, makeResourceOptions(options, id), false);
    }

    private static SshCredentialArgs makeArgs(@Nullable SshCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SshCredentialArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi")
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
    public static SshCredential get(java.lang.String name, Output<java.lang.String> id, @Nullable SshCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshCredential(name, id, state, options);
    }
}
