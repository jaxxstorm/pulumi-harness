// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating an Azure Cloud Provider in Harness.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const manualConfigSecret = new harness.platform.AzureCloudProviderConnector("manual_config_secret", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "example",
 *     tags: ["foo:bar"],
 *     credentials: {
 *         type: "ManualConfig",
 *         azureManualDetails: {
 *             applicationId: "application_id",
 *             tenantId: "tenant_id",
 *             auth: {
 *                 type: "Secret",
 *                 azureClientSecretKey: {
 *                     secretRef: `account.${test.id}`,
 *                 },
 *             },
 *         },
 *     },
 *     azureEnvironmentType: "AZURE",
 *     delegateSelectors: ["harness-delegate"],
 * });
 * const manualConfigCertificate = new harness.platform.AzureCloudProviderConnector("manual_config_certificate", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "example",
 *     tags: ["foo:bar"],
 *     credentials: {
 *         type: "ManualConfig",
 *         azureManualDetails: {
 *             applicationId: "application_id",
 *             tenantId: "tenant_id",
 *             auth: {
 *                 type: "Certificate",
 *                 azureClientKeyCert: {
 *                     certificateRef: `account.${test.id}`,
 *                 },
 *             },
 *         },
 *     },
 *     azureEnvironmentType: "AZURE",
 *     delegateSelectors: ["harness-delegate"],
 * });
 * const inheritFromDelegateUserAssignedManagedIdentity = new harness.platform.AzureCloudProviderConnector("inherit_from_delegate_user_assigned_managed_identity", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "example",
 *     tags: ["foo:bar"],
 *     credentials: {
 *         type: "InheritFromDelegate",
 *         azureInheritFromDelegateDetails: {
 *             auth: {
 *                 azureMsiAuthUa: {
 *                     clientId: "client_id",
 *                 },
 *                 type: "UserAssignedManagedIdentity",
 *             },
 *         },
 *     },
 *     azureEnvironmentType: "AZURE",
 *     delegateSelectors: ["harness-delegate"],
 * });
 * const inheritFromDelegateSystemAssignedManagedIdentity = new harness.platform.AzureCloudProviderConnector("inherit_from_delegate_system_assigned_managed_identity", {
 *     identifier: "identifier",
 *     name: "name",
 *     description: "example",
 *     tags: ["foo:bar"],
 *     credentials: {
 *         type: "InheritFromDelegate",
 *         azureInheritFromDelegateDetails: {
 *             auth: {
 *                 type: "SystemAssignedManagedIdentity",
 *             },
 *         },
 *     },
 *     azureEnvironmentType: "AZURE",
 *     delegateSelectors: ["harness-delegate"],
 * });
 * ```
 *
 * ## Import
 *
 * Import account level azure cloud provider connector
 *
 * ```sh
 * $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example <connector_id>
 * ```
 *
 * Import org level azure cloud provider connector
 *
 * ```sh
 * $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example <ord_id>/<connector_id>
 * ```
 *
 * Import project level azure cloud provider connector
 *
 * ```sh
 * $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example <org_id>/<project_id>/<connector_id>
 * ```
 */
export class AzureCloudProviderConnector extends pulumi.CustomResource {
    /**
     * Get an existing AzureCloudProviderConnector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AzureCloudProviderConnectorState, opts?: pulumi.CustomResourceOptions): AzureCloudProviderConnector {
        return new AzureCloudProviderConnector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector';

    /**
     * Returns true if the given object is an instance of AzureCloudProviderConnector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AzureCloudProviderConnector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AzureCloudProviderConnector.__pulumiType;
    }

    /**
     * Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
     */
    public readonly azureEnvironmentType!: pulumi.Output<string>;
    /**
     * Contains Azure connector credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.platform.AzureCloudProviderConnectorCredentials>;
    /**
     * Tags to filter delegates for connection.
     */
    public readonly delegateSelectors!: pulumi.Output<string[] | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Execute on delegate or not.
     */
    public readonly executeOnDelegate!: pulumi.Output<boolean | undefined>;
    /**
     * Enable this flag for force deletion of connector
     */
    public readonly forceDelete!: pulumi.Output<boolean>;
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
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a AzureCloudProviderConnector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AzureCloudProviderConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AzureCloudProviderConnectorArgs | AzureCloudProviderConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AzureCloudProviderConnectorState | undefined;
            resourceInputs["azureEnvironmentType"] = state ? state.azureEnvironmentType : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["executeOnDelegate"] = state ? state.executeOnDelegate : undefined;
            resourceInputs["forceDelete"] = state ? state.forceDelete : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as AzureCloudProviderConnectorArgs | undefined;
            if ((!args || args.credentials === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentials'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["azureEnvironmentType"] = args ? args.azureEnvironmentType : undefined;
            resourceInputs["credentials"] = args ? args.credentials : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["executeOnDelegate"] = args ? args.executeOnDelegate : undefined;
            resourceInputs["forceDelete"] = args ? args.forceDelete : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AzureCloudProviderConnector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AzureCloudProviderConnector resources.
 */
export interface AzureCloudProviderConnectorState {
    /**
     * Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
     */
    azureEnvironmentType?: pulumi.Input<string>;
    /**
     * Contains Azure connector credentials.
     */
    credentials?: pulumi.Input<inputs.platform.AzureCloudProviderConnectorCredentials>;
    /**
     * Tags to filter delegates for connection.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Execute on delegate or not.
     */
    executeOnDelegate?: pulumi.Input<boolean>;
    /**
     * Enable this flag for force deletion of connector
     */
    forceDelete?: pulumi.Input<boolean>;
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
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AzureCloudProviderConnector resource.
 */
export interface AzureCloudProviderConnectorArgs {
    /**
     * Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
     */
    azureEnvironmentType?: pulumi.Input<string>;
    /**
     * Contains Azure connector credentials.
     */
    credentials: pulumi.Input<inputs.platform.AzureCloudProviderConnectorCredentials>;
    /**
     * Tags to filter delegates for connection.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Execute on delegate or not.
     */
    executeOnDelegate?: pulumi.Input<boolean>;
    /**
     * Enable this flag for force deletion of connector
     */
    forceDelete?: pulumi.Input<boolean>;
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
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
