// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := platform.LookupGitopsAppProject(ctx, &platform.LookupGitopsAppProjectArgs{
//				AgentId:   "agent_id",
//				QueryName: pulumi.StringRef("query_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupGitopsAppProject(ctx *pulumi.Context, args *LookupGitopsAppProjectArgs, opts ...pulumi.InvokeOption) (*LookupGitopsAppProjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGitopsAppProjectResult
	err := ctx.Invoke("harness:platform/getGitopsAppProject:getGitopsAppProject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsAppProject.
type LookupGitopsAppProjectArgs struct {
	// Account identifier of the GitOps project.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps project.
	AgentId string `pulumi:"agentId"`
	// Org identifier of the GitOps project.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId *string `pulumi:"projectId"`
	// Identifier for the GitOps project.
	QueryName *string `pulumi:"queryName"`
}

// A collection of values returned by getGitopsAppProject.
type LookupGitopsAppProjectResult struct {
	// Account identifier of the GitOps project.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps project.
	AgentId string `pulumi:"agentId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Org identifier of the GitOps project.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId *string `pulumi:"projectId"`
	// Identifier for the GitOps project.
	QueryName string `pulumi:"queryName"`
}

func LookupGitopsAppProjectOutput(ctx *pulumi.Context, args LookupGitopsAppProjectOutputArgs, opts ...pulumi.InvokeOption) LookupGitopsAppProjectResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGitopsAppProjectResultOutput, error) {
			args := v.(LookupGitopsAppProjectArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupGitopsAppProjectResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getGitopsAppProject:getGitopsAppProject", args, &rv, "", opts...)
			if err != nil {
				return LookupGitopsAppProjectResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupGitopsAppProjectResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupGitopsAppProjectResultOutput), nil
			}
			return output, nil
		}).(LookupGitopsAppProjectResultOutput)
}

// A collection of arguments for invoking getGitopsAppProject.
type LookupGitopsAppProjectOutputArgs struct {
	// Account identifier of the GitOps project.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Agent identifier of the GitOps project.
	AgentId pulumi.StringInput `pulumi:"agentId"`
	// Org identifier of the GitOps project.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Identifier for the GitOps project.
	QueryName pulumi.StringPtrInput `pulumi:"queryName"`
}

func (LookupGitopsAppProjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGitopsAppProjectArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsAppProject.
type LookupGitopsAppProjectResultOutput struct{ *pulumi.OutputState }

func (LookupGitopsAppProjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGitopsAppProjectResult)(nil)).Elem()
}

func (o LookupGitopsAppProjectResultOutput) ToLookupGitopsAppProjectResultOutput() LookupGitopsAppProjectResultOutput {
	return o
}

func (o LookupGitopsAppProjectResultOutput) ToLookupGitopsAppProjectResultOutputWithContext(ctx context.Context) LookupGitopsAppProjectResultOutput {
	return o
}

// Account identifier of the GitOps project.
func (o LookupGitopsAppProjectResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier of the GitOps project.
func (o LookupGitopsAppProjectResultOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectResult) string { return v.AgentId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGitopsAppProjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// Org identifier of the GitOps project.
func (o LookupGitopsAppProjectResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project identifier of the GitOps repository.
func (o LookupGitopsAppProjectResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Identifier for the GitOps project.
func (o LookupGitopsAppProjectResultOutput) QueryName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitopsAppProjectResult) string { return v.QueryName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGitopsAppProjectResultOutput{})
}
