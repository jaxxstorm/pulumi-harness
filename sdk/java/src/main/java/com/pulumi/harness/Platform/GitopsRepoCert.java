// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.GitopsRepoCertArgs;
import com.pulumi.harness.platform.inputs.GitopsRepoCertState;
import com.pulumi.harness.platform.outputs.GitopsRepoCertRequest;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness Gitops Repositories Certificates.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.GitopsRepoCert;
 * import com.pulumi.harness.platform.GitopsRepoCertArgs;
 * import com.pulumi.harness.platform.inputs.GitopsRepoCertRequestArgs;
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
 *         var example = new GitopsRepoCert(&#34;example&#34;, GitopsRepoCertArgs.builder()        
 *             .accountId(&#34;account_id&#34;)
 *             .agentId(&#34;agent_id&#34;)
 *             .requests(GitopsRepoCertRequestArgs.builder()
 *                 .certificates(GitopsRepoCertRequestCertificateArgs.builder()
 *                     .items(GitopsRepoCertRequestCertificateItemArgs.builder()
 *                         .certData(&#34;yourcertdata&#34;)
 *                         .certType(&#34;https&#34;)
 *                         .serverName(&#34;serverName&#34;)
 *                         .build())
 *                     .metadata()
 *                     .build())
 *                 .upsert(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import a Account level Gitops Repository Certificate
 * 
 * ```sh
 *  $ pulumi import harness:platform/gitopsRepoCert:GitopsRepoCert example &lt;repocert_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/gitopsRepoCert:GitopsRepoCert")
public class GitopsRepoCert extends com.pulumi.resources.CustomResource {
    /**
     * account identifier of the Repository Certificates.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return account identifier of the Repository Certificates.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * agent identifier of the Repository Certificates.
     * 
     */
    @Export(name="agentId", refs={String.class}, tree="[0]")
    private Output<String> agentId;

    /**
     * @return agent identifier of the Repository Certificates.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * organization identifier of the Repository Certificates.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return organization identifier of the Repository Certificates.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * project identifier of the Repository Certificates.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return project identifier of the Repository Certificates.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Repository Certificates create/Update request.
     * 
     */
    @Export(name="requests", refs={List.class,GitopsRepoCertRequest.class}, tree="[0,1]")
    private Output<List<GitopsRepoCertRequest>> requests;

    /**
     * @return Repository Certificates create/Update request.
     * 
     */
    public Output<List<GitopsRepoCertRequest>> requests() {
        return this.requests;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitopsRepoCert(String name) {
        this(name, GitopsRepoCertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitopsRepoCert(String name, GitopsRepoCertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitopsRepoCert(String name, GitopsRepoCertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitopsRepoCert:GitopsRepoCert", name, args == null ? GitopsRepoCertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GitopsRepoCert(String name, Output<String> id, @Nullable GitopsRepoCertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitopsRepoCert:GitopsRepoCert", name, state, makeResourceOptions(options, id));
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
    public static GitopsRepoCert get(String name, Output<String> id, @Nullable GitopsRepoCertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitopsRepoCert(name, id, state, options);
    }
}
