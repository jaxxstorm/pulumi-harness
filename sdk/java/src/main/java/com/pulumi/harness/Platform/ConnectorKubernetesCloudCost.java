// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ConnectorKubernetesCloudCostArgs;
import com.pulumi.harness.platform.inputs.ConnectorKubernetesCloudCostState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Kubernetes Cloud Cost connector.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.ConnectorKubernetesCloudCost;
 * import com.pulumi.harness.platform.ConnectorKubernetesCloudCostArgs;
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
 *         var example = new ConnectorKubernetesCloudCost(&#34;example&#34;, ConnectorKubernetesCloudCostArgs.builder()        
 *             .connectorRef(&#34;connector_ref&#34;)
 *             .description(&#34;example&#34;)
 *             .featuresEnableds(            
 *                 &#34;VISIBILITY&#34;,
 *                 &#34;OPTIMIZATION&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .tags(&#34;foo:bar&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import account level kubernetes cloud cost connector
 * 
 * ```sh
 *  $ pulumi import harness:platform/connectorKubernetesCloudCost:ConnectorKubernetesCloudCost example &lt;connector_id&gt;
 * ```
 * 
 *  Import org level kubernetes cloud cost connector
 * 
 * ```sh
 *  $ pulumi import harness:platform/connectorKubernetesCloudCost:ConnectorKubernetesCloudCost example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 *  Import project level kubernetes cloud cost connector
 * 
 * ```sh
 *  $ pulumi import harness:platform/connectorKubernetesCloudCost:ConnectorKubernetesCloudCost example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/connectorKubernetesCloudCost:ConnectorKubernetesCloudCost")
public class ConnectorKubernetesCloudCost extends com.pulumi.resources.CustomResource {
    /**
     * Reference of the Connector. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Export(name="connectorRef", refs={String.class}, tree="[0]")
    private Output<String> connectorRef;

    /**
     * @return Reference of the Connector. To reference a connector at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a connector at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> connectorRef() {
        return this.connectorRef;
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
     * Indicates which feature to enable among Billing, Optimization, and Visibility.
     * 
     */
    @Export(name="featuresEnableds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> featuresEnableds;

    /**
     * @return Indicates which feature to enable among Billing, Optimization, and Visibility.
     * 
     */
    public Output<List<String>> featuresEnableds() {
        return this.featuresEnableds;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectorKubernetesCloudCost(String name) {
        this(name, ConnectorKubernetesCloudCostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectorKubernetesCloudCost(String name, ConnectorKubernetesCloudCostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectorKubernetesCloudCost(String name, ConnectorKubernetesCloudCostArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/connectorKubernetesCloudCost:ConnectorKubernetesCloudCost", name, args == null ? ConnectorKubernetesCloudCostArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectorKubernetesCloudCost(String name, Output<String> id, @Nullable ConnectorKubernetesCloudCostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/connectorKubernetesCloudCost:ConnectorKubernetesCloudCost", name, state, makeResourceOptions(options, id));
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
    public static ConnectorKubernetesCloudCost get(String name, Output<String> id, @Nullable ConnectorKubernetesCloudCostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectorKubernetesCloudCost(name, id, state, options);
    }
}
