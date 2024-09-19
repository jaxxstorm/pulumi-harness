// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness user group
func LookupUserGroup(ctx *pulumi.Context, args *LookupUserGroupArgs, opts ...pulumi.InvokeOption) (*LookupUserGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupUserGroupResult
	err := ctx.Invoke("harness:index/getUserGroup:getUserGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUserGroup.
type LookupUserGroupArgs struct {
	// Unique identifier of the user group
	Id *string `pulumi:"id"`
	// The name of the user group.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getUserGroup.
type LookupUserGroupResult struct {
	// Unique identifier of the user group
	Id *string `pulumi:"id"`
	// The name of the user group.
	Name *string `pulumi:"name"`
}

func LookupUserGroupOutput(ctx *pulumi.Context, args LookupUserGroupOutputArgs, opts ...pulumi.InvokeOption) LookupUserGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserGroupResultOutput, error) {
			args := v.(LookupUserGroupArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupUserGroupResult
			secret, err := ctx.InvokePackageRaw("harness:index/getUserGroup:getUserGroup", args, &rv, "", opts...)
			if err != nil {
				return LookupUserGroupResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupUserGroupResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupUserGroupResultOutput), nil
			}
			return output, nil
		}).(LookupUserGroupResultOutput)
}

// A collection of arguments for invoking getUserGroup.
type LookupUserGroupOutputArgs struct {
	// Unique identifier of the user group
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of the user group.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupUserGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserGroupArgs)(nil)).Elem()
}

// A collection of values returned by getUserGroup.
type LookupUserGroupResultOutput struct{ *pulumi.OutputState }

func (LookupUserGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserGroupResult)(nil)).Elem()
}

func (o LookupUserGroupResultOutput) ToLookupUserGroupResultOutput() LookupUserGroupResultOutput {
	return o
}

func (o LookupUserGroupResultOutput) ToLookupUserGroupResultOutputWithContext(ctx context.Context) LookupUserGroupResultOutput {
	return o
}

// Unique identifier of the user group
func (o LookupUserGroupResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUserGroupResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// The name of the user group.
func (o LookupUserGroupResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUserGroupResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserGroupResultOutput{})
}
