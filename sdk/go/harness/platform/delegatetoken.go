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

// Resource for creating delegate tokens.
//
// ## Import
//
// # Import account level delegate token
//
// ```sh
// $ pulumi import harness:platform/delegatetoken:Delegatetoken harness_platform_delegatetoken <token_id>
// ```
//
// # Import org level delegate token
//
// ```sh
// $ pulumi import harness:platform/delegatetoken:Delegatetoken harness_platform_delegatetoken <org_id>/<token_id>
// ```
//
// # Import project level delegate token
//
// ```sh
// $ pulumi import harness:platform/delegatetoken:Delegatetoken harness_platform_delegatetoken <org_id>/<project_id>/<token_id>
// ```
type Delegatetoken struct {
	pulumi.CustomResourceState

	// Account Identifier for the Entity
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Time when the delegate token is created.
	CreatedAt pulumi.IntOutput `pulumi:"createdAt"`
	// created by details.
	CreatedBy pulumi.StringMapOutput `pulumi:"createdBy"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
	TokenStatus pulumi.StringOutput `pulumi:"tokenStatus"`
	// Value of the delegate Token
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewDelegatetoken registers a new resource with the given unique name, arguments, and options.
func NewDelegatetoken(ctx *pulumi.Context,
	name string, args *DelegatetokenArgs, opts ...pulumi.ResourceOption) (*Delegatetoken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Delegatetoken
	err := ctx.RegisterResource("harness:platform/delegatetoken:Delegatetoken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDelegatetoken gets an existing Delegatetoken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDelegatetoken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DelegatetokenState, opts ...pulumi.ResourceOption) (*Delegatetoken, error) {
	var resource Delegatetoken
	err := ctx.ReadResource("harness:platform/delegatetoken:Delegatetoken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Delegatetoken resources.
type delegatetokenState struct {
	// Account Identifier for the Entity
	AccountId *string `pulumi:"accountId"`
	// Time when the delegate token is created.
	CreatedAt *int `pulumi:"createdAt"`
	// created by details.
	CreatedBy map[string]string `pulumi:"createdBy"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
	TokenStatus *string `pulumi:"tokenStatus"`
	// Value of the delegate Token
	Value *string `pulumi:"value"`
}

type DelegatetokenState struct {
	// Account Identifier for the Entity
	AccountId pulumi.StringPtrInput
	// Time when the delegate token is created.
	CreatedAt pulumi.IntPtrInput
	// created by details.
	CreatedBy pulumi.StringMapInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
	TokenStatus pulumi.StringPtrInput
	// Value of the delegate Token
	Value pulumi.StringPtrInput
}

func (DelegatetokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*delegatetokenState)(nil)).Elem()
}

