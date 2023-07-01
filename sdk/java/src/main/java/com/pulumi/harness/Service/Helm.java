// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.service;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.service.HelmArgs;
import com.pulumi.harness.service.inputs.HelmState;
import com.pulumi.harness.service.outputs.HelmVariable;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Kubernetes Helm service. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.Application;
 * import com.pulumi.harness.service.Helm;
 * import com.pulumi.harness.service.HelmArgs;
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
 *         var exampleApplication = new Application(&#34;exampleApplication&#34;);
 * 
 *         var exampleHelm = new Helm(&#34;exampleHelm&#34;, HelmArgs.builder()        
 *             .appId(exampleApplication.id())
 *             .description(&#34;Service for deploying native Helm application.s&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using the Harness application id and service id
 * 
 * ```sh
 *  $ pulumi import harness:service/helm:Helm example &lt;app_id&gt;/&lt;svc_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:service/helm:Helm")
public class Helm extends com.pulumi.resources.CustomResource {
    /**
     * The id of the application the service belongs to
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The id of the application the service belongs to
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * Description of th service
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of th service
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the service
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the service
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Variables to be used in the service
     * 
     */
    @Export(name="variables", refs={List.class,HelmVariable.class}, tree="[0,1]")
    private Output</* @Nullable */ List<HelmVariable>> variables;

    /**
     * @return Variables to be used in the service
     * 
     */
    public Output<Optional<List<HelmVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Helm(String name) {
        this(name, HelmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Helm(String name, HelmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Helm(String name, HelmArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:service/helm:Helm", name, args == null ? HelmArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Helm(String name, Output<String> id, @Nullable HelmState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:service/helm:Helm", name, state, makeResourceOptions(options, id));
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
    public static Helm get(String name, Output<String> id, @Nullable HelmState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Helm(name, id, state, options);
    }
}
