// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.AzureCloudCostConnectorArgs;
import com.pulumi.harness.platform.inputs.AzureCloudCostConnectorState;
import com.pulumi.harness.platform.outputs.AzureCloudCostConnectorBillingExportSpec;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an Azure Cloud Cost connector in Harness.
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
 * import com.pulumi.harness.platform.AzureCloudCostConnector;
 * import com.pulumi.harness.platform.AzureCloudCostConnectorArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudCostConnectorBillingExportSpecArgs;
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
 *         var example = new AzureCloudCostConnector("example", AzureCloudCostConnectorArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("example")
 *             .tags("foo:bar")
 *             .featuresEnableds(            
 *                 "BILLING",
 *                 "VISIBILITY",
 *                 "OPTIMIZATION",
 *                 "GOVERNANCE")
 *             .tenantId("tenant_id")
 *             .subscriptionId("subscription_id")
 *             .billingExportSpec(AzureCloudCostConnectorBillingExportSpecArgs.builder()
 *                 .storageAccountName("storage_account_name")
 *                 .containerName("container_name")
 *                 .directoryName("directory_name")
 *                 .reportName("report_name")
 *                 .subscriptionId("subscription_id")
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
 * Import account level azure cloud cost connector
 * 
 * ```sh
 * $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example &lt;connector_id&gt;
 * ```
 * 
 * Import org level azure cloud cost connector
 * 
 * ```sh
 * $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level azure cloud cost connector
 * 
 * ```sh
 * $ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/azureCloudCostConnector:AzureCloudCostConnector")
public class AzureCloudCostConnector extends com.pulumi.resources.CustomResource {
    /**
     * Returns billing details for the Azure account.
     * 
     */
    @Export(name="billingExportSpec", refs={AzureCloudCostConnectorBillingExportSpec.class}, tree="[0]")
    private Output</* @Nullable */ AzureCloudCostConnectorBillingExportSpec> billingExportSpec;

    /**
     * @return Returns billing details for the Azure account.
     * 
     */
    public Output<Optional<AzureCloudCostConnectorBillingExportSpec>> billingExportSpec() {
        return Codegen.optional(this.billingExportSpec);
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
     * Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
     * 
     */
    @Export(name="featuresEnableds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> featuresEnableds;

    /**
     * @return Indicates which feature to enable among Billing, Optimization, Visibility and Governance.
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
     * Subsription id.
     * 
     */
    @Export(name="subscriptionId", refs={String.class}, tree="[0]")
    private Output<String> subscriptionId;

    /**
     * @return Subsription id.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
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
     * Tenant id.
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return Tenant id.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzureCloudCostConnector(java.lang.String name) {
        this(name, AzureCloudCostConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzureCloudCostConnector(java.lang.String name, AzureCloudCostConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureCloudCostConnector(java.lang.String name, AzureCloudCostConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/azureCloudCostConnector:AzureCloudCostConnector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AzureCloudCostConnector(java.lang.String name, Output<java.lang.String> id, @Nullable AzureCloudCostConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/azureCloudCostConnector:AzureCloudCostConnector", name, state, makeResourceOptions(options, id), false);
    }

    private static AzureCloudCostConnectorArgs makeArgs(AzureCloudCostConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AzureCloudCostConnectorArgs.Empty : args;
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
    public static AzureCloudCostConnector get(java.lang.String name, Output<java.lang.String> id, @Nullable AzureCloudCostConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AzureCloudCostConnector(name, id, state, options);
    }
}
