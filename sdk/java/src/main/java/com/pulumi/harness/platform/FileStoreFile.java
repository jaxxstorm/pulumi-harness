// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.FileStoreFileArgs;
import com.pulumi.harness.platform.inputs.FileStoreFileState;
import com.pulumi.harness.platform.outputs.FileStoreFileCreatedBy;
import com.pulumi.harness.platform.outputs.FileStoreFileLastModifiedBy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating files in Harness.
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
 * import com.pulumi.harness.platform.FileStoreFile;
 * import com.pulumi.harness.platform.FileStoreFileArgs;
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
 *         // Create file
 *         var example = new FileStoreFile("example", FileStoreFileArgs.builder()
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .identifier("identifier")
 *             .name("name")
 *             .description("description")
 *             .tags(            
 *                 "foo:bar",
 *                 "baz:qux")
 *             .parentIdentifier("parent_identifier")
 *             .fileContentPath("file_content_path")
 *             .mimeType("mime_type")
 *             .fileUsage("MANIFEST_FILE|CONFIG|SCRIPT")
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
 * Import account level file
 * 
 * ```sh
 * $ pulumi import harness:platform/fileStoreFile:FileStoreFile example &lt;identifier&gt;
 * ```
 * 
 * Import org level file
 * 
 * ```sh
 * $ pulumi import harness:platform/fileStoreFile:FileStoreFile example &lt;org_id&gt;/&lt;identifier&gt;
 * ```
 * 
 * Import org level file
 * 
 * ```sh
 * $ pulumi import harness:platform/fileStoreFile:FileStoreFile example &lt;org_id&gt;/&lt;project_id&gt;/&lt;identifier&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/fileStoreFile:FileStoreFile")
public class FileStoreFile extends com.pulumi.resources.CustomResource {
    /**
     * File content stored on Harness File Store
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return File content stored on Harness File Store
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * Created by
     * 
     */
    @Export(name="createdBies", refs={List.class,FileStoreFileCreatedBy.class}, tree="[0,1]")
    private Output<List<FileStoreFileCreatedBy>> createdBies;

    /**
     * @return Created by
     * 
     */
    public Output<List<FileStoreFileCreatedBy>> createdBies() {
        return this.createdBies;
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
     * File content path to be upladed on Harness File Store
     * 
     */
    @Export(name="fileContentPath", refs={String.class}, tree="[0]")
    private Output<String> fileContentPath;

    /**
     * @return File content path to be upladed on Harness File Store
     * 
     */
    public Output<String> fileContentPath() {
        return this.fileContentPath;
    }
    /**
     * File usage. Valid options are ManifestFile, Config, Script
     * 
     */
    @Export(name="fileUsage", refs={String.class}, tree="[0]")
    private Output<String> fileUsage;

    /**
     * @return File usage. Valid options are ManifestFile, Config, Script
     * 
     */
    public Output<String> fileUsage() {
        return this.fileUsage;
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
     * Last modified at
     * 
     */
    @Export(name="lastModifiedAt", refs={Integer.class}, tree="[0]")
    private Output<Integer> lastModifiedAt;

    /**
     * @return Last modified at
     * 
     */
    public Output<Integer> lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Last modified by
     * 
     */
    @Export(name="lastModifiedBies", refs={List.class,FileStoreFileLastModifiedBy.class}, tree="[0,1]")
    private Output<List<FileStoreFileLastModifiedBy>> lastModifiedBies;

    /**
     * @return Last modified by
     * 
     */
    public Output<List<FileStoreFileLastModifiedBy>> lastModifiedBies() {
        return this.lastModifiedBies;
    }
    /**
     * File mime type
     * 
     */
    @Export(name="mimeType", refs={String.class}, tree="[0]")
    private Output<String> mimeType;

    /**
     * @return File mime type
     * 
     */
    public Output<String> mimeType() {
        return this.mimeType;
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
     * File parent identifier on Harness File Store. If the folder is at the root level, the parent_identifier will be `Root`.
     * 
     */
    @Export(name="parentIdentifier", refs={String.class}, tree="[0]")
    private Output<String> parentIdentifier;

    /**
     * @return File parent identifier on Harness File Store. If the folder is at the root level, the parent_identifier will be `Root`.
     * 
     */
    public Output<String> parentIdentifier() {
        return this.parentIdentifier;
    }
    /**
     * Harness File Store file path
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output<String> path;

    /**
     * @return Harness File Store file path
     * 
     */
    public Output<String> path() {
        return this.path;
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
    public FileStoreFile(java.lang.String name) {
        this(name, FileStoreFileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileStoreFile(java.lang.String name, FileStoreFileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileStoreFile(java.lang.String name, FileStoreFileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/fileStoreFile:FileStoreFile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FileStoreFile(java.lang.String name, Output<java.lang.String> id, @Nullable FileStoreFileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/fileStoreFile:FileStoreFile", name, state, makeResourceOptions(options, id), false);
    }

    private static FileStoreFileArgs makeArgs(FileStoreFileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FileStoreFileArgs.Empty : args;
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
    public static FileStoreFile get(java.lang.String name, Output<java.lang.String> id, @Nullable FileStoreFileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FileStoreFile(name, id, state, options);
    }
}
