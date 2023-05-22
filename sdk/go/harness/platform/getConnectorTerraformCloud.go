// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := platform.LookupConnectorTerraformCloud(ctx, &platform.LookupConnectorTerraformCloudArgs{
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
func LookupConnectorTerraformCloud(ctx *pulumi.Context, args *LookupConnectorTerraformCloudArgs, opts ...pulumi.InvokeOption) (*LookupConnectorTerraformCloudResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupConnectorTerraformCloudResult
	err := ctx.Invoke("harness:platform/getConnectorTerraformCloud:getConnectorTerraformCloud", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectorTerraformCloud.
type LookupConnectorTerraformCloudArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getConnectorTerraformCloud.
type LookupConnectorTerraformCloudResult struct {
	Credentials []GetConnectorTerraformCloudCredential `pulumi:"credentials"`
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
	Url  string   `pulumi:"url"`
}

func LookupConnectorTerraformCloudOutput(ctx *pulumi.Context, args LookupConnectorTerraformCloudOutputArgs, opts ...pulumi.InvokeOption) LookupConnectorTerraformCloudResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectorTerraformCloudResult, error) {
			args := v.(LookupConnectorTerraformCloudArgs)
			r, err := LookupConnectorTerraformCloud(ctx, &args, opts...)
			var s LookupConnectorTerraformCloudResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConnectorTerraformCloudResultOutput)
}

// A collection of arguments for invoking getConnectorTerraformCloud.
type LookupConnectorTerraformCloudOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupConnectorTerraformCloudOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorTerraformCloudArgs)(nil)).Elem()
}

// A collection of values returned by getConnectorTerraformCloud.
type LookupConnectorTerraformCloudResultOutput struct{ *pulumi.OutputState }

func (LookupConnectorTerraformCloudResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorTerraformCloudResult)(nil)).Elem()
}

func (o LookupConnectorTerraformCloudResultOutput) ToLookupConnectorTerraformCloudResultOutput() LookupConnectorTerraformCloudResultOutput {
	return o
}

func (o LookupConnectorTerraformCloudResultOutput) ToLookupConnectorTerraformCloudResultOutputWithContext(ctx context.Context) LookupConnectorTerraformCloudResultOutput {
	return o
}

func (o LookupConnectorTerraformCloudResultOutput) Credentials() GetConnectorTerraformCloudCredentialArrayOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) []GetConnectorTerraformCloudCredential {
		return v.Credentials
	}).(GetConnectorTerraformCloudCredentialArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupConnectorTerraformCloudResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupConnectorTerraformCloudResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectorTerraformCloudResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupConnectorTerraformCloudResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupConnectorTerraformCloudResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupConnectorTerraformCloudResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupConnectorTerraformCloudResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupConnectorTerraformCloudResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o LookupConnectorTerraformCloudResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorTerraformCloudResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectorTerraformCloudResultOutput{})
}
