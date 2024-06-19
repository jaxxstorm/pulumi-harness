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

// Resource for creating a Harness environment group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewEnvironmentGroup(ctx, "example", &platform.EnvironmentGroupArgs{
//				Identifier: pulumi.String("identifier"),
//				OrgId:      pulumi.String("orgIdentifer"),
//				ProjectId:  pulumi.String("projectIdentifier"),
//				Color:      pulumi.String("#0063F7"),
//				Yaml: pulumi.String(`environmentGroup:
//	  name: "name"
//	  identifier: "identifier"
//	  description: "temp"
//	  orgIdentifier: "orgIdentifer"
//	  projectIdentifier: "projectIdentifier"
//	  envIdentifiers: []
//
// `),
//
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
// Import using the environment group id.
//
// ```sh
// $ pulumi import harness:platform/environmentGroup:EnvironmentGroup example <org_id>/<project_id>/<environment_group_id>
// ```
type EnvironmentGroup struct {
	pulumi.CustomResourceState

	// Color of the environment group.
	Color pulumi.StringOutput `pulumi:"color"`
	// Enable this flag for force deletion of environment group
	ForceDelete pulumi.StringOutput `pulumi:"forceDelete"`
	// identifier of the environment group.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// org_id of the environment group.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// project_id of the environment group.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringOutput `pulumi:"yaml"`
}

// NewEnvironmentGroup registers a new resource with the given unique name, arguments, and options.
func NewEnvironmentGroup(ctx *pulumi.Context,
	name string, args *EnvironmentGroupArgs, opts ...pulumi.ResourceOption) (*EnvironmentGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Yaml == nil {
		return nil, errors.New("invalid value for required argument 'Yaml'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EnvironmentGroup
	err := ctx.RegisterResource("harness:platform/environmentGroup:EnvironmentGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnvironmentGroup gets an existing EnvironmentGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnvironmentGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnvironmentGroupState, opts ...pulumi.ResourceOption) (*EnvironmentGroup, error) {
	var resource EnvironmentGroup
	err := ctx.ReadResource("harness:platform/environmentGroup:EnvironmentGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnvironmentGroup resources.
type environmentGroupState struct {
	// Color of the environment group.
	Color *string `pulumi:"color"`
	// Enable this flag for force deletion of environment group
	ForceDelete *string `pulumi:"forceDelete"`
	// identifier of the environment group.
	Identifier *string `pulumi:"identifier"`
	// org_id of the environment group.
	OrgId *string `pulumi:"orgId"`
	// project_id of the environment group.
	ProjectId *string `pulumi:"projectId"`
	// Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml *string `pulumi:"yaml"`
}

type EnvironmentGroupState struct {
	// Color of the environment group.
	Color pulumi.StringPtrInput
	// Enable this flag for force deletion of environment group
	ForceDelete pulumi.StringPtrInput
	// identifier of the environment group.
	Identifier pulumi.StringPtrInput
	// org_id of the environment group.
	OrgId pulumi.StringPtrInput
	// project_id of the environment group.
	ProjectId pulumi.StringPtrInput
	// Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringPtrInput
}

func (EnvironmentGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentGroupState)(nil)).Elem()
}

type environmentGroupArgs struct {
	// Color of the environment group.
	Color *string `pulumi:"color"`
	// Enable this flag for force deletion of environment group
	ForceDelete *string `pulumi:"forceDelete"`
	// identifier of the environment group.
	Identifier string `pulumi:"identifier"`
	// org_id of the environment group.
	OrgId *string `pulumi:"orgId"`
	// project_id of the environment group.
	ProjectId *string `pulumi:"projectId"`
	// Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml string `pulumi:"yaml"`
}

// The set of arguments for constructing a EnvironmentGroup resource.
type EnvironmentGroupArgs struct {
	// Color of the environment group.
	Color pulumi.StringPtrInput
	// Enable this flag for force deletion of environment group
	ForceDelete pulumi.StringPtrInput
	// identifier of the environment group.
	Identifier pulumi.StringInput
	// org_id of the environment group.
	OrgId pulumi.StringPtrInput
	// project_id of the environment group.
	ProjectId pulumi.StringPtrInput
	// Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringInput
}

func (EnvironmentGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentGroupArgs)(nil)).Elem()
}

type EnvironmentGroupInput interface {
	pulumi.Input

	ToEnvironmentGroupOutput() EnvironmentGroupOutput
	ToEnvironmentGroupOutputWithContext(ctx context.Context) EnvironmentGroupOutput
}

func (*EnvironmentGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentGroup)(nil)).Elem()
}

func (i *EnvironmentGroup) ToEnvironmentGroupOutput() EnvironmentGroupOutput {
	return i.ToEnvironmentGroupOutputWithContext(context.Background())
}

func (i *EnvironmentGroup) ToEnvironmentGroupOutputWithContext(ctx context.Context) EnvironmentGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentGroupOutput)
}

