// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving an SLO.
 */
export function getSlo(args: GetSloArgs, opts?: pulumi.InvokeOptions): Promise<GetSloResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getSlo:getSlo", {
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSlo.
 */
export interface GetSloArgs {
    /**
     * Identifier of the SLO.
     */
    identifier: string;
    /**
     * Identifier of the organization in which the SLO is configured.
     */
    orgId: string;
    /**
     * Identifier of the project in which the SLO is configured.
     */
    projectId: string;
}

/**
 * A collection of values returned by getSlo.
 */
export interface GetSloResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifier of the SLO.
     */
    readonly identifier: string;
    /**
     * Identifier of the organization in which the SLO is configured.
     */
    readonly orgId: string;
    /**
     * Identifier of the project in which the SLO is configured.
     */
    readonly projectId: string;
}
/**
 * Data source for retrieving an SLO.
 */
export function getSloOutput(args: GetSloOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSloResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getSlo:getSlo", {
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSlo.
 */
export interface GetSloOutputArgs {
    /**
     * Identifier of the SLO.
     */
    identifier: pulumi.Input<string>;
    /**
     * Identifier of the organization in which the SLO is configured.
     */
    orgId: pulumi.Input<string>;
    /**
     * Identifier of the project in which the SLO is configured.
     */
    projectId: pulumi.Input<string>;
}
