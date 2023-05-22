// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.cloudprovider.DatacenterArgs;
import com.pulumi.harness.cloudprovider.inputs.DatacenterState;
import com.pulumi.harness.cloudprovider.outputs.DatacenterUsageScope;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a physical data center cloud provider. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.cloudprovider.Datacenter;
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
 *         var example = new Datacenter(&#34;example&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using the Harness datacenter cloud provider id.
 * 
 * ```sh
 *  $ pulumi import harness:cloudprovider/datacenter:Datacenter example &lt;provider_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:cloudprovider/datacenter:Datacenter")
public class Datacenter extends com.pulumi.resources.CustomResource {
    /**
     * The name of the cloud provider.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the cloud provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Export(name="usageScopes", refs={List.class,DatacenterUsageScope.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DatacenterUsageScope>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Output<Optional<List<DatacenterUsageScope>>> usageScopes() {
        return Codegen.optional(this.usageScopes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Datacenter(String name) {
        this(name, DatacenterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Datacenter(String name, @Nullable DatacenterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Datacenter(String name, @Nullable DatacenterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:cloudprovider/datacenter:Datacenter", name, args == null ? DatacenterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Datacenter(String name, Output<String> id, @Nullable DatacenterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:cloudprovider/datacenter:Datacenter", name, state, makeResourceOptions(options, id));
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
    public static Datacenter get(String name, Output<String> id, @Nullable DatacenterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Datacenter(name, id, state, options);
    }
}
