// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an AWS connector.
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
//			_, err := platform.LookupAwsConnector(ctx, &platform.LookupAwsConnectorArgs{
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
func LookupAwsConnector(ctx *pulumi.Context, args *LookupAwsConnectorArgs, opts ...pulumi.InvokeOption) (*LookupAwsConnectorResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupAwsConnectorResult
	err := ctx.Invoke("harness:platform/getAwsConnector:getAwsConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsConnector.
type LookupAwsConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAwsConnector.
type LookupAwsConnectorResult struct {
	// Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
	CrossAccountAccesses []GetAwsConnectorCrossAccountAccess `pulumi:"crossAccountAccesses"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Inherit credentials from the delegate.
	InheritFromDelegates []GetAwsConnectorInheritFromDelegate `pulumi:"inheritFromDelegates"`
	// Use IAM role for service accounts.
	Irsas []GetAwsConnectorIrsa `pulumi:"irsas"`
	// Use IAM role for service accounts.
	Manuals []GetAwsConnectorManual `pulumi:"manuals"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

func LookupAwsConnectorOutput(ctx *pulumi.Context, args LookupAwsConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupAwsConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAwsConnectorResult, error) {
			args := v.(LookupAwsConnectorArgs)
			r, err := LookupAwsConnector(ctx, &args, opts...)
			var s LookupAwsConnectorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAwsConnectorResultOutput)
}

// A collection of arguments for invoking getAwsConnector.
type LookupAwsConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAwsConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getAwsConnector.
type LookupAwsConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupAwsConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsConnectorResult)(nil)).Elem()
}

func (o LookupAwsConnectorResultOutput) ToLookupAwsConnectorResultOutput() LookupAwsConnectorResultOutput {
	return o
}

func (o LookupAwsConnectorResultOutput) ToLookupAwsConnectorResultOutputWithContext(ctx context.Context) LookupAwsConnectorResultOutput {
	return o
}

// Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
func (o LookupAwsConnectorResultOutput) CrossAccountAccesses() GetAwsConnectorCrossAccountAccessArrayOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) []GetAwsConnectorCrossAccountAccess { return v.CrossAccountAccesses }).(GetAwsConnectorCrossAccountAccessArrayOutput)
}

// Description of the resource.
func (o LookupAwsConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAwsConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAwsConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Inherit credentials from the delegate.
func (o LookupAwsConnectorResultOutput) InheritFromDelegates() GetAwsConnectorInheritFromDelegateArrayOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) []GetAwsConnectorInheritFromDelegate { return v.InheritFromDelegates }).(GetAwsConnectorInheritFromDelegateArrayOutput)
}

// Use IAM role for service accounts.
func (o LookupAwsConnectorResultOutput) Irsas() GetAwsConnectorIrsaArrayOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) []GetAwsConnectorIrsa { return v.Irsas }).(GetAwsConnectorIrsaArrayOutput)
}

// Use IAM role for service accounts.
func (o LookupAwsConnectorResultOutput) Manuals() GetAwsConnectorManualArrayOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) []GetAwsConnectorManual { return v.Manuals }).(GetAwsConnectorManualArrayOutput)
}

// Name of the resource.
func (o LookupAwsConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAwsConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAwsConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupAwsConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAwsConnectorResultOutput{})
}
