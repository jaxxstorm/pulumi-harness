// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.service;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.service.CodedeployArgs;
import com.pulumi.harness.service.inputs.CodedeployState;
import com.pulumi.harness.service.outputs.CodedeployVariable;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an AWS CodeDeploy service. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
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
 * import com.pulumi.harness.Application;
 * import com.pulumi.harness.ApplicationArgs;
 * import com.pulumi.harness.service.Codedeploy;
 * import com.pulumi.harness.service.CodedeployArgs;
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
 *         var example = new Application("example", ApplicationArgs.builder()
 *             .name("example")
 *             .build());
 * 
 *         var exampleCodedeploy = new Codedeploy("exampleCodedeploy", CodedeployArgs.builder()
 *             .appId(example.id())
 *             .name("aws-codedeploy")
 *             .description("Service for AWS codedeploy applications.")
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
 * Import using the Harness application id and service id
 * 
 * ```sh
 * $ pulumi import harness:service/codedeploy:Codedeploy example &lt;app_id&gt;/&lt;svc_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:service/codedeploy:Codedeploy")
public class Codedeploy extends com.pulumi.resources.CustomResource {
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
    @Export(name="variables", refs={List.class,CodedeployVariable.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CodedeployVariable>> variables;

    /**
     * @return Variables to be used in the service
     * 
     */
    public Output<Optional<List<CodedeployVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Codedeploy(java.lang.String name) {
        this(name, CodedeployArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Codedeploy(java.lang.String name, CodedeployArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Codedeploy(java.lang.String name, CodedeployArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:service/codedeploy:Codedeploy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Codedeploy(java.lang.String name, Output<java.lang.String> id, @Nullable CodedeployState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:service/codedeploy:Codedeploy", name, state, makeResourceOptions(options, id), false);
    }

    private static CodedeployArgs makeArgs(CodedeployArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CodedeployArgs.Empty : args;
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
    public static Codedeploy get(java.lang.String name, Output<java.lang.String> id, @Nullable CodedeployState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Codedeploy(name, id, state, options);
    }
}
