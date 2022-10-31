// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type EnvironmentServiceOverrides struct {
	pulumi.CustomResourceState

	// The env ID to which the overrides associated.
	EnvId pulumi.StringOutput `pulumi:"envId"`
	// identifier of the service overrides.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Unique identifier of the Organization.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
	// Environment Service Overrides YAML
	Yaml pulumi.StringOutput `pulumi:"yaml"`
}

// NewEnvironmentServiceOverrides registers a new resource with the given unique name, arguments, and options.
func NewEnvironmentServiceOverrides(ctx *pulumi.Context,
	name string, args *EnvironmentServiceOverridesArgs, opts ...pulumi.ResourceOption) (*EnvironmentServiceOverrides, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvId == nil {
		return nil, errors.New("invalid value for required argument 'EnvId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.ServiceId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceId'")
	}
	if args.Yaml == nil {
		return nil, errors.New("invalid value for required argument 'Yaml'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource EnvironmentServiceOverrides
	err := ctx.RegisterResource("harness:index/environmentServiceOverrides:EnvironmentServiceOverrides", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnvironmentServiceOverrides gets an existing EnvironmentServiceOverrides resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnvironmentServiceOverrides(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnvironmentServiceOverridesState, opts ...pulumi.ResourceOption) (*EnvironmentServiceOverrides, error) {
	var resource EnvironmentServiceOverrides
	err := ctx.ReadResource("harness:index/environmentServiceOverrides:EnvironmentServiceOverrides", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnvironmentServiceOverrides resources.
type environmentServiceOverridesState struct {
	// The env ID to which the overrides associated.
	EnvId *string `pulumi:"envId"`
	// identifier of the service overrides.
	Identifier *string `pulumi:"identifier"`
	// Unique identifier of the Organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId *string `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId *string `pulumi:"serviceId"`
	// Environment Service Overrides YAML
	Yaml *string `pulumi:"yaml"`
}

type EnvironmentServiceOverridesState struct {
	// The env ID to which the overrides associated.
	EnvId pulumi.StringPtrInput
	// identifier of the service overrides.
	Identifier pulumi.StringPtrInput
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrInput
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringPtrInput
	// Environment Service Overrides YAML
	Yaml pulumi.StringPtrInput
}

func (EnvironmentServiceOverridesState) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentServiceOverridesState)(nil)).Elem()
}

type environmentServiceOverridesArgs struct {
	// The env ID to which the overrides associated.
	EnvId string `pulumi:"envId"`
	// identifier of the service overrides.
	Identifier string `pulumi:"identifier"`
	// Unique identifier of the Organization.
	OrgId string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId string `pulumi:"projectId"`
	// The service ID to which the overrides applies.
	ServiceId string `pulumi:"serviceId"`
	// Environment Service Overrides YAML
	Yaml string `pulumi:"yaml"`
}

// The set of arguments for constructing a EnvironmentServiceOverrides resource.
type EnvironmentServiceOverridesArgs struct {
	// The env ID to which the overrides associated.
	EnvId pulumi.StringInput
	// identifier of the service overrides.
	Identifier pulumi.StringInput
	// Unique identifier of the Organization.
	OrgId pulumi.StringInput
	// Unique identifier of the Project.
	ProjectId pulumi.StringInput
	// The service ID to which the overrides applies.
	ServiceId pulumi.StringInput
	// Environment Service Overrides YAML
	Yaml pulumi.StringInput
}

func (EnvironmentServiceOverridesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentServiceOverridesArgs)(nil)).Elem()
}

type EnvironmentServiceOverridesInput interface {
	pulumi.Input

	ToEnvironmentServiceOverridesOutput() EnvironmentServiceOverridesOutput
	ToEnvironmentServiceOverridesOutputWithContext(ctx context.Context) EnvironmentServiceOverridesOutput
}

func (*EnvironmentServiceOverrides) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentServiceOverrides)(nil)).Elem()
}

func (i *EnvironmentServiceOverrides) ToEnvironmentServiceOverridesOutput() EnvironmentServiceOverridesOutput {
	return i.ToEnvironmentServiceOverridesOutputWithContext(context.Background())
}

func (i *EnvironmentServiceOverrides) ToEnvironmentServiceOverridesOutputWithContext(ctx context.Context) EnvironmentServiceOverridesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentServiceOverridesOutput)
}

// EnvironmentServiceOverridesArrayInput is an input type that accepts EnvironmentServiceOverridesArray and EnvironmentServiceOverridesArrayOutput values.
// You can construct a concrete instance of `EnvironmentServiceOverridesArrayInput` via:
//
//	EnvironmentServiceOverridesArray{ EnvironmentServiceOverridesArgs{...} }
type EnvironmentServiceOverridesArrayInput interface {
	pulumi.Input

	ToEnvironmentServiceOverridesArrayOutput() EnvironmentServiceOverridesArrayOutput
	ToEnvironmentServiceOverridesArrayOutputWithContext(context.Context) EnvironmentServiceOverridesArrayOutput
}

type EnvironmentServiceOverridesArray []EnvironmentServiceOverridesInput

func (EnvironmentServiceOverridesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentServiceOverrides)(nil)).Elem()
}

