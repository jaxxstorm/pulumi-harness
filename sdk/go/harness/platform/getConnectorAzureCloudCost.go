// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an Azure Cloud Cost Connector.
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
//			_, err := platform.LookupConnectorAzureCloudCost(ctx, &platform.LookupConnectorAzureCloudCostArgs{
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
func LookupConnectorAzureCloudCost(ctx *pulumi.Context, args *LookupConnectorAzureCloudCostArgs, opts ...pulumi.InvokeOption) (*LookupConnectorAzureCloudCostResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupConnectorAzureCloudCostResult
	err := ctx.Invoke("harness:platform/getConnectorAzureCloudCost:getConnectorAzureCloudCost", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectorAzureCloudCost.
type LookupConnectorAzureCloudCostArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getConnectorAzureCloudCost.
type LookupConnectorAzureCloudCostResult struct {
	// Returns billing details for the Azure account.
	BillingExportSpecs []GetConnectorAzureCloudCostBillingExportSpec `pulumi:"billingExportSpecs"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds []string `pulumi:"featuresEnableds"`
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
	// Subsription id.
	SubscriptionId string `pulumi:"subscriptionId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Tenant id.
	TenantId string `pulumi:"tenantId"`
}

func LookupConnectorAzureCloudCostOutput(ctx *pulumi.Context, args LookupConnectorAzureCloudCostOutputArgs, opts ...pulumi.InvokeOption) LookupConnectorAzureCloudCostResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectorAzureCloudCostResult, error) {
			args := v.(LookupConnectorAzureCloudCostArgs)
			r, err := LookupConnectorAzureCloudCost(ctx, &args, opts...)
			var s LookupConnectorAzureCloudCostResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConnectorAzureCloudCostResultOutput)
}

// A collection of arguments for invoking getConnectorAzureCloudCost.
type LookupConnectorAzureCloudCostOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupConnectorAzureCloudCostOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorAzureCloudCostArgs)(nil)).Elem()
}

// A collection of values returned by getConnectorAzureCloudCost.
type LookupConnectorAzureCloudCostResultOutput struct{ *pulumi.OutputState }

func (LookupConnectorAzureCloudCostResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorAzureCloudCostResult)(nil)).Elem()
}

func (o LookupConnectorAzureCloudCostResultOutput) ToLookupConnectorAzureCloudCostResultOutput() LookupConnectorAzureCloudCostResultOutput {
	return o
}

func (o LookupConnectorAzureCloudCostResultOutput) ToLookupConnectorAzureCloudCostResultOutputWithContext(ctx context.Context) LookupConnectorAzureCloudCostResultOutput {
	return o
}

// Returns billing details for the Azure account.
func (o LookupConnectorAzureCloudCostResultOutput) BillingExportSpecs() GetConnectorAzureCloudCostBillingExportSpecArrayOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) []GetConnectorAzureCloudCostBillingExportSpec {
		return v.BillingExportSpecs
	}).(GetConnectorAzureCloudCostBillingExportSpecArrayOutput)
}

// Description of the resource.
func (o LookupConnectorAzureCloudCostResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) string { return v.Description }).(pulumi.StringOutput)
}

// Indicates which feature to enable among Billing, Optimization, and Visibility.
func (o LookupConnectorAzureCloudCostResultOutput) FeaturesEnableds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) []string { return v.FeaturesEnableds }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectorAzureCloudCostResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupConnectorAzureCloudCostResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupConnectorAzureCloudCostResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupConnectorAzureCloudCostResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupConnectorAzureCloudCostResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Subsription id.
func (o LookupConnectorAzureCloudCostResultOutput) SubscriptionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) string { return v.SubscriptionId }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o LookupConnectorAzureCloudCostResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Tenant id.
func (o LookupConnectorAzureCloudCostResultOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorAzureCloudCostResult) string { return v.TenantId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectorAzureCloudCostResultOutput{})
}
