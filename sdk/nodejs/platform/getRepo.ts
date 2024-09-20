// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness repo.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const exampleByIdentifier = harness.platform.getRepo({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "proj_id",
 * });
 * ```
 */
export function getRepo(args: GetRepoArgs, opts?: pulumi.InvokeOptions): Promise<GetRepoResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getRepo:getRepo", {
        "defaultBranch": args.defaultBranch,
        "description": args.description,
        "gitIgnore": args.gitIgnore,
        "identifier": args.identifier,
        "license": args.license,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "readme": args.readme,
        "sources": args.sources,
    }, opts);
}

/**
 * A collection of arguments for invoking getRepo.
 */
export interface GetRepoArgs {
    /**
     * Default branch of the repository (Applicate only for create).
     */
    defaultBranch?: string;
    /**
     * Description of the repository.
     */
    description?: string;
    /**
     * Repository should be created with specified predefined gitignore file.
     */
    gitIgnore?: string;
    /**
     * Identifier of the repository.
     */
    identifier: string;
    /**
     * Repository should be created with specified predefined license file.
     */
    license?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
    /**
     * Repository should be created with readme file.
     */
    readme?: boolean;
    /**
     * Configuration for importing an existing repository from SCM provider.
     */
    sources?: inputs.platform.GetRepoSource[];
}

/**
 * A collection of values returned by getRepo.
 */
export interface GetRepoResult {
    /**
     * Timestamp when the repository was created.
     */
    readonly created: number;
    /**
     * ID of the user who created the repository.
     */
    readonly createdBy: number;
    /**
     * Default branch of the repository (Applicate only for create).
     */
    readonly defaultBranch?: string;
    /**
     * Description of the repository.
     */
    readonly description?: string;
    /**
     * Repository should be created with specified predefined gitignore file.
     */
    readonly gitIgnore?: string;
    /**
     * Git URL of the repository.
     */
    readonly gitUrl: string;
    /**
     * Internal ID of the repository.
     */
    readonly id: string;
    /**
     * Identifier of the repository.
     */
    readonly identifier: string;
    /**
     * Repository should be created with specified predefined license file.
     */
    readonly license?: string;
    /**
     * Name of the repository.
     */
    readonly name: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Path of the repository.
     */
    readonly path: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Repository should be created with readme file.
     */
    readonly readme?: boolean;
    /**
     * Configuration for importing an existing repository from SCM provider.
     */
    readonly sources?: outputs.platform.GetRepoSource[];
    /**
     * Timestamp when the repository was last updated.
     */
    readonly updated: number;
}
/**
 * Data source for retrieving a Harness repo.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const exampleByIdentifier = harness.platform.getRepo({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "proj_id",
 * });
 * ```
 */
export function getRepoOutput(args: GetRepoOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRepoResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:platform/getRepo:getRepo", {
        "defaultBranch": args.defaultBranch,
        "description": args.description,
        "gitIgnore": args.gitIgnore,
        "identifier": args.identifier,
        "license": args.license,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "readme": args.readme,
        "sources": args.sources,
    }, opts);
}

/**
 * A collection of arguments for invoking getRepo.
 */
export interface GetRepoOutputArgs {
    /**
     * Default branch of the repository (Applicate only for create).
     */
    defaultBranch?: pulumi.Input<string>;
    /**
     * Description of the repository.
     */
    description?: pulumi.Input<string>;
    /**
     * Repository should be created with specified predefined gitignore file.
     */
    gitIgnore?: pulumi.Input<string>;
    /**
     * Identifier of the repository.
     */
    identifier: pulumi.Input<string>;
    /**
     * Repository should be created with specified predefined license file.
     */
    license?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Repository should be created with readme file.
     */
    readme?: pulumi.Input<boolean>;
    /**
     * Configuration for importing an existing repository from SCM provider.
     */
    sources?: pulumi.Input<pulumi.Input<inputs.platform.GetRepoSourceArgs>[]>;
}
