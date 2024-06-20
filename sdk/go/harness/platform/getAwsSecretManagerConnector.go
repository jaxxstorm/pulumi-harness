// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an AWS Secret Manager connector.
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
//			_, err := platform.LookupAwsSecretManagerConnector(ctx, &platform.LookupAwsSecretManagerConnectorArgs{
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
func LookupAwsSecretManagerConnector(ctx *pulumi.Context, args *LookupAwsSecretManagerConnectorArgs, opts ...pulumi.InvokeOption) (*LookupAwsSecretManagerConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAwsSecretManagerConnectorResult
	err := ctx.Invoke("harness:platform/getAwsSecretManagerConnector:getAwsSecretManagerConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsSecretManagerConnector.
type LookupAwsSecretManagerConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAwsSecretManagerConnector.
type LookupAwsSecretManagerConnectorResult struct {
	// Credentials to connect to AWS.
	Credentials []GetAwsSecretManagerConnectorCredential `pulumi:"credentials"`
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
	// A prefix to be added to all secrets.
	SecretNamePrefix string `pulumi:"secretNamePrefix"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

func LookupAwsSecretManagerConnectorOutput(ctx *pulumi.Context, args LookupAwsSecretManagerConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupAwsSecretManagerConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAwsSecretManagerConnectorResult, error) {
			args := v.(LookupAwsSecretManagerConnectorArgs)
			r, err := LookupAwsSecretManagerConnector(ctx, &args, opts...)
			var s LookupAwsSecretManagerConnectorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAwsSecretManagerConnectorResultOutput)
}

// A collection of arguments for invoking getAwsSecretManagerConnector.
type LookupAwsSecretManagerConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAwsSecretManagerConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsSecretManagerConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getAwsSecretManagerConnector.
type LookupAwsSecretManagerConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupAwsSecretManagerConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsSecretManagerConnectorResult)(nil)).Elem()
}

func (o LookupAwsSecretManagerConnectorResultOutput) ToLookupAwsSecretManagerConnectorResultOutput() LookupAwsSecretManagerConnectorResultOutput {
	return o
}

func (o LookupAwsSecretManagerConnectorResultOutput) ToLookupAwsSecretManagerConnectorResultOutputWithContext(ctx context.Context) LookupAwsSecretManagerConnectorResultOutput {
	return o
}

// Credentials to connect to AWS.
func (o LookupAwsSecretManagerConnectorResultOutput) Credentials() GetAwsSecretManagerConnectorCredentialArrayOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) []GetAwsSecretManagerConnectorCredential {
		return v.Credentials
	}).(GetAwsSecretManagerConnectorCredentialArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupAwsSecretManagerConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupAwsSecretManagerConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAwsSecretManagerConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAwsSecretManagerConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupAwsSecretManagerConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAwsSecretManagerConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAwsSecretManagerConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The AWS region where the AWS Secret Manager is.
func (o LookupAwsSecretManagerConnectorResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) string { return v.Region }).(pulumi.StringOutput)
}

// A prefix to be added to all secrets.
func (o LookupAwsSecretManagerConnectorResultOutput) SecretNamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) string { return v.SecretNamePrefix }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o LookupAwsSecretManagerConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsSecretManagerConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAwsSecretManagerConnectorResultOutput{})
}
