// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getRoles({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getRoles(args: GetRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetRolesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getRoles:getRoles", {
        "allowedScopeLevels": args.allowedScopeLevels,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "permissions": args.permissions,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesArgs {
    /**
     * The scope levels at which this role can be used
     */
    allowedScopeLevels?: string[];
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
     * List of the permission identifiers
     */
    permissions?: string[];
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getRoles.
 */
export interface GetRolesResult {
    /**
     * The scope levels at which this role can be used
     */
    readonly allowedScopeLevels: string[];
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
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * List of the permission identifiers
     */
    readonly permissions?: string[];
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getRoles({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getRolesOutput(args: GetRolesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRolesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getRoles:getRoles", {
        "allowedScopeLevels": args.allowedScopeLevels,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "permissions": args.permissions,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesOutputArgs {
    /**
     * The scope levels at which this role can be used
     */
    allowedScopeLevels?: pulumi.Input<pulumi.Input<string>[]>;
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
     * List of the permission identifiers
     */
    permissions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
}
