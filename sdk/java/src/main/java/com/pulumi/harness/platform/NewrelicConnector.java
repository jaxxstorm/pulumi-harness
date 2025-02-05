// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.NewrelicConnectorArgs;
import com.pulumi.harness.platform.inputs.NewrelicConnectorState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a New Relic connector.
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
 * import com.pulumi.harness.platform.NewrelicConnector;
 * import com.pulumi.harness.platform.NewrelicConnectorArgs;
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
 *         var test = new NewrelicConnector("test", NewrelicConnectorArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("test")
 *             .tags("foo:bar")
 *             .url("https://newrelic.com/")
 *             .delegateSelectors("harness-delegate")
 *             .accountId("nr_account_id")
 *             .apiKeyRef("account.secret_id")
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
 * Import account level newrelic connector
 * 
 * ```sh
 * $ pulumi import harness:platform/newrelicConnector:NewrelicConnector example &lt;connector_id&gt;
 * ```
 * 
 * Import org level newrelic connector
 * 
 * ```sh
 * $ pulumi import harness:platform/newrelicConnector:NewrelicConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level newrelic connector
 * 
 * ```sh
 * $ pulumi import harness:platform/newrelicConnector:NewrelicConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/newrelicConnector:NewrelicConnector")
public class NewrelicConnector extends com.pulumi.resources.CustomResource {
    /**
     * Account ID of the NewRelic account.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account ID of the NewRelic account.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Export(name="apiKeyRef", refs={String.class}, tree="[0]")
    private Output<String> apiKeyRef;

    /**
     * @return Reference to the Harness secret containing the api key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> apiKeyRef() {
        return this.apiKeyRef;
    }
    /**
     * Tags to filter delegates for connection.
     * 
     */
    @Export(name="delegateSelectors", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Tags to filter delegates for connection.
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
     * URL of the NewRelic server.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return URL of the NewRelic server.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NewrelicConnector(java.lang.String name) {
        this(name, NewrelicConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NewrelicConnector(java.lang.String name, NewrelicConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NewrelicConnector(java.lang.String name, NewrelicConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/newrelicConnector:NewrelicConnector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NewrelicConnector(java.lang.String name, Output<java.lang.String> id, @Nullable NewrelicConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/newrelicConnector:NewrelicConnector", name, state, makeResourceOptions(options, id), false);
    }

    private static NewrelicConnectorArgs makeArgs(NewrelicConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NewrelicConnectorArgs.Empty : args;
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
    public static NewrelicConnector get(java.lang.String name, Output<java.lang.String> id, @Nullable NewrelicConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NewrelicConnector(name, id, state, options);
    }
}
