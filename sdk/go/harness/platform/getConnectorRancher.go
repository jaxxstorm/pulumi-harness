// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for looking up a Rancher connector.
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
//			_, err := platform.LookupConnectorRancher(ctx, &platform.LookupConnectorRancherArgs{
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
func LookupConnectorRancher(ctx *pulumi.Context, args *LookupConnectorRancherArgs, opts ...pulumi.InvokeOption) (*LookupConnectorRancherResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectorRancherResult
	err := ctx.Invoke("harness:platform/getConnectorRancher:getConnectorRancher", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectorRancher.
type LookupConnectorRancherArgs struct {
	// URL and bearer token for the rancher cluster.
	BearerToken *GetConnectorRancherBearerToken `pulumi:"bearerToken"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getConnectorRancher.
type LookupConnectorRancherResult struct {
	// URL and bearer token for the rancher cluster.
	BearerToken *GetConnectorRancherBearerToken `pulumi:"bearerToken"`
	// Selectors to use for the delegate.
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
}

func LookupConnectorRancherOutput(ctx *pulumi.Context, args LookupConnectorRancherOutputArgs, opts ...pulumi.InvokeOption) LookupConnectorRancherResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectorRancherResultOutput, error) {
			args := v.(LookupConnectorRancherArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupConnectorRancherResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getConnectorRancher:getConnectorRancher", args, &rv, "", opts...)
			if err != nil {
				return LookupConnectorRancherResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupConnectorRancherResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupConnectorRancherResultOutput), nil
			}
			return output, nil
		}).(LookupConnectorRancherResultOutput)
}

// A collection of arguments for invoking getConnectorRancher.
type LookupConnectorRancherOutputArgs struct {
	// URL and bearer token for the rancher cluster.
	BearerToken GetConnectorRancherBearerTokenPtrInput `pulumi:"bearerToken"`
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupConnectorRancherOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorRancherArgs)(nil)).Elem()
}

// A collection of values returned by getConnectorRancher.
type LookupConnectorRancherResultOutput struct{ *pulumi.OutputState }

func (LookupConnectorRancherResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorRancherResult)(nil)).Elem()
}

func (o LookupConnectorRancherResultOutput) ToLookupConnectorRancherResultOutput() LookupConnectorRancherResultOutput {
	return o
}

func (o LookupConnectorRancherResultOutput) ToLookupConnectorRancherResultOutputWithContext(ctx context.Context) LookupConnectorRancherResultOutput {
	return o
}

// URL and bearer token for the rancher cluster.
func (o LookupConnectorRancherResultOutput) BearerToken() GetConnectorRancherBearerTokenPtrOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) *GetConnectorRancherBearerToken { return v.BearerToken }).(GetConnectorRancherBearerTokenPtrOutput)
}

// Selectors to use for the delegate.
func (o LookupConnectorRancherResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupConnectorRancherResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectorRancherResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupConnectorRancherResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupConnectorRancherResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupConnectorRancherResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupConnectorRancherResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupConnectorRancherResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorRancherResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectorRancherResultOutput{})
}
