// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving an SSH credential.
func LookupSshCredential(ctx *pulumi.Context, args *LookupSshCredentialArgs, opts ...pulumi.InvokeOption) (*LookupSshCredentialResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSshCredentialResult
	err := ctx.Invoke("harness:index/getSshCredential:getSshCredential", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSshCredential.
type LookupSshCredentialArgs struct {
	// Unique identifier of the secret manager
	Id *string `pulumi:"id"`
	// The name of the secret manager
	Name *string `pulumi:"name"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes []GetSshCredentialUsageScope `pulumi:"usageScopes"`
}

// A collection of values returned by getSshCredential.
type LookupSshCredentialResult struct {
	// Unique identifier of the secret manager
	Id *string `pulumi:"id"`
	// The name of the secret manager
	Name *string `pulumi:"name"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes []GetSshCredentialUsageScope `pulumi:"usageScopes"`
}

func LookupSshCredentialOutput(ctx *pulumi.Context, args LookupSshCredentialOutputArgs, opts ...pulumi.InvokeOption) LookupSshCredentialResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSshCredentialResultOutput, error) {
			args := v.(LookupSshCredentialArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupSshCredentialResult
			secret, err := ctx.InvokePackageRaw("harness:index/getSshCredential:getSshCredential", args, &rv, "", opts...)
			if err != nil {
				return LookupSshCredentialResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupSshCredentialResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupSshCredentialResultOutput), nil
			}
			return output, nil
		}).(LookupSshCredentialResultOutput)
}

// A collection of arguments for invoking getSshCredential.
type LookupSshCredentialOutputArgs struct {
	// Unique identifier of the secret manager
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of the secret manager
	Name pulumi.StringPtrInput `pulumi:"name"`
	// This block is used for scoping the resource to a specific set of applications or environments.
	UsageScopes GetSshCredentialUsageScopeArrayInput `pulumi:"usageScopes"`
}

func (LookupSshCredentialOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSshCredentialArgs)(nil)).Elem()
}

// A collection of values returned by getSshCredential.
type LookupSshCredentialResultOutput struct{ *pulumi.OutputState }

func (LookupSshCredentialResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSshCredentialResult)(nil)).Elem()
}

func (o LookupSshCredentialResultOutput) ToLookupSshCredentialResultOutput() LookupSshCredentialResultOutput {
	return o
}

func (o LookupSshCredentialResultOutput) ToLookupSshCredentialResultOutputWithContext(ctx context.Context) LookupSshCredentialResultOutput {
	return o
}

// Unique identifier of the secret manager
func (o LookupSshCredentialResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSshCredentialResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// The name of the secret manager
func (o LookupSshCredentialResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSshCredentialResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// This block is used for scoping the resource to a specific set of applications or environments.
func (o LookupSshCredentialResultOutput) UsageScopes() GetSshCredentialUsageScopeArrayOutput {
	return o.ApplyT(func(v LookupSshCredentialResult) []GetSshCredentialUsageScope { return v.UsageScopes }).(GetSshCredentialUsageScopeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSshCredentialResultOutput{})
}
