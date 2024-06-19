// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ServiceOverridesV2 struct {
	pulumi.CustomResourceState

	// The cluster ID to which the overrides are associated
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The env ID to which the overrides are associated.
	EnvId pulumi.StringOutput `pulumi:"envId"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// The infrastructure ID to which the overrides are associated
	InfraId pulumi.StringOutput `pulumi:"infraId"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
	// The overrides specification for the service.
	Spec pulumi.StringOutput `pulumi:"spec"`
	// The type of the overrides
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewServiceOverridesV2 registers a new resource with the given unique name, arguments, and options.
func NewServiceOverridesV2(ctx *pulumi.Context,
	name string, args *ServiceOverridesV2Args, opts ...pulumi.ResourceOption) (*ServiceOverridesV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvId == nil {
		return nil, errors.New("invalid value for required argument 'EnvId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Spec == nil {
		return nil, errors.New("invalid value for required argument 'Spec'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceOverridesV2
	err := ctx.RegisterResource("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceOverridesV2 gets an existing ServiceOverridesV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceOverridesV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceOverridesV2State, opts ...pulumi.ResourceOption) (*ServiceOverridesV2, error) {
	var resource ServiceOverridesV2
	err := ctx.ReadResource("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceOverridesV2 resources.
type serviceOverridesV2State struct {
	// The cluster ID to which the overrides are associated
	ClusterId *string `pulumi:"clusterId"`
	// The env ID to which the overrides are associated.
	EnvId *string `pulumi:"envId"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// The infrastructure ID to which the overrides are associated
	InfraId *string `pulumi:"infraId"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId *string `pulumi:"serviceId"`
	// The overrides specification for the service.
	Spec *string `pulumi:"spec"`
	// The type of the overrides
	Type *string `pulumi:"type"`
}

type ServiceOverridesV2State struct {
	// The cluster ID to which the overrides are associated
	ClusterId pulumi.StringPtrInput
	// The env ID to which the overrides are associated.
	EnvId pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// The infrastructure ID to which the overrides are associated
	InfraId pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringPtrInput
	// The overrides specification for the service.
	Spec pulumi.StringPtrInput
	// The type of the overrides
	Type pulumi.StringPtrInput
}

func (ServiceOverridesV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceOverridesV2State)(nil)).Elem()
}

type serviceOverridesV2Args struct {
	// The cluster ID to which the overrides are associated
	ClusterId *string `pulumi:"clusterId"`
	// The env ID to which the overrides are associated.
	EnvId string `pulumi:"envId"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// The infrastructure ID to which the overrides are associated
	InfraId *string `pulumi:"infraId"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId *string `pulumi:"serviceId"`
	// The overrides specification for the service.
	Spec string `pulumi:"spec"`
	// The type of the overrides
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a ServiceOverridesV2 resource.
type ServiceOverridesV2Args struct {
	// The cluster ID to which the overrides are associated
	ClusterId pulumi.StringPtrInput
	// The env ID to which the overrides are associated.
	EnvId pulumi.StringInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// The infrastructure ID to which the overrides are associated
	InfraId pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringPtrInput
	// The overrides specification for the service.
	Spec pulumi.StringInput
	// The type of the overrides
	Type pulumi.StringInput
}

func (ServiceOverridesV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceOverridesV2Args)(nil)).Elem()
}

type ServiceOverridesV2Input interface {
	pulumi.Input

	ToServiceOverridesV2Output() ServiceOverridesV2Output
	ToServiceOverridesV2OutputWithContext(ctx context.Context) ServiceOverridesV2Output
}

func (*ServiceOverridesV2) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceOverridesV2)(nil)).Elem()
}

func (i *ServiceOverridesV2) ToServiceOverridesV2Output() ServiceOverridesV2Output {
	return i.ToServiceOverridesV2OutputWithContext(context.Background())
}

func (i *ServiceOverridesV2) ToServiceOverridesV2OutputWithContext(ctx context.Context) ServiceOverridesV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOverridesV2Output)
}

// ServiceOverridesV2ArrayInput is an input type that accepts ServiceOverridesV2Array and ServiceOverridesV2ArrayOutput values.
// You can construct a concrete instance of `ServiceOverridesV2ArrayInput` via:
//
//	ServiceOverridesV2Array{ ServiceOverridesV2Args{...} }
type ServiceOverridesV2ArrayInput interface {
	pulumi.Input

	ToServiceOverridesV2ArrayOutput() ServiceOverridesV2ArrayOutput
	ToServiceOverridesV2ArrayOutputWithContext(context.Context) ServiceOverridesV2ArrayOutput
}

type ServiceOverridesV2Array []ServiceOverridesV2Input

func (ServiceOverridesV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceOverridesV2)(nil)).Elem()
}