func (i EnvironmentServiceOverridesArray) ToEnvironmentServiceOverridesArrayOutput() EnvironmentServiceOverridesArrayOutput {
	return i.ToEnvironmentServiceOverridesArrayOutputWithContext(context.Background())
}

func (i EnvironmentServiceOverridesArray) ToEnvironmentServiceOverridesArrayOutputWithContext(ctx context.Context) EnvironmentServiceOverridesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentServiceOverridesArrayOutput)
}

// EnvironmentServiceOverridesMapInput is an input type that accepts EnvironmentServiceOverridesMap and EnvironmentServiceOverridesMapOutput values.
// You can construct a concrete instance of `EnvironmentServiceOverridesMapInput` via:
//
//	EnvironmentServiceOverridesMap{ "key": EnvironmentServiceOverridesArgs{...} }
type EnvironmentServiceOverridesMapInput interface {
	pulumi.Input

	ToEnvironmentServiceOverridesMapOutput() EnvironmentServiceOverridesMapOutput
	ToEnvironmentServiceOverridesMapOutputWithContext(context.Context) EnvironmentServiceOverridesMapOutput
}

type EnvironmentServiceOverridesMap map[string]EnvironmentServiceOverridesInput

func (EnvironmentServiceOverridesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentServiceOverrides)(nil)).Elem()
}

func (i EnvironmentServiceOverridesMap) ToEnvironmentServiceOverridesMapOutput() EnvironmentServiceOverridesMapOutput {
	return i.ToEnvironmentServiceOverridesMapOutputWithContext(context.Background())
}

func (i EnvironmentServiceOverridesMap) ToEnvironmentServiceOverridesMapOutputWithContext(ctx context.Context) EnvironmentServiceOverridesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentServiceOverridesMapOutput)
}

type EnvironmentServiceOverridesOutput struct{ *pulumi.OutputState }

func (EnvironmentServiceOverridesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentServiceOverrides)(nil)).Elem()
}

func (o EnvironmentServiceOverridesOutput) ToEnvironmentServiceOverridesOutput() EnvironmentServiceOverridesOutput {
	return o
}

func (o EnvironmentServiceOverridesOutput) ToEnvironmentServiceOverridesOutputWithContext(ctx context.Context) EnvironmentServiceOverridesOutput {
	return o
}

// The env ID to which the overrides associated.
func (o EnvironmentServiceOverridesOutput) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.EnvId }).(pulumi.StringOutput)
}

// identifier of the service overrides.
func (o EnvironmentServiceOverridesOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Unique identifier of the Organization.
func (o EnvironmentServiceOverridesOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Unique identifier of the Project.
func (o EnvironmentServiceOverridesOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The service ID to which the overrides applies.
func (o EnvironmentServiceOverridesOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

// Environment Service Overrides YAML
func (o EnvironmentServiceOverridesOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.Yaml }).(pulumi.StringOutput)
}

type EnvironmentServiceOverridesArrayOutput struct{ *pulumi.OutputState }

func (EnvironmentServiceOverridesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentServiceOverrides)(nil)).Elem()
}

func (o EnvironmentServiceOverridesArrayOutput) ToEnvironmentServiceOverridesArrayOutput() EnvironmentServiceOverridesArrayOutput {
	return o
}

func (o EnvironmentServiceOverridesArrayOutput) ToEnvironmentServiceOverridesArrayOutputWithContext(ctx context.Context) EnvironmentServiceOverridesArrayOutput {
	return o
}

func (o EnvironmentServiceOverridesArrayOutput) Index(i pulumi.IntInput) EnvironmentServiceOverridesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnvironmentServiceOverrides {
		return vs[0].([]*EnvironmentServiceOverrides)[vs[1].(int)]
	}).(EnvironmentServiceOverridesOutput)
}

type EnvironmentServiceOverridesMapOutput struct{ *pulumi.OutputState }

func (EnvironmentServiceOverridesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentServiceOverrides)(nil)).Elem()
}

func (o EnvironmentServiceOverridesMapOutput) ToEnvironmentServiceOverridesMapOutput() EnvironmentServiceOverridesMapOutput {
	return o
}

func (o EnvironmentServiceOverridesMapOutput) ToEnvironmentServiceOverridesMapOutputWithContext(ctx context.Context) EnvironmentServiceOverridesMapOutput {
	return o
}

func (o EnvironmentServiceOverridesMapOutput) MapIndex(k pulumi.StringInput) EnvironmentServiceOverridesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnvironmentServiceOverrides {
		return vs[0].(map[string]*EnvironmentServiceOverrides)[vs[1].(string)]
	}).(EnvironmentServiceOverridesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentServiceOverridesInput)(nil)).Elem(), &EnvironmentServiceOverrides{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentServiceOverridesArrayInput)(nil)).Elem(), EnvironmentServiceOverridesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentServiceOverridesMapInput)(nil)).Elem(), EnvironmentServiceOverridesMap{})
	pulumi.RegisterOutputType(EnvironmentServiceOverridesOutput{})
	pulumi.RegisterOutputType(EnvironmentServiceOverridesArrayOutput{})
	pulumi.RegisterOutputType(EnvironmentServiceOverridesMapOutput{})
}
