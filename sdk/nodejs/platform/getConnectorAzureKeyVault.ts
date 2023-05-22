// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for looking up an Azure key vault connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getConnectorAzureKeyVault({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getConnectorAzureKeyVault(args: GetConnectorAzureKeyVaultArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectorAzureKeyVaultResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getConnectorAzureKeyVault:getConnectorAzureKeyVault", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnectorAzureKeyVault.
 */
export interface GetConnectorAzureKeyVaultArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getConnectorAzureKeyVault.
 */
export interface GetConnectorAzureKeyVaultResult {
    /**
     * Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
     */
    readonly azureEnvironmentType: string;
    /**
     * Application ID of the Azure App.
     */
    readonly clientId: string;
    /**
     * Connect using only the delegates which have these tags.
     */
    readonly delegateSelectors: string[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier: string;
    /**
     * Specifies whether or not is the default value.
     */
    readonly isDefault: boolean;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * The Harness text secret with the Azure authentication key as its value.
     */
    readonly secretKey: string;
    /**
     * Azure subscription ID.
     */
    readonly subscription: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
    /**
     * The Azure Active Directory (AAD) directory ID where you created your application.
     */
    readonly tenantId: string;
    /**
     * Name of the vault.
     */
    readonly vaultName: string;
}
/**
 * Data source for looking up an Azure key vault connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getConnectorAzureKeyVault({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getConnectorAzureKeyVaultOutput(args: GetConnectorAzureKeyVaultOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConnectorAzureKeyVaultResult> {
    return pulumi.output(args).apply((a: any) => getConnectorAzureKeyVault(a, opts))
}

/**
 * A collection of arguments for invoking getConnectorAzureKeyVault.
 */
export interface GetConnectorAzureKeyVaultOutputArgs {
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
}
