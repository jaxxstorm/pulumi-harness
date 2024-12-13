// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness pipeline.
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
//			// For account level template
//			_, err := platform.LookupTemplate(ctx, &platform.LookupTemplateArgs{
//				Identifier: pulumi.StringRef("identifier"),
//				Version:    pulumi.StringRef("version"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// For org level template
//			_, err = platform.LookupTemplate(ctx, &platform.LookupTemplateArgs{
//				Identifier: pulumi.StringRef("identifier"),
//				Version:    pulumi.StringRef("version"),
//				OrgId:      pulumi.StringRef("org_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// For project level template
//			_, err = platform.LookupTemplate(ctx, &platform.LookupTemplateArgs{
//				Identifier: pulumi.StringRef("identifier"),
//				Version:    pulumi.StringRef("version"),
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupTemplate(ctx *pulumi.Context, args *LookupTemplateArgs, opts ...pulumi.InvokeOption) (*LookupTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTemplateResult
	err := ctx.Invoke("harness:platform/getTemplate:getTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTemplate.
type LookupTemplateArgs struct {
	// Version Label for Template.
	BranchName *string `pulumi:"branchName"`
	// Defines child template type.
	ChildType *string `pulumi:"childType"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails *GetTemplateGitDetails `pulumi:"gitDetails"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// True if given version for template to be set as stable.
	IsStable *bool `pulumi:"isStable"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Scope of template.
	Scope *string `pulumi:"scope"`
	// Version Label for Template.
	Version *string `pulumi:"version"`
}

// A collection of values returned by getTemplate.
type LookupTemplateResult struct {
	// Version Label for Template.
	BranchName *string `pulumi:"branchName"`
	// Defines child template type.
	ChildType *string `pulumi:"childType"`
	// Identifier of the Harness Connector used for CRUD operations on the Entity.
	ConnectorRef string `pulumi:"connectorRef"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails *GetTemplateGitDetails `pulumi:"gitDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// True if given version for template to be set as stable.
	IsStable *bool `pulumi:"isStable"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Scope of template.
	Scope *string `pulumi:"scope"`
	// Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
	StoreType string `pulumi:"storeType"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Yaml for creating new Template.
	TemplateYaml string `pulumi:"templateYaml"`
	// Version Label for Template.
	Version *string `pulumi:"version"`
}

func LookupTemplateOutput(ctx *pulumi.Context, args LookupTemplateOutputArgs, opts ...pulumi.InvokeOption) LookupTemplateResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTemplateResultOutput, error) {
			args := v.(LookupTemplateArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getTemplate:getTemplate", args, LookupTemplateResultOutput{}, options).(LookupTemplateResultOutput), nil
		}).(LookupTemplateResultOutput)
}

// A collection of arguments for invoking getTemplate.
type LookupTemplateOutputArgs struct {
	// Version Label for Template.
	BranchName pulumi.StringPtrInput `pulumi:"branchName"`
	// Defines child template type.
	ChildType pulumi.StringPtrInput `pulumi:"childType"`
	// Contains parameters related to creating an Entity for Git Experience.
	GitDetails GetTemplateGitDetailsPtrInput `pulumi:"gitDetails"`
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// True if given version for template to be set as stable.
	IsStable pulumi.BoolPtrInput `pulumi:"isStable"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Scope of template.
	Scope pulumi.StringPtrInput `pulumi:"scope"`
	// Version Label for Template.
	Version pulumi.StringPtrInput `pulumi:"version"`
}

func (LookupTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getTemplate.
type LookupTemplateResultOutput struct{ *pulumi.OutputState }

func (LookupTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTemplateResult)(nil)).Elem()
}

func (o LookupTemplateResultOutput) ToLookupTemplateResultOutput() LookupTemplateResultOutput {
	return o
}

func (o LookupTemplateResultOutput) ToLookupTemplateResultOutputWithContext(ctx context.Context) LookupTemplateResultOutput {
	return o
}

// Version Label for Template.
func (o LookupTemplateResultOutput) BranchName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *string { return v.BranchName }).(pulumi.StringPtrOutput)
}

// Defines child template type.
func (o LookupTemplateResultOutput) ChildType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *string { return v.ChildType }).(pulumi.StringPtrOutput)
}

// Identifier of the Harness Connector used for CRUD operations on the Entity.
func (o LookupTemplateResultOutput) ConnectorRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTemplateResult) string { return v.ConnectorRef }).(pulumi.StringOutput)
}

// Description of the resource.
func (o LookupTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

// Contains parameters related to creating an Entity for Git Experience.
func (o LookupTemplateResultOutput) GitDetails() GetTemplateGitDetailsPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *GetTemplateGitDetails { return v.GitDetails }).(GetTemplateGitDetailsPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupTemplateResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// True if given version for template to be set as stable.
func (o LookupTemplateResultOutput) IsStable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *bool { return v.IsStable }).(pulumi.BoolPtrOutput)
}

// Name of the resource.
func (o LookupTemplateResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupTemplateResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupTemplateResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Scope of template.
func (o LookupTemplateResultOutput) Scope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *string { return v.Scope }).(pulumi.StringPtrOutput)
}

// Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
func (o LookupTemplateResultOutput) StoreType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTemplateResult) string { return v.StoreType }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o LookupTemplateResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTemplateResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Yaml for creating new Template.
func (o LookupTemplateResultOutput) TemplateYaml() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTemplateResult) string { return v.TemplateYaml }).(pulumi.StringOutput)
}

// Version Label for Template.
func (o LookupTemplateResultOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTemplateResult) *string { return v.Version }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTemplateResultOutput{})
}
