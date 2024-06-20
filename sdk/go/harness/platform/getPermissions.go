// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving permissions.
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
//			_, err := platform.GetPermissions(ctx, &platform.GetPermissionsArgs{
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
func GetPermissions(ctx *pulumi.Context, args *GetPermissionsArgs, opts ...pulumi.InvokeOption) (*GetPermissionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPermissionsResult
	err := ctx.Invoke("harness:platform/getPermissions:getPermissions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPermissions.
type GetPermissionsArgs struct {
	// Organization Identifier
	OrgId *string `pulumi:"orgId"`
	// Project Identifier
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getPermissions.
type GetPermissionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Organization Identifier
	OrgId *string `pulumi:"orgId"`
	// Response of the api
	Permissions []GetPermissionsPermission `pulumi:"permissions"`
	// Project Identifier
	ProjectId *string `pulumi:"projectId"`
}

func GetPermissionsOutput(ctx *pulumi.Context, args GetPermissionsOutputArgs, opts ...pulumi.InvokeOption) GetPermissionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPermissionsResult, error) {
			args := v.(GetPermissionsArgs)
			r, err := GetPermissions(ctx, &args, opts...)
			var s GetPermissionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPermissionsResultOutput)
}

// A collection of arguments for invoking getPermissions.
type GetPermissionsOutputArgs struct {
	// Organization Identifier
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project Identifier
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (GetPermissionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPermissionsArgs)(nil)).Elem()
}

// A collection of values returned by getPermissions.
type GetPermissionsResultOutput struct{ *pulumi.OutputState }

func (GetPermissionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPermissionsResult)(nil)).Elem()
}

func (o GetPermissionsResultOutput) ToGetPermissionsResultOutput() GetPermissionsResultOutput {
	return o
}

func (o GetPermissionsResultOutput) ToGetPermissionsResultOutputWithContext(ctx context.Context) GetPermissionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPermissionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPermissionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Organization Identifier
func (o GetPermissionsResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPermissionsResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Response of the api
func (o GetPermissionsResultOutput) Permissions() GetPermissionsPermissionArrayOutput {
	return o.ApplyT(func(v GetPermissionsResult) []GetPermissionsPermission { return v.Permissions }).(GetPermissionsPermissionArrayOutput)
}

// Project Identifier
func (o GetPermissionsResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPermissionsResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPermissionsResultOutput{})
}