func (i ServiceOverridesV2Array) ToServiceOverridesV2ArrayOutput() ServiceOverridesV2ArrayOutput {
	return i.ToServiceOverridesV2ArrayOutputWithContext(context.Background())
}

func (i ServiceOverridesV2Array) ToServiceOverridesV2ArrayOutputWithContext(ctx context.Context) ServiceOverridesV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOverridesV2ArrayOutput)
}

// ServiceOverridesV2MapInput is an input type that accepts ServiceOverridesV2Map and ServiceOverridesV2MapOutput values.
// You can construct a concrete instance of `ServiceOverridesV2MapInput` via:
//
//	ServiceOverridesV2Map{ "key": ServiceOverridesV2Args{...} }
type ServiceOverridesV2MapInput interface {
	pulumi.Input

	ToServiceOverridesV2MapOutput() ServiceOverridesV2MapOutput
	ToServiceOverridesV2MapOutputWithContext(context.Context) ServiceOverridesV2MapOutput
}

type ServiceOverridesV2Map map[string]ServiceOverridesV2Input

func (ServiceOverridesV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceOverridesV2)(nil)).Elem()
}

func (i ServiceOverridesV2Map) ToServiceOverridesV2MapOutput() ServiceOverridesV2MapOutput {
	return i.ToServiceOverridesV2MapOutputWithContext(context.Background())
}

func (i ServiceOverridesV2Map) ToServiceOverridesV2MapOutputWithContext(ctx context.Context) ServiceOverridesV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOverridesV2MapOutput)
}

type ServiceOverridesV2Output struct{ *pulumi.OutputState }

func (ServiceOverridesV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceOverridesV2)(nil)).Elem()
}

func (o ServiceOverridesV2Output) ToServiceOverridesV2Output() ServiceOverridesV2Output {
	return o
}

func (o ServiceOverridesV2Output) ToServiceOverridesV2OutputWithContext(ctx context.Context) ServiceOverridesV2Output {
	return o
}

// The cluster ID to which the overrides are associated
func (o ServiceOverridesV2Output) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The env ID to which the overrides are associated.
func (o ServiceOverridesV2Output) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.EnvId }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o ServiceOverridesV2Output) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// The infrastructure ID to which the overrides are associated
func (o ServiceOverridesV2Output) InfraId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.InfraId }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o ServiceOverridesV2Output) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o ServiceOverridesV2Output) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The service ID to which the overrides applies.
func (o ServiceOverridesV2Output) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

// The overrides specification for the service.
func (o ServiceOverridesV2Output) Spec() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.Spec }).(pulumi.StringOutput)
}

// The type of the overrides
func (o ServiceOverridesV2Output) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceOverridesV2) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ServiceOverridesV2ArrayOutput struct{ *pulumi.OutputState }

func (ServiceOverridesV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceOverridesV2)(nil)).Elem()
}

func (o ServiceOverridesV2ArrayOutput) ToServiceOverridesV2ArrayOutput() ServiceOverridesV2ArrayOutput {
	return o
}

func (o ServiceOverridesV2ArrayOutput) ToServiceOverridesV2ArrayOutputWithContext(ctx context.Context) ServiceOverridesV2ArrayOutput {
	return o
}

func (o ServiceOverridesV2ArrayOutput) Index(i pulumi.IntInput) ServiceOverridesV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceOverridesV2 {
		return vs[0].([]*ServiceOverridesV2)[vs[1].(int)]
	}).(ServiceOverridesV2Output)
}

type ServiceOverridesV2MapOutput struct{ *pulumi.OutputState }

func (ServiceOverridesV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceOverridesV2)(nil)).Elem()
}

func (o ServiceOverridesV2MapOutput) ToServiceOverridesV2MapOutput() ServiceOverridesV2MapOutput {
	return o
}

func (o ServiceOverridesV2MapOutput) ToServiceOverridesV2MapOutputWithContext(ctx context.Context) ServiceOverridesV2MapOutput {
	return o
}

func (o ServiceOverridesV2MapOutput) MapIndex(k pulumi.StringInput) ServiceOverridesV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceOverridesV2 {
		return vs[0].(map[string]*ServiceOverridesV2)[vs[1].(string)]
	}).(ServiceOverridesV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceOverridesV2Input)(nil)).Elem(), &ServiceOverridesV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceOverridesV2ArrayInput)(nil)).Elem(), ServiceOverridesV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceOverridesV2MapInput)(nil)).Elem(), ServiceOverridesV2Map{})
	pulumi.RegisterOutputType(ServiceOverridesV2Output{})
	pulumi.RegisterOutputType(ServiceOverridesV2ArrayOutput{})
	pulumi.RegisterOutputType(ServiceOverridesV2MapOutput{})
}