// EnvironmentGroupArrayInput is an input type that accepts EnvironmentGroupArray and EnvironmentGroupArrayOutput values.
// You can construct a concrete instance of `EnvironmentGroupArrayInput` via:
//
//	EnvironmentGroupArray{ EnvironmentGroupArgs{...} }
type EnvironmentGroupArrayInput interface {
	pulumi.Input

	ToEnvironmentGroupArrayOutput() EnvironmentGroupArrayOutput
	ToEnvironmentGroupArrayOutputWithContext(context.Context) EnvironmentGroupArrayOutput
}

type EnvironmentGroupArray []EnvironmentGroupInput

func (EnvironmentGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentGroup)(nil)).Elem()
}

func (i EnvironmentGroupArray) ToEnvironmentGroupArrayOutput() EnvironmentGroupArrayOutput {
	return i.ToEnvironmentGroupArrayOutputWithContext(context.Background())
}

func (i EnvironmentGroupArray) ToEnvironmentGroupArrayOutputWithContext(ctx context.Context) EnvironmentGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentGroupArrayOutput)
}

// EnvironmentGroupMapInput is an input type that accepts EnvironmentGroupMap and EnvironmentGroupMapOutput values.
// You can construct a concrete instance of `EnvironmentGroupMapInput` via:
//
//	EnvironmentGroupMap{ "key": EnvironmentGroupArgs{...} }
type EnvironmentGroupMapInput interface {
	pulumi.Input

	ToEnvironmentGroupMapOutput() EnvironmentGroupMapOutput
	ToEnvironmentGroupMapOutputWithContext(context.Context) EnvironmentGroupMapOutput
}

type EnvironmentGroupMap map[string]EnvironmentGroupInput

func (EnvironmentGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentGroup)(nil)).Elem()
}

func (i EnvironmentGroupMap) ToEnvironmentGroupMapOutput() EnvironmentGroupMapOutput {
	return i.ToEnvironmentGroupMapOutputWithContext(context.Background())
}

func (i EnvironmentGroupMap) ToEnvironmentGroupMapOutputWithContext(ctx context.Context) EnvironmentGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentGroupMapOutput)
}

type EnvironmentGroupOutput struct{ *pulumi.OutputState }

func (EnvironmentGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentGroup)(nil)).Elem()
}

func (o EnvironmentGroupOutput) ToEnvironmentGroupOutput() EnvironmentGroupOutput {
	return o
}

func (o EnvironmentGroupOutput) ToEnvironmentGroupOutputWithContext(ctx context.Context) EnvironmentGroupOutput {
	return o
}

// Color of the environment group.
func (o EnvironmentGroupOutput) Color() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentGroup) pulumi.StringOutput { return v.Color }).(pulumi.StringOutput)
}

// Enable this flag for force deletion of environment group
func (o EnvironmentGroupOutput) ForceDelete() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentGroup) pulumi.StringOutput { return v.ForceDelete }).(pulumi.StringOutput)
}

// identifier of the environment group.
func (o EnvironmentGroupOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentGroup) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// org_id of the environment group.
func (o EnvironmentGroupOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentGroup) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// project_id of the environment group.
func (o EnvironmentGroupOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentGroup) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Env group YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
func (o EnvironmentGroupOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentGroup) pulumi.StringOutput { return v.Yaml }).(pulumi.StringOutput)
}

type EnvironmentGroupArrayOutput struct{ *pulumi.OutputState }

func (EnvironmentGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentGroup)(nil)).Elem()
}

func (o EnvironmentGroupArrayOutput) ToEnvironmentGroupArrayOutput() EnvironmentGroupArrayOutput {
	return o
}

func (o EnvironmentGroupArrayOutput) ToEnvironmentGroupArrayOutputWithContext(ctx context.Context) EnvironmentGroupArrayOutput {
	return o
}

func (o EnvironmentGroupArrayOutput) Index(i pulumi.IntInput) EnvironmentGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnvironmentGroup {
		return vs[0].([]*EnvironmentGroup)[vs[1].(int)]
	}).(EnvironmentGroupOutput)
}

type EnvironmentGroupMapOutput struct{ *pulumi.OutputState }

func (EnvironmentGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentGroup)(nil)).Elem()
}

func (o EnvironmentGroupMapOutput) ToEnvironmentGroupMapOutput() EnvironmentGroupMapOutput {
	return o
}

func (o EnvironmentGroupMapOutput) ToEnvironmentGroupMapOutputWithContext(ctx context.Context) EnvironmentGroupMapOutput {
	return o
}

func (o EnvironmentGroupMapOutput) MapIndex(k pulumi.StringInput) EnvironmentGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnvironmentGroup {
		return vs[0].(map[string]*EnvironmentGroup)[vs[1].(string)]
	}).(EnvironmentGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentGroupInput)(nil)).Elem(), &EnvironmentGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentGroupArrayInput)(nil)).Elem(), EnvironmentGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentGroupMapInput)(nil)).Elem(), EnvironmentGroupMap{})
	pulumi.RegisterOutputType(EnvironmentGroupOutput{})
	pulumi.RegisterOutputType(EnvironmentGroupArrayOutput{})
	pulumi.RegisterOutputType(EnvironmentGroupMapOutput{})
}
