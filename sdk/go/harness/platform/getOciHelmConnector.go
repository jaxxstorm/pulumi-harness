// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a OCI Helm connector.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.LookupOciHelmConnector(ctx, &platform.LookupOciHelmConnectorArgs{
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
func LookupOciHelmConnector(ctx *pulumi.Context, args *LookupOciHelmConnectorArgs, opts ...pulumi.InvokeOption) (*LookupOciHelmConnectorResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupOciHelmConnectorResult
	err := ctx.Invoke("harness:platform/getOciHelmConnector:getOciHelmConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOciHelmConnector.
type LookupOciHelmConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getOciHelmConnector.
type LookupOciHelmConnectorResult struct {
	// Credentials to use for authentication.
	Credentials []GetOciHelmConnectorCredential `pulumi:"credentials"`
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
	// URL of the helm server.
	Url string `pulumi:"url"`
}

func LookupOciHelmConnectorOutput(ctx *pulumi.Context, args LookupOciHelmConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupOciHelmConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOciHelmConnectorResult, error) {
			args := v.(LookupOciHelmConnectorArgs)
			r, err := LookupOciHelmConnector(ctx, &args, opts...)
			var s LookupOciHelmConnectorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOciHelmConnectorResultOutput)
}

// A collection of arguments for invoking getOciHelmConnector.
type LookupOciHelmConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupOciHelmConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOciHelmConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getOciHelmConnector.
type LookupOciHelmConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupOciHelmConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOciHelmConnectorResult)(nil)).Elem()
}

func (o LookupOciHelmConnectorResultOutput) ToLookupOciHelmConnectorResultOutput() LookupOciHelmConnectorResultOutput {
	return o
}

func (o LookupOciHelmConnectorResultOutput) ToLookupOciHelmConnectorResultOutputWithContext(ctx context.Context) LookupOciHelmConnectorResultOutput {
	return o
}

// Credentials to use for authentication.
func (o LookupOciHelmConnectorResultOutput) Credentials() GetOciHelmConnectorCredentialArrayOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) []GetOciHelmConnectorCredential { return v.Credentials }).(GetOciHelmConnectorCredentialArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupOciHelmConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupOciHelmConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOciHelmConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupOciHelmConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupOciHelmConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupOciHelmConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupOciHelmConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupOciHelmConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the helm server.
func (o LookupOciHelmConnectorResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOciHelmConnectorResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOciHelmConnectorResultOutput{})
}
