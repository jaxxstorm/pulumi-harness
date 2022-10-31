// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for approving or rejecting delegates.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			testDelegate, err := harness.GetDelegate(ctx, &GetDelegateArgs{
//				Name: pulumi.StringRef("my-delegate"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = harness.NewDelegateApproval(ctx, "testDelegateApproval", &harness.DelegateApprovalArgs{
//				DelegateId: pulumi.String(testDelegate.Id),
//				Approve:    pulumi.Bool(true),
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
// Import the status of the delegate approval.
//
// ```sh
//
//	$ pulumi import harness:index/delegateApproval:DelegateApproval example <delegate_id>
//
// ```
type DelegateApproval struct {
	pulumi.CustomResourceState

	// Whether or not to approve the delegate.
	Approve pulumi.BoolOutput `pulumi:"approve"`
	// The id of the delegate.
	DelegateId pulumi.StringOutput `pulumi:"delegateId"`
	// The status of the delegate.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewDelegateApproval registers a new resource with the given unique name, arguments, and options.
func NewDelegateApproval(ctx *pulumi.Context,
	name string, args *DelegateApprovalArgs, opts ...pulumi.ResourceOption) (*DelegateApproval, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Approve == nil {
		return nil, errors.New("invalid value for required argument 'Approve'")
	}
	if args.DelegateId == nil {
		return nil, errors.New("invalid value for required argument 'DelegateId'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource DelegateApproval
	err := ctx.RegisterResource("harness:index/delegateApproval:DelegateApproval", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDelegateApproval gets an existing DelegateApproval resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDelegateApproval(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DelegateApprovalState, opts ...pulumi.ResourceOption) (*DelegateApproval, error) {
	var resource DelegateApproval
	err := ctx.ReadResource("harness:index/delegateApproval:DelegateApproval", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DelegateApproval resources.
type delegateApprovalState struct {
	// Whether or not to approve the delegate.
	Approve *bool `pulumi:"approve"`
	// The id of the delegate.
	DelegateId *string `pulumi:"delegateId"`
	// The status of the delegate.
	Status *string `pulumi:"status"`
}

type DelegateApprovalState struct {
	// Whether or not to approve the delegate.
	Approve pulumi.BoolPtrInput
	// The id of the delegate.
	DelegateId pulumi.StringPtrInput
	// The status of the delegate.
	Status pulumi.StringPtrInput
}

func (DelegateApprovalState) ElementType() reflect.Type {
	return reflect.TypeOf((*delegateApprovalState)(nil)).Elem()
}

type delegateApprovalArgs struct {
	// Whether or not to approve the delegate.
	Approve bool `pulumi:"approve"`
	// The id of the delegate.
	DelegateId string `pulumi:"delegateId"`
}

// The set of arguments for constructing a DelegateApproval resource.
type DelegateApprovalArgs struct {
	// Whether or not to approve the delegate.
	Approve pulumi.BoolInput
	// The id of the delegate.
	DelegateId pulumi.StringInput
}

func (DelegateApprovalArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*delegateApprovalArgs)(nil)).Elem()
}

type DelegateApprovalInput interface {
	pulumi.Input

	ToDelegateApprovalOutput() DelegateApprovalOutput
	ToDelegateApprovalOutputWithContext(ctx context.Context) DelegateApprovalOutput
}

func (*DelegateApproval) ElementType() reflect.Type {
	return reflect.TypeOf((**DelegateApproval)(nil)).Elem()
}

func (i *DelegateApproval) ToDelegateApprovalOutput() DelegateApprovalOutput {
	return i.ToDelegateApprovalOutputWithContext(context.Background())
}

func (i *DelegateApproval) ToDelegateApprovalOutputWithContext(ctx context.Context) DelegateApprovalOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegateApprovalOutput)
}

// DelegateApprovalArrayInput is an input type that accepts DelegateApprovalArray and DelegateApprovalArrayOutput values.
// You can construct a concrete instance of `DelegateApprovalArrayInput` via:
//
//	DelegateApprovalArray{ DelegateApprovalArgs{...} }
type DelegateApprovalArrayInput interface {
	pulumi.Input

	ToDelegateApprovalArrayOutput() DelegateApprovalArrayOutput
	ToDelegateApprovalArrayOutputWithContext(context.Context) DelegateApprovalArrayOutput
}

type DelegateApprovalArray []DelegateApprovalInput

func (DelegateApprovalArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DelegateApproval)(nil)).Elem()
}

func (i DelegateApprovalArray) ToDelegateApprovalArrayOutput() DelegateApprovalArrayOutput {
	return i.ToDelegateApprovalArrayOutputWithContext(context.Background())
}

func (i DelegateApprovalArray) ToDelegateApprovalArrayOutputWithContext(ctx context.Context) DelegateApprovalArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegateApprovalArrayOutput)
}

