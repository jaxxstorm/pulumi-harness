// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ServiceAccountArgs;
import com.pulumi.harness.platform.inputs.ServiceAccountState;
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
 * import com.pulumi.harness.platform.ServiceAccount;
 * import com.pulumi.harness.platform.ServiceAccountArgs;
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
 *         var example = new ServiceAccount("example", ServiceAccountArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .email("email{@literal @}service.harness.io")
 *             .description("test")
 *             .tags("foo:bar")
 *             .accountId("account_id")
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
 * Import account level service account
 * 
 * ```sh
 * $ pulumi import harness:platform/serviceAccount:ServiceAccount example &lt;service_account_id&gt;
 * ```
 * 
 * Import org level service account
 * 
 * ```sh
 * $ pulumi import harness:platform/serviceAccount:ServiceAccount example &lt;ord_id&gt;/&lt;service_account_id&gt;
 * ```
 * 
 * Import project level service account
 * 
 * ```sh
 * $ pulumi import harness:platform/serviceAccount:ServiceAccount example &lt;org_id&gt;/&lt;project_id&gt;/&lt;service_account_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/serviceAccount:ServiceAccount")
public class ServiceAccount extends com.pulumi.resources.CustomResource {
    /**
     * Account Identifier for the Entity.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Identifier for the Entity.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
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
     * Email of the Service Account.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return Email of the Service Account.
     * 
     */
    public Output<String> email() {
        return this.email;
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
    public ServiceAccount(String name) {
        this(name, ServiceAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAccount(String name, ServiceAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAccount(String name, ServiceAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/serviceAccount:ServiceAccount", name, args == null ? ServiceAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceAccount(String name, Output<String> id, @Nullable ServiceAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/serviceAccount:ServiceAccount", name, state, makeResourceOptions(options, id));
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
    public static ServiceAccount get(String name, Output<String> id, @Nullable ServiceAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAccount(name, id, state, options);
    }
}
