// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Jira connector.
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
//			_, err := platform.NewJiraConnector(ctx, "test", &platform.JiraConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("test"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				Url: pulumi.String("https://jira.com"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Auth: &platform.JiraConnectorAuthArgs{
//					AuthType: pulumi.String("UsernamePassword"),
//					UsernamePassword: &platform.JiraConnectorAuthUsernamePasswordArgs{
//						Username:    pulumi.String("admin"),
//						PasswordRef: pulumi.String("account.secret_id"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Import account level jira connector
//
// ```sh
// $ pulumi import harness:platform/jiraConnector:JiraConnector example <connector_id>
// ```
//
// # Import org level jira connector
//
// ```sh
// $ pulumi import harness:platform/jiraConnector:JiraConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level jira connector
//
// ```sh
// $ pulumi import harness:platform/jiraConnector:JiraConnector example <org_id>/<project_id>/<connector_id>
// ```
type JiraConnector struct {
	pulumi.CustomResourceState

	// The credentials to use for the jira authentication.
	Auth JiraConnectorAuthOutput `pulumi:"auth"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	PasswordRef pulumi.StringOutput `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// URL of the Jira server.
	Url pulumi.StringOutput `pulumi:"url"`
	// Username to use for authentication.
	Username pulumi.StringOutput `pulumi:"username"`
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef pulumi.StringOutput `pulumi:"usernameRef"`
}

// NewJiraConnector registers a new resource with the given unique name, arguments, and options.
func NewJiraConnector(ctx *pulumi.Context,
	name string, args *JiraConnectorArgs, opts ...pulumi.ResourceOption) (*JiraConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Auth == nil {
		return nil, errors.New("invalid value for required argument 'Auth'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource JiraConnector
	err := ctx.RegisterResource("harness:platform/jiraConnector:JiraConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJiraConnector gets an existing JiraConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJiraConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JiraConnectorState, opts ...pulumi.ResourceOption) (*JiraConnector, error) {
	var resource JiraConnector
	err := ctx.ReadResource("harness:platform/jiraConnector:JiraConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering JiraConnector resources.
type jiraConnectorState struct {
	// The credentials to use for the jira authentication.
	Auth *JiraConnectorAuth `pulumi:"auth"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	PasswordRef *string `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// URL of the Jira server.
	Url *string `pulumi:"url"`
	// Username to use for authentication.
	Username *string `pulumi:"username"`
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef *string `pulumi:"usernameRef"`
}

type JiraConnectorState struct {
	// The credentials to use for the jira authentication.
	Auth JiraConnectorAuthPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	PasswordRef pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// URL of the Jira server.
	Url pulumi.StringPtrInput
	// Username to use for authentication.
	Username pulumi.StringPtrInput
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef pulumi.StringPtrInput
}

func (JiraConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*jiraConnectorState)(nil)).Elem()
}

type jiraConnectorArgs struct {
	// The credentials to use for the jira authentication.
	Auth JiraConnectorAuth `pulumi:"auth"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	PasswordRef *string `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// URL of the Jira server.
	Url string `pulumi:"url"`
	// Username to use for authentication.
	Username *string `pulumi:"username"`
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef *string `pulumi:"usernameRef"`
}

// The set of arguments for constructing a JiraConnector resource.
type JiraConnectorArgs struct {
	// The credentials to use for the jira authentication.
	Auth JiraConnectorAuthInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	PasswordRef pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// URL of the Jira server.
	Url pulumi.StringInput
	// Username to use for authentication.
	Username pulumi.StringPtrInput
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef pulumi.StringPtrInput
}

func (JiraConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jiraConnectorArgs)(nil)).Elem()
}

type JiraConnectorInput interface {
	pulumi.Input

	ToJiraConnectorOutput() JiraConnectorOutput
	ToJiraConnectorOutputWithContext(ctx context.Context) JiraConnectorOutput
}

func (*JiraConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**JiraConnector)(nil)).Elem()
}

func (i *JiraConnector) ToJiraConnectorOutput() JiraConnectorOutput {
	return i.ToJiraConnectorOutputWithContext(context.Background())
}

func (i *JiraConnector) ToJiraConnectorOutputWithContext(ctx context.Context) JiraConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JiraConnectorOutput)
}

// JiraConnectorArrayInput is an input type that accepts JiraConnectorArray and JiraConnectorArrayOutput values.
// You can construct a concrete instance of `JiraConnectorArrayInput` via:
//
//	JiraConnectorArray{ JiraConnectorArgs{...} }
type JiraConnectorArrayInput interface {
	pulumi.Input

	ToJiraConnectorArrayOutput() JiraConnectorArrayOutput
	ToJiraConnectorArrayOutputWithContext(context.Context) JiraConnectorArrayOutput
}

