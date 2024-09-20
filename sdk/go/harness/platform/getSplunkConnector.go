// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Splunk connector.
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
//			_, err := platform.LookupSplunkConnector(ctx, &platform.LookupSplunkConnectorArgs{
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
func LookupSplunkConnector(ctx *pulumi.Context, args *LookupSplunkConnectorArgs, opts ...pulumi.InvokeOption) (*LookupSplunkConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSplunkConnectorResult
	err := ctx.Invoke("harness:platform/getSplunkConnector:getSplunkConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSplunkConnector.
type LookupSplunkConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getSplunkConnector.
type LookupSplunkConnectorResult struct {
	// Splunk account id.
	AccountId string `pulumi:"accountId"`
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
	// The reference to the Harness secret containing the Splunk password. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	PasswordRef string `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// URL of the Splunk server.
	Url string `pulumi:"url"`
	// The username used for connecting to Splunk.
	Username string `pulumi:"username"`
}

func LookupSplunkConnectorOutput(ctx *pulumi.Context, args LookupSplunkConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupSplunkConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSplunkConnectorResultOutput, error) {
			args := v.(LookupSplunkConnectorArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupSplunkConnectorResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getSplunkConnector:getSplunkConnector", args, &rv, "", opts...)
			if err != nil {
				return LookupSplunkConnectorResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupSplunkConnectorResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupSplunkConnectorResultOutput), nil
			}
			return output, nil
		}).(LookupSplunkConnectorResultOutput)
}

// A collection of arguments for invoking getSplunkConnector.
type LookupSplunkConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupSplunkConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSplunkConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getSplunkConnector.
type LookupSplunkConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupSplunkConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSplunkConnectorResult)(nil)).Elem()
}

func (o LookupSplunkConnectorResultOutput) ToLookupSplunkConnectorResultOutput() LookupSplunkConnectorResultOutput {
	return o
}

func (o LookupSplunkConnectorResultOutput) ToLookupSplunkConnectorResultOutputWithContext(ctx context.Context) LookupSplunkConnectorResultOutput {
	return o
}

// Splunk account id.
func (o LookupSplunkConnectorResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Tags to filter delegates for connection.
func (o LookupSplunkConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupSplunkConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSplunkConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupSplunkConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupSplunkConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupSplunkConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// The reference to the Harness secret containing the Splunk password. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o LookupSplunkConnectorResultOutput) PasswordRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) string { return v.PasswordRef }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o LookupSplunkConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupSplunkConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Splunk server.
func (o LookupSplunkConnectorResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) string { return v.Url }).(pulumi.StringOutput)
}

// The username used for connecting to Splunk.
func (o LookupSplunkConnectorResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSplunkConnectorResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSplunkConnectorResultOutput{})
}
