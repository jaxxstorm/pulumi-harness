// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Jira connector.
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
//			_, err := platform.LookupJiraConnector(ctx, &platform.LookupJiraConnectorArgs{
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
func LookupJiraConnector(ctx *pulumi.Context, args *LookupJiraConnectorArgs, opts ...pulumi.InvokeOption) (*LookupJiraConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupJiraConnectorResult
	err := ctx.Invoke("harness:platform/getJiraConnector:getJiraConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getJiraConnector.
type LookupJiraConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getJiraConnector.
type LookupJiraConnectorResult struct {
	// The credentials to use for the jira authentication.
	Auths []GetJiraConnectorAuth `pulumi:"auths"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	PasswordRef string `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// URL of the Jira server.
	Url string `pulumi:"url"`
	// Username to use for authentication.
	Username string `pulumi:"username"`
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef string `pulumi:"usernameRef"`
}

func LookupJiraConnectorOutput(ctx *pulumi.Context, args LookupJiraConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupJiraConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupJiraConnectorResultOutput, error) {
			args := v.(LookupJiraConnectorArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupJiraConnectorResult
			secret, err := ctx.InvokePackageRaw("harness:platform/getJiraConnector:getJiraConnector", args, &rv, "", opts...)
			if err != nil {
				return LookupJiraConnectorResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupJiraConnectorResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupJiraConnectorResultOutput), nil
			}
			return output, nil
		}).(LookupJiraConnectorResultOutput)
}

// A collection of arguments for invoking getJiraConnector.
type LookupJiraConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupJiraConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupJiraConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getJiraConnector.
type LookupJiraConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupJiraConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupJiraConnectorResult)(nil)).Elem()
}

func (o LookupJiraConnectorResultOutput) ToLookupJiraConnectorResultOutput() LookupJiraConnectorResultOutput {
	return o
}

func (o LookupJiraConnectorResultOutput) ToLookupJiraConnectorResultOutputWithContext(ctx context.Context) LookupJiraConnectorResultOutput {
	return o
}

// The credentials to use for the jira authentication.
func (o LookupJiraConnectorResultOutput) Auths() GetJiraConnectorAuthArrayOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) []GetJiraConnectorAuth { return v.Auths }).(GetJiraConnectorAuthArrayOutput)
}

// Tags to filter delegates for connection.
func (o LookupJiraConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupJiraConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupJiraConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupJiraConnectorResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupJiraConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupJiraConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o LookupJiraConnectorResultOutput) PasswordRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) string { return v.PasswordRef }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o LookupJiraConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o LookupJiraConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Jira server.
func (o LookupJiraConnectorResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) string { return v.Url }).(pulumi.StringOutput)
}

// Username to use for authentication.
func (o LookupJiraConnectorResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) string { return v.Username }).(pulumi.StringOutput)
}

// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o LookupJiraConnectorResultOutput) UsernameRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraConnectorResult) string { return v.UsernameRef }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupJiraConnectorResultOutput{})
}
