// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.AwsCCConnectorArgs;
import com.pulumi.harness.platform.inputs.AwsCCConnectorState;
import com.pulumi.harness.platform.outputs.AwsCCConnectorCrossAccountAccess;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an AWS Cloud Cost connector.
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
 * import com.pulumi.harness.platform.AwsCCConnector;
 * import com.pulumi.harness.platform.AwsCCConnectorArgs;
 * import com.pulumi.harness.platform.inputs.AwsCCConnectorCrossAccountAccessArgs;
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
 *         var test = new AwsCCConnector("test", AwsCCConnectorArgs.builder()
 *             .identifier("identifier")
 *             .name("name")
 *             .description("test")
 *             .tags("foo:bar")
 *             .accountId("account_id")
 *             .reportName("report_name")
 *             .s3Bucket("s3bucket")
 *             .featuresEnableds(            
 *                 "OPTIMIZATION",
 *                 "VISIBILITY",
 *                 "BILLING")
 *             .crossAccountAccess(AwsCCConnectorCrossAccountAccessArgs.builder()
 *                 .roleArn("role_arn")
 *                 .externalId("external_id")
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
 * Import account level aws cloud cost connector
 * 
 * ```sh
 * $ pulumi import harness:platform/awsCCConnector:AwsCCConnector example &lt;connector_id&gt;
 * ```
 * 
 * Import org level aws cloud cost connector
 * 
 * ```sh
 * $ pulumi import harness:platform/awsCCConnector:AwsCCConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 * Import project level aws cloud cost connector
 * 
 * ```sh
 * $ pulumi import harness:platform/awsCCConnector:AwsCCConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/awsCCConnector:AwsCCConnector")
public class AwsCCConnector extends com.pulumi.resources.CustomResource {
    /**
     * The AWS account id.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The AWS account id.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
     * 
     */
    @Export(name="crossAccountAccess", refs={AwsCCConnectorCrossAccountAccess.class}, tree="[0]")
    private Output<AwsCCConnectorCrossAccountAccess> crossAccountAccess;

    /**
     * @return Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
     * 
     */
    public Output<AwsCCConnectorCrossAccountAccess> crossAccountAccess() {
        return this.crossAccountAccess;
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
     * The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
     * 
     */
    @Export(name="featuresEnableds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> featuresEnableds;

    /**
     * @return The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
     * 
     */
    public Output<List<String>> featuresEnableds() {
        return this.featuresEnableds;
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
     * The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
     * 
     */
    @Export(name="reportName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reportName;

    /**
     * @return The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
     * 
     */
    public Output<Optional<String>> reportName() {
        return Codegen.optional(this.reportName);
    }
    /**
     * The name of s3 bucket.
     * 
     */
    @Export(name="s3Bucket", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> s3Bucket;

    /**
     * @return The name of s3 bucket.
     * 
     */
    public Output<Optional<String>> s3Bucket() {
        return Codegen.optional(this.s3Bucket);
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
    public AwsCCConnector(java.lang.String name) {
        this(name, AwsCCConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsCCConnector(java.lang.String name, AwsCCConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsCCConnector(java.lang.String name, AwsCCConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/awsCCConnector:AwsCCConnector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AwsCCConnector(java.lang.String name, Output<java.lang.String> id, @Nullable AwsCCConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/awsCCConnector:AwsCCConnector", name, state, makeResourceOptions(options, id), false);
    }

    private static AwsCCConnectorArgs makeArgs(AwsCCConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AwsCCConnectorArgs.Empty : args;
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
    public static AwsCCConnector get(java.lang.String name, Output<java.lang.String> id, @Nullable AwsCCConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsCCConnector(name, id, state, options);
    }
}
