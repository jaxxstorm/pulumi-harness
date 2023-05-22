// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Service Now connector.
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
//			_, err := platform.NewConnectorServiceNow(ctx, "test", &platform.ConnectorServiceNowArgs{
//				Auth: &platform.ConnectorServiceNowAuthArgs{
//					Adfs: &platform.ConnectorServiceNowAuthAdfsArgs{
//						AdfsUrl:        pulumi.String("https://adfs_url.com"),
//						CertificateRef: pulumi.String("account.certificate_ref"),
//						ClientIdRef:    pulumi.String("account.client_id_ref"),
//						PrivateKeyRef:  pulumi.String("account.private_key_ref}"),
//						ResourceIdRef:  pulumi.String("account.resource_id_ref"),
//					},
//					AuthType: pulumi.String("AdfsClientCredentialsWithCertificate"),
//				},
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description:   pulumi.String("test"),
//				Identifier:    pulumi.String("identifier"),
//				ServiceNowUrl: pulumi.String("https://servicenow.com"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
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
// # Import account level service now connector
//
// ```sh
//
//	$ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <connector_id>
//
// ```
//
//	Import org level service now connector
//
// ```sh
//
//	$ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <ord_id>/<connector_id>
//
// ```
//
//	Import project level service now connector
//
// ```sh
//
//	$ pulumi import harness:platform/connectorServiceNow:ConnectorServiceNow example <org_id>/<project_id>/<connector_id>
//
// ```
type ConnectorServiceNow struct {
	pulumi.CustomResourceState

	// The credentials to use for the service now authentication.
	Auth ConnectorServiceNowAuthOutput `pulumi:"auth"`
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
	// URL of service now.
	ServiceNowUrl pulumi.StringOutput `pulumi:"serviceNowUrl"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Username to use for authentication.
	Username pulumi.StringOutput `pulumi:"username"`
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef pulumi.StringOutput `pulumi:"usernameRef"`
}

// NewConnectorServiceNow registers a new resource with the given unique name, arguments, and options.
func NewConnectorServiceNow(ctx *pulumi.Context,
	name string, args *ConnectorServiceNowArgs, opts ...pulumi.ResourceOption) (*ConnectorServiceNow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Auth == nil {
		return nil, errors.New("invalid value for required argument 'Auth'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.ServiceNowUrl == nil {
		return nil, errors.New("invalid value for required argument 'ServiceNowUrl'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ConnectorServiceNow
	err := ctx.RegisterResource("harness:platform/connectorServiceNow:ConnectorServiceNow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectorServiceNow gets an existing ConnectorServiceNow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectorServiceNow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorServiceNowState, opts ...pulumi.ResourceOption) (*ConnectorServiceNow, error) {
	var resource ConnectorServiceNow
	err := ctx.ReadResource("harness:platform/connectorServiceNow:ConnectorServiceNow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectorServiceNow resources.
type connectorServiceNowState struct {
	// The credentials to use for the service now authentication.
	Auth *ConnectorServiceNowAuth `pulumi:"auth"`
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
	// URL of service now.
	ServiceNowUrl *string `pulumi:"serviceNowUrl"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Username to use for authentication.
	Username *string `pulumi:"username"`
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef *string `pulumi:"usernameRef"`
}

type ConnectorServiceNowState struct {
	// The credentials to use for the service now authentication.
	Auth ConnectorServiceNowAuthPtrInput
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
	// URL of service now.
	ServiceNowUrl pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Username to use for authentication.
	Username pulumi.StringPtrInput
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef pulumi.StringPtrInput
}

func (ConnectorServiceNowState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorServiceNowState)(nil)).Elem()
}

