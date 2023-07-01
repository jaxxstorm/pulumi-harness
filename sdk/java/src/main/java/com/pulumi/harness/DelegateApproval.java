// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.DelegateApprovalArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.DelegateApprovalState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for approving or rejecting delegates.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.HarnessFunctions;
 * import com.pulumi.harness.inputs.GetDelegateArgs;
 * import com.pulumi.harness.DelegateApproval;
 * import com.pulumi.harness.DelegateApprovalArgs;
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
 *         final var testDelegate = HarnessFunctions.getDelegate(GetDelegateArgs.builder()
 *             .name(&#34;my-delegate&#34;)
 *             .build());
 * 
 *         var testDelegateApproval = new DelegateApproval(&#34;testDelegateApproval&#34;, DelegateApprovalArgs.builder()        
 *             .delegateId(testDelegate.applyValue(getDelegateResult -&gt; getDelegateResult.id()))
 *             .approve(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import the status of the delegate approval.
 * 
 * ```sh
 *  $ pulumi import harness:index/delegateApproval:DelegateApproval example &lt;delegate_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:index/delegateApproval:DelegateApproval")
public class DelegateApproval extends com.pulumi.resources.CustomResource {
    /**
     * Whether or not to approve the delegate.
     * 
     */
    @Export(name="approve", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> approve;

    /**
     * @return Whether or not to approve the delegate.
     * 
     */
    public Output<Boolean> approve() {
        return this.approve;
    }
    /**
     * The id of the delegate.
     * 
     */
    @Export(name="delegateId", refs={String.class}, tree="[0]")
    private Output<String> delegateId;

    /**
     * @return The id of the delegate.
     * 
     */
    public Output<String> delegateId() {
        return this.delegateId;
    }
    /**
     * The status of the delegate.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the delegate.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DelegateApproval(String name) {
        this(name, DelegateApprovalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DelegateApproval(String name, DelegateApprovalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DelegateApproval(String name, DelegateApprovalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/delegateApproval:DelegateApproval", name, args == null ? DelegateApprovalArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DelegateApproval(String name, Output<String> id, @Nullable DelegateApprovalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/delegateApproval:DelegateApproval", name, state, makeResourceOptions(options, id));
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
    public static DelegateApproval get(String name, Output<String> id, @Nullable DelegateApprovalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DelegateApproval(name, id, state, options);
    }
}
