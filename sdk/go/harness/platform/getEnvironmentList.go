// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving Harness environment list.
//
// ## Example Usage
//
// ### Project Level Environment List
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
//			_, err := platform.GetEnvironmentList(ctx, &platform.GetEnvironmentListArgs{
//				OrgId:     pulumi.StringRef("org_id"),
//				ProjectId: pulumi.StringRef("project_id"),
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
// ### Organisation Level Environment List
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
//			_, err := platform.GetEnvironmentList(ctx, &platform.GetEnvironmentListArgs{
//				OrgId: pulumi.StringRef("org_id"),
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
// ### Account Level Environment List
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
//			_, err := platform.GetEnvironmentList(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetEnvironmentList(ctx *pulumi.Context, args *GetEnvironmentListArgs, opts ...pulumi.InvokeOption) (*GetEnvironmentListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEnvironmentListResult
	err := ctx.Invoke("harness:platform/getEnvironmentList:getEnvironmentList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironmentList.
type GetEnvironmentListArgs struct {
	OrgId     *string `pulumi:"orgId"`
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getEnvironmentList.
type GetEnvironmentListResult struct {
	Environments []GetEnvironmentListEnvironment `pulumi:"environments"`
	// The provider-assigned unique ID for this managed resource.
	Id        string  `pulumi:"id"`
	OrgId     *string `pulumi:"orgId"`
	ProjectId *string `pulumi:"projectId"`
}

func GetEnvironmentListOutput(ctx *pulumi.Context, args GetEnvironmentListOutputArgs, opts ...pulumi.InvokeOption) GetEnvironmentListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEnvironmentListResult, error) {
			args := v.(GetEnvironmentListArgs)
			r, err := GetEnvironmentList(ctx, &args, opts...)
			var s GetEnvironmentListResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEnvironmentListResultOutput)
}

// A collection of arguments for invoking getEnvironmentList.
type GetEnvironmentListOutputArgs struct {
	OrgId     pulumi.StringPtrInput `pulumi:"orgId"`
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (GetEnvironmentListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnvironmentListArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironmentList.
type GetEnvironmentListResultOutput struct{ *pulumi.OutputState }

func (GetEnvironmentListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnvironmentListResult)(nil)).Elem()
}

func (o GetEnvironmentListResultOutput) ToGetEnvironmentListResultOutput() GetEnvironmentListResultOutput {
	return o
}

func (o GetEnvironmentListResultOutput) ToGetEnvironmentListResultOutputWithContext(ctx context.Context) GetEnvironmentListResultOutput {
	return o
}

func (o GetEnvironmentListResultOutput) Environments() GetEnvironmentListEnvironmentArrayOutput {
	return o.ApplyT(func(v GetEnvironmentListResult) []GetEnvironmentListEnvironment { return v.Environments }).(GetEnvironmentListEnvironmentArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEnvironmentListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEnvironmentListResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEnvironmentListResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnvironmentListResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o GetEnvironmentListResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnvironmentListResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEnvironmentListResultOutput{})
}