type JiraConnectorArray []JiraConnectorInput

func (JiraConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JiraConnector)(nil)).Elem()
}

func (i JiraConnectorArray) ToJiraConnectorArrayOutput() JiraConnectorArrayOutput {
	return i.ToJiraConnectorArrayOutputWithContext(context.Background())
}

func (i JiraConnectorArray) ToJiraConnectorArrayOutputWithContext(ctx context.Context) JiraConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JiraConnectorArrayOutput)
}

// JiraConnectorMapInput is an input type that accepts JiraConnectorMap and JiraConnectorMapOutput values.
// You can construct a concrete instance of `JiraConnectorMapInput` via:
//
//	JiraConnectorMap{ "key": JiraConnectorArgs{...} }
type JiraConnectorMapInput interface {
	pulumi.Input

	ToJiraConnectorMapOutput() JiraConnectorMapOutput
	ToJiraConnectorMapOutputWithContext(context.Context) JiraConnectorMapOutput
}

type JiraConnectorMap map[string]JiraConnectorInput

func (JiraConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JiraConnector)(nil)).Elem()
}

func (i JiraConnectorMap) ToJiraConnectorMapOutput() JiraConnectorMapOutput {
	return i.ToJiraConnectorMapOutputWithContext(context.Background())
}

func (i JiraConnectorMap) ToJiraConnectorMapOutputWithContext(ctx context.Context) JiraConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JiraConnectorMapOutput)
}

type JiraConnectorOutput struct{ *pulumi.OutputState }

func (JiraConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**JiraConnector)(nil)).Elem()
}

func (o JiraConnectorOutput) ToJiraConnectorOutput() JiraConnectorOutput {
	return o
}

func (o JiraConnectorOutput) ToJiraConnectorOutputWithContext(ctx context.Context) JiraConnectorOutput {
	return o
}

// The credentials to use for the jira authentication.
func (o JiraConnectorOutput) Auth() JiraConnectorAuthOutput {
	return o.ApplyT(func(v *JiraConnector) JiraConnectorAuthOutput { return v.Auth }).(JiraConnectorAuthOutput)
}

// Tags to filter delegates for connection.
func (o JiraConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o JiraConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o JiraConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o JiraConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o JiraConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o JiraConnectorOutput) PasswordRef() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringOutput { return v.PasswordRef }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o JiraConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o JiraConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Jira server.
func (o JiraConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Username to use for authentication.
func (o JiraConnectorOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o JiraConnectorOutput) UsernameRef() pulumi.StringOutput {
	return o.ApplyT(func(v *JiraConnector) pulumi.StringOutput { return v.UsernameRef }).(pulumi.StringOutput)
}

type JiraConnectorArrayOutput struct{ *pulumi.OutputState }

func (JiraConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JiraConnector)(nil)).Elem()
}

func (o JiraConnectorArrayOutput) ToJiraConnectorArrayOutput() JiraConnectorArrayOutput {
	return o
}

func (o JiraConnectorArrayOutput) ToJiraConnectorArrayOutputWithContext(ctx context.Context) JiraConnectorArrayOutput {
	return o
}

func (o JiraConnectorArrayOutput) Index(i pulumi.IntInput) JiraConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *JiraConnector {
		return vs[0].([]*JiraConnector)[vs[1].(int)]
	}).(JiraConnectorOutput)
}

type JiraConnectorMapOutput struct{ *pulumi.OutputState }

func (JiraConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JiraConnector)(nil)).Elem()
}

func (o JiraConnectorMapOutput) ToJiraConnectorMapOutput() JiraConnectorMapOutput {
	return o
}

func (o JiraConnectorMapOutput) ToJiraConnectorMapOutputWithContext(ctx context.Context) JiraConnectorMapOutput {
	return o
}

func (o JiraConnectorMapOutput) MapIndex(k pulumi.StringInput) JiraConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *JiraConnector {
		return vs[0].(map[string]*JiraConnector)[vs[1].(string)]
	}).(JiraConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JiraConnectorInput)(nil)).Elem(), &JiraConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*JiraConnectorArrayInput)(nil)).Elem(), JiraConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JiraConnectorMapInput)(nil)).Elem(), JiraConnectorMap{})
	pulumi.RegisterOutputType(JiraConnectorOutput{})
	pulumi.RegisterOutputType(JiraConnectorArrayOutput{})
	pulumi.RegisterOutputType(JiraConnectorMapOutput{})
}
