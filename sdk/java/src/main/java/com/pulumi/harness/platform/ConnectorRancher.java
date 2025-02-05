// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ConnectorRancherArgs;
import com.pulumi.harness.platform.inputs.ConnectorRancherState;
import com.pulumi.harness.platform.outputs.ConnectorRancherBearerToken;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Rancher connector.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Import account level rancher connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorRancher:ConnectorRancher example &lt;connector_id&gt;
 * ```
 * 
 * Import org level rancher connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorRancher:ConnectorRancher example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level rancher connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorRancher:ConnectorRancher example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/connectorRancher:ConnectorRancher")
public class ConnectorRancher extends com.pulumi.resources.CustomResource {
    /**
     * Bearer token information for the rancher cluster.
     * 
     */
    @Export(name="bearerToken", refs={ConnectorRancherBearerToken.class}, tree="[0]")
    private Output</* @Nullable */ ConnectorRancherBearerToken> bearerToken;

    /**
     * @return Bearer token information for the rancher cluster.
     * 
     */
    public Output<Optional<ConnectorRancherBearerToken>> bearerToken() {
        return Codegen.optional(this.bearerToken);
    }
    /**
     * Selectors to use for the delegate.
     * 
     */
    @Export(name="delegateSelectors", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Selectors to use for the delegate.
     * 
     */
    public Output<Optional<List<String>>> delegateSelectors() {
        return Codegen.optional(this.delegateSelectors);
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
     * Enable this flag for force deletion of connector
     * 
     */
    @Export(name="forceDelete", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> forceDelete;

    /**
     * @return Enable this flag for force deletion of connector
     * 
     */
    public Output<Boolean> forceDelete() {
        return this.forceDelete;
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
     * The URL of the Rancher cluster.
     * 
     */
    @Export(name="rancherUrl", refs={String.class}, tree="[0]")
    private Output<String> rancherUrl;

    /**
     * @return The URL of the Rancher cluster.
     * 
     */
    public Output<String> rancherUrl() {
        return this.rancherUrl;
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
    public ConnectorRancher(java.lang.String name) {
        this(name, ConnectorRancherArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectorRancher(java.lang.String name, ConnectorRancherArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectorRancher(java.lang.String name, ConnectorRancherArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/connectorRancher:ConnectorRancher", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConnectorRancher(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectorRancherState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/connectorRancher:ConnectorRancher", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectorRancherArgs makeArgs(ConnectorRancherArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectorRancherArgs.Empty : args;
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
    public static ConnectorRancher get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectorRancherState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectorRancher(name, id, state, options);
    }
}
