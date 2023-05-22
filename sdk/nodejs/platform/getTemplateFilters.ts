// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness Template Filter.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getTemplateFilters({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     type: "Template",
 * });
 * ```
 */
export function getTemplateFilters(args: GetTemplateFiltersArgs, opts?: pulumi.InvokeOptions): Promise<GetTemplateFiltersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getTemplateFilters:getTemplateFilters", {
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getTemplateFilters.
 */
export interface GetTemplateFiltersArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier: string;
    /**
     * Organization Identifier for the Entity.
     */
    orgId?: string;
    /**
     * Project Identifier for the Entity.
     */
    projectId?: string;
    /**
     * Type of filter. Currently supported types are {TemplateSetup, TemplateExecution, Deployment, Template, EnvironmentGroup, Environment}.
     */
    type: string;
}

/**
 * A collection of values returned by getTemplateFilters.
 */
export interface GetTemplateFiltersResult {
    /**
     * Properties of the filter entity defined in Harness.
     */
    readonly filterProperties: outputs.platform.GetTemplateFiltersFilterProperty[];
    /**
     * This indicates visibility of filter. By default, everyone can view this filter.
     */
    readonly filterVisibility: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier: string;
    /**
     * Name of the Filter.
     */
    readonly name: string;
    /**
     * Organization Identifier for the Entity.
     */
    readonly orgId?: string;
    /**
     * Project Identifier for the Entity.
     */
    readonly projectId?: string;
    /**
     * Type of filter. Currently supported types are {TemplateSetup, TemplateExecution, Deployment, Template, EnvironmentGroup, Environment}.
     */
    readonly type: string;
}
/**
 * Data source for retrieving a Harness Template Filter.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = harness.platform.getTemplateFilters({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 *     type: "Template",
 * });
 * ```
 */
export function getTemplateFiltersOutput(args: GetTemplateFiltersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTemplateFiltersResult> {
    return pulumi.output(args).apply((a: any) => getTemplateFilters(a, opts))
}

/**
 * A collection of arguments for invoking getTemplateFilters.
 */
export interface GetTemplateFiltersOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Organization Identifier for the Entity.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Project Identifier for the Entity.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Type of filter. Currently supported types are {TemplateSetup, TemplateExecution, Deployment, Template, EnvironmentGroup, Environment}.
     */
    type: pulumi.Input<string>;
}
