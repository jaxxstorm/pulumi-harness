// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.GitOpsClusterArgs;
import com.pulumi.harness.platform.inputs.GitOpsClusterState;
import com.pulumi.harness.platform.outputs.GitOpsClusterRequest;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing a Harness Gitops Cluster.
 * 
 * ## Import
 * 
 * Import an Account level Gitops Cluster
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsCluster:GitOpsCluster example &lt;agent_id&gt;/&lt;cluster_id&gt;
 * ```
 * 
 * Import an Org level Gitops Cluster
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsCluster:GitOpsCluster example &lt;organization_id&gt;/&lt;agent_id&gt;/&lt;cluster_id&gt;
 * ```
 * 
 * Import a Project level Gitops Cluster
 * 
 * ```sh
 * $ pulumi import harness:platform/gitOpsCluster:GitOpsCluster example &lt;organization_id&gt;/&lt;project_id&gt;/&lt;agent_id&gt;/&lt;cluster_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/gitOpsCluster:GitOpsCluster")
public class GitOpsCluster extends com.pulumi.resources.CustomResource {
    /**
     * Account identifier of the GitOps cluster.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account identifier of the GitOps cluster.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Agent identifier of the GitOps cluster.
     * 
     */
    @Export(name="agentId", refs={String.class}, tree="[0]")
    private Output<String> agentId;

    /**
     * @return Agent identifier of the GitOps cluster.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Identifier of the GitOps cluster.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier of the GitOps cluster.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Organization identifier of the cluster.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Organization identifier of the cluster.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Project identifier of the GitOps cluster.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Project identifier of the GitOps cluster.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Cluster create or update request.
     * 
     */
    @Export(name="requests", refs={List.class,GitOpsClusterRequest.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GitOpsClusterRequest>> requests;

    /**
     * @return Cluster create or update request.
     * 
     */
    public Output<Optional<List<GitOpsClusterRequest>>> requests() {
        return Codegen.optional(this.requests);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitOpsCluster(String name) {
        this(name, GitOpsClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitOpsCluster(String name, GitOpsClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitOpsCluster(String name, GitOpsClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsCluster:GitOpsCluster", name, args == null ? GitOpsClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GitOpsCluster(String name, Output<String> id, @Nullable GitOpsClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsCluster:GitOpsCluster", name, state, makeResourceOptions(options, id));
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
    public static GitOpsCluster get(String name, Output<String> id, @Nullable GitOpsClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitOpsCluster(name, id, state, options);
    }
}