type connectorServiceNowArgs struct {
	// The credentials to use for the service now authentication.
	Auth ConnectorServiceNowAuth `pulumi:"auth"`
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
	// URL of service now.
	ServiceNowUrl string `pulumi:"serviceNowUrl"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Username to use for authentication.
	Username *string `pulumi:"username"`
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef *string `pulumi:"usernameRef"`
}

// The set of arguments for constructing a ConnectorServiceNow resource.
type ConnectorServiceNowArgs struct {
	// The credentials to use for the service now authentication.
	Auth ConnectorServiceNowAuthInput
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
	// URL of service now.
	ServiceNowUrl pulumi.StringInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Username to use for authentication.
	Username pulumi.StringPtrInput
	// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	UsernameRef pulumi.StringPtrInput
}

func (ConnectorServiceNowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorServiceNowArgs)(nil)).Elem()
}

type ConnectorServiceNowInput interface {
	pulumi.Input

	ToConnectorServiceNowOutput() ConnectorServiceNowOutput
	ToConnectorServiceNowOutputWithContext(ctx context.Context) ConnectorServiceNowOutput
}

func (*ConnectorServiceNow) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectorServiceNow)(nil)).Elem()
}

func (i *ConnectorServiceNow) ToConnectorServiceNowOutput() ConnectorServiceNowOutput {
	return i.ToConnectorServiceNowOutputWithContext(context.Background())
}

func (i *ConnectorServiceNow) ToConnectorServiceNowOutputWithContext(ctx context.Context) ConnectorServiceNowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorServiceNowOutput)
}

// ConnectorServiceNowArrayInput is an input type that accepts ConnectorServiceNowArray and ConnectorServiceNowArrayOutput values.
// You can construct a concrete instance of `ConnectorServiceNowArrayInput` via:
//
//	ConnectorServiceNowArray{ ConnectorServiceNowArgs{...} }
type ConnectorServiceNowArrayInput interface {
	pulumi.Input

	ToConnectorServiceNowArrayOutput() ConnectorServiceNowArrayOutput
	ToConnectorServiceNowArrayOutputWithContext(context.Context) ConnectorServiceNowArrayOutput
}

type ConnectorServiceNowArray []ConnectorServiceNowInput

func (ConnectorServiceNowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectorServiceNow)(nil)).Elem()
}

func (i ConnectorServiceNowArray) ToConnectorServiceNowArrayOutput() ConnectorServiceNowArrayOutput {
	return i.ToConnectorServiceNowArrayOutputWithContext(context.Background())
}

func (i ConnectorServiceNowArray) ToConnectorServiceNowArrayOutputWithContext(ctx context.Context) ConnectorServiceNowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorServiceNowArrayOutput)
}

// ConnectorServiceNowMapInput is an input type that accepts ConnectorServiceNowMap and ConnectorServiceNowMapOutput values.
// You can construct a concrete instance of `ConnectorServiceNowMapInput` via:
//
//	ConnectorServiceNowMap{ "key": ConnectorServiceNowArgs{...} }
type ConnectorServiceNowMapInput interface {
	pulumi.Input

	ToConnectorServiceNowMapOutput() ConnectorServiceNowMapOutput
	ToConnectorServiceNowMapOutputWithContext(context.Context) ConnectorServiceNowMapOutput
}

type ConnectorServiceNowMap map[string]ConnectorServiceNowInput

func (ConnectorServiceNowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectorServiceNow)(nil)).Elem()
}

func (i ConnectorServiceNowMap) ToConnectorServiceNowMapOutput() ConnectorServiceNowMapOutput {
	return i.ToConnectorServiceNowMapOutputWithContext(context.Background())
}

func (i ConnectorServiceNowMap) ToConnectorServiceNowMapOutputWithContext(ctx context.Context) ConnectorServiceNowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorServiceNowMapOutput)
}

type ConnectorServiceNowOutput struct{ *pulumi.OutputState }

func (ConnectorServiceNowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectorServiceNow)(nil)).Elem()
}

func (o ConnectorServiceNowOutput) ToConnectorServiceNowOutput() ConnectorServiceNowOutput {
	return o
}

func (o ConnectorServiceNowOutput) ToConnectorServiceNowOutputWithContext(ctx context.Context) ConnectorServiceNowOutput {
	return o
}

// The credentials to use for the service now authentication.
func (o ConnectorServiceNowOutput) Auth() ConnectorServiceNowAuthOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) ConnectorServiceNowAuthOutput { return v.Auth }).(ConnectorServiceNowAuthOutput)
}

// Tags to filter delegates for connection.
func (o ConnectorServiceNowOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o ConnectorServiceNowOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o ConnectorServiceNowOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o ConnectorServiceNowOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o ConnectorServiceNowOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o ConnectorServiceNowOutput) PasswordRef() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringOutput { return v.PasswordRef }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o ConnectorServiceNowOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// URL of service now.
func (o ConnectorServiceNowOutput) ServiceNowUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringOutput { return v.ServiceNowUrl }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o ConnectorServiceNowOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Username to use for authentication.
func (o ConnectorServiceNowOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o ConnectorServiceNowOutput) UsernameRef() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorServiceNow) pulumi.StringOutput { return v.UsernameRef }).(pulumi.StringOutput)
}

type ConnectorServiceNowArrayOutput struct{ *pulumi.OutputState }

func (ConnectorServiceNowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectorServiceNow)(nil)).Elem()
}

func (o ConnectorServiceNowArrayOutput) ToConnectorServiceNowArrayOutput() ConnectorServiceNowArrayOutput {
	return o
}

func (o ConnectorServiceNowArrayOutput) ToConnectorServiceNowArrayOutputWithContext(ctx context.Context) ConnectorServiceNowArrayOutput {
	return o
}

func (o ConnectorServiceNowArrayOutput) Index(i pulumi.IntInput) ConnectorServiceNowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectorServiceNow {
		return vs[0].([]*ConnectorServiceNow)[vs[1].(int)]
	}).(ConnectorServiceNowOutput)
}

type ConnectorServiceNowMapOutput struct{ *pulumi.OutputState }

func (ConnectorServiceNowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectorServiceNow)(nil)).Elem()
}

func (o ConnectorServiceNowMapOutput) ToConnectorServiceNowMapOutput() ConnectorServiceNowMapOutput {
	return o
}

func (o ConnectorServiceNowMapOutput) ToConnectorServiceNowMapOutputWithContext(ctx context.Context) ConnectorServiceNowMapOutput {
	return o
}

func (o ConnectorServiceNowMapOutput) MapIndex(k pulumi.StringInput) ConnectorServiceNowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectorServiceNow {
		return vs[0].(map[string]*ConnectorServiceNow)[vs[1].(string)]
	}).(ConnectorServiceNowOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorServiceNowInput)(nil)).Elem(), &ConnectorServiceNow{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorServiceNowArrayInput)(nil)).Elem(), ConnectorServiceNowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorServiceNowMapInput)(nil)).Elem(), ConnectorServiceNowMap{})
	pulumi.RegisterOutputType(ConnectorServiceNowOutput{})
	pulumi.RegisterOutputType(ConnectorServiceNowArrayOutput{})
	pulumi.RegisterOutputType(ConnectorServiceNowMapOutput{})
}
