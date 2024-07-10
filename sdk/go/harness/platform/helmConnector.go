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

// Resource for creating a HTTP Helm connector.
//
// ## Import
//
// # Import account level helm connector
//
// ```sh
// $ pulumi import harness:platform/helmConnector:HelmConnector example <connector_id>
// ```
//
// # Import org level helm connector
//
// ```sh
// $ pulumi import harness:platform/helmConnector:HelmConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level helm connector
//
// ```sh
// $ pulumi import harness:platform/helmConnector:HelmConnector example <org_id>/<project_id>/<connector_id>
// ```
type HelmConnector struct {
	pulumi.CustomResourceState

	// Credentials to use for authentication.
	Credentials HelmConnectorCredentialsPtrOutput `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Enable this flag for force deletion of connector
	ForceDelete pulumi.BoolOutput `pulumi:"forceDelete"`
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
	// URL of the helm server.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewHelmConnector registers a new resource with the given unique name, arguments, and options.
func NewHelmConnector(ctx *pulumi.Context,
	name string, args *HelmConnectorArgs, opts ...pulumi.ResourceOption) (*HelmConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HelmConnector
	err := ctx.RegisterResource("harness:platform/helmConnector:HelmConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHelmConnector gets an existing HelmConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHelmConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HelmConnectorState, opts ...pulumi.ResourceOption) (*HelmConnector, error) {
	var resource HelmConnector
	err := ctx.ReadResource("harness:platform/helmConnector:HelmConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HelmConnector resources.
type helmConnectorState struct {
	// Credentials to use for authentication.
	Credentials *HelmConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Enable this flag for force deletion of connector
	ForceDelete *bool `pulumi:"forceDelete"`
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
	// URL of the helm server.
	Url *string `pulumi:"url"`
}

type HelmConnectorState struct {
	// Credentials to use for authentication.
	Credentials HelmConnectorCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Enable this flag for force deletion of connector
	ForceDelete pulumi.BoolPtrInput
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
	// URL of the helm server.
	Url pulumi.StringPtrInput
}

func (HelmConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*helmConnectorState)(nil)).Elem()
}

type helmConnectorArgs struct {
	// Credentials to use for authentication.
	Credentials *HelmConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Enable this flag for force deletion of connector
	ForceDelete *bool `pulumi:"forceDelete"`
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
	// URL of the helm server.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a HelmConnector resource.
type HelmConnectorArgs struct {
	// Credentials to use for authentication.
	Credentials HelmConnectorCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Enable this flag for force deletion of connector
	ForceDelete pulumi.BoolPtrInput
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
	// URL of the helm server.
	Url pulumi.StringInput
}

func (HelmConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*helmConnectorArgs)(nil)).Elem()
}

type HelmConnectorInput interface {
	pulumi.Input

	ToHelmConnectorOutput() HelmConnectorOutput
	ToHelmConnectorOutputWithContext(ctx context.Context) HelmConnectorOutput
}

func (*HelmConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**HelmConnector)(nil)).Elem()
}

func (i *HelmConnector) ToHelmConnectorOutput() HelmConnectorOutput {
	return i.ToHelmConnectorOutputWithContext(context.Background())
}

func (i *HelmConnector) ToHelmConnectorOutputWithContext(ctx context.Context) HelmConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HelmConnectorOutput)
}

// HelmConnectorArrayInput is an input type that accepts HelmConnectorArray and HelmConnectorArrayOutput values.
// You can construct a concrete instance of `HelmConnectorArrayInput` via:
//
//	HelmConnectorArray{ HelmConnectorArgs{...} }
type HelmConnectorArrayInput interface {
	pulumi.Input

	ToHelmConnectorArrayOutput() HelmConnectorArrayOutput
	ToHelmConnectorArrayOutputWithContext(context.Context) HelmConnectorArrayOutput
}

type HelmConnectorArray []HelmConnectorInput

func (HelmConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HelmConnector)(nil)).Elem()
}

func (i HelmConnectorArray) ToHelmConnectorArrayOutput() HelmConnectorArrayOutput {
	return i.ToHelmConnectorArrayOutputWithContext(context.Background())
}

func (i HelmConnectorArray) ToHelmConnectorArrayOutputWithContext(ctx context.Context) HelmConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HelmConnectorArrayOutput)
}

// HelmConnectorMapInput is an input type that accepts HelmConnectorMap and HelmConnectorMapOutput values.
// You can construct a concrete instance of `HelmConnectorMapInput` via:
//
//	HelmConnectorMap{ "key": HelmConnectorArgs{...} }
type HelmConnectorMapInput interface {
	pulumi.Input

	ToHelmConnectorMapOutput() HelmConnectorMapOutput
	ToHelmConnectorMapOutputWithContext(context.Context) HelmConnectorMapOutput
}

type HelmConnectorMap map[string]HelmConnectorInput

func (HelmConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HelmConnector)(nil)).Elem()
}

func (i HelmConnectorMap) ToHelmConnectorMapOutput() HelmConnectorMapOutput {
	return i.ToHelmConnectorMapOutputWithContext(context.Background())
}

func (i HelmConnectorMap) ToHelmConnectorMapOutputWithContext(ctx context.Context) HelmConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HelmConnectorMapOutput)
}

type HelmConnectorOutput struct{ *pulumi.OutputState }

func (HelmConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HelmConnector)(nil)).Elem()
}

func (o HelmConnectorOutput) ToHelmConnectorOutput() HelmConnectorOutput {
	return o
}

func (o HelmConnectorOutput) ToHelmConnectorOutputWithContext(ctx context.Context) HelmConnectorOutput {
	return o
}

// Credentials to use for authentication.
func (o HelmConnectorOutput) Credentials() HelmConnectorCredentialsPtrOutput {
	return o.ApplyT(func(v *HelmConnector) HelmConnectorCredentialsPtrOutput { return v.Credentials }).(HelmConnectorCredentialsPtrOutput)
}

// Tags to filter delegates for connection.
func (o HelmConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o HelmConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Enable this flag for force deletion of connector
func (o HelmConnectorOutput) ForceDelete() pulumi.BoolOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.BoolOutput { return v.ForceDelete }).(pulumi.BoolOutput)
}

// Unique identifier of the resource.
func (o HelmConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o HelmConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o HelmConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o HelmConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o HelmConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the helm server.
func (o HelmConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *HelmConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type HelmConnectorArrayOutput struct{ *pulumi.OutputState }

func (HelmConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HelmConnector)(nil)).Elem()
}

func (o HelmConnectorArrayOutput) ToHelmConnectorArrayOutput() HelmConnectorArrayOutput {
	return o
}

func (o HelmConnectorArrayOutput) ToHelmConnectorArrayOutputWithContext(ctx context.Context) HelmConnectorArrayOutput {
	return o
}

func (o HelmConnectorArrayOutput) Index(i pulumi.IntInput) HelmConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HelmConnector {
		return vs[0].([]*HelmConnector)[vs[1].(int)]
	}).(HelmConnectorOutput)
}

type HelmConnectorMapOutput struct{ *pulumi.OutputState }

func (HelmConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HelmConnector)(nil)).Elem()
}

func (o HelmConnectorMapOutput) ToHelmConnectorMapOutput() HelmConnectorMapOutput {
	return o
}

func (o HelmConnectorMapOutput) ToHelmConnectorMapOutputWithContext(ctx context.Context) HelmConnectorMapOutput {
	return o
}

func (o HelmConnectorMapOutput) MapIndex(k pulumi.StringInput) HelmConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HelmConnector {
		return vs[0].(map[string]*HelmConnector)[vs[1].(string)]
	}).(HelmConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HelmConnectorInput)(nil)).Elem(), &HelmConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*HelmConnectorArrayInput)(nil)).Elem(), HelmConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HelmConnectorMapInput)(nil)).Elem(), HelmConnectorMap{})
	pulumi.RegisterOutputType(HelmConnectorOutput{})
	pulumi.RegisterOutputType(HelmConnectorArrayOutput{})
	pulumi.RegisterOutputType(HelmConnectorMapOutput{})
}
