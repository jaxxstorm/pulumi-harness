// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.EnvironmentGroupArgs;
import com.pulumi.harness.platform.inputs.EnvironmentGroupState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness environment group.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.EnvironmentGroup;
 * import com.pulumi.harness.platform.EnvironmentGroupArgs;
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
 *         var example = new EnvironmentGroup(&#34;example&#34;, EnvironmentGroupArgs.builder()        
 *             .color(&#34;#0063F7&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .orgId(&#34;orgIdentifer&#34;)
 *             .projectId(&#34;projectIdentifier&#34;)
 *             .yaml(&#34;&#34;&#34;
 *   environmentGroup:
 *     name: &#34;name&#34;
 *     identifier: &#34;identifier&#34;
 *     description: &#34;temp&#34;
 *     orgIdentifier: &#34;orgIdentifer&#34;
 *     projectIdentifier: &#34;projectIdentifier&#34;
 *     envIdentifiers: []
 * 
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using the environment group id.
 * 
 * ```sh
 *  $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example &lt;org_id&gt;/&lt;project_id&gt;/&lt;environment_group_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/environmentGroup:EnvironmentGroup")
public class EnvironmentGroup extends com.pulumi.resources.CustomResource {
    /**
     * Color of the environment group.
     * 
     */
    @Export(name="color", refs={String.class}, tree="[0]")
    private Output<String> color;

    /**
     * @return Color of the environment group.
     * 
     */
    public Output<String> color() {
        return this.color;
    }
    /**
     * Enable this flag for force deletion of environment group
     * 
     */
    @Export(name="forceDelete", refs={String.class}, tree="[0]")
    private Output<String> forceDelete;

    /**
     * @return Enable this flag for force deletion of environment group
     * 
     */
    public Output<String> forceDelete() {
        return this.forceDelete;
    }
    /**
     * identifier of the environment group.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return identifier of the environment group.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * org_id of the environment group.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return org_id of the environment group.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * project_id of the environment group.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return project_id of the environment group.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Env group YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    @Export(name="yaml", refs={String.class}, tree="[0]")
    private Output<String> yaml;

    /**
     * @return Env group YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvironmentGroup(String name) {
        this(name, EnvironmentGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvironmentGroup(String name, EnvironmentGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvironmentGroup(String name, EnvironmentGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/environmentGroup:EnvironmentGroup", name, args == null ? EnvironmentGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnvironmentGroup(String name, Output<String> id, @Nullable EnvironmentGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/environmentGroup:EnvironmentGroup", name, state, makeResourceOptions(options, id));
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
    public static EnvironmentGroup get(String name, Output<String> id, @Nullable EnvironmentGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnvironmentGroup(name, id, state, options);
    }
}
