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

// Resource for creating an App Dynamics connector.
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
//			// Authentication mechanism as api token
//			_, err := platform.NewAppDynamicsConnector(ctx, "token", &platform.AppDynamicsConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("test"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				Url:         pulumi.String("https://appdynamics.com/"),
//				AccountName: pulumi.String("myaccount"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				ApiToken: &platform.AppDynamicsConnectorApiTokenArgs{
//					ClientId:        pulumi.String("client_id"),
//					ClientSecretRef: pulumi.String("account.secret_id"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Authentication mechanism as username and password
//			_, err = platform.NewAppDynamicsConnector(ctx, "test", &platform.AppDynamicsConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("test"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				Url:         pulumi.String("https://appdynamics.com/"),
//				AccountName: pulumi.String("myaccount"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				UsernamePassword: &platform.AppDynamicsConnectorUsernamePasswordArgs{
//					Username:    pulumi.String("username"),
//					PasswordRef: pulumi.String("account.secret_id"),
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
// # Import account level appdynamics connector
//
// ```sh
// $ pulumi import harness:platform/appDynamicsConnector:AppDynamicsConnector example <connector_id>
// ```
//
// # Import org level appdynamics connector
//
// ```sh
// $ pulumi import harness:platform/appDynamicsConnector:AppDynamicsConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level appdynamics connector
//
// ```sh
// $ pulumi import harness:platform/appDynamicsConnector:AppDynamicsConnector example <org_id>/<project_id>/<connector_id>
// ```
type AppDynamicsConnector struct {
	pulumi.CustomResourceState

	// The App Dynamics account name.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// Authenticate to App Dynamics using api token.
	ApiToken AppDynamicsConnectorApiTokenPtrOutput `pulumi:"apiToken"`
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
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// URL of the App Dynamics controller.
	Url pulumi.StringOutput `pulumi:"url"`
	// Authenticate to App Dynamics using username and password.
	UsernamePassword AppDynamicsConnectorUsernamePasswordPtrOutput `pulumi:"usernamePassword"`
}

// NewAppDynamicsConnector registers a new resource with the given unique name, arguments, and options.
func NewAppDynamicsConnector(ctx *pulumi.Context,
	name string, args *AppDynamicsConnectorArgs, opts ...pulumi.ResourceOption) (*AppDynamicsConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AppDynamicsConnector
	err := ctx.RegisterResource("harness:platform/appDynamicsConnector:AppDynamicsConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppDynamicsConnector gets an existing AppDynamicsConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppDynamicsConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppDynamicsConnectorState, opts ...pulumi.ResourceOption) (*AppDynamicsConnector, error) {
	var resource AppDynamicsConnector
	err := ctx.ReadResource("harness:platform/appDynamicsConnector:AppDynamicsConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppDynamicsConnector resources.
type appDynamicsConnectorState struct {
	// The App Dynamics account name.
	AccountName *string `pulumi:"accountName"`
	// Authenticate to App Dynamics using api token.
	ApiToken *AppDynamicsConnectorApiToken `pulumi:"apiToken"`
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
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// URL of the App Dynamics controller.
	Url *string `pulumi:"url"`
	// Authenticate to App Dynamics using username and password.
	UsernamePassword *AppDynamicsConnectorUsernamePassword `pulumi:"usernamePassword"`
}

type AppDynamicsConnectorState struct {
	// The App Dynamics account name.
	AccountName pulumi.StringPtrInput
	// Authenticate to App Dynamics using api token.
	ApiToken AppDynamicsConnectorApiTokenPtrInput
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
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// URL of the App Dynamics controller.
	Url pulumi.StringPtrInput
	// Authenticate to App Dynamics using username and password.
	UsernamePassword AppDynamicsConnectorUsernamePasswordPtrInput
}

func (AppDynamicsConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*appDynamicsConnectorState)(nil)).Elem()
}

type appDynamicsConnectorArgs struct {
	// The App Dynamics account name.
	AccountName string `pulumi:"accountName"`
	// Authenticate to App Dynamics using api token.
	ApiToken *AppDynamicsConnectorApiToken `pulumi:"apiToken"`
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
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// URL of the App Dynamics controller.
	Url string `pulumi:"url"`
	// Authenticate to App Dynamics using username and password.
	UsernamePassword *AppDynamicsConnectorUsernamePassword `pulumi:"usernamePassword"`
}

// The set of arguments for constructing a AppDynamicsConnector resource.
type AppDynamicsConnectorArgs struct {
	// The App Dynamics account name.
	AccountName pulumi.StringInput
	// Authenticate to App Dynamics using api token.
	ApiToken AppDynamicsConnectorApiTokenPtrInput
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
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// URL of the App Dynamics controller.
	Url pulumi.StringInput
	// Authenticate to App Dynamics using username and password.
	UsernamePassword AppDynamicsConnectorUsernamePasswordPtrInput
}

func (AppDynamicsConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appDynamicsConnectorArgs)(nil)).Elem()
}

