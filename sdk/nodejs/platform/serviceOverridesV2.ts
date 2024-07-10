// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness service override V2.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.platform.ServiceOverridesV2("test", {
 *     orgId: "orgIdentifier",
 *     projectId: "projectIdentifier",
 *     envId: "environmentIdentifier",
 *     serviceId: "serviceIdentifier",
 *     infraId: "infraIdentifier",
 *     type: "INFRA_SERVICE_OVERRIDE",
 *     yaml: `variables:
 *   - name: var1
 *     type: String
 *     value: val1
 * configFiles:
 *   - configFile:
 *       identifier: sampleConfigFile
 *       spec:
 *         store:
 *           type: Harness
 *           spec:
 *             files:
 *               - account:/configFile1
 * manifests:
 *   - manifest:
 *       identifier: sampleManifestFile
 *       type: Values
 *       spec:
 *         store:
 *           type: Harness
 *           spec:
 *             files:
 *               - account:/manifestFile1
 * `,
 * });
 * ```
 *
 * ### Creating Remote Service Override
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.platform.ServiceOverridesV2("test", {
 *     orgId: "orgIdentifier",
 *     projectId: "projectIdentifier",
 *     envId: "environmentIdentifier",
 *     serviceId: "serviceIdentifier",
 *     infraId: "infraIdentifier",
 *     type: "INFRA_SERVICE_OVERRIDE",
 *     gitDetails: {
 *         storeType: "REMOTE",
 *         connectorRef: "connector_ref",
 *         repoName: "repo_name",
 *         filePath: "file_path",
 *         branch: "branch",
 *     },
 *     yaml: `variables:
 *   - name: v1
 *     type: String
 *     value: val1
 * manifests:
 *   - manifest:
 *       identifier: manifest1
 *       type: Values
 *       spec:
 *         store:
 *           type: Github
 *           spec:
 *             connectorRef: "<+input>"
 *             gitFetchType: Branch
 *             paths:
 *               - path-updated
 *             repoName: "<+input>"
 *             branch: master
 *         skipResourceVersioning: false
 * `,
 * });
 * ```
 *
 * ### Importing Service Override From Git
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.platform.ServiceOverridesV2("test", {
 *     orgId: "orgIdentifier",
 *     projectId: "projectIdentifier",
 *     envId: "environmentIdentifier",
 *     serviceId: "serviceIdentifier",
 *     infraId: "infraIdentifier",
 *     type: "INFRA_SERVICE_OVERRIDE",
 *     importFromGit: true,
 *     gitDetails: {
 *         storeType: "REMOTE",
 *         connectorRef: "connector_ref",
 *         repoName: "repo_name",
 *         filePath: "file_path",
 *         branch: "branch",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Import account level service override
 *
 * ```sh
 * $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example <override_id>
 * ```
 *
 * Import org level service override
 *
 * ```sh
 * $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example <org_id>/<override_id>
 * ```
 *
 * Import project level service override
 *
 * ```sh
 * $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example <org_id>/<project_id>/<override_id>
 * ```
 */
export class ServiceOverridesV2 extends pulumi.CustomResource {
    /**
     * Get an existing ServiceOverridesV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceOverridesV2State, opts?: pulumi.CustomResourceOptions): ServiceOverridesV2 {
        return new ServiceOverridesV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/serviceOverridesV2:ServiceOverridesV2';

    /**
     * Returns true if the given object is an instance of ServiceOverridesV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceOverridesV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceOverridesV2.__pulumiType;
    }

    /**
     * The cluster ID to which the overrides are associated.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The environment ID to which the overrides are associated.
     */
    public readonly envId!: pulumi.Output<string>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    public readonly gitDetails!: pulumi.Output<outputs.platform.ServiceOverridesV2GitDetails>;
    /**
     * The identifier of the override entity.
     */
    public /*out*/ readonly identifier!: pulumi.Output<string>;
    /**
     * import override from git
     */
    public readonly importFromGit!: pulumi.Output<boolean>;
    /**
     * The infrastructure ID to which the overrides are associated.
     */
    public readonly infraId!: pulumi.Output<string>;
    /**
     * force import override from remote even if same file path already exist
     */
    public readonly isForceImport!: pulumi.Output<boolean>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * The service ID to which the overrides applies.
     */
    public readonly serviceId!: pulumi.Output<string>;
    /**
     * The type of the overrides.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The yaml of the overrides spec object.
     */
    public readonly yaml!: pulumi.Output<string>;

    /**
     * Create a ServiceOverridesV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceOverridesV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceOverridesV2Args | ServiceOverridesV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceOverridesV2State | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["envId"] = state ? state.envId : undefined;
            resourceInputs["gitDetails"] = state ? state.gitDetails : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["importFromGit"] = state ? state.importFromGit : undefined;
            resourceInputs["infraId"] = state ? state.infraId : undefined;
            resourceInputs["isForceImport"] = state ? state.isForceImport : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["serviceId"] = state ? state.serviceId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["yaml"] = state ? state.yaml : undefined;
        } else {
            const args = argsOrState as ServiceOverridesV2Args | undefined;
            if ((!args || args.envId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'envId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["envId"] = args ? args.envId : undefined;
            resourceInputs["gitDetails"] = args ? args.gitDetails : undefined;
            resourceInputs["importFromGit"] = args ? args.importFromGit : undefined;
            resourceInputs["infraId"] = args ? args.infraId : undefined;
            resourceInputs["isForceImport"] = args ? args.isForceImport : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["serviceId"] = args ? args.serviceId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["yaml"] = args ? args.yaml : undefined;
            resourceInputs["identifier"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceOverridesV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceOverridesV2 resources.
 */
export interface ServiceOverridesV2State {
    /**
     * The cluster ID to which the overrides are associated.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The environment ID to which the overrides are associated.
     */
    envId?: pulumi.Input<string>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    gitDetails?: pulumi.Input<inputs.platform.ServiceOverridesV2GitDetails>;
    /**
     * The identifier of the override entity.
     */
    identifier?: pulumi.Input<string>;
    /**
     * import override from git
     */
    importFromGit?: pulumi.Input<boolean>;
    /**
     * The infrastructure ID to which the overrides are associated.
     */
    infraId?: pulumi.Input<string>;
    /**
     * force import override from remote even if same file path already exist
     */
    isForceImport?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The service ID to which the overrides applies.
     */
    serviceId?: pulumi.Input<string>;
    /**
     * The type of the overrides.
     */
    type?: pulumi.Input<string>;
    /**
     * The yaml of the overrides spec object.
     */
    yaml?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceOverridesV2 resource.
 */
export interface ServiceOverridesV2Args {
    /**
     * The cluster ID to which the overrides are associated.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The environment ID to which the overrides are associated.
     */
    envId: pulumi.Input<string>;
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     */
    gitDetails?: pulumi.Input<inputs.platform.ServiceOverridesV2GitDetails>;
    /**
     * import override from git
     */
    importFromGit?: pulumi.Input<boolean>;
    /**
     * The infrastructure ID to which the overrides are associated.
     */
    infraId?: pulumi.Input<string>;
    /**
     * force import override from remote even if same file path already exist
     */
    isForceImport?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The service ID to which the overrides applies.
     */
    serviceId?: pulumi.Input<string>;
    /**
     * The type of the overrides.
     */
    type: pulumi.Input<string>;
    /**
     * The yaml of the overrides spec object.
     */
    yaml?: pulumi.Input<string>;
}
