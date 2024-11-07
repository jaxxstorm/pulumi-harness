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

type Provider struct {
	pulumi.CustomResourceState

	// The description of the provider entity.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The identifier of the provider entity.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// The last modified time of the provider entity.
	LastModifiedAt pulumi.IntOutput `pulumi:"lastModifiedAt"`
	// The name of the provider entity.
	Name pulumi.StringOutput `pulumi:"name"`
	// Contains parameters related to the provider entity.
	Spec ProviderSpecOutput `pulumi:"spec"`
	// The type of the provider entity.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Spec == nil {
		return nil, errors.New("invalid value for required argument 'Spec'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("harness:platform/provider:Provider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProvider gets an existing Provider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProviderState, opts ...pulumi.ResourceOption) (*Provider, error) {
	var resource Provider
	err := ctx.ReadResource("harness:platform/provider:Provider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Provider resources.
type providerState struct {
	// The description of the provider entity.
	Description *string `pulumi:"description"`
	// The identifier of the provider entity.
	Identifier *string `pulumi:"identifier"`
	// The last modified time of the provider entity.
	LastModifiedAt *int `pulumi:"lastModifiedAt"`
	// The name of the provider entity.
	Name *string `pulumi:"name"`
	// Contains parameters related to the provider entity.
	Spec *ProviderSpec `pulumi:"spec"`
	// The type of the provider entity.
	Type *string `pulumi:"type"`
}

type ProviderState struct {
	// The description of the provider entity.
	Description pulumi.StringPtrInput
	// The identifier of the provider entity.
	Identifier pulumi.StringPtrInput
	// The last modified time of the provider entity.
	LastModifiedAt pulumi.IntPtrInput
	// The name of the provider entity.
	Name pulumi.StringPtrInput
	// Contains parameters related to the provider entity.
	Spec ProviderSpecPtrInput
	// The type of the provider entity.
	Type pulumi.StringPtrInput
}

func (ProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*providerState)(nil)).Elem()
}

type providerArgs struct {
	// The description of the provider entity.
	Description *string `pulumi:"description"`
	// The identifier of the provider entity.
	Identifier string `pulumi:"identifier"`
	// The name of the provider entity.
	Name *string `pulumi:"name"`
	// Contains parameters related to the provider entity.
	Spec ProviderSpec `pulumi:"spec"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The description of the provider entity.
	Description pulumi.StringPtrInput
	// The identifier of the provider entity.
	Identifier pulumi.StringInput
	// The name of the provider entity.
	Name pulumi.StringPtrInput
	// Contains parameters related to the provider entity.
	Spec ProviderSpecInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

// ProviderArrayInput is an input type that accepts ProviderArray and ProviderArrayOutput values.
// You can construct a concrete instance of `ProviderArrayInput` via:
//
//	ProviderArray{ ProviderArgs{...} }
type ProviderArrayInput interface {
	pulumi.Input

	ToProviderArrayOutput() ProviderArrayOutput
	ToProviderArrayOutputWithContext(context.Context) ProviderArrayOutput
}

type ProviderArray []ProviderInput

func (ProviderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Provider)(nil)).Elem()
}

func (i ProviderArray) ToProviderArrayOutput() ProviderArrayOutput {
	return i.ToProviderArrayOutputWithContext(context.Background())
}

func (i ProviderArray) ToProviderArrayOutputWithContext(ctx context.Context) ProviderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderArrayOutput)
}

// ProviderMapInput is an input type that accepts ProviderMap and ProviderMapOutput values.
// You can construct a concrete instance of `ProviderMapInput` via:
//
//	ProviderMap{ "key": ProviderArgs{...} }
type ProviderMapInput interface {
	pulumi.Input

	ToProviderMapOutput() ProviderMapOutput
	ToProviderMapOutputWithContext(context.Context) ProviderMapOutput
}

type ProviderMap map[string]ProviderInput

func (ProviderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Provider)(nil)).Elem()
}

func (i ProviderMap) ToProviderMapOutput() ProviderMapOutput {
	return i.ToProviderMapOutputWithContext(context.Background())
}

func (i ProviderMap) ToProviderMapOutputWithContext(ctx context.Context) ProviderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderMapOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// The description of the provider entity.
func (o ProviderOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The identifier of the provider entity.
func (o ProviderOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// The last modified time of the provider entity.
func (o ProviderOutput) LastModifiedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *Provider) pulumi.IntOutput { return v.LastModifiedAt }).(pulumi.IntOutput)
}

// The name of the provider entity.
func (o ProviderOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Contains parameters related to the provider entity.
func (o ProviderOutput) Spec() ProviderSpecOutput {
	return o.ApplyT(func(v *Provider) ProviderSpecOutput { return v.Spec }).(ProviderSpecOutput)
}

// The type of the provider entity.
func (o ProviderOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ProviderArrayOutput struct{ *pulumi.OutputState }

func (ProviderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Provider)(nil)).Elem()
}

func (o ProviderArrayOutput) ToProviderArrayOutput() ProviderArrayOutput {
	return o
}

func (o ProviderArrayOutput) ToProviderArrayOutputWithContext(ctx context.Context) ProviderArrayOutput {
	return o
}

func (o ProviderArrayOutput) Index(i pulumi.IntInput) ProviderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Provider {
		return vs[0].([]*Provider)[vs[1].(int)]
	}).(ProviderOutput)
}

type ProviderMapOutput struct{ *pulumi.OutputState }

func (ProviderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Provider)(nil)).Elem()
}

func (o ProviderMapOutput) ToProviderMapOutput() ProviderMapOutput {
	return o
}

func (o ProviderMapOutput) ToProviderMapOutputWithContext(ctx context.Context) ProviderMapOutput {
	return o
}

func (o ProviderMapOutput) MapIndex(k pulumi.StringInput) ProviderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Provider {
		return vs[0].(map[string]*Provider)[vs[1].(string)]
	}).(ProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderArrayInput)(nil)).Elem(), ProviderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderMapInput)(nil)).Elem(), ProviderMap{})
	pulumi.RegisterOutputType(ProviderOutput{})
	pulumi.RegisterOutputType(ProviderArrayOutput{})
	pulumi.RegisterOutputType(ProviderMapOutput{})
}
