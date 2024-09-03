// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.EnvironmentServiceOverridesArgs;
import com.pulumi.harness.platform.inputs.EnvironmentServiceOverridesState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness environment service overrides.
 * 
 * ## Example to create Environment Service Override at different levels (Org, Project, Account)
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
 * import com.pulumi.harness.platform.EnvironmentServiceOverrides;
 * import com.pulumi.harness.platform.EnvironmentServiceOverridesArgs;
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
 *         var example = new EnvironmentServiceOverrides("example", EnvironmentServiceOverridesArgs.builder()
 *             .envId("environmentIdentifier")
 *             .serviceId("serviceIdentifier")
 *             .yaml("""
 * serviceOverrides:
 *   environmentRef: environmentIdentifier
 *   serviceRef: serviceIdentifier
 *   variables:
 *    - name: asda
 *      type: String
 *      value: asddad
 *   manifests:
 *      - manifest:
 *          identifier: manifestEnv
 *          type: Values
 *          spec:
 *            store:
 *              type: Git
 *              spec:
 *                connectorRef: <+input>
 *                gitFetchType: Branch
 *                paths:
 *                  - file1
 *                repoName: <+input>
 *                branch: master
 *   configFiles:
 *      - configFile:
 *          identifier: configFileEnv
 *          spec:
 *            store:
 *              type: Harness
 *              spec:
 *                files:
 *                  - account:/Add-ons/svcOverrideTest
 *                secretFiles: []
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
 * import com.pulumi.harness.platform.EnvironmentServiceOverrides;
 * import com.pulumi.harness.platform.EnvironmentServiceOverridesArgs;
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
 *         var example = new EnvironmentServiceOverrides("example", EnvironmentServiceOverridesArgs.builder()
 *             .orgId("orgIdentifier")
 *             .envId("environmentIdentifier")
 *             .serviceId("serviceIdentifier")
 *             .yaml("""
 * serviceOverrides:
 *   environmentRef: environmentIdentifier
 *   serviceRef: serviceIdentifier
 *   variables:
 *    - name: asda
 *      type: String
 *      value: asddad
 *   manifests:
 *      - manifest:
 *          identifier: manifestEnv
 *          type: Values
 *          spec:
 *            store:
 *              type: Git
 *              spec:
 *                connectorRef: <+input>
 *                gitFetchType: Branch
 *                paths:
 *                  - file1
 *                repoName: <+input>
 *                branch: master
 *   configFiles:
 *      - configFile:
 *          identifier: configFileEnv
 *          spec:
 *            store:
 *              type: Harness
 *              spec:
 *                files:
 *                  - account:/Add-ons/svcOverrideTest
 *                secretFiles: []
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
 * import com.pulumi.harness.platform.EnvironmentServiceOverrides;
 * import com.pulumi.harness.platform.EnvironmentServiceOverridesArgs;
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
 *         var example = new EnvironmentServiceOverrides("example", EnvironmentServiceOverridesArgs.builder()
 *             .orgId("orgIdentifier")
 *             .projectId("projectIdentifier")
 *             .envId("environmentIdentifier")
 *             .serviceId("serviceIdentifier")
 *             .yaml("""
 * serviceOverrides:
 *   environmentRef: environmentIdentifier
 *   serviceRef: serviceIdentifier
 *   variables:
 *    - name: asda
 *      type: String
 *      value: asddad
 *   manifests:
 *      - manifest:
 *          identifier: manifestEnv
 *          type: Values
 *          spec:
 *            store:
 *              type: Git
 *              spec:
 *                connectorRef: <+input>
 *                gitFetchType: Branch
 *                paths:
 *                  - file1
 *                repoName: <+input>
 *                branch: master
 *   configFiles:
 *      - configFile:
 *          identifier: configFileEnv
 *          spec:
 *            store:
 *              type: Harness
 *              spec:
 *                files:
 *                  - account:/Add-ons/svcOverrideTest
 *                secretFiles: []
 *             """)
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
 * Import list of account level service overrides using the env id associated with them
 * 
 * ```sh
 * $ pulumi import harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides example &lt;env_id&gt;
 * ```
 * 
 * Import list of org level service overrides using the env id associated with them
 * 
 * ```sh
 * $ pulumi import harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides example &lt;org_id&gt;/&lt;env_id&gt;
 * ```
 * 
 * Import list of project level service overrides using the env id associated with them
 * 
 * ```sh
 * $ pulumi import harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides example &lt;org_id&gt;/&lt;project_id&gt;/&lt;env_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides")
public class EnvironmentServiceOverrides extends com.pulumi.resources.CustomResource {
    /**
     * The env Id associated with the overrides. To reference an environment at the organization scope, prefix &#39;org&#39; to the expression: org.{env*id}. To reference an environment at the account scope, prefix &#39;account&#39; to the expression: account.{env*id}).
     * 
     */
    @Export(name="envId", refs={String.class}, tree="[0]")
    private Output<String> envId;

    /**
     * @return The env Id associated with the overrides. To reference an environment at the organization scope, prefix &#39;org&#39; to the expression: org.{env*id}. To reference an environment at the account scope, prefix &#39;account&#39; to the expression: account.{env*id}).
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }
    /**
     * identifier of the service overrides.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return identifier of the service overrides.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
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
     * The service Id associated with the overrides. To reference a service at the organization scope, prefix &#39;org&#39; to the expression: org.{service*id}. To reference a service at the account scope, prefix &#39;account&#39; to the expression: account.{service*id}).
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The service Id associated with the overrides. To reference a service at the organization scope, prefix &#39;org&#39; to the expression: org.{service*id}. To reference a service at the account scope, prefix &#39;account&#39; to the expression: account.{service*id}).
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    @Export(name="yaml", refs={String.class}, tree="[0]")
    private Output<String> yaml;

    /**
     * @return Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvironmentServiceOverrides(java.lang.String name) {
        this(name, EnvironmentServiceOverridesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvironmentServiceOverrides(java.lang.String name, EnvironmentServiceOverridesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvironmentServiceOverrides(java.lang.String name, EnvironmentServiceOverridesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EnvironmentServiceOverrides(java.lang.String name, Output<java.lang.String> id, @Nullable EnvironmentServiceOverridesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides", name, state, makeResourceOptions(options, id), false);
    }

    private static EnvironmentServiceOverridesArgs makeArgs(EnvironmentServiceOverridesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EnvironmentServiceOverridesArgs.Empty : args;
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
    public static EnvironmentServiceOverrides get(java.lang.String name, Output<java.lang.String> id, @Nullable EnvironmentServiceOverridesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnvironmentServiceOverrides(name, id, state, options);
    }
}
