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

// Resource for creating a Service Now connector.
//
// ## Example to create ServiceNow Connector at different levels (Org, Project, Account)
//
// ## Import
//
// # Import account level service now connector
//
// ```sh
// $ pulumi import harness:platform/serviceNowConnector:ServiceNowConnector example <connector_id>
// ```
//
// # Import org level service now connector
//
// ```sh
// $ pulumi import harness:platform/serviceNowConnector:ServiceNowConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level service now connector
//
// ```sh
// $ pulumi import harness:platform/serviceNowConnector:ServiceNowConnector example <org_id>/<project_id>/<connector_id>
// ```
type ServiceNowConnector struct {
	pulumi.CustomResourceState

	// The credentials to use for the service now authentication.
	Auth ServiceNowConnectorAuthOutput `pulumi:"auth"`
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

// NewServiceNowConnector registers a new resource with the given unique name, arguments, and options.
func NewServiceNowConnector(ctx *pulumi.Context,
	name string, args *ServiceNowConnectorArgs, opts ...pulumi.ResourceOption) (*ServiceNowConnector, error) {
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
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceNowConnector
	err := ctx.RegisterResource("harness:platform/serviceNowConnector:ServiceNowConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceNowConnector gets an existing ServiceNowConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceNowConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceNowConnectorState, opts ...pulumi.ResourceOption) (*ServiceNowConnector, error) {
	var resource ServiceNowConnector
	err := ctx.ReadResource("harness:platform/serviceNowConnector:ServiceNowConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceNowConnector resources.
type serviceNowConnectorState struct {
	// The credentials to use for the service now authentication.
	Auth *ServiceNowConnectorAuth `pulumi:"auth"`
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

type ServiceNowConnectorState struct {
	// The credentials to use for the service now authentication.
	Auth ServiceNowConnectorAuthPtrInput
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

func (ServiceNowConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceNowConnectorState)(nil)).Elem()
}

type serviceNowConnectorArgs struct {
	// The credentials to use for the service now authentication.
	Auth ServiceNowConnectorAuth `pulumi:"auth"`
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

// The set of arguments for constructing a ServiceNowConnector resource.
type ServiceNowConnectorArgs struct {
	// The credentials to use for the service now authentication.
	Auth ServiceNowConnectorAuthInput
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

func (ServiceNowConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceNowConnectorArgs)(nil)).Elem()
}

type ServiceNowConnectorInput interface {
	pulumi.Input

	ToServiceNowConnectorOutput() ServiceNowConnectorOutput
	ToServiceNowConnectorOutputWithContext(ctx context.Context) ServiceNowConnectorOutput
}

func (*ServiceNowConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceNowConnector)(nil)).Elem()
}

func (i *ServiceNowConnector) ToServiceNowConnectorOutput() ServiceNowConnectorOutput {
	return i.ToServiceNowConnectorOutputWithContext(context.Background())
}

func (i *ServiceNowConnector) ToServiceNowConnectorOutputWithContext(ctx context.Context) ServiceNowConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceNowConnectorOutput)
}

// ServiceNowConnectorArrayInput is an input type that accepts ServiceNowConnectorArray and ServiceNowConnectorArrayOutput values.
// You can construct a concrete instance of `ServiceNowConnectorArrayInput` via:
//
//	ServiceNowConnectorArray{ ServiceNowConnectorArgs{...} }
type ServiceNowConnectorArrayInput interface {
	pulumi.Input

	ToServiceNowConnectorArrayOutput() ServiceNowConnectorArrayOutput
	ToServiceNowConnectorArrayOutputWithContext(context.Context) ServiceNowConnectorArrayOutput
}

type ServiceNowConnectorArray []ServiceNowConnectorInput

func (ServiceNowConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceNowConnector)(nil)).Elem()
}

func (i ServiceNowConnectorArray) ToServiceNowConnectorArrayOutput() ServiceNowConnectorArrayOutput {
	return i.ToServiceNowConnectorArrayOutputWithContext(context.Background())
}

func (i ServiceNowConnectorArray) ToServiceNowConnectorArrayOutputWithContext(ctx context.Context) ServiceNowConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceNowConnectorArrayOutput)
}

