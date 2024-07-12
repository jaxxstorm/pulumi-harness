// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness JDBC Connector.
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
//			_, err := platform.LookupConnectorJdbc(ctx, &platform.LookupConnectorJdbcArgs{
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
func LookupConnectorJdbc(ctx *pulumi.Context, args *LookupConnectorJdbcArgs, opts ...pulumi.InvokeOption) (*LookupConnectorJdbcResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectorJdbcResult
	err := ctx.Invoke("harness:platform/getConnectorJdbc:getConnectorJdbc", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectorJdbc.
type LookupConnectorJdbcArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getConnectorJdbc.
type LookupConnectorJdbcResult struct {
	// The credentials to use for the database server.
	Credentials []GetConnectorJdbcCredential `pulumi:"credentials"`
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
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// The URL of the database server.
	Url string `pulumi:"url"`
}

func LookupConnectorJdbcOutput(ctx *pulumi.Context, args LookupConnectorJdbcOutputArgs, opts ...pulumi.InvokeOption) LookupConnectorJdbcResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectorJdbcResult, error) {
			args := v.(LookupConnectorJdbcArgs)
			r, err := LookupConnectorJdbc(ctx, &args, opts...)
			var s LookupConnectorJdbcResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConnectorJdbcResultOutput)
}

// A collection of arguments for invoking getConnectorJdbc.
type LookupConnectorJdbcOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupConnectorJdbcOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorJdbcArgs)(nil)).Elem()
}

// A collection of values returned by getConnectorJdbc.
type LookupConnectorJdbcResultOutput struct{ *pulumi.OutputState }

func (LookupConnectorJdbcResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorJdbcResult)(nil)).Elem()
}

func (o LookupConnectorJdbcResultOutput) ToLookupConnectorJdbcResultOutput() LookupConnectorJdbcResultOutput {
	return o
}

func (o LookupConnectorJdbcResultOutput) ToLookupConnectorJdbcResultOutputWithContext(ctx context.Context) LookupConnectorJdbcResultOutput {
	return o
}

// The credentials to use for the database server.
func (o LookupConnectorJdbcResultOutput) Credentials() GetConnectorJdbcCredentialArrayOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) []GetConnectorJdbcCredential { return v.Credentials }).(GetConnectorJdbcCredentialArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupConnectorJdbcResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupConnectorJdbcResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectorJdbcResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupConnectorJdbcResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupConnectorJdbcResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupConnectorJdbcResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupConnectorJdbcResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupConnectorJdbcResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// The URL of the database server.
func (o LookupConnectorJdbcResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorJdbcResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectorJdbcResultOutput{})
}