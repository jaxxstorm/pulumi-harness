// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ServiceArgs;
import com.pulumi.harness.platform.inputs.ServiceState;
import com.pulumi.harness.platform.outputs.ServiceGitDetails;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness service.
 * 
 * ## Example to create Service at different levels (Org, Project, Account)
 * 
 * ### Account Level
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Service;
 * import com.pulumi.harness.platform.ServiceArgs;
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
 *         var example = new Service("example", ServiceArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("test")
 *             .yaml("""
 * service:
 *   name: name
 *   identifier: identifier
 *   serviceDefinition:
 *     spec:
 *       manifests:
 *         - manifest:
 *             identifier: manifest1
 *             type: K8sManifest
 *             spec:
 *               store:
 *                 type: Github
 *                 spec:
 *                   connectorRef: <+input>
 *                   gitFetchType: Branch
 *                   paths:
 *                     - files1
 *                   repoName: <+input>
 *                   branch: master
 *               skipResourceVersioning: false
 *       configFiles:
 *         - configFile:
 *             identifier: configFile1
 *             spec:
 *               store:
 *                 type: Harness
 *                 spec:
 *                   files:
 *                     - <+org.description>
 *       variables:
 *         - name: var1
 *           type: String
 *           value: val1
 *         - name: var2
 *           type: String
 *           value: val2
 *     type: Kubernetes
 *   gitOpsEnabled: false
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Org Level
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Service;
 * import com.pulumi.harness.platform.ServiceArgs;
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
 *         var example = new Service("example", ServiceArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("test")
 *             .orgId("org_id")
 *             .yaml("""
 * service:
 *   name: name
 *   identifier: identifier
 *   serviceDefinition:
 *     spec:
 *       manifests:
 *         - manifest:
 *             identifier: manifest1
 *             type: K8sManifest
 *             spec:
 *               store:
 *                 type: Github
 *                 spec:
 *                   connectorRef: <+input>
 *                   gitFetchType: Branch
 *                   paths:
 *                     - files1
 *                   repoName: <+input>
 *                   branch: master
 *               skipResourceVersioning: false
 *       configFiles:
 *         - configFile:
 *             identifier: configFile1
 *             spec:
 *               store:
 *                 type: Harness
 *                 spec:
 *                   files:
 *                     - <+org.description>
 *       variables:
 *         - name: var1
 *           type: String
 *           value: val1
 *         - name: var2
 *           type: String
 *           value: val2
 *     type: Kubernetes
 *   gitOpsEnabled: false
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Project Level
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Service;
 * import com.pulumi.harness.platform.ServiceArgs;
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
 *         var example = new Service("example", ServiceArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("test")
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .yaml("""
 * service:
 *   name: name
 *   identifier: identifier
 *   serviceDefinition:
 *     spec:
 *       manifests:
 *         - manifest:
 *             identifier: manifest1
 *             type: K8sManifest
 *             spec:
 *               store:
 *                 type: Github
 *                 spec:
 *                   connectorRef: <+input>
 *                   gitFetchType: Branch
 *                   paths:
 *                     - files1
 *                   repoName: <+input>
 *                   branch: master
 *               skipResourceVersioning: false
 *       configFiles:
 *         - configFile:
 *             identifier: configFile1
 *             spec:
 *               store:
 *                 type: Harness
 *                 spec:
 *                   files:
 *                     - <+org.description>
 *       variables:
 *         - name: var1
 *           type: String
 *           value: val1
 *         - name: var2
 *           type: String
 *           value: val2
 *     type: Kubernetes
 *   gitOpsEnabled: false
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Creating Remote Service
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Service;
 * import com.pulumi.harness.platform.ServiceArgs;
 * import com.pulumi.harness.platform.inputs.ServiceGitDetailsArgs;
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
 *         var example = new Service("example", ServiceArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("test")
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .gitDetails(ServiceGitDetailsArgs.builder()
 *                 .storeType("REMOTE")
 *                 .connectorRef("connector_ref")
 *                 .repoName("repo_name")
 *                 .filePath("file_path")
 *                 .branch("branch")
 *                 .build())
 *             .yaml("""
 * service:
 *   name: name
 *   identifier: identifier
 *   serviceDefinition:
 *     spec:
 *       manifests:
 *         - manifest:
 *             identifier: manifest1
 *             type: K8sManifest
 *             spec:
 *               store:
 *                 type: Github
 *                 spec:
 *                   connectorRef: <+input>
 *                   gitFetchType: Branch
 *                   paths:
 *                     - files1
 *                   repoName: <+input>
 *                   branch: master
 *               skipResourceVersioning: false
 *       configFiles:
 *         - configFile:
 *             identifier: configFile1
 *             spec:
 *               store:
 *                 type: Harness
 *                 spec:
 *                   files:
 *                     - <+org.description>
 *       variables:
 *         - name: var1
 *           type: String
 *           value: val1
 *         - name: var2
 *           type: String
 *           value: val2
 *     type: Kubernetes
 *   gitOpsEnabled: false
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Importing Service From Git
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Service;
 * import com.pulumi.harness.platform.ServiceArgs;
 * import com.pulumi.harness.platform.inputs.ServiceGitDetailsArgs;
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
 *         var example = new Service("example", ServiceArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .importFromGit("true")
 *             .gitDetails(ServiceGitDetailsArgs.builder()
 *                 .storeType("REMOTE")
 *                 .connectorRef("connector_ref")
 *                 .repoName("repo_name")
 *                 .filePath("file_path")
 *                 .branch("branch")
 *                 .build())
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
 * Import account level service
 * 
 * ```sh
 * $ pulumi import harness:platform/service:Service example &lt;service_id&gt;
 * ```
 * 
 * Import org level service
 * 
 * ```sh
 * $ pulumi import harness:platform/service:Service example &lt;org_id&gt;/&lt;service_id&gt;
 * ```
 * 
 * Import project level service
 * 
 * ```sh
 * $ pulumi import harness:platform/service:Service example &lt;org_id&gt;/&lt;project_id&gt;/&lt;service_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/service:Service")
public class Service extends com.pulumi.resources.CustomResource {
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
     * to fetch resoled service yaml
     * 
     */
    @Export(name="fetchResolvedYaml", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> fetchResolvedYaml;

    /**
     * @return to fetch resoled service yaml
     * 
     */
    public Output<Boolean> fetchResolvedYaml() {
        return this.fetchResolvedYaml;
    }
    /**
     * Enable this flag for force deletion of service
     * 
     */
    @Export(name="forceDelete", refs={String.class}, tree="[0]")
    private Output<String> forceDelete;

    /**
     * @return Enable this flag for force deletion of service
     * 
     */
    public Output<String> forceDelete() {
        return this.forceDelete;
    }
    /**
     * Contains Git Information for remote entities from Git for Create/Update/Import
     * 
     */
    @Export(name="gitDetails", refs={ServiceGitDetails.class}, tree="[0]")
    private Output<ServiceGitDetails> gitDetails;

    /**
     * @return Contains Git Information for remote entities from Git for Create/Update/Import
     * 
     */
    public Output<ServiceGitDetails> gitDetails() {
        return this.gitDetails;
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
     * Flag to set if importing from Git
     * 
     */
    @Export(name="importFromGit", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> importFromGit;

    /**
     * @return Flag to set if importing from Git
     * 
     */
    public Output<Boolean> importFromGit() {
        return this.importFromGit;
    }
    /**
     * Flag to set if force importing from Git
     * 
     */
    @Export(name="isForceImport", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isForceImport;

    /**
     * @return Flag to set if force importing from Git
     * 
     */
    public Output<Boolean> isForceImport() {
        return this.isForceImport;
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
     * Service YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    @Export(name="yaml", refs={String.class}, tree="[0]")
    private Output<String> yaml;

    /**
     * @return Service YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(java.lang.String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(java.lang.String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(java.lang.String name, ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/service:Service", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Service(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/service:Service", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceArgs makeArgs(ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceArgs.Empty : args;
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
    public static Service get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}
