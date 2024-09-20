// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving workspace outputs.
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
//			_, err := platform.GetWorkspaceOutputValue(ctx, &platform.GetWorkspaceOutputValueArgs{
//				Identifier: "identifier",
//				OrgId:      "org_id",
//				ProjectId:  "project_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetWorkspaceOutputValue(ctx *pulumi.Context, args *GetWorkspaceOutputValueArgs, opts ...pulumi.InvokeOption) (*GetWorkspaceOutputValueResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWorkspaceOutputValueResult
	err := ctx.Invoke("harness:platform/getWorkspaceOutputValue:getWorkspaceOutputValue", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWorkspaceOutputValue.
type GetWorkspaceOutputValueArgs struct {
	// Identifier of the Workspace.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the organization the workspace resides in.
	OrgId string `pulumi:"orgId"`
	// Project identifier of the project the workspace resides in.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getWorkspaceOutputValue.
type GetWorkspaceOutputValueResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the Workspace.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the organization the workspace resides in.
	OrgId        string                               `pulumi:"orgId"`
	OutputValues []GetWorkspaceOutputValueOutputValue `pulumi:"outputValues"`
	// Project identifier of the project the workspace resides in.
	ProjectId string `pulumi:"projectId"`
}

func GetWorkspaceOutputValueOutput(ctx *pulumi.Context, args GetWorkspaceOutputValueOutputArgs, opts ...pulumi.InvokeOption) GetWorkspaceOutputValueResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWorkspaceOutputValueResultOutput, error) {
			args := v.(GetWorkspaceOutputValueArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetWorkspaceOutputValueResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getWorkspaceOutputValue:getWorkspaceOutputValue", args, &rv, "", opts...)
			if err != nil {
				return GetWorkspaceOutputValueResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetWorkspaceOutputValueResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetWorkspaceOutputValueResultOutput), nil
			}
			return output, nil
		}).(GetWorkspaceOutputValueResultOutput)
}

// A collection of arguments for invoking getWorkspaceOutputValue.
type GetWorkspaceOutputValueOutputArgs struct {
	// Identifier of the Workspace.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Organization identifier of the organization the workspace resides in.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Project identifier of the project the workspace resides in.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (GetWorkspaceOutputValueOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWorkspaceOutputValueArgs)(nil)).Elem()
}

// A collection of values returned by getWorkspaceOutputValue.
type GetWorkspaceOutputValueResultOutput struct{ *pulumi.OutputState }

func (GetWorkspaceOutputValueResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWorkspaceOutputValueResult)(nil)).Elem()
}

func (o GetWorkspaceOutputValueResultOutput) ToGetWorkspaceOutputValueResultOutput() GetWorkspaceOutputValueResultOutput {
	return o
}

func (o GetWorkspaceOutputValueResultOutput) ToGetWorkspaceOutputValueResultOutputWithContext(ctx context.Context) GetWorkspaceOutputValueResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetWorkspaceOutputValueResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWorkspaceOutputValueResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the Workspace.
func (o GetWorkspaceOutputValueResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetWorkspaceOutputValueResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Organization identifier of the organization the workspace resides in.
func (o GetWorkspaceOutputValueResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWorkspaceOutputValueResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetWorkspaceOutputValueResultOutput) OutputValues() GetWorkspaceOutputValueOutputValueArrayOutput {
	return o.ApplyT(func(v GetWorkspaceOutputValueResult) []GetWorkspaceOutputValueOutputValue { return v.OutputValues }).(GetWorkspaceOutputValueOutputValueArrayOutput)
}

// Project identifier of the project the workspace resides in.
func (o GetWorkspaceOutputValueResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWorkspaceOutputValueResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWorkspaceOutputValueResultOutput{})
}
