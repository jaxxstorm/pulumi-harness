// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.TemplateFiltersArgs;
import com.pulumi.harness.platform.inputs.TemplateFiltersState;
import com.pulumi.harness.platform.outputs.TemplateFiltersFilterProperties;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness Template Filters.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.TemplateFilters;
 * import com.pulumi.harness.platform.TemplateFiltersArgs;
 * import com.pulumi.harness.platform.inputs.TemplateFiltersFilterPropertiesArgs;
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
 *         var test = new TemplateFilters(&#34;test&#34;, TemplateFiltersArgs.builder()        
 *             .filterProperties(TemplateFiltersFilterPropertiesArgs.builder()
 *                 .filterType(&#34;Template&#34;)
 *                 .tags(&#34;foo:bar&#34;)
 *                 .build())
 *             .filterVisibility(&#34;EveryOne&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .orgId(&#34;org_id&#34;)
 *             .projectId(&#34;project_id&#34;)
 *             .type(&#34;Template&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import account level template filter
 * 
 * ```sh
 *  $ pulumi import harness:platform/templateFilters:TemplateFilters example &lt;filter_id&gt;/&lt;type&gt;
 * ```
 * 
 *  Import org level template filter
 * 
 * ```sh
 *  $ pulumi import harness:platform/templateFilters:TemplateFilters example &lt;org_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
 * ```
 * 
 *  Import project level template filter
 * 
 * ```sh
 *  $ pulumi import harness:platform/templateFilters:TemplateFilters example &lt;org_id&gt;/&lt;project_id&gt;/&lt;filter_id&gt;/&lt;type&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/templateFilters:TemplateFilters")
public class TemplateFilters extends com.pulumi.resources.CustomResource {
    /**
     * Properties of the filters entity defined in Harness.
     * 
     */
    @Export(name="filterProperties", refs={TemplateFiltersFilterProperties.class}, tree="[0]")
    private Output<TemplateFiltersFilterProperties> filterProperties;

    /**
     * @return Properties of the filters entity defined in Harness.
     * 
     */
    public Output<TemplateFiltersFilterProperties> filterProperties() {
        return this.filterProperties;
    }
    /**
     * This indicates visibility of filters. By default, everyone can view this filter.
     * 
     */
    @Export(name="filterVisibility", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filterVisibility;

    /**
     * @return This indicates visibility of filters. By default, everyone can view this filter.
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
     * Name of the template filters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the template filters.
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
     * Type of template filters. Currently supported types are { Template}
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of template filters. Currently supported types are { Template}
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TemplateFilters(String name) {
        this(name, TemplateFiltersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TemplateFilters(String name, TemplateFiltersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TemplateFilters(String name, TemplateFiltersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/templateFilters:TemplateFilters", name, args == null ? TemplateFiltersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TemplateFilters(String name, Output<String> id, @Nullable TemplateFiltersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/templateFilters:TemplateFilters", name, state, makeResourceOptions(options, id));
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
    public static TemplateFilters get(String name, Output<String> id, @Nullable TemplateFiltersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TemplateFilters(name, id, state, options);
    }
}
