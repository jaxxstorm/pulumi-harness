// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := platform.LookupAzureKeyVaultConnector(ctx, &platform.LookupAzureKeyVaultConnectorArgs{
//				Identifier: "identifier",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAzureKeyVaultConnector(ctx *pulumi.Context, args *LookupAzureKeyVaultConnectorArgs, opts ...pulumi.InvokeOption) (*LookupAzureKeyVaultConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAzureKeyVaultConnectorResult
	err := ctx.Invoke("harness:platform/getAzureKeyVaultConnector:getAzureKeyVaultConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAzureKeyVaultConnector.
type LookupAzureKeyVaultConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAzureKeyVaultConnector.
type LookupAzureKeyVaultConnectorResult struct {
	// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
	AzureEnvironmentType string `pulumi:"azureEnvironmentType"`
	// Application ID of the Azure App.
	ClientId string `pulumi:"clientId"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Specifies whether or not is the default value.
	IsDefault bool `pulumi:"isDefault"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The Harness text secret with the Azure authentication key as its value.
	SecretKey string `pulumi:"secretKey"`
	// Azure subscription ID.
	Subscription string `pulumi:"subscription"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// The Azure Active Directory (AAD) directory ID where you created your application.
	TenantId string `pulumi:"tenantId"`
	// Name of the vault.
	VaultName string `pulumi:"vaultName"`
}

func LookupAzureKeyVaultConnectorOutput(ctx *pulumi.Context, args LookupAzureKeyVaultConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupAzureKeyVaultConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAzureKeyVaultConnectorResultOutput, error) {
			args := v.(LookupAzureKeyVaultConnectorArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupAzureKeyVaultConnectorResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getAzureKeyVaultConnector:getAzureKeyVaultConnector", args, &rv, "", opts...)
			if err != nil {
				return LookupAzureKeyVaultConnectorResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupAzureKeyVaultConnectorResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupAzureKeyVaultConnectorResultOutput), nil
			}
			return output, nil
		}).(LookupAzureKeyVaultConnectorResultOutput)
}

// A collection of arguments for invoking getAzureKeyVaultConnector.
type LookupAzureKeyVaultConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAzureKeyVaultConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAzureKeyVaultConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getAzureKeyVaultConnector.
type LookupAzureKeyVaultConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupAzureKeyVaultConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAzureKeyVaultConnectorResult)(nil)).Elem()
}

func (o LookupAzureKeyVaultConnectorResultOutput) ToLookupAzureKeyVaultConnectorResultOutput() LookupAzureKeyVaultConnectorResultOutput {
	return o
}

func (o LookupAzureKeyVaultConnectorResultOutput) ToLookupAzureKeyVaultConnectorResultOutputWithContext(ctx context.Context) LookupAzureKeyVaultConnectorResultOutput {
	return o
}

// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
func (o LookupAzureKeyVaultConnectorResultOutput) AzureEnvironmentType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.AzureEnvironmentType }).(pulumi.StringOutput)
}

// Application ID of the Azure App.
func (o LookupAzureKeyVaultConnectorResultOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.ClientId }).(pulumi.StringOutput)
}

// Connect using only the delegates which have these tags.
func (o LookupAzureKeyVaultConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupAzureKeyVaultConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAzureKeyVaultConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAzureKeyVaultConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Specifies whether or not is the default value.
func (o LookupAzureKeyVaultConnectorResultOutput) IsDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) bool { return v.IsDefault }).(pulumi.BoolOutput)
}

// Name of the resource.
func (o LookupAzureKeyVaultConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAzureKeyVaultConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAzureKeyVaultConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The Harness text secret with the Azure authentication key as its value.
func (o LookupAzureKeyVaultConnectorResultOutput) SecretKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.SecretKey }).(pulumi.StringOutput)
}

// Azure subscription ID.
func (o LookupAzureKeyVaultConnectorResultOutput) Subscription() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.Subscription }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o LookupAzureKeyVaultConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// The Azure Active Directory (AAD) directory ID where you created your application.
func (o LookupAzureKeyVaultConnectorResultOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.TenantId }).(pulumi.StringOutput)
}

// Name of the vault.
func (o LookupAzureKeyVaultConnectorResultOutput) VaultName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzureKeyVaultConnectorResult) string { return v.VaultName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAzureKeyVaultConnectorResultOutput{})
}
