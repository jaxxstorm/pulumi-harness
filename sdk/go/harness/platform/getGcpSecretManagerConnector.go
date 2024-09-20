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
//			_, err := platform.LookupGcpSecretManagerConnector(ctx, &platform.LookupGcpSecretManagerConnectorArgs{
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
func LookupGcpSecretManagerConnector(ctx *pulumi.Context, args *LookupGcpSecretManagerConnectorArgs, opts ...pulumi.InvokeOption) (*LookupGcpSecretManagerConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGcpSecretManagerConnectorResult
	err := ctx.Invoke("harness:platform/getGcpSecretManagerConnector:getGcpSecretManagerConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGcpSecretManagerConnector.
type LookupGcpSecretManagerConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getGcpSecretManagerConnector.
type LookupGcpSecretManagerConnectorResult struct {
	// Reference to the secret containing credentials of IAM service account for Google Secret Manager. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	CredentialsRef string `pulumi:"credentialsRef"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Indicative if this is default Secret manager for secrets.
	IsDefault bool `pulumi:"isDefault"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

func LookupGcpSecretManagerConnectorOutput(ctx *pulumi.Context, args LookupGcpSecretManagerConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupGcpSecretManagerConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGcpSecretManagerConnectorResultOutput, error) {
			args := v.(LookupGcpSecretManagerConnectorArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupGcpSecretManagerConnectorResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getGcpSecretManagerConnector:getGcpSecretManagerConnector", args, &rv, "", opts...)
			if err != nil {
				return LookupGcpSecretManagerConnectorResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupGcpSecretManagerConnectorResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupGcpSecretManagerConnectorResultOutput), nil
			}
			return output, nil
		}).(LookupGcpSecretManagerConnectorResultOutput)
}

// A collection of arguments for invoking getGcpSecretManagerConnector.
type LookupGcpSecretManagerConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupGcpSecretManagerConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGcpSecretManagerConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getGcpSecretManagerConnector.
type LookupGcpSecretManagerConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupGcpSecretManagerConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGcpSecretManagerConnectorResult)(nil)).Elem()
}

func (o LookupGcpSecretManagerConnectorResultOutput) ToLookupGcpSecretManagerConnectorResultOutput() LookupGcpSecretManagerConnectorResultOutput {
	return o
}

func (o LookupGcpSecretManagerConnectorResultOutput) ToLookupGcpSecretManagerConnectorResultOutputWithContext(ctx context.Context) LookupGcpSecretManagerConnectorResultOutput {
	return o
}

// Reference to the secret containing credentials of IAM service account for Google Secret Manager. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o LookupGcpSecretManagerConnectorResultOutput) CredentialsRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) string { return v.CredentialsRef }).(pulumi.StringOutput)
}

// Tags to filter delegates for connection.
func (o LookupGcpSecretManagerConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupGcpSecretManagerConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGcpSecretManagerConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupGcpSecretManagerConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Indicative if this is default Secret manager for secrets.
func (o LookupGcpSecretManagerConnectorResultOutput) IsDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) bool { return v.IsDefault }).(pulumi.BoolOutput)
}

// Name of the resource.
func (o LookupGcpSecretManagerConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupGcpSecretManagerConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupGcpSecretManagerConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupGcpSecretManagerConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGcpSecretManagerConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGcpSecretManagerConnectorResultOutput{})
}