type AppDynamicsConnectorInput interface {
	pulumi.Input

	ToAppDynamicsConnectorOutput() AppDynamicsConnectorOutput
	ToAppDynamicsConnectorOutputWithContext(ctx context.Context) AppDynamicsConnectorOutput
}

func (*AppDynamicsConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**AppDynamicsConnector)(nil)).Elem()
}

func (i *AppDynamicsConnector) ToAppDynamicsConnectorOutput() AppDynamicsConnectorOutput {
	return i.ToAppDynamicsConnectorOutputWithContext(context.Background())
}

func (i *AppDynamicsConnector) ToAppDynamicsConnectorOutputWithContext(ctx context.Context) AppDynamicsConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppDynamicsConnectorOutput)
}

// AppDynamicsConnectorArrayInput is an input type that accepts AppDynamicsConnectorArray and AppDynamicsConnectorArrayOutput values.
// You can construct a concrete instance of `AppDynamicsConnectorArrayInput` via:
//
//	AppDynamicsConnectorArray{ AppDynamicsConnectorArgs{...} }
type AppDynamicsConnectorArrayInput interface {
	pulumi.Input

	ToAppDynamicsConnectorArrayOutput() AppDynamicsConnectorArrayOutput
	ToAppDynamicsConnectorArrayOutputWithContext(context.Context) AppDynamicsConnectorArrayOutput
}

type AppDynamicsConnectorArray []AppDynamicsConnectorInput

func (AppDynamicsConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppDynamicsConnector)(nil)).Elem()
}

func (i AppDynamicsConnectorArray) ToAppDynamicsConnectorArrayOutput() AppDynamicsConnectorArrayOutput {
	return i.ToAppDynamicsConnectorArrayOutputWithContext(context.Background())
}

func (i AppDynamicsConnectorArray) ToAppDynamicsConnectorArrayOutputWithContext(ctx context.Context) AppDynamicsConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppDynamicsConnectorArrayOutput)
}

// AppDynamicsConnectorMapInput is an input type that accepts AppDynamicsConnectorMap and AppDynamicsConnectorMapOutput values.
// You can construct a concrete instance of `AppDynamicsConnectorMapInput` via:
//
//	AppDynamicsConnectorMap{ "key": AppDynamicsConnectorArgs{...} }
type AppDynamicsConnectorMapInput interface {
	pulumi.Input

	ToAppDynamicsConnectorMapOutput() AppDynamicsConnectorMapOutput
	ToAppDynamicsConnectorMapOutputWithContext(context.Context) AppDynamicsConnectorMapOutput
}

type AppDynamicsConnectorMap map[string]AppDynamicsConnectorInput

func (AppDynamicsConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppDynamicsConnector)(nil)).Elem()
}

func (i AppDynamicsConnectorMap) ToAppDynamicsConnectorMapOutput() AppDynamicsConnectorMapOutput {
	return i.ToAppDynamicsConnectorMapOutputWithContext(context.Background())
}

