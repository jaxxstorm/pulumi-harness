// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving service account.
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
//			_, err := platform.LookupServiceAccount(ctx, &platform.LookupServiceAccountArgs{
//				Identifier: pulumi.StringRef("identifier"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceAccount(ctx *pulumi.Context, args *LookupServiceAccountArgs, opts ...pulumi.InvokeOption) (*LookupServiceAccountResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupServiceAccountResult
	err := ctx.Invoke("harness:platform/getServiceAccount:getServiceAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceAccount.
type LookupServiceAccountArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getServiceAccount.
type LookupServiceAccountResult struct {
	// Account Identifier for the Entity.
	AccountId string `pulumi:"accountId"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// Email of the Service Account.
	Email string `pulumi:"email"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

func LookupServiceAccountOutput(ctx *pulumi.Context, args LookupServiceAccountOutputArgs, opts ...pulumi.InvokeOption) LookupServiceAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceAccountResult, error) {
			args := v.(LookupServiceAccountArgs)
			r, err := LookupServiceAccount(ctx, &args, opts...)
			var s LookupServiceAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceAccountResultOutput)
}

// A collection of arguments for invoking getServiceAccount.
type LookupServiceAccountOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupServiceAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceAccountArgs)(nil)).Elem()
}

// A collection of values returned by getServiceAccount.
type LookupServiceAccountResultOutput struct{ *pulumi.OutputState }

func (LookupServiceAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceAccountResult)(nil)).Elem()
}

func (o LookupServiceAccountResultOutput) ToLookupServiceAccountResultOutput() LookupServiceAccountResultOutput {
	return o
}

func (o LookupServiceAccountResultOutput) ToLookupServiceAccountResultOutputWithContext(ctx context.Context) LookupServiceAccountResultOutput {
	return o
}

// Account Identifier for the Entity.
func (o LookupServiceAccountResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Description of the resource.
func (o LookupServiceAccountResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.Description }).(pulumi.StringOutput)
}

// Email of the Service Account.
func (o LookupServiceAccountResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.Email }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupServiceAccountResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Name of the resource.
func (o LookupServiceAccountResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupServiceAccountResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupServiceAccountResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupServiceAccountResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceAccountResultOutput{})
}
