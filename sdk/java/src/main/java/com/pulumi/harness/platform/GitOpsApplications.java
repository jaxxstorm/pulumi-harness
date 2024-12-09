// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.GitOpsApplicationsArgs;
import com.pulumi.harness.platform.inputs.GitOpsApplicationsState;
import com.pulumi.harness.platform.outputs.GitOpsApplicationsApplication;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing a Harness Gitops Application.
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
 * import com.pulumi.harness.platform.GitOpsApplications;
 * import com.pulumi.harness.platform.GitOpsApplicationsArgs;
 * import com.pulumi.harness.platform.inputs.GitOpsApplicationsApplicationArgs;
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
 *         var example = new GitOpsApplications("example", GitOpsApplicationsArgs.builder()
 *             .applications(GitOpsApplicationsApplicationArgs.builder()
 *                 .metadatas(GitOpsApplicationsApplicationMetadataArgs.builder()
 *                     .annotations()
 *                     .labels(Map.ofEntries(
 *                         Map.entry("harness.io/serviceRef", "service_id"),
 *                         Map.entry("harness.io/envRef", "env_id")
 *                     ))
 *                     .name("appname123")
 *                     .build())
 *                 .specs(GitOpsApplicationsApplicationSpecArgs.builder()
 *                     .syncPolicies(GitOpsApplicationsApplicationSpecSyncPolicyArgs.builder()
 *                         .syncOptions(                        
 *                             "PrunePropagationPolicy=undefined",
 *                             "CreateNamespace=false",
 *                             "Validate=false",
 *                             "skipSchemaValidations=false",
 *                             "autoCreateNamespace=false",
 *                             "pruneLast=false",
 *                             "applyOutofSyncOnly=false",
 *                             "Replace=false",
 *                             "retry=false")
 *                         .build())
 *                     .sources(GitOpsApplicationsApplicationSpecSourceArgs.builder()
 *                         .targetRevision("master")
 *                         .repoUrl("https://github.com/willycoll/argocd-example-apps.git")
 *                         .path("helm-guestbook")
 *                         .build())
 *                     .destinations(GitOpsApplicationsApplicationSpecDestinationArgs.builder()
 *                         .namespace("namespace-123")
 *                         .server("https://1.3.4.5")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .projectId("project_id")
 *             .orgId("org_id")
 *             .accountId("account_id")
 *             .identifier("identifier")
 *             .clusterId("cluster_id")
 *             .repoId("repo_id")
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
 * Import a Project level Gitops Application
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsApplications:GitOpsApplications example &lt;organization_id&gt;/&lt;project_id&gt;/&lt;agent_id&gt;/&lt;app_name&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/gitOpsApplications:GitOpsApplications")
public class GitOpsApplications extends com.pulumi.resources.CustomResource {
    /**
     * Account identifier of the GitOps application.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account identifier of the GitOps application.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Agent identifier of the GitOps application.
     * 
     */
    @Export(name="agentId", refs={String.class}, tree="[0]")
    private Output<String> agentId;

    /**
     * @return Agent identifier of the GitOps application.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Definition of the GitOps application resource.
     * 
     */
    @Export(name="applications", refs={List.class,GitOpsApplicationsApplication.class}, tree="[0,1]")
    private Output<List<GitOpsApplicationsApplication>> applications;

    /**
     * @return Definition of the GitOps application resource.
     * 
     */
    public Output<List<GitOpsApplicationsApplication>> applications() {
        return this.applications;
    }
    /**
     * Cluster identifier of the GitOps application.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return Cluster identifier of the GitOps application.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Identifier of the GitOps application.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> identifier;

    /**
     * @return Identifier of the GitOps application.
     * 
     */
    public Output<Optional<String>> identifier() {
        return Codegen.optional(this.identifier);
    }
    /**
     * Kind of the GitOps application.
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of the GitOps application.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Name of the GitOps application.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the GitOps application.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Options to remove existing finalizers to delete the GitOps application.
     * 
     */
    @Export(name="optionsRemoveExistingFinalizers", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> optionsRemoveExistingFinalizers;

    /**
     * @return Options to remove existing finalizers to delete the GitOps application.
     * 
     */
    public Output<Optional<Boolean>> optionsRemoveExistingFinalizers() {
        return Codegen.optional(this.optionsRemoveExistingFinalizers);
    }
    /**
     * Organization identifier of the GitOps application.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return Organization identifier of the GitOps application.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * The ArgoCD project name corresponding to this GitOps application. An empty string means that the GitOps application belongs to the default project created by Harness.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ArgoCD project name corresponding to this GitOps application. An empty string means that the GitOps application belongs to the default project created by Harness.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Project identifier of the GitOps application.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Project identifier of the GitOps application.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Repository identifier of the GitOps application. When using skipRepoValidation, this field is not required.
     * 
     */
    @Export(name="repoId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> repoId;

    /**
     * @return Repository identifier of the GitOps application. When using skipRepoValidation, this field is not required.
     * 
     */
    public Output<Optional<String>> repoId() {
        return Codegen.optional(this.repoId);
    }
    /**
     * List of repository identifiers of the GitOps for Multi-Source application. Not required if skipRepoValidation is set to true.
     * 
     */
    @Export(name="repoIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> repoIds;

    /**
     * @return List of repository identifiers of the GitOps for Multi-Source application. Not required if skipRepoValidation is set to true.
     * 
     */
    public Output<Optional<List<String>>> repoIds() {
        return Codegen.optional(this.repoIds);
    }
    /**
     * Request cascade to delete the GitOps application.
     * 
     */
    @Export(name="requestCascade", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> requestCascade;

    /**
     * @return Request cascade to delete the GitOps application.
     * 
     */
    public Output<Optional<Boolean>> requestCascade() {
        return Codegen.optional(this.requestCascade);
    }
    /**
     * Request propagation policy to delete the GitOps application.
     * 
     */
    @Export(name="requestPropagationPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> requestPropagationPolicy;

    /**
     * @return Request propagation policy to delete the GitOps application.
     * 
     */
    public Output<Optional<String>> requestPropagationPolicy() {
        return Codegen.optional(this.requestPropagationPolicy);
    }
    /**
     * Indicates if the GitOps application should skip validate repository definition exists.
     * 
     */
    @Export(name="skipRepoValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipRepoValidation;

    /**
     * @return Indicates if the GitOps application should skip validate repository definition exists.
     * 
     */
    public Output<Optional<Boolean>> skipRepoValidation() {
        return Codegen.optional(this.skipRepoValidation);
    }
    /**
     * Indicates if the GitOps application should be updated if existing and inserted if not.
     * 
     */
    @Export(name="upsert", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> upsert;

    /**
     * @return Indicates if the GitOps application should be updated if existing and inserted if not.
     * 
     */
    public Output<Optional<Boolean>> upsert() {
        return Codegen.optional(this.upsert);
    }
    /**
     * Indicates if the GitOps application yaml has to be validated.
     * 
     */
    @Export(name="validate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> validate;

    /**
     * @return Indicates if the GitOps application yaml has to be validated.
     * 
     */
    public Output<Optional<Boolean>> validate() {
        return Codegen.optional(this.validate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitOpsApplications(java.lang.String name) {
        this(name, GitOpsApplicationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitOpsApplications(java.lang.String name, GitOpsApplicationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitOpsApplications(java.lang.String name, GitOpsApplicationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsApplications:GitOpsApplications", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GitOpsApplications(java.lang.String name, Output<java.lang.String> id, @Nullable GitOpsApplicationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsApplications:GitOpsApplications", name, state, makeResourceOptions(options, id), false);
    }

    private static GitOpsApplicationsArgs makeArgs(GitOpsApplicationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GitOpsApplicationsArgs.Empty : args;
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
    public static GitOpsApplications get(java.lang.String name, Output<java.lang.String> id, @Nullable GitOpsApplicationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitOpsApplications(name, id, state, options);
    }
}