// DelegateApprovalMapInput is an input type that accepts DelegateApprovalMap and DelegateApprovalMapOutput values.
// You can construct a concrete instance of `DelegateApprovalMapInput` via:
//
//	DelegateApprovalMap{ "key": DelegateApprovalArgs{...} }
type DelegateApprovalMapInput interface {
	pulumi.Input

	ToDelegateApprovalMapOutput() DelegateApprovalMapOutput
	ToDelegateApprovalMapOutputWithContext(context.Context) DelegateApprovalMapOutput
}

type DelegateApprovalMap map[string]DelegateApprovalInput

func (DelegateApprovalMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DelegateApproval)(nil)).Elem()
}

func (i DelegateApprovalMap) ToDelegateApprovalMapOutput() DelegateApprovalMapOutput {
	return i.ToDelegateApprovalMapOutputWithContext(context.Background())
}

func (i DelegateApprovalMap) ToDelegateApprovalMapOutputWithContext(ctx context.Context) DelegateApprovalMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegateApprovalMapOutput)
}

type DelegateApprovalOutput struct{ *pulumi.OutputState }

func (DelegateApprovalOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DelegateApproval)(nil)).Elem()
}

func (o DelegateApprovalOutput) ToDelegateApprovalOutput() DelegateApprovalOutput {
	return o
}

func (o DelegateApprovalOutput) ToDelegateApprovalOutputWithContext(ctx context.Context) DelegateApprovalOutput {
	return o
}

// Whether or not to approve the delegate.
func (o DelegateApprovalOutput) Approve() pulumi.BoolOutput {
	return o.ApplyT(func(v *DelegateApproval) pulumi.BoolOutput { return v.Approve }).(pulumi.BoolOutput)
}

// The id of the delegate.
func (o DelegateApprovalOutput) DelegateId() pulumi.StringOutput {
	return o.ApplyT(func(v *DelegateApproval) pulumi.StringOutput { return v.DelegateId }).(pulumi.StringOutput)
}

// The status of the delegate.
func (o DelegateApprovalOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *DelegateApproval) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type DelegateApprovalArrayOutput struct{ *pulumi.OutputState }

func (DelegateApprovalArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DelegateApproval)(nil)).Elem()
}

func (o DelegateApprovalArrayOutput) ToDelegateApprovalArrayOutput() DelegateApprovalArrayOutput {
	return o
}

func (o DelegateApprovalArrayOutput) ToDelegateApprovalArrayOutputWithContext(ctx context.Context) DelegateApprovalArrayOutput {
	return o
}

func (o DelegateApprovalArrayOutput) Index(i pulumi.IntInput) DelegateApprovalOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DelegateApproval {
		return vs[0].([]*DelegateApproval)[vs[1].(int)]
	}).(DelegateApprovalOutput)
}

type DelegateApprovalMapOutput struct{ *pulumi.OutputState }

func (DelegateApprovalMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DelegateApproval)(nil)).Elem()
}

func (o DelegateApprovalMapOutput) ToDelegateApprovalMapOutput() DelegateApprovalMapOutput {
	return o
}

func (o DelegateApprovalMapOutput) ToDelegateApprovalMapOutputWithContext(ctx context.Context) DelegateApprovalMapOutput {
	return o
}

func (o DelegateApprovalMapOutput) MapIndex(k pulumi.StringInput) DelegateApprovalOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DelegateApproval {
		return vs[0].(map[string]*DelegateApproval)[vs[1].(string)]
	}).(DelegateApprovalOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DelegateApprovalInput)(nil)).Elem(), &DelegateApproval{})
	pulumi.RegisterInputType(reflect.TypeOf((*DelegateApprovalArrayInput)(nil)).Elem(), DelegateApprovalArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DelegateApprovalMapInput)(nil)).Elem(), DelegateApprovalMap{})
	pulumi.RegisterOutputType(DelegateApprovalOutput{})
	pulumi.RegisterOutputType(DelegateApprovalArrayOutput{})
	pulumi.RegisterOutputType(DelegateApprovalMapOutput{})
}
