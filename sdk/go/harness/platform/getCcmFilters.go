// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness CCM Filter.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.GetCcmFilters(ctx, &platform.GetCcmFiltersArgs{
//				Identifier: "identifier",
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//				Type:       "CCMRecommendation",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetCcmFilters(ctx *pulumi.Context, args *GetCcmFiltersArgs, opts ...pulumi.InvokeOption) (*GetCcmFiltersResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetCcmFiltersResult
	err := ctx.Invoke("harness:platform/getCcmFilters:getCcmFilters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCcmFilters.
type GetCcmFiltersArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Organization Identifier for the Entity.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId *string `pulumi:"projectId"`
	// Type of filter.
	Type string `pulumi:"type"`
}

// A collection of values returned by getCcmFilters.
type GetCcmFiltersResult struct {
	// Properties of the filter entity defined in Harness.
	FilterProperties []GetCcmFiltersFilterProperty `pulumi:"filterProperties"`
	// This indicates visibility of filter. By default, everyone can view this filter.
	FilterVisibility string `pulumi:"filterVisibility"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the Filter.
	Name string `pulumi:"name"`
	// Organization Identifier for the Entity.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId *string `pulumi:"projectId"`
	// Type of filter.
	Type string `pulumi:"type"`
}

func GetCcmFiltersOutput(ctx *pulumi.Context, args GetCcmFiltersOutputArgs, opts ...pulumi.InvokeOption) GetCcmFiltersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCcmFiltersResult, error) {
			args := v.(GetCcmFiltersArgs)
			r, err := GetCcmFilters(ctx, &args, opts...)
			var s GetCcmFiltersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCcmFiltersResultOutput)
}

// A collection of arguments for invoking getCcmFilters.
type GetCcmFiltersOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Organization Identifier for the Entity.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Type of filter.
	Type pulumi.StringInput `pulumi:"type"`
}

func (GetCcmFiltersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCcmFiltersArgs)(nil)).Elem()
}

// A collection of values returned by getCcmFilters.
type GetCcmFiltersResultOutput struct{ *pulumi.OutputState }

func (GetCcmFiltersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCcmFiltersResult)(nil)).Elem()
}

func (o GetCcmFiltersResultOutput) ToGetCcmFiltersResultOutput() GetCcmFiltersResultOutput {
	return o
}

func (o GetCcmFiltersResultOutput) ToGetCcmFiltersResultOutputWithContext(ctx context.Context) GetCcmFiltersResultOutput {
	return o
}

// Properties of the filter entity defined in Harness.
func (o GetCcmFiltersResultOutput) FilterProperties() GetCcmFiltersFilterPropertyArrayOutput {
	return o.ApplyT(func(v GetCcmFiltersResult) []GetCcmFiltersFilterProperty { return v.FilterProperties }).(GetCcmFiltersFilterPropertyArrayOutput)
}

// This indicates visibility of filter. By default, everyone can view this filter.
func (o GetCcmFiltersResultOutput) FilterVisibility() pulumi.StringOutput {
	return o.ApplyT(func(v GetCcmFiltersResult) string { return v.FilterVisibility }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCcmFiltersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCcmFiltersResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o GetCcmFiltersResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetCcmFiltersResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the Filter.
func (o GetCcmFiltersResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetCcmFiltersResult) string { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier for the Entity.
func (o GetCcmFiltersResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCcmFiltersResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project Identifier for the Entity.
func (o GetCcmFiltersResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCcmFiltersResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Type of filter.
func (o GetCcmFiltersResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetCcmFiltersResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCcmFiltersResultOutput{})
}
