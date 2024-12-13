// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package autostopping

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness Variable.
func LookupRuleVm(ctx *pulumi.Context, args *LookupRuleVmArgs, opts ...pulumi.InvokeOption) (*LookupRuleVmResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRuleVmResult
	err := ctx.Invoke("harness:autostopping/getRuleVm:getRuleVm", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRuleVm.
type LookupRuleVmArgs struct {
	// Id of the cloud connector
	CloudConnectorId string `pulumi:"cloudConnectorId"`
	// Custom URLs used to access the instances
	CustomDomains []string `pulumi:"customDomains"`
	// Dependent rules
	Depends []GetRuleVmDepend `pulumi:"depends"`
	Filter  GetRuleVmFilter   `pulumi:"filter"`
	// Http routing configuration
	Https []GetRuleVmHttp `pulumi:"https"`
	// Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
	IdleTimeMins *int `pulumi:"idleTimeMins"`
	// Name of the rule
	Name string `pulumi:"name"`
	// TCP routing configuration
	Tcps []GetRuleVmTcp `pulumi:"tcps"`
	// Boolean that indicates whether the selected instances should be converted to spot vm
	UseSpot *bool `pulumi:"useSpot"`
}

// A collection of values returned by getRuleVm.
type LookupRuleVmResult struct {
	// Id of the cloud connector
	CloudConnectorId string `pulumi:"cloudConnectorId"`
	// Custom URLs used to access the instances
	CustomDomains []string `pulumi:"customDomains"`
	// Dependent rules
	Depends []GetRuleVmDepend `pulumi:"depends"`
	Filter  GetRuleVmFilter   `pulumi:"filter"`
	// Http routing configuration
	Https []GetRuleVmHttp `pulumi:"https"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource
	Identifier float64 `pulumi:"identifier"`
	// Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
	IdleTimeMins *int `pulumi:"idleTimeMins"`
	// Name of the rule
	Name string `pulumi:"name"`
	// TCP routing configuration
	Tcps []GetRuleVmTcp `pulumi:"tcps"`
	// Boolean that indicates whether the selected instances should be converted to spot vm
	UseSpot *bool `pulumi:"useSpot"`
}

func LookupRuleVmOutput(ctx *pulumi.Context, args LookupRuleVmOutputArgs, opts ...pulumi.InvokeOption) LookupRuleVmResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupRuleVmResultOutput, error) {
			args := v.(LookupRuleVmArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:autostopping/getRuleVm:getRuleVm", args, LookupRuleVmResultOutput{}, options).(LookupRuleVmResultOutput), nil
		}).(LookupRuleVmResultOutput)
}

// A collection of arguments for invoking getRuleVm.
type LookupRuleVmOutputArgs struct {
	// Id of the cloud connector
	CloudConnectorId pulumi.StringInput `pulumi:"cloudConnectorId"`
	// Custom URLs used to access the instances
	CustomDomains pulumi.StringArrayInput `pulumi:"customDomains"`
	// Dependent rules
	Depends GetRuleVmDependArrayInput `pulumi:"depends"`
	Filter  GetRuleVmFilterInput      `pulumi:"filter"`
	// Http routing configuration
	Https GetRuleVmHttpArrayInput `pulumi:"https"`
	// Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
	IdleTimeMins pulumi.IntPtrInput `pulumi:"idleTimeMins"`
	// Name of the rule
	Name pulumi.StringInput `pulumi:"name"`
	// TCP routing configuration
	Tcps GetRuleVmTcpArrayInput `pulumi:"tcps"`
	// Boolean that indicates whether the selected instances should be converted to spot vm
	UseSpot pulumi.BoolPtrInput `pulumi:"useSpot"`
}

func (LookupRuleVmOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRuleVmArgs)(nil)).Elem()
}

// A collection of values returned by getRuleVm.
type LookupRuleVmResultOutput struct{ *pulumi.OutputState }

func (LookupRuleVmResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRuleVmResult)(nil)).Elem()
}

func (o LookupRuleVmResultOutput) ToLookupRuleVmResultOutput() LookupRuleVmResultOutput {
	return o
}

func (o LookupRuleVmResultOutput) ToLookupRuleVmResultOutputWithContext(ctx context.Context) LookupRuleVmResultOutput {
	return o
}

// Id of the cloud connector
func (o LookupRuleVmResultOutput) CloudConnectorId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleVmResult) string { return v.CloudConnectorId }).(pulumi.StringOutput)
}

// Custom URLs used to access the instances
func (o LookupRuleVmResultOutput) CustomDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRuleVmResult) []string { return v.CustomDomains }).(pulumi.StringArrayOutput)
}

// Dependent rules
func (o LookupRuleVmResultOutput) Depends() GetRuleVmDependArrayOutput {
	return o.ApplyT(func(v LookupRuleVmResult) []GetRuleVmDepend { return v.Depends }).(GetRuleVmDependArrayOutput)
}

func (o LookupRuleVmResultOutput) Filter() GetRuleVmFilterOutput {
	return o.ApplyT(func(v LookupRuleVmResult) GetRuleVmFilter { return v.Filter }).(GetRuleVmFilterOutput)
}

// Http routing configuration
func (o LookupRuleVmResultOutput) Https() GetRuleVmHttpArrayOutput {
	return o.ApplyT(func(v LookupRuleVmResult) []GetRuleVmHttp { return v.Https }).(GetRuleVmHttpArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRuleVmResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleVmResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource
func (o LookupRuleVmResultOutput) Identifier() pulumi.Float64Output {
	return o.ApplyT(func(v LookupRuleVmResult) float64 { return v.Identifier }).(pulumi.Float64Output)
}

// Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
func (o LookupRuleVmResultOutput) IdleTimeMins() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupRuleVmResult) *int { return v.IdleTimeMins }).(pulumi.IntPtrOutput)
}

// Name of the rule
func (o LookupRuleVmResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleVmResult) string { return v.Name }).(pulumi.StringOutput)
}

// TCP routing configuration
func (o LookupRuleVmResultOutput) Tcps() GetRuleVmTcpArrayOutput {
	return o.ApplyT(func(v LookupRuleVmResult) []GetRuleVmTcp { return v.Tcps }).(GetRuleVmTcpArrayOutput)
}

// Boolean that indicates whether the selected instances should be converted to spot vm
func (o LookupRuleVmResultOutput) UseSpot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupRuleVmResult) *bool { return v.UseSpot }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRuleVmResultOutput{})
}
