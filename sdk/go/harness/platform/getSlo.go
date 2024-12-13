// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving an SLO.
func LookupSlo(ctx *pulumi.Context, args *LookupSloArgs, opts ...pulumi.InvokeOption) (*LookupSloResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSloResult
	err := ctx.Invoke("harness:platform/getSlo:getSlo", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSlo.
type LookupSloArgs struct {
	// Identifier of the SLO.
	Identifier string `pulumi:"identifier"`
	// Identifier of the organization in which the SLO is configured.
	OrgId string `pulumi:"orgId"`
	// Identifier of the project in which the SLO is configured.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getSlo.
type LookupSloResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the SLO.
	Identifier string `pulumi:"identifier"`
	// Identifier of the organization in which the SLO is configured.
	OrgId string `pulumi:"orgId"`
	// Identifier of the project in which the SLO is configured.
	ProjectId string `pulumi:"projectId"`
}

func LookupSloOutput(ctx *pulumi.Context, args LookupSloOutputArgs, opts ...pulumi.InvokeOption) LookupSloResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSloResultOutput, error) {
			args := v.(LookupSloArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getSlo:getSlo", args, LookupSloResultOutput{}, options).(LookupSloResultOutput), nil
		}).(LookupSloResultOutput)
}

// A collection of arguments for invoking getSlo.
type LookupSloOutputArgs struct {
	// Identifier of the SLO.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Identifier of the organization in which the SLO is configured.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Identifier of the project in which the SLO is configured.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupSloOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSloArgs)(nil)).Elem()
}

// A collection of values returned by getSlo.
type LookupSloResultOutput struct{ *pulumi.OutputState }

func (LookupSloResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSloResult)(nil)).Elem()
}

func (o LookupSloResultOutput) ToLookupSloResultOutput() LookupSloResultOutput {
	return o
}

func (o LookupSloResultOutput) ToLookupSloResultOutputWithContext(ctx context.Context) LookupSloResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSloResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSloResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the SLO.
func (o LookupSloResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSloResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Identifier of the organization in which the SLO is configured.
func (o LookupSloResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSloResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Identifier of the project in which the SLO is configured.
func (o LookupSloResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSloResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSloResultOutput{})
}
