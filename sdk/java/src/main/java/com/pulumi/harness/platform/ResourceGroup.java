// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ResourceGroupArgs;
import com.pulumi.harness.platform.inputs.ResourceGroupState;
import com.pulumi.harness.platform.outputs.ResourceGroupIncludedScope;
import com.pulumi.harness.platform.outputs.ResourceGroupResourceFilter;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.harness.platform.ResourceGroup;
 * import com.pulumi.harness.platform.ResourceGroupArgs;
 * import com.pulumi.harness.platform.inputs.ResourceGroupIncludedScopeArgs;
 * import com.pulumi.harness.platform.inputs.ResourceGroupResourceFilterArgs;
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
 *         var test = new ResourceGroup("test", ResourceGroupArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("test")
 *             .tags("foo:bar")
 *             .accountId("account_id")
 *             .allowedScopeLevels("account")
 *             .includedScopes(ResourceGroupIncludedScopeArgs.builder()
 *                 .filter("EXCLUDING_CHILD_SCOPES")
 *                 .accountId("account_id")
 *                 .build())
 *             .resourceFilters(ResourceGroupResourceFilterArgs.builder()
 *                 .includeAllResources(false)
 *                 .resources(ResourceGroupResourceFilterResourceArgs.builder()
 *                     .resourceType("CONNECTOR")
 *                     .attributeFilters(ResourceGroupResourceFilterResourceAttributeFilterArgs.builder()
 *                         .attributeName("category")
 *                         .attributeValues("CLOUD_COST")
 *                         .build())
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
 * Import account level resource group
 * 
 * ```sh
 * $ pulumi import harness:platform/resourceGroup:ResourceGroup example &lt;resource_group_id&gt;
 * ```
 * 
 * Import org level resource group
 * 
 * ```sh
 * $ pulumi import harness:platform/resourceGroup:ResourceGroup example &lt;ord_id&gt;/&lt;resource_group_id&gt;
 * ```
 * 
 * Import project level resource group
 * 
 * ```sh
 * $ pulumi import harness:platform/resourceGroup:ResourceGroup example &lt;org_id&gt;/&lt;project_id&gt;/&lt;resource_group_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/resourceGroup:ResourceGroup")
public class ResourceGroup extends com.pulumi.resources.CustomResource {
    /**
     * Account Identifier of the account
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Identifier of the account
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The scope levels at which this resource group can be used
     * 
     */
    @Export(name="allowedScopeLevels", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> allowedScopeLevels;

    /**
     * @return The scope levels at which this resource group can be used
     * 
     */
    public Output<List<String>> allowedScopeLevels() {
        return this.allowedScopeLevels;
    }
    /**
     * Color of the environment.
     * 
     */
    @Export(name="color", refs={String.class}, tree="[0]")
    private Output<String> color;

    /**
     * @return Color of the environment.
     * 
     */
    public Output<String> color() {
        return this.color;
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
     * Included scopes. The default is selected based on the resource group scope if not specified. (Go to nested schema below.)
     * 
     */
    @Export(name="includedScopes", refs={List.class,ResourceGroupIncludedScope.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ResourceGroupIncludedScope>> includedScopes;

    /**
     * @return Included scopes. The default is selected based on the resource group scope if not specified. (Go to nested schema below.)
     * 
     */
    public Output<Optional<List<ResourceGroupIncludedScope>>> includedScopes() {
        return Codegen.optional(this.includedScopes);
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
     * Contains resource filter for a resource group
     * 
     */
    @Export(name="resourceFilters", refs={List.class,ResourceGroupResourceFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ResourceGroupResourceFilter>> resourceFilters;

    /**
     * @return Contains resource filter for a resource group
     * 
     */
    public Output<Optional<List<ResourceGroupResourceFilter>>> resourceFilters() {
        return Codegen.optional(this.resourceFilters);
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
    public ResourceGroup(String name) {
        this(name, ResourceGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceGroup(String name, ResourceGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceGroup(String name, ResourceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/resourceGroup:ResourceGroup", name, args == null ? ResourceGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceGroup(String name, Output<String> id, @Nullable ResourceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/resourceGroup:ResourceGroup", name, state, makeResourceOptions(options, id));
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
    public static ResourceGroup get(String name, Output<String> id, @Nullable ResourceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceGroup(name, id, state, options);
    }
}
