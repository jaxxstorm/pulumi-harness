// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.PlatformCcmFiltersArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.PlatformCcmFiltersState;
import com.pulumi.harness.outputs.PlatformCcmFiltersFilterProperties;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness CCM Filters.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.PlatformCcmFilters;
 * import com.pulumi.harness.PlatformCcmFiltersArgs;
 * import com.pulumi.harness.inputs.PlatformCcmFiltersFilterPropertiesArgs;
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
 *         var test = new PlatformCcmFilters(&#34;test&#34;, PlatformCcmFiltersArgs.builder()        
 *             .filterProperties(PlatformCcmFiltersFilterPropertiesArgs.builder()
 *                 .filterType(&#34;CCMRecommendation&#34;)
 *                 .tags(&#34;foo:bar&#34;)
 *                 .build())
 *             .filterVisibility(&#34;EveryOne&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .orgId(&#34;org_id&#34;)
 *             .projectId(&#34;project_id&#34;)
 *             .type(&#34;CCMRecommendation&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import account level ccm filter
 * 
 * ```sh
 *  $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example &lt;filter_id&gt;/&lt;type&gt;
 * ```
 * 
 *  Import org level ccm filter
 * 
 * ```sh
 *  $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example &lt;ord_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
 * ```
 * 
 *  Import project level ccm filter
 * 
 * ```sh
 *  $ pulumi import harness:index/platformCcmFilters:PlatformCcmFilters example &lt;org_id&gt;/&lt;project_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
 * ```
 * 
 */
@ResourceType(type="harness:index/platformCcmFilters:PlatformCcmFilters")
public class PlatformCcmFilters extends com.pulumi.resources.CustomResource {
    /**
     * Properties of the filters entity defined in Harness.
     * 
     */
    @Export(name="filterProperties", refs={PlatformCcmFiltersFilterProperties.class}, tree="[0]")
    private Output<PlatformCcmFiltersFilterProperties> filterProperties;

    /**
     * @return Properties of the filters entity defined in Harness.
     * 
     */
    public Output<PlatformCcmFiltersFilterProperties> filterProperties() {
        return this.filterProperties;
    }
    /**
     * This indicates visibility of filters. By default, everyone can view this filter..
     * 
     */
    @Export(name="filterVisibility", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filterVisibility;

    /**
     * @return This indicates visibility of filters. By default, everyone can view this filter..
     * 
     */
    public Output<Optional<String>> filterVisibility() {
        return Codegen.optional(this.filterVisibility);
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
     * Name of the ccm filters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the ccm filters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Organization Identifier for the Entity.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Organization Identifier for the Entity.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Project Identifier for the Entity.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Project Identifier for the Entity.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Type of ccm filters.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of ccm filters.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PlatformCcmFilters(String name) {
        this(name, PlatformCcmFiltersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlatformCcmFilters(String name, PlatformCcmFiltersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlatformCcmFilters(String name, PlatformCcmFiltersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/platformCcmFilters:PlatformCcmFilters", name, args == null ? PlatformCcmFiltersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PlatformCcmFilters(String name, Output<String> id, @Nullable PlatformCcmFiltersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/platformCcmFilters:PlatformCcmFilters", name, state, makeResourceOptions(options, id));
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
    public static PlatformCcmFilters get(String name, Output<String> id, @Nullable PlatformCcmFiltersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PlatformCcmFilters(name, id, state, options);
    }
}
