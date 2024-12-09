// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.GitOpsRepoCertArgs;
import com.pulumi.harness.platform.inputs.GitOpsRepoCertState;
import com.pulumi.harness.platform.outputs.GitOpsRepoCertRequest;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing a Harness Gitops Repository Certificate. You can only create 1 instance per agent which has all the certificates of this resource.
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
 * import com.pulumi.harness.platform.GitOpsRepoCert;
 * import com.pulumi.harness.platform.GitOpsRepoCertArgs;
 * import com.pulumi.harness.platform.inputs.GitOpsRepoCertRequestArgs;
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
 *         var example = new GitOpsRepoCert("example", GitOpsRepoCertArgs.builder()
 *             .requests(GitOpsRepoCertRequestArgs.builder()
 *                 .certificates(GitOpsRepoCertRequestCertificateArgs.builder()
 *                     .metadatas()
 *                     .items(GitOpsRepoCertRequestCertificateItemArgs.builder()
 *                         .serverName("github.com")
 *                         .certType("ssh")
 *                         .certSubType("ecdsa-sha2-nistp256")
 *                         .certData("QUFBQUUyVmpaSE5oTFhOb1lUSXRibWx6ZEhBeU5UWUFBQUFJYm1semRIQXlOVFlBQUFCQkJFbUtTRU5qUUVlek9teGtaTXk3b3BLZ3dGQjlua3Q1WVJyWU1qTnVHNU44N3VSZ2c2Q0xyYm81d0FkVC95NnYwbUtWMFUydzBXWjJZQi8rK1Rwb2NrZz0=")
 *                         .build())
 *                     .build())
 *                 .upsert(true)
 *                 .build())
 *             .accountId("account_id")
 *             .agentId("agent_id")
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
 * Import an Account level Gitops Repository Certificate
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepoCert:GitOpsRepoCert example &lt;repocert_id&gt;
 * ```
 * 
 * Import an Org level Gitops Repository Certificate
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepoCert:GitOpsRepoCert example &lt;organization_id&gt;/&lt;repocert_id&gt;
 * ```
 * 
 * Import a Project level Gitops Repository Certificate
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsRepoCert:GitOpsRepoCert example &lt;organization_id&gt;/&lt;project_id&gt;/&lt;repocert_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/gitOpsRepoCert:GitOpsRepoCert")
public class GitOpsRepoCert extends com.pulumi.resources.CustomResource {
    /**
     * Account identifier of the GitOps repository certificate.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account identifier of the GitOps repository certificate.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Agent identifier of the GitOps repository certificate.
     * 
     */
    @Export(name="agentId", refs={String.class}, tree="[0]")
    private Output<String> agentId;

    /**
     * @return Agent identifier of the GitOps repository certificate.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Organization identifier of the GitOps repository certificate.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Organization identifier of the GitOps repository certificate.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Project identifier of the GitOps repository certificate.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Project identifier of the GitOps repository certificate.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Repository Certificate create/update request.
     * 
     */
    @Export(name="requests", refs={List.class,GitOpsRepoCertRequest.class}, tree="[0,1]")
    private Output<List<GitOpsRepoCertRequest>> requests;

    /**
     * @return Repository Certificate create/update request.
     * 
     */
    public Output<List<GitOpsRepoCertRequest>> requests() {
        return this.requests;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitOpsRepoCert(java.lang.String name) {
        this(name, GitOpsRepoCertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitOpsRepoCert(java.lang.String name, GitOpsRepoCertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitOpsRepoCert(java.lang.String name, GitOpsRepoCertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsRepoCert:GitOpsRepoCert", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GitOpsRepoCert(java.lang.String name, Output<java.lang.String> id, @Nullable GitOpsRepoCertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsRepoCert:GitOpsRepoCert", name, state, makeResourceOptions(options, id), false);
    }

    private static GitOpsRepoCertArgs makeArgs(GitOpsRepoCertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GitOpsRepoCertArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static GitOpsRepoCert get(java.lang.String name, Output<java.lang.String> id, @Nullable GitOpsRepoCertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitOpsRepoCert(name, id, state, options);
    }
}
