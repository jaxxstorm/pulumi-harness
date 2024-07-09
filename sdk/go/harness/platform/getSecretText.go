// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// DataSource for looking up secret of type secret text.
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
//			_, err := platform.LookupSecretText(ctx, &platform.LookupSecretTextArgs{
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
func LookupSecretText(ctx *pulumi.Context, args *LookupSecretTextArgs, opts ...pulumi.InvokeOption) (*LookupSecretTextResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSecretTextResult
	err := ctx.Invoke("harness:platform/getSecretText:getSecretText", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecretText.
type LookupSecretTextArgs struct {
	// Additional Metadata for the Secret
	AdditionalMetadatas []GetSecretTextAdditionalMetadata `pulumi:"additionalMetadatas"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getSecretText.
type LookupSecretTextResult struct {
	// Additional Metadata for the Secret
	AdditionalMetadatas []GetSecretTextAdditionalMetadata `pulumi:"additionalMetadatas"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Identifier of the Secret Manager used to manage the secret.
	SecretManagerIdentifier string `pulumi:"secretManagerIdentifier"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Value of the Secret
	Value string `pulumi:"value"`
	// This has details to specify if the secret value is Inline or Reference.
	ValueType string `pulumi:"valueType"`
}

func LookupSecretTextOutput(ctx *pulumi.Context, args LookupSecretTextOutputArgs, opts ...pulumi.InvokeOption) LookupSecretTextResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSecretTextResult, error) {
			args := v.(LookupSecretTextArgs)
			r, err := LookupSecretText(ctx, &args, opts...)
			var s LookupSecretTextResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSecretTextResultOutput)
}

// A collection of arguments for invoking getSecretText.
type LookupSecretTextOutputArgs struct {
	// Additional Metadata for the Secret
	AdditionalMetadatas GetSecretTextAdditionalMetadataArrayInput `pulumi:"additionalMetadatas"`
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupSecretTextOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretTextArgs)(nil)).Elem()
}

// A collection of values returned by getSecretText.
type LookupSecretTextResultOutput struct{ *pulumi.OutputState }

func (LookupSecretTextResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretTextResult)(nil)).Elem()
}

func (o LookupSecretTextResultOutput) ToLookupSecretTextResultOutput() LookupSecretTextResultOutput {
	return o
}

func (o LookupSecretTextResultOutput) ToLookupSecretTextResultOutputWithContext(ctx context.Context) LookupSecretTextResultOutput {
	return o
}

// Additional Metadata for the Secret
func (o LookupSecretTextResultOutput) AdditionalMetadatas() GetSecretTextAdditionalMetadataArrayOutput {
	return o.ApplyT(func(v LookupSecretTextResult) []GetSecretTextAdditionalMetadata { return v.AdditionalMetadatas }).(GetSecretTextAdditionalMetadataArrayOutput)
}

// Description of the resource.
func (o LookupSecretTextResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretTextResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSecretTextResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretTextResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupSecretTextResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretTextResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupSecretTextResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretTextResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupSecretTextResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretTextResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupSecretTextResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretTextResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Identifier of the Secret Manager used to manage the secret.
func (o LookupSecretTextResultOutput) SecretManagerIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretTextResult) string { return v.SecretManagerIdentifier }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o LookupSecretTextResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSecretTextResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Value of the Secret
func (o LookupSecretTextResultOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretTextResult) string { return v.Value }).(pulumi.StringOutput)
}

// This has details to specify if the secret value is Inline or Reference.
func (o LookupSecretTextResultOutput) ValueType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretTextResult) string { return v.ValueType }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSecretTextResultOutput{})
}
