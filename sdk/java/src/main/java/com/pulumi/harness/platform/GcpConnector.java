// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.GcpConnectorArgs;
import com.pulumi.harness.platform.inputs.GcpConnectorState;
import com.pulumi.harness.platform.outputs.GcpConnectorInheritFromDelegate;
import com.pulumi.harness.platform.outputs.GcpConnectorManual;
import com.pulumi.harness.platform.outputs.GcpConnectorOidcAuthentication;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Gcp connector.
 * 
 * ## Import
 * 
 * Import account level gcp connector
 * 
 * ```sh
 * $ pulumi import harness:platform/gcpConnector:GcpConnector example &lt;connector_id&gt;
 * ```
 * 
 * Import org level gcp connector
 * 
 * ```sh
 * $ pulumi import harness:platform/gcpConnector:GcpConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level gcp connector
 * 
 * ```sh
 * $ pulumi import harness:platform/gcpConnector:GcpConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/gcpConnector:GcpConnector")
public class GcpConnector extends com.pulumi.resources.CustomResource {
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
     * Enable this flag to execute on Delegate
     * 
     */
    @Export(name="executeOnDelegate", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> executeOnDelegate;

    /**
     * @return Enable this flag to execute on Delegate
     * 
     */
    public Output<Boolean> executeOnDelegate() {
        return this.executeOnDelegate;
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
     * Inherit configuration from delegate.
     * 
     */
    @Export(name="inheritFromDelegates", refs={List.class,GcpConnectorInheritFromDelegate.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GcpConnectorInheritFromDelegate>> inheritFromDelegates;

    /**
     * @return Inherit configuration from delegate.
     * 
     */
    public Output<Optional<List<GcpConnectorInheritFromDelegate>>> inheritFromDelegates() {
        return Codegen.optional(this.inheritFromDelegates);
    }
    /**
     * Manual credential configuration.
     * 
     */
    @Export(name="manual", refs={GcpConnectorManual.class}, tree="[0]")
    private Output</* @Nullable */ GcpConnectorManual> manual;

    /**
     * @return Manual credential configuration.
     * 
     */
    public Output<Optional<GcpConnectorManual>> manual() {
        return Codegen.optional(this.manual);
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
     * Authentication using harness oidc.
     * 
     */
    @Export(name="oidcAuthentications", refs={List.class,GcpConnectorOidcAuthentication.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GcpConnectorOidcAuthentication>> oidcAuthentications;

    /**
     * @return Authentication using harness oidc.
     * 
     */
    public Output<Optional<List<GcpConnectorOidcAuthentication>>> oidcAuthentications() {
        return Codegen.optional(this.oidcAuthentications);
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
    public GcpConnector(java.lang.String name) {
        this(name, GcpConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GcpConnector(java.lang.String name, GcpConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GcpConnector(java.lang.String name, GcpConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gcpConnector:GcpConnector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GcpConnector(java.lang.String name, Output<java.lang.String> id, @Nullable GcpConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gcpConnector:GcpConnector", name, state, makeResourceOptions(options, id), false);
    }

    private static GcpConnectorArgs makeArgs(GcpConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GcpConnectorArgs.Empty : args;
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
    public static GcpConnector get(java.lang.String name, Output<java.lang.String> id, @Nullable GcpConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GcpConnector(name, id, state, options);
    }
}