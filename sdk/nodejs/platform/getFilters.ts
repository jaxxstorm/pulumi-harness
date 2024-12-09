// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getFilters({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     type: "Connector",
 * });
 * ```
 */
export function getFilters(args: GetFiltersArgs, opts?: pulumi.InvokeOptions): Promise<GetFiltersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getFilters:getFilters", {
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getFilters.
 */
export interface GetFiltersArgs {
    /**
     * Unique identifier of the resource
     */
    identifier: string;
    /**
     * organization Identifier for the Entity
     */
    orgId?: string;
    /**
     * project Identifier for the Entity
     */
    projectId?: string;
    /**
     * Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}.
     */
    type: string;
}

/**
 * A collection of values returned by getFilters.
 */
export interface GetFiltersResult {
    /**
     * Properties of the filter entity defined in Harness.
     */
    readonly filterProperties: outputs.platform.GetFiltersFilterProperty[];
    /**
     * This indicates visibility of filter. By default, everyone can view this filter.
     */
    readonly filterVisibility: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource
     */
    readonly identifier: string;
    /**
     * Name of the Filter
     */
    readonly name: string;
    /**
     * organization Identifier for the Entity
     */
    readonly orgId?: string;
    /**
     * project Identifier for the Entity
     */
    readonly projectId?: string;
    /**
     * Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}.
     */
    readonly type: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getFilters({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     type: "Connector",
 * });
 * ```
 */
export function getFiltersOutput(args: GetFiltersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFiltersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getFilters:getFilters", {
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getFilters.
 */
export interface GetFiltersOutputArgs {
    /**
     * Unique identifier of the resource
     */
    identifier: pulumi.Input<string>;
    /**
     * organization Identifier for the Entity
     */
    orgId?: pulumi.Input<string>;
    /**
     * project Identifier for the Entity
     */
    projectId?: pulumi.Input<string>;
    /**
     * Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}.
     */
    type: pulumi.Input<string>;
}
