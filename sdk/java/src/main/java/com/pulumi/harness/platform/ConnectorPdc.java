// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ConnectorPdcArgs;
import com.pulumi.harness.platform.inputs.ConnectorPdcState;
import com.pulumi.harness.platform.outputs.ConnectorPdcHost;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Physical data center connector.
 * 
 * ## Example to create Pdc Connector at different levels (Org, Project, Account)
 * 
 * ## Import
 * 
 * Import account level pdc connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorPdc:ConnectorPdc example &lt;connector_id&gt;
 * ```
 * 
 * Import org level pdc connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorPdc:ConnectorPdc example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level pdc connector
 * 
 * ```sh
 * $ pulumi import harness:platform/connectorPdc:ConnectorPdc example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/connectorPdc:ConnectorPdc")
public class ConnectorPdc extends com.pulumi.resources.CustomResource {
    /**
     * Tags to filter delegates for connection.
     * 
     */
    @Export(name="delegateSelectors", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Tags to filter delegates for connection.
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
     * Hosts to be provided.
     * 
     */
    @Export(name="hosts", refs={List.class,ConnectorPdcHost.class}, tree="[0,1]")
    private Output<List<ConnectorPdcHost>> hosts;

    /**
     * @return Hosts to be provided.
     * 
     */
    public Output<List<ConnectorPdcHost>> hosts() {
        return this.hosts;
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
    public ConnectorPdc(String name) {
        this(name, ConnectorPdcArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectorPdc(String name, ConnectorPdcArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectorPdc(String name, ConnectorPdcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/connectorPdc:ConnectorPdc", name, args == null ? ConnectorPdcArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectorPdc(String name, Output<String> id, @Nullable ConnectorPdcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/connectorPdc:ConnectorPdc", name, state, makeResourceOptions(options, id));
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
    public static ConnectorPdc get(String name, Output<String> id, @Nullable ConnectorPdcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectorPdc(name, id, state, options);
    }
}
