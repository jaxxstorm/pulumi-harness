// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Github connector.
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
//			_, err := platform.LookupGithubConnector(ctx, &platform.LookupGithubConnectorArgs{
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
func LookupGithubConnector(ctx *pulumi.Context, args *LookupGithubConnectorArgs, opts ...pulumi.InvokeOption) (*LookupGithubConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGithubConnectorResult
	err := ctx.Invoke("harness:platform/getGithubConnector:getGithubConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGithubConnector.
type LookupGithubConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getGithubConnector.
type LookupGithubConnectorResult struct {
	// Configuration for using the github api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentications []GetGithubConnectorApiAuthentication `pulumi:"apiAuthentications"`
	// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
	ConnectionType string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials []GetGithubConnectorCredential `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description       string `pulumi:"description"`
	ExecuteOnDelegate bool   `pulumi:"executeOnDelegate"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// URL of the github repository or account.
	Url string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo string `pulumi:"validationRepo"`
}

func LookupGithubConnectorOutput(ctx *pulumi.Context, args LookupGithubConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupGithubConnectorResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupGithubConnectorResultOutput, error) {
			args := v.(LookupGithubConnectorArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("harness:platform/getGithubConnector:getGithubConnector", args, LookupGithubConnectorResultOutput{}, options).(LookupGithubConnectorResultOutput), nil
		}).(LookupGithubConnectorResultOutput)
}

// A collection of arguments for invoking getGithubConnector.
type LookupGithubConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupGithubConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGithubConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getGithubConnector.
type LookupGithubConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupGithubConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGithubConnectorResult)(nil)).Elem()
}

func (o LookupGithubConnectorResultOutput) ToLookupGithubConnectorResultOutput() LookupGithubConnectorResultOutput {
	return o
}

func (o LookupGithubConnectorResultOutput) ToLookupGithubConnectorResultOutputWithContext(ctx context.Context) LookupGithubConnectorResultOutput {
	return o
}

// Configuration for using the github api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
func (o LookupGithubConnectorResultOutput) ApiAuthentications() GetGithubConnectorApiAuthenticationArrayOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) []GetGithubConnectorApiAuthentication { return v.ApiAuthentications }).(GetGithubConnectorApiAuthenticationArrayOutput)
}

// Whether the connection we're making is to a github repository or a github account. Valid values are Account, Repo.
func (o LookupGithubConnectorResultOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) string { return v.ConnectionType }).(pulumi.StringOutput)
}

// Credentials to use for the connection.
func (o LookupGithubConnectorResultOutput) Credentials() GetGithubConnectorCredentialArrayOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) []GetGithubConnectorCredential { return v.Credentials }).(GetGithubConnectorCredentialArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupGithubConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupGithubConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupGithubConnectorResultOutput) ExecuteOnDelegate() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) bool { return v.ExecuteOnDelegate }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGithubConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupGithubConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupGithubConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupGithubConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupGithubConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupGithubConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the github repository or account.
func (o LookupGithubConnectorResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) string { return v.Url }).(pulumi.StringOutput)
}

// Repository to test the connection with. This is only used when `connectionType` is `Account`.
func (o LookupGithubConnectorResultOutput) ValidationRepo() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGithubConnectorResult) string { return v.ValidationRepo }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGithubConnectorResultOutput{})
}
