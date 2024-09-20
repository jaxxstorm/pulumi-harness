// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving Harness service list.
//
// ## Example Usage
//
// ### Project Level Service List
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
//			_, err := platform.GetServiceList(ctx, &platform.GetServiceListArgs{
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
// ### Organisation Level Service List
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
//			_, err := platform.GetServiceList(ctx, &platform.GetServiceListArgs{
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
// ### Account Level Service List
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
//			_, err := platform.GetServiceList(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetServiceList(ctx *pulumi.Context, args *GetServiceListArgs, opts ...pulumi.InvokeOption) (*GetServiceListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceListResult
	err := ctx.Invoke("harness:platform/getServiceList:getServiceList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceList.
type GetServiceListArgs struct {
	OrgId     *string `pulumi:"orgId"`
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getServiceList.
type GetServiceListResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string                  `pulumi:"id"`
	OrgId     *string                 `pulumi:"orgId"`
	ProjectId *string                 `pulumi:"projectId"`
	Services  []GetServiceListService `pulumi:"services"`
}

func GetServiceListOutput(ctx *pulumi.Context, args GetServiceListOutputArgs, opts ...pulumi.InvokeOption) GetServiceListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceListResultOutput, error) {
			args := v.(GetServiceListArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetServiceListResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getServiceList:getServiceList", args, &rv, "", opts...)
			if err != nil {
				return GetServiceListResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetServiceListResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetServiceListResultOutput), nil
			}
			return output, nil
		}).(GetServiceListResultOutput)
}

// A collection of arguments for invoking getServiceList.
type GetServiceListOutputArgs struct {
	OrgId     pulumi.StringPtrInput `pulumi:"orgId"`
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (GetServiceListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceListArgs)(nil)).Elem()
}

// A collection of values returned by getServiceList.
type GetServiceListResultOutput struct{ *pulumi.OutputState }

func (GetServiceListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceListResult)(nil)).Elem()
}

func (o GetServiceListResultOutput) ToGetServiceListResultOutput() GetServiceListResultOutput {
	return o
}

func (o GetServiceListResultOutput) ToGetServiceListResultOutputWithContext(ctx context.Context) GetServiceListResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceListResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServiceListResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceListResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o GetServiceListResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceListResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

func (o GetServiceListResultOutput) Services() GetServiceListServiceArrayOutput {
	return o.ApplyT(func(v GetServiceListResult) []GetServiceListService { return v.Services }).(GetServiceListServiceArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceListResultOutput{})
}
