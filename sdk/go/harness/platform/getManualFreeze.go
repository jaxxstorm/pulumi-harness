// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// DataSource for deployment freeze in harness.
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
//			_, err := platform.LookupManualFreeze(ctx, &platform.LookupManualFreezeArgs{
//				Identifier: "identifier",
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//				AccountId:  "account_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupManualFreeze(ctx *pulumi.Context, args *LookupManualFreezeArgs, opts ...pulumi.InvokeOption) (*LookupManualFreezeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupManualFreezeResult
	err := ctx.Invoke("harness:platform/getManualFreeze:getManualFreeze", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getManualFreeze.
type LookupManualFreezeArgs struct {
	// Account Identifier of the freeze
	AccountId string `pulumi:"accountId"`
	// Identifier of the freeze
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the freeze
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the freeze
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getManualFreeze.
type LookupManualFreezeResult struct {
	// Account Identifier of the freeze
	AccountId string `pulumi:"accountId"`
	// Current or upcoming windows
	CurrentOrUpcomingWindows []GetManualFreezeCurrentOrUpcomingWindow `pulumi:"currentOrUpcomingWindows"`
	// Description of the freeze
	Description string `pulumi:"description"`
	// Freeze windows in the freeze response
	FreezeWindows []GetManualFreezeFreezeWindow `pulumi:"freezeWindows"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the freeze
	Identifier string `pulumi:"identifier"`
	// Name of the freeze
	Name string `pulumi:"name"`
	// Organization identifier of the freeze
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the freeze
	ProjectId *string `pulumi:"projectId"`
	// Scope of the freeze
	Scope string `pulumi:"scope"`
	// Status of the freeze
	Status string `pulumi:"status"`
	// Tags associated with the freeze
	Tags []string `pulumi:"tags"`
	// Type of freeze
	Type string `pulumi:"type"`
	// Yaml of the freeze
	Yaml string `pulumi:"yaml"`
}

func LookupManualFreezeOutput(ctx *pulumi.Context, args LookupManualFreezeOutputArgs, opts ...pulumi.InvokeOption) LookupManualFreezeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupManualFreezeResult, error) {
			args := v.(LookupManualFreezeArgs)
			r, err := LookupManualFreeze(ctx, &args, opts...)
			var s LookupManualFreezeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupManualFreezeResultOutput)
}

// A collection of arguments for invoking getManualFreeze.
type LookupManualFreezeOutputArgs struct {
	// Account Identifier of the freeze
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Identifier of the freeze
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Organization identifier of the freeze
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project identifier of the freeze
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupManualFreezeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupManualFreezeArgs)(nil)).Elem()
}

// A collection of values returned by getManualFreeze.
type LookupManualFreezeResultOutput struct{ *pulumi.OutputState }

func (LookupManualFreezeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupManualFreezeResult)(nil)).Elem()
}

func (o LookupManualFreezeResultOutput) ToLookupManualFreezeResultOutput() LookupManualFreezeResultOutput {
	return o
}

func (o LookupManualFreezeResultOutput) ToLookupManualFreezeResultOutputWithContext(ctx context.Context) LookupManualFreezeResultOutput {
	return o
}

// Account Identifier of the freeze
func (o LookupManualFreezeResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Current or upcoming windows
func (o LookupManualFreezeResultOutput) CurrentOrUpcomingWindows() GetManualFreezeCurrentOrUpcomingWindowArrayOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) []GetManualFreezeCurrentOrUpcomingWindow {
		return v.CurrentOrUpcomingWindows
	}).(GetManualFreezeCurrentOrUpcomingWindowArrayOutput)
}

// Description of the freeze
func (o LookupManualFreezeResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.Description }).(pulumi.StringOutput)
}

// Freeze windows in the freeze response
func (o LookupManualFreezeResultOutput) FreezeWindows() GetManualFreezeFreezeWindowArrayOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) []GetManualFreezeFreezeWindow { return v.FreezeWindows }).(GetManualFreezeFreezeWindowArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupManualFreezeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the freeze
func (o LookupManualFreezeResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the freeze
func (o LookupManualFreezeResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.Name }).(pulumi.StringOutput)
}

// Organization identifier of the freeze
func (o LookupManualFreezeResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project identifier of the freeze
func (o LookupManualFreezeResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Scope of the freeze
func (o LookupManualFreezeResultOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.Scope }).(pulumi.StringOutput)
}

// Status of the freeze
func (o LookupManualFreezeResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.Status }).(pulumi.StringOutput)
}

// Tags associated with the freeze
func (o LookupManualFreezeResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Type of freeze
func (o LookupManualFreezeResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.Type }).(pulumi.StringOutput)
}

// Yaml of the freeze
func (o LookupManualFreezeResultOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManualFreezeResult) string { return v.Yaml }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupManualFreezeResultOutput{})
}
