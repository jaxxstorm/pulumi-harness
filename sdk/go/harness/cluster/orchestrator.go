// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cluster

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating ClusterOrchestrators.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/cluster"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cluster.NewOrchestrator(ctx, "test", &cluster.OrchestratorArgs{
//				Name:            pulumi.String("name"),
//				ClusterEndpoint: pulumi.String("http://test.test.com"),
//				K8sConnectorId:  pulumi.String("test"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Import using the Harness aws cloud provider id.
//
// ```sh
// $ pulumi import harness:cluster/orchestrator:Orchestrator example <provider_id>
// ```
type Orchestrator struct {
	pulumi.CustomResourceState

	// Endpoint of the k8s cluster being onboarded under the orchestrator
	ClusterEndpoint pulumi.StringOutput `pulumi:"clusterEndpoint"`
	// ID of the Harness Kubernetes Connector Being used
	K8sConnectorId pulumi.StringOutput `pulumi:"k8sConnectorId"`
	// Name of the Orchestrator
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewOrchestrator registers a new resource with the given unique name, arguments, and options.
func NewOrchestrator(ctx *pulumi.Context,
	name string, args *OrchestratorArgs, opts ...pulumi.ResourceOption) (*Orchestrator, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'ClusterEndpoint'")
	}
	if args.K8sConnectorId == nil {
		return nil, errors.New("invalid value for required argument 'K8sConnectorId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Orchestrator
	err := ctx.RegisterResource("harness:cluster/orchestrator:Orchestrator", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrchestrator gets an existing Orchestrator resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrchestrator(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrchestratorState, opts ...pulumi.ResourceOption) (*Orchestrator, error) {
	var resource Orchestrator
	err := ctx.ReadResource("harness:cluster/orchestrator:Orchestrator", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Orchestrator resources.
type orchestratorState struct {
	// Endpoint of the k8s cluster being onboarded under the orchestrator
	ClusterEndpoint *string `pulumi:"clusterEndpoint"`
	// ID of the Harness Kubernetes Connector Being used
	K8sConnectorId *string `pulumi:"k8sConnectorId"`
	// Name of the Orchestrator
	Name *string `pulumi:"name"`
}

type OrchestratorState struct {
	// Endpoint of the k8s cluster being onboarded under the orchestrator
	ClusterEndpoint pulumi.StringPtrInput
	// ID of the Harness Kubernetes Connector Being used
	K8sConnectorId pulumi.StringPtrInput
	// Name of the Orchestrator
	Name pulumi.StringPtrInput
}

func (OrchestratorState) ElementType() reflect.Type {
	return reflect.TypeOf((*orchestratorState)(nil)).Elem()
}

type orchestratorArgs struct {
	// Endpoint of the k8s cluster being onboarded under the orchestrator
	ClusterEndpoint string `pulumi:"clusterEndpoint"`
	// ID of the Harness Kubernetes Connector Being used
	K8sConnectorId string `pulumi:"k8sConnectorId"`
	// Name of the Orchestrator
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Orchestrator resource.
type OrchestratorArgs struct {
	// Endpoint of the k8s cluster being onboarded under the orchestrator
	ClusterEndpoint pulumi.StringInput
	// ID of the Harness Kubernetes Connector Being used
	K8sConnectorId pulumi.StringInput
	// Name of the Orchestrator
	Name pulumi.StringPtrInput
}

func (OrchestratorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*orchestratorArgs)(nil)).Elem()
}

type OrchestratorInput interface {
	pulumi.Input

	ToOrchestratorOutput() OrchestratorOutput
	ToOrchestratorOutputWithContext(ctx context.Context) OrchestratorOutput
}

func (*Orchestrator) ElementType() reflect.Type {
	return reflect.TypeOf((**Orchestrator)(nil)).Elem()
}

func (i *Orchestrator) ToOrchestratorOutput() OrchestratorOutput {
	return i.ToOrchestratorOutputWithContext(context.Background())
}

func (i *Orchestrator) ToOrchestratorOutputWithContext(ctx context.Context) OrchestratorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrchestratorOutput)
}

// OrchestratorArrayInput is an input type that accepts OrchestratorArray and OrchestratorArrayOutput values.
// You can construct a concrete instance of `OrchestratorArrayInput` via:
//
//	OrchestratorArray{ OrchestratorArgs{...} }
type OrchestratorArrayInput interface {
	pulumi.Input

	ToOrchestratorArrayOutput() OrchestratorArrayOutput
	ToOrchestratorArrayOutputWithContext(context.Context) OrchestratorArrayOutput
}

type OrchestratorArray []OrchestratorInput

func (OrchestratorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Orchestrator)(nil)).Elem()
}

func (i OrchestratorArray) ToOrchestratorArrayOutput() OrchestratorArrayOutput {
	return i.ToOrchestratorArrayOutputWithContext(context.Background())
}

func (i OrchestratorArray) ToOrchestratorArrayOutputWithContext(ctx context.Context) OrchestratorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrchestratorArrayOutput)
}

