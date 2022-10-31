// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for craeting triggers in Harness.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewTriggers(ctx, "example", &platform.TriggersArgs{
//				Identifier: pulumi.String("identifier"),
//				OrgId:      pulumi.String("orgIdentifer"),
//				ProjectId:  pulumi.String("projectIdentifier"),
//				TargetId:   pulumi.String("pipelineIdentifier"),
//				Yaml: pulumi.String(fmt.Sprintf(`  trigger:
//	    name: "name"
//	    identifier: "identifier"
//	    enabled: true
//	    description: ""
//	    tags: {}
//	    projectIdentifier: "projectIdentifier"
//	    orgIdentifier: "orgIdentifer"
//	    pipelineIdentifier: "pipelineIdentifier"
//	    source:
//	      type: "Webhook"
//	      spec:
//	        type: "Github"
//	        spec:
//	          type: "Push"
//	          spec:
//	            connectorRef: "account.TestAccResourceConnectorGithub_Ssh_IZBeG"
//	            autoAbortPreviousExecutions: false
//	            payloadConditions:
//	            - key: "changedFiles"
//	              operator: "Equals"
//	              value: "value"
//	            - key: "targetBranch"
//	              operator: "Equals"
//	              value: "value"
//	            headerConditions: []
//	            repoName: "repoName"
//	            actions: []
//	    inputYaml: "pipeline: {}\n"
//
// `)),
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
// # Import using trigger id
//
// ```sh
//
//	$ pulumi import harness:platform/triggers:Triggers example <triggers_id>
//
// ```
type Triggers struct {
	pulumi.CustomResourceState

	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// if-Match
	IfMatch pulumi.StringPtrOutput `pulumi:"ifMatch"`
	// ignore error default false
	IgnoreError pulumi.BoolPtrOutput `pulumi:"ignoreError"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the Organization.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Identifier of the target pipeline
	TargetId pulumi.StringOutput `pulumi:"targetId"`
	// trigger yaml
	Yaml pulumi.StringOutput `pulumi:"yaml"`
}

// NewTriggers registers a new resource with the given unique name, arguments, and options.
func NewTriggers(ctx *pulumi.Context,
	name string, args *TriggersArgs, opts ...pulumi.ResourceOption) (*Triggers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
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
	if args.TargetId == nil {
		return nil, errors.New("invalid value for required argument 'TargetId'")
	}
	if args.Yaml == nil {
		return nil, errors.New("invalid value for required argument 'Yaml'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Triggers
	err := ctx.RegisterResource("harness:platform/triggers:Triggers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTriggers gets an existing Triggers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTriggers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TriggersState, opts ...pulumi.ResourceOption) (*Triggers, error) {
	var resource Triggers
	err := ctx.ReadResource("harness:platform/triggers:Triggers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Triggers resources.
type triggersState struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// if-Match
	IfMatch *string `pulumi:"ifMatch"`
	// ignore error default false
	IgnoreError *bool `pulumi:"ignoreError"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the Organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Identifier of the target pipeline
	TargetId *string `pulumi:"targetId"`
	// trigger yaml
	Yaml *string `pulumi:"yaml"`
}

type TriggersState struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// if-Match
	IfMatch pulumi.StringPtrInput
	// ignore error default false
	IgnoreError pulumi.BoolPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// Identifier of the target pipeline
	TargetId pulumi.StringPtrInput
	// trigger yaml
	Yaml pulumi.StringPtrInput
}

func (TriggersState) ElementType() reflect.Type {
	return reflect.TypeOf((*triggersState)(nil)).Elem()
}

