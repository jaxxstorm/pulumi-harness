// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package governance

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a rule enforcement.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/governance"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := governance.LookupRuleEnforcement(ctx, &governance.LookupRuleEnforcementArgs{
//				EnforcementId: "enforcement_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRuleEnforcement(ctx *pulumi.Context, args *LookupRuleEnforcementArgs, opts ...pulumi.InvokeOption) (*LookupRuleEnforcementResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRuleEnforcementResult
	err := ctx.Invoke("harness:governance/getRuleEnforcement:getRuleEnforcement", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRuleEnforcement.
type LookupRuleEnforcementArgs struct {
	// Id of rule enforcement.
	EnforcementId string `pulumi:"enforcementId"`
}

// A collection of values returned by getRuleEnforcement.
type LookupRuleEnforcementResult struct {
	// The cloud provider for the rule enforcement.
	CloudProvider string `pulumi:"cloudProvider"`
	// Description for rule enforcement.
	Description string `pulumi:"description"`
	// Id of rule enforcement.
	EnforcementId string `pulumi:"enforcementId"`
	// Execution schedule in cron format.
	ExecutionSchedule string `pulumi:"executionSchedule"`
	// Timezone for the execution schedule.
	ExecutionTimezone string `pulumi:"executionTimezone"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Indicates if the rule enforcement is a dry run.
	IsDryRun bool `pulumi:"isDryRun"`
	// Indicates if the rule enforcement is enabled.
	IsEnabled bool `pulumi:"isEnabled"`
	// Name of the rule enforcement.
	Name string `pulumi:"name"`
	// List of rule IDs.
	RuleIds map[string]string `pulumi:"ruleIds"`
	// List of rule set IDs.
	RuleSetIds map[string]string `pulumi:"ruleSetIds"`
	// List of target accounts.
	TargetAccounts []string `pulumi:"targetAccounts"`
	// List of target regions.
	TargetRegions []string `pulumi:"targetRegions"`
}

func LookupRuleEnforcementOutput(ctx *pulumi.Context, args LookupRuleEnforcementOutputArgs, opts ...pulumi.InvokeOption) LookupRuleEnforcementResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRuleEnforcementResultOutput, error) {
			args := v.(LookupRuleEnforcementArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupRuleEnforcementResult
			secret, err := ctx.InvokePackageRaw("harness:governance/getRuleEnforcement:getRuleEnforcement", args, &rv, "", opts...)
			if err != nil {
				return LookupRuleEnforcementResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupRuleEnforcementResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupRuleEnforcementResultOutput), nil
			}
			return output, nil
		}).(LookupRuleEnforcementResultOutput)
}

// A collection of arguments for invoking getRuleEnforcement.
type LookupRuleEnforcementOutputArgs struct {
	// Id of rule enforcement.
	EnforcementId pulumi.StringInput `pulumi:"enforcementId"`
}

func (LookupRuleEnforcementOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRuleEnforcementArgs)(nil)).Elem()
}

// A collection of values returned by getRuleEnforcement.
type LookupRuleEnforcementResultOutput struct{ *pulumi.OutputState }

func (LookupRuleEnforcementResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRuleEnforcementResult)(nil)).Elem()
}

func (o LookupRuleEnforcementResultOutput) ToLookupRuleEnforcementResultOutput() LookupRuleEnforcementResultOutput {
	return o
}

func (o LookupRuleEnforcementResultOutput) ToLookupRuleEnforcementResultOutputWithContext(ctx context.Context) LookupRuleEnforcementResultOutput {
	return o
}

// The cloud provider for the rule enforcement.
func (o LookupRuleEnforcementResultOutput) CloudProvider() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) string { return v.CloudProvider }).(pulumi.StringOutput)
}

// Description for rule enforcement.
func (o LookupRuleEnforcementResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) string { return v.Description }).(pulumi.StringOutput)
}

// Id of rule enforcement.
func (o LookupRuleEnforcementResultOutput) EnforcementId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) string { return v.EnforcementId }).(pulumi.StringOutput)
}

// Execution schedule in cron format.
func (o LookupRuleEnforcementResultOutput) ExecutionSchedule() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) string { return v.ExecutionSchedule }).(pulumi.StringOutput)
}

// Timezone for the execution schedule.
func (o LookupRuleEnforcementResultOutput) ExecutionTimezone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) string { return v.ExecutionTimezone }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRuleEnforcementResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) string { return v.Id }).(pulumi.StringOutput)
}

// Indicates if the rule enforcement is a dry run.
func (o LookupRuleEnforcementResultOutput) IsDryRun() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) bool { return v.IsDryRun }).(pulumi.BoolOutput)
}

// Indicates if the rule enforcement is enabled.
func (o LookupRuleEnforcementResultOutput) IsEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) bool { return v.IsEnabled }).(pulumi.BoolOutput)
}

// Name of the rule enforcement.
func (o LookupRuleEnforcementResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) string { return v.Name }).(pulumi.StringOutput)
}

// List of rule IDs.
func (o LookupRuleEnforcementResultOutput) RuleIds() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) map[string]string { return v.RuleIds }).(pulumi.StringMapOutput)
}

// List of rule set IDs.
func (o LookupRuleEnforcementResultOutput) RuleSetIds() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) map[string]string { return v.RuleSetIds }).(pulumi.StringMapOutput)
}

// List of target accounts.
func (o LookupRuleEnforcementResultOutput) TargetAccounts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) []string { return v.TargetAccounts }).(pulumi.StringArrayOutput)
}

// List of target regions.
func (o LookupRuleEnforcementResultOutput) TargetRegions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRuleEnforcementResult) []string { return v.TargetRegions }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRuleEnforcementResultOutput{})
}
