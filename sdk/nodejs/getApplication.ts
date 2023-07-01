// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source for retrieving a Harness application
 */
export function getApplication(args?: GetApplicationArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:index/getApplication:getApplication", {
        "description": args.description,
        "gitSyncConnectorId": args.gitSyncConnectorId,
        "gitSyncEnabled": args.gitSyncEnabled,
        "id": args.id,
        "isManualTriggerAuthorized": args.isManualTriggerAuthorized,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplication.
 */
export interface GetApplicationArgs {
    /**
     * The application description
     */
    description?: string;
    /**
     * The id of the git sync connector
     */
    gitSyncConnectorId?: string;
    /**
     * True if git sync is enabled on this application
     */
    gitSyncEnabled?: boolean;
    /**
     * Unique identifier of the application
     */
    id?: string;
    /**
     * When this is set to true, all manual triggers will require API Key authorization
     */
    isManualTriggerAuthorized?: boolean;
    /**
     * The name of the application
     */
    name?: string;
}

/**
 * A collection of values returned by getApplication.
 */
export interface GetApplicationResult {
    /**
     * The application description
     */
    readonly description?: string;
    /**
     * The id of the git sync connector
     */
    readonly gitSyncConnectorId?: string;
    /**
     * True if git sync is enabled on this application
     */
    readonly gitSyncEnabled?: boolean;
    /**
     * Unique identifier of the application
     */
    readonly id?: string;
    /**
     * When this is set to true, all manual triggers will require API Key authorization
     */
    readonly isManualTriggerAuthorized?: boolean;
    /**
     * The name of the application
     */
    readonly name?: string;
}
/**
 * Data source for retrieving a Harness application
 */
export function getApplicationOutput(args?: GetApplicationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplicationResult> {
    return pulumi.output(args).apply((a: any) => getApplication(a, opts))
}

/**
 * A collection of arguments for invoking getApplication.
 */
export interface GetApplicationOutputArgs {
    /**
     * The application description
     */
    description?: pulumi.Input<string>;
    /**
     * The id of the git sync connector
     */
    gitSyncConnectorId?: pulumi.Input<string>;
    /**
     * True if git sync is enabled on this application
     */
    gitSyncEnabled?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the application
     */
    id?: pulumi.Input<string>;
    /**
     * When this is set to true, all manual triggers will require API Key authorization
     */
    isManualTriggerAuthorized?: pulumi.Input<boolean>;
    /**
     * The name of the application
     */
    name?: pulumi.Input<string>;
}