type triggersArgs struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// if-Match
	IfMatch *string `pulumi:"ifMatch"`
	// ignore error default false
	IgnoreError *bool `pulumi:"ignoreError"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the Organization.
	OrgId string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Identifier of the target pipeline
	TargetId string `pulumi:"targetId"`
	// trigger yaml
	Yaml string `pulumi:"yaml"`
}

// The set of arguments for constructing a Triggers resource.
type TriggersArgs struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// if-Match
	IfMatch pulumi.StringPtrInput
	// ignore error default false
	IgnoreError pulumi.BoolPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the Organization.
	OrgId pulumi.StringInput
	// Unique identifier of the Project.
	ProjectId pulumi.StringInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// Identifier of the target pipeline
	TargetId pulumi.StringInput
	// trigger yaml
	Yaml pulumi.StringInput
}

func (TriggersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*triggersArgs)(nil)).Elem()
}

type TriggersInput interface {
	pulumi.Input

	ToTriggersOutput() TriggersOutput
	ToTriggersOutputWithContext(ctx context.Context) TriggersOutput
}

func (*Triggers) ElementType() reflect.Type {
	return reflect.TypeOf((**Triggers)(nil)).Elem()
}

func (i *Triggers) ToTriggersOutput() TriggersOutput {
	return i.ToTriggersOutputWithContext(context.Background())
}

func (i *Triggers) ToTriggersOutputWithContext(ctx context.Context) TriggersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggersOutput)
}

// TriggersArrayInput is an input type that accepts TriggersArray and TriggersArrayOutput values.
// You can construct a concrete instance of `TriggersArrayInput` via:
//
//	TriggersArray{ TriggersArgs{...} }
type TriggersArrayInput interface {
	pulumi.Input

	ToTriggersArrayOutput() TriggersArrayOutput
	ToTriggersArrayOutputWithContext(context.Context) TriggersArrayOutput
}

type TriggersArray []TriggersInput

func (TriggersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Triggers)(nil)).Elem()
}

func (i TriggersArray) ToTriggersArrayOutput() TriggersArrayOutput {
	return i.ToTriggersArrayOutputWithContext(context.Background())
}

func (i TriggersArray) ToTriggersArrayOutputWithContext(ctx context.Context) TriggersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggersArrayOutput)
}

// TriggersMapInput is an input type that accepts TriggersMap and TriggersMapOutput values.
// You can construct a concrete instance of `TriggersMapInput` via:
//
//	TriggersMap{ "key": TriggersArgs{...} }
type TriggersMapInput interface {
	pulumi.Input

	ToTriggersMapOutput() TriggersMapOutput
	ToTriggersMapOutputWithContext(context.Context) TriggersMapOutput
}

type TriggersMap map[string]TriggersInput

func (TriggersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Triggers)(nil)).Elem()
}

func (i TriggersMap) ToTriggersMapOutput() TriggersMapOutput {
	return i.ToTriggersMapOutputWithContext(context.Background())
}

func (i TriggersMap) ToTriggersMapOutputWithContext(ctx context.Context) TriggersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggersMapOutput)
}

type TriggersOutput struct{ *pulumi.OutputState }

func (TriggersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Triggers)(nil)).Elem()
}

func (o TriggersOutput) ToTriggersOutput() TriggersOutput {
	return o
}

func (o TriggersOutput) ToTriggersOutputWithContext(ctx context.Context) TriggersOutput {
	return o
}

// Description of the resource.
func (o TriggersOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o TriggersOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// if-Match
func (o TriggersOutput) IfMatch() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringPtrOutput { return v.IfMatch }).(pulumi.StringPtrOutput)
}

// ignore error default false
func (o TriggersOutput) IgnoreError() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Triggers) pulumi.BoolPtrOutput { return v.IgnoreError }).(pulumi.BoolPtrOutput)
}

// Name of the resource.
func (o TriggersOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the Organization.
func (o TriggersOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Unique identifier of the Project.
func (o TriggersOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o TriggersOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Identifier of the target pipeline
func (o TriggersOutput) TargetId() pulumi.StringOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringOutput { return v.TargetId }).(pulumi.StringOutput)
}

// trigger yaml
func (o TriggersOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v *Triggers) pulumi.StringOutput { return v.Yaml }).(pulumi.StringOutput)
}

type TriggersArrayOutput struct{ *pulumi.OutputState }

func (TriggersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Triggers)(nil)).Elem()
}

func (o TriggersArrayOutput) ToTriggersArrayOutput() TriggersArrayOutput {
	return o
}

func (o TriggersArrayOutput) ToTriggersArrayOutputWithContext(ctx context.Context) TriggersArrayOutput {
	return o
}

func (o TriggersArrayOutput) Index(i pulumi.IntInput) TriggersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Triggers {
		return vs[0].([]*Triggers)[vs[1].(int)]
	}).(TriggersOutput)
}

type TriggersMapOutput struct{ *pulumi.OutputState }

func (TriggersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Triggers)(nil)).Elem()
}

func (o TriggersMapOutput) ToTriggersMapOutput() TriggersMapOutput {
	return o
}

func (o TriggersMapOutput) ToTriggersMapOutputWithContext(ctx context.Context) TriggersMapOutput {
	return o
}

func (o TriggersMapOutput) MapIndex(k pulumi.StringInput) TriggersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Triggers {
		return vs[0].(map[string]*Triggers)[vs[1].(string)]
	}).(TriggersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TriggersInput)(nil)).Elem(), &Triggers{})
	pulumi.RegisterInputType(reflect.TypeOf((*TriggersArrayInput)(nil)).Elem(), TriggersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TriggersMapInput)(nil)).Elem(), TriggersMap{})
	pulumi.RegisterOutputType(TriggersOutput{})
	pulumi.RegisterOutputType(TriggersArrayOutput{})
	pulumi.RegisterOutputType(TriggersMapOutput{})
}