type delegatetokenArgs struct {
	// Account Identifier for the Entity
	AccountId string `pulumi:"accountId"`
	// Time when the delegate token is created.
	CreatedAt *int `pulumi:"createdAt"`
	// created by details.
	CreatedBy map[string]string `pulumi:"createdBy"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
	TokenStatus *string `pulumi:"tokenStatus"`
	// Value of the delegate Token
	Value *string `pulumi:"value"`
}

// The set of arguments for constructing a Delegatetoken resource.
type DelegatetokenArgs struct {
	// Account Identifier for the Entity
	AccountId pulumi.StringInput
	// Time when the delegate token is created.
	CreatedAt pulumi.IntPtrInput
	// created by details.
	CreatedBy pulumi.StringMapInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
	TokenStatus pulumi.StringPtrInput
	// Value of the delegate Token
	Value pulumi.StringPtrInput
}

func (DelegatetokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*delegatetokenArgs)(nil)).Elem()
}

type DelegatetokenInput interface {
	pulumi.Input

	ToDelegatetokenOutput() DelegatetokenOutput
	ToDelegatetokenOutputWithContext(ctx context.Context) DelegatetokenOutput
}

func (*Delegatetoken) ElementType() reflect.Type {
	return reflect.TypeOf((**Delegatetoken)(nil)).Elem()
}

func (i *Delegatetoken) ToDelegatetokenOutput() DelegatetokenOutput {
	return i.ToDelegatetokenOutputWithContext(context.Background())
}

func (i *Delegatetoken) ToDelegatetokenOutputWithContext(ctx context.Context) DelegatetokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegatetokenOutput)
}

// DelegatetokenArrayInput is an input type that accepts DelegatetokenArray and DelegatetokenArrayOutput values.
// You can construct a concrete instance of `DelegatetokenArrayInput` via:
//
//	DelegatetokenArray{ DelegatetokenArgs{...} }
type DelegatetokenArrayInput interface {
	pulumi.Input

	ToDelegatetokenArrayOutput() DelegatetokenArrayOutput
	ToDelegatetokenArrayOutputWithContext(context.Context) DelegatetokenArrayOutput
}

type DelegatetokenArray []DelegatetokenInput

func (DelegatetokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Delegatetoken)(nil)).Elem()
}

func (i DelegatetokenArray) ToDelegatetokenArrayOutput() DelegatetokenArrayOutput {
	return i.ToDelegatetokenArrayOutputWithContext(context.Background())
}

func (i DelegatetokenArray) ToDelegatetokenArrayOutputWithContext(ctx context.Context) DelegatetokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegatetokenArrayOutput)
}

// DelegatetokenMapInput is an input type that accepts DelegatetokenMap and DelegatetokenMapOutput values.
// You can construct a concrete instance of `DelegatetokenMapInput` via:
//
//	DelegatetokenMap{ "key": DelegatetokenArgs{...} }
type DelegatetokenMapInput interface {
	pulumi.Input

	ToDelegatetokenMapOutput() DelegatetokenMapOutput
	ToDelegatetokenMapOutputWithContext(context.Context) DelegatetokenMapOutput
}

type DelegatetokenMap map[string]DelegatetokenInput

func (DelegatetokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Delegatetoken)(nil)).Elem()
}

func (i DelegatetokenMap) ToDelegatetokenMapOutput() DelegatetokenMapOutput {
	return i.ToDelegatetokenMapOutputWithContext(context.Background())
}

func (i DelegatetokenMap) ToDelegatetokenMapOutputWithContext(ctx context.Context) DelegatetokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegatetokenMapOutput)
}

type DelegatetokenOutput struct{ *pulumi.OutputState }

func (DelegatetokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Delegatetoken)(nil)).Elem()
}

func (o DelegatetokenOutput) ToDelegatetokenOutput() DelegatetokenOutput {
	return o
}

func (o DelegatetokenOutput) ToDelegatetokenOutputWithContext(ctx context.Context) DelegatetokenOutput {
	return o
}

// Account Identifier for the Entity
func (o DelegatetokenOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Delegatetoken) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Time when the delegate token is created.
func (o DelegatetokenOutput) CreatedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *Delegatetoken) pulumi.IntOutput { return v.CreatedAt }).(pulumi.IntOutput)
}

// created by details.
func (o DelegatetokenOutput) CreatedBy() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Delegatetoken) pulumi.StringMapOutput { return v.CreatedBy }).(pulumi.StringMapOutput)
}

// Name of the resource.
func (o DelegatetokenOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Delegatetoken) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o DelegatetokenOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Delegatetoken) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o DelegatetokenOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Delegatetoken) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Status of Delegate Token (ACTIVE or REVOKED). If left empty both active and revoked tokens will be assumed.
func (o DelegatetokenOutput) TokenStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *Delegatetoken) pulumi.StringOutput { return v.TokenStatus }).(pulumi.StringOutput)
}

// Value of the delegate Token
func (o DelegatetokenOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *Delegatetoken) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type DelegatetokenArrayOutput struct{ *pulumi.OutputState }

func (DelegatetokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Delegatetoken)(nil)).Elem()
}

func (o DelegatetokenArrayOutput) ToDelegatetokenArrayOutput() DelegatetokenArrayOutput {
	return o
}

func (o DelegatetokenArrayOutput) ToDelegatetokenArrayOutputWithContext(ctx context.Context) DelegatetokenArrayOutput {
	return o
}

func (o DelegatetokenArrayOutput) Index(i pulumi.IntInput) DelegatetokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Delegatetoken {
		return vs[0].([]*Delegatetoken)[vs[1].(int)]
	}).(DelegatetokenOutput)
}

type DelegatetokenMapOutput struct{ *pulumi.OutputState }

func (DelegatetokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Delegatetoken)(nil)).Elem()
}

func (o DelegatetokenMapOutput) ToDelegatetokenMapOutput() DelegatetokenMapOutput {
	return o
}

func (o DelegatetokenMapOutput) ToDelegatetokenMapOutputWithContext(ctx context.Context) DelegatetokenMapOutput {
	return o
}

func (o DelegatetokenMapOutput) MapIndex(k pulumi.StringInput) DelegatetokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Delegatetoken {
		return vs[0].(map[string]*Delegatetoken)[vs[1].(string)]
	}).(DelegatetokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DelegatetokenInput)(nil)).Elem(), &Delegatetoken{})
	pulumi.RegisterInputType(reflect.TypeOf((*DelegatetokenArrayInput)(nil)).Elem(), DelegatetokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DelegatetokenMapInput)(nil)).Elem(), DelegatetokenMap{})
	pulumi.RegisterOutputType(DelegatetokenOutput{})
	pulumi.RegisterOutputType(DelegatetokenArrayOutput{})
	pulumi.RegisterOutputType(DelegatetokenMapOutput{})
}
