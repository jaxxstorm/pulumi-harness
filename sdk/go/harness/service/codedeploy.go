// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package service

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an AWS CodeDeploy service. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness"
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/service"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := harness.NewApplication(ctx, "example", &harness.ApplicationArgs{
//				Name: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = service.NewCodedeploy(ctx, "example", &service.CodedeployArgs{
//				AppId:       example.ID(),
//				Name:        pulumi.String("aws-codedeploy"),
//				Description: pulumi.String("Service for AWS codedeploy applications."),
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
// # Import using the Harness application id and service id
//
// ```sh
// $ pulumi import harness:service/codedeploy:Codedeploy example <app_id>/<svc_id>
// ```
type Codedeploy struct {
	pulumi.CustomResourceState

	// The id of the application the service belongs to
	AppId pulumi.StringOutput `pulumi:"appId"`
	// Description of th service
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the service
	Name pulumi.StringOutput `pulumi:"name"`
	// Variables to be used in the service
	Variables CodedeployVariableArrayOutput `pulumi:"variables"`
}

// NewCodedeploy registers a new resource with the given unique name, arguments, and options.
func NewCodedeploy(ctx *pulumi.Context,
	name string, args *CodedeployArgs, opts ...pulumi.ResourceOption) (*Codedeploy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Codedeploy
	err := ctx.RegisterResource("harness:service/codedeploy:Codedeploy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCodedeploy gets an existing Codedeploy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCodedeploy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CodedeployState, opts ...pulumi.ResourceOption) (*Codedeploy, error) {
	var resource Codedeploy
	err := ctx.ReadResource("harness:service/codedeploy:Codedeploy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Codedeploy resources.
type codedeployState struct {
	// The id of the application the service belongs to
	AppId *string `pulumi:"appId"`
	// Description of th service
	Description *string `pulumi:"description"`
	// Name of the service
	Name *string `pulumi:"name"`
	// Variables to be used in the service
	Variables []CodedeployVariable `pulumi:"variables"`
}

type CodedeployState struct {
	// The id of the application the service belongs to
	AppId pulumi.StringPtrInput
	// Description of th service
	Description pulumi.StringPtrInput
	// Name of the service
	Name pulumi.StringPtrInput
	// Variables to be used in the service
	Variables CodedeployVariableArrayInput
}

func (CodedeployState) ElementType() reflect.Type {
	return reflect.TypeOf((*codedeployState)(nil)).Elem()
}

type codedeployArgs struct {
	// The id of the application the service belongs to
	AppId string `pulumi:"appId"`
	// Description of th service
	Description *string `pulumi:"description"`
	// Name of the service
	Name *string `pulumi:"name"`
	// Variables to be used in the service
	Variables []CodedeployVariable `pulumi:"variables"`
}

// The set of arguments for constructing a Codedeploy resource.
type CodedeployArgs struct {
	// The id of the application the service belongs to
	AppId pulumi.StringInput
	// Description of th service
	Description pulumi.StringPtrInput
	// Name of the service
	Name pulumi.StringPtrInput
	// Variables to be used in the service
	Variables CodedeployVariableArrayInput
}

func (CodedeployArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*codedeployArgs)(nil)).Elem()
}

type CodedeployInput interface {
	pulumi.Input

	ToCodedeployOutput() CodedeployOutput
	ToCodedeployOutputWithContext(ctx context.Context) CodedeployOutput
}

func (*Codedeploy) ElementType() reflect.Type {
	return reflect.TypeOf((**Codedeploy)(nil)).Elem()
}

func (i *Codedeploy) ToCodedeployOutput() CodedeployOutput {
	return i.ToCodedeployOutputWithContext(context.Background())
}

func (i *Codedeploy) ToCodedeployOutputWithContext(ctx context.Context) CodedeployOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodedeployOutput)
}

