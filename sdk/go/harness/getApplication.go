// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness application
func LookupApplication(ctx *pulumi.Context, args *LookupApplicationArgs, opts ...pulumi.InvokeOption) (*LookupApplicationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplicationResult
	err := ctx.Invoke("harness:index/getApplication:getApplication", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplication.
type LookupApplicationArgs struct {
	// The application description
	Description *string `pulumi:"description"`
	// The id of the git sync connector
	GitSyncConnectorId *string `pulumi:"gitSyncConnectorId"`
	// True if git sync is enabled on this application
	GitSyncEnabled *bool `pulumi:"gitSyncEnabled"`
	// Unique identifier of the application
	Id *string `pulumi:"id"`
	// When this is set to true, all manual triggers will require API Key authorization
	IsManualTriggerAuthorized *bool `pulumi:"isManualTriggerAuthorized"`
	// The name of the application
	Name *string `pulumi:"name"`
}

// A collection of values returned by getApplication.
type LookupApplicationResult struct {
	// The application description
	Description *string `pulumi:"description"`
	// The id of the git sync connector
	GitSyncConnectorId *string `pulumi:"gitSyncConnectorId"`
	// True if git sync is enabled on this application
	GitSyncEnabled *bool `pulumi:"gitSyncEnabled"`
	// Unique identifier of the application
	Id *string `pulumi:"id"`
	// When this is set to true, all manual triggers will require API Key authorization
	IsManualTriggerAuthorized *bool `pulumi:"isManualTriggerAuthorized"`
	// The name of the application
	Name *string `pulumi:"name"`
}

func LookupApplicationOutput(ctx *pulumi.Context, args LookupApplicationOutputArgs, opts ...pulumi.InvokeOption) LookupApplicationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApplicationResultOutput, error) {
			args := v.(LookupApplicationArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupApplicationResult
			secret, err := ctx.InvokePackageRaw("harness:index/getApplication:getApplication", args, &rv, "", opts...)
			if err != nil {
				return LookupApplicationResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupApplicationResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupApplicationResultOutput), nil
			}
			return output, nil
		}).(LookupApplicationResultOutput)
}

// A collection of arguments for invoking getApplication.
type LookupApplicationOutputArgs struct {
	// The application description
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The id of the git sync connector
	GitSyncConnectorId pulumi.StringPtrInput `pulumi:"gitSyncConnectorId"`
	// True if git sync is enabled on this application
	GitSyncEnabled pulumi.BoolPtrInput `pulumi:"gitSyncEnabled"`
	// Unique identifier of the application
	Id pulumi.StringPtrInput `pulumi:"id"`
	// When this is set to true, all manual triggers will require API Key authorization
	IsManualTriggerAuthorized pulumi.BoolPtrInput `pulumi:"isManualTriggerAuthorized"`
	// The name of the application
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupApplicationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationArgs)(nil)).Elem()
}

// A collection of values returned by getApplication.
type LookupApplicationResultOutput struct{ *pulumi.OutputState }

func (LookupApplicationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationResult)(nil)).Elem()
}

func (o LookupApplicationResultOutput) ToLookupApplicationResultOutput() LookupApplicationResultOutput {
	return o
}

func (o LookupApplicationResultOutput) ToLookupApplicationResultOutputWithContext(ctx context.Context) LookupApplicationResultOutput {
	return o
}

// The application description
func (o LookupApplicationResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupApplicationResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// The id of the git sync connector
func (o LookupApplicationResultOutput) GitSyncConnectorId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupApplicationResult) *string { return v.GitSyncConnectorId }).(pulumi.StringPtrOutput)
}

// True if git sync is enabled on this application
func (o LookupApplicationResultOutput) GitSyncEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupApplicationResult) *bool { return v.GitSyncEnabled }).(pulumi.BoolPtrOutput)
}

// Unique identifier of the application
func (o LookupApplicationResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupApplicationResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// When this is set to true, all manual triggers will require API Key authorization
func (o LookupApplicationResultOutput) IsManualTriggerAuthorized() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupApplicationResult) *bool { return v.IsManualTriggerAuthorized }).(pulumi.BoolPtrOutput)
}

// The name of the application
func (o LookupApplicationResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupApplicationResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplicationResultOutput{})
}