func (i AppDynamicsConnectorMap) ToAppDynamicsConnectorMapOutputWithContext(ctx context.Context) AppDynamicsConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppDynamicsConnectorMapOutput)
}

type AppDynamicsConnectorOutput struct{ *pulumi.OutputState }

func (AppDynamicsConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppDynamicsConnector)(nil)).Elem()
}

func (o AppDynamicsConnectorOutput) ToAppDynamicsConnectorOutput() AppDynamicsConnectorOutput {
	return o
}

func (o AppDynamicsConnectorOutput) ToAppDynamicsConnectorOutputWithContext(ctx context.Context) AppDynamicsConnectorOutput {
	return o
}

// The App Dynamics account name.
func (o AppDynamicsConnectorOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// Authenticate to App Dynamics using api token.
func (o AppDynamicsConnectorOutput) ApiToken() AppDynamicsConnectorApiTokenPtrOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) AppDynamicsConnectorApiTokenPtrOutput { return v.ApiToken }).(AppDynamicsConnectorApiTokenPtrOutput)
}

// Tags to filter delegates for connection.
func (o AppDynamicsConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o AppDynamicsConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o AppDynamicsConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o AppDynamicsConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o AppDynamicsConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o AppDynamicsConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o AppDynamicsConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the App Dynamics controller.
func (o AppDynamicsConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Authenticate to App Dynamics using username and password.
func (o AppDynamicsConnectorOutput) UsernamePassword() AppDynamicsConnectorUsernamePasswordPtrOutput {
	return o.ApplyT(func(v *AppDynamicsConnector) AppDynamicsConnectorUsernamePasswordPtrOutput { return v.UsernamePassword }).(AppDynamicsConnectorUsernamePasswordPtrOutput)
}

type AppDynamicsConnectorArrayOutput struct{ *pulumi.OutputState }

func (AppDynamicsConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppDynamicsConnector)(nil)).Elem()
}

func (o AppDynamicsConnectorArrayOutput) ToAppDynamicsConnectorArrayOutput() AppDynamicsConnectorArrayOutput {
	return o
}

func (o AppDynamicsConnectorArrayOutput) ToAppDynamicsConnectorArrayOutputWithContext(ctx context.Context) AppDynamicsConnectorArrayOutput {
	return o
}

func (o AppDynamicsConnectorArrayOutput) Index(i pulumi.IntInput) AppDynamicsConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppDynamicsConnector {
		return vs[0].([]*AppDynamicsConnector)[vs[1].(int)]
	}).(AppDynamicsConnectorOutput)
}

type AppDynamicsConnectorMapOutput struct{ *pulumi.OutputState }

func (AppDynamicsConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppDynamicsConnector)(nil)).Elem()
}

func (o AppDynamicsConnectorMapOutput) ToAppDynamicsConnectorMapOutput() AppDynamicsConnectorMapOutput {
	return o
}

func (o AppDynamicsConnectorMapOutput) ToAppDynamicsConnectorMapOutputWithContext(ctx context.Context) AppDynamicsConnectorMapOutput {
	return o
}

func (o AppDynamicsConnectorMapOutput) MapIndex(k pulumi.StringInput) AppDynamicsConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppDynamicsConnector {
		return vs[0].(map[string]*AppDynamicsConnector)[vs[1].(string)]
	}).(AppDynamicsConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppDynamicsConnectorInput)(nil)).Elem(), &AppDynamicsConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppDynamicsConnectorArrayInput)(nil)).Elem(), AppDynamicsConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppDynamicsConnectorMapInput)(nil)).Elem(), AppDynamicsConnectorMap{})
	pulumi.RegisterOutputType(AppDynamicsConnectorOutput{})
	pulumi.RegisterOutputType(AppDynamicsConnectorArrayOutput{})
	pulumi.RegisterOutputType(AppDynamicsConnectorMapOutput{})
}
