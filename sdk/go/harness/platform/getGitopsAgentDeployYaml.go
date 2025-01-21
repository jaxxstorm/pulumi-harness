// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for fetching a Harness Gitops Agent deployment manifest YAML.
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
//			_, err := platform.GetGitopsAgentDeployYaml(ctx, &platform.GetGitopsAgentDeployYamlArgs{
//				Identifier: "identifier",
//				AccountId:  pulumi.StringRef("account_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//				OrgId:      pulumi.StringRef("org_id"),
//				Namespace:  "namespace",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGitopsAgentDeployYaml(ctx *pulumi.Context, args *GetGitopsAgentDeployYamlArgs, opts ...pulumi.InvokeOption) (*GetGitopsAgentDeployYamlResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGitopsAgentDeployYamlResult
	err := ctx.Invoke("harness:platform/getGitopsAgentDeployYaml:getGitopsAgentDeployYaml", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsAgentDeployYaml.
type GetGitopsAgentDeployYamlArgs struct {
	// Account identifier of the GitOps agent.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId *string `pulumi:"accountId"`
	// CA data of the GitOps agent, base64 encoded content of ca chain.
	CaData *string `pulumi:"caData"`
	// Identifier of the GitOps agent.
	Identifier string `pulumi:"identifier"`
	// The kubernetes namespace where the agent is installed.
	Namespace string `pulumi:"namespace"`
	// Organization identifier of the GitOps agent.
	OrgId *string `pulumi:"orgId"`
	// Private key for the GitOps agent. If provided authentication token will not be regenerated. Must be base64 encoded.
	PrivateKey *string `pulumi:"privateKey"`
	// Project identifier of the GitOps agent.
	ProjectId *string `pulumi:"projectId"`
	// Proxy settings for the GitOps agent.
	Proxies []GetGitopsAgentDeployYamlProxy `pulumi:"proxies"`
	// Skip CRDs for the GitOps agent.
	SkipCrds *bool `pulumi:"skipCrds"`
}

// A collection of values returned by getGitopsAgentDeployYaml.
type GetGitopsAgentDeployYamlResult struct {
	// Account identifier of the GitOps agent.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId string `pulumi:"accountId"`
	// CA data of the GitOps agent, base64 encoded content of ca chain.
	CaData *string `pulumi:"caData"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the GitOps agent.
	Identifier string `pulumi:"identifier"`
	// The kubernetes namespace where the agent is installed.
	Namespace string `pulumi:"namespace"`
	// Organization identifier of the GitOps agent.
	OrgId *string `pulumi:"orgId"`
	// Private key for the GitOps agent. If provided authentication token will not be regenerated. Must be base64 encoded.
	PrivateKey *string `pulumi:"privateKey"`
	// Project identifier of the GitOps agent.
	ProjectId *string `pulumi:"projectId"`
	// Proxy settings for the GitOps agent.
	Proxies []GetGitopsAgentDeployYamlProxy `pulumi:"proxies"`
	// Skip CRDs for the GitOps agent.
	SkipCrds *bool `pulumi:"skipCrds"`
	// The deployment manifest YAML of the GitOps agent.
	Yaml string `pulumi:"yaml"`
}

func GetGitopsAgentDeployYamlOutput(ctx *pulumi.Context, args GetGitopsAgentDeployYamlOutputArgs, opts ...pulumi.InvokeOption) GetGitopsAgentDeployYamlResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetGitopsAgentDeployYamlResultOutput, error) {
			args := v.(GetGitopsAgentDeployYamlArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getGitopsAgentDeployYaml:getGitopsAgentDeployYaml", args, GetGitopsAgentDeployYamlResultOutput{}, options).(GetGitopsAgentDeployYamlResultOutput), nil
		}).(GetGitopsAgentDeployYamlResultOutput)
}

// A collection of arguments for invoking getGitopsAgentDeployYaml.
type GetGitopsAgentDeployYamlOutputArgs struct {
	// Account identifier of the GitOps agent.
	//
	// Deprecated: This field is deprecated and will be removed in a future release.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// CA data of the GitOps agent, base64 encoded content of ca chain.
	CaData pulumi.StringPtrInput `pulumi:"caData"`
	// Identifier of the GitOps agent.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// The kubernetes namespace where the agent is installed.
	Namespace pulumi.StringInput `pulumi:"namespace"`
	// Organization identifier of the GitOps agent.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Private key for the GitOps agent. If provided authentication token will not be regenerated. Must be base64 encoded.
	PrivateKey pulumi.StringPtrInput `pulumi:"privateKey"`
	// Project identifier of the GitOps agent.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Proxy settings for the GitOps agent.
	Proxies GetGitopsAgentDeployYamlProxyArrayInput `pulumi:"proxies"`
	// Skip CRDs for the GitOps agent.
	SkipCrds pulumi.BoolPtrInput `pulumi:"skipCrds"`
}

func (GetGitopsAgentDeployYamlOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsAgentDeployYamlArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsAgentDeployYaml.
type GetGitopsAgentDeployYamlResultOutput struct{ *pulumi.OutputState }

func (GetGitopsAgentDeployYamlResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsAgentDeployYamlResult)(nil)).Elem()
}

func (o GetGitopsAgentDeployYamlResultOutput) ToGetGitopsAgentDeployYamlResultOutput() GetGitopsAgentDeployYamlResultOutput {
	return o
}

func (o GetGitopsAgentDeployYamlResultOutput) ToGetGitopsAgentDeployYamlResultOutputWithContext(ctx context.Context) GetGitopsAgentDeployYamlResultOutput {
	return o
}

// Account identifier of the GitOps agent.
//
// Deprecated: This field is deprecated and will be removed in a future release.
func (o GetGitopsAgentDeployYamlResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// CA data of the GitOps agent, base64 encoded content of ca chain.
func (o GetGitopsAgentDeployYamlResultOutput) CaData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) *string { return v.CaData }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGitopsAgentDeployYamlResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the GitOps agent.
func (o GetGitopsAgentDeployYamlResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// The kubernetes namespace where the agent is installed.
func (o GetGitopsAgentDeployYamlResultOutput) Namespace() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) string { return v.Namespace }).(pulumi.StringOutput)
}

// Organization identifier of the GitOps agent.
func (o GetGitopsAgentDeployYamlResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Private key for the GitOps agent. If provided authentication token will not be regenerated. Must be base64 encoded.
func (o GetGitopsAgentDeployYamlResultOutput) PrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) *string { return v.PrivateKey }).(pulumi.StringPtrOutput)
}

// Project identifier of the GitOps agent.
func (o GetGitopsAgentDeployYamlResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Proxy settings for the GitOps agent.
func (o GetGitopsAgentDeployYamlResultOutput) Proxies() GetGitopsAgentDeployYamlProxyArrayOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) []GetGitopsAgentDeployYamlProxy { return v.Proxies }).(GetGitopsAgentDeployYamlProxyArrayOutput)
}

// Skip CRDs for the GitOps agent.
func (o GetGitopsAgentDeployYamlResultOutput) SkipCrds() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) *bool { return v.SkipCrds }).(pulumi.BoolPtrOutput)
}

// The deployment manifest YAML of the GitOps agent.
func (o GetGitopsAgentDeployYamlResultOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsAgentDeployYamlResult) string { return v.Yaml }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGitopsAgentDeployYamlResultOutput{})
}
