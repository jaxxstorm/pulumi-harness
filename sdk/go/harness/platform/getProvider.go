// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupProvider(ctx *pulumi.Context, args *LookupProviderArgs, opts ...pulumi.InvokeOption) (*LookupProviderResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProviderResult
	err := ctx.Invoke("harness:platform/getProvider:getProvider", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProvider.
type LookupProviderArgs struct {
	Identifier string `pulumi:"identifier"`
}

// A collection of values returned by getProvider.
type LookupProviderResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	Identifier string `pulumi:"identifier"`
}

func LookupProviderOutput(ctx *pulumi.Context, args LookupProviderOutputArgs, opts ...pulumi.InvokeOption) LookupProviderResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProviderResultOutput, error) {
			args := v.(LookupProviderArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupProviderResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getProvider:getProvider", args, &rv, "", opts...)
			if err != nil {
				return LookupProviderResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupProviderResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupProviderResultOutput), nil
			}
			return output, nil
		}).(LookupProviderResultOutput)
}

// A collection of arguments for invoking getProvider.
type LookupProviderOutputArgs struct {
	Identifier pulumi.StringInput `pulumi:"identifier"`
}

func (LookupProviderOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProviderArgs)(nil)).Elem()
}

// A collection of values returned by getProvider.
type LookupProviderResultOutput struct{ *pulumi.OutputState }

func (LookupProviderResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProviderResult)(nil)).Elem()
}

func (o LookupProviderResultOutput) ToLookupProviderResultOutput() LookupProviderResultOutput {
	return o
}

func (o LookupProviderResultOutput) ToLookupProviderResultOutputWithContext(ctx context.Context) LookupProviderResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProviderResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProviderResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupProviderResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProviderResult) string { return v.Identifier }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProviderResultOutput{})
}
