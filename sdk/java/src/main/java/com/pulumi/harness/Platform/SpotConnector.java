// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.SpotConnectorArgs;
import com.pulumi.harness.platform.inputs.SpotConnectorState;
import com.pulumi.harness.platform.outputs.SpotConnectorPermanentToken;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Spot connector.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.SpotConnector;
 * import com.pulumi.harness.platform.SpotConnectorArgs;
 * import com.pulumi.harness.platform.inputs.SpotConnectorPermanentTokenArgs;
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
 *         var spot = new SpotConnector(&#34;spot&#34;, SpotConnectorArgs.builder()        
 *             .description(&#34;description of spot connector&#34;)
 *             .identifier(&#34;example_spot_cloud_provider&#34;)
 *             .permanentToken(SpotConnectorPermanentTokenArgs.builder()
 *                 .apiTokenRef(&#34;account.TEST_spot_api_token&#34;)
 *                 .delegateSelectors(&#34;harness-delegate&#34;)
 *                 .executeOnDelegate(false)
 *                 .spotAccountId(&#34;&lt;my-account-id&gt;&#34;)
 *                 .build())
 *             .tags(&#34;foo:bar&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using spot cloud provider connector id
 * 
 * ```sh
 *  $ pulumi import harness:platform/spotConnector:SpotConnector example &lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/spotConnector:SpotConnector")
public class SpotConnector extends com.pulumi.resources.CustomResource {
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
     * Authenticate to Spot using account id and permanent token.
     * 
     */
    @Export(name="permanentToken", refs={SpotConnectorPermanentToken.class}, tree="[0]")
    private Output<SpotConnectorPermanentToken> permanentToken;

    /**
     * @return Authenticate to Spot using account id and permanent token.
     * 
     */
    public Output<SpotConnectorPermanentToken> permanentToken() {
        return this.permanentToken;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpotConnector(String name) {
        this(name, SpotConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpotConnector(String name, SpotConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpotConnector(String name, SpotConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/spotConnector:SpotConnector", name, args == null ? SpotConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpotConnector(String name, Output<String> id, @Nullable SpotConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/spotConnector:SpotConnector", name, state, makeResourceOptions(options, id));
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
    public static SpotConnector get(String name, Output<String> id, @Nullable SpotConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpotConnector(name, id, state, options);
    }
}
