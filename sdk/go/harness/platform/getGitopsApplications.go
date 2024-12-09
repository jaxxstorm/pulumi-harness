// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for fetching a Harness GitOps Application.
func GetGitopsApplications(ctx *pulumi.Context, args *GetGitopsApplicationsArgs, opts ...pulumi.InvokeOption) (*GetGitopsApplicationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGitopsApplicationsResult
	err := ctx.Invoke("harness:platform/getGitopsApplications:getGitopsApplications", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsApplications.
type GetGitopsApplicationsArgs struct {
	// Account identifier of the GitOps application.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId *string `pulumi:"accountId"`
	// Agent identifier of the GitOps application.
	AgentId string `pulumi:"agentId"`
	// Identifier of the GitOps application.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	Identifier *string `pulumi:"identifier"`
	// Name of the GitOps application.
	Name string `pulumi:"name"`
	// Organization identifier of the GitOps application.
	OrgId string `pulumi:"orgId"`
	// Project identifier of the GitOps application.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getGitopsApplications.
type GetGitopsApplicationsResult struct {
	// Account identifier of the GitOps application.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps application.
	AgentId string `pulumi:"agentId"`
	// Definition of the GitOps application resource.
	Applications []GetGitopsApplicationsApplication `pulumi:"applications"`
	// Cluster identifier of the GitOps application.
	ClusterId string `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the GitOps application.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	Identifier *string `pulumi:"identifier"`
	// Kind of the GitOps application.
	Kind string `pulumi:"kind"`
	// Name of the GitOps application.
	Name string `pulumi:"name"`
	// Options to remove existing finalizers to delete the GitOps application.
	OptionsRemoveExistingFinalizers bool `pulumi:"optionsRemoveExistingFinalizers"`
	// Organization identifier of the GitOps application.
	OrgId string `pulumi:"orgId"`
	// The ArgoCD project name corresponding to this GitOps application. An empty string means that the GitOps application belongs to the default project created by Harness.
	Project string `pulumi:"project"`
	// Project identifier of the GitOps application.
	ProjectId string `pulumi:"projectId"`
	// Repository identifier of the GitOps application.
	RepoId string `pulumi:"repoId"`
	// Request cascade to delete the GitOps application.
	RequestCascade bool `pulumi:"requestCascade"`
	// Request propagation policy to delete the GitOps application.
	RequestPropagationPolicy string `pulumi:"requestPropagationPolicy"`
	// Indicates if the GitOps application should skip validate repository definition exists.
	SkipRepoValidation bool `pulumi:"skipRepoValidation"`
	// Indicates if the GitOps application should be updated if existing and inserted if not.
	Upsert bool `pulumi:"upsert"`
	// Indicates if the GitOps application yaml has to be validated.
	Validate bool `pulumi:"validate"`
}

func GetGitopsApplicationsOutput(ctx *pulumi.Context, args GetGitopsApplicationsOutputArgs, opts ...pulumi.InvokeOption) GetGitopsApplicationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGitopsApplicationsResultOutput, error) {
			args := v.(GetGitopsApplicationsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetGitopsApplicationsResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getGitopsApplications:getGitopsApplications", args, &rv, "", opts...)
			if err != nil {
				return GetGitopsApplicationsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetGitopsApplicationsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetGitopsApplicationsResultOutput), nil
			}
			return output, nil
		}).(GetGitopsApplicationsResultOutput)
}

// A collection of arguments for invoking getGitopsApplications.
type GetGitopsApplicationsOutputArgs struct {
	// Account identifier of the GitOps application.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// Agent identifier of the GitOps application.
	AgentId pulumi.StringInput `pulumi:"agentId"`
	// Identifier of the GitOps application.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the GitOps application.
	Name pulumi.StringInput `pulumi:"name"`
	// Organization identifier of the GitOps application.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Project identifier of the GitOps application.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (GetGitopsApplicationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsApplicationsArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsApplications.
type GetGitopsApplicationsResultOutput struct{ *pulumi.OutputState }

func (GetGitopsApplicationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsApplicationsResult)(nil)).Elem()
}

func (o GetGitopsApplicationsResultOutput) ToGetGitopsApplicationsResultOutput() GetGitopsApplicationsResultOutput {
	return o
}

func (o GetGitopsApplicationsResultOutput) ToGetGitopsApplicationsResultOutputWithContext(ctx context.Context) GetGitopsApplicationsResultOutput {
	return o
}

// Account identifier of the GitOps application.
//
// Deprecated: This field is deprecated and will be removed in a future release.
func (o GetGitopsApplicationsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier of the GitOps application.
func (o GetGitopsApplicationsResultOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.AgentId }).(pulumi.StringOutput)
}

// Definition of the GitOps application resource.
func (o GetGitopsApplicationsResultOutput) Applications() GetGitopsApplicationsApplicationArrayOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) []GetGitopsApplicationsApplication { return v.Applications }).(GetGitopsApplicationsApplicationArrayOutput)
}

// Cluster identifier of the GitOps application.
func (o GetGitopsApplicationsResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGitopsApplicationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the GitOps application.
//
// Deprecated: This field is deprecated and will be removed in a future release.
func (o GetGitopsApplicationsResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Kind of the GitOps application.
func (o GetGitopsApplicationsResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.Kind }).(pulumi.StringOutput)
}

// Name of the GitOps application.
func (o GetGitopsApplicationsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.Name }).(pulumi.StringOutput)
}

// Options to remove existing finalizers to delete the GitOps application.
func (o GetGitopsApplicationsResultOutput) OptionsRemoveExistingFinalizers() pulumi.BoolOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) bool { return v.OptionsRemoveExistingFinalizers }).(pulumi.BoolOutput)
}

// Organization identifier of the GitOps application.
func (o GetGitopsApplicationsResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// The ArgoCD project name corresponding to this GitOps application. An empty string means that the GitOps application belongs to the default project created by Harness.
func (o GetGitopsApplicationsResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.Project }).(pulumi.StringOutput)
}

// Project identifier of the GitOps application.
func (o GetGitopsApplicationsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Repository identifier of the GitOps application.
func (o GetGitopsApplicationsResultOutput) RepoId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.RepoId }).(pulumi.StringOutput)
}

// Request cascade to delete the GitOps application.
func (o GetGitopsApplicationsResultOutput) RequestCascade() pulumi.BoolOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) bool { return v.RequestCascade }).(pulumi.BoolOutput)
}

// Request propagation policy to delete the GitOps application.
func (o GetGitopsApplicationsResultOutput) RequestPropagationPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) string { return v.RequestPropagationPolicy }).(pulumi.StringOutput)
}

// Indicates if the GitOps application should skip validate repository definition exists.
func (o GetGitopsApplicationsResultOutput) SkipRepoValidation() pulumi.BoolOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) bool { return v.SkipRepoValidation }).(pulumi.BoolOutput)
}

// Indicates if the GitOps application should be updated if existing and inserted if not.
func (o GetGitopsApplicationsResultOutput) Upsert() pulumi.BoolOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) bool { return v.Upsert }).(pulumi.BoolOutput)
}

// Indicates if the GitOps application yaml has to be validated.
func (o GetGitopsApplicationsResultOutput) Validate() pulumi.BoolOutput {
	return o.ApplyT(func(v GetGitopsApplicationsResult) bool { return v.Validate }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGitopsApplicationsResultOutput{})
}
