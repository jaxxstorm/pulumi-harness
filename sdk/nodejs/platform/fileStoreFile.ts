// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating files in Harness.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * // Create file
 * const example = new harness.platform.FileStoreFile("example", {
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     identifier: "identifier",
 *     name: "name",
 *     description: "description",
 *     tags: [
 *         "foo:bar",
 *         "baz:qux",
 *     ],
 *     parentIdentifier: "parent_identifier",
 *     fileContentPath: "file_content_path",
 *     mimeType: "mime_type",
 *     fileUsage: "MANIFEST_FILE|CONFIG|SCRIPT",
 * });
 * ```
 *
 * ## Import
 *
 * Import account level file
 *
 * ```sh
 * $ pulumi import harness:platform/fileStoreFile:FileStoreFile example <identifier>
 * ```
 *
 * Import org level file
 *
 * ```sh
 * $ pulumi import harness:platform/fileStoreFile:FileStoreFile example <org_id><identifier>
 * ```
 *
 * Import org level file
 *
 * ```sh
 * $ pulumi import harness:platform/fileStoreFile:FileStoreFile example <org_id><project_id><identifier>
 * ```
 */
export class FileStoreFile extends pulumi.CustomResource {
    /**
     * Get an existing FileStoreFile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FileStoreFileState, opts?: pulumi.CustomResourceOptions): FileStoreFile {
        return new FileStoreFile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/fileStoreFile:FileStoreFile';

    /**
     * Returns true if the given object is an instance of FileStoreFile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FileStoreFile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FileStoreFile.__pulumiType;
    }

    /**
     * File content stored on Harness File Store
     */
    public readonly content!: pulumi.Output<string | undefined>;
    /**
     * Created by
     */
    public /*out*/ readonly createdBies!: pulumi.Output<outputs.platform.FileStoreFileCreatedBy[]>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * File content path to be upladed on Harness File Store
     */
    public readonly fileContentPath!: pulumi.Output<string | undefined>;
    /**
     * File usage. Valid options are ManifestFile, Config, Script
     */
    public readonly fileUsage!: pulumi.Output<string>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Last modified at
     */
    public /*out*/ readonly lastModifiedAt!: pulumi.Output<number>;
    /**
     * Last modified by
     */
    public /*out*/ readonly lastModifiedBies!: pulumi.Output<outputs.platform.FileStoreFileLastModifiedBy[]>;
    /**
     * File mime type
     */
    public readonly mimeType!: pulumi.Output<string>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * File parent identifier on Harness File Store
     */
    public readonly parentIdentifier!: pulumi.Output<string>;
    /**
     * Harness File Store file path
     */
    public /*out*/ readonly path!: pulumi.Output<string>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a FileStoreFile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FileStoreFileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FileStoreFileArgs | FileStoreFileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FileStoreFileState | undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["createdBies"] = state ? state.createdBies : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fileContentPath"] = state ? state.fileContentPath : undefined;
            resourceInputs["fileUsage"] = state ? state.fileUsage : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["lastModifiedAt"] = state ? state.lastModifiedAt : undefined;
            resourceInputs["lastModifiedBies"] = state ? state.lastModifiedBies : undefined;
            resourceInputs["mimeType"] = state ? state.mimeType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["parentIdentifier"] = state ? state.parentIdentifier : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as FileStoreFileArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.parentIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parentIdentifier'");
            }
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fileContentPath"] = args ? args.fileContentPath : undefined;
            resourceInputs["fileUsage"] = args ? args.fileUsage : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["mimeType"] = args ? args.mimeType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["parentIdentifier"] = args ? args.parentIdentifier : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["createdBies"] = undefined /*out*/;
            resourceInputs["lastModifiedAt"] = undefined /*out*/;
            resourceInputs["lastModifiedBies"] = undefined /*out*/;
            resourceInputs["path"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FileStoreFile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FileStoreFile resources.
 */
export interface FileStoreFileState {
    /**
     * File content stored on Harness File Store
     */
    content?: pulumi.Input<string>;
    /**
     * Created by
     */
    createdBies?: pulumi.Input<pulumi.Input<inputs.platform.FileStoreFileCreatedBy>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * File content path to be upladed on Harness File Store
     */
    fileContentPath?: pulumi.Input<string>;
    /**
     * File usage. Valid options are ManifestFile, Config, Script
     */
    fileUsage?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Last modified at
     */
    lastModifiedAt?: pulumi.Input<number>;
    /**
     * Last modified by
     */
    lastModifiedBies?: pulumi.Input<pulumi.Input<inputs.platform.FileStoreFileLastModifiedBy>[]>;
    /**
     * File mime type
     */
    mimeType?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * File parent identifier on Harness File Store
     */
    parentIdentifier?: pulumi.Input<string>;
    /**
     * Harness File Store file path
     */
    path?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a FileStoreFile resource.
 */
export interface FileStoreFileArgs {
    /**
     * File content stored on Harness File Store
     */
    content?: pulumi.Input<string>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * File content path to be upladed on Harness File Store
     */
    fileContentPath?: pulumi.Input<string>;
    /**
     * File usage. Valid options are ManifestFile, Config, Script
     */
    fileUsage?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * File mime type
     */
    mimeType?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * File parent identifier on Harness File Store
     */
    parentIdentifier: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
