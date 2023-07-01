// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupServiceOverridesV2(ctx *pulumi.Context, args *LookupServiceOverridesV2Args, opts ...pulumi.InvokeOption) (*LookupServiceOverridesV2Result, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupServiceOverridesV2Result
	err := ctx.Invoke("harness:platform/getServiceOverridesV2:getServiceOverridesV2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceOverridesV2.
type LookupServiceOverridesV2Args struct {
	ClusterId  *string `pulumi:"clusterId"`
	EnvId      string  `pulumi:"envId"`
	Identifier string  `pulumi:"identifier"`
	InfraId    *string `pulumi:"infraId"`
	OrgId      *string `pulumi:"orgId"`
	ProjectId  *string `pulumi:"projectId"`
	ServiceId  *string `pulumi:"serviceId"`
	Spec       string  `pulumi:"spec"`
	Type       string  `pulumi:"type"`
}

// A collection of values returned by getServiceOverridesV2.
type LookupServiceOverridesV2Result struct {
	ClusterId string `pulumi:"clusterId"`
	EnvId     string `pulumi:"envId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	Identifier string  `pulumi:"identifier"`
	InfraId    string  `pulumi:"infraId"`
	OrgId      *string `pulumi:"orgId"`
	ProjectId  *string `pulumi:"projectId"`
	ServiceId  string  `pulumi:"serviceId"`
	Spec       string  `pulumi:"spec"`
	Type       string  `pulumi:"type"`
}

func LookupServiceOverridesV2Output(ctx *pulumi.Context, args LookupServiceOverridesV2OutputArgs, opts ...pulumi.InvokeOption) LookupServiceOverridesV2ResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceOverridesV2Result, error) {
			args := v.(LookupServiceOverridesV2Args)
			r, err := LookupServiceOverridesV2(ctx, &args, opts...)
			var s LookupServiceOverridesV2Result
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceOverridesV2ResultOutput)
}

// A collection of arguments for invoking getServiceOverridesV2.
type LookupServiceOverridesV2OutputArgs struct {
	ClusterId  pulumi.StringPtrInput `pulumi:"clusterId"`
	EnvId      pulumi.StringInput    `pulumi:"envId"`
	Identifier pulumi.StringInput    `pulumi:"identifier"`
	InfraId    pulumi.StringPtrInput `pulumi:"infraId"`
	OrgId      pulumi.StringPtrInput `pulumi:"orgId"`
	ProjectId  pulumi.StringPtrInput `pulumi:"projectId"`
	ServiceId  pulumi.StringPtrInput `pulumi:"serviceId"`
	Spec       pulumi.StringInput    `pulumi:"spec"`
	Type       pulumi.StringInput    `pulumi:"type"`
}

func (LookupServiceOverridesV2OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceOverridesV2Args)(nil)).Elem()
}

// A collection of values returned by getServiceOverridesV2.
type LookupServiceOverridesV2ResultOutput struct{ *pulumi.OutputState }

func (LookupServiceOverridesV2ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceOverridesV2Result)(nil)).Elem()
}

func (o LookupServiceOverridesV2ResultOutput) ToLookupServiceOverridesV2ResultOutput() LookupServiceOverridesV2ResultOutput {
	return o
}

func (o LookupServiceOverridesV2ResultOutput) ToLookupServiceOverridesV2ResultOutputWithContext(ctx context.Context) LookupServiceOverridesV2ResultOutput {
	return o
}

func (o LookupServiceOverridesV2ResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) string { return v.ClusterId }).(pulumi.StringOutput)
}

func (o LookupServiceOverridesV2ResultOutput) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) string { return v.EnvId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceOverridesV2ResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupServiceOverridesV2ResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) string { return v.Identifier }).(pulumi.StringOutput)
}

func (o LookupServiceOverridesV2ResultOutput) InfraId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) string { return v.InfraId }).(pulumi.StringOutput)
}

func (o LookupServiceOverridesV2ResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o LookupServiceOverridesV2ResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

func (o LookupServiceOverridesV2ResultOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) string { return v.ServiceId }).(pulumi.StringOutput)
}

func (o LookupServiceOverridesV2ResultOutput) Spec() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) string { return v.Spec }).(pulumi.StringOutput)
}

func (o LookupServiceOverridesV2ResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceOverridesV2Result) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceOverridesV2ResultOutput{})
}