// CodedeployArrayInput is an input type that accepts CodedeployArray and CodedeployArrayOutput values.
// You can construct a concrete instance of `CodedeployArrayInput` via:
//
//	CodedeployArray{ CodedeployArgs{...} }
type CodedeployArrayInput interface {
	pulumi.Input

	ToCodedeployArrayOutput() CodedeployArrayOutput
	ToCodedeployArrayOutputWithContext(context.Context) CodedeployArrayOutput
}

type CodedeployArray []CodedeployInput

func (CodedeployArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Codedeploy)(nil)).Elem()
}

func (i CodedeployArray) ToCodedeployArrayOutput() CodedeployArrayOutput {
	return i.ToCodedeployArrayOutputWithContext(context.Background())
}

func (i CodedeployArray) ToCodedeployArrayOutputWithContext(ctx context.Context) CodedeployArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodedeployArrayOutput)
}

// CodedeployMapInput is an input type that accepts CodedeployMap and CodedeployMapOutput values.
// You can construct a concrete instance of `CodedeployMapInput` via:
//
//	CodedeployMap{ "key": CodedeployArgs{...} }
type CodedeployMapInput interface {
	pulumi.Input

	ToCodedeployMapOutput() CodedeployMapOutput
	ToCodedeployMapOutputWithContext(context.Context) CodedeployMapOutput
}

type CodedeployMap map[string]CodedeployInput

func (CodedeployMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Codedeploy)(nil)).Elem()
}

func (i CodedeployMap) ToCodedeployMapOutput() CodedeployMapOutput {
	return i.ToCodedeployMapOutputWithContext(context.Background())
}

func (i CodedeployMap) ToCodedeployMapOutputWithContext(ctx context.Context) CodedeployMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodedeployMapOutput)
}

type CodedeployOutput struct{ *pulumi.OutputState }

func (CodedeployOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Codedeploy)(nil)).Elem()
}

func (o CodedeployOutput) ToCodedeployOutput() CodedeployOutput {
	return o
}

func (o CodedeployOutput) ToCodedeployOutputWithContext(ctx context.Context) CodedeployOutput {
	return o
}

// The id of the application the service belongs to
func (o CodedeployOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *Codedeploy) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// Description of th service
func (o CodedeployOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Codedeploy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the service
func (o CodedeployOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Codedeploy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Variables to be used in the service
func (o CodedeployOutput) Variables() CodedeployVariableArrayOutput {
	return o.ApplyT(func(v *Codedeploy) CodedeployVariableArrayOutput { return v.Variables }).(CodedeployVariableArrayOutput)
}

type CodedeployArrayOutput struct{ *pulumi.OutputState }

func (CodedeployArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Codedeploy)(nil)).Elem()
}

func (o CodedeployArrayOutput) ToCodedeployArrayOutput() CodedeployArrayOutput {
	return o
}

func (o CodedeployArrayOutput) ToCodedeployArrayOutputWithContext(ctx context.Context) CodedeployArrayOutput {
	return o
}

func (o CodedeployArrayOutput) Index(i pulumi.IntInput) CodedeployOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Codedeploy {
		return vs[0].([]*Codedeploy)[vs[1].(int)]
	}).(CodedeployOutput)
}

type CodedeployMapOutput struct{ *pulumi.OutputState }

func (CodedeployMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Codedeploy)(nil)).Elem()
}

func (o CodedeployMapOutput) ToCodedeployMapOutput() CodedeployMapOutput {
	return o
}

func (o CodedeployMapOutput) ToCodedeployMapOutputWithContext(ctx context.Context) CodedeployMapOutput {
	return o
}

func (o CodedeployMapOutput) MapIndex(k pulumi.StringInput) CodedeployOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Codedeploy {
		return vs[0].(map[string]*Codedeploy)[vs[1].(string)]
	}).(CodedeployOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CodedeployInput)(nil)).Elem(), &Codedeploy{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodedeployArrayInput)(nil)).Elem(), CodedeployArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodedeployMapInput)(nil)).Elem(), CodedeployMap{})
	pulumi.RegisterOutputType(CodedeployOutput{})
	pulumi.RegisterOutputType(CodedeployArrayOutput{})
	pulumi.RegisterOutputType(CodedeployMapOutput{})
}
