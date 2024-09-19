// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source for retrieving a Harness application
 */
export function getGitConnector(args?: GetGitConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetGitConnectorResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:index/getGitConnector:getGitConnector", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitConnector.
 */
export interface GetGitConnectorArgs {
    /**
     * Id of the git connector.
     */
    id?: string;
    /**
     * The name of the git connector.
     */
    name?: string;
}

/**
 * A collection of values returned by getGitConnector.
 */
export interface GetGitConnectorResult {
    /**
     * The branch of the git connector to use.
     */
    readonly branch: string;
    /**
     * Custom details to use when making commits using this git connector.
     */
    readonly commitDetails: outputs.GetGitConnectorCommitDetail[];
    /**
     * The time the git connector was created.
     */
    readonly createdAt: string;
    /**
     * Delegate selectors to apply to this git connector.
     */
    readonly delegateSelectors: string[];
    /**
     * Boolean indicating whether or not to generate a webhook url.
     */
    readonly generateWebhookUrl: boolean;
    /**
     * Id of the git connector.
     */
    readonly id?: string;
    /**
     * The name of the git connector.
     */
    readonly name?: string;
    /**
     * The id of the secret for connecting to the git repository.
     */
    readonly passwordSecretId: string;
    /**
     * The id of the SSH secret to use.
     */
    readonly sshSettingId: string;
    /**
     * The URL of the git repository or account/organization.
     */
    readonly url: string;
    /**
     * The type of git url being used. Options are `ACCOUNT`, and `REPO`.
     */
    readonly urlType: string;
    /**
     * The name of the user used to connect to the git repository.
     */
    readonly username: string;
    /**
     * The generated webhook url.
     */
    readonly webhookUrl: string;
}
/**
 * Data source for retrieving a Harness application
 */
export function getGitConnectorOutput(args?: GetGitConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGitConnectorResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("harness:index/getGitConnector:getGitConnector", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitConnector.
 */
export interface GetGitConnectorOutputArgs {
    /**
     * Id of the git connector.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the git connector.
     */
    name?: pulumi.Input<string>;
}
