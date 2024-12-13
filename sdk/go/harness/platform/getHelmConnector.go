// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a HTTP Helm connector.
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
//			_, err := platform.LookupHelmConnector(ctx, &platform.LookupHelmConnectorArgs{
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
func LookupHelmConnector(ctx *pulumi.Context, args *LookupHelmConnectorArgs, opts ...pulumi.InvokeOption) (*LookupHelmConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupHelmConnectorResult
	err := ctx.Invoke("harness:platform/getHelmConnector:getHelmConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHelmConnector.
type LookupHelmConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getHelmConnector.
type LookupHelmConnectorResult struct {
	// Credentials to use for authentication.
	Credentials []GetHelmConnectorCredential `pulumi:"credentials"`
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

func LookupHelmConnectorOutput(ctx *pulumi.Context, args LookupHelmConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupHelmConnectorResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupHelmConnectorResultOutput, error) {
			args := v.(LookupHelmConnectorArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getHelmConnector:getHelmConnector", args, LookupHelmConnectorResultOutput{}, options).(LookupHelmConnectorResultOutput), nil
		}).(LookupHelmConnectorResultOutput)
}

// A collection of arguments for invoking getHelmConnector.
type LookupHelmConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupHelmConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHelmConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getHelmConnector.
type LookupHelmConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupHelmConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHelmConnectorResult)(nil)).Elem()
}

func (o LookupHelmConnectorResultOutput) ToLookupHelmConnectorResultOutput() LookupHelmConnectorResultOutput {
	return o
}

func (o LookupHelmConnectorResultOutput) ToLookupHelmConnectorResultOutputWithContext(ctx context.Context) LookupHelmConnectorResultOutput {
	return o
}

// Credentials to use for authentication.
func (o LookupHelmConnectorResultOutput) Credentials() GetHelmConnectorCredentialArrayOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) []GetHelmConnectorCredential { return v.Credentials }).(GetHelmConnectorCredentialArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupHelmConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupHelmConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupHelmConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupHelmConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupHelmConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupHelmConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupHelmConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupHelmConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the helm server.
func (o LookupHelmConnectorResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHelmConnectorResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupHelmConnectorResultOutput{})
}
