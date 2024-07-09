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

// Resource for creating a Harness InputSet.
//
// ## Import
//
// # Import input set
//
// ```sh
// $ pulumi import harness:platform/inputSet:InputSet example <org_id>/<project_id>/<pipeline_id>/<input_set_id>
// ```
type InputSet struct {
	pulumi.CustomResourceState

	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails InputSetGitDetailsOutput `pulumi:"gitDetails"`
	// Contains Git Information for importing entities from Git
	GitImportInfo InputSetGitImportInfoPtrOutput `pulumi:"gitImportInfo"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Flag to set if importing from Git
	ImportFromGit pulumi.BoolPtrOutput `pulumi:"importFromGit"`
	// Contains parameters for importing a input set
	InputSetImportRequest InputSetInputSetImportRequestPtrOutput `pulumi:"inputSetImportRequest"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Identifier of the pipeline
	PipelineId pulumi.StringOutput `pulumi:"pipelineId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringOutput `pulumi:"yaml"`
}

// NewInputSet registers a new resource with the given unique name, arguments, and options.
func NewInputSet(ctx *pulumi.Context,
	name string, args *InputSetArgs, opts ...pulumi.ResourceOption) (*InputSet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.PipelineId == nil {
		return nil, errors.New("invalid value for required argument 'PipelineId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InputSet
	err := ctx.RegisterResource("harness:platform/inputSet:InputSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInputSet gets an existing InputSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInputSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InputSetState, opts ...pulumi.ResourceOption) (*InputSet, error) {
	var resource InputSet
	err := ctx.ReadResource("harness:platform/inputSet:InputSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InputSet resources.
type inputSetState struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails *InputSetGitDetails `pulumi:"gitDetails"`
	// Contains Git Information for importing entities from Git
	GitImportInfo *InputSetGitImportInfo `pulumi:"gitImportInfo"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Flag to set if importing from Git
	ImportFromGit *bool `pulumi:"importFromGit"`
	// Contains parameters for importing a input set
	InputSetImportRequest *InputSetInputSetImportRequest `pulumi:"inputSetImportRequest"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Identifier of the pipeline
	PipelineId *string `pulumi:"pipelineId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml *string `pulumi:"yaml"`
}

type InputSetState struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails InputSetGitDetailsPtrInput
	// Contains Git Information for importing entities from Git
	GitImportInfo InputSetGitImportInfoPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Flag to set if importing from Git
	ImportFromGit pulumi.BoolPtrInput
	// Contains parameters for importing a input set
	InputSetImportRequest InputSetInputSetImportRequestPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Identifier of the pipeline
	PipelineId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringPtrInput
}

func (InputSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*inputSetState)(nil)).Elem()
}

type inputSetArgs struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails *InputSetGitDetails `pulumi:"gitDetails"`
	// Contains Git Information for importing entities from Git
	GitImportInfo *InputSetGitImportInfo `pulumi:"gitImportInfo"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Flag to set if importing from Git
	ImportFromGit *bool `pulumi:"importFromGit"`
	// Contains parameters for importing a input set
	InputSetImportRequest *InputSetInputSetImportRequest `pulumi:"inputSetImportRequest"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId string `pulumi:"orgId"`
	// Identifier of the pipeline
	PipelineId string `pulumi:"pipelineId"`
	// Unique identifier of the project.
	ProjectId string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml *string `pulumi:"yaml"`
}

// The set of arguments for constructing a InputSet resource.
type InputSetArgs struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails InputSetGitDetailsPtrInput
	// Contains Git Information for importing entities from Git
	GitImportInfo InputSetGitImportInfoPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Flag to set if importing from Git
	ImportFromGit pulumi.BoolPtrInput
	// Contains parameters for importing a input set
	InputSetImportRequest InputSetInputSetImportRequestPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringInput
	// Identifier of the pipeline
	PipelineId pulumi.StringInput
	// Unique identifier of the project.
	ProjectId pulumi.StringInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringPtrInput
}

func (InputSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*inputSetArgs)(nil)).Elem()
}

type InputSetInput interface {
	pulumi.Input

	ToInputSetOutput() InputSetOutput
	ToInputSetOutputWithContext(ctx context.Context) InputSetOutput
}

func (*InputSet) ElementType() reflect.Type {
	return reflect.TypeOf((**InputSet)(nil)).Elem()
}

func (i *InputSet) ToInputSetOutput() InputSetOutput {
	return i.ToInputSetOutputWithContext(context.Background())
}

func (i *InputSet) ToInputSetOutputWithContext(ctx context.Context) InputSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputSetOutput)
}

// InputSetArrayInput is an input type that accepts InputSetArray and InputSetArrayOutput values.
// You can construct a concrete instance of `InputSetArrayInput` via:
//
//	InputSetArray{ InputSetArgs{...} }
type InputSetArrayInput interface {
	pulumi.Input

	ToInputSetArrayOutput() InputSetArrayOutput
	ToInputSetArrayOutputWithContext(context.Context) InputSetArrayOutput
}

