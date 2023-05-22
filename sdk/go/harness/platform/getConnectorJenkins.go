// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Jenkins connector.
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
//			_, err := platform.LookupConnectorJenkins(ctx, &platform.LookupConnectorJenkinsArgs{
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
func LookupConnectorJenkins(ctx *pulumi.Context, args *LookupConnectorJenkinsArgs, opts ...pulumi.InvokeOption) (*LookupConnectorJenkinsResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupConnectorJenkinsResult
	err := ctx.Invoke("harness:platform/getConnectorJenkins:getConnectorJenkins", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectorJenkins.
type LookupConnectorJenkinsArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getConnectorJenkins.
type LookupConnectorJenkinsResult struct {
	// This entity contains the details for Jenkins Authentication.
	Auths []GetConnectorJenkinsAuth `pulumi:"auths"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Jenkins Url.
	JenkinsUrl string `pulumi:"jenkinsUrl"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

func LookupConnectorJenkinsOutput(ctx *pulumi.Context, args LookupConnectorJenkinsOutputArgs, opts ...pulumi.InvokeOption) LookupConnectorJenkinsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectorJenkinsResult, error) {
			args := v.(LookupConnectorJenkinsArgs)
			r, err := LookupConnectorJenkins(ctx, &args, opts...)
			var s LookupConnectorJenkinsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConnectorJenkinsResultOutput)
}

// A collection of arguments for invoking getConnectorJenkins.
type LookupConnectorJenkinsOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupConnectorJenkinsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorJenkinsArgs)(nil)).Elem()
}

// A collection of values returned by getConnectorJenkins.
type LookupConnectorJenkinsResultOutput struct{ *pulumi.OutputState }

func (LookupConnectorJenkinsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorJenkinsResult)(nil)).Elem()
}

func (o LookupConnectorJenkinsResultOutput) ToLookupConnectorJenkinsResultOutput() LookupConnectorJenkinsResultOutput {
	return o
}

func (o LookupConnectorJenkinsResultOutput) ToLookupConnectorJenkinsResultOutputWithContext(ctx context.Context) LookupConnectorJenkinsResultOutput {
	return o
}

// This entity contains the details for Jenkins Authentication.
func (o LookupConnectorJenkinsResultOutput) Auths() GetConnectorJenkinsAuthArrayOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) []GetConnectorJenkinsAuth { return v.Auths }).(GetConnectorJenkinsAuthArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupConnectorJenkinsResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupConnectorJenkinsResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectorJenkinsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupConnectorJenkinsResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Jenkins Url.
func (o LookupConnectorJenkinsResultOutput) JenkinsUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) string { return v.JenkinsUrl }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupConnectorJenkinsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupConnectorJenkinsResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupConnectorJenkinsResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupConnectorJenkinsResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorJenkinsResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectorJenkinsResultOutput{})
}
