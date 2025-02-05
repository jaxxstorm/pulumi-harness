// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.GitopsAppProjectArgs;
import com.pulumi.harness.platform.inputs.GitopsAppProjectState;
import com.pulumi.harness.platform.outputs.GitopsAppProjectProject;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Import gitOps project with account level agent
 * 
 * ```sh
 * $ pulumi import harness:platform/gitopsAppProject:GitopsAppProject example &lt;agent_id&gt;/&lt;app_proj_name&gt;
 * ```
 * 
 * Import gitOps project with org level agent
 * 
 * ```sh
 * $ pulumi import harness:platform/gitopsAppProject:GitopsAppProject example &lt;organization_id&gt;/&lt;agent_id&gt;/&lt;app_proj_name&gt;
 * ```
 * 
 * Import gitOps project with project level agent
 * 
 * ```sh
 * $ pulumi import harness:platform/gitopsAppProject:GitopsAppProject example &lt;organization_id&gt;/&lt;project_id&gt;/&lt;agent_id&gt;/&lt;app_proj_name&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/gitopsAppProject:GitopsAppProject")
public class GitopsAppProject extends com.pulumi.resources.CustomResource {
    /**
     * Account identifier of the GitOps Agent where argo project will exist.
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future release.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future release. */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account identifier of the GitOps Agent where argo project will exist.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Agent identifier of the agent where argo project will exist (include scope prefix)
     * 
     */
    @Export(name="agentId", refs={String.class}, tree="[0]")
    private Output<String> agentId;

    /**
     * @return Agent identifier of the agent where argo project will exist (include scope prefix)
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Org identifier of the GitOps Agent where argo project is to be created.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Org identifier of the GitOps Agent where argo project is to be created.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Project identifier of the Gitops Agent where argo project is to be created.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Project identifier of the Gitops Agent where argo project is to be created.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * GitOps project configuration.
     * 
     */
    @Export(name="projects", refs={List.class,GitopsAppProjectProject.class}, tree="[0,1]")
    private Output<List<GitopsAppProjectProject>> projects;

    /**
     * @return GitOps project configuration.
     * 
     */
    public Output<List<GitopsAppProjectProject>> projects() {
        return this.projects;
    }
    /**
     * Identifier for the GitOps Argo project.
     * 
     */
    @Export(name="queryName", refs={String.class}, tree="[0]")
    private Output<String> queryName;

    /**
     * @return Identifier for the GitOps Argo project.
     * 
     */
    public Output<String> queryName() {
        return this.queryName;
    }
    /**
     * Indicates if the argo project should be updated if existing and inserted if not.
     * 
     */
    @Export(name="upsert", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> upsert;

    /**
     * @return Indicates if the argo project should be updated if existing and inserted if not.
     * 
     */
    public Output<Optional<Boolean>> upsert() {
        return Codegen.optional(this.upsert);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitopsAppProject(java.lang.String name) {
        this(name, GitopsAppProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitopsAppProject(java.lang.String name, GitopsAppProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitopsAppProject(java.lang.String name, GitopsAppProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitopsAppProject:GitopsAppProject", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GitopsAppProject(java.lang.String name, Output<java.lang.String> id, @Nullable GitopsAppProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitopsAppProject:GitopsAppProject", name, state, makeResourceOptions(options, id), false);
    }

    private static GitopsAppProjectArgs makeArgs(GitopsAppProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GitopsAppProjectArgs.Empty : args;
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
    public static GitopsAppProject get(java.lang.String name, Output<java.lang.String> id, @Nullable GitopsAppProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitopsAppProject(name, id, state, options);
    }
}
