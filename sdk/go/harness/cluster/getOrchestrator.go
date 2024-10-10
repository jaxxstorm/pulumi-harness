// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cluster

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness ClusterOrchestrator.
func LookupOrchestrator(ctx *pulumi.Context, args *LookupOrchestratorArgs, opts ...pulumi.InvokeOption) (*LookupOrchestratorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupOrchestratorResult
	err := ctx.Invoke("harness:cluster/getOrchestrator:getOrchestrator", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrchestrator.
type LookupOrchestratorArgs struct {
	// Endpoint of the k8s cluster being onboarded under the orchestrator
	ClusterEndpoint string `pulumi:"clusterEndpoint"`
	// ID of the Harness Kubernetes Connector Being used
	K8sConnectorId *string `pulumi:"k8sConnectorId"`
	// Name of the Orchestrator
	Name string `pulumi:"name"`
}

// A collection of values returned by getOrchestrator.
type LookupOrchestratorResult struct {
	// Endpoint of the k8s cluster being onboarded under the orchestrator
	ClusterEndpoint string `pulumi:"clusterEndpoint"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// ID of the Harness Kubernetes Connector Being used
	K8sConnectorId *string `pulumi:"k8sConnectorId"`
	// Name of the Orchestrator
	Name string `pulumi:"name"`
}

func LookupOrchestratorOutput(ctx *pulumi.Context, args LookupOrchestratorOutputArgs, opts ...pulumi.InvokeOption) LookupOrchestratorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOrchestratorResultOutput, error) {
			args := v.(LookupOrchestratorArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupOrchestratorResult
			secret, err := ctx.InvokePackageRaw("harness:cluster/getOrchestrator:getOrchestrator", args, &rv, "", opts...)
			if err != nil {
				return LookupOrchestratorResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupOrchestratorResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupOrchestratorResultOutput), nil
			}
			return output, nil
		}).(LookupOrchestratorResultOutput)
}

// A collection of arguments for invoking getOrchestrator.
type LookupOrchestratorOutputArgs struct {
	// Endpoint of the k8s cluster being onboarded under the orchestrator
	ClusterEndpoint pulumi.StringInput `pulumi:"clusterEndpoint"`
	// ID of the Harness Kubernetes Connector Being used
	K8sConnectorId pulumi.StringPtrInput `pulumi:"k8sConnectorId"`
	// Name of the Orchestrator
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupOrchestratorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrchestratorArgs)(nil)).Elem()
}

// A collection of values returned by getOrchestrator.
type LookupOrchestratorResultOutput struct{ *pulumi.OutputState }

func (LookupOrchestratorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrchestratorResult)(nil)).Elem()
}

func (o LookupOrchestratorResultOutput) ToLookupOrchestratorResultOutput() LookupOrchestratorResultOutput {
	return o
}

func (o LookupOrchestratorResultOutput) ToLookupOrchestratorResultOutputWithContext(ctx context.Context) LookupOrchestratorResultOutput {
	return o
}

// Endpoint of the k8s cluster being onboarded under the orchestrator
func (o LookupOrchestratorResultOutput) ClusterEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrchestratorResult) string { return v.ClusterEndpoint }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOrchestratorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrchestratorResult) string { return v.Id }).(pulumi.StringOutput)
}

// ID of the Harness Kubernetes Connector Being used
func (o LookupOrchestratorResultOutput) K8sConnectorId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupOrchestratorResult) *string { return v.K8sConnectorId }).(pulumi.StringPtrOutput)
}

// Name of the Orchestrator
func (o LookupOrchestratorResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrchestratorResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrchestratorResultOutput{})
}
