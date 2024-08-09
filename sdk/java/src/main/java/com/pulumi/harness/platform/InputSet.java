// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.InputSetArgs;
import com.pulumi.harness.platform.inputs.InputSetState;
import com.pulumi.harness.platform.outputs.InputSetGitDetails;
import com.pulumi.harness.platform.outputs.InputSetGitImportInfo;
import com.pulumi.harness.platform.outputs.InputSetInputSetImportRequest;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness InputSet.
 * 
 * ## Import
 * 
 * Import input set
 * 
 * ```sh
 * $ pulumi import harness:platform/inputSet:InputSet example &lt;org_id&gt;/&lt;project_id&gt;/&lt;pipeline_id&gt;/&lt;input_set_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/inputSet:InputSet")
public class InputSet extends com.pulumi.resources.CustomResource {
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
     * Contains parameters related to creating an Entity for Git Experience.
     * 
     */
    @Export(name="gitDetails", refs={InputSetGitDetails.class}, tree="[0]")
    private Output<InputSetGitDetails> gitDetails;

    /**
     * @return Contains parameters related to creating an Entity for Git Experience.
     * 
     */
    public Output<InputSetGitDetails> gitDetails() {
        return this.gitDetails;
    }
    /**
     * Contains Git Information for importing entities from Git
     * 
     */
    @Export(name="gitImportInfo", refs={InputSetGitImportInfo.class}, tree="[0]")
    private Output</* @Nullable */ InputSetGitImportInfo> gitImportInfo;

    /**
     * @return Contains Git Information for importing entities from Git
     * 
     */
    public Output<Optional<InputSetGitImportInfo>> gitImportInfo() {
        return Codegen.optional(this.gitImportInfo);
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
    private Output</* @Nullable */ Boolean> importFromGit;

    /**
     * @return Flag to set if importing from Git
     * 
     */
    public Output<Optional<Boolean>> importFromGit() {
        return Codegen.optional(this.importFromGit);
    }
    /**
     * Contains parameters for importing a input set
     * 
     */
    @Export(name="inputSetImportRequest", refs={InputSetInputSetImportRequest.class}, tree="[0]")
    private Output</* @Nullable */ InputSetInputSetImportRequest> inputSetImportRequest;

    /**
     * @return Contains parameters for importing a input set
     * 
     */
    public Output<Optional<InputSetInputSetImportRequest>> inputSetImportRequest() {
        return Codegen.optional(this.inputSetImportRequest);
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
    private Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Identifier of the pipeline
     * 
     */
    @Export(name="pipelineId", refs={String.class}, tree="[0]")
    private Output<String> pipelineId;

    /**
     * @return Identifier of the pipeline
     * 
     */
    public Output<String> pipelineId() {
        return this.pipelineId;
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
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
     * Input Set YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    @Export(name="yaml", refs={String.class}, tree="[0]")
    private Output<String> yaml;

    /**
     * @return Input Set YAML. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InputSet(java.lang.String name) {
        this(name, InputSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InputSet(java.lang.String name, InputSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InputSet(java.lang.String name, InputSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/inputSet:InputSet", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private InputSet(java.lang.String name, Output<java.lang.String> id, @Nullable InputSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/inputSet:InputSet", name, state, makeResourceOptions(options, id), false);
    }

    private static InputSetArgs makeArgs(InputSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InputSetArgs.Empty : args;
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
    public static InputSet get(java.lang.String name, Output<java.lang.String> id, @Nullable InputSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InputSet(name, id, state, options);
    }
}
