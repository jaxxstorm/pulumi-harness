// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.InfrastructureDefinitionArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.InfrastructureDefinitionState;
import com.pulumi.harness.outputs.InfrastructureDefinitionAwsAmi;
import com.pulumi.harness.outputs.InfrastructureDefinitionAwsEcs;
import com.pulumi.harness.outputs.InfrastructureDefinitionAwsLambda;
import com.pulumi.harness.outputs.InfrastructureDefinitionAwsSsh;
import com.pulumi.harness.outputs.InfrastructureDefinitionAwsWinrm;
import com.pulumi.harness.outputs.InfrastructureDefinitionAzureVmss;
import com.pulumi.harness.outputs.InfrastructureDefinitionAzureWebapp;
import com.pulumi.harness.outputs.InfrastructureDefinitionCustom;
import com.pulumi.harness.outputs.InfrastructureDefinitionDatacenterSsh;
import com.pulumi.harness.outputs.InfrastructureDefinitionDatacenterWinrm;
import com.pulumi.harness.outputs.InfrastructureDefinitionKubernetes;
import com.pulumi.harness.outputs.InfrastructureDefinitionKubernetesGcp;
import com.pulumi.harness.outputs.InfrastructureDefinitionTanzu;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating am infrastructure definition. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.cloudprovider.Kubernetes;
 * import com.pulumi.harness.cloudprovider.KubernetesArgs;
 * import com.pulumi.harness.cloudprovider.inputs.KubernetesAuthenticationArgs;
 * import com.pulumi.harness.Application;
 * import com.pulumi.harness.Environment;
 * import com.pulumi.harness.EnvironmentArgs;
 * import com.pulumi.harness.InfrastructureDefinition;
 * import com.pulumi.harness.InfrastructureDefinitionArgs;
 * import com.pulumi.harness.inputs.InfrastructureDefinitionKubernetesArgs;
 * import com.pulumi.harness.YamlConfig;
 * import com.pulumi.harness.YamlConfigArgs;
 * import com.pulumi.harness.inputs.InfrastructureDefinitionCustomArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var devKubernetes = new Kubernetes(&#34;devKubernetes&#34;, KubernetesArgs.builder()        
 *             .authentication(KubernetesAuthenticationArgs.builder()
 *                 .delegateSelectors(&#34;k8s&#34;)
 *                 .build())
 *             .build());
 * 
 *         var example = new Application(&#34;example&#34;);
 * 
 *         var devEnvironment = new Environment(&#34;devEnvironment&#34;, EnvironmentArgs.builder()        
 *             .appId(example.id())
 *             .type(&#34;NON_PROD&#34;)
 *             .build());
 * 
 *         var k8s = new InfrastructureDefinition(&#34;k8s&#34;, InfrastructureDefinitionArgs.builder()        
 *             .appId(example.id())
 *             .envId(devEnvironment.id())
 *             .cloudProviderType(&#34;KUBERNETES_CLUSTER&#34;)
 *             .deploymentType(&#34;KUBERNETES&#34;)
 *             .kubernetes(InfrastructureDefinitionKubernetesArgs.builder()
 *                 .cloudProviderName(devKubernetes.name())
 *                 .namespace(&#34;dev&#34;)
 *                 .releaseName(&#34;${service.name}&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleYaml = new YamlConfig(&#34;exampleYaml&#34;, YamlConfigArgs.builder()        
 *             .path(&#34;Setup/Template Library/Example Folder/deployment_template.yaml&#34;)
 *             .content(&#34;&#34;&#34;
 * harnessApiVersion: &#39;1.0&#39;
 * type: CUSTOM_DEPLOYMENT_TYPE
 * fetchInstanceScript: |-
 *   set -ex
 *   curl http://%s/%s &gt; %s
 * hostAttributes:
 *   hostname: host
 * hostObjectArrayPath: hosts
 * variables:
 * - name: url
 * - name: file_name
 * &#34;, url,file_name,INSTANCE_OUTPUT_PATH))
 *             .build());
 * 
 *         var custom = new InfrastructureDefinition(&#34;custom&#34;, InfrastructureDefinitionArgs.builder()        
 *             .appId(example.id())
 *             .envId(devEnvironment.id())
 *             .cloudProviderType(&#34;CUSTOM&#34;)
 *             .deploymentType(&#34;CUSTOM&#34;)
 *             .deploymentTemplateUri(exampleYaml.name().applyValue(name -&gt; String.format(&#34;Example Folder/%s&#34;, name)))
 *             .custom(InfrastructureDefinitionCustomArgs.builder()
 *                 .deploymentTypeTemplateVersion(&#34;1&#34;)
 *                 .variables(                
 *                     InfrastructureDefinitionCustomVariableArgs.builder()
 *                         .name(&#34;url&#34;)
 *                         .value(&#34;localhost:8081&#34;)
 *                         .build(),
 *                     InfrastructureDefinitionCustomVariableArgs.builder()
 *                         .name(&#34;file_name&#34;)
 *                         .value(&#34;instances.json&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using the Harness application id, environment id, and infrastructure definition id
 * 
 * ```sh
 *  $ pulumi import harness:index/infrastructureDefinition:InfrastructureDefinition example &lt;app_id&gt;/&lt;env_id&gt;/&lt;infradef_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:index/infrastructureDefinition:InfrastructureDefinition")
public class InfrastructureDefinition extends com.pulumi.resources.CustomResource {
    /**
     * The id of the application the infrastructure definition belongs to.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The id of the application the infrastructure definition belongs to.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The configuration details for Aws AMI deployments.
     * 
     */
    @Export(name="awsAmi", refs={InfrastructureDefinitionAwsAmi.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionAwsAmi> awsAmi;

    /**
     * @return The configuration details for Aws AMI deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionAwsAmi>> awsAmi() {
        return Codegen.optional(this.awsAmi);
    }
    /**
     * The configuration details for Aws AMI deployments.
     * 
     */
    @Export(name="awsEcs", refs={InfrastructureDefinitionAwsEcs.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionAwsEcs> awsEcs;

    /**
     * @return The configuration details for Aws AMI deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionAwsEcs>> awsEcs() {
        return Codegen.optional(this.awsEcs);
    }
    /**
     * The configuration details for Aws Lambda deployments.
     * 
     */
    @Export(name="awsLambda", refs={InfrastructureDefinitionAwsLambda.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionAwsLambda> awsLambda;

    /**
     * @return The configuration details for Aws Lambda deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionAwsLambda>> awsLambda() {
        return Codegen.optional(this.awsLambda);
    }
    /**
     * The configuration details for AWS SSH deployments.
     * 
     */
    @Export(name="awsSsh", refs={InfrastructureDefinitionAwsSsh.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionAwsSsh> awsSsh;

    /**
     * @return The configuration details for AWS SSH deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionAwsSsh>> awsSsh() {
        return Codegen.optional(this.awsSsh);
    }
    /**
     * The configuration details for AWS WinRM deployments.
     * 
     */
    @Export(name="awsWinrm", refs={InfrastructureDefinitionAwsWinrm.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionAwsWinrm> awsWinrm;

    /**
     * @return The configuration details for AWS WinRM deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionAwsWinrm>> awsWinrm() {
        return Codegen.optional(this.awsWinrm);
    }
    /**
     * The configuration details for Azure VMSS deployments.
     * 
     */
    @Export(name="azureVmss", refs={InfrastructureDefinitionAzureVmss.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionAzureVmss> azureVmss;

    /**
     * @return The configuration details for Azure VMSS deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionAzureVmss>> azureVmss() {
        return Codegen.optional(this.azureVmss);
    }
    /**
     * The configuration details for Azure WebApp deployments.
     * 
     */
    @Export(name="azureWebapp", refs={InfrastructureDefinitionAzureWebapp.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionAzureWebapp> azureWebapp;

    /**
     * @return The configuration details for Azure WebApp deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionAzureWebapp>> azureWebapp() {
        return Codegen.optional(this.azureWebapp);
    }
    /**
     * The type of the cloud provider to connect with. Valid options are AWS, AZURE, CUSTOM, PHYSICAL*DATA*CENTER, KUBERNETES*CLUSTER, PCF, SPOT*INST
     * 
     */
    @Export(name="cloudProviderType", refs={String.class}, tree="[0]")
    private Output<String> cloudProviderType;

    /**
     * @return The type of the cloud provider to connect with. Valid options are AWS, AZURE, CUSTOM, PHYSICAL*DATA*CENTER, KUBERNETES*CLUSTER, PCF, SPOT*INST
     * 
     */
    public Output<String> cloudProviderType() {
        return this.cloudProviderType;
    }
    /**
     * The configuration details for Custom deployments.
     * 
     */
    @Export(name="custom", refs={InfrastructureDefinitionCustom.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionCustom> custom;

    /**
     * @return The configuration details for Custom deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionCustom>> custom() {
        return Codegen.optional(this.custom);
    }
    /**
     * The configuration details for SSH datacenter deployments.
     * 
     */
    @Export(name="datacenterSsh", refs={InfrastructureDefinitionDatacenterSsh.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionDatacenterSsh> datacenterSsh;

    /**
     * @return The configuration details for SSH datacenter deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionDatacenterSsh>> datacenterSsh() {
        return Codegen.optional(this.datacenterSsh);
    }
    /**
     * The configuration details for WinRM datacenter deployments.
     * 
     */
    @Export(name="datacenterWinrm", refs={InfrastructureDefinitionDatacenterWinrm.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionDatacenterWinrm> datacenterWinrm;

    /**
     * @return The configuration details for WinRM datacenter deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionDatacenterWinrm>> datacenterWinrm() {
        return Codegen.optional(this.datacenterWinrm);
    }
    /**
     * The URI of the deployment template to use. Only used if deployment_type is `CUSTOM`.
     * 
     */
    @Export(name="deploymentTemplateUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deploymentTemplateUri;

    /**
     * @return The URI of the deployment template to use. Only used if deployment_type is `CUSTOM`.
     * 
     */
    public Output<Optional<String>> deploymentTemplateUri() {
        return Codegen.optional(this.deploymentTemplateUri);
    }
    /**
     * The type of the deployment to use. Valid options are AMI, AWS*CODEDEPLOY, AWS*LAMBDA, AZURE*VMSS, AZURE*WEBAPP, CUSTOM, ECS, HELM, KUBERNETES, PCF, SSH, WINRM
     * 
     */
    @Export(name="deploymentType", refs={String.class}, tree="[0]")
    private Output<String> deploymentType;

    /**
     * @return The type of the deployment to use. Valid options are AMI, AWS*CODEDEPLOY, AWS*LAMBDA, AZURE*VMSS, AZURE*WEBAPP, CUSTOM, ECS, HELM, KUBERNETES, PCF, SSH, WINRM
     * 
     */
    public Output<String> deploymentType() {
        return this.deploymentType;
    }
    /**
     * The id of the environment the infrastructure definition belongs to.
     * 
     */
    @Export(name="envId", refs={String.class}, tree="[0]")
    private Output<String> envId;

    /**
     * @return The id of the environment the infrastructure definition belongs to.
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }
    /**
     * The configuration details for Kubernetes deployments.
     * 
     */
    @Export(name="kubernetes", refs={InfrastructureDefinitionKubernetes.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionKubernetes> kubernetes;

    /**
     * @return The configuration details for Kubernetes deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionKubernetes>> kubernetes() {
        return Codegen.optional(this.kubernetes);
    }
    /**
     * The configuration details for Kubernetes on GCP deployments.
     * 
     */
    @Export(name="kubernetesGcp", refs={InfrastructureDefinitionKubernetesGcp.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionKubernetesGcp> kubernetesGcp;

    /**
     * @return The configuration details for Kubernetes on GCP deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionKubernetesGcp>> kubernetesGcp() {
        return Codegen.optional(this.kubernetesGcp);
    }
    /**
     * The name of the infrastructure definition
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the infrastructure definition
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the infrastructure provisioner to use.
     * 
     */
    @Export(name="provisionerName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> provisionerName;

    /**
     * @return The name of the infrastructure provisioner to use.
     * 
     */
    public Output<Optional<String>> provisionerName() {
        return Codegen.optional(this.provisionerName);
    }
    /**
     * The list of service names to scope this infrastructure definition to.
     * 
     */
    @Export(name="scopedServices", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> scopedServices;

    /**
     * @return The list of service names to scope this infrastructure definition to.
     * 
     */
    public Output<Optional<List<String>>> scopedServices() {
        return Codegen.optional(this.scopedServices);
    }
    /**
     * The configuration details for PCF deployments.
     * 
     */
    @Export(name="tanzu", refs={InfrastructureDefinitionTanzu.class}, tree="[0]")
    private Output</* @Nullable */ InfrastructureDefinitionTanzu> tanzu;

    /**
     * @return The configuration details for PCF deployments.
     * 
     */
    public Output<Optional<InfrastructureDefinitionTanzu>> tanzu() {
        return Codegen.optional(this.tanzu);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InfrastructureDefinition(String name) {
        this(name, InfrastructureDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InfrastructureDefinition(String name, InfrastructureDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InfrastructureDefinition(String name, InfrastructureDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/infrastructureDefinition:InfrastructureDefinition", name, args == null ? InfrastructureDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InfrastructureDefinition(String name, Output<String> id, @Nullable InfrastructureDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/infrastructureDefinition:InfrastructureDefinition", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InfrastructureDefinition get(String name, Output<String> id, @Nullable InfrastructureDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InfrastructureDefinition(name, id, state, options);
    }
}