type InputSetArray []InputSetInput

func (InputSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InputSet)(nil)).Elem()
}

func (i InputSetArray) ToInputSetArrayOutput() InputSetArrayOutput {
	return i.ToInputSetArrayOutputWithContext(context.Background())
}

func (i InputSetArray) ToInputSetArrayOutputWithContext(ctx context.Context) InputSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputSetArrayOutput)
}

// InputSetMapInput is an input type that accepts InputSetMap and InputSetMapOutput values.
// You can construct a concrete instance of `InputSetMapInput` via:
//
//	InputSetMap{ "key": InputSetArgs{...} }
type InputSetMapInput interface {
	pulumi.Input

	ToInputSetMapOutput() InputSetMapOutput
	ToInputSetMapOutputWithContext(context.Context) InputSetMapOutput
}

type InputSetMap map[string]InputSetInput

func (InputSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InputSet)(nil)).Elem()
}

func (i InputSetMap) ToInputSetMapOutput() InputSetMapOutput {
	return i.ToInputSetMapOutputWithContext(context.Background())
}

func (i InputSetMap) ToInputSetMapOutputWithContext(ctx context.Context) InputSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputSetMapOutput)
}

type InputSetOutput struct{ *pulumi.OutputState }

func (InputSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InputSet)(nil)).Elem()
}

func (o InputSetOutput) ToInputSetOutput() InputSetOutput {
	return o
}

func (o InputSetOutput) ToInputSetOutputWithContext(ctx context.Context) InputSetOutput {
	return o
}

// Description of the resource.
func (o InputSetOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InputSet) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Contains parameters related to creating an Entity for Git Experience.
func (o InputSetOutput) GitDetails() InputSetGitDetailsOutput {
	return o.ApplyT(func(v *InputSet) InputSetGitDetailsOutput { return v.GitDetails }).(InputSetGitDetailsOutput)
}

// Contains Git Information for importing entities from Git
func (o InputSetOutput) GitImportInfo() InputSetGitImportInfoPtrOutput {
	return o.ApplyT(func(v *InputSet) InputSetGitImportInfoPtrOutput { return v.GitImportInfo }).(InputSetGitImportInfoPtrOutput)
}

// Unique identifier of the resource.
func (o InputSetOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *InputSet) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Flag to set if importing from Git
func (o InputSetOutput) ImportFromGit() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *InputSet) pulumi.BoolPtrOutput { return v.ImportFromGit }).(pulumi.BoolPtrOutput)
}

// Contains parameters for importing a input set
func (o InputSetOutput) InputSetImportRequest() InputSetInputSetImportRequestPtrOutput {
	return o.ApplyT(func(v *InputSet) InputSetInputSetImportRequestPtrOutput { return v.InputSetImportRequest }).(InputSetInputSetImportRequestPtrOutput)
}

// Name of the resource.
func (o InputSetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InputSet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o InputSetOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *InputSet) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Identifier of the pipeline
func (o InputSetOutput) PipelineId() pulumi.StringOutput {
	return o.ApplyT(func(v *InputSet) pulumi.StringOutput { return v.PipelineId }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o InputSetOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *InputSet) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o InputSetOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InputSet) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Input Set YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
func (o InputSetOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v *InputSet) pulumi.StringOutput { return v.Yaml }).(pulumi.StringOutput)
}

type InputSetArrayOutput struct{ *pulumi.OutputState }

func (InputSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InputSet)(nil)).Elem()
}

func (o InputSetArrayOutput) ToInputSetArrayOutput() InputSetArrayOutput {
	return o
}

func (o InputSetArrayOutput) ToInputSetArrayOutputWithContext(ctx context.Context) InputSetArrayOutput {
	return o
}

func (o InputSetArrayOutput) Index(i pulumi.IntInput) InputSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InputSet {
		return vs[0].([]*InputSet)[vs[1].(int)]
	}).(InputSetOutput)
}

type InputSetMapOutput struct{ *pulumi.OutputState }

func (InputSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InputSet)(nil)).Elem()
}

func (o InputSetMapOutput) ToInputSetMapOutput() InputSetMapOutput {
	return o
}

func (o InputSetMapOutput) ToInputSetMapOutputWithContext(ctx context.Context) InputSetMapOutput {
	return o
}

func (o InputSetMapOutput) MapIndex(k pulumi.StringInput) InputSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InputSet {
		return vs[0].(map[string]*InputSet)[vs[1].(string)]
	}).(InputSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InputSetInput)(nil)).Elem(), &InputSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputSetArrayInput)(nil)).Elem(), InputSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputSetMapInput)(nil)).Elem(), InputSetMap{})
	pulumi.RegisterOutputType(InputSetOutput{})
	pulumi.RegisterOutputType(InputSetArrayOutput{})
	pulumi.RegisterOutputType(InputSetMapOutput{})
}
