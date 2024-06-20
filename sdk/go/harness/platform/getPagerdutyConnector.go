// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a PagerDuty connector.
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
//			_, err := platform.LookupPagerdutyConnector(ctx, &platform.LookupPagerdutyConnectorArgs{
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
func LookupPagerdutyConnector(ctx *pulumi.Context, args *LookupPagerdutyConnectorArgs, opts ...pulumi.InvokeOption) (*LookupPagerdutyConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPagerdutyConnectorResult
	err := ctx.Invoke("harness:platform/getPagerdutyConnector:getPagerdutyConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPagerdutyConnector.
type LookupPagerdutyConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getPagerdutyConnector.
type LookupPagerdutyConnectorResult struct {
	// Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiTokenRef string `pulumi:"apiTokenRef"`
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
}

func LookupPagerdutyConnectorOutput(ctx *pulumi.Context, args LookupPagerdutyConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupPagerdutyConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPagerdutyConnectorResult, error) {
			args := v.(LookupPagerdutyConnectorArgs)
			r, err := LookupPagerdutyConnector(ctx, &args, opts...)
			var s LookupPagerdutyConnectorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPagerdutyConnectorResultOutput)
}

// A collection of arguments for invoking getPagerdutyConnector.
type LookupPagerdutyConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupPagerdutyConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPagerdutyConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getPagerdutyConnector.
type LookupPagerdutyConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupPagerdutyConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPagerdutyConnectorResult)(nil)).Elem()
}

func (o LookupPagerdutyConnectorResultOutput) ToLookupPagerdutyConnectorResultOutput() LookupPagerdutyConnectorResultOutput {
	return o
}

func (o LookupPagerdutyConnectorResultOutput) ToLookupPagerdutyConnectorResultOutputWithContext(ctx context.Context) LookupPagerdutyConnectorResultOutput {
	return o
}

// Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o LookupPagerdutyConnectorResultOutput) ApiTokenRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) string { return v.ApiTokenRef }).(pulumi.StringOutput)
}

// Tags to filter delegates for connection.
func (o LookupPagerdutyConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupPagerdutyConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPagerdutyConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupPagerdutyConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupPagerdutyConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupPagerdutyConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupPagerdutyConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupPagerdutyConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPagerdutyConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPagerdutyConnectorResultOutput{})
}