// ServiceNowConnectorMapInput is an input type that accepts ServiceNowConnectorMap and ServiceNowConnectorMapOutput values.
// You can construct a concrete instance of `ServiceNowConnectorMapInput` via:
//
//	ServiceNowConnectorMap{ "key": ServiceNowConnectorArgs{...} }
type ServiceNowConnectorMapInput interface {
	pulumi.Input

	ToServiceNowConnectorMapOutput() ServiceNowConnectorMapOutput
	ToServiceNowConnectorMapOutputWithContext(context.Context) ServiceNowConnectorMapOutput
}

type ServiceNowConnectorMap map[string]ServiceNowConnectorInput

func (ServiceNowConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceNowConnector)(nil)).Elem()
}

func (i ServiceNowConnectorMap) ToServiceNowConnectorMapOutput() ServiceNowConnectorMapOutput {
	return i.ToServiceNowConnectorMapOutputWithContext(context.Background())
}

func (i ServiceNowConnectorMap) ToServiceNowConnectorMapOutputWithContext(ctx context.Context) ServiceNowConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceNowConnectorMapOutput)
}

type ServiceNowConnectorOutput struct{ *pulumi.OutputState }

func (ServiceNowConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceNowConnector)(nil)).Elem()
}

func (o ServiceNowConnectorOutput) ToServiceNowConnectorOutput() ServiceNowConnectorOutput {
	return o
}

func (o ServiceNowConnectorOutput) ToServiceNowConnectorOutputWithContext(ctx context.Context) ServiceNowConnectorOutput {
	return o
}

// The credentials to use for the service now authentication.
func (o ServiceNowConnectorOutput) Auth() ServiceNowConnectorAuthOutput {
	return o.ApplyT(func(v *ServiceNowConnector) ServiceNowConnectorAuthOutput { return v.Auth }).(ServiceNowConnectorAuthOutput)
}

// Tags to filter delegates for connection.
func (o ServiceNowConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o ServiceNowConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o ServiceNowConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o ServiceNowConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o ServiceNowConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Reference to a secret containing the password to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o ServiceNowConnectorOutput) PasswordRef() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringOutput { return v.PasswordRef }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o ServiceNowConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// URL of service now.
func (o ServiceNowConnectorOutput) ServiceNowUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringOutput { return v.ServiceNowUrl }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o ServiceNowConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Username to use for authentication.
func (o ServiceNowConnectorOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

// Reference to a secret containing the username to use for authentication. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o ServiceNowConnectorOutput) UsernameRef() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNowConnector) pulumi.StringOutput { return v.UsernameRef }).(pulumi.StringOutput)
}

type ServiceNowConnectorArrayOutput struct{ *pulumi.OutputState }

func (ServiceNowConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceNowConnector)(nil)).Elem()
}

func (o ServiceNowConnectorArrayOutput) ToServiceNowConnectorArrayOutput() ServiceNowConnectorArrayOutput {
	return o
}

func (o ServiceNowConnectorArrayOutput) ToServiceNowConnectorArrayOutputWithContext(ctx context.Context) ServiceNowConnectorArrayOutput {
	return o
}

func (o ServiceNowConnectorArrayOutput) Index(i pulumi.IntInput) ServiceNowConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceNowConnector {
		return vs[0].([]*ServiceNowConnector)[vs[1].(int)]
	}).(ServiceNowConnectorOutput)
}

type ServiceNowConnectorMapOutput struct{ *pulumi.OutputState }

func (ServiceNowConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceNowConnector)(nil)).Elem()
}

func (o ServiceNowConnectorMapOutput) ToServiceNowConnectorMapOutput() ServiceNowConnectorMapOutput {
	return o
}

func (o ServiceNowConnectorMapOutput) ToServiceNowConnectorMapOutputWithContext(ctx context.Context) ServiceNowConnectorMapOutput {
	return o
}

func (o ServiceNowConnectorMapOutput) MapIndex(k pulumi.StringInput) ServiceNowConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceNowConnector {
		return vs[0].(map[string]*ServiceNowConnector)[vs[1].(string)]
	}).(ServiceNowConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceNowConnectorInput)(nil)).Elem(), &ServiceNowConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceNowConnectorArrayInput)(nil)).Elem(), ServiceNowConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceNowConnectorMapInput)(nil)).Elem(), ServiceNowConnectorMap{})
	pulumi.RegisterOutputType(ServiceNowConnectorOutput{})
	pulumi.RegisterOutputType(ServiceNowConnectorArrayOutput{})
	pulumi.RegisterOutputType(ServiceNowConnectorMapOutput{})
}
