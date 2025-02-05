// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.KubernetesConnectorArgs;
import com.pulumi.harness.platform.inputs.KubernetesConnectorState;
import com.pulumi.harness.platform.outputs.KubernetesConnectorClientKeyCert;
import com.pulumi.harness.platform.outputs.KubernetesConnectorInheritFromDelegate;
import com.pulumi.harness.platform.outputs.KubernetesConnectorOpenidConnect;
import com.pulumi.harness.platform.outputs.KubernetesConnectorServiceAccount;
import com.pulumi.harness.platform.outputs.KubernetesConnectorUsernamePassword;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a K8s connector.
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
 * import com.pulumi.harness.platform.KubernetesConnector;
 * import com.pulumi.harness.platform.KubernetesConnectorArgs;
 * import com.pulumi.harness.platform.inputs.KubernetesConnectorClientKeyCertArgs;
 * import com.pulumi.harness.platform.inputs.KubernetesConnectorUsernamePasswordArgs;
 * import com.pulumi.harness.platform.inputs.KubernetesConnectorServiceAccountArgs;
 * import com.pulumi.harness.platform.inputs.KubernetesConnectorOpenidConnectArgs;
 * import com.pulumi.harness.platform.inputs.KubernetesConnectorInheritFromDelegateArgs;
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
 *         var clientKeyCert = new KubernetesConnector("clientKeyCert", KubernetesConnectorArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("description")
 *             .tags("foo:bar")
 *             .clientKeyCert(KubernetesConnectorClientKeyCertArgs.builder()
 *                 .masterUrl("https://kubernetes.example.com")
 *                 .caCertRef("account.TEST_k8ss_client_stuff")
 *                 .clientCertRef("account.test_k8s_client_cert")
 *                 .clientKeyRef("account.TEST_k8s_client_key")
 *                 .clientKeyPassphraseRef("account.TEST_k8s_client_test")
 *                 .clientKeyAlgorithm("RSA")
 *                 .build())
 *             .delegateSelectors("harness-delegate")
 *             .build());
 * 
 *         var usernamePassword = new KubernetesConnector("usernamePassword", KubernetesConnectorArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("description")
 *             .tags("foo:bar")
 *             .usernamePassword(KubernetesConnectorUsernamePasswordArgs.builder()
 *                 .masterUrl("https://kubernetes.example.com")
 *                 .username("admin")
 *                 .passwordRef("account.TEST_k8s_client_test")
 *                 .build())
 *             .delegateSelectors("harness-delegate")
 *             .build());
 * 
 *         var serviceAccount = new KubernetesConnector("serviceAccount", KubernetesConnectorArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("description")
 *             .tags("foo:bar")
 *             .serviceAccount(KubernetesConnectorServiceAccountArgs.builder()
 *                 .masterUrl("https://kubernetes.example.com")
 *                 .serviceAccountTokenRef("account.TEST_k8s_client_test")
 *                 .build())
 *             .delegateSelectors("harness-delegate")
 *             .build());
 * 
 *         var openIDConnect = new KubernetesConnector("openIDConnect", KubernetesConnectorArgs.builder()
 *             .identifier("%[1]s")
 *             .name("%[2]s")
 *             .description("description")
 *             .tags("foo:bar")
 *             .openidConnect(KubernetesConnectorOpenidConnectArgs.builder()
 *                 .masterUrl("https://kubernetes.example.com")
 *                 .issuerUrl("https://oidc.example.com")
 *                 .usernameRef("account.TEST_k8s_client_test")
 *                 .clientIdRef("account.TEST_k8s_client_test")
 *                 .passwordRef("account.TEST_k8s_client_test")
 *                 .secretRef("account.TEST_k8s_client_test")
 *                 .scopes(                
 *                     "scope1",
 *                     "scope2")
 *                 .build())
 *             .delegateSelectors("harness-delegate")
 *             .build());
 * 
 *         var inheritFromDelegate = new KubernetesConnector("inheritFromDelegate", KubernetesConnectorArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("description")
 *             .tags("foo:bar")
 *             .inheritFromDelegate(KubernetesConnectorInheritFromDelegateArgs.builder()
 *                 .delegateSelectors("harness-delegate")
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
 * Import account level kubernetes connector
 * 
 * ```sh
 * $ pulumi import harness:platform/kubernetesConnector:KubernetesConnector example &lt;connector_id&gt;
 * ```
 * 
 * Import org level kubernetes connector
 * 
 * ```sh
 * $ pulumi import harness:platform/kubernetesConnector:KubernetesConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level kubernetes connector
 * 
 * ```sh
 * $ pulumi import harness:platform/kubernetesConnector:KubernetesConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/kubernetesConnector:KubernetesConnector")
public class KubernetesConnector extends com.pulumi.resources.CustomResource {
    /**
     * Client key and certificate config for the connector.
     * 
     */
    @Export(name="clientKeyCert", refs={KubernetesConnectorClientKeyCert.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesConnectorClientKeyCert> clientKeyCert;

    /**
     * @return Client key and certificate config for the connector.
     * 
     */
    public Output<Optional<KubernetesConnectorClientKeyCert>> clientKeyCert() {
        return Codegen.optional(this.clientKeyCert);
    }
    /**
     * Selectors to use for the delegate.
     * 
     */
    @Export(name="delegateSelectors", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Selectors to use for the delegate.
     * 
     */
    public Output<Optional<List<String>>> delegateSelectors() {
        return Codegen.optional(this.delegateSelectors);
    }
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enable this flag for force deletion of connector
     * 
     */
    @Export(name="forceDelete", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> forceDelete;

    /**
     * @return Enable this flag for force deletion of connector
     * 
     */
    public Output<Boolean> forceDelete() {
        return this.forceDelete;
    }
    /**
     * Unique identifier of the resource.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Credentials are inherited from the delegate.
     * 
     */
    @Export(name="inheritFromDelegate", refs={KubernetesConnectorInheritFromDelegate.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesConnectorInheritFromDelegate> inheritFromDelegate;

    /**
     * @return Credentials are inherited from the delegate.
     * 
     */
    public Output<Optional<KubernetesConnectorInheritFromDelegate>> inheritFromDelegate() {
        return Codegen.optional(this.inheritFromDelegate);
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * OpenID configuration for the connector.
     * 
     */
    @Export(name="openidConnect", refs={KubernetesConnectorOpenidConnect.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesConnectorOpenidConnect> openidConnect;

    /**
     * @return OpenID configuration for the connector.
     * 
     */
    public Output<Optional<KubernetesConnectorOpenidConnect>> openidConnect() {
        return Codegen.optional(this.openidConnect);
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
     * Service account for the connector.
     * 
     */
    @Export(name="serviceAccount", refs={KubernetesConnectorServiceAccount.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesConnectorServiceAccount> serviceAccount;

    /**
     * @return Service account for the connector.
     * 
     */
    public Output<Optional<KubernetesConnectorServiceAccount>> serviceAccount() {
        return Codegen.optional(this.serviceAccount);
    }
    /**
     * Tags to associate with the resource.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Username and password for the connector.
     * 
     */
    @Export(name="usernamePassword", refs={KubernetesConnectorUsernamePassword.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesConnectorUsernamePassword> usernamePassword;

    /**
     * @return Username and password for the connector.
     * 
     */
    public Output<Optional<KubernetesConnectorUsernamePassword>> usernamePassword() {
        return Codegen.optional(this.usernamePassword);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KubernetesConnector(java.lang.String name) {
        this(name, KubernetesConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KubernetesConnector(java.lang.String name, KubernetesConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KubernetesConnector(java.lang.String name, KubernetesConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/kubernetesConnector:KubernetesConnector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KubernetesConnector(java.lang.String name, Output<java.lang.String> id, @Nullable KubernetesConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/kubernetesConnector:KubernetesConnector", name, state, makeResourceOptions(options, id), false);
    }

    private static KubernetesConnectorArgs makeArgs(KubernetesConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KubernetesConnectorArgs.Empty : args;
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
    public static KubernetesConnector get(java.lang.String name, Output<java.lang.String> id, @Nullable KubernetesConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KubernetesConnector(name, id, state, options);
    }
}