// OrchestratorMapInput is an input type that accepts OrchestratorMap and OrchestratorMapOutput values.
// You can construct a concrete instance of `OrchestratorMapInput` via:
//
//	OrchestratorMap{ "key": OrchestratorArgs{...} }
type OrchestratorMapInput interface {
	pulumi.Input

	ToOrchestratorMapOutput() OrchestratorMapOutput
	ToOrchestratorMapOutputWithContext(context.Context) OrchestratorMapOutput
}

type OrchestratorMap map[string]OrchestratorInput

func (OrchestratorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Orchestrator)(nil)).Elem()
}

func (i OrchestratorMap) ToOrchestratorMapOutput() OrchestratorMapOutput {
	return i.ToOrchestratorMapOutputWithContext(context.Background())
}

func (i OrchestratorMap) ToOrchestratorMapOutputWithContext(ctx context.Context) OrchestratorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrchestratorMapOutput)
}

type OrchestratorOutput struct{ *pulumi.OutputState }

func (OrchestratorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Orchestrator)(nil)).Elem()
}

func (o OrchestratorOutput) ToOrchestratorOutput() OrchestratorOutput {
	return o
}

func (o OrchestratorOutput) ToOrchestratorOutputWithContext(ctx context.Context) OrchestratorOutput {
	return o
}

// Endpoint of the k8s cluster being onboarded under the orchestrator
func (o OrchestratorOutput) ClusterEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Orchestrator) pulumi.StringOutput { return v.ClusterEndpoint }).(pulumi.StringOutput)
}

// ID of the Harness Kubernetes Connector Being used
func (o OrchestratorOutput) K8sConnectorId() pulumi.StringOutput {
	return o.ApplyT(func(v *Orchestrator) pulumi.StringOutput { return v.K8sConnectorId }).(pulumi.StringOutput)
}

// Name of the Orchestrator
func (o OrchestratorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Orchestrator) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type OrchestratorArrayOutput struct{ *pulumi.OutputState }

func (OrchestratorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Orchestrator)(nil)).Elem()
}

func (o OrchestratorArrayOutput) ToOrchestratorArrayOutput() OrchestratorArrayOutput {
	return o
}

func (o OrchestratorArrayOutput) ToOrchestratorArrayOutputWithContext(ctx context.Context) OrchestratorArrayOutput {
	return o
}

func (o OrchestratorArrayOutput) Index(i pulumi.IntInput) OrchestratorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Orchestrator {
		return vs[0].([]*Orchestrator)[vs[1].(int)]
	}).(OrchestratorOutput)
}

type OrchestratorMapOutput struct{ *pulumi.OutputState }

func (OrchestratorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Orchestrator)(nil)).Elem()
}

func (o OrchestratorMapOutput) ToOrchestratorMapOutput() OrchestratorMapOutput {
	return o
}

func (o OrchestratorMapOutput) ToOrchestratorMapOutputWithContext(ctx context.Context) OrchestratorMapOutput {
	return o
}

func (o OrchestratorMapOutput) MapIndex(k pulumi.StringInput) OrchestratorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Orchestrator {
		return vs[0].(map[string]*Orchestrator)[vs[1].(string)]
	}).(OrchestratorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrchestratorInput)(nil)).Elem(), &Orchestrator{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrchestratorArrayInput)(nil)).Elem(), OrchestratorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrchestratorMapInput)(nil)).Elem(), OrchestratorMap{})
	pulumi.RegisterOutputType(OrchestratorOutput{})
	pulumi.RegisterOutputType(OrchestratorArrayOutput{})
	pulumi.RegisterOutputType(OrchestratorMapOutput{})
}
