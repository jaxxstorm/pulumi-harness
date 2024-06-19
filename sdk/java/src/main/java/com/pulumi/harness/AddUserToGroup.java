// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.AddUserToGroupArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.AddUserToGroupState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for adding a user to a group.
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
 * import com.pulumi.harness.HarnessFunctions;
 * import com.pulumi.harness.inputs.GetUserArgs;
 * import com.pulumi.harness.UserGroup;
 * import com.pulumi.harness.UserGroupArgs;
 * import com.pulumi.harness.AddUserToGroup;
 * import com.pulumi.harness.AddUserToGroupArgs;
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
 *         final var exampleUser = HarnessFunctions.getUser(GetUserArgs.builder()
 *             .email("testuser{@literal @}example.com")
 *             .build());
 * 
 *         var admin = new UserGroup("admin", UserGroupArgs.builder()
 *             .name("admin")
 *             .build());
 * 
 *         var exampleAddUserToGroups = new AddUserToGroup("exampleAddUserToGroups", AddUserToGroupArgs.builder()
 *             .groupId(admin.id())
 *             .userId(test.id())
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
 * Import using the Harness user and user group id
 * 
 * ```sh
 * $ pulumi import harness:index/addUserToGroup:AddUserToGroup example_admin &lt;user_id&gt;/&lt;group_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:index/addUserToGroup:AddUserToGroup")
public class AddUserToGroup extends com.pulumi.resources.CustomResource {
    /**
     * The name of the user.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return The name of the user.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * Unique identifier of the user.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return Unique identifier of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AddUserToGroup(String name) {
        this(name, AddUserToGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AddUserToGroup(String name, AddUserToGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AddUserToGroup(String name, AddUserToGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/addUserToGroup:AddUserToGroup", name, args == null ? AddUserToGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AddUserToGroup(String name, Output<String> id, @Nullable AddUserToGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/addUserToGroup:AddUserToGroup", name, state, makeResourceOptions(options, id));
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
    public static AddUserToGroup get(String name, Output<String> id, @Nullable AddUserToGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AddUserToGroup(name, id, state, options);
    }
}
