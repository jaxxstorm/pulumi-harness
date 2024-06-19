// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an AWS KMS connector.
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
//			_, err := platform.LookupAwsKmsConnector(ctx, &platform.LookupAwsKmsConnectorArgs{
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
func LookupAwsKmsConnector(ctx *pulumi.Context, args *LookupAwsKmsConnectorArgs, opts ...pulumi.InvokeOption) (*LookupAwsKmsConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAwsKmsConnectorResult
	err := ctx.Invoke("harness:platform/getAwsKmsConnector:getAwsKmsConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsKmsConnector.
type LookupAwsKmsConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAwsKmsConnector.
type LookupAwsKmsConnectorResult struct {
	// A reference to the Harness secret containing the ARN of the AWS KMS. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ArnRef string `pulumi:"arnRef"`
	// Credentials to connect to AWS.
	Credentials []GetAwsKmsConnectorCredential `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
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
	// The AWS region where the AWS Secret Manager is.
	Region string `pulumi:"region"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

func LookupAwsKmsConnectorOutput(ctx *pulumi.Context, args LookupAwsKmsConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupAwsKmsConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAwsKmsConnectorResult, error) {
			args := v.(LookupAwsKmsConnectorArgs)
			r, err := LookupAwsKmsConnector(ctx, &args, opts...)
			var s LookupAwsKmsConnectorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAwsKmsConnectorResultOutput)
}

// A collection of arguments for invoking getAwsKmsConnector.
type LookupAwsKmsConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAwsKmsConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsKmsConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getAwsKmsConnector.
type LookupAwsKmsConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupAwsKmsConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsKmsConnectorResult)(nil)).Elem()
}

func (o LookupAwsKmsConnectorResultOutput) ToLookupAwsKmsConnectorResultOutput() LookupAwsKmsConnectorResultOutput {
	return o
}

func (o LookupAwsKmsConnectorResultOutput) ToLookupAwsKmsConnectorResultOutputWithContext(ctx context.Context) LookupAwsKmsConnectorResultOutput {
	return o
}

// A reference to the Harness secret containing the ARN of the AWS KMS. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o LookupAwsKmsConnectorResultOutput) ArnRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) string { return v.ArnRef }).(pulumi.StringOutput)
}

// Credentials to connect to AWS.
func (o LookupAwsKmsConnectorResultOutput) Credentials() GetAwsKmsConnectorCredentialArrayOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) []GetAwsKmsConnectorCredential { return v.Credentials }).(GetAwsKmsConnectorCredentialArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupAwsKmsConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupAwsKmsConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAwsKmsConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAwsKmsConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupAwsKmsConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAwsKmsConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAwsKmsConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The AWS region where the AWS Secret Manager is.
func (o LookupAwsKmsConnectorResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) string { return v.Region }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o LookupAwsKmsConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsKmsConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAwsKmsConnectorResultOutput{})
}
