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
//			_, err := platform.LookupConnectorCustomSecretManager(ctx, &platform.LookupConnectorCustomSecretManagerArgs{
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
func LookupConnectorCustomSecretManager(ctx *pulumi.Context, args *LookupConnectorCustomSecretManagerArgs, opts ...pulumi.InvokeOption) (*LookupConnectorCustomSecretManagerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectorCustomSecretManagerResult
	err := ctx.Invoke("harness:platform/getConnectorCustomSecretManager:getConnectorCustomSecretManager", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectorCustomSecretManager.
type LookupConnectorCustomSecretManagerArgs struct {
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// : Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// : Name of the resource.
	Name      *string `pulumi:"name"`
	OrgId     *string `pulumi:"orgId"`
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getConnectorCustomSecretManager.
type LookupConnectorCustomSecretManagerResult struct {
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// : A brief description of what the resource does or is used for.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// : Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// : Name of the resource.
	Name *string `pulumi:"name"`
	// : Specifies whether the secrets manager runs on a Harness delegate.
	OnDelegate bool    `pulumi:"onDelegate"`
	OrgId      *string `pulumi:"orgId"`
	ProjectId  *string `pulumi:"projectId"`
	// : Reference to the Harness secret containing SSH credentials for the target host. Required if `onDelegate` is set to false.
	SshSecretRef string `pulumi:"sshSecretRef"`
	// : Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// : Host address where secrets will be managed. Required if `onDelegate` is set to false.
	TargetHost     string                                         `pulumi:"targetHost"`
	TemplateInputs []GetConnectorCustomSecretManagerTemplateInput `pulumi:"templateInputs"`
	// : Reference to the template used for managing secrets.
	TemplateRef string `pulumi:"templateRef"`
	// : Timeout in seconds for secrets management operations.
	Timeout int `pulumi:"timeout"`
	// : Type of the custom secrets manager, typically set to `CustomSecretManager`.
	Type string `pulumi:"type"`
	// : Version identifier of the secrets management template.
	VersionLabel string `pulumi:"versionLabel"`
	// : Directory path on the target host where secrets management tasks are performed. Required if `onDelegate` is set to false.
	WorkingDirectory string `pulumi:"workingDirectory"`
}

func LookupConnectorCustomSecretManagerOutput(ctx *pulumi.Context, args LookupConnectorCustomSecretManagerOutputArgs, opts ...pulumi.InvokeOption) LookupConnectorCustomSecretManagerResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConnectorCustomSecretManagerResultOutput, error) {
			args := v.(LookupConnectorCustomSecretManagerArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getConnectorCustomSecretManager:getConnectorCustomSecretManager", args, LookupConnectorCustomSecretManagerResultOutput{}, options).(LookupConnectorCustomSecretManagerResultOutput), nil
		}).(LookupConnectorCustomSecretManagerResultOutput)
}

// A collection of arguments for invoking getConnectorCustomSecretManager.
type LookupConnectorCustomSecretManagerOutputArgs struct {
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput `pulumi:"delegateSelectors"`
	// : Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// : Name of the resource.
	Name      pulumi.StringPtrInput `pulumi:"name"`
	OrgId     pulumi.StringPtrInput `pulumi:"orgId"`
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupConnectorCustomSecretManagerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorCustomSecretManagerArgs)(nil)).Elem()
}

// A collection of values returned by getConnectorCustomSecretManager.
type LookupConnectorCustomSecretManagerResultOutput struct{ *pulumi.OutputState }

func (LookupConnectorCustomSecretManagerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectorCustomSecretManagerResult)(nil)).Elem()
}

func (o LookupConnectorCustomSecretManagerResultOutput) ToLookupConnectorCustomSecretManagerResultOutput() LookupConnectorCustomSecretManagerResultOutput {
	return o
}

func (o LookupConnectorCustomSecretManagerResultOutput) ToLookupConnectorCustomSecretManagerResultOutputWithContext(ctx context.Context) LookupConnectorCustomSecretManagerResultOutput {
	return o
}

// Tags to filter delegates for connection.
func (o LookupConnectorCustomSecretManagerResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// : A brief description of what the resource does or is used for.
func (o LookupConnectorCustomSecretManagerResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectorCustomSecretManagerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.Id }).(pulumi.StringOutput)
}

// : Unique identifier of the resource.
func (o LookupConnectorCustomSecretManagerResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// : Name of the resource.
func (o LookupConnectorCustomSecretManagerResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// : Specifies whether the secrets manager runs on a Harness delegate.
func (o LookupConnectorCustomSecretManagerResultOutput) OnDelegate() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) bool { return v.OnDelegate }).(pulumi.BoolOutput)
}

func (o LookupConnectorCustomSecretManagerResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o LookupConnectorCustomSecretManagerResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// : Reference to the Harness secret containing SSH credentials for the target host. Required if `onDelegate` is set to false.
func (o LookupConnectorCustomSecretManagerResultOutput) SshSecretRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.SshSecretRef }).(pulumi.StringOutput)
}

// : Tags to associate with the resource.
func (o LookupConnectorCustomSecretManagerResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// : Host address where secrets will be managed. Required if `onDelegate` is set to false.
func (o LookupConnectorCustomSecretManagerResultOutput) TargetHost() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.TargetHost }).(pulumi.StringOutput)
}

func (o LookupConnectorCustomSecretManagerResultOutput) TemplateInputs() GetConnectorCustomSecretManagerTemplateInputArrayOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) []GetConnectorCustomSecretManagerTemplateInput {
		return v.TemplateInputs
	}).(GetConnectorCustomSecretManagerTemplateInputArrayOutput)
}

// : Reference to the template used for managing secrets.
func (o LookupConnectorCustomSecretManagerResultOutput) TemplateRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.TemplateRef }).(pulumi.StringOutput)
}

// : Timeout in seconds for secrets management operations.
func (o LookupConnectorCustomSecretManagerResultOutput) Timeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) int { return v.Timeout }).(pulumi.IntOutput)
}

// : Type of the custom secrets manager, typically set to `CustomSecretManager`.
func (o LookupConnectorCustomSecretManagerResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.Type }).(pulumi.StringOutput)
}

// : Version identifier of the secrets management template.
func (o LookupConnectorCustomSecretManagerResultOutput) VersionLabel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.VersionLabel }).(pulumi.StringOutput)
}

// : Directory path on the target host where secrets management tasks are performed. Required if `onDelegate` is set to false.
func (o LookupConnectorCustomSecretManagerResultOutput) WorkingDirectory() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectorCustomSecretManagerResult) string { return v.WorkingDirectory }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectorCustomSecretManagerResultOutput{})
}
