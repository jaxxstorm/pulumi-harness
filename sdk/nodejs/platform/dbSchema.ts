// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness DBDevOps Schema.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.platform.DbSchema("test", {
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     name: "name",
 *     service: "service1",
 *     tags: [
 *         "foo:bar",
 *         "bar:foo",
 *     ],
 *     schemaSource: {
 *         connector: "gitConnector",
 *         repo: "TestRepo",
 *         location: "db/example-changelog.yaml",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Import project level db schema
 *
 * ```sh
 * $ pulumi import harness:platform/dbSchema:DbSchema example <org_id>/<project_id>/<db_schema_id>
 * ```
 */
export class DbSchema extends pulumi.CustomResource {
    /**
     * Get an existing DbSchema resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DbSchemaState, opts?: pulumi.CustomResourceOptions): DbSchema {
        return new DbSchema(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/dbSchema:DbSchema';

    /**
     * Returns true if the given object is an instance of DbSchema.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DbSchema {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DbSchema.__pulumiType;
    }

    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Provides a connector and path at which to find the database schema representation
     */
    public readonly schemaSource!: pulumi.Output<outputs.platform.DbSchemaSchemaSource>;
    /**
     * The service associated with schema
     */
    public readonly service!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a DbSchema resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DbSchemaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DbSchemaArgs | DbSchemaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DbSchemaState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["schemaSource"] = state ? state.schemaSource : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DbSchemaArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.schemaSource === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaSource'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["schemaSource"] = args ? args.schemaSource : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DbSchema.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DbSchema resources.
 */
export interface DbSchemaState {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Provides a connector and path at which to find the database schema representation
     */
    schemaSource?: pulumi.Input<inputs.platform.DbSchemaSchemaSource>;
    /**
     * The service associated with schema
     */
    service?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a DbSchema resource.
 */
export interface DbSchemaArgs {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Provides a connector and path at which to find the database schema representation
     */
    schemaSource: pulumi.Input<inputs.platform.DbSchemaSchemaSource>;
    /**
     * The service associated with schema
     */
    service?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
