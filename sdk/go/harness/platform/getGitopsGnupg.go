// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a GPG public key in the server's configuration.
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
//			_, err := platform.LookupGitopsGnupg(ctx, &platform.LookupGitopsGnupgArgs{
//				AccountId:  "account_id",
//				AgentId:    "agent_id",
//				Identifier: pulumi.StringRef("identifier"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupGitopsGnupg(ctx *pulumi.Context, args *LookupGitopsGnupgArgs, opts ...pulumi.InvokeOption) (*LookupGitopsGnupgResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupGitopsGnupgResult
	err := ctx.Invoke("harness:platform/getGitopsGnupg:getGitopsGnupg", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsGnupg.
type LookupGitopsGnupgArgs struct {
	// Account Identifier for the GnuPG Key.
	AccountId string `pulumi:"accountId"`
	// Agent identifier for the GnuPG Key.
	AgentId string `pulumi:"agentId"`
	// Identifier for the GnuPG Key.
	Identifier *string `pulumi:"identifier"`
	// Organization Identifier for the GnuPG Key.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the GnuPG Key.
	ProjectId *string `pulumi:"projectId"`
	// GnuPGPublicKey is a representation of a GnuPG public key
	Requests []GetGitopsGnupgRequest `pulumi:"requests"`
}

// A collection of values returned by getGitopsGnupg.
type LookupGitopsGnupgResult struct {
	// Account Identifier for the GnuPG Key.
	AccountId string `pulumi:"accountId"`
	// Agent identifier for the GnuPG Key.
	AgentId string `pulumi:"agentId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier for the GnuPG Key.
	Identifier *string `pulumi:"identifier"`
	// Organization Identifier for the GnuPG Key.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the GnuPG Key.
	ProjectId *string `pulumi:"projectId"`
	// GnuPGPublicKey is a representation of a GnuPG public key
	Requests []GetGitopsGnupgRequest `pulumi:"requests"`
}

func LookupGitopsGnupgOutput(ctx *pulumi.Context, args LookupGitopsGnupgOutputArgs, opts ...pulumi.InvokeOption) LookupGitopsGnupgResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGitopsGnupgResult, error) {
			args := v.(LookupGitopsGnupgArgs)
			r, err := LookupGitopsGnupg(ctx, &args, opts...)
			var s LookupGitopsGnupgResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGitopsGnupgResultOutput)
}

// A collection of arguments for invoking getGitopsGnupg.
type LookupGitopsGnupgOutputArgs struct {
	// Account Identifier for the GnuPG Key.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Agent identifier for the GnuPG Key.
	AgentId pulumi.StringInput `pulumi:"agentId"`
	// Identifier for the GnuPG Key.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Organization Identifier for the GnuPG Key.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project Identifier for the GnuPG Key.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// GnuPGPublicKey is a representation of a GnuPG public key
	Requests GetGitopsGnupgRequestArrayInput `pulumi:"requests"`
}

func (LookupGitopsGnupgOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGitopsGnupgArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsGnupg.
type LookupGitopsGnupgResultOutput struct{ *pulumi.OutputState }

func (LookupGitopsGnupgResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGitopsGnupgResult)(nil)).Elem()
}

func (o LookupGitopsGnupgResultOutput) ToLookupGitopsGnupgResultOutput() LookupGitopsGnupgResultOutput {
	return o
}

func (o LookupGitopsGnupgResultOutput) ToLookupGitopsGnupgResultOutputWithContext(ctx context.Context) LookupGitopsGnupgResultOutput {
	return o
}

// Account Identifier for the GnuPG Key.
func (o LookupGitopsGnupgResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsGnupgResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier for the GnuPG Key.
func (o LookupGitopsGnupgResultOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsGnupgResult) string { return v.AgentId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGitopsGnupgResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsGnupgResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier for the GnuPG Key.
func (o LookupGitopsGnupgResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitopsGnupgResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Organization Identifier for the GnuPG Key.
func (o LookupGitopsGnupgResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitopsGnupgResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project Identifier for the GnuPG Key.
func (o LookupGitopsGnupgResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitopsGnupgResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// GnuPGPublicKey is a representation of a GnuPG public key
func (o LookupGitopsGnupgResultOutput) Requests() GetGitopsGnupgRequestArrayOutput {
	return o.ApplyT(func(v LookupGitopsGnupgResult) []GetGitopsGnupgRequest { return v.Requests }).(GetGitopsGnupgRequestArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGitopsGnupgResultOutput{})
}
