// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving Harness project list.
//
// ## Example Usage
//
// ### Org level Project list
//
// ### Without the Pagination
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
//			_, err := platform.GetProjectList(ctx, &platform.GetProjectListArgs{
//				OrgId: "org_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### With Pagination Logic
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
//			_, err := platform.GetProjectList(ctx, &platform.GetProjectListArgs{
//				OrgId: "org_id",
//				Page:  pulumi.IntRef(1),
//				Limit: pulumi.IntRef(4),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetProjectList(ctx *pulumi.Context, args *GetProjectListArgs, opts ...pulumi.InvokeOption) (*GetProjectListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProjectListResult
	err := ctx.Invoke("harness:platform/getProjectList:getProjectList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectList.
type GetProjectListArgs struct {
	Identifier *string `pulumi:"identifier"`
	// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
	Limit *int    `pulumi:"limit"`
	Name  *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId string `pulumi:"orgId"`
	// Optional pagination parameter indicating the page number when retrieving entities.
	Page *int `pulumi:"page"`
}

// A collection of values returned by getProjectList.
type GetProjectListResult struct {
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	Identifier *string `pulumi:"identifier"`
	// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
	Limit *int    `pulumi:"limit"`
	Name  *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId string `pulumi:"orgId"`
	// Optional pagination parameter indicating the page number when retrieving entities.
	Page *int `pulumi:"page"`
	// Containing list of all projects with details identifier and name.
	Projects []GetProjectListProject `pulumi:"projects"`
	Tags     []string                `pulumi:"tags"`
}

func GetProjectListOutput(ctx *pulumi.Context, args GetProjectListOutputArgs, opts ...pulumi.InvokeOption) GetProjectListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProjectListResult, error) {
			args := v.(GetProjectListArgs)
			r, err := GetProjectList(ctx, &args, opts...)
			var s GetProjectListResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProjectListResultOutput)
}

// A collection of arguments for invoking getProjectList.
type GetProjectListOutputArgs struct {
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
	Limit pulumi.IntPtrInput    `pulumi:"limit"`
	Name  pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Optional pagination parameter indicating the page number when retrieving entities.
	Page pulumi.IntPtrInput `pulumi:"page"`
}

func (GetProjectListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectListArgs)(nil)).Elem()
}

// A collection of values returned by getProjectList.
type GetProjectListResultOutput struct{ *pulumi.OutputState }

func (GetProjectListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectListResult)(nil)).Elem()
}

func (o GetProjectListResultOutput) ToGetProjectListResultOutput() GetProjectListResultOutput {
	return o
}

func (o GetProjectListResultOutput) ToGetProjectListResultOutputWithContext(ctx context.Context) GetProjectListResultOutput {
	return o
}

func (o GetProjectListResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectListResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetProjectListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectListResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetProjectListResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProjectListResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Optional pagination parameter indicating the maximum number of entities to retrieve per page.
func (o GetProjectListResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetProjectListResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

func (o GetProjectListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProjectListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o GetProjectListResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectListResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Optional pagination parameter indicating the page number when retrieving entities.
func (o GetProjectListResultOutput) Page() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetProjectListResult) *int { return v.Page }).(pulumi.IntPtrOutput)
}

// Containing list of all projects with details identifier and name.
func (o GetProjectListResultOutput) Projects() GetProjectListProjectArrayOutput {
	return o.ApplyT(func(v GetProjectListResult) []GetProjectListProject { return v.Projects }).(GetProjectListProjectArrayOutput)
}

func (o GetProjectListResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProjectListResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProjectListResultOutput{})
}
