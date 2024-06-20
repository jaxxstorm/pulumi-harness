// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Resource for creating am infrastructure definition. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * // Creating a Kubernetes infrastructure definition
 * const dev = new harness.cloudprovider.Kubernetes("dev", {
 *     name: "k8s-dev",
 *     authentication: {
 *         delegateSelectors: ["k8s"],
 *     },
 * });
 * const example = new harness.Application("example", {name: "example"});
 * const devEnvironment = new harness.Environment("dev", {
 *     name: "dev",
 *     appId: example.id,
 *     type: "NON_PROD",
 * });
 * // Creating a infrastructure of type KUBERNETES
 * const k8s = new harness.InfrastructureDefinition("k8s", {
 *     name: "k8s-eks-us-east-1",
 *     appId: example.id,
 *     envId: devEnvironment.id,
 *     cloudProviderType: "KUBERNETES_CLUSTER",
 *     deploymentType: "KUBERNETES",
 *     kubernetes: {
 *         cloudProviderName: dev.name,
 *         namespace: "dev",
 *         releaseName: "${service.name}",
 *     },
 * });
 * // Creating a Deployment Template for CUSTOM infrastructure type
 * const exampleYaml = new harness.YamlConfig("example_yaml", {
 *     path: "Setup/Template Library/Example Folder/deployment_template.yaml",
 *     content: `harnessApiVersion: '1.0'
 * type: CUSTOM_DEPLOYMENT_TYPE
 * fetchInstanceScript: |-
 *   set -ex
 *   curl http://\${url}/\${file_name} > \${INSTANCE_OUTPUT_PATH}
 * hostAttributes:
 *   hostname: host
 * hostObjectArrayPath: hosts
 * variables:
 * - name: url
 * - name: file_name
 * `,
 * });
 * // Creating a infrastructure of type CUSTOM
 * const custom = new harness.InfrastructureDefinition("custom", {
 *     name: "custom-infra",
 *     appId: example.id,
 *     envId: devEnvironment.id,
 *     cloudProviderType: "CUSTOM",
 *     deploymentType: "CUSTOM",
 *     deploymentTemplateUri: pulumi.interpolate`Example Folder/${exampleYaml.name}`,
 *     custom: {
 *         deploymentTypeTemplateVersion: "1",
 *         variables: [
 *             {
 *                 name: "url",
 *                 value: "localhost:8081",
 *             },
 *             {
 *                 name: "file_name",
 *                 value: "instances.json",
 *             },
 *         ],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Import using the Harness application id, environment id, and infrastructure definition id
 *
 * ```sh
 * $ pulumi import harness:index/infrastructureDefinition:InfrastructureDefinition example <app_id>/<env_id>/<infradef_id>
 * ```
 */
export class InfrastructureDefinition extends pulumi.CustomResource {
    /**
     * Get an existing InfrastructureDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InfrastructureDefinitionState, opts?: pulumi.CustomResourceOptions): InfrastructureDefinition {
        return new InfrastructureDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/infrastructureDefinition:InfrastructureDefinition';

    /**
     * Returns true if the given object is an instance of InfrastructureDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InfrastructureDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InfrastructureDefinition.__pulumiType;
    }

    /**
     * The id of the application the infrastructure definition belongs to.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The configuration details for Aws AMI deployments.
     */
    public readonly awsAmi!: pulumi.Output<outputs.InfrastructureDefinitionAwsAmi | undefined>;
    /**
     * The configuration details for Aws AMI deployments.
     */
    public readonly awsEcs!: pulumi.Output<outputs.InfrastructureDefinitionAwsEcs | undefined>;
    /**
     * The configuration details for Aws Lambda deployments.
     */
    public readonly awsLambda!: pulumi.Output<outputs.InfrastructureDefinitionAwsLambda | undefined>;
    /**
     * The configuration details for AWS SSH deployments.
     */
    public readonly awsSsh!: pulumi.Output<outputs.InfrastructureDefinitionAwsSsh | undefined>;
    /**
     * The configuration details for AWS WinRM deployments.
     */
    public readonly awsWinrm!: pulumi.Output<outputs.InfrastructureDefinitionAwsWinrm | undefined>;
    /**
     * The configuration details for Azure VMSS deployments.
     */
    public readonly azureVmss!: pulumi.Output<outputs.InfrastructureDefinitionAzureVmss | undefined>;
    /**
     * The configuration details for Azure WebApp deployments.
     */
    public readonly azureWebapp!: pulumi.Output<outputs.InfrastructureDefinitionAzureWebapp | undefined>;
    /**
     * The type of the cloud provider to connect with. Valid options are AWS, AZURE, CUSTOM, PHYSICAL*DATA*CENTER, KUBERNETES*CLUSTER, PCF, SPOT*INST
     */
    public readonly cloudProviderType!: pulumi.Output<string>;
    /**
     * The configuration details for Custom deployments.
     */
    public readonly custom!: pulumi.Output<outputs.InfrastructureDefinitionCustom | undefined>;
    /**
     * The configuration details for SSH datacenter deployments.
     */
    public readonly datacenterSsh!: pulumi.Output<outputs.InfrastructureDefinitionDatacenterSsh | undefined>;
    /**
     * The configuration details for WinRM datacenter deployments.
     */
    public readonly datacenterWinrm!: pulumi.Output<outputs.InfrastructureDefinitionDatacenterWinrm | undefined>;
    /**
     * The URI of the deployment template to use. Only used if deploymentType is `CUSTOM`.
     */
    public readonly deploymentTemplateUri!: pulumi.Output<string | undefined>;
    /**
     * The type of the deployment to use. Valid options are AMI, AWS*CODEDEPLOY, AWS*LAMBDA, AZURE*VMSS, AZURE*WEBAPP, CUSTOM, ECS, HELM, KUBERNETES, PCF, SSH, WINRM
     */
    public readonly deploymentType!: pulumi.Output<string>;
    /**
     * The id of the environment the infrastructure definition belongs to.
     */
    public readonly envId!: pulumi.Output<string>;
    /**
     * The configuration details for Kubernetes deployments.
     */
    public readonly kubernetes!: pulumi.Output<outputs.InfrastructureDefinitionKubernetes | undefined>;
    /**
     * The configuration details for Kubernetes on GCP deployments.
     */
    public readonly kubernetesGcp!: pulumi.Output<outputs.InfrastructureDefinitionKubernetesGcp | undefined>;
    /**
     * The name of the infrastructure definition
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the infrastructure provisioner to use.
     */
    public readonly provisionerName!: pulumi.Output<string | undefined>;
    /**
     * The list of service names to scope this infrastructure definition to.
     */
    public readonly scopedServices!: pulumi.Output<string[] | undefined>;
    /**
     * The configuration details for PCF deployments.
     */
    public readonly tanzu!: pulumi.Output<outputs.InfrastructureDefinitionTanzu | undefined>;

    /**
     * Create a InfrastructureDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InfrastructureDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InfrastructureDefinitionArgs | InfrastructureDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InfrastructureDefinitionState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["awsAmi"] = state ? state.awsAmi : undefined;
            resourceInputs["awsEcs"] = state ? state.awsEcs : undefined;
            resourceInputs["awsLambda"] = state ? state.awsLambda : undefined;
            resourceInputs["awsSsh"] = state ? state.awsSsh : undefined;
            resourceInputs["awsWinrm"] = state ? state.awsWinrm : undefined;
            resourceInputs["azureVmss"] = state ? state.azureVmss : undefined;
            resourceInputs["azureWebapp"] = state ? state.azureWebapp : undefined;
            resourceInputs["cloudProviderType"] = state ? state.cloudProviderType : undefined;
            resourceInputs["custom"] = state ? state.custom : undefined;
            resourceInputs["datacenterSsh"] = state ? state.datacenterSsh : undefined;
            resourceInputs["datacenterWinrm"] = state ? state.datacenterWinrm : undefined;
            resourceInputs["deploymentTemplateUri"] = state ? state.deploymentTemplateUri : undefined;
            resourceInputs["deploymentType"] = state ? state.deploymentType : undefined;
            resourceInputs["envId"] = state ? state.envId : undefined;
            resourceInputs["kubernetes"] = state ? state.kubernetes : undefined;
            resourceInputs["kubernetesGcp"] = state ? state.kubernetesGcp : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["provisionerName"] = state ? state.provisionerName : undefined;
            resourceInputs["scopedServices"] = state ? state.scopedServices : undefined;
            resourceInputs["tanzu"] = state ? state.tanzu : undefined;
        } else {
            const args = argsOrState as InfrastructureDefinitionArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            if ((!args || args.cloudProviderType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloudProviderType'");
            }
            if ((!args || args.deploymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deploymentType'");
            }
            if ((!args || args.envId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'envId'");
            }
            resourceInputs["appId"] = args ? args.appId : undefined;
            resourceInputs["awsAmi"] = args ? args.awsAmi : undefined;
            resourceInputs["awsEcs"] = args ? args.awsEcs : undefined;
            resourceInputs["awsLambda"] = args ? args.awsLambda : undefined;
            resourceInputs["awsSsh"] = args ? args.awsSsh : undefined;
            resourceInputs["awsWinrm"] = args ? args.awsWinrm : undefined;
            resourceInputs["azureVmss"] = args ? args.azureVmss : undefined;
            resourceInputs["azureWebapp"] = args ? args.azureWebapp : undefined;
            resourceInputs["cloudProviderType"] = args ? args.cloudProviderType : undefined;
            resourceInputs["custom"] = args ? args.custom : undefined;
            resourceInputs["datacenterSsh"] = args ? args.datacenterSsh : undefined;
            resourceInputs["datacenterWinrm"] = args ? args.datacenterWinrm : undefined;
            resourceInputs["deploymentTemplateUri"] = args ? args.deploymentTemplateUri : undefined;
            resourceInputs["deploymentType"] = args ? args.deploymentType : undefined;
            resourceInputs["envId"] = args ? args.envId : undefined;
            resourceInputs["kubernetes"] = args ? args.kubernetes : undefined;
            resourceInputs["kubernetesGcp"] = args ? args.kubernetesGcp : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["provisionerName"] = args ? args.provisionerName : undefined;
            resourceInputs["scopedServices"] = args ? args.scopedServices : undefined;
            resourceInputs["tanzu"] = args ? args.tanzu : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InfrastructureDefinition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InfrastructureDefinition resources.
 */
export interface InfrastructureDefinitionState {
    /**
     * The id of the application the infrastructure definition belongs to.
     */
    appId?: pulumi.Input<string>;
    /**
     * The configuration details for Aws AMI deployments.
     */
    awsAmi?: pulumi.Input<inputs.InfrastructureDefinitionAwsAmi>;
    /**
     * The configuration details for Aws AMI deployments.
     */
    awsEcs?: pulumi.Input<inputs.InfrastructureDefinitionAwsEcs>;
    /**
     * The configuration details for Aws Lambda deployments.
     */
    awsLambda?: pulumi.Input<inputs.InfrastructureDefinitionAwsLambda>;
    /**
     * The configuration details for AWS SSH deployments.
     */
    awsSsh?: pulumi.Input<inputs.InfrastructureDefinitionAwsSsh>;
    /**
     * The configuration details for AWS WinRM deployments.
     */
    awsWinrm?: pulumi.Input<inputs.InfrastructureDefinitionAwsWinrm>;
    /**
     * The configuration details for Azure VMSS deployments.
     */
    azureVmss?: pulumi.Input<inputs.InfrastructureDefinitionAzureVmss>;
    /**
     * The configuration details for Azure WebApp deployments.
     */
    azureWebapp?: pulumi.Input<inputs.InfrastructureDefinitionAzureWebapp>;
    /**
     * The type of the cloud provider to connect with. Valid options are AWS, AZURE, CUSTOM, PHYSICAL*DATA*CENTER, KUBERNETES*CLUSTER, PCF, SPOT*INST
     */
    cloudProviderType?: pulumi.Input<string>;
    /**
     * The configuration details for Custom deployments.
     */
    custom?: pulumi.Input<inputs.InfrastructureDefinitionCustom>;
    /**
     * The configuration details for SSH datacenter deployments.
     */
    datacenterSsh?: pulumi.Input<inputs.InfrastructureDefinitionDatacenterSsh>;
    /**
     * The configuration details for WinRM datacenter deployments.
     */
    datacenterWinrm?: pulumi.Input<inputs.InfrastructureDefinitionDatacenterWinrm>;
    /**
     * The URI of the deployment template to use. Only used if deploymentType is `CUSTOM`.
     */
    deploymentTemplateUri?: pulumi.Input<string>;
    /**
     * The type of the deployment to use. Valid options are AMI, AWS*CODEDEPLOY, AWS*LAMBDA, AZURE*VMSS, AZURE*WEBAPP, CUSTOM, ECS, HELM, KUBERNETES, PCF, SSH, WINRM
     */
    deploymentType?: pulumi.Input<string>;
    /**
     * The id of the environment the infrastructure definition belongs to.
     */
    envId?: pulumi.Input<string>;
    /**
     * The configuration details for Kubernetes deployments.
     */
    kubernetes?: pulumi.Input<inputs.InfrastructureDefinitionKubernetes>;
    /**
     * The configuration details for Kubernetes on GCP deployments.
     */
    kubernetesGcp?: pulumi.Input<inputs.InfrastructureDefinitionKubernetesGcp>;
    /**
     * The name of the infrastructure definition
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the infrastructure provisioner to use.
     */
    provisionerName?: pulumi.Input<string>;
    /**
     * The list of service names to scope this infrastructure definition to.
     */
    scopedServices?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The configuration details for PCF deployments.
     */
    tanzu?: pulumi.Input<inputs.InfrastructureDefinitionTanzu>;
}

/**
 * The set of arguments for constructing a InfrastructureDefinition resource.
 */
export interface InfrastructureDefinitionArgs {
    /**
     * The id of the application the infrastructure definition belongs to.
     */
    appId: pulumi.Input<string>;
    /**
     * The configuration details for Aws AMI deployments.
     */
    awsAmi?: pulumi.Input<inputs.InfrastructureDefinitionAwsAmi>;
    /**
     * The configuration details for Aws AMI deployments.
     */
    awsEcs?: pulumi.Input<inputs.InfrastructureDefinitionAwsEcs>;
    /**
     * The configuration details for Aws Lambda deployments.
     */
    awsLambda?: pulumi.Input<inputs.InfrastructureDefinitionAwsLambda>;
    /**
     * The configuration details for AWS SSH deployments.
     */
    awsSsh?: pulumi.Input<inputs.InfrastructureDefinitionAwsSsh>;
    /**
     * The configuration details for AWS WinRM deployments.
     */
    awsWinrm?: pulumi.Input<inputs.InfrastructureDefinitionAwsWinrm>;
    /**
     * The configuration details for Azure VMSS deployments.
     */
    azureVmss?: pulumi.Input<inputs.InfrastructureDefinitionAzureVmss>;
    /**
     * The configuration details for Azure WebApp deployments.
     */
    azureWebapp?: pulumi.Input<inputs.InfrastructureDefinitionAzureWebapp>;
    /**
     * The type of the cloud provider to connect with. Valid options are AWS, AZURE, CUSTOM, PHYSICAL*DATA*CENTER, KUBERNETES*CLUSTER, PCF, SPOT*INST
     */
    cloudProviderType: pulumi.Input<string>;
    /**
     * The configuration details for Custom deployments.
     */
    custom?: pulumi.Input<inputs.InfrastructureDefinitionCustom>;
    /**
     * The configuration details for SSH datacenter deployments.
     */
    datacenterSsh?: pulumi.Input<inputs.InfrastructureDefinitionDatacenterSsh>;
    /**
     * The configuration details for WinRM datacenter deployments.
     */
    datacenterWinrm?: pulumi.Input<inputs.InfrastructureDefinitionDatacenterWinrm>;
    /**
     * The URI of the deployment template to use. Only used if deploymentType is `CUSTOM`.
     */
    deploymentTemplateUri?: pulumi.Input<string>;
    /**
     * The type of the deployment to use. Valid options are AMI, AWS*CODEDEPLOY, AWS*LAMBDA, AZURE*VMSS, AZURE*WEBAPP, CUSTOM, ECS, HELM, KUBERNETES, PCF, SSH, WINRM
     */
    deploymentType: pulumi.Input<string>;
    /**
     * The id of the environment the infrastructure definition belongs to.
     */
    envId: pulumi.Input<string>;
    /**
     * The configuration details for Kubernetes deployments.
     */
    kubernetes?: pulumi.Input<inputs.InfrastructureDefinitionKubernetes>;
    /**
     * The configuration details for Kubernetes on GCP deployments.
     */
    kubernetesGcp?: pulumi.Input<inputs.InfrastructureDefinitionKubernetesGcp>;
    /**
     * The name of the infrastructure definition
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the infrastructure provisioner to use.
     */
    provisionerName?: pulumi.Input<string>;
    /**
     * The list of service names to scope this infrastructure definition to.
     */
    scopedServices?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The configuration details for PCF deployments.
     */
    tanzu?: pulumi.Input<inputs.InfrastructureDefinitionTanzu>;
}
