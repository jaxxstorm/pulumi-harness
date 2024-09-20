// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness service
func LookupEnvironment(ctx *pulumi.Context, args *LookupEnvironmentArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEnvironmentResult
	err := ctx.Invoke("harness:index/getEnvironment:getEnvironment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentArgs struct {
	// The id of the application.
	AppId string `pulumi:"appId"`
	// The id of the environment.
	EnvironmentId *string `pulumi:"environmentId"`
	// The name of the environment.
	Name *string `pulumi:"name"`
	// Override for a service variable
	VariableOverrides []GetEnvironmentVariableOverride `pulumi:"variableOverrides"`
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResult struct {
	// The id of the application.
	AppId string `pulumi:"appId"`
	// The description of the environment.
	Description string `pulumi:"description"`
	// The id of the environment.
	EnvironmentId *string `pulumi:"environmentId"`
	// The id of the environment.
	Id string `pulumi:"id"`
	// The name of the environment.
	Name *string `pulumi:"name"`
	// The type of the environment. Valid values are `PROD` and `NON_PROD`
	Type string `pulumi:"type"`
	// Override for a service variable
	VariableOverrides []GetEnvironmentVariableOverride `pulumi:"variableOverrides"`
}

func LookupEnvironmentOutput(ctx *pulumi.Context, args LookupEnvironmentOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentResultOutput, error) {
			args := v.(LookupEnvironmentArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupEnvironmentResult
			secret, err := ctx.InvokePackageRaw("harness:index/getEnvironment:getEnvironment", args, &rv, "", opts...)
			if err != nil {
				return LookupEnvironmentResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupEnvironmentResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupEnvironmentResultOutput), nil
			}
			return output, nil
		}).(LookupEnvironmentResultOutput)
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentOutputArgs struct {
	// The id of the application.
	AppId pulumi.StringInput `pulumi:"appId"`
	// The id of the environment.
	EnvironmentId pulumi.StringPtrInput `pulumi:"environmentId"`
	// The name of the environment.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Override for a service variable
	VariableOverrides GetEnvironmentVariableOverrideArrayInput `pulumi:"variableOverrides"`
}

func (LookupEnvironmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentResult)(nil)).Elem()
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutput() LookupEnvironmentResultOutput {
	return o
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutputWithContext(ctx context.Context) LookupEnvironmentResultOutput {
	return o
}

// The id of the application.
func (o LookupEnvironmentResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.AppId }).(pulumi.StringOutput)
}

// The description of the environment.
func (o LookupEnvironmentResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Description }).(pulumi.StringOutput)
}

// The id of the environment.
func (o LookupEnvironmentResultOutput) EnvironmentId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *string { return v.EnvironmentId }).(pulumi.StringPtrOutput)
}

// The id of the environment.
func (o LookupEnvironmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the environment.
func (o LookupEnvironmentResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The type of the environment. Valid values are `PROD` and `NON_PROD`
func (o LookupEnvironmentResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Type }).(pulumi.StringOutput)
}

// Override for a service variable
func (o LookupEnvironmentResultOutput) VariableOverrides() GetEnvironmentVariableOverrideArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) []GetEnvironmentVariableOverride { return v.VariableOverrides }).(GetEnvironmentVariableOverrideArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentResultOutput{})
}
